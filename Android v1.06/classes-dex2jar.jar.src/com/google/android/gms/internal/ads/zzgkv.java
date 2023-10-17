package com.google.android.gms.internal.ads;

public final class zzgkv
  extends zzgow
  implements zzgqh
{
  private static final zzgkv zzb;
  private int zzd;
  private zzgky zze;
  
  static
  {
    zzgkv localzzgkv = new zzgkv();
    zzb = localzzgkv;
    zzgow.zzaU(zzgkv.class, localzzgkv);
  }
  
  public static zzgku zzc()
  {
    return (zzgku)zzb.zzaA();
  }
  
  public static zzgkv zze(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgkv)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzgku(null);
        }
        return new zzgkv();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgky zzf()
  {
    zzgky localzzgky2 = this.zze;
    zzgky localzzgky1 = localzzgky2;
    if (localzzgky2 == null) {
      localzzgky1 = zzgky.zzd();
    }
    return localzzgky1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */