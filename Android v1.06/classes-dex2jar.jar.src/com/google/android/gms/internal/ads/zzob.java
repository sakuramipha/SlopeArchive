package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent.Builder;
import android.media.metrics.PlaybackErrorEvent.Builder;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent.Builder;
import android.media.metrics.TrackChangeEvent.Builder;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzob
  implements zzlv, zzoc
{
  private final Context zza;
  private final zzod zzb;
  private final PlaybackSession zzc;
  private final long zzd;
  private final zzcw zze;
  private final zzcu zzf;
  private final HashMap zzg;
  private final HashMap zzh;
  private String zzi;
  private PlaybackMetrics.Builder zzj;
  private int zzk;
  private int zzl;
  private int zzm;
  private zzcg zzn;
  private zzoa zzo;
  private zzoa zzp;
  private zzoa zzq;
  private zzam zzr;
  private zzam zzs;
  private zzam zzt;
  private boolean zzu;
  private boolean zzv;
  private int zzw;
  private int zzx;
  private int zzy;
  private boolean zzz;
  
  private zzob(Context paramContext, PlaybackSession paramPlaybackSession)
  {
    this.zza = paramContext.getApplicationContext();
    this.zzc = paramPlaybackSession;
    this.zze = new zzcw();
    this.zzf = new zzcu();
    this.zzh = new HashMap();
    this.zzg = new HashMap();
    this.zzd = SystemClock.elapsedRealtime();
    this.zzl = 0;
    this.zzm = 0;
    paramContext = new zznz(zznz.zza);
    this.zzb = paramContext;
    paramContext.zzg(this);
  }
  
  public static zzob zzb(Context paramContext)
  {
    MediaMetricsManager localMediaMetricsManager = (MediaMetricsManager)paramContext.getSystemService("media_metrics");
    if (localMediaMetricsManager == null) {
      return null;
    }
    return new zzob(paramContext, localMediaMetricsManager.createPlaybackSession());
  }
  
  private static int zzr(int paramInt)
  {
    switch (zzfn.zzh(paramInt))
    {
    default: 
      return 27;
    case 6005: 
      return 26;
    case 6004: 
      return 25;
    case 6003: 
      return 28;
    }
    return 24;
  }
  
  private final void zzs()
  {
    Object localObject = this.zzj;
    if ((localObject != null) && (this.zzz))
    {
      ((PlaybackMetrics.Builder)localObject).setAudioUnderrunCount(this.zzy);
      this.zzj.setVideoFramesDropped(this.zzw);
      this.zzj.setVideoFramesPlayed(this.zzx);
      localObject = (Long)this.zzg.get(this.zzi);
      PlaybackMetrics.Builder localBuilder = this.zzj;
      long l;
      if (localObject == null) {
        l = 0L;
      } else {
        l = ((Long)localObject).longValue();
      }
      localBuilder.setNetworkTransferDurationMillis(l);
      localObject = (Long)this.zzh.get(this.zzi);
      localBuilder = this.zzj;
      if (localObject == null) {
        l = 0L;
      } else {
        l = ((Long)localObject).longValue();
      }
      localBuilder.setNetworkBytesRead(l);
      localBuilder = this.zzj;
      int i;
      if ((localObject != null) && (((Long)localObject).longValue() > 0L)) {
        i = 1;
      } else {
        i = 0;
      }
      localBuilder.setStreamSource(i);
      this.zzc.reportPlaybackMetrics(this.zzj.build());
    }
    this.zzj = null;
    this.zzi = null;
    this.zzy = 0;
    this.zzw = 0;
    this.zzx = 0;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzz = false;
  }
  
  private final void zzt(long paramLong, zzam paramzzam, int paramInt)
  {
    if (zzfn.zzB(this.zzs, paramzzam)) {
      return;
    }
    if (this.zzs == null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    this.zzs = paramzzam;
    zzx(0, paramLong, paramzzam, paramInt);
  }
  
  private final void zzu(long paramLong, zzam paramzzam, int paramInt)
  {
    if (zzfn.zzB(this.zzt, paramzzam)) {
      return;
    }
    if (this.zzt == null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    this.zzt = paramzzam;
    zzx(2, paramLong, paramzzam, paramInt);
  }
  
  @RequiresNonNull({"metricsBuilder"})
  private final void zzv(zzcx paramzzcx, zztl paramzztl)
  {
    PlaybackMetrics.Builder localBuilder = this.zzj;
    if (paramzztl == null) {
      return;
    }
    int j = paramzzcx.zza(paramzztl.zza);
    if (j == -1) {
      return;
    }
    paramzztl = this.zzf;
    int i = 0;
    paramzzcx.zzd(j, paramzztl, false);
    paramzzcx.zze(this.zzf.zzd, this.zze, 0L);
    paramzzcx = this.zze.zzd.zzd;
    j = 2;
    if (paramzzcx != null)
    {
      i = zzfn.zzl(paramzzcx.zza);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            i = 1;
          } else {
            i = 4;
          }
        }
        else {
          i = 5;
        }
      }
      else {
        i = 3;
      }
    }
    localBuilder.setStreamType(i);
    paramzzcx = this.zze;
    if ((paramzzcx.zzn != -9223372036854775807L) && (!paramzzcx.zzl) && (!paramzzcx.zzi) && (!paramzzcx.zzb())) {
      localBuilder.setMediaDurationMillis(zzfn.zzq(this.zze.zzn));
    }
    i = j;
    if (true != this.zze.zzb()) {
      i = 1;
    }
    localBuilder.setPlaybackType(i);
    this.zzz = true;
  }
  
  private final void zzw(long paramLong, zzam paramzzam, int paramInt)
  {
    if (zzfn.zzB(this.zzr, paramzzam)) {
      return;
    }
    if (this.zzr == null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    this.zzr = paramzzam;
    zzx(1, paramLong, paramzzam, paramInt);
  }
  
  private final void zzx(int paramInt1, long paramLong, zzam paramzzam, int paramInt2)
  {
    TrackChangeEvent.Builder localBuilder = new TrackChangeEvent.Builder(paramInt1).setTimeSinceCreatedMillis(paramLong - this.zzd);
    if (paramzzam != null)
    {
      localBuilder.setTrackState(1);
      if (paramInt2 != 1) {
        paramInt1 = 1;
      } else {
        paramInt1 = 2;
      }
      localBuilder.setTrackChangeReason(paramInt1);
      Object localObject1 = paramzzam.zzl;
      if (localObject1 != null) {
        localBuilder.setContainerMimeType((String)localObject1);
      }
      localObject1 = paramzzam.zzm;
      if (localObject1 != null) {
        localBuilder.setSampleMimeType((String)localObject1);
      }
      localObject1 = paramzzam.zzj;
      if (localObject1 != null) {
        localBuilder.setCodecName((String)localObject1);
      }
      paramInt1 = paramzzam.zzi;
      if (paramInt1 != -1) {
        localBuilder.setBitrate(paramInt1);
      }
      paramInt1 = paramzzam.zzr;
      if (paramInt1 != -1) {
        localBuilder.setWidth(paramInt1);
      }
      paramInt1 = paramzzam.zzs;
      if (paramInt1 != -1) {
        localBuilder.setHeight(paramInt1);
      }
      paramInt1 = paramzzam.zzz;
      if (paramInt1 != -1) {
        localBuilder.setChannelCount(paramInt1);
      }
      paramInt1 = paramzzam.zzA;
      if (paramInt1 != -1) {
        localBuilder.setAudioSampleRate(paramInt1);
      }
      localObject1 = paramzzam.zzd;
      if (localObject1 != null)
      {
        paramInt1 = zzfn.zza;
        localObject1 = ((String)localObject1).split("-", -1);
        Object localObject2 = localObject1[0];
        if (localObject1.length >= 2) {
          localObject1 = localObject1[1];
        } else {
          localObject1 = null;
        }
        localObject1 = Pair.create(localObject2, localObject1);
        localBuilder.setLanguage((String)((Pair)localObject1).first);
        if (((Pair)localObject1).second != null) {
          localBuilder.setLanguageRegion((String)((Pair)localObject1).second);
        }
      }
      float f = paramzzam.zzt;
      if (f != -1.0F) {
        localBuilder.setVideoFrameRate(f);
      }
    }
    else
    {
      localBuilder.setTrackState(0);
    }
    this.zzz = true;
    this.zzc.reportTrackChangeEvent(localBuilder.build());
  }
  
  @EnsuresNonNullIf(expression={"#1"}, result=true)
  private final boolean zzy(zzoa paramzzoa)
  {
    return (paramzzoa != null) && (paramzzoa.zzc.equals(this.zzb.zzd()));
  }
  
  public final LogSessionId zza()
  {
    return this.zzc.getSessionId();
  }
  
  public final void zzc(zzlt paramzzlt, String paramString)
  {
    zztl localzztl = paramzzlt.zzd;
    if ((localzztl != null) && (localzztl.zzb())) {
      return;
    }
    zzs();
    this.zzi = paramString;
    this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.1");
    zzv(paramzzlt.zzb, paramzzlt.zzd);
  }
  
  public final void zzd(zzlt paramzzlt, String paramString, boolean paramBoolean)
  {
    paramzzlt = paramzzlt.zzd;
    if (((paramzzlt == null) || (!paramzzlt.zzb())) && (paramString.equals(this.zzi))) {
      zzs();
    }
    this.zzg.remove(paramString);
    this.zzh.remove(paramString);
  }
  
  public final void zzf(zzlt paramzzlt, int paramInt, long paramLong1, long paramLong2)
  {
    Object localObject = paramzzlt.zzd;
    if (localObject != null)
    {
      paramzzlt = this.zzb.zze(paramzzlt.zzb, (zztl)localObject);
      Long localLong = (Long)this.zzh.get(paramzzlt);
      localObject = (Long)this.zzg.get(paramzzlt);
      HashMap localHashMap = this.zzh;
      long l = 0L;
      if (localLong == null) {
        paramLong2 = 0L;
      } else {
        paramLong2 = localLong.longValue();
      }
      localHashMap.put(paramzzlt, Long.valueOf(paramLong2 + paramLong1));
      localHashMap = this.zzg;
      if (localObject == null) {
        paramLong1 = l;
      } else {
        paramLong1 = ((Long)localObject).longValue();
      }
      localHashMap.put(paramzzlt, Long.valueOf(paramLong1 + paramInt));
    }
  }
  
  public final void zzg(zzlt paramzzlt, zzth paramzzth)
  {
    zztl localzztl = paramzzlt.zzd;
    if (localzztl == null) {
      return;
    }
    zzam localzzam = paramzzth.zzb;
    Objects.requireNonNull(localzzam);
    paramzzlt = new zzoa(localzzam, 0, this.zzb.zze(paramzzlt.zzb, localzztl));
    int i = paramzzth.zza;
    if (i != 0) {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return;
          }
          this.zzq = paramzzlt;
        }
      }
      else
      {
        this.zzp = paramzzlt;
        return;
      }
    }
    this.zzo = paramzzlt;
  }
  
  public final void zzi(zzcq paramzzcq, zzlu paramzzlu)
  {
    if (paramzzlu.zzb() != 0)
    {
      int k = 0;
      for (int i = 0; i < paramzzlu.zzb(); i++)
      {
        j = paramzzlu.zza(i);
        localObject1 = paramzzlu.zzc(j);
        if (j == 0) {
          this.zzb.zzj((zzlt)localObject1);
        } else if (j == 11) {
          this.zzb.zzi((zzlt)localObject1, this.zzk);
        } else {
          this.zzb.zzh((zzlt)localObject1);
        }
      }
      long l = SystemClock.elapsedRealtime();
      if (paramzzlu.zzd(0))
      {
        localObject1 = paramzzlu.zzc(0);
        if (this.zzj != null) {
          zzv(((zzlt)localObject1).zzb, ((zzlt)localObject1).zzd);
        }
      }
      Object localObject3;
      Object localObject2;
      if ((paramzzlu.zzd(2)) && (this.zzj != null))
      {
        localObject3 = paramzzcq.zzo().zza();
        int m = ((List)localObject3).size();
        for (i = 0; i < m; i++)
        {
          localObject2 = (zzdh)((List)localObject3).get(i);
          for (j = 0;; j++)
          {
            int n = ((zzdh)localObject2).zzb;
            if (j > 0) {
              break;
            }
            if (((zzdh)localObject2).zzd(j))
            {
              localObject1 = ((zzdh)localObject2).zzb(j).zzp;
              if (localObject1 != null) {
                break label253;
              }
            }
          }
        }
        localObject1 = null;
        label253:
        if (localObject1 != null)
        {
          localObject3 = this.zzj;
          i = zzfn.zza;
          for (i = 0; i < ((zzad)localObject1).zzb; i++)
          {
            localObject2 = ((zzad)localObject1).zza(i).zza;
            if (((UUID)localObject2).equals(zzo.zzd))
            {
              i = 3;
              break label347;
            }
            if (((UUID)localObject2).equals(zzo.zze))
            {
              i = 2;
              break label347;
            }
            if (((UUID)localObject2).equals(zzo.zzc))
            {
              i = 6;
              break label347;
            }
          }
          i = 1;
          label347:
          ((PlaybackMetrics.Builder)localObject3).setDrmType(i);
        }
      }
      if (paramzzlu.zzd(1011)) {
        this.zzy += 1;
      }
      Object localObject1 = this.zzn;
      boolean bool1;
      if (localObject1 != null)
      {
        localObject3 = this.zza;
        i = ((zzcg)localObject1).zzb;
        j = 23;
        if (i == 1001)
        {
          j = 20;
          i = k;
        }
        else
        {
          localObject2 = (zzia)localObject1;
          if (((zzia)localObject2).zze == 1) {
            i = 1;
          } else {
            i = 0;
          }
          k = ((zzia)localObject2).zzi;
          localObject2 = ((zzcg)localObject1).getCause();
          Objects.requireNonNull(localObject2);
          if ((localObject2 instanceof IOException))
          {
            if ((localObject2 instanceof zzgs))
            {
              i = ((zzgs)localObject2).zzd;
              j = 5;
              break label1120;
            }
            if ((!(localObject2 instanceof zzgr)) && (!(localObject2 instanceof zzce)))
            {
              bool1 = localObject2 instanceof zzgq;
              if ((!bool1) && (!(localObject2 instanceof zzha)))
              {
                if (((zzcg)localObject1).zzb == 1002)
                {
                  i = 0;
                  j = 21;
                  break label1120;
                }
                if ((localObject2 instanceof zzqj))
                {
                  localObject2 = ((Throwable)localObject2).getCause();
                  Objects.requireNonNull(localObject2);
                  if ((zzfn.zza >= 21) && ((localObject2 instanceof MediaDrm.MediaDrmStateException)))
                  {
                    i = zzfn.zzi(((MediaDrm.MediaDrmStateException)localObject2).getDiagnosticInfo());
                    j = zzr(i);
                    break label1111;
                  }
                  if ((zzfn.zza >= 23) && ((localObject2 instanceof MediaDrmResetException)))
                  {
                    i = 0;
                    j = 27;
                    break label1120;
                  }
                  if ((localObject2 instanceof NotProvisionedException))
                  {
                    i = 0;
                    j = 24;
                    break label1120;
                  }
                  if ((localObject2 instanceof DeniedByServerException))
                  {
                    i = 0;
                    j = 29;
                    break label1120;
                  }
                  if (!(localObject2 instanceof zzqu))
                  {
                    if ((localObject2 instanceof zzqh))
                    {
                      i = 0;
                      j = 28;
                      break label1120;
                    }
                    i = 0;
                    j = 30;
                    break label1120;
                  }
                }
                else
                {
                  if (((localObject2 instanceof zzgm)) && ((((Throwable)localObject2).getCause() instanceof FileNotFoundException)))
                  {
                    localObject2 = ((Throwable)localObject2).getCause();
                    Objects.requireNonNull(localObject2);
                    localObject2 = ((Throwable)localObject2).getCause();
                    if ((zzfn.zza >= 21) && ((localObject2 instanceof ErrnoException)) && (((ErrnoException)localObject2).errno == OsConstants.EACCES))
                    {
                      i = 0;
                      j = 32;
                      break label1120;
                    }
                    i = 0;
                    j = 31;
                    break label1120;
                  }
                  i = 0;
                  j = 9;
                  break label1120;
                }
              }
              else
              {
                if (zzfb.zzb((Context)localObject3).zza() == 1)
                {
                  i = 0;
                  j = 3;
                  break label1120;
                }
                localObject3 = ((Throwable)localObject2).getCause();
                if ((localObject3 instanceof UnknownHostException))
                {
                  i = 0;
                  j = 6;
                  break label1120;
                }
                if ((localObject3 instanceof SocketTimeoutException))
                {
                  i = 0;
                  j = 7;
                  break label1120;
                }
                if ((bool1) && (((zzgq)localObject2).zzc == 1))
                {
                  i = 0;
                  j = 4;
                  break label1120;
                }
                i = 0;
                j = 8;
                break label1120;
              }
            }
            else
            {
              i = 0;
              j = 11;
              break label1120;
            }
          }
          else
          {
            if ((i != 0) && ((k == 0) || (k == 1)))
            {
              i = 0;
              j = 35;
              break label1120;
            }
            if ((i != 0) && (k == 3))
            {
              i = 0;
              j = 15;
              break label1120;
            }
            if ((i == 0) || (k != 2)) {
              break label969;
            }
          }
          i = 0;
          break label1120;
          label969:
          if ((localObject2 instanceof zzrr))
          {
            i = zzfn.zzi(((zzrr)localObject2).zzd);
            j = 13;
          }
          else
          {
            if ((localObject2 instanceof zzrn)) {}
            for (i = zzfn.zzi(((zzrn)localObject2).zzb);; i = 0)
            {
              j = 14;
              break label1120;
              if (!(localObject2 instanceof OutOfMemoryError)) {
                break;
              }
            }
            if ((localObject2 instanceof zzov))
            {
              i = ((zzov)localObject2).zza;
              j = 17;
            }
            else if ((localObject2 instanceof zzoy))
            {
              i = ((zzoy)localObject2).zza;
              j = 18;
            }
            else
            {
              i = zzfn.zza;
              if ((localObject2 instanceof MediaCodec.CryptoException))
              {
                i = ((MediaCodec.CryptoException)localObject2).getErrorCode();
                j = zzr(i);
              }
              else
              {
                label1111:
                i = 0;
                j = 22;
              }
            }
          }
        }
        label1120:
        this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(l - this.zzd).setErrorCode(j).setSubErrorCode(i).setException((Exception)localObject1).build());
        this.zzz = true;
        this.zzn = null;
      }
      if (paramzzlu.zzd(2))
      {
        localObject1 = paramzzcq.zzo();
        boolean bool4 = ((zzdi)localObject1).zzb(2);
        boolean bool3 = ((zzdi)localObject1).zzb(1);
        boolean bool2 = ((zzdi)localObject1).zzb(3);
        bool1 = bool2;
        if (!bool4)
        {
          bool1 = bool2;
          if (!bool3)
          {
            if (!bool2) {
              break label1279;
            }
            bool1 = true;
          }
        }
        if (!bool4) {
          zzw(l, null, 0);
        }
        if (!bool3) {
          zzt(l, null, 0);
        }
        if (!bool1) {
          zzu(l, null, 0);
        }
      }
      label1279:
      if (zzy(this.zzo))
      {
        localObject1 = this.zzo;
        localObject2 = ((zzoa)localObject1).zza;
        if (((zzam)localObject2).zzs != -1)
        {
          i = ((zzoa)localObject1).zzb;
          zzw(l, (zzam)localObject2, 0);
          this.zzo = null;
        }
      }
      if (zzy(this.zzp))
      {
        localObject1 = this.zzp;
        localObject2 = ((zzoa)localObject1).zza;
        i = ((zzoa)localObject1).zzb;
        zzt(l, (zzam)localObject2, 0);
        this.zzp = null;
      }
      if (zzy(this.zzq))
      {
        localObject2 = this.zzq;
        localObject1 = ((zzoa)localObject2).zza;
        i = ((zzoa)localObject2).zzb;
        zzu(l, (zzam)localObject1, 0);
        this.zzq = null;
      }
      switch (zzfb.zzb(this.zza).zza())
      {
      case 6: 
      case 8: 
      default: 
        i = 1;
        break;
      case 10: 
        i = 7;
        break;
      case 9: 
        i = 8;
        break;
      case 7: 
        i = 3;
        break;
      case 5: 
        i = 6;
        break;
      case 4: 
        i = 5;
        break;
      case 3: 
        i = 4;
        break;
      case 2: 
        i = 2;
        break;
      case 1: 
        i = 9;
        break;
      case 0: 
        i = 0;
      }
      if (i != this.zzm)
      {
        this.zzm = i;
        this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(l - this.zzd).build());
      }
      if (paramzzcq.zzf() != 2) {
        this.zzu = false;
      }
      if (((zzlj)paramzzcq).zzC() == null) {
        this.zzv = false;
      } else if (paramzzlu.zzd(10)) {
        this.zzv = true;
      }
      int j = paramzzcq.zzf();
      if (this.zzu)
      {
        i = 5;
      }
      else if (this.zzv)
      {
        i = 13;
      }
      else
      {
        i = 4;
        if (j == 4)
        {
          i = 11;
        }
        else if (j == 2)
        {
          i = this.zzl;
          if ((i != 0) && (i != 2))
          {
            if (!paramzzcq.zzv()) {
              i = 7;
            } else if (paramzzcq.zzg() != 0) {
              i = 10;
            } else {
              i = 6;
            }
          }
          else {
            i = 2;
          }
        }
        else if (j == 3)
        {
          if (paramzzcq.zzv()) {
            if (paramzzcq.zzg() != 0) {
              i = 9;
            } else {
              i = 3;
            }
          }
        }
        else if ((j == 1) && (this.zzl != 0))
        {
          i = 12;
        }
        else
        {
          i = this.zzl;
        }
      }
      if (this.zzl != i)
      {
        this.zzl = i;
        this.zzz = true;
        this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(l - this.zzd).build());
      }
      if (paramzzlu.zzd(1028)) {
        this.zzb.zzf(paramzzlu.zzc(1028));
      }
    }
  }
  
  public final void zzj(zzlt paramzzlt, zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean) {}
  
  public final void zzl(zzlt paramzzlt, zzcg paramzzcg)
  {
    this.zzn = paramzzcg;
  }
  
  public final void zzm(zzlt paramzzlt, zzcp paramzzcp1, zzcp paramzzcp2, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 1)
    {
      this.zzu = true;
      i = 1;
    }
    this.zzk = i;
  }
  
  public final void zzo(zzlt paramzzlt, zzhs paramzzhs)
  {
    this.zzw += paramzzhs.zzg;
    this.zzx += paramzzhs.zze;
  }
  
  public final void zzq(zzlt paramzzlt, zzdn paramzzdn)
  {
    paramzzlt = this.zzo;
    if (paramzzlt != null)
    {
      Object localObject = paramzzlt.zza;
      if (((zzam)localObject).zzs == -1)
      {
        localObject = ((zzam)localObject).zzb();
        ((zzak)localObject).zzX(paramzzdn.zzc);
        ((zzak)localObject).zzF(paramzzdn.zzd);
        this.zzo = new zzoa(((zzak)localObject).zzY(), 0, paramzzlt.zzc);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */