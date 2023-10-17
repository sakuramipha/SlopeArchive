package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgbl
  extends zzfyi
{
  private final zzgbk zza;
  
  private zzgbl(zzgbk paramzzgbk)
  {
    this.zza = paramzzgbk;
  }
  
  public static zzgbl zzb(zzgbk paramzzgbk)
  {
    return new zzgbl(paramzzgbk);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgbl)) {
      return false;
    }
    return ((zzgbl)paramObject).zza == this.zza;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zzgbl.class, this.zza });
  }
  
  public final String toString()
  {
    String str = this.zza.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ChaCha20Poly1305 Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final zzgbk zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */