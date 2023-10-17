package com.google.android.gms.internal.ads;

public final class zzlh
{
  public static final zzlh zza;
  public static final zzlh zzb;
  public static final zzlh zzc;
  public static final zzlh zzd;
  public static final zzlh zze;
  public final long zzf;
  public final long zzg;
  
  static
  {
    zzlh localzzlh = new zzlh(0L, 0L);
    zza = localzzlh;
    zzb = new zzlh(Long.MAX_VALUE, Long.MAX_VALUE);
    zzc = new zzlh(Long.MAX_VALUE, 0L);
    zzd = new zzlh(0L, Long.MAX_VALUE);
    zze = localzzlh;
  }
  
  public zzlh(long paramLong1, long paramLong2)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramLong1 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    if (paramLong2 >= 0L) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    this.zzf = paramLong1;
    this.zzg = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzlh)paramObject;
      if ((this.zzf == ((zzlh)paramObject).zzf) && (this.zzg == ((zzlh)paramObject).zzg)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)this.zzf * 31 + (int)this.zzg;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */