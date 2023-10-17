package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdfd
  implements zzcvi, zzdcf
{
  private final zzbxg zza;
  private final Context zzb;
  private final zzbxy zzc;
  private final View zzd;
  private String zze;
  private final zzaxh zzf;
  
  public zzdfd(zzbxg paramzzbxg, Context paramContext, zzbxy paramzzbxy, View paramView, zzaxh paramzzaxh)
  {
    this.zza = paramzzbxg;
    this.zzb = paramContext;
    this.zzc = paramzzbxy;
    this.zzd = paramView;
    this.zzf = paramzzaxh;
  }
  
  public final void zzbr() {}
  
  public final void zzf() {}
  
  public final void zzg()
  {
    if (this.zzf == zzaxh.zzk) {
      return;
    }
    String str = this.zzc.zzd(this.zzb);
    this.zze = str;
    Object localObject = this.zzf;
    str = String.valueOf(str);
    if (localObject == zzaxh.zzh) {
      localObject = "/Rewarded";
    } else {
      localObject = "/Interstitial";
    }
    this.zze = str.concat((String)localObject);
  }
  
  public final void zzj()
  {
    this.zza.zzb(false);
  }
  
  public final void zzm() {}
  
  public final void zzo()
  {
    View localView = this.zzd;
    if ((localView != null) && (this.zze != null)) {
      this.zzc.zzs(localView.getContext(), this.zze);
    }
    this.zza.zzb(true);
  }
  
  @ParametersAreNonnullByDefault
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2)
  {
    if (this.zzc.zzu(this.zzb)) {
      try
      {
        paramString1 = this.zzc;
        paramString2 = this.zzb;
        paramString1.zzo(paramString2, paramString1.zza(paramString2), this.zza.zza(), paramzzbuw.zzc(), paramzzbuw.zzb());
        return;
      }
      catch (RemoteException paramzzbuw)
      {
        zzbzt.zzk("Remote Exception to get reward item.", paramzzbuw);
      }
    }
  }
  
  public final void zzq() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */