package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbek
  implements NativeCustomTemplateAd.DisplayOpenMeasurement
{
  private final zzbfk zza;
  
  public zzbek(zzbfk paramzzbfk)
  {
    this.zza = paramzzbfk;
    try
    {
      paramzzbfk.zzm();
      return;
    }
    catch (RemoteException paramzzbfk)
    {
      zzbzt.zzh("", paramzzbfk);
    }
  }
  
  public final void setView(View paramView)
  {
    try
    {
      this.zza.zzp(ObjectWrapper.wrap(paramView));
      return;
    }
    catch (RemoteException paramView)
    {
      zzbzt.zzh("", paramView);
    }
  }
  
  public final boolean start()
  {
    try
    {
      boolean bool = this.zza.zzt();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */