package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class ApiKey<O extends Api.ApiOptions>
{
  private final int zaa;
  private final Api<O> zab;
  private final O zac;
  private final String zad;
  
  private ApiKey(Api<O> paramApi, O paramO, String paramString)
  {
    this.zab = paramApi;
    this.zac = paramO;
    this.zad = paramString;
    this.zaa = Objects.hashCode(new Object[] { paramApi, paramO, paramString });
  }
  
  public static <O extends Api.ApiOptions> ApiKey<O> zaa(Api<O> paramApi, O paramO, String paramString)
  {
    return new ApiKey(paramApi, paramO, paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ApiKey)) {
      return false;
    }
    paramObject = (ApiKey)paramObject;
    return (Objects.equal(this.zab, ((ApiKey)paramObject).zab)) && (Objects.equal(this.zac, ((ApiKey)paramObject).zac)) && (Objects.equal(this.zad, ((ApiKey)paramObject).zad));
  }
  
  public final int hashCode()
  {
    return this.zaa;
  }
  
  public final String zab()
  {
    return this.zab.zad();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\ApiKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */