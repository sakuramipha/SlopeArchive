package com.google.android.gms.internal.ads;

public final class zzaou
  extends zzgow
  implements zzgqh
{
  private static final zzaou zzb;
  private int zzd;
  private long zze;
  private String zzf = "";
  private zzgno zzg = zzgno.zzb;
  
  static
  {
    zzaou localzzaou = new zzaou();
    zzb = localzzaou;
    zzgow.zzaU(zzaou.class, localzzaou);
  }
  
  public static zzaou zzd()
  {
    return zzb;
  }
  
  public final long zza()
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
          return new zzaot(null);
        }
        return new zzaou();
      }
      return zzaR(zzb, "\001\003\000\001\001\004\003\000\000\000\001ဂ\000\003ဈ\001\004ည\002", new Object[] { "zzd", "zze", "zzf", "zzg" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final boolean zze()
  {
    return (this.zzd & 0x1) != 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */