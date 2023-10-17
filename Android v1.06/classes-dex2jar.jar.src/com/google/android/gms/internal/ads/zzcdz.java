package com.google.android.gms.internal.ads;

public final class zzcdz
  implements zzkg
{
  private final zzxm zzb = new zzxm(true, 65536);
  private long zzc = 15000000L;
  private long zzd = 30000000L;
  private long zze = 2500000L;
  private long zzf = 5000000L;
  private int zzg;
  private boolean zzh;
  
  public final long zza()
  {
    return 0L;
  }
  
  public final void zzb()
  {
    zzj(false);
  }
  
  public final void zzc()
  {
    zzj(true);
  }
  
  public final void zzd()
  {
    zzj(true);
  }
  
  public final boolean zzf()
  {
    return false;
  }
  
  public final boolean zzg(long paramLong1, long paramLong2, float paramFloat)
  {
    paramLong1 = this.zzd;
    boolean bool2 = true;
    int i;
    if (paramLong2 > paramLong1) {
      i = 0;
    } else if (paramLong2 < this.zzc) {
      i = 2;
    } else {
      i = 1;
    }
    int k = this.zzb.zza();
    int j = this.zzg;
    boolean bool1 = bool2;
    if (i != 2) {
      if ((i == 1) && (this.zzh) && (k < j)) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    this.zzh = bool1;
    return bool1;
  }
  
  public final zzxm zzi()
  {
    return this.zzb;
  }
  
  final void zzj(boolean paramBoolean)
  {
    this.zzg = 0;
    this.zzh = false;
    if (paramBoolean) {
      this.zzb.zze();
    }
  }
  
  public final void zzk(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.zze = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzl(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.zzf = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzm(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.zzd = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzn(int paramInt)
  {
    long l = paramInt;
    try
    {
      this.zzc = (l * 1000L);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */