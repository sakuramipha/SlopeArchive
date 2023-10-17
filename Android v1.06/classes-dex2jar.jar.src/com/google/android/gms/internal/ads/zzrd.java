package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class zzrd
{
  private static final ArrayDeque zza = new ArrayDeque();
  private static final Object zzb = new Object();
  private final MediaCodec zzc;
  private final HandlerThread zzd;
  private Handler zze;
  private final AtomicReference zzf;
  private final zzeb zzg;
  private boolean zzh;
  
  public zzrd(MediaCodec paramMediaCodec, HandlerThread paramHandlerThread)
  {
    this.zzc = paramMediaCodec;
    this.zzd = paramHandlerThread;
    this.zzg = localzzeb;
    this.zzf = new AtomicReference();
  }
  
  private static zzrc zzh()
  {
    synchronized (zza)
    {
      if (???.isEmpty())
      {
        localzzrc = new com/google/android/gms/internal/ads/zzrc;
        localzzrc.<init>();
        return localzzrc;
      }
      zzrc localzzrc = (zzrc)???.removeFirst();
      return localzzrc;
    }
  }
  
  private static byte[] zzi(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null) {
      return paramArrayOfByte2;
    }
    if (paramArrayOfByte2 != null)
    {
      int i = paramArrayOfByte1.length;
      if (paramArrayOfByte2.length >= i)
      {
        System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, i);
        return paramArrayOfByte2;
      }
    }
    return Arrays.copyOf(paramArrayOfByte1, paramArrayOfByte1.length);
  }
  
  private static int[] zzj(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramArrayOfInt1 == null) {
      return paramArrayOfInt2;
    }
    if (paramArrayOfInt2 != null)
    {
      int i = paramArrayOfInt1.length;
      if (paramArrayOfInt2.length >= i)
      {
        System.arraycopy(paramArrayOfInt1, 0, paramArrayOfInt2, 0, i);
        return paramArrayOfInt2;
      }
    }
    return Arrays.copyOf(paramArrayOfInt1, paramArrayOfInt1.length);
  }
  
  public final void zzb()
  {
    if (this.zzh) {
      try
      {
        Handler localHandler = this.zze;
        Objects.requireNonNull(localHandler);
        localHandler.removeCallbacksAndMessages(null);
        this.zzg.zzc();
        localHandler = this.zze;
        Objects.requireNonNull(localHandler);
        localHandler.obtainMessage(2).sendToTarget();
        this.zzg.zza();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        throw new IllegalStateException(localInterruptedException);
      }
    }
  }
  
  public final void zzc()
  {
    RuntimeException localRuntimeException = (RuntimeException)this.zzf.getAndSet(null);
    if (localRuntimeException == null) {
      return;
    }
    throw localRuntimeException;
  }
  
  public final void zzd(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    zzc();
    zzrc localzzrc = zzh();
    localzzrc.zza(paramInt1, 0, paramInt3, paramLong, paramInt4);
    Handler localHandler = this.zze;
    paramInt1 = zzfn.zza;
    localHandler.obtainMessage(0, localzzrc).sendToTarget();
  }
  
  public final void zze(int paramInt1, int paramInt2, zzhf paramzzhf, long paramLong, int paramInt3)
  {
    zzc();
    zzrc localzzrc = zzh();
    localzzrc.zza(paramInt1, 0, 0, paramLong, 0);
    MediaCodec.CryptoInfo localCryptoInfo = localzzrc.zzd;
    localCryptoInfo.numSubSamples = paramzzhf.zzf;
    localCryptoInfo.numBytesOfClearData = zzj(paramzzhf.zzd, localCryptoInfo.numBytesOfClearData);
    localCryptoInfo.numBytesOfEncryptedData = zzj(paramzzhf.zze, localCryptoInfo.numBytesOfEncryptedData);
    byte[] arrayOfByte = zzi(paramzzhf.zzb, localCryptoInfo.key);
    Objects.requireNonNull(arrayOfByte);
    localCryptoInfo.key = arrayOfByte;
    arrayOfByte = zzi(paramzzhf.zza, localCryptoInfo.iv);
    Objects.requireNonNull(arrayOfByte);
    localCryptoInfo.iv = arrayOfByte;
    localCryptoInfo.mode = paramzzhf.zzc;
    if (zzfn.zza >= 24) {
      localCryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(paramzzhf.zzg, paramzzhf.zzh));
    }
    this.zze.obtainMessage(1, localzzrc).sendToTarget();
  }
  
  public final void zzf()
  {
    if (this.zzh)
    {
      zzb();
      this.zzd.quit();
    }
    this.zzh = false;
  }
  
  public final void zzg()
  {
    if (!this.zzh)
    {
      this.zzd.start();
      this.zze = new zzrb(this, this.zzd.getLooper());
      this.zzh = true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */