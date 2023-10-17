package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

final class zzegk
  implements zzdey
{
  private final Context zza;
  private final zzdnk zzb;
  private final zzfaa zzc;
  private final zzbzz zzd;
  private final zzezf zze;
  private final zzfwb zzf;
  private final zzcfb zzg;
  private final zzbik zzh;
  private final boolean zzi;
  
  zzegk(Context paramContext, zzdnk paramzzdnk, zzfaa paramzzfaa, zzbzz paramzzbzz, zzezf paramzzezf, zzfwb paramzzfwb, zzcfb paramzzcfb, zzbik paramzzbik, boolean paramBoolean)
  {
    this.zza = paramContext;
    this.zzb = paramzzdnk;
    this.zzc = paramzzfaa;
    this.zzd = paramzzbzz;
    this.zze = paramzzezf;
    this.zzf = paramzzfwb;
    this.zzg = paramzzcfb;
    this.zzh = paramzzbik;
    this.zzi = paramBoolean;
  }
  
  public final void zza(boolean paramBoolean, Context paramContext, zzcvv paramzzcvv)
  {
    Object localObject3 = (zzdmp)zzfvr.zzp(this.zzf);
    try
    {
      Object localObject4 = this.zze;
      Object localObject1;
      if (!this.zzg.zzaB()) {
        localObject1 = this.zzg;
      }
      for (;;)
      {
        break;
        localObject1 = zzbbk.zzaJ;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          localObject1 = this.zzg;
        }
        else
        {
          localObject2 = this.zzb.zza(this.zzc.zze, null, null);
          zzbiy.zzb((zzcfb)localObject2, ((zzdmp)localObject3).zzg());
          localObject5 = new com/google/android/gms/internal/ads/zzdno;
          ((zzdno)localObject5).<init>();
          ((zzdno)localObject5).zza(this.zza, (View)localObject2);
          localObject6 = ((zzdmp)localObject3).zzl();
          if (this.zzi) {
            localObject1 = this.zzh;
          } else {
            localObject1 = null;
          }
          ((zzdnj)localObject6).zzi((zzcfb)localObject2, true, (zzbik)localObject1);
          localObject1 = ((zzcfb)localObject2).zzN();
          localObject6 = new com/google/android/gms/internal/ads/zzegi;
          ((zzegi)localObject6).<init>((zzdno)localObject5, (zzcfb)localObject2);
          ((zzcgo)localObject1).zzA((zzcgm)localObject6);
          localObject5 = ((zzcfb)localObject2).zzN();
          localObject1 = new com/google/android/gms/internal/ads/zzegj;
          ((zzegj)localObject1).<init>((zzcfb)localObject2);
          ((zzcgo)localObject5).zzG((zzcgn)localObject1);
          localObject1 = ((zzezf)localObject4).zzt;
          ((zzcfb)localObject2).zzab(((zzezk)localObject1).zzb, ((zzezk)localObject1).zza, null);
          localObject1 = localObject2;
        }
      }
      ((zzcfb)localObject1).zzan(true);
      boolean bool1;
      if (this.zzi) {
        bool1 = this.zzh.zze(false);
      } else {
        bool1 = false;
      }
      zzt.zzp();
      boolean bool3 = zzs.zzE(this.zza);
      boolean bool4 = this.zzi;
      boolean bool2;
      if (bool4) {
        bool2 = this.zzh.zzd();
      } else {
        bool2 = false;
      }
      float f;
      if (bool4) {
        f = this.zzh.zza();
      } else {
        f = 0.0F;
      }
      Object localObject2 = this.zze;
      localObject2 = new zzj(bool1, bool3, bool2, f, -1, paramBoolean, ((zzezf)localObject2).zzP, ((zzezf)localObject2).zzQ);
      if (paramzzcvv != null) {
        paramzzcvv.zzf();
      }
      zzt.zzi();
      localObject4 = ((zzdmp)localObject3).zzh();
      Object localObject6 = this.zze;
      int i = ((zzezf)localObject6).zzR;
      localObject3 = this.zzd;
      Object localObject5 = ((zzezf)localObject6).zzC;
      localObject6 = ((zzezf)localObject6).zzt;
      zzm.zza(paramContext, new AdOverlayInfoParcel(null, (zzo)localObject4, null, (zzcfb)localObject1, i, (zzbzz)localObject3, (String)localObject5, (zzj)localObject2, ((zzezk)localObject6).zzb, ((zzezk)localObject6).zza, this.zzc.zzf, paramzzcvv), true);
      return;
    }
    catch (zzcfm paramContext)
    {
      zzbzt.zzh("", paramContext);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */