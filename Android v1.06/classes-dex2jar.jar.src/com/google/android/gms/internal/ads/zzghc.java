package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzghc
{
  private final zzfxg zza;
  private final int zzb;
  private final String zzc;
  private final String zzd;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzghc)) {
      return false;
    }
    paramObject = (zzghc)paramObject;
    return (this.zza == ((zzghc)paramObject).zza) && (this.zzb == ((zzghc)paramObject).zzb) && (this.zzc.equals(((zzghc)paramObject).zzc)) && (this.zzd.equals(((zzghc)paramObject).zzd));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd });
  }
  
  public final String toString()
  {
    return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[] { this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd });
  }
  
  public final int zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */