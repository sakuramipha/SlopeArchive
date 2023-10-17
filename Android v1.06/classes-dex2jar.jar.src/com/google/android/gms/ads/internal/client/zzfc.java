package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzfc
  extends zzbvo
{
  private static void zzr(zzbvw paramzzbvw)
  {
    zzbzt.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    zzbzm.zza.post(new zzfb(paramzzbvw));
  }
  
  public final Bundle zzb()
    throws RemoteException
  {
    return new Bundle();
  }
  
  public final zzdn zzc()
  {
    return null;
  }
  
  public final zzbvm zzd()
  {
    return null;
  }
  
  public final String zze()
    throws RemoteException
  {
    return "";
  }
  
  public final void zzf(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    zzr(paramzzbvw);
  }
  
  public final void zzg(zzl paramzzl, zzbvw paramzzbvw)
    throws RemoteException
  {
    zzr(paramzzbvw);
  }
  
  public final void zzh(boolean paramBoolean) {}
  
  public final void zzi(zzdd paramzzdd)
    throws RemoteException
  {}
  
  public final void zzj(zzdg paramzzdg) {}
  
  public final void zzk(zzbvs paramzzbvs)
    throws RemoteException
  {}
  
  public final void zzl(zzbwd paramzzbwd) {}
  
  public final void zzm(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {}
  
  public final void zzn(IObjectWrapper paramIObjectWrapper, boolean paramBoolean) {}
  
  public final boolean zzo()
    throws RemoteException
  {
    return false;
  }
  
  public final void zzp(zzbvx paramzzbvx)
    throws RemoteException
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */