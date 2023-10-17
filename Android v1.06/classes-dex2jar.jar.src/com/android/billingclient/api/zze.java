package com.android.billingclient.api;

import java.util.Arrays;

public final class zze
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zze)) {
      return false;
    }
    Object localObject = (zze)paramObject;
    if ((this.zza.equals(((zze)localObject).zza)) && (this.zzb.equals(((zze)localObject).zzb)))
    {
      paramObject = this.zzc;
      localObject = ((zze)localObject).zzc;
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zza, this.zzb, this.zzc });
  }
  
  public final String toString()
  {
    return String.format("{id: %s, type: %s, offer token: %s}", new Object[] { this.zza, this.zzb, this.zzc });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */