package com.google.android.gms.internal.ads;

public final class zzpy
  implements zzpj
{
  protected zzpy(zzpx paramzzpx) {}
  
  protected static int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzftz.zza(paramInt1 * paramInt2 * paramInt3 / 1000000L);
  }
  
  protected static int zzb(int paramInt)
  {
    switch (paramInt)
    {
    case 13: 
    case 19: 
    default: 
      throw new IllegalArgumentException();
    case 20: 
      return 63750;
    case 17: 
      return 336000;
    case 16: 
      return 256000;
    case 15: 
      return 8000;
    case 14: 
      return 3062500;
    case 12: 
      return 7000;
    case 11: 
      return 16000;
    case 10: 
      return 100000;
    case 9: 
      return 40000;
    case 8: 
      return 2250000;
    case 7: 
      return 192000;
    case 6: 
    case 18: 
      return 768000;
    }
    return 80000;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */