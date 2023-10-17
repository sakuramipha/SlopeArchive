package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

public final class zzcgq
{
  public final int zza;
  public final int zzb;
  private final int zzc;
  
  private zzcgq(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzc = paramInt1;
    this.zzb = paramInt2;
    this.zza = paramInt3;
  }
  
  public static zzcgq zza()
  {
    return new zzcgq(0, 0, 0);
  }
  
  public static zzcgq zzb(int paramInt1, int paramInt2)
  {
    return new zzcgq(1, paramInt1, paramInt2);
  }
  
  public static zzcgq zzc(zzq paramzzq)
  {
    if (paramzzq.zzd) {
      return new zzcgq(3, 0, 0);
    }
    if (paramzzq.zzi) {
      return new zzcgq(2, 0, 0);
    }
    if (paramzzq.zzh) {
      return zza();
    }
    return zzb(paramzzq.zzf, paramzzq.zzc);
  }
  
  public static zzcgq zzd()
  {
    return new zzcgq(5, 0, 0);
  }
  
  public static zzcgq zze()
  {
    return new zzcgq(4, 0, 0);
  }
  
  public final boolean zzf()
  {
    return this.zzc == 0;
  }
  
  public final boolean zzg()
  {
    return this.zzc == 2;
  }
  
  public final boolean zzh()
  {
    return this.zzc == 5;
  }
  
  public final boolean zzi()
  {
    return this.zzc == 3;
  }
  
  public final boolean zzj()
  {
    return this.zzc == 4;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */