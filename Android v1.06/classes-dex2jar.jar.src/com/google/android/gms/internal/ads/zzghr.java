package com.google.android.gms.internal.ads;

public final class zzghr
  extends zzgow
  implements zzgqh
{
  private static final zzghr zzb;
  private int zzd;
  private zzghx zze;
  private zzgjj zzf;
  
  static
  {
    zzghr localzzghr = new zzghr();
    zzb = localzzghr;
    zzgow.zzaU(zzghr.class, localzzghr);
  }
  
  public static zzghq zzc()
  {
    return (zzghq)zzb.zzaA();
  }
  
  public static zzghr zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzghr)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzghq(null);
        }
        return new zzghr();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\t", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzghx zzf()
  {
    zzghx localzzghx2 = this.zze;
    zzghx localzzghx1 = localzzghx2;
    if (localzzghx2 == null) {
      localzzghx1 = zzghx.zze();
    }
    return localzzghx1;
  }
  
  public final zzgjj zzg()
  {
    zzgjj localzzgjj2 = this.zzf;
    zzgjj localzzgjj1 = localzzgjj2;
    if (localzzgjj2 == null) {
      localzzgjj1 = zzgjj.zze();
    }
    return localzzgjj1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */