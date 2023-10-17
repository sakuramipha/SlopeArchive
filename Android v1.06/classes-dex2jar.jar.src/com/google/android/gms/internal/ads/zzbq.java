package com.google.android.gms.internal.ads;

public final class zzbq
{
  public static final zzbq zza = new zzat().zzc();
  public static final zzn zzb = zzar.zza;
  private static final String zzk = Integer.toString(0, 36);
  private static final String zzl = Integer.toString(1, 36);
  private static final String zzm = Integer.toString(2, 36);
  private static final String zzn = Integer.toString(3, 36);
  private static final String zzo = Integer.toString(4, 36);
  public final String zzc;
  public final zzbi zzd;
  @Deprecated
  public final zzbk zze;
  public final zzbg zzf;
  public final zzbw zzg;
  public final zzax zzh;
  @Deprecated
  public final zzaz zzi;
  public final zzbn zzj;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzbq)) {
      return false;
    }
    paramObject = (zzbq)paramObject;
    return (zzfn.zzB(this.zzc, ((zzbq)paramObject).zzc)) && (this.zzh.equals(((zzbq)paramObject).zzh)) && (zzfn.zzB(this.zzd, ((zzbq)paramObject).zzd)) && (zzfn.zzB(this.zzf, ((zzbq)paramObject).zzf)) && (zzfn.zzB(this.zzg, ((zzbq)paramObject).zzg)) && (zzfn.zzB(this.zzj, ((zzbq)paramObject).zzj));
  }
  
  public final int hashCode()
  {
    int j = this.zzc.hashCode();
    zzbi localzzbi = this.zzd;
    int i;
    if (localzzbi != null) {
      i = localzzbi.hashCode();
    } else {
      i = 0;
    }
    return ((((j * 31 + i) * 31 + this.zzf.hashCode()) * 31 + this.zzh.hashCode()) * 31 + this.zzg.hashCode()) * 31;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */