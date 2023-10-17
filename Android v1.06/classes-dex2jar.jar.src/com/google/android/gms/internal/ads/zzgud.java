package com.google.android.gms.internal.ads;

public final class zzgud
  extends zzgow
  implements zzgqh
{
  private static final zzgud zzb;
  private int zzd;
  private int zze;
  private String zzf = "";
  private zzgtl zzg;
  private zzgtp zzh;
  private int zzi;
  private zzgpb zzj = zzaJ();
  private String zzk = "";
  private int zzl;
  private zzgpf zzm = zzgow.zzaN();
  private byte zzn = 2;
  
  static
  {
    zzgud localzzgud = new zzgud();
    zzb = localzzgud;
    zzgow.zzaU(zzgud.class, localzzgud);
  }
  
  public static zzguc zzc()
  {
    return (zzguc)zzb.zzaA();
  }
  
  public final int zza()
  {
    return this.zzm.size();
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
              this.zzn = b;
              return null;
            }
            return zzb;
          }
          return new zzguc(null);
        }
        return new zzgud();
      }
      paramObject1 = zzgua.zza;
      return zzaR(zzb, "\001\t\000\001\001\t\t\000\002\003\001ᔄ\000\002ဈ\001\003ᐉ\002\004ᐉ\003\005င\004\006\026\007ဈ\005\bဌ\006\t\032", new Object[] { "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", paramObject1, "zzm" });
    }
    return Byte.valueOf(this.zzn);
  }
  
  public final String zze()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */