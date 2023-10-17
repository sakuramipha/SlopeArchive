package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzss
  implements zztv, zzqm
{
  final zzsu zza;
  private final Object zzb;
  private zztu zzc;
  private zzql zzd;
  
  public zzss(zzsu paramzzsu, Object paramObject)
  {
    this.zzc = paramzzsu.zze(null);
    this.zzd = paramzzsu.zzc(null);
    this.zzb = paramObject;
  }
  
  private final zzth zzf(zzth paramzzth)
  {
    zzsu localzzsu = this.zza;
    Object localObject = this.zzb;
    long l2 = paramzzth.zzc;
    localzzsu.zzw(localObject, l2);
    localzzsu = this.zza;
    localObject = this.zzb;
    long l1 = paramzzth.zzd;
    localzzsu.zzw(localObject, l1);
    if ((l2 == paramzzth.zzc) && (l1 == paramzzth.zzd)) {
      return paramzzth;
    }
    return new zzth(1, paramzzth.zza, paramzzth.zzb, 0, null, l2, l1);
  }
  
  private final boolean zzg(int paramInt, zztl paramzztl)
  {
    if (paramzztl != null)
    {
      paramzztl = this.zza.zzx(this.zzb, paramzztl);
      if (paramzztl == null) {
        return false;
      }
    }
    else
    {
      paramzztl = null;
    }
    this.zza.zzv(this.zzb, 0);
    Object localObject = this.zzc;
    paramInt = ((zztu)localObject).zza;
    if (!zzfn.zzB(((zztu)localObject).zzb, paramzztl)) {
      this.zzc = this.zza.zzf(0, paramzztl);
    }
    localObject = this.zzd;
    paramInt = ((zzql)localObject).zza;
    if (!zzfn.zzB(((zzql)localObject).zzb, paramzztl)) {
      this.zzd = this.zza.zzd(0, paramzztl);
    }
    return true;
  }
  
  public final void zzaf(int paramInt, zztl paramzztl, zzth paramzzth)
  {
    if (zzg(0, paramzztl)) {
      this.zzc.zzc(zzf(paramzzth));
    }
  }
  
  public final void zzag(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    if (zzg(0, paramzztl)) {
      this.zzc.zzd(paramzztc, zzf(paramzzth));
    }
  }
  
  public final void zzah(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    if (zzg(0, paramzztl)) {
      this.zzc.zze(paramzztc, zzf(paramzzth));
    }
  }
  
  public final void zzai(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean)
  {
    if (zzg(0, paramzztl)) {
      this.zzc.zzf(paramzztc, zzf(paramzzth), paramIOException, paramBoolean);
    }
  }
  
  public final void zzaj(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    if (zzg(0, paramzztl)) {
      this.zzc.zzg(paramzztc, zzf(paramzzth));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */