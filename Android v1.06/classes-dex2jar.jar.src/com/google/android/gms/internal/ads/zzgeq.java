package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzgeq
{
  private final Class zza;
  private final zzgmu zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgeq)) {
      return false;
    }
    paramObject = (zzgeq)paramObject;
    return (((zzgeq)paramObject).zza.equals(this.zza)) && (((zzgeq)paramObject).zzb.equals(this.zzb));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final String toString()
  {
    String str2 = this.zza.getSimpleName();
    String str1 = String.valueOf(this.zzb);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append(", object identifier: ");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */