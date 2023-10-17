package com.google.android.gms.internal.ads;

public class zzgpm
{
  private static final zzgoi zzb = zzgoi.zza;
  protected volatile zzgqg zza;
  private volatile zzgno zzc;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzgpm)) {
      return false;
    }
    zzgpm localzzgpm = (zzgpm)paramObject;
    paramObject = this.zza;
    zzgqg localzzgqg = localzzgpm.zza;
    if ((paramObject == null) && (localzzgqg == null)) {
      return zzb().equals(localzzgpm.zzb());
    }
    if ((paramObject != null) && (localzzgqg != null)) {
      return paramObject.equals(localzzgqg);
    }
    if (paramObject != null)
    {
      localzzgpm.zzc(((zzgqg)paramObject).zzbf());
      return paramObject.equals(localzzgpm.zza);
    }
    zzc(localzzgqg.zzbf());
    return this.zza.equals(localzzgqg);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final int zza()
  {
    if (this.zzc != null) {
      return ((zzgnk)this.zzc).zza.length;
    }
    if (this.zza != null) {
      return this.zza.zzaz();
    }
    return 0;
  }
  
  public final zzgno zzb()
  {
    if (this.zzc != null) {
      return this.zzc;
    }
    try
    {
      if (this.zzc != null)
      {
        localzzgno = this.zzc;
        return localzzgno;
      }
      if (this.zza == null) {
        this.zzc = zzgno.zzb;
      } else {
        this.zzc = this.zza.zzau();
      }
      zzgno localzzgno = this.zzc;
      return localzzgno;
    }
    finally {}
  }
  
  protected final void zzc(zzgqg paramzzgqg)
  {
    if (this.zza != null) {
      return;
    }
    try
    {
      zzgqg localzzgqg = this.zza;
      if (localzzgqg == null)
      {
        try
        {
          this.zza = paramzzgqg;
          this.zzc = zzgno.zzb;
        }
        catch (zzgpi localzzgpi)
        {
          this.zza = paramzzgqg;
          this.zzc = zzgno.zzb;
        }
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */