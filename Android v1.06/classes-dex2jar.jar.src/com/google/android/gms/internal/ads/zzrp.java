package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

public final class zzrp
{
  public final String zza;
  public final String zzb;
  public final String zzc;
  public final MediaCodecInfo.CodecCapabilities zzd;
  public final boolean zze;
  public final boolean zzf;
  public final boolean zzg;
  private final boolean zzh;
  
  zzrp(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    Objects.requireNonNull(paramString1);
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramCodecCapabilities;
    this.zzg = paramBoolean1;
    this.zze = paramBoolean4;
    this.zzf = paramBoolean6;
    this.zzh = zzcd.zzg(paramString2);
  }
  
  public static zzrp zzc(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    if (paramCodecCapabilities != null)
    {
      int i = zzfn.zza;
      if ((paramCodecCapabilities.isFeatureSupported("adaptive-playback")) && ((zzfn.zza > 22) || ((!"ODROID-XU3".equals(zzfn.zzd)) && (!"Nexus 10".equals(zzfn.zzd))) || ((!"OMX.Exynos.AVC.Decoder".equals(paramString1)) && (!"OMX.Exynos.AVC.Decoder.secure".equals(paramString1)))))
      {
        paramBoolean4 = true;
        break label78;
      }
    }
    paramBoolean4 = false;
    label78:
    boolean bool;
    if ((paramCodecCapabilities != null) && (zzfn.zza >= 21) && (paramCodecCapabilities.isFeatureSupported("tunneled-playback"))) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!paramBoolean5) && ((paramCodecCapabilities == null) || (zzfn.zza < 21) || (!paramCodecCapabilities.isFeatureSupported("secure-playback")))) {
      paramBoolean5 = false;
    } else {
      paramBoolean5 = true;
    }
    return new zzrp(paramString1, paramString2, paramString3, paramCodecCapabilities, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, bool, paramBoolean5);
  }
  
  private static Point zzi(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2)
  {
    int k = paramVideoCapabilities.getWidthAlignment();
    int j = paramVideoCapabilities.getHeightAlignment();
    int i = zzfn.zza;
    return new Point((paramInt1 + k - 1) / k * k, (paramInt2 + j - 1) / j * j);
  }
  
  private final void zzj(String paramString)
  {
    String str1 = this.zza;
    String str2 = this.zzb;
    String str3 = zzfn.zze;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NoSupport [");
    localStringBuilder.append(paramString);
    localStringBuilder.append("] [");
    localStringBuilder.append(str1);
    localStringBuilder.append(", ");
    localStringBuilder.append(str2);
    localStringBuilder.append("] [");
    localStringBuilder.append(str3);
    localStringBuilder.append("]");
    zzer.zza("MediaCodecInfo", localStringBuilder.toString());
  }
  
  private static boolean zzk(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    Point localPoint = zzi(paramVideoCapabilities, paramInt1, paramInt2);
    paramInt2 = localPoint.x;
    paramInt1 = localPoint.y;
    if ((paramDouble != -1.0D) && (paramDouble >= 1.0D)) {
      return paramVideoCapabilities.areSizeAndRateSupported(paramInt2, paramInt1, Math.floor(paramDouble));
    }
    return paramVideoCapabilities.isSizeSupported(paramInt2, paramInt1);
  }
  
  private final boolean zzl(zzam paramzzam, boolean paramBoolean)
  {
    Object localObject1 = zzsi.zzb(paramzzam);
    if (localObject1 == null) {
      return true;
    }
    int i = ((Integer)((Pair)localObject1).first).intValue();
    int n = ((Integer)((Pair)localObject1).second).intValue();
    boolean bool = "video/dolby-vision".equals(paramzzam.zzm);
    int m = 8;
    int j = n;
    int k = i;
    if (bool) {
      if ("video/avc".equals(this.zzb))
      {
        j = 0;
        k = 8;
      }
      else
      {
        j = n;
        k = i;
        if ("video/hevc".equals(this.zzb))
        {
          j = 0;
          k = 2;
        }
      }
    }
    if ((!this.zzh) && (k != 42)) {
      return true;
    }
    Object localObject2 = zzh();
    localObject1 = localObject2;
    if (zzfn.zza <= 23)
    {
      localObject1 = localObject2;
      if ("video/x-vnd.on2.vp9".equals(this.zzb))
      {
        localObject1 = localObject2;
        if (localObject2.length == 0)
        {
          localObject1 = this.zzd;
          if (localObject1 != null)
          {
            localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getVideoCapabilities();
            if (localObject1 != null)
            {
              i = ((Integer)((MediaCodecInfo.VideoCapabilities)localObject1).getBitrateRange().getUpper()).intValue();
              break label218;
            }
          }
          i = 0;
          label218:
          if (i >= 180000000) {
            i = 1024;
          } else if (i >= 120000000) {
            i = 512;
          } else if (i >= 60000000) {
            i = 256;
          } else if (i >= 30000000) {
            i = 128;
          } else if (i >= 18000000) {
            i = 64;
          } else if (i >= 12000000) {
            i = 32;
          } else if (i >= 7200000) {
            i = 16;
          } else if (i >= 3600000) {
            i = m;
          } else if (i >= 1800000) {
            i = 4;
          } else if (i >= 800000) {
            i = 2;
          } else {
            i = 1;
          }
          localObject1 = new MediaCodecInfo.CodecProfileLevel();
          ((MediaCodecInfo.CodecProfileLevel)localObject1).profile = 1;
          ((MediaCodecInfo.CodecProfileLevel)localObject1).level = i;
        }
      }
    }
    for (localObject2 : new MediaCodecInfo.CodecProfileLevel[] { localObject1 }) {
      if ((((MediaCodecInfo.CodecProfileLevel)localObject2).profile == k) && ((((MediaCodecInfo.CodecProfileLevel)localObject2).level >= j) || (!paramBoolean)) && ((!"video/hevc".equals(this.zzb)) || (k != 2) || ((!"sailfish".equals(zzfn.zzb)) && (!"marlin".equals(zzfn.zzb))))) {
        return true;
      }
    }
    localObject1 = paramzzam.zzj;
    localObject2 = this.zzc;
    paramzzam = new StringBuilder();
    paramzzam.append("codec.profileLevel, ");
    paramzzam.append((String)localObject1);
    paramzzam.append(", ");
    paramzzam.append((String)localObject2);
    zzj(paramzzam.toString());
    return false;
  }
  
  private final boolean zzm(zzam paramzzam)
  {
    return (this.zzb.equals(paramzzam.zzm)) || (this.zzb.equals(zzsi.zze(paramzzam)));
  }
  
  public final String toString()
  {
    return this.zza;
  }
  
  public final Point zza(int paramInt1, int paramInt2)
  {
    Object localObject = this.zzd;
    if (localObject == null) {
      return null;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null) {
      return null;
    }
    return zzi((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2);
  }
  
  public final zzht zzb(zzam paramzzam1, zzam paramzzam2)
  {
    int i;
    if (true != zzfn.zzB(paramzzam1.zzm, paramzzam2.zzm)) {
      i = 8;
    } else {
      i = 0;
    }
    int j;
    Object localObject;
    if (this.zzh)
    {
      j = i;
      if (paramzzam1.zzu != paramzzam2.zzu) {
        j = i | 0x400;
      }
      i = j;
      if (!this.zze) {
        if (paramzzam1.zzr == paramzzam2.zzr)
        {
          i = j;
          if (paramzzam1.zzs == paramzzam2.zzs) {}
        }
        else
        {
          i = j | 0x200;
        }
      }
      j = i;
      if (!zzfn.zzB(paramzzam1.zzy, paramzzam2.zzy)) {
        j = i | 0x800;
      }
      localObject = this.zza;
      i = j;
      if (zzfn.zzd.startsWith("SM-T230"))
      {
        i = j;
        if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(localObject))
        {
          i = j;
          if (!paramzzam1.zzd(paramzzam2)) {
            i = j | 0x2;
          }
        }
      }
      j = i;
      if (i == 0)
      {
        localObject = this.zza;
        if (true != paramzzam1.zzd(paramzzam2)) {
          i = 2;
        } else {
          i = 3;
        }
        return new zzht((String)localObject, paramzzam1, paramzzam2, i, 0);
      }
    }
    for (;;)
    {
      break;
      int k = i;
      if (paramzzam1.zzz != paramzzam2.zzz) {
        k = i | 0x1000;
      }
      j = k;
      if (paramzzam1.zzA != paramzzam2.zzA) {
        j = k | 0x2000;
      }
      i = j;
      if (paramzzam1.zzB != paramzzam2.zzB) {
        i = j | 0x4000;
      }
      if ((i == 0) && ("audio/mp4a-latm".equals(this.zzb)))
      {
        localObject = zzsi.zzb(paramzzam1);
        Pair localPair = zzsi.zzb(paramzzam2);
        if ((localObject != null) && (localPair != null))
        {
          j = ((Integer)((Pair)localObject).first).intValue();
          k = ((Integer)localPair.first).intValue();
          if ((j == 42) && (k == 42)) {
            return new zzht(this.zza, paramzzam1, paramzzam2, 3, 0);
          }
        }
      }
      j = i;
      if (!paramzzam1.zzd(paramzzam2)) {
        j = i | 0x20;
      }
      i = j;
      if ("audio/opus".equals(this.zzb)) {
        i = j | 0x2;
      }
      j = i;
      if (i == 0) {
        return new zzht(this.zza, paramzzam1, paramzzam2, 1, 0);
      }
    }
    return new zzht(this.zza, paramzzam1, paramzzam2, 0, j);
  }
  
  public final boolean zzd(zzam paramzzam)
  {
    return (zzm(paramzzam)) && (zzl(paramzzam, false));
  }
  
  public final boolean zze(zzam paramzzam)
    throws zzsc
  {
    boolean bool3 = zzm(paramzzam);
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bool3) {
      return false;
    }
    if (!zzl(paramzzam, true)) {
      return false;
    }
    int j;
    int i;
    if (this.zzh)
    {
      if ((paramzzam.zzr > 0) && (paramzzam.zzs > 0))
      {
        if (zzfn.zza >= 21) {
          return zzg(paramzzam.zzr, paramzzam.zzs, paramzzam.zzt);
        }
        bool1 = bool2;
        if (paramzzam.zzr * paramzzam.zzs <= zzsi.zza()) {
          bool1 = true;
        }
        if (!bool1)
        {
          j = paramzzam.zzr;
          i = paramzzam.zzs;
          paramzzam = new StringBuilder();
          paramzzam.append("legacyFrameSize, ");
          paramzzam.append(j);
          paramzzam.append("x");
          paramzzam.append(i);
          zzj(paramzzam.toString());
        }
        return bool1;
      }
      return true;
    }
    if (zzfn.zza >= 21)
    {
      i = paramzzam.zzA;
      Object localObject;
      if (i != -1)
      {
        localObject = this.zzd;
        if (localObject == null)
        {
          zzj("sampleRate.caps");
          break label663;
        }
        localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
        if (localObject == null)
        {
          zzj("sampleRate.aCaps");
          break label663;
        }
        if (!((MediaCodecInfo.AudioCapabilities)localObject).isSampleRateSupported(i))
        {
          paramzzam = new StringBuilder();
          paramzzam.append("sampleRate.support, ");
          paramzzam.append(i);
          zzj(paramzzam.toString());
          break label663;
        }
      }
      int k = paramzzam.zzz;
      if (k != -1)
      {
        paramzzam = this.zzd;
        if (paramzzam == null)
        {
          zzj("channelCount.caps");
        }
        else
        {
          MediaCodecInfo.AudioCapabilities localAudioCapabilities = paramzzam.getAudioCapabilities();
          if (localAudioCapabilities == null)
          {
            zzj("channelCount.aCaps");
          }
          else
          {
            paramzzam = this.zza;
            localObject = this.zzb;
            j = localAudioCapabilities.getMaxInputChannelCount();
            i = j;
            if (j <= 1) {
              if ((zzfn.zza >= 26) && (j > 0))
              {
                i = j;
              }
              else
              {
                i = j;
                if (!"audio/mpeg".equals(localObject))
                {
                  i = j;
                  if (!"audio/3gpp".equals(localObject))
                  {
                    i = j;
                    if (!"audio/amr-wb".equals(localObject))
                    {
                      i = j;
                      if (!"audio/mp4a-latm".equals(localObject))
                      {
                        i = j;
                        if (!"audio/vorbis".equals(localObject))
                        {
                          i = j;
                          if (!"audio/opus".equals(localObject))
                          {
                            i = j;
                            if (!"audio/raw".equals(localObject))
                            {
                              i = j;
                              if (!"audio/flac".equals(localObject))
                              {
                                i = j;
                                if (!"audio/g711-alaw".equals(localObject))
                                {
                                  i = j;
                                  if (!"audio/g711-mlaw".equals(localObject)) {
                                    if ("audio/gsm".equals(localObject))
                                    {
                                      i = j;
                                    }
                                    else
                                    {
                                      if ("audio/ac3".equals(localObject)) {
                                        i = 6;
                                      } else if ("audio/eac3".equals(localObject)) {
                                        i = 16;
                                      } else {
                                        i = 30;
                                      }
                                      localObject = new StringBuilder();
                                      ((StringBuilder)localObject).append("AssumedMaxChannelAdjustment: ");
                                      ((StringBuilder)localObject).append(paramzzam);
                                      ((StringBuilder)localObject).append(", [");
                                      ((StringBuilder)localObject).append(j);
                                      ((StringBuilder)localObject).append(" to ");
                                      ((StringBuilder)localObject).append(i);
                                      ((StringBuilder)localObject).append("]");
                                      zzer.zze("MediaCodecInfo", ((StringBuilder)localObject).toString());
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (i >= k) {
              break label660;
            }
            paramzzam = new StringBuilder();
            paramzzam.append("channelCount.support, ");
            paramzzam.append(k);
            zzj(paramzzam.toString());
          }
        }
        return false;
      }
    }
    label660:
    bool1 = true;
    label663:
    return bool1;
  }
  
  public final boolean zzf(zzam paramzzam)
  {
    if (this.zzh) {
      return this.zze;
    }
    paramzzam = zzsi.zzb(paramzzam);
    return (paramzzam != null) && (((Integer)paramzzam.first).intValue() == 42);
  }
  
  public final boolean zzg(int paramInt1, int paramInt2, double paramDouble)
  {
    Object localObject = this.zzd;
    if (localObject == null)
    {
      zzj("sizeAndRate.caps");
      return false;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null)
    {
      zzj("sizeAndRate.vCaps");
      return false;
    }
    if (zzfn.zza >= 29)
    {
      int i = zzro.zza((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble);
      if (i == 2) {
        return true;
      }
      if (i == 1)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.cover, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("@");
        ((StringBuilder)localObject).append(paramDouble);
        zzj(((StringBuilder)localObject).toString());
        return false;
      }
    }
    if (!zzk((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble)) {
      if ((paramInt1 < paramInt2) && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza)) || (!"mcv5a".equals(zzfn.zzb))) && (zzk((MediaCodecInfo.VideoCapabilities)localObject, paramInt2, paramInt1, paramDouble)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.rotated, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("@");
        ((StringBuilder)localObject).append(paramDouble);
        localObject = ((StringBuilder)localObject).toString();
        String str3 = this.zza;
        String str1 = this.zzb;
        String str2 = zzfn.zze;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("AssumedSupport [");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("] [");
        localStringBuilder.append(str3);
        localStringBuilder.append(", ");
        localStringBuilder.append(str1);
        localStringBuilder.append("] [");
        localStringBuilder.append(str2);
        localStringBuilder.append("]");
        zzer.zza("MediaCodecInfo", localStringBuilder.toString());
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.support, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("@");
        ((StringBuilder)localObject).append(paramDouble);
        zzj(((StringBuilder)localObject).toString());
        return false;
      }
    }
    return true;
  }
  
  public final MediaCodecInfo.CodecProfileLevel[] zzh()
  {
    Object localObject = this.zzd;
    if ((localObject != null) && (((MediaCodecInfo.CodecCapabilities)localObject).profileLevels != null)) {
      localObject = this.zzd.profileLevels;
    } else {
      localObject = new MediaCodecInfo.CodecProfileLevel[0];
    }
    return (MediaCodecInfo.CodecProfileLevel[])localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */