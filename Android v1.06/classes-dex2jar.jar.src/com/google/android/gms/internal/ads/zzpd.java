package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

final class zzpd
{
  private long zzA;
  private long zzB;
  private long zzC;
  private long zzD;
  private boolean zzE;
  private long zzF;
  private long zzG;
  private final zzpc zza;
  private final long[] zzb;
  private AudioTrack zzc;
  private int zzd;
  private int zze;
  private zzpb zzf;
  private int zzg;
  private boolean zzh;
  private long zzi;
  private float zzj;
  private boolean zzk;
  private long zzl;
  private long zzm;
  private Method zzn;
  private long zzo;
  private boolean zzp;
  private boolean zzq;
  private long zzr;
  private long zzs;
  private long zzt;
  private long zzu;
  private long zzv;
  private int zzw;
  private int zzx;
  private long zzy;
  private long zzz;
  
  public zzpd(zzpc paramzzpc)
  {
    this.zza = paramzzpc;
    int i = zzfn.zza;
    try
    {
      this.zzn = AudioTrack.class.getMethod("getLatency", null);
      this.zzb = new long[10];
      return;
    }
    catch (NoSuchMethodException paramzzpc)
    {
      for (;;) {}
    }
  }
  
  private final long zzl(long paramLong)
  {
    return paramLong * this.zzg / 1000000L;
  }
  
  private final long zzm(long paramLong)
  {
    return paramLong * 1000000L / this.zzg;
  }
  
  private final long zzn()
  {
    long l4 = SystemClock.elapsedRealtime();
    long l1 = this.zzy;
    if (l1 != -9223372036854775807L)
    {
      l1 = zzl(zzfn.zzm(l4 * 1000L - l1, this.zzj));
      return Math.min(this.zzB, this.zzA + l1);
    }
    if (l4 - this.zzs >= 5L)
    {
      AudioTrack localAudioTrack = this.zzc;
      Objects.requireNonNull(localAudioTrack);
      int j = localAudioTrack.getPlayState();
      if (j != 1)
      {
        l1 = localAudioTrack.getPlaybackHeadPosition();
        boolean bool = this.zzh;
        long l2 = l1 & 0xFFFFFFFF;
        long l3 = 0L;
        int i = j;
        l1 = l2;
        if (bool)
        {
          i = j;
          if (j == 2)
          {
            if (l2 == 0L) {
              this.zzv = this.zzt;
            }
            i = 2;
          }
          l1 = l2 + this.zzv;
        }
        l2 = l1;
        if (zzfn.zza <= 29)
        {
          if (l1 == 0L)
          {
            l1 = l3;
            if (this.zzt > 0L)
            {
              l1 = l3;
              if (i == 3)
              {
                if (this.zzz != -9223372036854775807L) {
                  break label262;
                }
                this.zzz = l4;
                break label262;
              }
            }
          }
          this.zzz = -9223372036854775807L;
          l2 = l1;
        }
        else
        {
          if (this.zzt > l2) {
            this.zzu += 1L;
          }
          this.zzt = l2;
        }
      }
      label262:
      this.zzs = l4;
    }
    return this.zzt + (this.zzu << 32);
  }
  
  private final void zzo()
  {
    this.zzl = 0L;
    this.zzx = 0;
    this.zzw = 0;
    this.zzm = 0L;
    this.zzD = 0L;
    this.zzG = 0L;
    this.zzk = false;
  }
  
  public final int zza(long paramLong)
  {
    long l1 = zzn();
    long l2 = this.zzd;
    return this.zze - (int)(paramLong - l1 * l2);
  }
  
  public final long zzb(boolean paramBoolean)
  {
    Object localObject1 = this.zzc;
    Objects.requireNonNull(localObject1);
    long l1;
    int i;
    long l4;
    if (((AudioTrack)localObject1).getPlayState() == 3)
    {
      l1 = System.nanoTime() / 1000L;
      if (l1 - this.zzm >= 30000L)
      {
        l2 = zzm(zzn());
        if (l2 != 0L)
        {
          this.zzb[this.zzw] = (zzfn.zzn(l2, this.zzj) - l1);
          this.zzw = ((this.zzw + 1) % 10);
          i = this.zzx;
          if (i < 10) {
            this.zzx = (i + 1);
          }
          this.zzm = l1;
          this.zzl = 0L;
          for (i = 0;; i++)
          {
            int j = this.zzx;
            if (i >= j) {
              break;
            }
            this.zzl += this.zzb[i] / j;
          }
        }
      }
      else if (!this.zzh)
      {
        localObject1 = this.zzf;
        Objects.requireNonNull(localObject1);
        Object localObject3;
        if (((zzpb)localObject1).zzg(l1))
        {
          l3 = ((zzpb)localObject1).zzb();
          l2 = ((zzpb)localObject1).zza();
          l4 = zzm(zzn());
          long l6;
          if (Math.abs(l3 - l1) > 5000000L)
          {
            localObject3 = (zzpr)this.zza;
            l5 = zzpw.zzy(((zzpr)localObject3).zza);
            l6 = zzpw.zzz(((zzpr)localObject3).zza);
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Spurious audio timestamp (system clock mismatch): ");
            ((StringBuilder)localObject3).append(l2);
            ((StringBuilder)localObject3).append(", ");
            ((StringBuilder)localObject3).append(l3);
            ((StringBuilder)localObject3).append(", ");
            ((StringBuilder)localObject3).append(l1);
            ((StringBuilder)localObject3).append(", ");
            ((StringBuilder)localObject3).append(l4);
            ((StringBuilder)localObject3).append(", ");
            ((StringBuilder)localObject3).append(l5);
            ((StringBuilder)localObject3).append(", ");
            ((StringBuilder)localObject3).append(l6);
            zzer.zze("DefaultAudioSink", ((StringBuilder)localObject3).toString());
            ((zzpb)localObject1).zzd();
          }
          for (;;)
          {
            break;
            if (Math.abs(zzm(l2) - l4) > 5000000L)
            {
              localObject3 = (zzpr)this.zza;
              l5 = zzpw.zzy(((zzpr)localObject3).zza);
              l6 = zzpw.zzz(((zzpr)localObject3).zza);
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("Spurious audio timestamp (frame position mismatch): ");
              ((StringBuilder)localObject3).append(l2);
              ((StringBuilder)localObject3).append(", ");
              ((StringBuilder)localObject3).append(l3);
              ((StringBuilder)localObject3).append(", ");
              ((StringBuilder)localObject3).append(l1);
              ((StringBuilder)localObject3).append(", ");
              ((StringBuilder)localObject3).append(l4);
              ((StringBuilder)localObject3).append(", ");
              ((StringBuilder)localObject3).append(l5);
              ((StringBuilder)localObject3).append(", ");
              ((StringBuilder)localObject3).append(l6);
              zzer.zze("DefaultAudioSink", ((StringBuilder)localObject3).toString());
              ((zzpb)localObject1).zzd();
            }
            else
            {
              ((zzpb)localObject1).zzc();
            }
          }
        }
        if (this.zzq)
        {
          localObject1 = this.zzn;
          if ((localObject1 != null) && (l1 - this.zzr >= 500000L))
          {
            try
            {
              localObject3 = this.zzc;
              Objects.requireNonNull(localObject3);
              localObject1 = (Integer)((Method)localObject1).invoke(localObject3, new Object[0]);
              i = zzfn.zza;
              l3 = ((Integer)localObject1).intValue();
              l2 = this.zzi;
              Long.signum(l3);
              l2 = l3 * 1000L - l2;
              this.zzo = l2;
              l2 = Math.max(l2, 0L);
              this.zzo = l2;
              if (l2 > 5000000L)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append("Ignoring impossibly large audio latency: ");
                ((StringBuilder)localObject1).append(l2);
                zzer.zze("DefaultAudioSink", ((StringBuilder)localObject1).toString());
                this.zzo = 0L;
              }
            }
            catch (Exception localException)
            {
              this.zzn = null;
            }
            this.zzr = l1;
          }
        }
      }
    }
    long l3 = System.nanoTime() / 1000L;
    Object localObject2 = this.zzf;
    Objects.requireNonNull(localObject2);
    boolean bool = ((zzpb)localObject2).zzf();
    if (bool)
    {
      l1 = zzm(((zzpb)localObject2).zza()) + zzfn.zzm(l3 - ((zzpb)localObject2).zzb(), this.zzj);
    }
    else
    {
      if (this.zzx == 0) {
        l2 = zzm(zzn());
      } else {
        l2 = zzfn.zzm(this.zzl + l3, this.zzj);
      }
      l1 = l2;
      if (!paramBoolean) {
        l1 = Math.max(0L, l2 - this.zzo);
      }
    }
    if (this.zzE != bool)
    {
      this.zzG = this.zzD;
      this.zzF = this.zzC;
    }
    long l5 = l3 - this.zzG;
    long l2 = l1;
    if (l5 < 1000000L)
    {
      l4 = this.zzF;
      l2 = zzfn.zzm(l5, this.zzj);
      l5 = l5 * 1000L / 1000000L;
      l2 = (l1 * l5 + (1000L - l5) * (l4 + l2)) / 1000L;
    }
    if (!this.zzk)
    {
      l1 = this.zzC;
      if (l2 > l1)
      {
        this.zzk = true;
        i = zzfn.zza;
        float f = this.zzj;
        l4 = zzfn.zzq(zzfn.zzn(zzfn.zzq(l2 - l1), f));
        l1 = System.currentTimeMillis();
        localObject2 = ((zzpr)this.zza).zza;
        if (zzpw.zzC((zzpw)localObject2) != null) {
          zzqc.zzW(((zzqb)zzpw.zzC((zzpw)localObject2)).zza).zzr(l1 - l4);
        }
      }
    }
    this.zzD = l3;
    this.zzC = l2;
    this.zzE = bool;
    return l2;
  }
  
  public final void zzc(long paramLong)
  {
    this.zzA = zzn();
    this.zzy = (SystemClock.elapsedRealtime() * 1000L);
    this.zzB = paramLong;
  }
  
  public final void zzd()
  {
    zzo();
    this.zzc = null;
    this.zzf = null;
  }
  
  public final void zze(AudioTrack paramAudioTrack, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzc = paramAudioTrack;
    this.zzd = paramInt2;
    this.zze = paramInt3;
    this.zzf = new zzpb(paramAudioTrack);
    this.zzg = paramAudioTrack.getSampleRate();
    boolean bool = true;
    if ((paramBoolean) && (zzfn.zza < 23))
    {
      paramBoolean = bool;
      i = paramInt1;
      if (paramInt1 == 5) {
        break label84;
      }
      if (paramInt1 == 6)
      {
        i = 6;
        paramBoolean = bool;
        break label84;
      }
    }
    paramBoolean = false;
    int i = paramInt1;
    label84:
    this.zzh = paramBoolean;
    paramBoolean = zzfn.zzC(i);
    this.zzq = paramBoolean;
    long l;
    if (paramBoolean) {
      l = zzm(paramInt3 / paramInt2);
    } else {
      l = -9223372036854775807L;
    }
    this.zzi = l;
    this.zzt = 0L;
    this.zzu = 0L;
    this.zzv = 0L;
    this.zzp = false;
    this.zzy = -9223372036854775807L;
    this.zzz = -9223372036854775807L;
    this.zzr = 0L;
    this.zzo = 0L;
    this.zzj = 1.0F;
  }
  
  public final void zzf()
  {
    zzpb localzzpb = this.zzf;
    Objects.requireNonNull(localzzpb);
    localzzpb.zze();
  }
  
  public final boolean zzg(long paramLong)
  {
    if (paramLong <= zzl(zzb(false))) {
      if (this.zzh)
      {
        AudioTrack localAudioTrack = this.zzc;
        Objects.requireNonNull(localAudioTrack);
        if ((localAudioTrack.getPlayState() == 2) && (zzn() == 0L)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public final boolean zzh()
  {
    AudioTrack localAudioTrack = this.zzc;
    Objects.requireNonNull(localAudioTrack);
    return localAudioTrack.getPlayState() == 3;
  }
  
  public final boolean zzi(long paramLong)
  {
    return (this.zzz != -9223372036854775807L) && (paramLong > 0L) && (SystemClock.elapsedRealtime() - this.zzz >= 200L);
  }
  
  public final boolean zzj(long paramLong)
  {
    Object localObject = this.zzc;
    Objects.requireNonNull(localObject);
    int j = ((AudioTrack)localObject).getPlayState();
    int i = j;
    if (this.zzh)
    {
      if (j == 2)
      {
        this.zzp = false;
        return false;
      }
      i = j;
      if (j == 1) {
        if (zzn() != 0L) {
          i = 1;
        } else {
          return false;
        }
      }
    }
    boolean bool1 = this.zzp;
    boolean bool2 = zzg(paramLong);
    this.zzp = bool2;
    if ((bool1) && (!bool2) && (i != 1))
    {
      localObject = this.zza;
      i = this.zze;
      long l1 = zzfn.zzq(this.zzi);
      localObject = (zzpr)localObject;
      if (zzpw.zzC(((zzpr)localObject).zza) != null)
      {
        long l2 = SystemClock.elapsedRealtime();
        localObject = ((zzpr)localObject).zza;
        paramLong = zzpw.zzx((zzpw)localObject);
        zzqc.zzW(((zzqb)zzpw.zzC((zzpw)localObject)).zza).zzt(i, l1, l2 - paramLong);
      }
    }
    return true;
  }
  
  public final boolean zzk()
  {
    zzo();
    if (this.zzy == -9223372036854775807L)
    {
      zzpb localzzpb = this.zzf;
      Objects.requireNonNull(localzzpb);
      localzzpb.zze();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */