package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzht
{
  public final String zza;
  public final zzam zzb;
  public final zzam zzc;
  public final int zzd;
  public final int zze;
  
  public zzht(String paramString, zzam paramzzam1, zzam paramzzam2, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i = paramInt2;
    if (paramInt1 != 0)
    {
      i = paramInt2;
      if (paramInt2 == 0) {
        i = 0;
      }
    }
    else
    {
      bool = true;
    }
    zzdy.zzd(bool);
    zzdy.zzc(paramString);
    this.zza = paramString;
    Objects.requireNonNull(paramzzam1);
    this.zzb = paramzzam1;
    Objects.requireNonNull(paramzzam2);
    this.zzc = paramzzam2;
    this.zzd = paramInt1;
    this.zze = i;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzht)paramObject;
      if ((this.zzd == ((zzht)paramObject).zzd) && (this.zze == ((zzht)paramObject).zze) && (this.zza.equals(((zzht)paramObject).zza)) && (this.zzb.equals(((zzht)paramObject).zzb)) && (this.zzc.equals(((zzht)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((this.zzd + 527) * 31 + this.zze) * 31 + this.zza.hashCode()) * 31 + this.zzb.hashCode()) * 31 + this.zzc.hashCode();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */