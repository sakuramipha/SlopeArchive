package com.google.android.gms.internal.ads;

public final class zzgth
  extends zzgow
  implements zzgqh
{
  private static final zzgth zzb;
  private int zzd;
  private zzgno zze = zzgno.zzb;
  private zzgno zzf = zzgno.zzb;
  private byte zzg = 2;
  
  static
  {
    zzgth localzzgth = new zzgth();
    zzb = localzzgth;
    zzgow.zzaU(zzgth.class, localzzgth);
  }
  
  public static zzgtg zza()
  {
    return (zzgtg)zzb.zzaA();
  }
  
  protected final Object zzb(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      byte b = 1;
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5)
            {
              if (paramObject1 == null) {
                b = 0;
              }
              this.zzg = b;
              return null;
            }
            return zzb;
          }
          return new zzgtg(null);
        }
        return new zzgth();
      }
      return zzaR(zzb, "\001\002\000\001\001\002\002\000\000\001\001ᔊ\000\002ည\001", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf(this.zzg);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */