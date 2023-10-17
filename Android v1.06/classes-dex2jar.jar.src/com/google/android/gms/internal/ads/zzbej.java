package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbej
  extends NativeAd.AdChoicesInfo
{
  private final zzbei zza;
  private final List zzb = new ArrayList();
  private String zzc;
  
  public zzbej(zzbei paramzzbei)
  {
    this.zza = paramzzbei;
    try
    {
      this.zzc = paramzzbei.zzg();
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
      this.zzc = "";
    }
    try
    {
      Iterator localIterator = paramzzbei.zzh().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        boolean bool = localObject2 instanceof IBinder;
        Object localObject1 = null;
        paramzzbei = (zzbei)localObject1;
        if (bool)
        {
          paramzzbei = (IBinder)localObject2;
          if (paramzzbei == null)
          {
            paramzzbei = (zzbei)localObject1;
          }
          else
          {
            localObject1 = paramzzbei.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if ((localObject1 instanceof zzbeq)) {
              paramzzbei = (zzbeq)localObject1;
            } else {
              paramzzbei = new zzbeo(paramzzbei);
            }
          }
        }
        if (paramzzbei != null)
        {
          localObject1 = this.zzb;
          localObject2 = new com/google/android/gms/internal/ads/zzber;
          ((zzber)localObject2).<init>(paramzzbei);
          ((List)localObject1).add(localObject2);
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
    return this.zzb;
  }
  
  public final CharSequence getText()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */