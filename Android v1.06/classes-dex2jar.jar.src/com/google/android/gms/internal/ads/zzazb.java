package com.google.android.gms.internal.ads;

public final class zzazb
  extends zzgow
  implements zzgqh
{
  private static final zzazb zzb;
  private int zzd;
  private int zze;
  private int zzf;
  
  static
  {
    zzazb localzzazb = new zzazb();
    zzb = localzzazb;
    zzgow.zzaU(zzazb.class, localzzazb);
  }
  
  public static zzayu zza()
  {
    return (zzayu)zzb.zzaA();
  }
  
  public static zzazb zzd()
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
          return new zzayu(null);
        }
        return new zzazb();
      }
      paramObject2 = zzayz.zza;
      paramObject1 = zzayw.zza;
      return zzaR(zzb, "\001\002\000\001\001\002\002\000\000\000\001ဌ\000\002ဌ\001", new Object[] { "zzd", "zze", paramObject2, "zzf", paramObject1 });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final boolean zze()
  {
    return (this.zzd & 0x2) != 0;
  }
  
  public final boolean zzf()
  {
    return (this.zzd & 0x1) != 0;
  }
  
  public final int zzg()
  {
    int j = zzayx.zza(this.zzf);
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  public final int zzh()
  {
    int j = zzaza.zza(this.zze);
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzazb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */