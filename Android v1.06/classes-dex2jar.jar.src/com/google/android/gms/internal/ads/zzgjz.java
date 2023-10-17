package com.google.android.gms.internal.ads;

public final class zzgjz
  extends zzgow
  implements zzgqh
{
  private static final zzgjz zzb;
  private String zzd = "";
  private zzgno zze = zzgno.zzb;
  private int zzf;
  
  static
  {
    zzgjz localzzgjz = new zzgjz();
    zzb = localzzgjz;
    zzgow.zzaU(zzgjz.class, localzzgjz);
  }
  
  public static zzgjy zza()
  {
    return (zzgjy)zzb.zzaA();
  }
  
  public static zzgjz zzd()
  {
    return zzb;
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
          return new zzgjy(null);
        }
        return new zzgjz();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001Ȉ\002\n\003\f", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgla zze()
  {
    zzgla localzzgla2 = zzgla.zzb(this.zzf);
    zzgla localzzgla1 = localzzgla2;
    if (localzzgla2 == null) {
      localzzgla1 = zzgla.zzf;
    }
    return localzzgla1;
  }
  
  public final zzgno zzf()
  {
    return this.zze;
  }
  
  public final String zzg()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */