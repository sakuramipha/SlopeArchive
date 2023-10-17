package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

public final class zzcbw
{
  private final long zza;
  private long zzb;
  private boolean zzc;
  
  zzcbw()
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    zzbbc localzzbbc = zzbbk.zzD;
    this.zza = localTimeUnit.toNanos(((Long)zzba.zzc().zzb(localzzbbc)).longValue());
    this.zzc = true;
  }
  
  public final void zza(SurfaceTexture paramSurfaceTexture, zzcbh paramzzcbh)
  {
    if (paramzzcbh == null) {
      return;
    }
    long l = paramSurfaceTexture.getTimestamp();
    if ((!this.zzc) && (Math.abs(l - this.zzb) < this.zza)) {
      return;
    }
    this.zzc = false;
    this.zzb = l;
    zzs.zza.post(new zzcbv(paramzzcbh));
  }
  
  public final void zzb()
  {
    this.zzc = true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */