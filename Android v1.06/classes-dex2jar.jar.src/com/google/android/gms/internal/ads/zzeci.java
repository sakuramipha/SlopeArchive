package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

final class zzeci
  implements zzdey
{
  private final zzbzz zza;
  private final zzfwb zzb;
  private final zzezf zzc;
  private final zzcfb zzd;
  private final zzfaa zze;
  private final zzbik zzf;
  private final boolean zzg;
  
  zzeci(zzbzz paramzzbzz, zzfwb paramzzfwb, zzezf paramzzezf, zzcfb paramzzcfb, zzfaa paramzzfaa, boolean paramBoolean, zzbik paramzzbik)
  {
    this.zza = paramzzbzz;
    this.zzb = paramzzfwb;
    this.zzc = paramzzezf;
    this.zzd = paramzzcfb;
    this.zze = paramzzfaa;
    this.zzg = paramBoolean;
    this.zzf = paramzzbik;
  }
  
  public final void zza(boolean paramBoolean, Context paramContext, zzcvv paramzzcvv)
  {
    Object localObject1 = (zzcoo)zzfvr.zzp(this.zzb);
    this.zzd.zzan(true);
    boolean bool1;
    if (this.zzg) {
      bool1 = this.zzf.zze(true);
    } else {
      bool1 = true;
    }
    boolean bool3 = this.zzg;
    boolean bool2;
    if (bool3) {
      bool2 = this.zzf.zzd();
    } else {
      bool2 = false;
    }
    float f;
    if (bool3) {
      f = this.zzf.zza();
    } else {
      f = 0.0F;
    }
    zzj localzzj = new zzj(bool1, true, bool2, f, -1, paramBoolean, this.zzc.zzP, false);
    if (paramzzcvv != null) {
      paramzzcvv.zzf();
    }
    zzt.zzi();
    localObject1 = ((zzcoo)localObject1).zzg();
    zzcfb localzzcfb = this.zzd;
    int i = this.zzc.zzR;
    if (i == -1) {
      for (;;)
      {
        localObject2 = this.zze.zzj;
        if (localObject2 != null)
        {
          i = ((zzw)localObject2).zza;
          if (i == 1)
          {
            i = 7;
            break;
          }
          if (i == 2)
          {
            i = 6;
            break;
          }
        }
        zzbzt.zze("Error setting app open orientation; no targeting orientation available.");
        i = this.zzc.zzR;
      }
    }
    zzbzz localzzbzz = this.zza;
    Object localObject3 = this.zzc;
    Object localObject2 = ((zzezf)localObject3).zzC;
    localObject3 = ((zzezf)localObject3).zzt;
    zzm.zza(paramContext, new AdOverlayInfoParcel(null, (zzo)localObject1, null, localzzcfb, i, localzzbzz, (String)localObject2, localzzj, ((zzezk)localObject3).zzb, ((zzezk)localObject3).zza, this.zze.zzf, paramzzcvv), true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */