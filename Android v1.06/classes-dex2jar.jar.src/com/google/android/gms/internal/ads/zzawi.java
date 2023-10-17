package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.ArrayUtils;

public final class zzawi
  extends zzc
{
  zzawi(Context paramContext, Looper paramLooper, BaseGmsClient.BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    super(zzbuu.zza(paramContext), paramLooper, 123, paramBaseConnectionCallbacks, paramBaseOnConnectionFailedListener, null);
  }
  
  public final Feature[] getApiFeatures()
  {
    return zzg.zzb;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.ads.internal.cache.ICacheService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.ads.service.CACHE";
  }
  
  public final boolean zzp()
  {
    Feature[] arrayOfFeature = getAvailableFeatures();
    zzbbc localzzbbc = zzbbk.zzbJ;
    return (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (ArrayUtils.contains(arrayOfFeature, zzg.zza));
  }
  
  public final zzawl zzq()
    throws DeadObjectException
  {
    return (zzawl)super.getService();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */