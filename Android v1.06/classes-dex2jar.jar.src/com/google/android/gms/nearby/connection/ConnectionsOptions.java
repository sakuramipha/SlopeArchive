package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public class ConnectionsOptions
  implements Api.ApiOptions.Optional
{
  private final String zza;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ConnectionsOptions)) {
      return false;
    }
    paramObject = ((ConnectionsOptions)paramObject).zza;
    return Objects.equal(null, null);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { null });
  }
  
  public static class Builder
  {
    public ConnectionsOptions build()
    {
      return new ConnectionsOptions(this, null);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\ConnectionsOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */