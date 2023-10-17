package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public final class zzq
  implements Api.ApiOptions.Optional
{
  public final int zza;
  public final String zzb;
  
  public static zzo zza()
  {
    return new zzo(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzq)) {
      return false;
    }
    paramObject = (zzq)paramObject;
    return (this.zza == ((zzq)paramObject).zza) && (Objects.equal(this.zzb, ((zzq)paramObject).zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), this.zzb });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */