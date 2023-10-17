package com.google.android.gms.internal.ads;

public final class zzgju
  extends zzgow
  implements zzgqh
{
  private static final zzgju zzb;
  private String zzd = "";
  private zzgno zze = zzgno.zzb;
  private int zzf;
  
  static
  {
    zzgju localzzgju = new zzgju();
    zzb = localzzgju;
    zzgow.zzaU(zzgju.class, localzzgju);
  }
  
  public static zzgjr zza()
  {
    return (zzgjr)zzb.zzaA();
  }
  
  public static zzgju zze()
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
          return new zzgjr(null);
        }
        return new zzgju();
      }
      return zzaR(zzb, "\000\003\000\000\001\003\003\000\000\000\001Ȉ\002\n\003\f", new Object[] { "zzd", "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzgjt zzc()
  {
    int i = this.zzf;
    zzgjt localzzgjt1 = zzgjt.zza;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              localzzgjt1 = null;
            } else {
              localzzgjt1 = zzgjt.zze;
            }
          }
          else {
            localzzgjt1 = zzgjt.zzd;
          }
        }
        else {
          localzzgjt1 = zzgjt.zzc;
        }
      }
      else {
        localzzgjt1 = zzgjt.zzb;
      }
    }
    else {
      localzzgjt1 = zzgjt.zza;
    }
    zzgjt localzzgjt2 = localzzgjt1;
    if (localzzgjt1 == null) {
      localzzgjt2 = zzgjt.zzf;
    }
    return localzzgjt2;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */