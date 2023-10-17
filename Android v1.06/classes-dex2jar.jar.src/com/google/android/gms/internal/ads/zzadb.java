package com.google.android.gms.internal.ads;

final class zzadb
  extends zzabc
{
  private final long zza;
  
  public zzadb(zzaap paramzzaap, long paramLong)
  {
    super(paramzzaap);
    boolean bool;
    if (paramzzaap.zzf() >= paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    this.zza = paramLong;
  }
  
  public final long zzd()
  {
    return super.zzd() - this.zza;
  }
  
  public final long zze()
  {
    return super.zze() - this.zza;
  }
  
  public final long zzf()
  {
    return super.zzf() - this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */