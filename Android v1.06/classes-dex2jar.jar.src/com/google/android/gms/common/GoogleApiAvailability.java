package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R.drawable;
import com.google.android.gms.base.R.string;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleApiAvailability
  extends GoogleApiAvailabilityLight
{
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  private static final Object zaa = new Object();
  private static final GoogleApiAvailability zab = new GoogleApiAvailability();
  private String zac;
  
  public static GoogleApiAvailability getInstance()
  {
    return zab;
  }
  
  public static final Task<Map<ApiKey<?>, String>> zai(HasApiKey<?> paramHasApiKey, HasApiKey<?>... paramVarArgs)
  {
    Preconditions.checkNotNull(paramHasApiKey, "Requested API must not be null.");
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++) {
      Preconditions.checkNotNull(paramVarArgs[i], "Requested API must not be null.");
    }
    ArrayList localArrayList = new ArrayList(paramVarArgs.length + 1);
    localArrayList.add(paramHasApiKey);
    localArrayList.addAll(Arrays.asList(paramVarArgs));
    return GoogleApiManager.zal().zao(localArrayList);
  }
  
  public Task<Void> checkApiAvailability(GoogleApi<?> paramGoogleApi, GoogleApi<?>... paramVarArgs)
  {
    return zai(paramGoogleApi, paramVarArgs).onSuccessTask(zab.zaa);
  }
  
  public Task<Void> checkApiAvailability(HasApiKey<?> paramHasApiKey, HasApiKey<?>... paramVarArgs)
  {
    return zai(paramHasApiKey, paramVarArgs).onSuccessTask(zaa.zaa);
  }
  
  public int getClientVersion(Context paramContext)
  {
    return super.getClientVersion(paramContext);
  }
  
  public Dialog getErrorDialog(Activity paramActivity, int paramInt1, int paramInt2)
  {
    return getErrorDialog(paramActivity, paramInt1, paramInt2, null);
  }
  
  public Dialog getErrorDialog(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return zaa(paramActivity, paramInt1, zag.zab(paramActivity, getErrorResolutionIntent(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  public Dialog getErrorDialog(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    return getErrorDialog(paramFragment, paramInt1, paramInt2, null);
  }
  
  public Dialog getErrorDialog(Fragment paramFragment, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Intent localIntent = getErrorResolutionIntent(paramFragment.requireContext(), paramInt1, "d");
    return zaa(paramFragment.requireContext(), paramInt1, zag.zac(paramFragment, localIntent, paramInt2), paramOnCancelListener);
  }
  
  public Intent getErrorResolutionIntent(Context paramContext, int paramInt, String paramString)
  {
    return super.getErrorResolutionIntent(paramContext, paramInt, paramString);
  }
  
  public PendingIntent getErrorResolutionPendingIntent(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.getErrorResolutionPendingIntent(paramContext, paramInt1, paramInt2);
  }
  
  public PendingIntent getErrorResolutionPendingIntent(Context paramContext, ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.hasResolution()) {
      return paramConnectionResult.getResolution();
    }
    return getErrorResolutionPendingIntent(paramContext, paramConnectionResult.getErrorCode(), 0);
  }
  
  public final String getErrorString(int paramInt)
  {
    return super.getErrorString(paramInt);
  }
  
  public int isGooglePlayServicesAvailable(Context paramContext)
  {
    return super.isGooglePlayServicesAvailable(paramContext);
  }
  
  public int isGooglePlayServicesAvailable(Context paramContext, int paramInt)
  {
    return super.isGooglePlayServicesAvailable(paramContext, paramInt);
  }
  
  public final boolean isUserResolvableError(int paramInt)
  {
    return super.isUserResolvableError(paramInt);
  }
  
  public Task<Void> makeGooglePlayServicesAvailable(Activity paramActivity)
  {
    int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
    Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
    i = isGooglePlayServicesAvailable(paramActivity, i);
    if (i == 0)
    {
      paramActivity = Tasks.forResult(null);
    }
    else
    {
      paramActivity = zacc.zaa(paramActivity);
      paramActivity.zah(new ConnectionResult(i, null), 0);
      paramActivity = paramActivity.zad();
    }
    return paramActivity;
  }
  
  public void setDefaultNotificationChannelId(Context arg1, String paramString)
  {
    if (PlatformVersion.isAtLeastO()) {
      Preconditions.checkNotNull(((NotificationManager)Preconditions.checkNotNull(???.getSystemService("notification"))).getNotificationChannel(paramString));
    }
    synchronized (zaa)
    {
      this.zac = paramString;
      return;
    }
  }
  
  public boolean showErrorDialogFragment(Activity paramActivity, int paramInt1, int paramInt2)
  {
    return showErrorDialogFragment(paramActivity, paramInt1, paramInt2, null);
  }
  
  public boolean showErrorDialogFragment(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = getErrorDialog(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    zad(paramActivity, localDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public void showErrorNotification(Context paramContext, int paramInt)
  {
    zae(paramContext, paramInt, null, getErrorResolutionPendingIntent(paramContext, paramInt, 0, "n"));
  }
  
  public void showErrorNotification(Context paramContext, ConnectionResult paramConnectionResult)
  {
    PendingIntent localPendingIntent = getErrorResolutionPendingIntent(paramContext, paramConnectionResult);
    zae(paramContext, paramConnectionResult.getErrorCode(), null, localPendingIntent);
  }
  
  final Dialog zaa(Context paramContext, int paramInt, zag paramzag, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog.Builder localBuilder = null;
    if (paramInt == 0) {
      return null;
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, (TypedValue)localObject, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(((TypedValue)localObject).resourceId))) {
      localBuilder = new AlertDialog.Builder(paramContext, 5);
    }
    localObject = localBuilder;
    if (localBuilder == null) {
      localObject = new AlertDialog.Builder(paramContext);
    }
    ((AlertDialog.Builder)localObject).setMessage(com.google.android.gms.common.internal.zac.zad(paramContext, paramInt));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = com.google.android.gms.common.internal.zac.zac(paramContext, paramInt);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setPositiveButton(paramOnCancelListener, paramzag);
    }
    paramContext = com.google.android.gms.common.internal.zac.zag(paramContext, paramInt);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject).setTitle(paramContext);
    }
    Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[] { Integer.valueOf(paramInt) }), new IllegalArgumentException());
    return ((AlertDialog.Builder)localObject).create();
  }
  
  public final Dialog zab(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ProgressBar localProgressBar = new ProgressBar(paramActivity, null, 16842874);
    localProgressBar.setIndeterminate(true);
    localProgressBar.setVisibility(0);
    Object localObject = new AlertDialog.Builder(paramActivity);
    ((AlertDialog.Builder)localObject).setView(localProgressBar);
    ((AlertDialog.Builder)localObject).setMessage(com.google.android.gms.common.internal.zac.zad(paramActivity, 18));
    ((AlertDialog.Builder)localObject).setPositiveButton("", null);
    localObject = ((AlertDialog.Builder)localObject).create();
    zad(paramActivity, (Dialog)localObject, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)localObject;
  }
  
  public final zabx zac(Context paramContext, zabw paramzabw)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addDataScheme("package");
    zabx localzabx = new zabx(paramzabw);
    paramContext.registerReceiver(localzabx, localIntentFilter);
    localzabx.zaa(paramContext);
    if (!isUninstalledAppPossiblyUpdating(paramContext, "com.google.android.gms"))
    {
      paramzabw.zaa();
      localzabx.zab();
      return null;
    }
    return localzabx;
  }
  
  final void zad(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    try
    {
      boolean bool = paramActivity instanceof FragmentActivity;
      if (bool)
      {
        paramActivity = ((FragmentActivity)paramActivity).getSupportFragmentManager();
        SupportErrorDialogFragment.newInstance(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
        return;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;) {}
    }
    paramActivity = paramActivity.getFragmentManager();
    ErrorDialogFragment.newInstance(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
  }
  
  final void zae(Context paramContext, int paramInt, String arg3, PendingIntent paramPendingIntent)
  {
    Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[] { Integer.valueOf(paramInt), null }), new IllegalArgumentException());
    if (paramInt == 18)
    {
      zaf(paramContext);
      return;
    }
    if (paramPendingIntent == null)
    {
      if (paramInt == 6) {
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
      }
      return;
    }
    Object localObject1 = com.google.android.gms.common.internal.zac.zaf(paramContext, paramInt);
    ??? = com.google.android.gms.common.internal.zac.zae(paramContext, paramInt);
    Object localObject2 = paramContext.getResources();
    NotificationManager localNotificationManager = (NotificationManager)Preconditions.checkNotNull(paramContext.getSystemService("notification"));
    localObject1 = new NotificationCompat.Builder(paramContext).setLocalOnly(true).setAutoCancel(true).setContentTitle((CharSequence)localObject1).setStyle(new NotificationCompat.BigTextStyle().bigText(???));
    if (DeviceProperties.isWearable(paramContext))
    {
      Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
      ((NotificationCompat.Builder)localObject1).setSmallIcon(paramContext.getApplicationInfo().icon).setPriority(2);
      if (DeviceProperties.isWearableWithoutPlayStore(paramContext)) {
        ((NotificationCompat.Builder)localObject1).addAction(R.drawable.common_full_open_on_phone, ((Resources)localObject2).getString(R.string.common_open_on_phone), paramPendingIntent);
      } else {
        ((NotificationCompat.Builder)localObject1).setContentIntent(paramPendingIntent);
      }
    }
    else
    {
      ((NotificationCompat.Builder)localObject1).setSmallIcon(17301642).setTicker(((Resources)localObject2).getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(paramPendingIntent).setContentText(???);
    }
    if (PlatformVersion.isAtLeastO()) {
      Preconditions.checkState(PlatformVersion.isAtLeastO());
    }
    synchronized (zaa)
    {
      paramPendingIntent = this.zac;
      ??? = paramPendingIntent;
      if (paramPendingIntent == null)
      {
        paramPendingIntent = "com.google.android.gms.availability";
        localObject2 = localNotificationManager.getNotificationChannel("com.google.android.gms.availability");
        paramContext = com.google.android.gms.common.internal.zac.zab(paramContext);
        if (localObject2 == null)
        {
          localNotificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", paramContext, 4));
          ??? = paramPendingIntent;
        }
        else
        {
          ??? = paramPendingIntent;
          if (!paramContext.contentEquals(((NotificationChannel)localObject2).getName()))
          {
            ((NotificationChannel)localObject2).setName(paramContext);
            localNotificationManager.createNotificationChannel((NotificationChannel)localObject2);
            ??? = paramPendingIntent;
          }
        }
      }
      ((NotificationCompat.Builder)localObject1).setChannelId(???);
      paramContext = ((NotificationCompat.Builder)localObject1).build();
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3))
      {
        paramInt = 39789;
      }
      else
      {
        GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
        paramInt = 10436;
      }
      localNotificationManager.notify(paramInt, paramContext);
      return;
    }
  }
  
  final void zaf(Context paramContext)
  {
    new zac(this, paramContext).sendEmptyMessageDelayed(1, 120000L);
  }
  
  public final boolean zag(Activity paramActivity, LifecycleFragment paramLifecycleFragment, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramLifecycleFragment = zaa(paramActivity, paramInt1, zag.zad(paramLifecycleFragment, getErrorResolutionIntent(paramActivity, paramInt1, "d"), 2), paramOnCancelListener);
    if (paramLifecycleFragment == null) {
      return false;
    }
    zad(paramActivity, paramLifecycleFragment, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public final boolean zah(Context paramContext, ConnectionResult paramConnectionResult, int paramInt)
  {
    if (InstantApps.isInstantApp(paramContext)) {
      return false;
    }
    PendingIntent localPendingIntent = getErrorResolutionPendingIntent(paramContext, paramConnectionResult);
    if (localPendingIntent != null)
    {
      zae(paramContext, paramConnectionResult.getErrorCode(), null, zal.zaa(paramContext, 0, GoogleApiActivity.zaa(paramContext, localPendingIntent, paramInt, true), zal.zaa | 0x8000000));
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\GoogleApiAvailability.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */