package com.google.android.gms.internal.ads;

public final class zzglj
  extends zzgow
  implements zzgqh
{
  private static final zzglj zzb;
  private int zzd;
  
  static
  {
    zzglj localzzglj = new zzglj();
    zzb = localzzglj;
    zzgow.zzaU(zzglj.class, localzzglj);
  }
  
  public static zzglj zzc()
  {
    return zzb;
  }
  
  public static zzglj zzd(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzglj)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgli(null);
        }
        return new zzglj();
      }
      return zzaR(zzb, "\000\001\000\000\001\001\001\000\000\000\001\013", new Object[] { "zzd" });
    }
    return Byte.valueOf((byte)1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */