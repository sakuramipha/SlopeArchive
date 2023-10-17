package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public final class zzfka
  extends zzc
{
  private final int zze;
  
  public zzfka(Context paramContext, Looper paramLooper, BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramLooper, 116, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, null);
    this.zze = paramInt;
  }
  
  public final int getMinApkVersion()
  {
    return this.zze;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.gass.internal.IGassService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.gass.START";
  }
  
  public final zzfkf zzp()
    throws DeadObjectException
  {
    return (zzfkf)super.getService();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */