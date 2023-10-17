package com.google.android.gms.internal.ads;

public final class zzgkp
  extends zzgow
  implements zzgqh
{
  private static final zzgkp zzb;
  private int zzd;
  private zzgks zze;
  
  static
  {
    zzgkp localzzgkp = new zzgkp();
    zzb = localzzgkp;
    zzgow.zzaU(zzgkp.class, localzzgkp);
  }
  
  public static zzgko zzc()
  {
    return (zzgko)zzb.zzaA();
  }
  
  public static zzgkp zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgkp)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgko(null);
        }
        return new zzgkp();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgks zzf()
  {
    zzgks localzzgks2 = this.zze;
    zzgks localzzgks1 = localzzgks2;
    if (localzzgks2 == null) {
      localzzgks1 = zzgks.zzc();
    }
    return localzzgks1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */