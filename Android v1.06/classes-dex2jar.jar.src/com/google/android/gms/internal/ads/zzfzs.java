package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfzs
  extends zzfyi
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final zzfzq zzd;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzfzs)) {
      return false;
    }
    paramObject = (zzfzs)paramObject;
    if ((((zzfzs)paramObject).zza == this.zza) && (((zzfzs)paramObject).zzb == this.zzb))
    {
      int i = ((zzfzs)paramObject).zzc;
      if (((zzfzs)paramObject).zzd == this.zzd) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzfzs.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(16), this.zzd });
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zzd);
    int j = this.zzb;
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesEax Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
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
  
  public final zzfzq zzb()
  {
    return this.zzd;
  }
  
  public final boolean zzc()
  {
    return this.zzd != zzfzq.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */