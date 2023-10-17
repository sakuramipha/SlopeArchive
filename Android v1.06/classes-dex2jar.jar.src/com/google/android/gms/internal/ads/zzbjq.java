package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzbjq
  extends zzc
{
  zzbjq(Context paramContext, Looper paramLooper, BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    super(zzbuu.zza(paramContext), paramLooper, 166, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, null);
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.ads.service.HTTP";
  }
  
  public final zzbjx zzp()
    throws DeadObjectException
  {
    return (zzbjx)super.getService();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */