package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;

public final class zzasa
{
  private static final String[] zza = { "android:establish_vpn_service", "android:establish_vpn_manager" };
  private long zzb = 0L;
  private long zzc = 0L;
  private long zzd = -1L;
  private boolean zze = false;
  
  zzasa(Context paramContext, Executor paramExecutor, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT < 30) {
      return;
    }
    zzarz localzzarz = new zzarz(this);
    try
    {
      ((AppOpsManager)paramContext.getSystemService("appops")).startWatchingActive(paramArrayOfString, paramExecutor, localzzarz);
      return;
    }
    catch (NoSuchMethodError|IllegalArgumentException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static zzasa zzd(Context paramContext, Executor paramExecutor)
  {
    return new zzasa(paramContext, paramExecutor, zza);
  }
  
  public final long zzb()
  {
    long l = this.zzd;
    this.zzd = -1L;
    return l;
  }
  
  public final long zzc()
  {
    if (this.zze) {
      return this.zzc - this.zzb;
    }
    return -1L;
  }
  
  public final void zzh()
  {
    if (this.zze) {
      this.zzc = System.currentTimeMillis();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */