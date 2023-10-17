package com.google.android.gms.internal.measurement;

public class zzkp
{
  private static final zzjo zzb = ;
  protected volatile zzlj zza;
  private volatile zzjb zzc;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzkp)) {
      return false;
    }
    zzkp localzzkp = (zzkp)paramObject;
    zzlj localzzlj = this.zza;
    paramObject = localzzkp.zza;
    if ((localzzlj == null) && (paramObject == null)) {
      return zzb().equals(localzzkp.zzb());
    }
    if ((localzzlj != null) && (paramObject != null)) {
      return localzzlj.equals(paramObject);
    }
    if (localzzlj != null)
    {
      localzzkp.zzc(localzzlj.zzbR());
      return localzzlj.equals(localzzkp.zza);
    }
    zzc(((zzlj)paramObject).zzbR());
    return this.zza.equals(paramObject);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final int zza()
  {
    if (this.zzc != null) {
      return ((zziy)this.zzc).zza.length;
    }
    if (this.zza != null) {
      return this.zza.zzbz();
    }
    return 0;
  }
  
  public final zzjb zzb()
  {
    if (this.zzc != null) {
      return this.zzc;
    }
    try
    {
      if (this.zzc != null)
      {
        localzzjb = this.zzc;
        return localzzjb;
      }
      if (this.zza == null) {
        this.zzc = zzjb.zzb;
      } else {
        this.zzc = this.zza.zzbv();
      }
      zzjb localzzjb = this.zzc;
      return localzzjb;
    }
    finally {}
  }
  
  protected final void zzc(zzlj paramzzlj)
  {
    if (this.zza != null) {
      return;
    }
    try
    {
      zzlj localzzlj = this.zza;
      if (localzzlj == null)
      {
        try
        {
          this.zza = paramzzlj;
          this.zzc = zzjb.zzb;
        }
        catch (zzkm localzzkm)
        {
          this.zza = paramzzlj;
          this.zzc = zzjb.zzb;
        }
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */