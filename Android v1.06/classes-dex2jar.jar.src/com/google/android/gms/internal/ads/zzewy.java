package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzewy
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  private final zzgwb zzc;
  
  public zzewy(zzgwb paramzzgwb1, zzgwb paramzzgwb2, zzgwb paramzzgwb3)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
    this.zzc = paramzzgwb3;
  }
  
  public final zzeww zza()
  {
    Context localContext = (Context)this.zza.zzb();
    zzfbi localzzfbi = (zzfbi)this.zzb.zzb();
    zzfca localzzfca = (zzfca)this.zzc.zzb();
    Object localObject = zzbbk.zzgc;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      localObject = zzt.zzo().zzh().zzh();
    } else {
      localObject = zzt.zzo().zzh().zzi();
    }
    int j = 0;
    int i = j;
    if (localObject != null)
    {
      i = j;
      if (((zzbyw)localObject).zzh()) {
        i = 1;
      }
    }
    localObject = zzbbk.zzgs;
    if (((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue() > 0)
    {
      localObject = zzbbk.zzgb;
      if ((!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) || (i != 0))
      {
        localObject = new zzevx();
        localObject = localzzfca.zza(zzfbq.zzc, localContext, localzzfbi, new zzewa((zzeww)localObject));
        return new zzewc(new zzewm(new zzewl()), new zzewi(((zzfbz)localObject).zza, zzcag.zza), ((zzfbz)localObject).zzb, ((zzfbz)localObject).zza.zza().zzf, zzcag.zza);
      }
    }
    localObject = new zzewl();
    return (zzeww)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzewy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */