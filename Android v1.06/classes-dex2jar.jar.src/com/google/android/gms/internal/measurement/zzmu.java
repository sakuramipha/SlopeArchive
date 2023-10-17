package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzmu
{
  final Unsafe zza;
  
  zzmu(Unsafe paramUnsafe)
  {
    this.zza = paramUnsafe;
  }
  
  public abstract double zza(Object paramObject, long paramLong);
  
  public abstract float zzb(Object paramObject, long paramLong);
  
  public abstract void zzc(Object paramObject, long paramLong, boolean paramBoolean);
  
  public abstract void zzd(Object paramObject, long paramLong, byte paramByte);
  
  public abstract void zze(Object paramObject, long paramLong, double paramDouble);
  
  public abstract void zzf(Object paramObject, long paramLong, float paramFloat);
  
  public abstract boolean zzg(Object paramObject, long paramLong);
  
  public final int zzh(Class paramClass)
  {
    return this.zza.arrayBaseOffset(paramClass);
  }
  
  public final int zzi(Class paramClass)
  {
    return this.zza.arrayIndexScale(paramClass);
  }
  
  public final int zzj(Object paramObject, long paramLong)
  {
    return this.zza.getInt(paramObject, paramLong);
  }
  
  public final long zzk(Object paramObject, long paramLong)
  {
    return this.zza.getLong(paramObject, paramLong);
  }
  
  public final long zzl(Field paramField)
  {
    return this.zza.objectFieldOffset(paramField);
  }
  
  public final Object zzm(Object paramObject, long paramLong)
  {
    return this.zza.getObject(paramObject, paramLong);
  }
  
  public final void zzn(Object paramObject, long paramLong, int paramInt)
  {
    this.zza.putInt(paramObject, paramLong, paramInt);
  }
  
  public final void zzo(Object paramObject, long paramLong1, long paramLong2)
  {
    this.zza.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public final void zzp(Object paramObject1, long paramLong, Object paramObject2)
  {
    this.zza.putObject(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */