package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.nearby.Nearby;

abstract class zzdi<R extends Result>
  extends BaseImplementation.ApiMethodImpl<R, zzbf>
{
  public zzdi(GoogleApiClient paramGoogleApiClient)
  {
    super(Nearby.CONNECTIONS_API, paramGoogleApiClient);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */