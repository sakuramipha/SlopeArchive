package com.google.android.gms.internal.ads;

public final class zzgjj
  extends zzgow
  implements zzgqh
{
  private static final zzgjj zzb;
  private int zzd;
  private zzgjp zze;
  private zzgno zzf = zzgno.zzb;
  
  static
  {
    zzgjj localzzgjj = new zzgjj();
    zzb = localzzgjj;
    zzgow.zzaU(zzgjj.class, localzzgjj);
  }
  
  public static zzgji zzc()
  {
    return (zzgji)zzb.zzaA();
  }
  
  public static zzgjj zze()
  {
    return zzb;
  }
  
  public static zzgjj zzf(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgjj)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgji(null);
        }
        return new zzgjj();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgjp zzg()
  {
    zzgjp localzzgjp2 = this.zze;
    zzgjp localzzgjp1 = localzzgjp2;
    if (localzzgjp2 == null) {
      localzzgjp1 = zzgjp.zze();
    }
    return localzzgjp1;
  }
  
  public final zzgno zzh()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */