package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.ApiKey;

public abstract interface HasApiKey<O extends Api.ApiOptions>
{
  public abstract ApiKey<O> getApiKey();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\HasApiKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */