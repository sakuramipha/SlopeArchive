package com.google.android.gms.internal.ads;

public final class zzgjm
  extends zzgow
  implements zzgqh
{
  private static final zzgjm zzb;
  private zzgjp zzd;
  private int zze;
  private int zzf;
  
  static
  {
    zzgjm localzzgjm = new zzgjm();
    zzb = localzzgjm;
    zzgow.zzaU(zzgjm.class, localzzgjm);
  }
  
  public static zzgjl zzc()
  {
    return (zzgjl)zzb.zzaA();
  }
  
  public static zzgjm zze()
  {
    return zzb;
  }
  
  public static zzgjm zzf(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgjm)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
  }
  
  public final int zza()
  {
    return this.zze;
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
          return new zzgjl(null);
        }
        return new zzgjm();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\t\002\013\003\013", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgjp zzg()
  {
    zzgjp localzzgjp2 = this.zzd;
    zzgjp localzzgjp1 = localzzgjp2;
    if (localzzgjp2 == null) {
      localzzgjp1 = zzgjp.zze();
    }
    return localzzgjp1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */