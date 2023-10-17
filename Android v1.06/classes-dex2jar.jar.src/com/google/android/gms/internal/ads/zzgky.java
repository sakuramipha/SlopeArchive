package com.google.android.gms.internal.ads;

public final class zzgky
  extends zzgow
  implements zzgqh
{
  private static final zzgky zzb;
  private String zzd = "";
  private zzgjz zze;
  
  static
  {
    zzgky localzzgky = new zzgky();
    zzb = localzzgky;
    zzgow.zzaU(zzgky.class, localzzgky);
  }
  
  public static zzgky zzd()
  {
    return zzb;
  }
  
  public static zzgky zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgky)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
  }
  
  public final zzgjz zza()
  {
    zzgjz localzzgjz2 = this.zze;
    zzgjz localzzgjz1 = localzzgjz2;
    if (localzzgjz2 == null) {
      localzzgjz1 = zzgjz.zzd();
    }
    return localzzgjz1;
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
          return new zzgkx(null);
        }
        return new zzgky();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001Ȉ\002\t", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zzf()
  {
    return this.zzd;
  }
  
  public final boolean zzg()
  {
    return this.zze != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */