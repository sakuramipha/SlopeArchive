package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzbyz
  extends ConnectivityManager.NetworkCallback
{
  final zzbzc zza;
  
  zzbyz(zzbzc paramzzbzc) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    zzbzc.zzo(this.zza).set(true);
  }
  
  public final void onLost(Network paramNetwork)
  {
    zzbzc.zzo(this.zza).set(false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */