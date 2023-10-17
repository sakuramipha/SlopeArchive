package com.google.android.gms.internal.ads;

public final class zzgiy
  extends zzgow
  implements zzgqh
{
  private static final zzgiy zzb;
  private int zzd;
  private int zze;
  
  static
  {
    zzgiy localzzgiy = new zzgiy();
    zzb = localzzgiy;
    zzgow.zzaU(zzgiy.class, localzzgiy);
  }
  
  public static zzgix zzc()
  {
    return (zzgix)zzb.zzaA();
  }
  
  public static zzgiy zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgiy)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgix(null);
        }
        return new zzgiy();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\013\002\013", new Object[] { "zze", "zzd" });
    }
    return Byte.valueOf((byte)1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */