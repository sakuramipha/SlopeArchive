package com.google.android.gms.internal.ads;

public final class zzglg
  extends zzgow
  implements zzgqh
{
  private static final zzglg zzb;
  private int zzd;
  private zzgno zze = zzgno.zzb;
  
  static
  {
    zzglg localzzglg = new zzglg();
    zzb = localzzglg;
    zzgow.zzaU(zzglg.class, localzzglg);
  }
  
  public static zzglf zzc()
  {
    return (zzglf)zzb.zzaA();
  }
  
  public static zzglg zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzglg)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzglf(null);
        }
        return new zzglg();
      }
      return zzaR(zzb, "\000\002\000\000\001\003\002\000\000\000\001\013\003\n", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgno zzf()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */