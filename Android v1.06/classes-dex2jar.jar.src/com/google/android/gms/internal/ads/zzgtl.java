package com.google.android.gms.internal.ads;

public final class zzgtl
  extends zzgow
  implements zzgqh
{
  private static final zzgtl zzb;
  private int zzd;
  private zzgtk zze;
  private zzgpf zzf = zzaN();
  private zzgno zzg = zzgno.zzb;
  private zzgno zzh = zzgno.zzb;
  private int zzi;
  private byte zzj = 2;
  
  static
  {
    zzgtl localzzgtl = new zzgtl();
    zzb = localzzgtl;
    zzgow.zzaU(zzgtl.class, localzzgtl);
  }
  
  public static zzgti zza()
  {
    return (zzgti)zzb.zzaA();
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
              this.zzj = b;
              return null;
            }
            return zzb;
          }
          return new zzgti(null);
        }
        return new zzgtl();
      }
      return zzaR(zzb, "\001\005\000\001\001\005\005\000\001\001\001ဉ\000\002Л\003ည\001\004ည\002\005င\003", new Object[] { "zzd", "zze", "zzf", zzgth.class, "zzg", "zzh", "zzi" });
    }
    return Byte.valueOf(this.zzj);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgtl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */