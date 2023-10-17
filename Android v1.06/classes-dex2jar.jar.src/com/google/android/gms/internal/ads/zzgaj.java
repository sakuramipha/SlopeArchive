package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgaj
  extends zzfyi
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final zzgah zzd;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgaj)) {
      return false;
    }
    paramObject = (zzgaj)paramObject;
    if (((zzgaj)paramObject).zza == this.zza)
    {
      int i = ((zzgaj)paramObject).zzb;
      i = ((zzgaj)paramObject).zzc;
      if (((zzgaj)paramObject).zzd == this.zzd) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzgaj.class, Integer.valueOf(this.zza), Integer.valueOf(12), Integer.valueOf(16), this.zzd });
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zzd);
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesGcm Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(12);
    localStringBuilder.append("-byte IV, ");
    localStringBuilder.append(16);
    localStringBuilder.append("-byte tag, and ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final zzgah zzb()
  {
    return this.zzd;
  }
  
  public final boolean zzc()
  {
    return this.zzd != zzgah.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */