package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzbtj
  extends BaseGmsClient
{
  public zzbtj(Context paramContext, Looper paramLooper, BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 8, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, null);
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.ads.internal.request.IAdsService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.ads.service.ADS";
  }
  
  public final zzbtw zzp()
    throws DeadObjectException
  {
    return (zzbtw)super.getService();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */