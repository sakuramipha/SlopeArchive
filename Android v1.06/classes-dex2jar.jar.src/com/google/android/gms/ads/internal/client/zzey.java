package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Collections;
import java.util.List;

public final class zzey
  extends zzcn
{
  private zzbkl zza;
  
  public final float zze()
    throws RemoteException
  {
    return 1.0F;
  }
  
  public final String zzf()
  {
    return "";
  }
  
  public final List zzg()
    throws RemoteException
  {
    return Collections.emptyList();
  }
  
  public final void zzh(String paramString)
    throws RemoteException
  {}
  
  public final void zzi() {}
  
  public final void zzj(boolean paramBoolean)
    throws RemoteException
  {}
  
  public final void zzk()
    throws RemoteException
  {
    zzbzt.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
    zzbzm.zza.post(new zzex(this));
  }
  
  public final void zzl(String paramString, IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {}
  
  public final void zzm(zzda paramzzda) {}
  
  public final void zzn(IObjectWrapper paramIObjectWrapper, String paramString)
    throws RemoteException
  {}
  
  public final void zzo(zzbny paramzzbny)
    throws RemoteException
  {}
  
  public final void zzp(boolean paramBoolean)
    throws RemoteException
  {}
  
  public final void zzq(float paramFloat)
    throws RemoteException
  {}
  
  public final void zzr(String paramString)
    throws RemoteException
  {}
  
  public final void zzs(zzbkl paramzzbkl)
    throws RemoteException
  {
    this.zza = paramzzbkl;
  }
  
  public final void zzt(String paramString) {}
  
  public final void zzu(zzff paramzzff)
    throws RemoteException
  {}
  
  public final boolean zzv()
    throws RemoteException
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */