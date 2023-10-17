package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzbtg
  extends zzc
{
  public zzbtg(Context paramContext, Looper paramLooper, BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    super(zzbuu.zza(paramContext), paramLooper, 8, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, null);
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.ads.service.START";
  }
  
  public final zzbts zzp()
    throws DeadObjectException
  {
    return (zzbts)super.getService();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */