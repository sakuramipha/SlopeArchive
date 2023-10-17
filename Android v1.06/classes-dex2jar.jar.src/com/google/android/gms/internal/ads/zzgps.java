package com.google.android.gms.internal.ads;

import java.util.List;

final class zzgps
  extends zzgpu
{
  private zzgps()
  {
    super(null);
  }
  
  final List zza(Object paramObject, long paramLong)
  {
    zzgpf localzzgpf2 = (zzgpf)zzgsa.zzh(paramObject, paramLong);
    zzgpf localzzgpf1 = localzzgpf2;
    if (!localzzgpf2.zzc())
    {
      int i = localzzgpf2.size();
      if (i == 0) {
        i = 10;
      } else {
        i += i;
      }
      localzzgpf1 = localzzgpf2.zzd(i);
      zzgsa.zzv(paramObject, paramLong, localzzgpf1);
    }
    return localzzgpf1;
  }
  
  final void zzb(Object paramObject, long paramLong)
  {
    ((zzgpf)zzgsa.zzh(paramObject, paramLong)).zzb();
  }
  
  final void zzc(Object paramObject1, Object paramObject2, long paramLong)
  {
    zzgpf localzzgpf1 = (zzgpf)zzgsa.zzh(paramObject1, paramLong);
    zzgpf localzzgpf2 = (zzgpf)zzgsa.zzh(paramObject2, paramLong);
    int j = localzzgpf1.size();
    int i = localzzgpf2.size();
    paramObject2 = localzzgpf1;
    if (j > 0)
    {
      paramObject2 = localzzgpf1;
      if (i > 0)
      {
        paramObject2 = localzzgpf1;
        if (!localzzgpf1.zzc()) {
          paramObject2 = localzzgpf1.zzd(i + j);
        }
        ((zzgpf)paramObject2).addAll(localzzgpf2);
      }
    }
    if (j <= 0) {
      paramObject2 = localzzgpf2;
    }
    zzgsa.zzv(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */