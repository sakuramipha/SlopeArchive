package com.google.android.gms.internal.ads;

public final class zzhw
  implements zzkg
{
  private final zzxm zzb;
  private final long zzc;
  private final long zzd;
  private final long zze;
  private final long zzf;
  private final long zzg;
  private int zzh;
  private boolean zzi;
  
  public zzhw()
  {
    zzj(2500, 0, "bufferForPlaybackMs", "0");
    zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
    zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
    zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
    zzj(50000, 50000, "maxBufferMs", "minBufferMs");
    zzj(0, 0, "backBufferDurationMs", "0");
    this.zzb = localzzxm;
    this.zzc = zzfn.zzo(50000L);
    this.zzd = zzfn.zzo(50000L);
    this.zze = zzfn.zzo(2500L);
    this.zzf = zzfn.zzo(5000L);
    this.zzh = 13107200;
    this.zzg = zzfn.zzo(0L);
  }
  
  private static void zzj(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" cannot be less than ");
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zze(bool, paramString1);
  }
  
  private final void zzk(boolean paramBoolean)
  {
    this.zzh = 13107200;
    this.zzi = false;
    if (paramBoolean) {
      this.zzb.zze();
    }
  }
  
  public final long zza()
  {
    return this.zzg;
  }
  
  public final void zzb()
  {
    zzk(false);
  }
  
  public final void zzc()
  {
    zzk(true);
  }
  
  public final void zzd()
  {
    zzk(true);
  }
  
  public final void zze(zzcx paramzzcx, zzbx paramzzbx, zzle[] paramArrayOfzzle, zzvk paramzzvk, zzwx[] paramArrayOfzzwx)
  {
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      k = paramArrayOfzzle.length;
      int m = 13107200;
      if (i >= 2) {
        break;
      }
      k = j;
      if (paramArrayOfzzwx[i] != null)
      {
        k = m;
        if (paramArrayOfzzle[i].zzb() != 1) {
          k = 131072000;
        }
        k = j + k;
      }
      i++;
    }
    i = Math.max(13107200, j);
    this.zzh = i;
    this.zzb.zzf(i);
  }
  
  public final boolean zzf()
  {
    return false;
  }
  
  public final boolean zzg(long paramLong1, long paramLong2, float paramFloat)
  {
    int j = this.zzb.zza();
    int i = this.zzh;
    long l = this.zzc;
    paramLong1 = l;
    if (paramFloat > 1.0F) {
      paramLong1 = Math.min(zzfn.zzm(l, paramFloat), this.zzd);
    }
    paramLong1 = Math.max(paramLong1, 500000L);
    boolean bool = false;
    if (paramLong2 < paramLong1)
    {
      if (j < i) {
        bool = true;
      }
      this.zzi = bool;
      if ((!bool) && (paramLong2 < 500000L)) {
        zzer.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
      }
    }
    else if ((paramLong2 >= this.zzd) || (j >= i))
    {
      this.zzi = false;
    }
    return this.zzi;
  }
  
  public final boolean zzh(zzcx paramzzcx, zzbx paramzzbx, long paramLong1, float paramFloat, boolean paramBoolean, long paramLong2)
  {
    long l2 = zzfn.zzn(paramLong1, paramFloat);
    if (paramBoolean) {
      paramLong1 = this.zzf;
    } else {
      paramLong1 = this.zze;
    }
    long l1 = paramLong1;
    if (paramLong2 != -9223372036854775807L) {
      l1 = Math.min(paramLong2 / 2L, paramLong1);
    }
    return (l1 <= 0L) || (l2 >= l1) || (this.zzb.zza() >= this.zzh);
  }
  
  public final zzxm zzi()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */