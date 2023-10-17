package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class zzsk
  implements zzrm
{
  private final MediaCodec zza;
  private ByteBuffer[] zzb;
  private ByteBuffer[] zzc;
  
  public final int zza()
  {
    return this.zza.dequeueInputBuffer(0L);
  }
  
  public final int zzb(MediaCodec.BufferInfo paramBufferInfo)
  {
    int i;
    do
    {
      int j = this.zza.dequeueOutputBuffer(paramBufferInfo, 0L);
      i = j;
      if (j == -3)
      {
        if (zzfn.zza < 21) {
          this.zzc = this.zza.getOutputBuffers();
        }
        i = -3;
      }
    } while (i == -3);
    return i;
  }
  
  public final MediaFormat zzc()
  {
    return this.zza.getOutputFormat();
  }
  
  public final ByteBuffer zzf(int paramInt)
  {
    if (zzfn.zza >= 21) {
      return this.zza.getInputBuffer(paramInt);
    }
    return this.zzb[paramInt];
  }
  
  public final ByteBuffer zzg(int paramInt)
  {
    if (zzfn.zza >= 21) {
      return this.zza.getOutputBuffer(paramInt);
    }
    return this.zzc[paramInt];
  }
  
  public final void zzi()
  {
    this.zza.flush();
  }
  
  public final void zzj(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    this.zza.queueInputBuffer(paramInt1, 0, paramInt3, paramLong, paramInt4);
  }
  
  public final void zzk(int paramInt1, int paramInt2, zzhf paramzzhf, long paramLong, int paramInt3)
  {
    this.zza.queueSecureInputBuffer(paramInt1, 0, paramzzhf.zza(), paramLong, 0);
  }
  
  public final void zzl()
  {
    this.zzb = null;
    this.zzc = null;
    this.zza.release();
  }
  
  public final void zzm(int paramInt, long paramLong)
  {
    this.zza.releaseOutputBuffer(paramInt, paramLong);
  }
  
  public final void zzn(int paramInt, boolean paramBoolean)
  {
    this.zza.releaseOutputBuffer(paramInt, paramBoolean);
  }
  
  public final void zzo(Surface paramSurface)
  {
    this.zza.setOutputSurface(paramSurface);
  }
  
  public final void zzp(Bundle paramBundle)
  {
    this.zza.setParameters(paramBundle);
  }
  
  public final void zzq(int paramInt)
  {
    this.zza.setVideoScalingMode(paramInt);
  }
  
  public final boolean zzr()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */