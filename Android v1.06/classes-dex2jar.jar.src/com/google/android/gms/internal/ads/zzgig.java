package com.google.android.gms.internal.ads;

public final class zzgig
  extends zzgow
  implements zzgqh
{
  private static final zzgig zzb;
  private int zzd;
  private zzgim zze;
  private zzgno zzf = zzgno.zzb;
  
  static
  {
    zzgig localzzgig = new zzgig();
    zzb = localzzgig;
    zzgow.zzaU(zzgig.class, localzzgig);
  }
  
  public static zzgif zzc()
  {
    return (zzgif)zzb.zzaA();
  }
  
  public static zzgig zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgig)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgif(null);
        }
        return new zzgig();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgim zzf()
  {
    zzgim localzzgim2 = this.zze;
    zzgim localzzgim1 = localzzgim2;
    if (localzzgim2 == null) {
      localzzgim1 = zzgim.zze();
    }
    return localzzgim1;
  }
  
  public final zzgno zzg()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */