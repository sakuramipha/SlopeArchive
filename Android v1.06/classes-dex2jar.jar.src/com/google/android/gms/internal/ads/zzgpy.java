package com.google.android.gms.internal.ads;

final class zzgpy
  implements zzgra
{
  private static final zzgqe zza = new zzgpw();
  private final zzgqe zzb;
  
  public zzgpy()
  {
    Object localObject1 = zzgpg.zzd;
    this.zzb = ((zzgqe)localObject2);
  }
  
  private static boolean zzb(zzgqd paramzzgqd)
  {
    return paramzzgqd.zzc() == 1;
  }
  
  public final zzgqz zza(Class paramClass)
  {
    zzgrb.zzD(paramClass);
    zzgqd localzzgqd = this.zzb.zzb(paramClass);
    if (localzzgqd.zzb())
    {
      if (zzgow.class.isAssignableFrom(paramClass)) {
        return zzgqk.zzc(zzgrb.zzz(), zzgol.zzb(), localzzgqd.zza());
      }
      return zzgqk.zzc(zzgrb.zzy(), zzgol.zza(), localzzgqd.zza());
    }
    if (zzgow.class.isAssignableFrom(paramClass))
    {
      if (zzb(localzzgqd)) {
        paramClass = zzgqj.zzl(paramClass, localzzgqd, zzgqm.zzb(), zzgpu.zze(), zzgrb.zzz(), zzgol.zzb(), zzgqc.zzb());
      } else {
        paramClass = zzgqj.zzl(paramClass, localzzgqd, zzgqm.zzb(), zzgpu.zze(), zzgrb.zzz(), null, zzgqc.zzb());
      }
    }
    else if (zzb(localzzgqd)) {
      paramClass = zzgqj.zzl(paramClass, localzzgqd, zzgqm.zza(), zzgpu.zzd(), zzgrb.zzy(), zzgol.zza(), zzgqc.zza());
    } else {
      paramClass = zzgqj.zzl(paramClass, localzzgqd, zzgqm.zza(), zzgpu.zzd(), zzgrb.zzy(), null, zzgqc.zza());
    }
    return paramClass;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */