package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzggg
  extends zzggo
{
  private final int zza;
  private final int zzb;
  private final zzgge zzc;
  private final zzggd zzd;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzggg)) {
      return false;
    }
    paramObject = (zzggg)paramObject;
    return (((zzggg)paramObject).zza == this.zza) && (((zzggg)paramObject).zzb() == zzb()) && (((zzggg)paramObject).zzc == this.zzc) && (((zzggg)paramObject).zzd == this.zzd);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzggg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd });
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.zzc);
    String str2 = String.valueOf(this.zzd);
    int j = this.zzb;
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HMAC Parameters (variant: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hashType: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
    localStringBuilder.append("-byte tags, and ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    zzgge localzzgge = this.zzc;
    if (localzzgge == zzgge.zzd) {
      return this.zzb;
    }
    if (localzzgge == zzgge.zza) {}
    while ((localzzgge == zzgge.zzb) || (localzzgge == zzgge.zzc)) {
      return this.zzb + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public final zzgge zzc()
  {
    return this.zzc;
  }
  
  public final boolean zzd()
  {
    return this.zzc != zzgge.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */