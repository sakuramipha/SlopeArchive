package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzdi
{
  public static final zzdi zza = new zzdi(zzfrr.zzl());
  public static final zzn zzb = zzdf.zza;
  private static final String zzc = Integer.toString(0, 36);
  private final zzfrr zzd;
  
  public zzdi(List paramList)
  {
    this.zzd = zzfrr.zzj(paramList);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzdi)paramObject;
      return this.zzd.equals(((zzdi)paramObject).zzd);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zzd.hashCode();
  }
  
  public final zzfrr zza()
  {
    return this.zzd;
  }
  
  public final boolean zzb(int paramInt)
  {
    for (int i = 0; i < this.zzd.size(); i++)
    {
      zzdh localzzdh = (zzdh)this.zzd.get(i);
      if ((localzzdh.zzc()) && (localzzdh.zza() == paramInt)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */