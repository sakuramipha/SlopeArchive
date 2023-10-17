package com.google.android.gms.internal.ads;

public final class zzgij
  extends zzgow
  implements zzgqh
{
  private static final zzgij zzb;
  private zzgim zzd;
  private int zze;
  
  static
  {
    zzgij localzzgij = new zzgij();
    zzb = localzzgij;
    zzgow.zzaU(zzgij.class, localzzgij);
  }
  
  public static zzgii zzc()
  {
    return (zzgii)zzb.zzaA();
  }
  
  public static zzgij zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgij)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgii(null);
        }
        return new zzgij();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\t\002\013", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgim zzf()
  {
    zzgim localzzgim2 = this.zzd;
    zzgim localzzgim1 = localzzgim2;
    if (localzzgim2 == null) {
      localzzgim1 = zzgim.zze();
    }
    return localzzgim1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */