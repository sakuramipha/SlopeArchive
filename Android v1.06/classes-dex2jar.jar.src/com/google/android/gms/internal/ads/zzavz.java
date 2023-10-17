package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

public final class zzavz
{
  private zzbu zza;
  private final Context zzb;
  private final String zzc;
  private final zzdx zzd;
  private final int zze;
  private final AppOpenAd.AppOpenAdLoadCallback zzf;
  private final zzbnv zzg = new zzbnv();
  private final zzp zzh;
  
  public zzavz(Context paramContext, String paramString, zzdx paramzzdx, int paramInt, AppOpenAd.AppOpenAdLoadCallback paramAppOpenAdLoadCallback)
  {
    this.zzb = paramContext;
    this.zzc = paramString;
    this.zzd = paramzzdx;
    this.zze = paramInt;
    this.zzf = paramAppOpenAdLoadCallback;
    this.zzh = zzp.zza;
  }
  
  public final void zza()
  {
    try
    {
      Object localObject = zzq.zzb();
      localObject = zzay.zza().zzd(this.zzb, (zzq)localObject, this.zzc, this.zzg);
      this.zza = ((zzbu)localObject);
      if (localObject != null)
      {
        if (this.zze != 3)
        {
          localObject = new com/google/android/gms/ads/internal/client/zzw;
          ((zzw)localObject).<init>(this.zze);
          this.zza.zzI((zzw)localObject);
        }
        localObject = this.zza;
        zzavm localzzavm = new com/google/android/gms/internal/ads/zzavm;
        localzzavm.<init>(this.zzf, this.zzc);
        ((zzbu)localObject).zzH(localzzavm);
        this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */