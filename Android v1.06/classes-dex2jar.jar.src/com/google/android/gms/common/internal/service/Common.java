package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;

public final class Common
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final Api.ClientKey<zah> CLIENT_KEY;
  public static final zae zaa = new zae();
  private static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> zab;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    CLIENT_KEY = localClientKey;
    zab localzab = new zab();
    zab = localzab;
    API = new Api("Common.API", localzab, localClientKey);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\Common.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */