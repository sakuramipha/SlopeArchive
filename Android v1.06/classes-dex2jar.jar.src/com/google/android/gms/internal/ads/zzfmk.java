package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class zzfmk
  extends zzfnd
{
  private final IBinder zza;
  private final String zzb;
  private final int zzc;
  private final float zzd;
  private final int zze;
  private final String zzf;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzfnd))
    {
      paramObject = (zzfnd)paramObject;
      if (this.zza.equals(((zzfnd)paramObject).zze()))
      {
        ((zzfnd)paramObject).zzi();
        String str = this.zzb;
        if ((str == null ? ((zzfnd)paramObject).zzg() == null : str.equals(((zzfnd)paramObject).zzg())) && (this.zzc == ((zzfnd)paramObject).zzc()) && (Float.floatToIntBits(this.zzd) == Float.floatToIntBits(((zzfnd)paramObject).zza())))
        {
          ((zzfnd)paramObject).zzb();
          ((zzfnd)paramObject).zzh();
          if (this.zze == ((zzfnd)paramObject).zzd())
          {
            str = this.zzf;
            if (str == null ? ((zzfnd)paramObject).zzf() == null : str.equals(((zzfnd)paramObject).zzf())) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zza.hashCode();
    String str = this.zzb;
    int j = 0;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    int i1 = this.zzc;
    int m = Float.floatToIntBits(this.zzd);
    int n = this.zze;
    str = this.zzf;
    if (str != null) {
      j = str.hashCode();
    }
    return ((((((k ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ i) * 1000003 ^ i1) * 1000003 ^ m) * 583896283 ^ n) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    String str2 = this.zza.toString();
    String str3 = this.zzb;
    int i = this.zzc;
    float f = this.zzd;
    int j = this.zze;
    String str1 = this.zzf;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OverlayDisplayShowRequest{windowToken=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", stableSessionToken=false, appId=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", layoutGravity=");
    localStringBuilder.append(i);
    localStringBuilder.append(", layoutVerticalMargin=");
    localStringBuilder.append(f);
    localStringBuilder.append(", displayMode=0, sessionToken=null, windowWidthPx=");
    localStringBuilder.append(j);
    localStringBuilder.append(", adFieldEnifd=");
    localStringBuilder.append(str1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final float zza()
  {
    return this.zzd;
  }
  
  public final int zzb()
  {
    return 0;
  }
  
  public final int zzc()
  {
    return this.zzc;
  }
  
  public final int zzd()
  {
    return this.zze;
  }
  
  public final IBinder zze()
  {
    return this.zza;
  }
  
  public final String zzf()
  {
    return this.zzf;
  }
  
  public final String zzg()
  {
    return this.zzb;
  }
  
  public final String zzh()
  {
    return null;
  }
  
  public final boolean zzi()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */