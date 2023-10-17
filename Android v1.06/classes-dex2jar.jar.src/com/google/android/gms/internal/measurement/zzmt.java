package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class zzmt
  extends zzmu
{
  zzmt(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final double zza(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(zzk(paramObject, paramLong));
  }
  
  public final float zzb(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(zzj(paramObject, paramLong));
  }
  
  public final void zzc(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (zzmv.zzb)
    {
      zzmv.zzi(paramObject, paramLong, paramBoolean);
      return;
    }
    zzmv.zzj(paramObject, paramLong, paramBoolean);
  }
  
  public final void zzd(Object paramObject, long paramLong, byte paramByte)
  {
    if (zzmv.zzb)
    {
      zzmv.zzk(paramObject, paramLong, paramByte);
      return;
    }
    zzmv.zzl(paramObject, paramLong, paramByte);
  }
  
  public final void zze(Object paramObject, long paramLong, double paramDouble)
  {
    zzo(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void zzf(Object paramObject, long paramLong, float paramFloat)
  {
    zzn(paramObject, paramLong, Float.floatToIntBits(paramFloat));
  }
  
  public final boolean zzg(Object paramObject, long paramLong)
  {
    if (zzmv.zzb) {
      return zzmv.zzt(paramObject, paramLong);
    }
    return zzmv.zzu(paramObject, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */