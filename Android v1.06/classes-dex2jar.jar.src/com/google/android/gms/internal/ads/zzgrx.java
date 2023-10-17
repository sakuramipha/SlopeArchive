package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzgrx
  extends zzgrz
{
  zzgrx(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final byte zza(long paramLong)
  {
    return Memory.peekByte((int)paramLong);
  }
  
  public final double zzb(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(this.zza.getLong(paramObject, paramLong));
  }
  
  public final float zzc(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(this.zza.getInt(paramObject, paramLong));
  }
  
  public final void zzd(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
  {
    int i = (int)paramLong2;
    int j = (int)paramLong3;
    Memory.peekByteArray((int)paramLong1, paramArrayOfByte, i, j);
  }
  
  public final void zze(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (zzgsa.zzb)
    {
      zzgsa.zzk(paramObject, paramLong, paramBoolean);
      return;
    }
    zzgsa.zzl(paramObject, paramLong, paramBoolean);
  }
  
  public final void zzf(Object paramObject, long paramLong, byte paramByte)
  {
    if (zzgsa.zzb)
    {
      zzgsa.zzm(paramObject, paramLong, paramByte);
      return;
    }
    zzgsa.zzn(paramObject, paramLong, paramByte);
  }
  
  public final void zzg(Object paramObject, long paramLong, double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    this.zza.putLong(paramObject, paramLong, l);
  }
  
  public final void zzh(Object paramObject, long paramLong, float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    this.zza.putInt(paramObject, paramLong, i);
  }
  
  public final boolean zzi(Object paramObject, long paramLong)
  {
    if (zzgsa.zzb) {
      return zzgsa.zzw(paramObject, paramLong);
    }
    return zzgsa.zzx(paramObject, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */