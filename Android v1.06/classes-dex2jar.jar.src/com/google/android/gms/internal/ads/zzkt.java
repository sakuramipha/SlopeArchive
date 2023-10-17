package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

final class zzkt
  implements zztv, zzqm
{
  final zzkx zza;
  private final zzkv zzb;
  
  public zzkt(zzkx paramzzkx, zzkv paramzzkv)
  {
    this.zzb = paramzzkv;
  }
  
  private final Pair zzf(int paramInt, zztl paramzztl)
  {
    Object localObject1 = null;
    if (paramzztl != null)
    {
      localObject1 = this.zzb;
      for (paramInt = 0; paramInt < ((zzkv)localObject1).zzc.size(); paramInt++) {
        if (((zztl)((zzkv)localObject1).zzc.get(paramInt)).zzd == paramzztl.zzd)
        {
          Object localObject2 = paramzztl.zza;
          paramzztl = paramzztl.zzc(Pair.create(((zzkv)localObject1).zzb, localObject2));
          break label81;
        }
      }
      paramzztl = null;
      label81:
      if (paramzztl == null) {
        return null;
      }
      localObject1 = paramzztl;
    }
    return Pair.create(Integer.valueOf(this.zzb.zzd), localObject1);
  }
  
  public final void zzaf(int paramInt, zztl paramzztl, zzth paramzzth)
  {
    paramzztl = zzf(0, paramzztl);
    if (paramzztl != null) {
      zzkx.zzc(this.zza).zzh(new zzkr(this, paramzztl, paramzzth));
    }
  }
  
  public final void zzag(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzf(0, paramzztl);
    if (paramzztl != null) {
      zzkx.zzc(this.zza).zzh(new zzkq(this, paramzztl, paramzztc, paramzzth));
    }
  }
  
  public final void zzah(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzf(0, paramzztl);
    if (paramzztl != null) {
      zzkx.zzc(this.zza).zzh(new zzkp(this, paramzztl, paramzztc, paramzzth));
    }
  }
  
  public final void zzai(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean)
  {
    paramzztl = zzf(0, paramzztl);
    if (paramzztl != null) {
      zzkx.zzc(this.zza).zzh(new zzko(this, paramzztl, paramzztc, paramzzth, paramIOException, paramBoolean));
    }
  }
  
  public final void zzaj(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzf(0, paramzztl);
    if (paramzztl != null) {
      zzkx.zzc(this.zza).zzh(new zzks(this, paramzztl, paramzztc, paramzzth));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzkt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */