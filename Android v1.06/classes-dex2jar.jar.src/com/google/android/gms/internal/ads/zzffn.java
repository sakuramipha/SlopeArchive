package com.google.android.gms.internal.ads;

final class zzffn
  implements zzfvn
{
  final zzffq zza;
  
  zzffn(zzffq paramzzffq, zzfff paramzzfff, boolean paramBoolean) {}
  
  public final void zza(Throwable paramThrowable)
  {
    zzfff localzzfff = this.zzb;
    if (localzzfff.zzj())
    {
      zzffq localzzffq = this.zza;
      localzzfff.zzg(paramThrowable);
      localzzfff.zzf(false);
      localzzffq.zza(localzzfff);
      if (this.zzc) {
        this.zza.zzg();
      }
    }
  }
  
  public final void zzb(Object paramObject)
  {
    zzffq localzzffq = this.zza;
    paramObject = this.zzb;
    ((zzfff)paramObject).zzf(true);
    localzzffq.zza((zzfff)paramObject);
    if (this.zzc) {
      this.zza.zzg();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzffn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */