package com.google.android.gms.internal.ads;

public final class zzgjb
  extends zzgow
  implements zzgqh
{
  private static final zzgjb zzb;
  private int zzd;
  private zzgno zze = zzgno.zzb;
  
  static
  {
    zzgjb localzzgjb = new zzgjb();
    zzb = localzzgjb;
    zzgow.zzaU(zzgjb.class, localzzgjb);
  }
  
  public static zzgja zzc()
  {
    return (zzgja)zzb.zzaA();
  }
  
  public static zzgjb zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgjb)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgja(null);
        }
        return new zzgjb();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\013\002\n", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgno zzf()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */