package com.google.android.gms.internal.measurement;

final class zzkv
  extends zzkx
{
  private zzkv()
  {
    super(null);
  }
  
  final void zza(Object paramObject, long paramLong)
  {
    ((zzkj)zzmv.zzf(paramObject, paramLong)).zzb();
  }
  
  final void zzb(Object paramObject1, Object paramObject2, long paramLong)
  {
    zzkj localzzkj1 = (zzkj)zzmv.zzf(paramObject1, paramLong);
    zzkj localzzkj2 = (zzkj)zzmv.zzf(paramObject2, paramLong);
    int j = localzzkj1.size();
    int i = localzzkj2.size();
    paramObject2 = localzzkj1;
    if (j > 0)
    {
      paramObject2 = localzzkj1;
      if (i > 0)
      {
        paramObject2 = localzzkj1;
        if (!localzzkj1.zzc()) {
          paramObject2 = localzzkj1.zzd(i + j);
        }
        ((zzkj)paramObject2).addAll(localzzkj2);
      }
    }
    if (j <= 0) {
      paramObject2 = localzzkj2;
    }
    zzmv.zzs(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */