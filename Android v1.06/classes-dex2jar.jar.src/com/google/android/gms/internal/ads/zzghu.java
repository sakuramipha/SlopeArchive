package com.google.android.gms.internal.ads;

public final class zzghu
  extends zzgow
  implements zzgqh
{
  private static final zzghu zzb;
  private zzgia zzd;
  private zzgjm zze;
  
  static
  {
    zzghu localzzghu = new zzghu();
    zzb = localzzghu;
    zzgow.zzaU(zzghu.class, localzzghu);
  }
  
  public static zzght zza()
  {
    return (zzght)zzb.zzaA();
  }
  
  public static zzghu zzd(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzghu)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzght(null);
        }
        return new zzghu();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\t\002\t", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgia zze()
  {
    zzgia localzzgia2 = this.zzd;
    zzgia localzzgia1 = localzzgia2;
    if (localzzgia2 == null) {
      localzzgia1 = zzgia.zze();
    }
    return localzzgia1;
  }
  
  public final zzgjm zzf()
  {
    zzgjm localzzgjm2 = this.zze;
    zzgjm localzzgjm1 = localzzgjm2;
    if (localzzgjm2 == null) {
      localzzgjm1 = zzgjm.zze();
    }
    return localzzgjm1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzghu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */