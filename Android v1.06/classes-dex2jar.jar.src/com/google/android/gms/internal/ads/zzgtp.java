package com.google.android.gms.internal.ads;

public final class zzgtp
  extends zzgow
  implements zzgqh
{
  private static final zzgtp zzb;
  private int zzd;
  private zzgto zze;
  private zzgpf zzf = zzaN();
  private zzgno zzg = zzgno.zzb;
  private zzgno zzh;
  private int zzi;
  private zzgno zzj;
  private byte zzk = 2;
  
  static
  {
    zzgtp localzzgtp = new zzgtp();
    zzb = localzzgtp;
    zzgow.zzaU(zzgtp.class, localzzgtp);
  }
  
  private zzgtp()
  {
    zzgno localzzgno = zzgno.zzb;
    this.zzh = localzzgno;
    this.zzj = localzzgno;
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
              this.zzk = b;
              return null;
            }
            return zzb;
          }
          return new zzgtm(null);
        }
        return new zzgtp();
      }
      return zzaR(zzb, "\001\006\000\001\001\006\006\000\001\001\001ဉ\000\002Л\003ည\001\004ည\002\005င\003\006ည\004", new Object[] { "zzd", "zze", "zzf", zzgth.class, "zzg", "zzh", "zzi", "zzj" });
    }
    return Byte.valueOf(this.zzk);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgtp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */