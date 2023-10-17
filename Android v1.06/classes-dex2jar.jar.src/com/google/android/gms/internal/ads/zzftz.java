package com.google.android.gms.internal.ads;

public final class zzftz
  extends zzfua
{
  public static int zza(long paramLong)
  {
    int i = (int)paramLong;
    if (i == paramLong) {
      return i;
    }
    throw new IllegalArgumentException(zzfpo.zzb("Out of range: %s", new Object[] { Long.valueOf(paramLong) }));
  }
  
  public static int zzb(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), 1073741823);
  }
  
  public static int zzc(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */