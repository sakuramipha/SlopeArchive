package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzxz
{
  public static final zzxt zza = new zzxt(0, -9223372036854775807L, null);
  public static final zzxt zzb = new zzxt(1, -9223372036854775807L, null);
  public static final zzxt zzc = new zzxt(2, -9223372036854775807L, null);
  public static final zzxt zzd = new zzxt(3, -9223372036854775807L, null);
  private final ExecutorService zze = zzfn.zzz("ExoPlayer:Loader:ProgressiveMediaPeriod");
  private zzxu zzf;
  private IOException zzg;
  
  public zzxz(String paramString) {}
  
  public static zzxt zzb(boolean paramBoolean, long paramLong)
  {
    return new zzxt(paramBoolean, paramLong, null);
  }
  
  public final long zza(zzxv paramzzxv, zzxr paramzzxr, int paramInt)
  {
    Looper localLooper = Looper.myLooper();
    zzdy.zzb(localLooper);
    this.zzg = null;
    long l = SystemClock.elapsedRealtime();
    new zzxu(this, localLooper, paramzzxv, paramzzxr, paramInt, l).zzc(0L);
    return l;
  }
  
  public final void zzg()
  {
    zzxu localzzxu = this.zzf;
    zzdy.zzb(localzzxu);
    localzzxu.zza(false);
  }
  
  public final void zzh()
  {
    this.zzg = null;
  }
  
  public final void zzi(int paramInt)
    throws IOException
  {
    Object localObject = this.zzg;
    if (localObject == null)
    {
      localObject = this.zzf;
      if (localObject != null) {
        ((zzxu)localObject).zzb(paramInt);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public final void zzj(zzxw paramzzxw)
  {
    zzxu localzzxu = this.zzf;
    if (localzzxu != null) {
      localzzxu.zza(true);
    }
    this.zze.execute(new zzxx(paramzzxw));
    this.zze.shutdown();
  }
  
  public final boolean zzk()
  {
    return this.zzg != null;
  }
  
  public final boolean zzl()
  {
    return this.zzf != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */