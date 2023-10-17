package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzgei
{
  private final Class zza;
  private final Class zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgei)) {
      return false;
    }
    paramObject = (zzgei)paramObject;
    return (((zzgei)paramObject).zza.equals(this.zza)) && (((zzgei)paramObject).zzb.equals(this.zzb));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final String toString()
  {
    String str2 = this.zza.getSimpleName();
    String str1 = this.zzb.getSimpleName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append(" with primitive type: ");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */