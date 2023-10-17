package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public class TelemetryLoggingOptions
  implements Api.ApiOptions.Optional
{
  public static final TelemetryLoggingOptions zaa = builder().build();
  private final String zab;
  
  public static Builder builder()
  {
    return new Builder(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof TelemetryLoggingOptions)) {
      return false;
    }
    paramObject = (TelemetryLoggingOptions)paramObject;
    return Objects.equal(this.zab, ((TelemetryLoggingOptions)paramObject).zab);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zab });
  }
  
  public final Bundle zaa()
  {
    Bundle localBundle = new Bundle();
    String str = this.zab;
    if (str != null) {
      localBundle.putString("api", str);
    }
    return localBundle;
  }
  
  public static class Builder
  {
    private String zaa;
    
    public TelemetryLoggingOptions build()
    {
      return new TelemetryLoggingOptions(this.zaa, null);
    }
    
    public Builder setApi(String paramString)
    {
      this.zaa = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\TelemetryLoggingOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */