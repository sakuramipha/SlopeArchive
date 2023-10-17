package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class zzsg
  implements zzsd
{
  private final int zza;
  private MediaCodecInfo[] zzb;
  
  public zzsg(boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 1;
    int i = j;
    if (!paramBoolean1) {
      if (paramBoolean2) {
        i = j;
      } else {
        i = 0;
      }
    }
    this.zza = i;
  }
  
  @EnsuresNonNull({"mediaCodecInfos"})
  private final void zzf()
  {
    if (this.zzb == null) {
      this.zzb = new MediaCodecList(this.zza).getCodecInfos();
    }
  }
  
  public final int zza()
  {
    zzf();
    return this.zzb.length;
  }
  
  public final MediaCodecInfo zzb(int paramInt)
  {
    zzf();
    return this.zzb[paramInt];
  }
  
  public final boolean zzc(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureRequired(paramString1);
  }
  
  public final boolean zzd(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported(paramString1);
  }
  
  public final boolean zze()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */