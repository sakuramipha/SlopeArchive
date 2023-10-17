package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

final class zzqz
  implements zzrm
{
  private final MediaCodec zza;
  private final zzrf zzb;
  private final zzrd zzc;
  private boolean zzd;
  private int zze;
  
  private static String zzs(int paramInt, String paramString)
  {
    paramString = new StringBuilder(paramString);
    if (paramInt == 1)
    {
      paramString.append("Audio");
    }
    else if (paramInt == 2)
    {
      paramString.append("Video");
    }
    else
    {
      paramString.append("Unknown(");
      paramString.append(paramInt);
      paramString.append(")");
    }
    return paramString.toString();
  }
  
  public final int zza()
  {
    this.zzc.zzc();
    return this.zzb.zza();
  }
  
  public final int zzb(MediaCodec.BufferInfo paramBufferInfo)
  {
    this.zzc.zzc();
    return this.zzb.zzb(paramBufferInfo);
  }
  
  public final MediaFormat zzc()
  {
    return this.zzb.zzc();
  }
  
  public final ByteBuffer zzf(int paramInt)
  {
    return this.zza.getInputBuffer(paramInt);
  }
  
  public final ByteBuffer zzg(int paramInt)
  {
    return this.zza.getOutputBuffer(paramInt);
  }
  
  public final void zzi()
  {
    this.zzc.zzb();
    this.zza.flush();
    this.zzb.zze();
    this.zza.start();
  }
  
  public final void zzj(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
  {
    this.zzc.zzd(paramInt1, 0, paramInt3, paramLong, paramInt4);
  }
  
  public final void zzk(int paramInt1, int paramInt2, zzhf paramzzhf, long paramLong, int paramInt3)
  {
    this.zzc.zze(paramInt1, 0, paramzzhf, paramLong, 0);
  }
  
  public final void zzl()
  {
    try
    {
      if (this.zze == 1)
      {
        this.zzc.zzf();
        this.zzb.zzg();
      }
      this.zze = 2;
      if (!this.zzd)
      {
        this.zza.release();
        this.zzd = true;
      }
      return;
    }
    finally
    {
      if (!this.zzd)
      {
        this.zza.release();
        this.zzd = true;
      }
    }
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */