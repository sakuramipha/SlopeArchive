package com.google.android.gms.internal.ads;

public final class zzgkg
  extends zzgow
  implements zzgqh
{
  private static final zzgkg zzb;
  private zzgju zzd;
  private int zze;
  private int zzf;
  private int zzg;
  
  static
  {
    zzgkg localzzgkg = new zzgkg();
    zzb = localzzgkg;
    zzgow.zzaU(zzgkg.class, localzzgkg);
  }
  
  public static zzgkf zzd()
  {
    return (zzgkf)zzb.zzaA();
  }
  
  public final int zza()
  {
    return this.zzf;
  }
  
  protected final Object zzb(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
              return null;
            }
            return zzb;
          }
          return new zzgkf(null);
        }
        return new zzgkg();
      }
      return zzaR(zzb, "\000\004\000\000\001\004\004\000\000\000\001\t\002\f\003\013\004\f", new Object[] { "zzd", "zze", "zzf", "zzg" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgju zzc()
  {
    zzgju localzzgju2 = this.zzd;
    zzgju localzzgju1 = localzzgju2;
    if (localzzgju2 == null) {
      localzzgju1 = zzgju.zze();
    }
    return localzzgju1;
  }
  
  public final zzgla zzf()
  {
    zzgla localzzgla2 = zzgla.zzb(this.zzg);
    zzgla localzzgla1 = localzzgla2;
    if (localzzgla2 == null) {
      localzzgla1 = zzgla.zzf;
    }
    return localzzgla1;
  }
  
  public final boolean zzj()
  {
    return this.zzd != null;
  }
  
  public final int zzk()
  {
    int j = this.zze;
    int i = 3;
    if (j != 0)
    {
      if (j != 1) {
        if (j != 2)
        {
          if (j != 3) {
            i = 0;
          } else {
            i = 5;
          }
        }
        else {
          i = 4;
        }
      }
    }
    else {
      i = 2;
    }
    if (i == 0) {
      return 1;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */