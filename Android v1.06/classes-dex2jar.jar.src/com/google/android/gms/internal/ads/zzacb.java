package com.google.android.gms.internal.ads;

final class zzacb
  implements zzabn
{
  final zzace zza;
  private final long zzb;
  
  public zzacb(zzace paramzzace, long paramLong)
  {
    this.zzb = paramLong;
  }
  
  public final long zze()
  {
    return this.zzb;
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject1 = zzace.zze(this.zza)[0].zza(paramLong);
    int i = 1;
    for (;;)
    {
      Object localObject2 = this.zza;
      if (i >= zzace.zze((zzace)localObject2).length) {
        break;
      }
      zzabl localzzabl = zzace.zze(localObject2)[i].zza(paramLong);
      localObject2 = localObject1;
      if (localzzabl.zza.zzc < ((zzabl)localObject1).zza.zzc) {
        localObject2 = localzzabl;
      }
      i++;
      localObject1 = localObject2;
    }
    return (zzabl)localObject1;
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */