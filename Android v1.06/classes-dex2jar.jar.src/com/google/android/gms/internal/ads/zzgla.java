package com.google.android.gms.internal.ads;

public enum zzgla
  implements zzgoy
{
  private static final zzgoz zzg = new zzgkz();
  private static final zzgla[] zzh;
  private final int zzi;
  
  static
  {
    zzgla localzzgla2 = new zzgla("UNKNOWN_PREFIX", 0, 0);
    zza = localzzgla2;
    zzgla localzzgla3 = new zzgla("TINK", 1, 1);
    zzb = localzzgla3;
    zzgla localzzgla4 = new zzgla("LEGACY", 2, 2);
    zzc = localzzgla4;
    zzgla localzzgla5 = new zzgla("RAW", 3, 3);
    zzd = localzzgla5;
    zzgla localzzgla6 = new zzgla("CRUNCHY", 4, 4);
    zze = localzzgla6;
    zzgla localzzgla1 = new zzgla("UNRECOGNIZED", 5, -1);
    zzf = localzzgla1;
    zzh = new zzgla[] { localzzgla2, localzzgla3, localzzgla4, localzzgla5, localzzgla6, localzzgla1 };
  }
  
  private zzgla(int paramInt1)
  {
    this.zzi = paramInt1;
  }
  
  public static zzgla zzb(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return null;
            }
            return zze;
          }
          return zzd;
        }
        return zzc;
      }
      return zzb;
    }
    return zza;
  }
  
  public final String toString()
  {
    return Integer.toString(zza());
  }
  
  public final int zza()
  {
    if (this != zzf) {
      return this.zzi;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */