package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

public final class zzdws
{
  private final zzfwc zza;
  private final zzfwc zzb;
  private final zzdxn zzc;
  private final zzgvi zzd;
  
  zzdws(zzfwc paramzzfwc1, zzfwc paramzzfwc2, zzdxn paramzzdxn, zzgvi paramzzgvi)
  {
    this.zza = paramzzfwc1;
    this.zzb = paramzzfwc2;
    this.zzc = paramzzdxn;
    this.zzd = paramzzgvi;
  }
  
  public final zzfwb zzc(zzbto paramzzbto)
  {
    Object localObject = paramzzbto.zzf;
    zzt.zzp();
    if (zzs.zzy((String)localObject)) {
      localObject = zzfvr.zzg(new zzdwc(1, "Ads service proxy force local"));
    } else {
      localObject = zzfvr.zzf(zzfvr.zzk(new zzdwp(this, paramzzbto), this.zza), ExecutionException.class, zzdwq.zza, this.zzb);
    }
    return zzfvr.zzf((zzfwb)localObject, zzdwc.class, new zzdwr(this, paramzzbto, Binder.getCallingUid()), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */