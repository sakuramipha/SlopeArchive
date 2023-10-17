package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class NotificationManagerCompat
{
  public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
  private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
  public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
  public static final int IMPORTANCE_DEFAULT = 3;
  public static final int IMPORTANCE_HIGH = 4;
  public static final int IMPORTANCE_LOW = 2;
  public static final int IMPORTANCE_MAX = 5;
  public static final int IMPORTANCE_MIN = 1;
  public static final int IMPORTANCE_NONE = 0;
  public static final int IMPORTANCE_UNSPECIFIED = -1000;
  static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
  private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
  private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
  private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
  private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
  private static final String TAG = "NotifManCompat";
  private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
  private static String sEnabledNotificationListeners;
  private static final Object sEnabledNotificationListenersLock = new Object();
  private static final Object sLock = new Object();
  private static SideChannelManager sSideChannelManager;
  private final Context mContext;
  private final NotificationManager mNotificationManager;
  
  private NotificationManagerCompat(Context paramContext)
  {
    this.mContext = paramContext;
    this.mNotificationManager = ((NotificationManager)paramContext.getSystemService("notification"));
  }
  
  public static NotificationManagerCompat from(Context paramContext)
  {
    return new NotificationManagerCompat(paramContext);
  }
  
  public static Set<String> getEnabledListenerPackages(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    paramContext = sEnabledNotificationListenersLock;
    if (str != null) {}
    try
    {
      if (!str.equals(sEnabledNotificationListeners))
      {
        localObject1 = str.split(":", -1);
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>(localObject1.length);
        int j = localObject1.length;
        for (int i = 0; i < j; i++)
        {
          ComponentName localComponentName = ComponentName.unflattenFromString(localObject1[i]);
          if (localComponentName != null) {
            localHashSet.add(localComponentName.getPackageName());
          }
        }
        sEnabledNotificationListenerPackages = localHashSet;
        sEnabledNotificationListeners = str;
      }
      Object localObject1 = sEnabledNotificationListenerPackages;
      return (Set<String>)localObject1;
    }
    finally {}
  }
  
  private void pushSideChannelQueue(Task paramTask)
  {
    synchronized (sLock)
    {
      if (sSideChannelManager == null)
      {
        SideChannelManager localSideChannelManager = new androidx/core/app/NotificationManagerCompat$SideChannelManager;
        localSideChannelManager.<init>(this.mContext.getApplicationContext());
        sSideChannelManager = localSideChannelManager;
      }
      sSideChannelManager.queueTask(paramTask);
      return;
    }
  }
  
  private static boolean useSideChannelForNotification(Notification paramNotification)
  {
    paramNotification = NotificationCompat.getExtras(paramNotification);
    boolean bool;
    if ((paramNotification != null) && (paramNotification.getBoolean("android.support.useSideChannel"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean areNotificationsEnabled()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return this.mNotificationManager.areNotificationsEnabled();
    }
    int i = Build.VERSION.SDK_INT;
    bool2 = true;
    bool1 = bool2;
    AppOpsManager localAppOpsManager;
    Object localObject;
    String str;
    if (i >= 19)
    {
      localAppOpsManager = (AppOpsManager)this.mContext.getSystemService("appops");
      localObject = this.mContext.getApplicationInfo();
      str = this.mContext.getApplicationContext().getPackageName();
      i = ((ApplicationInfo)localObject).uid;
    }
    try
    {
      localObject = Class.forName(AppOpsManager.class.getName());
      i = ((Integer)((Class)localObject).getMethod("checkOpNoThrow", new Class[] { Integer.TYPE, Integer.TYPE, String.class }).invoke(localAppOpsManager, new Object[] { Integer.valueOf(((Integer)((Class)localObject).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str })).intValue();
      if (i == 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|InvocationTargetException|IllegalAccessException|RuntimeException localClassNotFoundException)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  public void cancel(int paramInt)
  {
    cancel(null, paramInt);
  }
  
  public void cancel(String paramString, int paramInt)
  {
    this.mNotificationManager.cancel(paramString, paramInt);
    if (Build.VERSION.SDK_INT <= 19) {
      pushSideChannelQueue(new CancelTask(this.mContext.getPackageName(), paramInt, paramString));
    }
  }
  
  public void cancelAll()
  {
    this.mNotificationManager.cancelAll();
    if (Build.VERSION.SDK_INT <= 19) {
      pushSideChannelQueue(new CancelTask(this.mContext.getPackageName()));
    }
  }
  
  public void createNotificationChannel(NotificationChannel paramNotificationChannel)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.createNotificationChannel(paramNotificationChannel);
    }
  }
  
  public void createNotificationChannel(NotificationChannelCompat paramNotificationChannelCompat)
  {
    createNotificationChannel(paramNotificationChannelCompat.getNotificationChannel());
  }
  
  public void createNotificationChannelGroup(NotificationChannelGroup paramNotificationChannelGroup)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.createNotificationChannelGroup(paramNotificationChannelGroup);
    }
  }
  
  public void createNotificationChannelGroup(NotificationChannelGroupCompat paramNotificationChannelGroupCompat)
  {
    createNotificationChannelGroup(paramNotificationChannelGroupCompat.getNotificationChannelGroup());
  }
  
  public void createNotificationChannelGroups(List<NotificationChannelGroup> paramList)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.createNotificationChannelGroups(paramList);
    }
  }
  
  public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> paramList)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(((NotificationChannelGroupCompat)paramList.next()).getNotificationChannelGroup());
      }
      this.mNotificationManager.createNotificationChannelGroups(localArrayList);
    }
  }
  
  public void createNotificationChannels(List<NotificationChannel> paramList)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.createNotificationChannels(paramList);
    }
  }
  
  public void createNotificationChannelsCompat(List<NotificationChannelCompat> paramList)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(((NotificationChannelCompat)paramList.next()).getNotificationChannel());
      }
      this.mNotificationManager.createNotificationChannels(localArrayList);
    }
  }
  
  public void deleteNotificationChannel(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.deleteNotificationChannel(paramString);
    }
  }
  
  public void deleteNotificationChannelGroup(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mNotificationManager.deleteNotificationChannelGroup(paramString);
    }
  }
  
  public void deleteUnlistedNotificationChannels(Collection<String> paramCollection)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Iterator localIterator = this.mNotificationManager.getNotificationChannels().iterator();
      while (localIterator.hasNext())
      {
        NotificationChannel localNotificationChannel = (NotificationChannel)localIterator.next();
        if ((!paramCollection.contains(localNotificationChannel.getId())) && ((Build.VERSION.SDK_INT < 30) || (!paramCollection.contains(localNotificationChannel.getParentChannelId())))) {
          this.mNotificationManager.deleteNotificationChannel(localNotificationChannel.getId());
        }
      }
    }
  }
  
  public int getImportance()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return this.mNotificationManager.getImportance();
    }
    return 64536;
  }
  
  public NotificationChannel getNotificationChannel(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mNotificationManager.getNotificationChannel(paramString);
    }
    return null;
  }
  
  public NotificationChannel getNotificationChannel(String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return this.mNotificationManager.getNotificationChannel(paramString1, paramString2);
    }
    return getNotificationChannel(paramString1);
  }
  
  public NotificationChannelCompat getNotificationChannelCompat(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramString = getNotificationChannel(paramString);
      if (paramString != null) {
        return new NotificationChannelCompat(paramString);
      }
    }
    return null;
  }
  
  public NotificationChannelCompat getNotificationChannelCompat(String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramString1 = getNotificationChannel(paramString1, paramString2);
      if (paramString1 != null) {
        return new NotificationChannelCompat(paramString1);
      }
    }
    return null;
  }
  
  public NotificationChannelGroup getNotificationChannelGroup(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mNotificationManager.getNotificationChannelGroup(paramString);
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      Iterator localIterator = getNotificationChannelGroups().iterator();
      while (localIterator.hasNext())
      {
        NotificationChannelGroup localNotificationChannelGroup = (NotificationChannelGroup)localIterator.next();
        if (localNotificationChannelGroup.getId().equals(paramString)) {
          return localNotificationChannelGroup;
        }
      }
    }
    return null;
  }
  
  public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramString = getNotificationChannelGroup(paramString);
      if (paramString != null) {
        return new NotificationChannelGroupCompat(paramString);
      }
    }
    else if (Build.VERSION.SDK_INT >= 26)
    {
      paramString = getNotificationChannelGroup(paramString);
      if (paramString != null) {
        return new NotificationChannelGroupCompat(paramString, getNotificationChannels());
      }
    }
    return null;
  }
  
  public List<NotificationChannelGroup> getNotificationChannelGroups()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mNotificationManager.getNotificationChannelGroups();
    }
    return Collections.emptyList();
  }
  
  public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat()
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Object localObject = getNotificationChannelGroups();
      if (!((List)localObject).isEmpty())
      {
        List localList;
        if (Build.VERSION.SDK_INT >= 28) {
          localList = Collections.emptyList();
        } else {
          localList = getNotificationChannels();
        }
        ArrayList localArrayList = new ArrayList(((List)localObject).size());
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          NotificationChannelGroup localNotificationChannelGroup = (NotificationChannelGroup)((Iterator)localObject).next();
          if (Build.VERSION.SDK_INT >= 28) {
            localArrayList.add(new NotificationChannelGroupCompat(localNotificationChannelGroup));
          } else {
            localArrayList.add(new NotificationChannelGroupCompat(localNotificationChannelGroup, localList));
          }
        }
        return localArrayList;
      }
    }
    return Collections.emptyList();
  }
  
  public List<NotificationChannel> getNotificationChannels()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mNotificationManager.getNotificationChannels();
    }
    return Collections.emptyList();
  }
  
  public List<NotificationChannelCompat> getNotificationChannelsCompat()
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Object localObject = getNotificationChannels();
      if (!((List)localObject).isEmpty())
      {
        ArrayList localArrayList = new ArrayList(((List)localObject).size());
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localArrayList.add(new NotificationChannelCompat((NotificationChannel)((Iterator)localObject).next()));
        }
        return localArrayList;
      }
    }
    return Collections.emptyList();
  }
  
  public void notify(int paramInt, Notification paramNotification)
  {
    notify(null, paramInt, paramNotification);
  }
  
  public void notify(String paramString, int paramInt, Notification paramNotification)
  {
    if (useSideChannelForNotification(paramNotification))
    {
      pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), paramInt, paramString, paramNotification));
      this.mNotificationManager.cancel(paramString, paramInt);
    }
    else
    {
      this.mNotificationManager.notify(paramString, paramInt, paramNotification);
    }
  }
  
  private static class CancelTask
    implements NotificationManagerCompat.Task
  {
    final boolean all;
    final int id;
    final String packageName;
    final String tag;
    
    CancelTask(String paramString)
    {
      this.packageName = paramString;
      this.id = 0;
      this.tag = null;
      this.all = true;
    }
    
    CancelTask(String paramString1, int paramInt, String paramString2)
    {
      this.packageName = paramString1;
      this.id = paramInt;
      this.tag = paramString2;
      this.all = false;
    }
    
    public void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException
    {
      if (this.all) {
        paramINotificationSideChannel.cancelAll(this.packageName);
      } else {
        paramINotificationSideChannel.cancel(this.packageName, this.id, this.tag);
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
      localStringBuilder.append("packageName:");
      localStringBuilder.append(this.packageName);
      localStringBuilder.append(", id:");
      localStringBuilder.append(this.id);
      localStringBuilder.append(", tag:");
      localStringBuilder.append(this.tag);
      localStringBuilder.append(", all:");
      localStringBuilder.append(this.all);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  private static class NotifyTask
    implements NotificationManagerCompat.Task
  {
    final int id;
    final Notification notif;
    final String packageName;
    final String tag;
    
    NotifyTask(String paramString1, int paramInt, String paramString2, Notification paramNotification)
    {
      this.packageName = paramString1;
      this.id = paramInt;
      this.tag = paramString2;
      this.notif = paramNotification;
    }
    
    public void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException
    {
      paramINotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
      localStringBuilder.append("packageName:");
      localStringBuilder.append(this.packageName);
      localStringBuilder.append(", id:");
      localStringBuilder.append(this.id);
      localStringBuilder.append(", tag:");
      localStringBuilder.append(this.tag);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  private static class ServiceConnectedEvent
  {
    final ComponentName componentName;
    final IBinder iBinder;
    
    ServiceConnectedEvent(ComponentName paramComponentName, IBinder paramIBinder)
    {
      this.componentName = paramComponentName;
      this.iBinder = paramIBinder;
    }
  }
  
  private static class SideChannelManager
    implements Handler.Callback, ServiceConnection
  {
    private static final int MSG_QUEUE_TASK = 0;
    private static final int MSG_RETRY_LISTENER_QUEUE = 3;
    private static final int MSG_SERVICE_CONNECTED = 1;
    private static final int MSG_SERVICE_DISCONNECTED = 2;
    private Set<String> mCachedEnabledPackages = new HashSet();
    private final Context mContext;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();
    
    SideChannelManager(Context paramContext)
    {
      this.mContext = paramContext;
      paramContext = new HandlerThread("NotificationManagerCompat");
      this.mHandlerThread = paramContext;
      paramContext.start();
      this.mHandler = new Handler(paramContext.getLooper(), this);
    }
    
    private boolean ensureServiceBound(ListenerRecord paramListenerRecord)
    {
      if (paramListenerRecord.bound) {
        return true;
      }
      Object localObject = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(paramListenerRecord.componentName);
      paramListenerRecord.bound = this.mContext.bindService((Intent)localObject, this, 33);
      if (paramListenerRecord.bound)
      {
        paramListenerRecord.retryCount = 0;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to bind to listener ");
        ((StringBuilder)localObject).append(paramListenerRecord.componentName);
        Log.w("NotifManCompat", ((StringBuilder)localObject).toString());
        this.mContext.unbindService(this);
      }
      return paramListenerRecord.bound;
    }
    
    private void ensureServiceUnbound(ListenerRecord paramListenerRecord)
    {
      if (paramListenerRecord.bound)
      {
        this.mContext.unbindService(this);
        paramListenerRecord.bound = false;
      }
      paramListenerRecord.service = null;
    }
    
    private void handleQueueTask(NotificationManagerCompat.Task paramTask)
    {
      updateListenerMap();
      Iterator localIterator = this.mRecordMap.values().iterator();
      while (localIterator.hasNext())
      {
        ListenerRecord localListenerRecord = (ListenerRecord)localIterator.next();
        localListenerRecord.taskQueue.add(paramTask);
        processListenerQueue(localListenerRecord);
      }
    }
    
    private void handleRetryListenerQueue(ComponentName paramComponentName)
    {
      paramComponentName = (ListenerRecord)this.mRecordMap.get(paramComponentName);
      if (paramComponentName != null) {
        processListenerQueue(paramComponentName);
      }
    }
    
    private void handleServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      paramComponentName = (ListenerRecord)this.mRecordMap.get(paramComponentName);
      if (paramComponentName != null)
      {
        paramComponentName.service = INotificationSideChannel.Stub.asInterface(paramIBinder);
        paramComponentName.retryCount = 0;
        processListenerQueue(paramComponentName);
      }
    }
    
    private void handleServiceDisconnected(ComponentName paramComponentName)
    {
      paramComponentName = (ListenerRecord)this.mRecordMap.get(paramComponentName);
      if (paramComponentName != null) {
        ensureServiceUnbound(paramComponentName);
      }
    }
    
    private void processListenerQueue(ListenerRecord paramListenerRecord)
    {
      StringBuilder localStringBuilder1;
      if (Log.isLoggable("NotifManCompat", 3))
      {
        localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("Processing component ");
        localStringBuilder1.append(paramListenerRecord.componentName);
        localStringBuilder1.append(", ");
        localStringBuilder1.append(paramListenerRecord.taskQueue.size());
        localStringBuilder1.append(" queued tasks");
        Log.d("NotifManCompat", localStringBuilder1.toString());
      }
      if (paramListenerRecord.taskQueue.isEmpty()) {
        return;
      }
      if ((ensureServiceBound(paramListenerRecord)) && (paramListenerRecord.service != null))
      {
        for (;;)
        {
          NotificationManagerCompat.Task localTask = (NotificationManagerCompat.Task)paramListenerRecord.taskQueue.peek();
          if (localTask != null) {
            try
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                localStringBuilder1 = new java/lang/StringBuilder;
                localStringBuilder1.<init>();
                localStringBuilder1.append("Sending task ");
                localStringBuilder1.append(localTask);
                Log.d("NotifManCompat", localStringBuilder1.toString());
              }
              localTask.send(paramListenerRecord.service);
              paramListenerRecord.taskQueue.remove();
            }
            catch (RemoteException localRemoteException)
            {
              localStringBuilder1 = new StringBuilder();
              localStringBuilder1.append("RemoteException communicating with ");
              localStringBuilder1.append(paramListenerRecord.componentName);
              Log.w("NotifManCompat", localStringBuilder1.toString(), localRemoteException);
            }
            catch (DeadObjectException localDeadObjectException)
            {
              if (Log.isLoggable("NotifManCompat", 3))
              {
                StringBuilder localStringBuilder2 = new StringBuilder();
                localStringBuilder2.append("Remote service has died: ");
                localStringBuilder2.append(paramListenerRecord.componentName);
                Log.d("NotifManCompat", localStringBuilder2.toString());
              }
            }
          }
        }
        if (!paramListenerRecord.taskQueue.isEmpty()) {
          scheduleListenerRetry(paramListenerRecord);
        }
        return;
      }
      scheduleListenerRetry(paramListenerRecord);
    }
    
    private void scheduleListenerRetry(ListenerRecord paramListenerRecord)
    {
      if (this.mHandler.hasMessages(3, paramListenerRecord.componentName)) {
        return;
      }
      paramListenerRecord.retryCount += 1;
      StringBuilder localStringBuilder;
      if (paramListenerRecord.retryCount > 6)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Giving up on delivering ");
        localStringBuilder.append(paramListenerRecord.taskQueue.size());
        localStringBuilder.append(" tasks to ");
        localStringBuilder.append(paramListenerRecord.componentName);
        localStringBuilder.append(" after ");
        localStringBuilder.append(paramListenerRecord.retryCount);
        localStringBuilder.append(" retries");
        Log.w("NotifManCompat", localStringBuilder.toString());
        paramListenerRecord.taskQueue.clear();
        return;
      }
      int i = (1 << paramListenerRecord.retryCount - 1) * 1000;
      if (Log.isLoggable("NotifManCompat", 3))
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Scheduling retry for ");
        localStringBuilder.append(i);
        localStringBuilder.append(" ms");
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      paramListenerRecord = this.mHandler.obtainMessage(3, paramListenerRecord.componentName);
      this.mHandler.sendMessageDelayed(paramListenerRecord, i);
    }
    
    private void updateListenerMap()
    {
      Object localObject1 = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
      if (((Set)localObject1).equals(this.mCachedEnabledPackages)) {
        return;
      }
      this.mCachedEnabledPackages = ((Set)localObject1);
      Object localObject2 = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
      HashSet localHashSet = new HashSet();
      Object localObject3 = ((List)localObject2).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        Object localObject4 = (ResolveInfo)((Iterator)localObject3).next();
        if (((Set)localObject1).contains(((ResolveInfo)localObject4).serviceInfo.packageName))
        {
          localObject2 = new ComponentName(((ResolveInfo)localObject4).serviceInfo.packageName, ((ResolveInfo)localObject4).serviceInfo.name);
          if (((ResolveInfo)localObject4).serviceInfo.permission != null)
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Permission present on component ");
            ((StringBuilder)localObject4).append(localObject2);
            ((StringBuilder)localObject4).append(", not adding listener record.");
            Log.w("NotifManCompat", ((StringBuilder)localObject4).toString());
          }
          else
          {
            localHashSet.add(localObject2);
          }
        }
      }
      localObject2 = localHashSet.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (ComponentName)((Iterator)localObject2).next();
        if (!this.mRecordMap.containsKey(localObject3))
        {
          if (Log.isLoggable("NotifManCompat", 3))
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Adding listener record for ");
            ((StringBuilder)localObject1).append(localObject3);
            Log.d("NotifManCompat", ((StringBuilder)localObject1).toString());
          }
          this.mRecordMap.put(localObject3, new ListenerRecord((ComponentName)localObject3));
        }
      }
      localObject3 = this.mRecordMap.entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        if (!localHashSet.contains(((Map.Entry)localObject1).getKey()))
        {
          if (Log.isLoggable("NotifManCompat", 3))
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Removing listener record for ");
            ((StringBuilder)localObject2).append(((Map.Entry)localObject1).getKey());
            Log.d("NotifManCompat", ((StringBuilder)localObject2).toString());
          }
          ensureServiceUnbound((ListenerRecord)((Map.Entry)localObject1).getValue());
          ((Iterator)localObject3).remove();
        }
      }
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              return false;
            }
            handleRetryListenerQueue((ComponentName)paramMessage.obj);
            return true;
          }
          handleServiceDisconnected((ComponentName)paramMessage.obj);
          return true;
        }
        paramMessage = (NotificationManagerCompat.ServiceConnectedEvent)paramMessage.obj;
        handleServiceConnected(paramMessage.componentName, paramMessage.iBinder);
        return true;
      }
      handleQueueTask((NotificationManagerCompat.Task)paramMessage.obj);
      return true;
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (Log.isLoggable("NotifManCompat", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Connected to service ");
        localStringBuilder.append(paramComponentName);
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      this.mHandler.obtainMessage(1, new NotificationManagerCompat.ServiceConnectedEvent(paramComponentName, paramIBinder)).sendToTarget();
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      if (Log.isLoggable("NotifManCompat", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Disconnected from service ");
        localStringBuilder.append(paramComponentName);
        Log.d("NotifManCompat", localStringBuilder.toString());
      }
      this.mHandler.obtainMessage(2, paramComponentName).sendToTarget();
    }
    
    public void queueTask(NotificationManagerCompat.Task paramTask)
    {
      this.mHandler.obtainMessage(0, paramTask).sendToTarget();
    }
    
    private static class ListenerRecord
    {
      boolean bound = false;
      final ComponentName componentName;
      int retryCount = 0;
      INotificationSideChannel service;
      ArrayDeque<NotificationManagerCompat.Task> taskQueue = new ArrayDeque();
      
      ListenerRecord(ComponentName paramComponentName)
      {
        this.componentName = paramComponentName;
      }
    }
  }
  
  private static abstract interface Task
  {
    public abstract void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\NotificationManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */