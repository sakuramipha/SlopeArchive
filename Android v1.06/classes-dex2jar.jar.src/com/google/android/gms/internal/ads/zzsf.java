package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class zzsf
  implements zzsd
{
  public final int zza()
  {
    return MediaCodecList.getCodecCount();
  }
  
  public final MediaCodecInfo zzb(int paramInt)
  {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }
  
  public final boolean zzc(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return false;
  }
  
  public final boolean zzd(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return ("secure-playback".equals(paramString1)) && ("video/avc".equals(paramString2));
  }
  
  public final boolean zze()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */