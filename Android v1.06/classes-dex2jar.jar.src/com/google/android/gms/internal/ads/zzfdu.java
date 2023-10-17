package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzfdu
{
  final zzfdv zza;
  private final Object zzb;
  private final String zzc;
  private final zzfwb zzd;
  private final List zze;
  private final zzfwb zzf;
  
  private zzfdu(zzfdv paramzzfdv, Object paramObject, String paramString, zzfwb paramzzfwb1, List paramList, zzfwb paramzzfwb2)
  {
    this.zzb = paramObject;
    this.zzc = paramString;
    this.zzd = paramzzfwb1;
    this.zze = paramList;
    this.zzf = paramzzfwb2;
  }
  
  public final zzfdi zza()
  {
    Object localObject2 = this.zzb;
    String str = this.zzc;
    Object localObject1 = str;
    if (str == null) {
      localObject1 = this.zza.zzf(localObject2);
    }
    localObject1 = new zzfdi(localObject2, (String)localObject1, this.zzf);
    zzfdv.zzc(this.zza).zza((zzfdi)localObject1);
    this.zzd.zzc(new zzfdo(this, (zzfdi)localObject1), zzcag.zzf);
    zzfvr.zzq((zzfwb)localObject1, new zzfds(this, (zzfdi)localObject1), zzcag.zzf);
    return (zzfdi)localObject1;
  }
  
  public final zzfdu zzb(Object paramObject)
  {
    zzfdi localzzfdi = zza();
    return this.zza.zzb(paramObject, localzzfdi);
  }
  
  public final zzfdu zzc(Class paramClass, zzfuy paramzzfuy)
  {
    zzfdv localzzfdv = this.zza;
    return new zzfdu(localzzfdv, this.zzb, this.zzc, this.zzd, this.zze, zzfvr.zzf(this.zzf, paramClass, paramzzfuy, zzfdv.zze(localzzfdv)));
  }
  
  public final zzfdu zzd(zzfwb paramzzfwb)
  {
    return zzg(new zzfdp(paramzzfwb), zzcag.zzf);
  }
  
  public final zzfdu zze(zzfdg paramzzfdg)
  {
    return zzf(new zzfdr(paramzzfdg));
  }
  
  public final zzfdu zzf(zzfuy paramzzfuy)
  {
    return zzg(paramzzfuy, zzfdv.zze(this.zza));
  }
  
  public final zzfdu zzg(zzfuy paramzzfuy, Executor paramExecutor)
  {
    return new zzfdu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfvr.zzm(this.zzf, paramzzfuy, paramExecutor));
  }
  
  public final zzfdu zzh(String paramString)
  {
    return new zzfdu(this.zza, this.zzb, paramString, this.zzd, this.zze, this.zzf);
  }
  
  public final zzfdu zzi(long paramLong, TimeUnit paramTimeUnit)
  {
    zzfdv localzzfdv = this.zza;
    return new zzfdu(localzzfdv, this.zzb, this.zzc, this.zzd, this.zze, zzfvr.zzn(this.zzf, paramLong, paramTimeUnit, zzfdv.zzg(localzzfdv)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */