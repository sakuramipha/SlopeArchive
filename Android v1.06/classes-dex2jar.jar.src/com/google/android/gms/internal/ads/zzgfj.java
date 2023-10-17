package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgfj
  extends zzggo
{
  private final int zza;
  private final int zzb;
  private final zzgfh zzc;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgfj)) {
      return false;
    }
    paramObject = (zzgfj)paramObject;
    return (((zzgfj)paramObject).zza == this.zza) && (((zzgfj)paramObject).zzb() == zzb()) && (((zzgfj)paramObject).zzc == this.zzc);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzgfj.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc });
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zzc);
    int j = this.zzb;
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AES-CMAC Parameters (variant: ");
    localStringBuilder.append(str);
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
    zzgfh localzzgfh = this.zzc;
    if (localzzgfh == zzgfh.zzd) {
      return this.zzb;
    }
    if (localzzgfh == zzgfh.zza) {}
    while ((localzzgfh == zzgfh.zzb) || (localzzgfh == zzgfh.zzc)) {
      return this.zzb + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public final zzgfh zzc()
  {
    return this.zzc;
  }
  
  public final boolean zzd()
  {
    return this.zzc != zzgfh.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */