package com.google.android.gms.internal.ads;

import java.io.IOException;

abstract class zzgrq
{
  abstract int zza(Object paramObject);
  
  abstract int zzb(Object paramObject);
  
  abstract Object zzc(Object paramObject);
  
  abstract Object zzd(Object paramObject);
  
  abstract Object zze(Object paramObject1, Object paramObject2);
  
  abstract Object zzf();
  
  abstract Object zzg(Object paramObject);
  
  abstract void zzh(Object paramObject, int paramInt1, int paramInt2);
  
  abstract void zzi(Object paramObject, int paramInt, long paramLong);
  
  abstract void zzj(Object paramObject1, int paramInt, Object paramObject2);
  
  abstract void zzk(Object paramObject, int paramInt, zzgno paramzzgno);
  
  abstract void zzl(Object paramObject, int paramInt, long paramLong);
  
  abstract void zzm(Object paramObject);
  
  abstract void zzn(Object paramObject1, Object paramObject2);
  
  abstract void zzo(Object paramObject1, Object paramObject2);
  
  final boolean zzp(Object paramObject, zzgqr paramzzgqr)
    throws IOException
  {
    int j = paramzzgqr.zzd();
    int i = j >>> 3;
    j &= 0x7;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j == 5)
              {
                zzh(paramObject, i, paramzzgqr.zzf());
                return true;
              }
              throw zzgpi.zza();
            }
            return false;
          }
          Object localObject = zzf();
          while ((paramzzgqr.zzc() != Integer.MAX_VALUE) && (zzp(localObject, paramzzgqr))) {}
          if ((0x4 | i << 3) == paramzzgqr.zzd())
          {
            zzg(localObject);
            zzj(paramObject, i, localObject);
            return true;
          }
          throw zzgpi.zzb();
        }
        zzk(paramObject, i, paramzzgqr.zzp());
        return true;
      }
      zzi(paramObject, i, paramzzgqr.zzk());
      return true;
    }
    zzl(paramObject, i, paramzzgqr.zzl());
    return true;
  }
  
  abstract boolean zzq(zzgqr paramzzgqr);
  
  abstract void zzr(Object paramObject, zzgoe paramzzgoe)
    throws IOException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */