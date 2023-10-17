package com.google.android.gms.internal.ads;

public enum zzgjt
  implements zzgoy
{
  private static final zzgoz zzg = new zzgjs();
  private static final zzgjt[] zzh;
  private final int zzi;
  
  static
  {
    zzgjt localzzgjt5 = new zzgjt("UNKNOWN_KEYMATERIAL", 0, 0);
    zza = localzzgjt5;
    zzgjt localzzgjt4 = new zzgjt("SYMMETRIC", 1, 1);
    zzb = localzzgjt4;
    zzgjt localzzgjt1 = new zzgjt("ASYMMETRIC_PRIVATE", 2, 2);
    zzc = localzzgjt1;
    zzgjt localzzgjt6 = new zzgjt("ASYMMETRIC_PUBLIC", 3, 3);
    zzd = localzzgjt6;
    zzgjt localzzgjt3 = new zzgjt("REMOTE", 4, 4);
    zze = localzzgjt3;
    zzgjt localzzgjt2 = new zzgjt("UNRECOGNIZED", 5, -1);
    zzf = localzzgjt2;
    zzh = new zzgjt[] { localzzgjt5, localzzgjt4, localzzgjt1, localzzgjt6, localzzgjt3, localzzgjt2 };
  }
  
  private zzgjt(int paramInt1)
  {
    this.zzi = paramInt1;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */