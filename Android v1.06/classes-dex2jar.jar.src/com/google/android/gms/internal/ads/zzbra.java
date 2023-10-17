package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbra
  extends NativeAd.AdChoicesInfo
{
  private final List zza = new ArrayList();
  private String zzb;
  
  public zzbra(zzbei paramzzbei)
  {
    try
    {
      this.zzb = paramzzbei.zzg();
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
      this.zzb = "";
    }
    try
    {
      Iterator localIterator = paramzzbei.zzh().iterator();
      while (localIterator.hasNext())
      {
        paramzzbei = localIterator.next();
        if ((paramzzbei instanceof IBinder)) {
          paramzzbei = zzbep.zzg((IBinder)paramzzbei);
        } else {
          paramzzbei = null;
        }
        if (paramzzbei != null)
        {
          List localList = this.zza;
          zzbrc localzzbrc = new com/google/android/gms/internal/ads/zzbrc;
          localzzbrc.<init>(paramzzbei);
          localList.add(localzzbrc);
        }
      }
      return;
    }
    catch (RemoteException paramzzbei)
    {
      zzbzt.zzh("", paramzzbei);
    }
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zza;
  }
  
  public final CharSequence getText()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */