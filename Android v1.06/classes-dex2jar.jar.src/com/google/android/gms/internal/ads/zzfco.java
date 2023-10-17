package com.google.android.gms.internal.ads;

public final class zzfco
{
  private final zzfch zza;
  private final zzfwb zzb;
  private boolean zzc = false;
  private boolean zzd = false;
  
  public zzfco(zzfbm paramzzfbm, zzfcg paramzzfcg, zzfch paramzzfch)
  {
    this.zza = paramzzfch;
    this.zzb = zzfvr.zzf(zzfvr.zzm(paramzzfcg.zza(paramzzfch), new zzfcm(this, paramzzfcg, paramzzfbm, paramzzfch), paramzzfch.zzb()), Exception.class, new zzfcn(this, paramzzfcg), paramzzfch.zzb());
  }
  
  public final zzfwb zza(zzfch paramzzfch)
  {
    try
    {
      if ((!this.zzd) && (!this.zzc))
      {
        if ((this.zza.zza() != null) && (paramzzfch.zza() != null) && (this.zza.zza().equals(paramzzfch.zza())))
        {
          this.zzc = true;
          paramzzfch = this.zzb;
          return paramzzfch;
        }
        return null;
      }
      return null;
    }
    finally {}
  }
  
  public final void zzd(zzfvn paramzzfvn)
  {
    try
    {
      zzfvr.zzq(zzfvr.zzm(this.zzb, zzfcl.zza, this.zza.zzb()), paramzzfvn, this.zza.zzb());
      return;
    }
    finally
    {
      paramzzfvn = finally;
      throw paramzzfvn;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */