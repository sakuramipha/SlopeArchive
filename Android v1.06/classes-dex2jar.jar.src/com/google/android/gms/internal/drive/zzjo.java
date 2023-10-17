package com.google.android.gms.internal.drive;

public abstract class zzjo
{
  private int zznz = 100;
  private int zzoa = Integer.MAX_VALUE;
  private boolean zzob = false;
  
  static zzjo zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzjq(paramArrayOfByte, 0, paramInt2, false, null);
    try
    {
      paramArrayOfByte.zzv(paramInt2);
      return paramArrayOfByte;
    }
    catch (zzkq paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public static long zzk(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static int zzw(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public abstract int zzbz();
  
  public abstract int zzv(int paramInt)
    throws zzkq;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */