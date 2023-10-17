package com.google.android.gms.internal.ads;

public final class zzgjp
  extends zzgow
  implements zzgqh
{
  private static final zzgjp zzb;
  private int zzd;
  private int zze;
  
  static
  {
    zzgjp localzzgjp = new zzgjp();
    zzb = localzzgjp;
    zzgow.zzaU(zzgjp.class, localzzgjp);
  }
  
  public static zzgjo zzc()
  {
    return (zzgjo)zzb.zzaA();
  }
  
  public static zzgjp zze()
  {
    return zzb;
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
          return new zzgjo(null);
        }
        return new zzgjp();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\000\000\001\f\002\013", new Object[] { "zzd", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final int zzg()
  {
    int j = this.zzd;
    int i = 5;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3) {
            if (j != 4)
            {
              if (j != 5) {
                i = 0;
              } else {
                i = 7;
              }
            }
            else {
              i = 6;
            }
          }
        }
        else {
          i = 4;
        }
      }
      else {
        i = 3;
      }
    }
    else {
      i = 2;
    }
    if (i == 0) {
      return 1;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */