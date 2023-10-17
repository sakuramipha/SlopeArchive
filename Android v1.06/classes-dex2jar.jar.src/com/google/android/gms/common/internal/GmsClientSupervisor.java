package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class GmsClientSupervisor
{
  static HandlerThread zza;
  private static int zzb = 4225;
  private static final Object zzc = new Object();
  private static zzr zzd;
  private static boolean zze = false;
  
  public static int getDefaultBindFlags()
  {
    return zzb;
  }
  
  public static GmsClientSupervisor getInstance(Context paramContext)
  {
    synchronized (zzc)
    {
      if (zzd == null)
      {
        zzr localzzr = new com/google/android/gms/common/internal/zzr;
        Context localContext = paramContext.getApplicationContext();
        if (zze) {
          paramContext = getOrStartHandlerThread().getLooper();
        } else {
          paramContext = paramContext.getMainLooper();
        }
        localzzr.<init>(localContext, paramContext);
        zzd = localzzr;
      }
      return zzd;
    }
  }
  
  public static HandlerThread getOrStartHandlerThread()
  {
    synchronized (zzc)
    {
      HandlerThread localHandlerThread = zza;
      if (localHandlerThread != null) {
        return localHandlerThread;
      }
      localHandlerThread = new android/os/HandlerThread;
      localHandlerThread.<init>("GoogleApiHandler", 9);
      zza = localHandlerThread;
      localHandlerThread.start();
      localHandlerThread = zza;
      return localHandlerThread;
    }
  }
  
  public static void setUseHandlerThreadForCallbacks()
  {
    synchronized (zzc)
    {
      zzr localzzr = zzd;
      if ((localzzr != null) && (!zze)) {
        localzzr.zzi(getOrStartHandlerThread().getLooper());
      }
      zze = true;
      return;
    }
  }
  
  public boolean bindService(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return zzc(new zzn(paramComponentName, getDefaultBindFlags()), paramServiceConnection, paramString, null);
  }
  
  public boolean bindService(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    return zzc(new zzn(paramString1, getDefaultBindFlags(), false), paramServiceConnection, paramString2, null);
  }
  
  public void unbindService(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    zza(new zzn(paramComponentName, getDefaultBindFlags()), paramServiceConnection, paramString);
  }
  
  public void unbindService(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    zza(new zzn(paramString1, getDefaultBindFlags(), false), paramServiceConnection, paramString2);
  }
  
  protected abstract void zza(zzn paramzzn, ServiceConnection paramServiceConnection, String paramString);
  
  public final void zzb(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3, boolean paramBoolean)
  {
    zza(new zzn(paramString1, paramString2, paramInt, paramBoolean), paramServiceConnection, paramString3);
  }
  
  protected abstract boolean zzc(zzn paramzzn, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\GmsClientSupervisor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */