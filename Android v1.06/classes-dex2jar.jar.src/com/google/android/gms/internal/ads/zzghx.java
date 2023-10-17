package com.google.android.gms.internal.ads;

public final class zzghx
  extends zzgow
  implements zzgqh
{
  private static final zzghx zzb;
  private int zzd;
  private zzgid zze;
  private zzgno zzf = zzgno.zzb;
  
  static
  {
    zzghx localzzghx = new zzghx();
    zzb = localzzghx;
    zzgow.zzaU(zzghx.class, localzzghx);
  }
  
  public static zzghw zzc()
  {
    return (zzghw)zzb.zzaA();
  }
  
  public static zzghx zze()
  {
    return zzb;
  }
  
  public static zzghx zzf(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzghx)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
  }
  
  public final int zza()
  {
    return this.zzd;
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
          return new zzghw(null);
        }
        return new zzghx();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgid zzg()
  {
    zzgid localzzgid2 = this.zze;
    zzgid localzzgid1 = localzzgid2;
    if (localzzgid2 == null) {
      localzzgid1 = zzgid.zze();
    }
    return localzzgid1;
  }
  
  public final zzgno zzh()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */