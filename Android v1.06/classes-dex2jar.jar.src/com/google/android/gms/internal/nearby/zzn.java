package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;

final class zzn
{
  private final Class<?> zza;
  private final Api.ApiOptions zzb;
  
  zzn(GoogleApi<?> paramGoogleApi, Api.ApiOptions paramApiOptions)
  {
    this.zza = paramGoogleApi.getClass();
    this.zzb = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzn))
    {
      paramObject = (zzn)paramObject;
      if (Objects.equal(this.zza, ((zzn)paramObject).zza))
      {
        paramObject = ((zzn)paramObject).zzb;
        if (Objects.equal(null, null)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, null });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */