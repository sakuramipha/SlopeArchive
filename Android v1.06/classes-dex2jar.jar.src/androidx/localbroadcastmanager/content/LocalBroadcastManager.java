package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class LocalBroadcastManager
{
  private static final boolean DEBUG = false;
  static final int MSG_EXEC_PENDING_BROADCASTS = 1;
  private static final String TAG = "LocalBroadcastManager";
  private static LocalBroadcastManager mInstance;
  private static final Object mLock = new Object();
  private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap();
  private final Context mAppContext;
  private final Handler mHandler;
  private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList();
  private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap();
  
  private LocalBroadcastManager(Context paramContext)
  {
    this.mAppContext = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper())
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        if (paramAnonymousMessage.what != 1) {
          super.handleMessage(paramAnonymousMessage);
        } else {
          LocalBroadcastManager.this.executePendingBroadcasts();
        }
      }
    };
  }
  
  public static LocalBroadcastManager getInstance(Context paramContext)
  {
    synchronized (mLock)
    {
      if (mInstance == null)
      {
        LocalBroadcastManager localLocalBroadcastManager = new androidx/localbroadcastmanager/content/LocalBroadcastManager;
        localLocalBroadcastManager.<init>(paramContext.getApplicationContext());
        mInstance = localLocalBroadcastManager;
      }
      paramContext = mInstance;
      return paramContext;
    }
  }
  
  void executePendingBroadcasts()
  {
    synchronized (this.mReceivers)
    {
      int k;
      BroadcastRecord[] arrayOfBroadcastRecord;
      int i;
      do
      {
        k = this.mPendingBroadcasts.size();
        if (k <= 0) {
          return;
        }
        arrayOfBroadcastRecord = new BroadcastRecord[k];
        this.mPendingBroadcasts.toArray(arrayOfBroadcastRecord);
        this.mPendingBroadcasts.clear();
        i = 0;
      } while (i >= k);
      BroadcastRecord localBroadcastRecord = arrayOfBroadcastRecord[i];
      int m = localBroadcastRecord.receivers.size();
      for (int j = 0; j < m; j++)
      {
        ??? = (ReceiverRecord)localBroadcastRecord.receivers.get(j);
        if (!((ReceiverRecord)???).dead) {
          ((ReceiverRecord)???).receiver.onReceive(this.mAppContext, localBroadcastRecord.intent);
        }
      }
      i++;
    }
  }
  
  public void registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.mReceivers)
    {
      ReceiverRecord localReceiverRecord = new androidx/localbroadcastmanager/content/LocalBroadcastManager$ReceiverRecord;
      localReceiverRecord.<init>(paramIntentFilter, paramBroadcastReceiver);
      Object localObject2 = (ArrayList)this.mReceivers.get(paramBroadcastReceiver);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(1);
        this.mReceivers.put(paramBroadcastReceiver, localObject1);
      }
      ((ArrayList)localObject1).add(localReceiverRecord);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        localObject2 = paramIntentFilter.getAction(i);
        localObject1 = (ArrayList)this.mActions.get(localObject2);
        paramBroadcastReceiver = (BroadcastReceiver)localObject1;
        if (localObject1 == null)
        {
          paramBroadcastReceiver = new java/util/ArrayList;
          paramBroadcastReceiver.<init>(1);
          this.mActions.put(localObject2, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localReceiverRecord);
      }
      return;
    }
  }
  
  public boolean sendBroadcast(Intent paramIntent)
  {
    synchronized (this.mReceivers)
    {
      String str1 = paramIntent.getAction();
      Object localObject2 = paramIntent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str2 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      int i;
      if ((paramIntent.getFlags() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject1;
      if (i != 0)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Resolving type ");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" scheme ");
        ((StringBuilder)localObject1).append(str2);
        ((StringBuilder)localObject1).append(" of intent ");
        ((StringBuilder)localObject1).append(paramIntent);
        Log.v("LocalBroadcastManager", ((StringBuilder)localObject1).toString());
      }
      ArrayList localArrayList2 = (ArrayList)this.mActions.get(paramIntent.getAction());
      if (localArrayList2 != null)
      {
        if (i != 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Action list: ");
          ((StringBuilder)localObject1).append(localArrayList2);
          Log.v("LocalBroadcastManager", ((StringBuilder)localObject1).toString());
        }
        ArrayList localArrayList1 = null;
        for (int j = 0; j < localArrayList2.size(); j++)
        {
          localObject1 = (ReceiverRecord)localArrayList2.get(j);
          Object localObject3;
          if (i != 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Matching against filter ");
            ((StringBuilder)localObject3).append(((ReceiverRecord)localObject1).filter);
            Log.v("LocalBroadcastManager", ((StringBuilder)localObject3).toString());
          }
          if (((ReceiverRecord)localObject1).broadcasting)
          {
            if (i != 0) {
              Log.v("LocalBroadcastManager", "  Filter's target already added");
            }
          }
          else
          {
            localObject3 = ((ReceiverRecord)localObject1).filter;
            int k = ((IntentFilter)localObject3).match(str1, (String)localObject2, str2, localUri, localSet, "LocalBroadcastManager");
            if (k >= 0)
            {
              if (i != 0)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append("  Filter matched!  match=0x");
                ((StringBuilder)localObject3).append(Integer.toHexString(k));
                Log.v("LocalBroadcastManager", ((StringBuilder)localObject3).toString());
              }
              if (localArrayList1 == null)
              {
                localArrayList1 = new java/util/ArrayList;
                localArrayList1.<init>();
              }
              localArrayList1.add(localObject1);
              ((ReceiverRecord)localObject1).broadcasting = true;
            }
            else if (i != 0)
            {
              if (k != -4)
              {
                if (k != -3)
                {
                  if (k != -2)
                  {
                    if (k != -1) {
                      localObject1 = "unknown reason";
                    } else {
                      localObject1 = "type";
                    }
                  }
                  else {
                    localObject1 = "data";
                  }
                }
                else {
                  localObject1 = "action";
                }
              }
              else {
                localObject1 = "category";
              }
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("  Filter did not match: ");
              ((StringBuilder)localObject3).append((String)localObject1);
              Log.v("LocalBroadcastManager", ((StringBuilder)localObject3).toString());
            }
          }
        }
        if (localArrayList1 != null)
        {
          for (i = 0; i < localArrayList1.size(); i++) {
            ((ReceiverRecord)localArrayList1.get(i)).broadcasting = false;
          }
          localObject1 = this.mPendingBroadcasts;
          localObject2 = new androidx/localbroadcastmanager/content/LocalBroadcastManager$BroadcastRecord;
          ((BroadcastRecord)localObject2).<init>(paramIntent, localArrayList1);
          ((ArrayList)localObject1).add(localObject2);
          if (!this.mHandler.hasMessages(1)) {
            this.mHandler.sendEmptyMessage(1);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public void sendBroadcastSync(Intent paramIntent)
  {
    if (sendBroadcast(paramIntent)) {
      executePendingBroadcasts();
    }
  }
  
  public void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver)
  {
    synchronized (this.mReceivers)
    {
      ArrayList localArrayList1 = (ArrayList)this.mReceivers.remove(paramBroadcastReceiver);
      if (localArrayList1 == null) {
        return;
      }
      for (int i = localArrayList1.size() - 1; i >= 0; i--)
      {
        ReceiverRecord localReceiverRecord1 = (ReceiverRecord)localArrayList1.get(i);
        localReceiverRecord1.dead = true;
        for (int j = 0; j < localReceiverRecord1.filter.countActions(); j++)
        {
          String str = localReceiverRecord1.filter.getAction(j);
          ArrayList localArrayList2 = (ArrayList)this.mActions.get(str);
          if (localArrayList2 != null)
          {
            for (int k = localArrayList2.size() - 1; k >= 0; k--)
            {
              ReceiverRecord localReceiverRecord2 = (ReceiverRecord)localArrayList2.get(k);
              if (localReceiverRecord2.receiver == paramBroadcastReceiver)
              {
                localReceiverRecord2.dead = true;
                localArrayList2.remove(k);
              }
            }
            if (localArrayList2.size() <= 0) {
              this.mActions.remove(str);
            }
          }
        }
      }
      return;
    }
  }
  
  private static final class BroadcastRecord
  {
    final Intent intent;
    final ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
    
    BroadcastRecord(Intent paramIntent, ArrayList<LocalBroadcastManager.ReceiverRecord> paramArrayList)
    {
      this.intent = paramIntent;
      this.receivers = paramArrayList;
    }
  }
  
  private static final class ReceiverRecord
  {
    boolean broadcasting;
    boolean dead;
    final IntentFilter filter;
    final BroadcastReceiver receiver;
    
    ReceiverRecord(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
    {
      this.filter = paramIntentFilter;
      this.receiver = paramBroadcastReceiver;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("Receiver{");
      localStringBuilder.append(this.receiver);
      localStringBuilder.append(" filter=");
      localStringBuilder.append(this.filter);
      if (this.dead) {
        localStringBuilder.append(" DEAD");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\localbroadcastmanager\content\LocalBroadcastManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */