package com.google.android.gms.internal.ads;

public final class zzaaz
  implements zzabn
{
  private final zzabb zza;
  private final long zzb;
  
  public zzaaz(zzabb paramzzabb, long paramLong)
  {
    this.zza = paramzzabb;
    this.zzb = paramLong;
  }
  
  private final zzabo zza(long paramLong1, long paramLong2)
  {
    return new zzabo(paramLong1 * 1000000L / this.zza.zze, this.zzb + paramLong2);
  }
  
  public final long zze()
  {
    return this.zza.zza();
  }
  
  public final zzabl zzg(long paramLong)
  {
    zzdy.zzb(this.zza.zzk);
    Object localObject1 = this.zza;
    Object localObject2 = ((zzabb)localObject1).zzk;
    long[] arrayOfLong = ((zzaba)localObject2).zza;
    localObject2 = ((zzaba)localObject2).zzb;
    int i = zzfn.zzc(arrayOfLong, ((zzabb)localObject1).zzb(paramLong), true, false);
    long l2 = 0L;
    long l1;
    if (i == -1) {
      l1 = 0L;
    } else {
      l1 = arrayOfLong[i];
    }
    if (i != -1) {
      l2 = localObject2[i];
    }
    localObject1 = zza(l1, l2);
    if ((((zzabo)localObject1).zzb != paramLong) && (i != arrayOfLong.length - 1))
    {
      i++;
      return new zzabl((zzabo)localObject1, zza(arrayOfLong[i], localObject2[i]));
    }
    return new zzabl((zzabo)localObject1, (zzabo)localObject1);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */