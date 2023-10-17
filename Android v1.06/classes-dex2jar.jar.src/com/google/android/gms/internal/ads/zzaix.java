package com.google.android.gms.internal.ads;

public final class zzaix
  implements zzajg
{
  private zzam zza;
  private zzfl zzb;
  private zzabr zzc;
  
  public zzaix(String paramString)
  {
    zzak localzzak = new zzak();
    localzzak.zzS(paramString);
    this.zza = localzzak.zzY();
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzb);
    int i = zzfn.zza;
    long l2 = this.zzb.zzd();
    long l1 = this.zzb.zze();
    if ((l2 != -9223372036854775807L) && (l1 != -9223372036854775807L))
    {
      Object localObject = this.zza;
      if (l1 != ((zzam)localObject).zzq)
      {
        localObject = ((zzam)localObject).zzb();
        ((zzak)localObject).zzW(l1);
        localObject = ((zzak)localObject).zzY();
        this.zza = ((zzam)localObject);
        this.zzc.zzk((zzam)localObject);
      }
      i = paramzzfd.zza();
      this.zzc.zzq(paramzzfd, i);
      this.zzc.zzs(l2, 1, i, 0, null);
    }
  }
  
  public final void zzb(zzfl paramzzfl, zzaar paramzzaar, zzajt paramzzajt)
  {
    this.zzb = paramzzfl;
    paramzzajt.zzc();
    paramzzfl = paramzzaar.zzv(paramzzajt.zza(), 5);
    this.zzc = paramzzfl;
    paramzzfl.zzk(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */