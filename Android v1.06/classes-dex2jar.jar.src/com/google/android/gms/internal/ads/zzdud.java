package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

public final class zzdud
{
  private final zzfwc zza;
  private final zzfwc zzb;
  private final zzdvl zzc;
  private final zzgvi zzd;
  
  public zzdud(zzfwc paramzzfwc1, zzfwc paramzzfwc2, zzdvl paramzzdvl, zzgvi paramzzgvi)
  {
    this.zza = paramzzfwc1;
    this.zzb = paramzzfwc2;
    this.zzc = paramzzdvl;
    this.zzd = paramzzgvi;
  }
  
  public final zzfwb zzb(zzbug paramzzbug)
  {
    Object localObject = paramzzbug.zzd;
    zzt.zzp();
    if (zzs.zzy((String)localObject)) {
      localObject = zzfvr.zzg(new zzdwc(1));
    } else {
      localObject = zzfvr.zzf(this.zza.zzb(new zzdua(this, paramzzbug)), ExecutionException.class, zzdub.zza, this.zzb);
    }
    return zzfvr.zzf((zzfwb)localObject, zzdwc.class, new zzduc(this, paramzzbug, Binder.getCallingUid()), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */