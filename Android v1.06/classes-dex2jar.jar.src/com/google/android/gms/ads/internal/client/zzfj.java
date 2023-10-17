package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgg;

public final class zzfj
  extends zzbgg
{
  private final ShouldDelayBannerRenderingListener zza;
  
  public zzfj(ShouldDelayBannerRenderingListener paramShouldDelayBannerRenderingListener)
  {
    this.zza = paramShouldDelayBannerRenderingListener;
  }
  
  public final boolean zzb(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    return this.zza.shouldDelayBannerRendering((Runnable)ObjectWrapper.unwrap(paramIObjectWrapper));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */