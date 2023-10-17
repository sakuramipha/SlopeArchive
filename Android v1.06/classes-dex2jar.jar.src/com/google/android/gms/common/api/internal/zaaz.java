package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zaaz
  implements GoogleApiClient.ConnectionCallbacks
{
  final zabe zac;
  
  zaaz(zabe paramzabe, AtomicReference paramAtomicReference, StatusPendingResult paramStatusPendingResult) {}
  
  public final void onConnected(Bundle paramBundle)
  {
    zabe.zah(this.zac, (GoogleApiClient)Preconditions.checkNotNull((GoogleApiClient)this.zaa.get()), this.zab, true);
  }
  
  public final void onConnectionSuspended(int paramInt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */