package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfyy
  extends zzfyi
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final zzfyw zzd;
  private final zzfyv zze;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzfyy)) {
      return false;
    }
    paramObject = (zzfyy)paramObject;
    return (((zzfyy)paramObject).zza == this.zza) && (((zzfyy)paramObject).zzb == this.zzb) && (((zzfyy)paramObject).zzb() == zzb()) && (((zzfyy)paramObject).zzd == this.zzd) && (((zzfyy)paramObject).zze == this.zze);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzfyy.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze });
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.zzd);
    String str2 = String.valueOf(this.zze);
    int i = this.zzc;
    int j = this.zza;
    int k = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesCtrHmacAead Parameters (variant: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hashType: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte tags, and ");
    localStringBuilder.append(j);
    localStringBuilder.append("-byte AES key, and ");
    localStringBuilder.append(k);
    localStringBuilder.append("-byte HMAC key)");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    zzfyw localzzfyw = this.zzd;
    if (localzzfyw == zzfyw.zzc) {
      return this.zzc + 16;
    }
    if ((localzzfyw != zzfyw.zza) && (localzzfyw != zzfyw.zzb)) {
      throw new IllegalStateException("Unknown variant");
    }
    return this.zzc + 21;
  }
  
  public final int zzc()
  {
    return this.zzb;
  }
  
  public final zzfyw zzd()
  {
    return this.zzd;
  }
  
  public final boolean zze()
  {
    return this.zzd != zzfyw.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */