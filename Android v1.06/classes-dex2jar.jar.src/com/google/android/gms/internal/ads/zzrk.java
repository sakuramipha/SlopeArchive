package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

public final class zzrk
{
  public final zzrp zza;
  public final MediaFormat zzb;
  public final zzam zzc;
  public final Surface zzd;
  public final MediaCrypto zze;
  
  private zzrk(zzrp paramzzrp, MediaFormat paramMediaFormat, zzam paramzzam, Surface paramSurface, MediaCrypto paramMediaCrypto, int paramInt)
  {
    this.zza = paramzzrp;
    this.zzb = paramMediaFormat;
    this.zzc = paramzzam;
    this.zzd = paramSurface;
    this.zze = null;
  }
  
  public static zzrk zza(zzrp paramzzrp, MediaFormat paramMediaFormat, zzam paramzzam, MediaCrypto paramMediaCrypto)
  {
    return new zzrk(paramzzrp, paramMediaFormat, paramzzam, null, null, 0);
  }
  
  public static zzrk zzb(zzrp paramzzrp, MediaFormat paramMediaFormat, zzam paramzzam, Surface paramSurface, MediaCrypto paramMediaCrypto)
  {
    return new zzrk(paramzzrp, paramMediaFormat, paramzzam, paramSurface, null, 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */