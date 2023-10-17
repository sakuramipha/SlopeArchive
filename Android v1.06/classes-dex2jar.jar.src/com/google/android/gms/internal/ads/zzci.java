package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class zzci
{
  public static final zzci zza = new zzci(1.0F, 1.0F);
  public static final zzn zzb = zzch.zza;
  private static final String zze = Integer.toString(0, 36);
  private static final String zzf = Integer.toString(1, 36);
  public final float zzc;
  public final float zzd;
  private final int zzg;
  
  public zzci(float paramFloat1, float paramFloat2)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramFloat1 > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    if (paramFloat2 > 0.0F) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    this.zzc = paramFloat1;
    this.zzd = paramFloat2;
    this.zzg = Math.round(paramFloat1 * 1000.0F);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzci)paramObject;
      if ((this.zzc == ((zzci)paramObject).zzc) && (this.zzd == ((zzci)paramObject).zzd)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (Float.floatToRawIntBits(this.zzc) + 527) * 31 + Float.floatToRawIntBits(this.zzd);
  }
  
  public final String toString()
  {
    float f2 = this.zzc;
    float f1 = this.zzd;
    return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[] { Float.valueOf(f2), Float.valueOf(f1) });
  }
  
  public final long zza(long paramLong)
  {
    return paramLong * this.zzg;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */