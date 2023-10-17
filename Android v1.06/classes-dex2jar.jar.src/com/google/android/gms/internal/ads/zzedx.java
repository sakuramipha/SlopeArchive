package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

final class zzedx
  implements zzdey
{
  private final Context zza;
  private final zzbzz zzb;
  private final zzfwb zzc;
  private final zzezf zzd;
  private final zzcfb zze;
  private final zzfaa zzf;
  private final zzbik zzg;
  private final boolean zzh;
  
  zzedx(Context paramContext, zzbzz paramzzbzz, zzfwb paramzzfwb, zzezf paramzzezf, zzcfb paramzzcfb, zzfaa paramzzfaa, boolean paramBoolean, zzbik paramzzbik)
  {
    this.zza = paramContext;
    this.zzb = paramzzbzz;
    this.zzc = paramzzfwb;
    this.zzd = paramzzezf;
    this.zze = paramzzcfb;
    this.zzf = paramzzfaa;
    this.zzg = paramzzbik;
    this.zzh = paramBoolean;
  }
  
  public final void zza(boolean paramBoolean, Context paramContext, zzcvv paramzzcvv)
  {
    Object localObject1 = (zzddq)zzfvr.zzp(this.zzc);
    this.zze.zzan(true);
    boolean bool1;
    if (this.zzh) {
      bool1 = this.zzg.zze(false);
    } else {
      bool1 = false;
    }
    zzt.zzp();
    boolean bool3 = zzs.zzE(this.zza);
    boolean bool4 = this.zzh;
    boolean bool2;
    if (bool4) {
      bool2 = this.zzg.zzd();
    } else {
      bool2 = false;
    }
    float f;
    if (bool4) {
      f = this.zzg.zza();
    } else {
      f = 0.0F;
    }
    zzj localzzj = new zzj(bool1, bool3, bool2, f, -1, paramBoolean, this.zzd.zzP, false);
    if (paramzzcvv != null) {
      paramzzcvv.zzf();
    }
    zzt.zzi();
    localObject1 = ((zzddq)localObject1).zzh();
    zzcfb localzzcfb = this.zze;
    Object localObject2 = this.zzd;
    int i = ((zzezf)localObject2).zzR;
    zzbzz localzzbzz = this.zzb;
    String str = ((zzezf)localObject2).zzC;
    localObject2 = ((zzezf)localObject2).zzt;
    zzm.zza(paramContext, new AdOverlayInfoParcel(null, (zzo)localObject1, null, localzzcfb, i, localzzbzz, str, localzzj, ((zzezk)localObject2).zzb, ((zzezk)localObject2).zza, this.zzf.zzf, paramzzcvv), true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */