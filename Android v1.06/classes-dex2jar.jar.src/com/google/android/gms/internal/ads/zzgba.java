package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgba
  extends zzfyi
{
  private final int zza;
  private final zzgay zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgba)) {
      return false;
    }
    paramObject = (zzgba)paramObject;
    return (((zzgba)paramObject).zza == this.zza) && (((zzgba)paramObject).zzb == this.zzb);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzgba.class, Integer.valueOf(this.zza), this.zzb });
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zzb);
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AesGcmSiv Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final zzgay zzb()
  {
    return this.zzb;
  }
  
  public final boolean zzc()
  {
    return this.zzb != zzgay.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */