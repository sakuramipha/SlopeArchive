package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.Nearby;

abstract class zzbt
  extends BaseImplementation.ApiMethodImpl<Status, zzai>
{
  private final ListenerHolder<BaseImplementation.ResultHolder<Status>> zza;
  
  public zzbt(GoogleApiClient paramGoogleApiClient)
  {
    super(Nearby.MESSAGES_API, paramGoogleApiClient);
    this.zza = paramGoogleApiClient.registerListener(this);
  }
  
  final ListenerHolder<BaseImplementation.ResultHolder<Status>> zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */