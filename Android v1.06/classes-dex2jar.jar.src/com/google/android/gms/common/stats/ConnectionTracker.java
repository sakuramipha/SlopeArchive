package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ConnectionTracker
{
  private static final Object zzb = new Object();
  @Nullable
  private static volatile ConnectionTracker zzc;
  public ConcurrentHashMap<ServiceConnection, ServiceConnection> zza = new ConcurrentHashMap();
  
  public static ConnectionTracker getInstance()
  {
    if (zzc == null) {
      synchronized (zzb)
      {
        if (zzc == null)
        {
          ConnectionTracker localConnectionTracker = new com/google/android/gms/common/stats/ConnectionTracker;
          localConnectionTracker.<init>();
          zzc = localConnectionTracker;
        }
      }
    }
    ??? = zzc;
    Preconditions.checkNotNull(???);
    return (ConnectionTracker)???;
  }
  
  private static void zzb(Context paramContext, ServiceConnection paramServiceConnection)
  {
    try
    {
      paramContext.unbindService(paramServiceConnection);
      return;
    }
    catch (IllegalArgumentException|IllegalStateException|NoSuchElementException paramContext)
    {
      for (;;) {}
    }
  }
  
  private final boolean zzc(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, boolean paramBoolean, @Nullable Executor paramExecutor)
  {
    Object localObject = paramIntent.getComponent();
    if (localObject != null)
    {
      localObject = ((ComponentName)localObject).getPackageName();
      "com.google.android.gms".equals(localObject);
      try
      {
        int i = Wrappers.packageManager(paramContext).getApplicationInfo((String)localObject, 0).flags;
        if ((i & 0x200000) != 0)
        {
          Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
          return false;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    if (zzd(paramServiceConnection))
    {
      ServiceConnection localServiceConnection = (ServiceConnection)this.zza.putIfAbsent(paramServiceConnection, paramServiceConnection);
      if ((localServiceConnection != null) && (paramServiceConnection != localServiceConnection)) {
        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { paramServiceConnection, paramString, paramIntent.getAction() }));
      }
      try
      {
        paramBoolean = zze(paramContext, paramIntent, paramServiceConnection, paramInt, paramExecutor);
        if (paramBoolean) {
          break label194;
        }
        return false;
      }
      finally
      {
        this.zza.remove(paramServiceConnection, paramServiceConnection);
      }
    }
    paramBoolean = zze(paramContext, paramIntent, paramServiceConnection, paramInt, paramExecutor);
    label194:
    return paramBoolean;
  }
  
  private static boolean zzd(ServiceConnection paramServiceConnection)
  {
    return !(paramServiceConnection instanceof zzs);
  }
  
  private static final boolean zze(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, @Nullable Executor paramExecutor)
  {
    if ((PlatformVersion.isAtLeastQ()) && (paramExecutor != null)) {
      return paramContext.bindService(paramIntent, paramInt, paramExecutor, paramServiceConnection);
    }
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
  
  public boolean bindService(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return zzc(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt, true, null);
  }
  
  public void unbindService(Context paramContext, ServiceConnection paramServiceConnection)
  {
    if ((zzd(paramServiceConnection)) && (this.zza.containsKey(paramServiceConnection))) {
      try
      {
        zzb(paramContext, (ServiceConnection)this.zza.get(paramServiceConnection));
        return;
      }
      finally
      {
        this.zza.remove(paramServiceConnection);
      }
    }
    zzb(paramContext, paramServiceConnection);
  }
  
  public void unbindServiceSafe(Context paramContext, ServiceConnection paramServiceConnection)
  {
    try
    {
      unbindService(paramContext, paramServiceConnection);
      return;
    }
    catch (IllegalArgumentException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final boolean zza(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, @Nullable Executor paramExecutor)
  {
    return zzc(paramContext, paramString, paramIntent, paramServiceConnection, paramInt, true, paramExecutor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\stats\ConnectionTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */