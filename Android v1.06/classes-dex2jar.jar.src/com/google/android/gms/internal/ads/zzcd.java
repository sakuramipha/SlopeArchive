package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcd
{
  public static final int zza = 0;
  private static final ArrayList zzb = new ArrayList();
  private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
  
  public static int zza(String paramString1, String paramString2)
  {
    switch (paramString1.hashCode())
    {
    default: 
      break;
    case 1556697186: 
      if (paramString1.equals("audio/true-hd")) {
        i = 8;
      }
      break;
    case 1505942594: 
      if (paramString1.equals("audio/vnd.dts.hd")) {
        i = 7;
      }
      break;
    case 1504891608: 
      if (paramString1.equals("audio/opus")) {
        i = 9;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        i = 0;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        i = 3;
      }
      break;
    case 187078297: 
      if (paramString1.equals("audio/ac4")) {
        i = 5;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        i = 2;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        i = 1;
      }
      break;
    case -1095064472: 
      if (paramString1.equals("audio/vnd.dts")) {
        i = 6;
      }
      break;
    case -2123537834: 
      if (paramString1.equals("audio/eac3-joc")) {
        i = 4;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      return 0;
    case 9: 
      return 20;
    case 8: 
      return 14;
    case 7: 
      return 8;
    case 6: 
      return 7;
    case 5: 
      return 17;
    case 4: 
      return 18;
    case 3: 
      return 6;
    case 2: 
      return 5;
    case 1: 
      if (paramString2 == null) {
        return 0;
      }
      paramString1 = zzc(paramString2);
      if (paramString1 == null) {
        return 0;
      }
      return paramString1.zza();
    }
    return 9;
  }
  
  public static int zzb(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    int k = -1;
    if (bool) {
      return -1;
    }
    if (zzf(paramString)) {
      return 1;
    }
    if (!zzg(paramString))
    {
      if ((!"text".equals(zzh(paramString))) && (!"application/cea-608".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/x-mp4-cea-608".equals(paramString)) && (!"application/x-subrip".equals(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-quicktime-tx3g".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/x-rawcc".equals(paramString)) && (!"application/vobsub".equals(paramString)) && (!"application/pgs".equals(paramString)) && (!"application/dvbsubs".equals(paramString)))
      {
        if ("image".equals(zzh(paramString))) {
          return 4;
        }
        if ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)))
        {
          if (!"application/x-camera-motion".equals(paramString))
          {
            int m = zzb.size();
            int i;
            for (int j = 0;; j++)
            {
              i = k;
              if (j >= m) {
                break;
              }
              zzcb localzzcb = (zzcb)zzb.get(j);
              String str = localzzcb.zza;
              if (paramString.equals(null))
              {
                i = localzzcb.zzb;
                i = 0;
                break;
              }
            }
            return i;
          }
          return 6;
        }
        return 5;
      }
      return 3;
    }
    return 2;
  }
  
  static zzcc zzc(String paramString)
  {
    Object localObject = zzc.matcher(paramString);
    boolean bool = ((Matcher)localObject).matches();
    paramString = null;
    if (!bool) {
      return null;
    }
    String str = ((Matcher)localObject).group(1);
    Objects.requireNonNull(str);
    localObject = ((Matcher)localObject).group(2);
    try
    {
      int j = Integer.parseInt(str, 16);
      int i;
      if (localObject != null) {
        i = Integer.parseInt((String)localObject);
      } else {
        i = 0;
      }
      paramString = new zzcc(j, i);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return paramString;
  }
  
  public static String zzd(int paramInt)
  {
    if (paramInt != 32)
    {
      if (paramInt != 33)
      {
        if (paramInt != 35)
        {
          if (paramInt != 64)
          {
            if (paramInt != 163) {
              if (paramInt != 177) {
                if (paramInt != 165) {
                  if (paramInt == 166) {}
                }
              }
            }
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return null;
              case 174: 
                return "audio/ac4";
              case 173: 
                return "audio/opus";
              case 170: 
              case 171: 
                return "audio/vnd.dts.hd";
              }
              return "audio/vnd.dts";
            case 106: 
              return "video/mpeg";
            case 105: 
            case 107: 
              return "audio/mpeg";
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
              return "video/mpeg2";
              return "audio/eac3";
              return "audio/ac3";
              return "video/x-vnd.on2.vp9";
              return "video/wvc1";
            }
          }
          return "audio/mp4a-latm";
        }
        return "video/hevc";
      }
      return "video/avc";
    }
    return "video/mp4v-es";
  }
  
  public static boolean zze(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return false;
    }
    switch (paramString1.hashCode())
    {
    default: 
      break;
    case 1903589369: 
      if (paramString1.equals("audio/g711-mlaw")) {
        i = 5;
      }
      break;
    case 1903231877: 
      if (paramString1.equals("audio/g711-alaw")) {
        i = 4;
      }
      break;
    case 1504831518: 
      if (paramString1.equals("audio/mpeg")) {
        i = 0;
      }
      break;
    case 1504619009: 
      if (paramString1.equals("audio/flac")) {
        i = 6;
      }
      break;
    case 1504578661: 
      if (paramString1.equals("audio/eac3")) {
        i = 8;
      }
      break;
    case 187094639: 
      if (paramString1.equals("audio/raw")) {
        i = 3;
      }
      break;
    case 187078296: 
      if (paramString1.equals("audio/ac3")) {
        i = 7;
      }
      break;
    case -53558318: 
      if (paramString1.equals("audio/mp4a-latm")) {
        i = 10;
      }
      break;
    case -432837259: 
      if (paramString1.equals("audio/mpeg-L2")) {
        i = 2;
      }
      break;
    case -432837260: 
      if (paramString1.equals("audio/mpeg-L1")) {
        i = 1;
      }
      break;
    case -2123537834: 
      if (paramString1.equals("audio/eac3-joc")) {
        i = 9;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      return false;
    case 10: 
      if (paramString2 == null) {
        return false;
      }
      paramString1 = zzc(paramString2);
      if (paramString1 == null) {
        return false;
      }
      i = paramString1.zza();
      return (i != 0) && (i != 16);
    }
    return true;
  }
  
  public static boolean zzf(String paramString)
  {
    return "audio".equals(zzh(paramString));
  }
  
  public static boolean zzg(String paramString)
  {
    return "video".equals(zzh(paramString));
  }
  
  private static String zzh(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i == -1) {
      return null;
    }
    return paramString.substring(0, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */