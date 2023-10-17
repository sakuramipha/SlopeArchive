package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

final class zzrf
  extends MediaCodec.Callback
{
  private final Object zza = new Object();
  private final HandlerThread zzb;
  private Handler zzc;
  private final zzrj zzd;
  private final zzrj zze;
  private final ArrayDeque zzf;
  private final ArrayDeque zzg;
  private MediaFormat zzh;
  private MediaFormat zzi;
  private MediaCodec.CodecException zzj;
  private long zzk;
  private boolean zzl;
  private IllegalStateException zzm;
  
  zzrf(HandlerThread paramHandlerThread)
  {
    this.zzb = paramHandlerThread;
    this.zzd = new zzrj();
    this.zze = new zzrj();
    this.zzf = new ArrayDeque();
    this.zzg = new ArrayDeque();
  }
  
  private final void zzh(MediaFormat paramMediaFormat)
  {
    this.zze.zzb(-2);
    this.zzg.add(paramMediaFormat);
  }
  
  private final void zzi()
  {
    if (!this.zzg.isEmpty()) {
      this.zzi = ((MediaFormat)this.zzg.getLast());
    }
    this.zzd.zzc();
    this.zze.zzc();
    this.zzf.clear();
    this.zzg.clear();
  }
  
  private final void zzj()
  {
    IllegalStateException localIllegalStateException = this.zzm;
    if (localIllegalStateException == null) {
      return;
    }
    this.zzm = null;
    throw localIllegalStateException;
  }
  
  private final void zzk()
  {
    MediaCodec.CodecException localCodecException = this.zzj;
    if (localCodecException == null) {
      return;
    }
    this.zzj = null;
    throw localCodecException;
  }
  
  private final boolean zzl()
  {
    return (this.zzk > 0L) || (this.zzl);
  }
  
  public final void onError(MediaCodec arg1, MediaCodec.CodecException paramCodecException)
  {
    synchronized (this.zza)
    {
      this.zzj = paramCodecException;
      return;
    }
  }
  
  public final void onInputBufferAvailable(MediaCodec arg1, int paramInt)
  {
    synchronized (this.zza)
    {
      this.zzd.zzb(paramInt);
      return;
    }
  }
  
  public final void onOutputBufferAvailable(MediaCodec arg1, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    synchronized (this.zza)
    {
      MediaFormat localMediaFormat = this.zzi;
      if (localMediaFormat != null)
      {
        zzh(localMediaFormat);
        this.zzi = null;
      }
      this.zze.zzb(paramInt);
      this.zzf.add(paramBufferInfo);
      return;
    }
  }
  
  public final void onOutputFormatChanged(MediaCodec arg1, MediaFormat paramMediaFormat)
  {
    synchronized (this.zza)
    {
      zzh(paramMediaFormat);
      this.zzi = null;
      return;
    }
  }
  
  public final int zza()
  {
    synchronized (this.zza)
    {
      boolean bool = zzl();
      int i = -1;
      if (bool) {
        return -1;
      }
      zzj();
      zzk();
      if (!this.zzd.zzd()) {
        i = this.zzd.zza();
      }
      return i;
    }
  }
  
  public final int zzb(MediaCodec.BufferInfo paramBufferInfo)
  {
    synchronized (this.zza)
    {
      if (zzl()) {
        return -1;
      }
      zzj();
      zzk();
      if (this.zze.zzd()) {
        return -1;
      }
      int j = this.zze.zza();
      int i;
      if (j >= 0)
      {
        zzdy.zzb(this.zzh);
        MediaCodec.BufferInfo localBufferInfo = (MediaCodec.BufferInfo)this.zzf.remove();
        paramBufferInfo.set(localBufferInfo.offset, localBufferInfo.size, localBufferInfo.presentationTimeUs, localBufferInfo.flags);
        i = j;
      }
      else
      {
        i = j;
        if (j == -2)
        {
          this.zzh = ((MediaFormat)this.zzg.remove());
          i = -2;
        }
      }
      return i;
    }
  }
  
  public final MediaFormat zzc()
  {
    synchronized (this.zza)
    {
      Object localObject2 = this.zzh;
      if (localObject2 != null) {
        return (MediaFormat)localObject2;
      }
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public final void zze()
  {
    synchronized (this.zza)
    {
      this.zzk += 1L;
      Handler localHandler = this.zzc;
      int i = zzfn.zza;
      zzre localzzre = new com/google/android/gms/internal/ads/zzre;
      localzzre.<init>(this);
      localHandler.post(localzzre);
      return;
    }
  }
  
  public final void zzf(MediaCodec paramMediaCodec)
  {
    boolean bool;
    if (this.zzc == null) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzb.start();
    Handler localHandler = new Handler(this.zzb.getLooper());
    paramMediaCodec.setCallback(this, localHandler);
    this.zzc = localHandler;
  }
  
  public final void zzg()
  {
    synchronized (this.zza)
    {
      this.zzl = true;
      this.zzb.quit();
      zzi();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */