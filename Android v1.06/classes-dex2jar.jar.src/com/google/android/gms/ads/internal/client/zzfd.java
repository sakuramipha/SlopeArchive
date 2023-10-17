package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzfd
  extends zzdc
{
  private final OnAdMetadataChangedListener zza;
  
  public zzfd(OnAdMetadataChangedListener paramOnAdMetadataChangedListener)
  {
    this.zza = paramOnAdMetadataChangedListener;
  }
  
  public final void zze()
    throws RemoteException
  {
    OnAdMetadataChangedListener localOnAdMetadataChangedListener = this.zza;
    if (localOnAdMetadataChangedListener != null) {
      localOnAdMetadataChangedListener.onAdMetadataChanged();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */