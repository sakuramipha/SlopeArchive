package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzges
{
  private final Class zza;
  private final Class zzb;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzges)) {
      return false;
    }
    paramObject = (zzges)paramObject;
    return (((zzges)paramObject).zza.equals(this.zza)) && (((zzges)paramObject).zzb.equals(this.zzb));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final String toString()
  {
    String str1 = this.zza.getSimpleName();
    String str2 = this.zzb.getSimpleName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(" with serialization type: ");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzges.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */