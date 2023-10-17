package com.google.android.gms.internal.ads;

public final class zzghi
  extends zzgow
  implements zzgqh
{
  private static final zzghi zzb;
  private int zzd;
  private zzgno zze = zzgno.zzb;
  private zzgho zzf;
  
  static
  {
    zzghi localzzghi = new zzghi();
    zzb = localzzghi;
    zzgow.zzaU(zzghi.class, localzzghi);
  }
  
  public static zzghh zzc()
  {
    return (zzghh)zzb.zzaA();
  }
  
  public static zzghi zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzghi)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzghh(null);
        }
        return new zzghi();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\013\002\n\003\t", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgho zzf()
  {
    zzgho localzzgho2 = this.zzf;
    zzgho localzzgho1 = localzzgho2;
    if (localzzgho2 == null) {
      localzzgho1 = zzgho.zze();
    }
    return localzzgho1;
  }
  
  public final zzgno zzg()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */