package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzfxy
  implements Comparable
{
  private final byte[] zza;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzfxy)) {
      return false;
    }
    paramObject = (zzfxy)paramObject;
    return Arrays.equals(this.zza, ((zzfxy)paramObject).zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zza);
  }
  
  public final String toString()
  {
    return zzgmj.zza(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */