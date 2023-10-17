package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class zzpb
{
  private final zzpa zza;
  private int zzb;
  private long zzc;
  private long zzd;
  private long zze;
  private long zzf;
  
  public zzpb(AudioTrack paramAudioTrack)
  {
    int i = zzfn.zza;
    this.zza = new zzpa(paramAudioTrack);
    zzh(0);
  }
  
  private final void zzh(int paramInt)
  {
    this.zzb = paramInt;
    long l = 10000L;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if ((paramInt != 2) && (paramInt != 3)) {
          l = 500000L;
        }
      }
    }
    for (;;)
    {
      this.zzd = l;
      return;
      l = 10000000L;
      continue;
      this.zzd = 10000L;
      return;
      this.zze = 0L;
      this.zzf = -1L;
      this.zzc = (System.nanoTime() / 1000L);
    }
  }
  
  public final long zza()
  {
    return this.zza.zza();
  }
  
  public final long zzb()
  {
    return this.zza.zzb();
  }
  
  public final void zzc()
  {
    if (this.zzb == 4) {
      zzh(0);
    }
  }
  
  public final void zzd()
  {
    zzh(4);
  }
  
  public final void zze()
  {
    zzh(0);
  }
  
  public final boolean zzf()
  {
    return this.zzb == 2;
  }
  
  public final boolean zzg(long paramLong)
  {
    zzpa localzzpa = this.zza;
    long l2 = this.zze;
    long l1 = this.zzd;
    boolean bool2 = false;
    if (paramLong - l2 < l1) {
      return false;
    }
    this.zze = paramLong;
    boolean bool1 = localzzpa.zzc();
    int i = this.zzb;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            if (!bool1)
            {
              bool1 = bool2;
            }
            else
            {
              zzh(0);
              return true;
            }
          }
        }
        else if (bool1)
        {
          bool1 = true;
        }
        else
        {
          zzh(0);
          return false;
        }
      }
      else if (bool1)
      {
        if (this.zza.zza() > this.zzf)
        {
          zzh(2);
          return true;
        }
      }
      else {
        zzh(0);
      }
    }
    else if (bool1)
    {
      if (this.zza.zzb() < this.zzc)
      {
        bool1 = bool2;
      }
      else
      {
        this.zzf = this.zza.zza();
        zzh(1);
        return true;
      }
    }
    else {
      if (paramLong - this.zzc > 500000L) {
        break label208;
      }
    }
    return bool1;
    label208:
    zzh(3);
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */