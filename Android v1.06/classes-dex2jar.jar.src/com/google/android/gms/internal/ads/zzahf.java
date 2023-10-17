package com.google.android.gms.internal.ads;

final class zzahf
  implements zzabn
{
  final zzahg zza;
  
  public final long zze()
  {
    zzahg localzzahg = this.zza;
    return zzahg.zzf(localzzahg).zzf(zzahg.zzc(localzzahg));
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject = this.zza;
    long l2 = zzahg.zzf((zzahg)localObject).zzg(paramLong);
    long l1 = zzahg.zzb((zzahg)localObject);
    l2 = l2 * (zzahg.zza((zzahg)localObject) - zzahg.zzb((zzahg)localObject)) / zzahg.zzc((zzahg)localObject);
    localObject = new zzabo(paramLong, Math.max(zzahg.zzb((zzahg)localObject), Math.min(l1 + l2 - 30000L, zzahg.zza((zzahg)localObject) - 1L)));
    return new zzabl((zzabo)localObject, (zzabo)localObject);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */