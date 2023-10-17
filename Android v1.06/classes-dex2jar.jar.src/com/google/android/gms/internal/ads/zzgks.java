package com.google.android.gms.internal.ads;

public final class zzgks
  extends zzgow
  implements zzgqh
{
  private static final zzgks zzb;
  private String zzd = "";
  
  static
  {
    zzgks localzzgks = new zzgks();
    zzb = localzzgks;
    zzgow.zzaU(zzgks.class, localzzgks);
  }
  
  public static zzgks zzc()
  {
    return zzb;
  }
  
  public static zzgks zzd(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgks)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgkr(null);
        }
        return new zzgks();
      }
      return zzaR(zzb, "\000\001\000\000\001\001\001\000\000\000\001Ȉ", new Object[] { "zzd" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zze()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */