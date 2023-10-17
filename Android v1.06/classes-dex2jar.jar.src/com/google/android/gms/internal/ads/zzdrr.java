package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdrr
  implements zzdrb
{
  private final long zza;
  private final zzdrg zzb;
  private final zzeyw zzc;
  
  zzdrr(long paramLong, Context paramContext, zzdrg paramzzdrg, zzcgw paramzzcgw, String paramString)
  {
    this.zza = paramLong;
    this.zzb = paramzzdrg;
    paramzzdrg = paramzzcgw.zzu();
    paramzzdrg.zzb(paramContext);
    paramzzdrg.zza(paramString);
    this.zzc = paramzzdrg.zzc().zza();
  }
  
  public final void zza() {}
  
  public final void zzb(zzl paramzzl)
  {
    try
    {
      zzeyw localzzeyw = this.zzc;
      zzdrp localzzdrp = new com/google/android/gms/internal/ads/zzdrp;
      localzzdrp.<init>(this);
      localzzeyw.zzf(paramzzl, localzzdrp);
      return;
    }
    catch (RemoteException paramzzl)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzl);
    }
  }
  
  public final void zzc()
  {
    try
    {
      zzeyw localzzeyw = this.zzc;
      zzdrq localzzdrq = new com/google/android/gms/internal/ads/zzdrq;
      localzzdrq.<init>(this);
      localzzeyw.zzk(localzzdrq);
      this.zzc.zzm(ObjectWrapper.wrap(null));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */