package com.google.android.gms.internal.ads;

public final class zzaop
  extends zzgow
  implements zzgqh
{
  private static final zzaop zzb;
  private int zzd;
  private zzgno zze = zzgno.zzb;
  private zzgno zzf;
  private zzgno zzg;
  private zzgno zzh;
  
  static
  {
    zzaop localzzaop = new zzaop();
    zzb = localzzaop;
    zzgow.zzaU(zzaop.class, localzzaop);
  }
  
  private zzaop()
  {
    zzgno localzzgno = zzgno.zzb;
    this.zzf = localzzgno;
    this.zzg = localzzgno;
    this.zzh = localzzgno;
  }
  
  public static zzaoo zza()
  {
    return (zzaoo)zzb.zzaA();
  }
  
  public static zzaop zzd(byte[] paramArrayOfByte, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzaop)zzgow.zzaI(zzb, paramArrayOfByte, paramzzgoi);
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
          return new zzaoo(null);
        }
        return new zzaop();
      }
      return zzaR(zzb, "\001\004\000\001\001\004\004\000\000\000\001ည\000\002ည\001\003ည\002\004ည\003", new Object[] { "zzd", "zze", "zzf", "zzg", "zzh" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgno zze()
  {
    return this.zze;
  }
  
  public final zzgno zzf()
  {
    return this.zzf;
  }
  
  public final zzgno zzg()
  {
    return this.zzh;
  }
  
  public final zzgno zzh()
  {
    return this.zzg;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */