package com.google.android.gms.internal.drive;

final class zzld
  extends zzla
{
  private zzld()
  {
    super(null);
  }
  
  private static <E> zzkp<E> zzc(Object paramObject, long paramLong)
  {
    return (zzkp)zznd.zzo(paramObject, paramLong);
  }
  
  final void zza(Object paramObject, long paramLong)
  {
    zzc(paramObject, paramLong).zzbp();
  }
  
  final <E> void zza(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = zzc(paramObject1, paramLong);
    zzkp localzzkp = zzc(paramObject2, paramLong);
    int j = ((zzkp)localObject).size();
    int i = localzzkp.size();
    paramObject2 = localObject;
    if (j > 0)
    {
      paramObject2 = localObject;
      if (i > 0)
      {
        paramObject2 = localObject;
        if (!((zzkp)localObject).zzbo()) {
          paramObject2 = ((zzkp)localObject).zzr(i + j);
        }
        ((zzkp)paramObject2).addAll(localzzkp);
      }
    }
    localObject = localzzkp;
    if (j > 0) {
      localObject = paramObject2;
    }
    zznd.zza(paramObject1, paramLong, localObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */