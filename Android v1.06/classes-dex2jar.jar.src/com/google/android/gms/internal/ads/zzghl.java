package com.google.android.gms.internal.ads;

public final class zzghl
  extends zzgow
  implements zzgqh
{
  private static final zzghl zzb;
  private int zzd;
  private zzgho zze;
  
  static
  {
    zzghl localzzghl = new zzghl();
    zzb = localzzghl;
    zzgow.zzaU(zzghl.class, localzzghl);
  }
  
  public static zzghk zzc()
  {
    return (zzghk)zzb.zzaA();
  }
  
  public static zzghl zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzghl)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzghk(null);
        }
        return new zzghl();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgho zzf()
  {
    zzgho localzzgho2 = this.zze;
    zzgho localzzgho1 = localzzgho2;
    if (localzzgho2 == null) {
      localzzgho1 = zzgho.zze();
    }
    return localzzgho1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */