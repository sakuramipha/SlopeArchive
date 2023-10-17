package com.google.android.gms.internal.ads;

public enum zzazk
  implements zzgoy
{
  private static final zzgoz zzg = new zzazi();
  private static final zzazk[] zzh;
  private final int zzi;
  
  static
  {
    zzazk localzzazk4 = new zzazk("UNSPECIFIED", 0, 0);
    zza = localzzazk4;
    zzazk localzzazk1 = new zzazk("CONNECTING", 1, 1);
    zzb = localzzazk1;
    zzazk localzzazk6 = new zzazk("CONNECTED", 2, 2);
    zzc = localzzazk6;
    zzazk localzzazk2 = new zzazk("DISCONNECTING", 3, 3);
    zzd = localzzazk2;
    zzazk localzzazk3 = new zzazk("DISCONNECTED", 4, 4);
    zze = localzzazk3;
    zzazk localzzazk5 = new zzazk("SUSPENDED", 5, 5);
    zzf = localzzazk5;
    zzh = new zzazk[] { localzzazk4, localzzazk1, localzzazk6, localzzazk2, localzzazk3, localzzazk5 };
  }
  
  private zzazk(int paramInt1)
  {
    this.zzi = paramInt1;
  }
  
  public static zzazk zzb(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
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
              return zzf;
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
    return Integer.toString(this.zzi);
  }
  
  public final int zza()
  {
    return this.zzi;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzazk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */