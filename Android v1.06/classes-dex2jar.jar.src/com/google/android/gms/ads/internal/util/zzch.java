package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzch
{
  private static final Map zza = new HashMap();
  private static List zzb;
  private static final Object zzc = new Object();
  
  public static List zza(String paramString)
  {
    synchronized (zzc)
    {
      Object localObject1 = zza;
      if (((Map)localObject1).containsKey(paramString))
      {
        paramString = (List)((Map)localObject1).get(paramString);
        return paramString;
      }
      label131:
      Object localObject4;
      try
      {
        try
        {
          if (zzb != null) {
            break label131;
          }
          int j;
          int i;
          if (Build.VERSION.SDK_INT >= 21)
          {
            localObject1 = new android/media/MediaCodecList;
            ((MediaCodecList)localObject1).<init>(0);
            zzb = Arrays.asList(((MediaCodecList)localObject1).getCodecInfos());
          }
          else
          {
            j = MediaCodecList.getCodecCount();
            localObject1 = new java/util/ArrayList;
            ((ArrayList)localObject1).<init>(j);
            zzb = (List)localObject1;
            for (i = 0; i < j; i++)
            {
              localObject1 = MediaCodecList.getCodecInfoAt(i);
              zzb.add(localObject1);
            }
          }
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject4 = zzb.iterator();
          while (((Iterator)localObject4).hasNext())
          {
            Object localObject5 = (MediaCodecInfo)((Iterator)localObject4).next();
            if ((!((MediaCodecInfo)localObject5).isEncoder()) && (Arrays.asList(((MediaCodecInfo)localObject5).getSupportedTypes()).contains(paramString)))
            {
              HashMap localHashMap = new java/util/HashMap;
              localHashMap.<init>();
              localHashMap.put("codecName", ((MediaCodecInfo)localObject5).getName());
              localObject5 = ((MediaCodecInfo)localObject5).getCapabilitiesForType(paramString);
              Object localObject6 = new java/util/ArrayList;
              ((ArrayList)localObject6).<init>();
              for (MediaCodecInfo.CodecProfileLevel localCodecProfileLevel : ((MediaCodecInfo.CodecCapabilities)localObject5).profileLevels) {
                ((ArrayList)localObject6).add(new Integer[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
              }
              localHashMap.put("profileLevels", localObject6);
              if (Build.VERSION.SDK_INT >= 21)
              {
                localObject6 = ((MediaCodecInfo.CodecCapabilities)localObject5).getVideoCapabilities();
                localHashMap.put("bitRatesBps", zzb(((MediaCodecInfo.VideoCapabilities)localObject6).getBitrateRange()));
                localHashMap.put("widthAlignment", Integer.valueOf(((MediaCodecInfo.VideoCapabilities)localObject6).getWidthAlignment()));
                localHashMap.put("heightAlignment", Integer.valueOf(((MediaCodecInfo.VideoCapabilities)localObject6).getHeightAlignment()));
                localHashMap.put("frameRates", zzb(((MediaCodecInfo.VideoCapabilities)localObject6).getSupportedFrameRates()));
                localHashMap.put("widths", zzb(((MediaCodecInfo.VideoCapabilities)localObject6).getSupportedWidths()));
                localHashMap.put("heights", zzb(((MediaCodecInfo.VideoCapabilities)localObject6).getSupportedHeights()));
              }
              if (Build.VERSION.SDK_INT >= 23) {
                localHashMap.put("instancesLimit", Integer.valueOf(((MediaCodecInfo.CodecCapabilities)localObject5).getMaxSupportedInstances()));
              }
              ((ArrayList)localObject1).add(localHashMap);
            }
          }
          zza.put(paramString, localObject1);
          return (List)localObject1;
        }
        finally {}
        localObject4 = new java/util/HashMap;
      }
      catch (LinkageError localLinkageError) {}catch (RuntimeException localRuntimeException) {}
      ((HashMap)localObject4).<init>();
      ((Map)localObject4).put("error", localRuntimeException.getClass().getSimpleName());
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localArrayList.add(localObject4);
      zza.put(paramString, localArrayList);
      return localArrayList;
    }
  }
  
  private static Integer[] zzb(Range paramRange)
  {
    return new Integer[] { (Integer)paramRange.getLower(), (Integer)paramRange.getUpper() };
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */