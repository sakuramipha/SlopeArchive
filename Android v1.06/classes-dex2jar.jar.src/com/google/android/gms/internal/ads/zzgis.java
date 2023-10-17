package com.google.android.gms.internal.ads;

public final class zzgis
  extends zzgow
  implements zzgqh
{
  private static final zzgis zzb;
  private int zzd;
  private int zze;
  
  static
  {
    zzgis localzzgis = new zzgis();
    zzb = localzzgis;
    zzgow.zzaU(zzgis.class, localzzgis);
  }
  
  public static zzgir zzc()
  {
    return (zzgir)zzb.zzaA();
  }
  
  public static zzgis zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgis)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgir(null);
        }
        return new zzgis();
      }
      return zzaR(zzb, "\000\002\000\000\002\003\002\000\000\000\002\013\003\013", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */