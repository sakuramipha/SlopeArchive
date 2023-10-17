package com.google.android.gms.internal.ads;

final class zzadc
  implements zzabn
{
  final zzadd zzb;
  
  zzadc(zzadd paramzzadd, zzabn paramzzabn) {}
  
  public final long zze()
  {
    return this.zza.zze();
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject = this.zza.zzg(paramLong);
    zzabo localzzabo = ((zzabl)localObject).zza;
    localzzabo = new zzabo(localzzabo.zzb, localzzabo.zzc + zzadd.zza(this.zzb));
    localObject = ((zzabl)localObject).zzb;
    return new zzabl(localzzabo, new zzabo(((zzabo)localObject).zzb, ((zzabo)localObject).zzc + zzadd.zza(this.zzb)));
  }
  
  public final boolean zzh()
  {
    return this.zza.zzh();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */