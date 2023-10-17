package com.google.android.gms.internal.ads;

public final class zzgia
  extends zzgow
  implements zzgqh
{
  private static final zzgia zzb;
  private zzgid zzd;
  private int zze;
  
  static
  {
    zzgia localzzgia = new zzgia();
    zzb = localzzgia;
    zzgow.zzaU(zzgia.class, localzzgia);
  }
  
  public static zzghz zzc()
  {
    return (zzghz)zzb.zzaA();
  }
  
  public static zzgia zze()
  {
    return zzb;
  }
  
  public static zzgia zzf(zzgno paramzzgno, zzgoi paramzzgoi)
    throws zzgpi
  {
    return (zzgia)zzgow.zzaG(zzb, paramzzgno, paramzzgoi);
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
          return new zzghz(null);
        }
        return new zzgia();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\t\002\013", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgid zzg()
  {
    zzgid localzzgid2 = this.zzd;
    zzgid localzzgid1 = localzzgid2;
    if (localzzgid2 == null) {
      localzzgid1 = zzgid.zze();
    }
    return localzzgid1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */