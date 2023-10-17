package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

final class zzeyu
  implements OnAdMetadataChangedListener
{
  final zzeyw zzb;
  
  zzeyu(zzeyw paramzzeyw, zzdd paramzzdd) {}
  
  public final void onAdMetadataChanged()
  {
    if (zzeyw.zzr(this.zzb) != null) {
      try
      {
        this.zza.zze();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */