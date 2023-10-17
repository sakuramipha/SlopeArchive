package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgcd
  extends zzfyi
{
  private final zzgcc zza;
  
  private zzgcd(zzgcc paramzzgcc)
  {
    this.zza = paramzzgcc;
  }
  
  public static zzgcd zzb(zzgcc paramzzgcc)
  {
    return new zzgcd(paramzzgcc);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgcd)) {
      return false;
    }
    return ((zzgcd)paramObject).zza == this.zza;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzgcd.class, this.zza });
  }
  
  public final String toString()
  {
    String str = this.zza.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("XChaCha20Poly1305 Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final zzgcc zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */