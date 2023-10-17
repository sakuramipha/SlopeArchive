package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzsi
{
  public static final int zza = 0;
  private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
  private static final HashMap zzc = new HashMap();
  private static int zzd = -1;
  
  public static int zza()
    throws zzsc
  {
    int j = zzd;
    int i = j;
    if (j == -1)
    {
      int k = 0;
      Object localObject = zzc("video/avc", false, false);
      if (localObject != null)
      {
        localObject = ((zzrp)localObject).zzh();
        int m = localObject.length;
        j = 0;
        while (k < m)
        {
          i = localObject[k].level;
          if ((i != 1) && (i != 2)) {}
          switch (i)
          {
          default: 
            i = -1;
            break;
          case 131072: 
          case 262144: 
          case 524288: 
            i = 35651584;
            break;
          case 32768: 
          case 65536: 
            i = 9437184;
            break;
          case 16384: 
            i = 5652480;
            break;
          case 8192: 
            i = 2228224;
            break;
          case 2048: 
          case 4096: 
            i = 2097152;
            break;
          case 1024: 
            i = 1310720;
            break;
          case 512: 
            i = 921600;
            break;
          case 128: 
          case 256: 
            i = 414720;
            break;
          case 64: 
            i = 202752;
            break;
          case 8: 
          case 16: 
          case 32: 
            i = 101376;
            break;
            i = 25344;
          }
          j = Math.max(i, j);
          k++;
        }
        if (zzfn.zza >= 21) {
          i = 345600;
        } else {
          i = 172800;
        }
        i = Math.max(j, i);
      }
      else
      {
        i = 0;
      }
      zzd = i;
    }
    return i;
  }
  
  public static Pair zzb(zzam paramzzam)
  {
    Object localObject1 = paramzzam.zzj;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = ((String)localObject1).split("\\.");
    boolean bool = "video/dolby-vision".equals(paramzzam.zzm);
    int j = 2;
    int k = 1;
    if (bool)
    {
      paramzzam = paramzzam.zzj;
      if (localObject2.length < 3) {
        zzer.zze("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(paramzzam)));
      }
      for (;;)
      {
        paramzzam = null;
        break label899;
        localObject1 = zzb.matcher(localObject2[1]);
        if (!((Matcher)localObject1).matches())
        {
          zzer.zze("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(paramzzam)));
        }
        else
        {
          paramzzam = ((Matcher)localObject1).group(1);
          if (paramzzam == null) {}
          for (;;)
          {
            localObject1 = null;
            break;
            switch (paramzzam.hashCode())
            {
            default: 
              break;
            case 1545: 
              if (paramzzam.equals("09")) {
                i = 9;
              }
              break;
            case 1544: 
              if (paramzzam.equals("08")) {
                i = 8;
              }
              break;
            case 1543: 
              if (paramzzam.equals("07")) {
                i = 7;
              }
              break;
            case 1542: 
              if (paramzzam.equals("06")) {
                i = 6;
              }
              break;
            case 1541: 
              if (paramzzam.equals("05")) {
                i = 5;
              }
              break;
            case 1540: 
              if (paramzzam.equals("04")) {
                i = 4;
              }
              break;
            case 1539: 
              if (paramzzam.equals("03")) {
                i = 3;
              }
              break;
            case 1538: 
              if (paramzzam.equals("02")) {
                i = 2;
              }
              break;
            case 1537: 
              if (paramzzam.equals("01")) {
                i = 1;
              }
              break;
            case 1536: 
              if (paramzzam.equals("00")) {
                i = 0;
              }
              break;
            }
            i = -1;
            switch (i)
            {
            }
          }
          localObject1 = Integer.valueOf(512);
          break label488;
          localObject1 = Integer.valueOf(256);
          break label488;
          localObject1 = Integer.valueOf(128);
          break label488;
          localObject1 = Integer.valueOf(64);
          break label488;
          localObject1 = Integer.valueOf(32);
          break label488;
          localObject1 = Integer.valueOf(16);
          break label488;
          localObject1 = Integer.valueOf(8);
          break label488;
          localObject1 = Integer.valueOf(4);
          break label488;
          localObject1 = Integer.valueOf(2);
          break label488;
          localObject1 = Integer.valueOf(1);
          label488:
          if (localObject1 == null)
          {
            zzer.zze("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(paramzzam)));
          }
          else
          {
            localObject2 = localObject2[2];
            if (localObject2 == null) {}
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      for (;;)
                                      {
                                        paramzzam = null;
                                        break;
                                        i = ((String)localObject2).hashCode();
                                        switch (i)
                                        {
                                        default: 
                                          switch (i)
                                          {
                                          }
                                          break;
                                        }
                                      }
                                    } while (!((String)localObject2).equals("13"));
                                    paramzzam = Integer.valueOf(4096);
                                    break;
                                  } while (!((String)localObject2).equals("12"));
                                  paramzzam = Integer.valueOf(2048);
                                  break;
                                } while (!((String)localObject2).equals("11"));
                                paramzzam = Integer.valueOf(1024);
                                break;
                              } while (!((String)localObject2).equals("10"));
                              paramzzam = Integer.valueOf(512);
                              break;
                            } while (!((String)localObject2).equals("09"));
                            paramzzam = Integer.valueOf(256);
                            break;
                          } while (!((String)localObject2).equals("08"));
                          paramzzam = Integer.valueOf(128);
                          break;
                        } while (!((String)localObject2).equals("07"));
                        paramzzam = Integer.valueOf(64);
                        break;
                      } while (!((String)localObject2).equals("06"));
                      paramzzam = Integer.valueOf(32);
                      break;
                    } while (!((String)localObject2).equals("05"));
                    paramzzam = Integer.valueOf(16);
                    break;
                  } while (!((String)localObject2).equals("04"));
                  paramzzam = Integer.valueOf(8);
                  break;
                } while (!((String)localObject2).equals("03"));
                paramzzam = Integer.valueOf(4);
                break;
              } while (!((String)localObject2).equals("02"));
              paramzzam = Integer.valueOf(2);
              break;
            } while (!((String)localObject2).equals("01"));
            paramzzam = Integer.valueOf(1);
            if (paramzzam != null) {
              break;
            }
            zzer.zze("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(localObject2)));
          }
        }
      }
      paramzzam = new Pair(localObject1, paramzzam);
      label899:
      return paramzzam;
    }
    localObject1 = localObject2[0];
    switch (((String)localObject1).hashCode())
    {
    default: 
      break;
    case 3624515: 
      if (((String)localObject1).equals("vp09")) {
        i = 2;
      }
      break;
    case 3356560: 
      if (((String)localObject1).equals("mp4a")) {
        i = 6;
      }
      break;
    case 3214780: 
      if (((String)localObject1).equals("hvc1")) {
        i = 4;
      }
      break;
    case 3199032: 
      if (((String)localObject1).equals("hev1")) {
        i = 3;
      }
      break;
    case 3006244: 
      if (((String)localObject1).equals("avc2")) {
        i = 1;
      }
      break;
    case 3006243: 
      if (((String)localObject1).equals("avc1")) {
        i = 0;
      }
      break;
    case 3004662: 
      if (((String)localObject1).equals("av01")) {
        i = 5;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      return null;
    case 6: 
      localObject1 = paramzzam.zzj;
      if (localObject2.length != 3) {
        zzer.zze("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(localObject1)));
      }
      for (;;)
      {
        paramzzam = null;
        break;
        try
        {
          if ("audio/mp4a-latm".equals(zzcd.zzd(Integer.parseInt(localObject2[1], 16))))
          {
            i = Integer.parseInt(localObject2[2]);
            if (i != 17)
            {
              if (i != 20)
              {
                if (i != 23)
                {
                  if (i != 29)
                  {
                    if (i != 39)
                    {
                      if (i != 42) {
                        switch (i)
                        {
                        default: 
                          i = -1;
                          break;
                        case 6: 
                          i = 6;
                          break;
                        case 5: 
                          i = 5;
                          break;
                        case 4: 
                          i = 4;
                          break;
                        case 3: 
                          i = 3;
                          break;
                        case 2: 
                          i = 2;
                          break;
                        case 1: 
                          i = 1;
                          break;
                        }
                      } else {
                        i = 42;
                      }
                    }
                    else {
                      i = 39;
                    }
                  }
                  else {
                    i = 29;
                  }
                }
                else {
                  i = 23;
                }
              }
              else {
                i = 20;
              }
            }
            else {
              i = 17;
            }
            if (i != -1) {
              paramzzam = new Pair(Integer.valueOf(i), Integer.valueOf(0));
            }
          }
        }
        catch (NumberFormatException paramzzam)
        {
          zzer.zze("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(localObject1)));
        }
      }
      return paramzzam;
    case 5: 
      localObject1 = paramzzam.zzj;
      paramzzam = paramzzam.zzy;
      if (localObject2.length < 4) {
        zzer.zze("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(localObject1)));
      }
      for (;;)
      {
        paramzzam = null;
        break;
        try
        {
          j = Integer.parseInt(localObject2[1]);
          k = Integer.parseInt(localObject2[2].substring(0, 2));
          i = Integer.parseInt(localObject2[3]);
          if (j != 0)
          {
            paramzzam = new StringBuilder();
            paramzzam.append("Unknown AV1 profile: ");
            paramzzam.append(j);
            zzer.zze("MediaCodecUtil", paramzzam.toString());
          }
          else
          {
            if (i != 8)
            {
              if (i != 10)
              {
                paramzzam = new StringBuilder();
                paramzzam.append("Unknown AV1 bit depth: ");
                paramzzam.append(i);
                zzer.zze("MediaCodecUtil", paramzzam.toString());
                continue;
              }
              if (paramzzam != null) {
                if (paramzzam.zzg == null)
                {
                  i = paramzzam.zzf;
                  if ((i != 7) && (i != 6)) {}
                }
                else
                {
                  j = 4096;
                  break label1581;
                }
              }
              j = 2;
            }
            else
            {
              j = 1;
            }
            switch (k)
            {
            default: 
              i = -1;
              break;
            case 23: 
              i = 8388608;
              break;
            case 22: 
              i = 4194304;
              break;
            case 21: 
              i = 2097152;
              break;
            case 20: 
              i = 1048576;
              break;
            case 19: 
              i = 524288;
              break;
            case 18: 
              i = 262144;
              break;
            case 17: 
              i = 131072;
              break;
            case 16: 
              i = 65536;
              break;
            case 15: 
              i = 32768;
              break;
            case 14: 
              i = 16384;
              break;
            case 13: 
              i = 8192;
              break;
            case 12: 
              i = 4096;
              break;
            case 11: 
              i = 2048;
              break;
            case 10: 
              i = 1024;
              break;
            case 9: 
              i = 512;
              break;
            case 8: 
              i = 256;
              break;
            case 7: 
              i = 128;
              break;
            case 6: 
              i = 64;
              break;
            case 5: 
              i = 32;
              break;
            case 4: 
              i = 16;
              break;
            case 3: 
              i = 8;
              break;
            case 2: 
              i = 4;
              break;
            case 1: 
              i = 2;
              break;
            case 0: 
              i = 1;
            }
            if (i == -1)
            {
              paramzzam = new StringBuilder();
              paramzzam.append("Unknown AV1 level: ");
              paramzzam.append(k);
              zzer.zze("MediaCodecUtil", paramzzam.toString());
            }
            else
            {
              paramzzam = new Pair(Integer.valueOf(j), Integer.valueOf(i));
            }
          }
        }
        catch (NumberFormatException paramzzam)
        {
          zzer.zze("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(localObject1)));
        }
      }
      return paramzzam;
    case 3: 
    case 4: 
      localObject1 = paramzzam.zzj;
      paramzzam = paramzzam.zzy;
      if (localObject2.length < 4) {
        zzer.zze("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(localObject1)));
      }
      for (;;)
      {
        paramzzam = null;
        break;
        Matcher localMatcher = zzb.matcher(localObject2[1]);
        if (!localMatcher.matches())
        {
          zzer.zze("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(localObject1)));
        }
        else
        {
          localObject1 = localMatcher.group(1);
          if ("1".equals(localObject1)) {
            j = 1;
          }
          for (;;)
          {
            break;
            if (!"2".equals(localObject1)) {
              break label3140;
            }
            if ((paramzzam != null) && (paramzzam.zzf == 6)) {
              j = 4096;
            } else {
              j = 2;
            }
          }
          localObject1 = localObject2[3];
          if (localObject1 == null) {}
          for (;;)
          {
            paramzzam = null;
            break;
            switch (((String)localObject1).hashCode())
            {
            default: 
              break;
            case 2312995: 
              if (((String)localObject1).equals("L186")) {
                i = 12;
              }
              break;
            case 2312992: 
              if (((String)localObject1).equals("L183")) {
                i = 11;
              }
              break;
            case 2312989: 
              if (((String)localObject1).equals("L180")) {
                i = 10;
              }
              break;
            case 2312902: 
              if (((String)localObject1).equals("L156")) {
                i = 9;
              }
              break;
            case 2312899: 
              if (((String)localObject1).equals("L153")) {
                i = 8;
              }
              break;
            case 2312896: 
              if (((String)localObject1).equals("L150")) {
                i = 7;
              }
              break;
            case 2312806: 
              if (((String)localObject1).equals("L123")) {
                i = 6;
              }
              break;
            case 2312803: 
              if (((String)localObject1).equals("L120")) {
                i = 5;
              }
              break;
            case 2193831: 
              if (((String)localObject1).equals("H186")) {
                i = 25;
              }
              break;
            case 2193828: 
              if (((String)localObject1).equals("H183")) {
                i = 24;
              }
              break;
            case 2193825: 
              if (((String)localObject1).equals("H180")) {
                i = 23;
              }
              break;
            case 2193738: 
              if (((String)localObject1).equals("H156")) {
                i = 22;
              }
              break;
            case 2193735: 
              if (((String)localObject1).equals("H153")) {
                i = 21;
              }
              break;
            case 2193732: 
              if (((String)localObject1).equals("H150")) {
                i = 20;
              }
              break;
            case 2193642: 
              if (((String)localObject1).equals("H123")) {
                i = 19;
              }
              break;
            case 2193639: 
              if (((String)localObject1).equals("H120")) {
                i = 18;
              }
              break;
            case 74854: 
              if (((String)localObject1).equals("L93")) {
                i = 4;
              }
              break;
            case 74851: 
              if (((String)localObject1).equals("L90")) {
                i = 3;
              }
              break;
            case 74761: 
              if (((String)localObject1).equals("L63")) {
                i = 2;
              }
              break;
            case 74758: 
              if (((String)localObject1).equals("L60")) {
                i = 1;
              }
              break;
            case 74665: 
              if (((String)localObject1).equals("L30")) {
                i = 0;
              }
              break;
            case 71010: 
              if (((String)localObject1).equals("H93")) {
                i = 17;
              }
              break;
            case 71007: 
              if (((String)localObject1).equals("H90")) {
                i = 16;
              }
              break;
            case 70917: 
              if (((String)localObject1).equals("H63")) {
                i = 15;
              }
              break;
            case 70914: 
              if (((String)localObject1).equals("H60")) {
                i = 14;
              }
              break;
            case 70821: 
              if (((String)localObject1).equals("H30")) {
                i = 13;
              }
              break;
            }
            i = -1;
            switch (i)
            {
            }
          }
          paramzzam = Integer.valueOf(33554432);
          break label3101;
          paramzzam = Integer.valueOf(8388608);
          break label3101;
          paramzzam = Integer.valueOf(2097152);
          break label3101;
          paramzzam = Integer.valueOf(524288);
          break label3101;
          paramzzam = Integer.valueOf(131072);
          break label3101;
          paramzzam = Integer.valueOf(32768);
          break label3101;
          paramzzam = Integer.valueOf(8192);
          break label3101;
          paramzzam = Integer.valueOf(2048);
          break label3101;
          paramzzam = Integer.valueOf(512);
          break label3101;
          paramzzam = Integer.valueOf(128);
          break label3101;
          paramzzam = Integer.valueOf(32);
          break label3101;
          paramzzam = Integer.valueOf(8);
          break label3101;
          paramzzam = Integer.valueOf(2);
          break label3101;
          paramzzam = Integer.valueOf(16777216);
          break label3101;
          paramzzam = Integer.valueOf(4194304);
          break label3101;
          paramzzam = Integer.valueOf(1048576);
          break label3101;
          paramzzam = Integer.valueOf(262144);
          break label3101;
          paramzzam = Integer.valueOf(65536);
          break label3101;
          paramzzam = Integer.valueOf(16384);
          break label3101;
          paramzzam = Integer.valueOf(4096);
          break label3101;
          paramzzam = Integer.valueOf(1024);
          break label3101;
          paramzzam = Integer.valueOf(256);
          break label3101;
          paramzzam = Integer.valueOf(64);
          break label3101;
          paramzzam = Integer.valueOf(16);
          break label3101;
          paramzzam = Integer.valueOf(4);
          break label3101;
          paramzzam = Integer.valueOf(1);
          if (paramzzam == null)
          {
            zzer.zze("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(localObject1)));
          }
          else
          {
            paramzzam = new Pair(Integer.valueOf(j), paramzzam);
            break;
            zzer.zze("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(localObject1)));
          }
        }
      }
      return paramzzam;
    case 2: 
      label1581:
      label3101:
      label3140:
      paramzzam = paramzzam.zzj;
      if (localObject2.length < 3) {
        zzer.zze("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(paramzzam)));
      }
      for (;;)
      {
        paramzzam = null;
        break;
        try
        {
          i = Integer.parseInt(localObject2[1]);
          int m = Integer.parseInt(localObject2[2]);
          if (i != 0)
          {
            if (i != 1)
            {
              if (i != 2)
              {
                if (i != 3) {
                  j = -1;
                } else {
                  j = 8;
                }
              }
              else {
                j = 4;
              }
            }
            else {
              j = 2;
            }
          }
          else {
            j = 1;
          }
          if (j == -1)
          {
            paramzzam = new StringBuilder();
            paramzzam.append("Unknown VP9 profile: ");
            paramzzam.append(i);
            zzer.zze("MediaCodecUtil", paramzzam.toString());
          }
          else
          {
            if (m != 10)
            {
              if (m != 11)
              {
                if (m != 20)
                {
                  if (m != 21)
                  {
                    if (m != 30)
                    {
                      if (m != 31)
                      {
                        if (m != 40)
                        {
                          if (m != 41)
                          {
                            if (m != 50)
                            {
                              if (m != 51) {
                                switch (m)
                                {
                                default: 
                                  i = -1;
                                  break;
                                case 62: 
                                  i = 8192;
                                  break;
                                case 61: 
                                  i = 4096;
                                  break;
                                case 60: 
                                  i = 2048;
                                  break;
                                }
                              } else {
                                i = 512;
                              }
                            }
                            else {
                              i = 256;
                            }
                          }
                          else {
                            i = 128;
                          }
                        }
                        else {
                          i = 64;
                        }
                      }
                      else {
                        i = 32;
                      }
                    }
                    else {
                      i = 16;
                    }
                  }
                  else {
                    i = 8;
                  }
                }
                else {
                  i = 4;
                }
              }
              else {
                i = 2;
              }
            }
            else {
              i = k;
            }
            if (i == -1)
            {
              paramzzam = new StringBuilder();
              paramzzam.append("Unknown VP9 level: ");
              paramzzam.append(m);
              zzer.zze("MediaCodecUtil", paramzzam.toString());
            }
            else
            {
              paramzzam = new Pair(Integer.valueOf(j), Integer.valueOf(i));
            }
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          zzer.zze("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(paramzzam)));
        }
      }
      return paramzzam;
    }
    paramzzam = paramzzam.zzj;
    i = localObject2.length;
    if (i < 2) {
      zzer.zze("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(paramzzam)));
    }
    for (;;)
    {
      paramzzam = null;
      break;
      try
      {
        if (localObject2[1].length() == 6)
        {
          i = Integer.parseInt(localObject2[1].substring(0, 2), 16);
          k = Integer.parseInt(localObject2[1].substring(4), 16);
        }
        else
        {
          if (i < 3) {
            break label4078;
          }
          i = Integer.parseInt(localObject2[1]);
          k = Integer.parseInt(localObject2[2]);
        }
        if (i != 66)
        {
          if (i != 77) {
            if (i != 88)
            {
              if (i != 100)
              {
                if (i != 110)
                {
                  if (i != 122)
                  {
                    if (i != 244) {
                      j = -1;
                    } else {
                      j = 64;
                    }
                  }
                  else {
                    j = 32;
                  }
                }
                else {
                  j = 16;
                }
              }
              else {
                j = 8;
              }
            }
            else {
              j = 4;
            }
          }
        }
        else {
          j = 1;
        }
        if (j == -1)
        {
          paramzzam = new StringBuilder();
          paramzzam.append("Unknown AVC profile: ");
          paramzzam.append(i);
          zzer.zze("MediaCodecUtil", paramzzam.toString());
        }
        else
        {
          switch (k)
          {
          default: 
            switch (k)
            {
            default: 
              switch (k)
              {
              default: 
                switch (k)
                {
                default: 
                  switch (k)
                  {
                  default: 
                    i = -1;
                    break;
                  case 52: 
                    i = 65536;
                    break;
                  case 51: 
                    i = 32768;
                    break;
                  case 50: 
                    i = 16384;
                  }
                  break;
                case 42: 
                  i = 8192;
                  break;
                case 41: 
                  i = 4096;
                  break;
                case 40: 
                  i = 2048;
                }
                break;
              case 32: 
                i = 1024;
                break;
              case 31: 
                i = 512;
                break;
              case 30: 
                i = 256;
              }
              break;
            case 22: 
              i = 128;
              break;
            case 21: 
              i = 64;
              break;
            case 20: 
              i = 32;
            }
            break;
          case 13: 
            i = 16;
            break;
          case 12: 
            i = 8;
            break;
          case 11: 
            i = 4;
            break;
          case 10: 
            i = 1;
          }
          if (i == -1)
          {
            paramzzam = new StringBuilder();
            paramzzam.append("Unknown AVC level: ");
            paramzzam.append(k);
            zzer.zze("MediaCodecUtil", paramzzam.toString());
          }
          else
          {
            paramzzam = new Pair(Integer.valueOf(j), Integer.valueOf(i));
            break;
            label4078:
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Ignoring malformed AVC codec string: ");
            localStringBuilder.append(paramzzam);
            zzer.zze("MediaCodecUtil", localStringBuilder.toString());
          }
        }
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        zzer.zze("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(paramzzam)));
      }
    }
    return paramzzam;
  }
  
  public static zzrp zzc(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws zzsc
  {
    paramString = zzf(paramString, false, false);
    if (paramString.isEmpty()) {
      return null;
    }
    return (zzrp)paramString.get(0);
  }
  
  public static zzrp zzd()
    throws zzsc
  {
    return zzc("audio/raw", false, false);
  }
  
  public static String zze(zzam paramzzam)
  {
    if ("audio/eac3-joc".equals(paramzzam.zzm)) {
      return "audio/eac3";
    }
    if ("video/dolby-vision".equals(paramzzam.zzm))
    {
      paramzzam = zzb(paramzzam);
      if (paramzzam != null)
      {
        int i = ((Integer)paramzzam.first).intValue();
        if ((i != 16) && (i != 256))
        {
          if (i == 512) {
            return "video/avc";
          }
        }
        else {
          return "video/hevc";
        }
      }
    }
    return null;
  }
  
  public static List zzf(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws zzsc
  {
    try
    {
      zzsa localzzsa = new com/google/android/gms/internal/ads/zzsa;
      localzzsa.<init>(paramString, paramBoolean1, paramBoolean2);
      HashMap localHashMap = zzc;
      Object localObject = (List)localHashMap.get(localzzsa);
      if (localObject != null) {
        return (List)localObject;
      }
      if (zzfn.zza >= 21)
      {
        localObject = new com/google/android/gms/internal/ads/zzsg;
        ((zzsg)localObject).<init>(paramBoolean1, paramBoolean2);
      }
      else
      {
        localObject = new zzsf(null);
      }
      ArrayList localArrayList = zzh(localzzsa, (zzsd)localObject);
      localObject = localArrayList;
      if (paramBoolean1)
      {
        localObject = localArrayList;
        if (localArrayList.isEmpty())
        {
          int i = zzfn.zza;
          localObject = localArrayList;
          if (i >= 21)
          {
            localObject = localArrayList;
            if (i <= 23)
            {
              localObject = new com/google/android/gms/internal/ads/zzsf;
              ((zzsf)localObject).<init>(null);
              localArrayList = zzh(localzzsa, (zzsd)localObject);
              localObject = localArrayList;
              if (!localArrayList.isEmpty())
              {
                String str = ((zzrp)localArrayList.get(0)).zza;
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>();
                ((StringBuilder)localObject).append("MediaCodecList API didn't list secure decoder for: ");
                ((StringBuilder)localObject).append(paramString);
                ((StringBuilder)localObject).append(". Assuming: ");
                ((StringBuilder)localObject).append(str);
                zzer.zze("MediaCodecUtil", ((StringBuilder)localObject).toString());
                localObject = localArrayList;
              }
            }
          }
        }
      }
      if ("audio/raw".equals(paramString))
      {
        if ((zzfn.zza < 26) && (zzfn.zzb.equals("R9")) && (((List)localObject).size() == 1) && (((zzrp)((List)localObject).get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
          ((List)localObject).add(zzrp.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
        }
        zzi((List)localObject, zzry.zza);
      }
      if ((zzfn.zza < 21) && (((List)localObject).size() > 1))
      {
        paramString = ((zzrp)((List)localObject).get(0)).zza;
        if (("OMX.SEC.mp3.dec".equals(paramString)) || ("OMX.SEC.MP3.Decoder".equals(paramString)) || ("OMX.brcm.audio.mp3.decoder".equals(paramString))) {
          zzi((List)localObject, zzrz.zza);
        }
      }
      if ((zzfn.zza < 32) && (((List)localObject).size() > 1) && ("OMX.qti.audio.decoder.flac".equals(((zzrp)((List)localObject).get(0)).zza))) {
        ((List)localObject).add((zzrp)((List)localObject).remove(0));
      }
      paramString = zzfrr.zzj((Collection)localObject);
      localHashMap.put(localzzsa, paramString);
      return paramString;
    }
    finally {}
  }
  
  public static List zzg(List paramList, zzam paramzzam)
  {
    paramList = new ArrayList(paramList);
    zzi(paramList, new zzrw(paramzzam));
    return paramList;
  }
  
  /* Error */
  private static ArrayList zzh(zzsa paramzzsa, zzsd paramzzsd)
    throws zzsc
  {
    // Byte code:
    //   0: new 390	java/util/ArrayList
    //   3: astore 17
    //   5: aload 17
    //   7: invokespecial 461	java/util/ArrayList:<init>	()V
    //   10: aload_0
    //   11: getfield 462	com/google/android/gms/internal/ads/zzsa:zza	Ljava/lang/String;
    //   14: astore 14
    //   16: aload_1
    //   17: invokeinterface 466 1 0
    //   22: istore_2
    //   23: aload_1
    //   24: invokeinterface 468 1 0
    //   29: istore 9
    //   31: iconst_0
    //   32: istore_3
    //   33: iload_3
    //   34: iload_2
    //   35: if_icmpge +1186 -> 1221
    //   38: aload_1
    //   39: iload_3
    //   40: invokeinterface 471 2 0
    //   45: astore 16
    //   47: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   50: bipush 29
    //   52: if_icmplt +14 -> 66
    //   55: aload 16
    //   57: invokevirtual 476	android/media/MediaCodecInfo:isAlias	()Z
    //   60: ifeq +6 -> 66
    //   63: goto +1152 -> 1215
    //   66: aload 16
    //   68: invokevirtual 479	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   71: astore 13
    //   73: aload 16
    //   75: invokevirtual 482	android/media/MediaCodecInfo:isEncoder	()Z
    //   78: istore 6
    //   80: iload 6
    //   82: ifne -19 -> 63
    //   85: iload 9
    //   87: ifne +14 -> 101
    //   90: aload 13
    //   92: ldc_w 484
    //   95: invokevirtual 488	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   98: ifne -35 -> 63
    //   101: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   104: bipush 21
    //   106: if_icmpge +69 -> 175
    //   109: ldc_w 490
    //   112: aload 13
    //   114: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: ifne -54 -> 63
    //   120: ldc_w 492
    //   123: aload 13
    //   125: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   128: ifne -65 -> 63
    //   131: ldc_w 494
    //   134: aload 13
    //   136: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   139: ifne -76 -> 63
    //   142: ldc_w 496
    //   145: aload 13
    //   147: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   150: ifne -87 -> 63
    //   153: ldc_w 498
    //   156: aload 13
    //   158: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   161: ifne -98 -> 63
    //   164: ldc_w 500
    //   167: aload 13
    //   169: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   172: ifne -109 -> 63
    //   175: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   178: istore 4
    //   180: iload 4
    //   182: bipush 24
    //   184: if_icmpge +133 -> 317
    //   187: ldc_w 502
    //   190: aload 13
    //   192: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   195: ifne +14 -> 209
    //   198: ldc_w 504
    //   201: aload 13
    //   203: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   206: ifeq +111 -> 317
    //   209: ldc_w 506
    //   212: getstatic 508	com/google/android/gms/internal/ads/zzfn:zzc	Ljava/lang/String;
    //   215: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   218: ifeq +99 -> 317
    //   221: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   224: ldc_w 510
    //   227: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   230: ifne -167 -> 63
    //   233: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   236: ldc_w 515
    //   239: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   242: ifne -179 -> 63
    //   245: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   248: ldc_w 517
    //   251: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   254: ifne -191 -> 63
    //   257: ldc_w 519
    //   260: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   263: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   266: ifne -203 -> 63
    //   269: ldc_w 521
    //   272: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   275: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifne -215 -> 63
    //   281: ldc_w 523
    //   284: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   287: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifne -227 -> 63
    //   293: ldc_w 525
    //   296: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   299: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   302: ifne -239 -> 63
    //   305: ldc_w 527
    //   308: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   311: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   314: ifne -251 -> 63
    //   317: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   320: istore 4
    //   322: iload 4
    //   324: bipush 19
    //   326: if_icmpgt +86 -> 412
    //   329: ldc_w 529
    //   332: aload 13
    //   334: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   337: ifeq +75 -> 412
    //   340: ldc_w 506
    //   343: getstatic 508	com/google/android/gms/internal/ads/zzfn:zzc	Ljava/lang/String;
    //   346: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   349: ifeq +63 -> 412
    //   352: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   355: ldc_w 531
    //   358: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   361: ifne -298 -> 63
    //   364: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   367: ldc_w 533
    //   370: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   373: ifne -310 -> 63
    //   376: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   379: ldc_w 535
    //   382: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   385: ifne -322 -> 63
    //   388: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   391: ldc_w 537
    //   394: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   397: ifne -334 -> 63
    //   400: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   403: ldc_w 539
    //   406: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   409: ifne -346 -> 63
    //   412: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   415: bipush 19
    //   417: if_icmpgt +26 -> 443
    //   420: getstatic 400	com/google/android/gms/internal/ads/zzfn:zzb	Ljava/lang/String;
    //   423: ldc_w 535
    //   426: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   429: ifeq +14 -> 443
    //   432: ldc_w 541
    //   435: aload 13
    //   437: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   440: ifne -377 -> 63
    //   443: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   446: bipush 23
    //   448: if_icmpgt +25 -> 473
    //   451: ldc_w 354
    //   454: aload 14
    //   456: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   459: ifeq +14 -> 473
    //   462: ldc_w 543
    //   465: aload 13
    //   467: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   470: ifne -407 -> 63
    //   473: aload 16
    //   475: invokevirtual 547	android/media/MediaCodecInfo:getSupportedTypes	()[Ljava/lang/String;
    //   478: astore 15
    //   480: aload 15
    //   482: arraylength
    //   483: istore 5
    //   485: iconst_0
    //   486: istore 4
    //   488: iload 4
    //   490: iload 5
    //   492: if_icmpge +33 -> 525
    //   495: aload 15
    //   497: iload 4
    //   499: aaload
    //   500: astore 12
    //   502: aload 12
    //   504: aload 14
    //   506: invokevirtual 550	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   509: ifeq +10 -> 519
    //   512: aload 12
    //   514: astore 15
    //   516: goto +161 -> 677
    //   519: iinc 4 1
    //   522: goto -34 -> 488
    //   525: aload 14
    //   527: ldc 95
    //   529: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   532: ifeq +52 -> 584
    //   535: ldc_w 552
    //   538: aload 13
    //   540: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   543: ifeq +11 -> 554
    //   546: ldc_w 554
    //   549: astore 12
    //   551: goto -39 -> 512
    //   554: ldc_w 556
    //   557: aload 13
    //   559: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   562: ifne +14 -> 576
    //   565: ldc_w 558
    //   568: aload 13
    //   570: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   573: ifeq +101 -> 674
    //   576: ldc_w 560
    //   579: astore 12
    //   581: goto -69 -> 512
    //   584: aload 14
    //   586: ldc_w 562
    //   589: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   592: ifeq +22 -> 614
    //   595: ldc_w 564
    //   598: aload 13
    //   600: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   603: ifeq +11 -> 614
    //   606: ldc_w 566
    //   609: astore 12
    //   611: goto -99 -> 512
    //   614: aload 14
    //   616: ldc_w 568
    //   619: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   622: ifeq +22 -> 644
    //   625: ldc_w 570
    //   628: aload 13
    //   630: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   633: ifeq +11 -> 644
    //   636: ldc_w 572
    //   639: astore 12
    //   641: goto -129 -> 512
    //   644: aload 14
    //   646: ldc_w 574
    //   649: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   652: ifeq +22 -> 674
    //   655: ldc_w 576
    //   658: aload 13
    //   660: invokevirtual 102	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   663: ifeq +11 -> 674
    //   666: ldc_w 578
    //   669: astore 12
    //   671: goto -159 -> 512
    //   674: aconst_null
    //   675: astore 15
    //   677: aload 15
    //   679: ifnull -616 -> 63
    //   682: aload 16
    //   684: aload 15
    //   686: invokevirtual 582	android/media/MediaCodecInfo:getCapabilitiesForType	(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   689: astore 18
    //   691: aload_1
    //   692: ldc_w 584
    //   695: aload 15
    //   697: aload 18
    //   699: invokeinterface 587 4 0
    //   704: istore 7
    //   706: aload_1
    //   707: ldc_w 584
    //   710: aload 15
    //   712: aload 18
    //   714: invokeinterface 589 4 0
    //   719: istore 6
    //   721: aload_0
    //   722: getfield 592	com/google/android/gms/internal/ads/zzsa:zzc	Z
    //   725: ifne +11 -> 736
    //   728: iload 6
    //   730: ifne -667 -> 63
    //   733: goto +11 -> 744
    //   736: iload 7
    //   738: ifne +6 -> 744
    //   741: goto -678 -> 63
    //   744: aload_1
    //   745: ldc_w 594
    //   748: aload 15
    //   750: aload 18
    //   752: invokeinterface 587 4 0
    //   757: istore 8
    //   759: aload_1
    //   760: ldc_w 594
    //   763: aload 15
    //   765: aload 18
    //   767: invokeinterface 589 4 0
    //   772: istore 6
    //   774: aload_0
    //   775: getfield 596	com/google/android/gms/internal/ads/zzsa:zzb	Z
    //   778: ifne +11 -> 789
    //   781: iload 6
    //   783: ifne -720 -> 63
    //   786: goto +11 -> 797
    //   789: iload 8
    //   791: ifeq -728 -> 63
    //   794: iconst_1
    //   795: istore 8
    //   797: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   800: bipush 29
    //   802: if_icmplt +13 -> 815
    //   805: aload 16
    //   807: invokevirtual 599	android/media/MediaCodecInfo:isHardwareAccelerated	()Z
    //   810: istore 6
    //   812: goto +22 -> 834
    //   815: aload 16
    //   817: aload 14
    //   819: invokestatic 602	com/google/android/gms/internal/ads/zzsi:zzj	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   822: ifne +9 -> 831
    //   825: iconst_1
    //   826: istore 6
    //   828: goto +6 -> 834
    //   831: iconst_0
    //   832: istore 6
    //   834: aload 16
    //   836: aload 14
    //   838: invokestatic 602	com/google/android/gms/internal/ads/zzsi:zzj	(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    //   841: istore 10
    //   843: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   846: bipush 29
    //   848: if_icmplt +13 -> 861
    //   851: aload 16
    //   853: invokevirtual 605	android/media/MediaCodecInfo:isVendor	()Z
    //   856: istore 7
    //   858: goto +55 -> 913
    //   861: aload 16
    //   863: invokevirtual 479	android/media/MediaCodecInfo:getName	()Ljava/lang/String;
    //   866: invokestatic 609	com/google/android/gms/internal/ads/zzfof:zza	(Ljava/lang/String;)Ljava/lang/String;
    //   869: astore 12
    //   871: aload 12
    //   873: ldc_w 611
    //   876: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   879: ifne +31 -> 910
    //   882: aload 12
    //   884: ldc_w 613
    //   887: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   890: ifne +20 -> 910
    //   893: aload 12
    //   895: ldc_w 615
    //   898: invokevirtual 513	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   901: ifne +9 -> 910
    //   904: iconst_1
    //   905: istore 7
    //   907: goto +6 -> 913
    //   910: iconst_0
    //   911: istore 7
    //   913: iload 9
    //   915: ifeq +16 -> 931
    //   918: aload_0
    //   919: getfield 596	com/google/android/gms/internal/ads/zzsa:zzb	Z
    //   922: istore 11
    //   924: iload 11
    //   926: iload 8
    //   928: if_icmpeq +19 -> 947
    //   931: iload 9
    //   933: ifne +60 -> 993
    //   936: aload_0
    //   937: getfield 596	com/google/android/gms/internal/ads/zzsa:zzb	Z
    //   940: istore 11
    //   942: iload 11
    //   944: ifne +49 -> 993
    //   947: aload 17
    //   949: aload 13
    //   951: aload 14
    //   953: aload 15
    //   955: aload 18
    //   957: iload 6
    //   959: iload 10
    //   961: iload 7
    //   963: iconst_0
    //   964: iconst_0
    //   965: invokestatic 412	com/google/android/gms/internal/ads/zzrp:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzrp;
    //   968: invokevirtual 616	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   971: pop
    //   972: goto +243 -> 1215
    //   975: astore 12
    //   977: aload 13
    //   979: astore 16
    //   981: goto +107 -> 1088
    //   984: astore 12
    //   986: aload 13
    //   988: astore 16
    //   990: goto +98 -> 1088
    //   993: iload 9
    //   995: ifne +220 -> 1215
    //   998: iload 8
    //   1000: ifeq +215 -> 1215
    //   1003: new 220	java/lang/StringBuilder
    //   1006: dup
    //   1007: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   1010: astore 12
    //   1012: aload 12
    //   1014: aload 13
    //   1016: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1019: pop
    //   1020: aload 12
    //   1022: ldc_w 484
    //   1025: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1028: pop
    //   1029: aload 12
    //   1031: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1034: astore 16
    //   1036: aload 13
    //   1038: astore 12
    //   1040: aload 17
    //   1042: aload 16
    //   1044: aload 14
    //   1046: aload 15
    //   1048: aload 18
    //   1050: iload 6
    //   1052: iload 10
    //   1054: iload 7
    //   1056: iconst_0
    //   1057: iconst_1
    //   1058: invokestatic 412	com/google/android/gms/internal/ads/zzrp:zzc	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzrp;
    //   1061: invokevirtual 616	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1064: pop
    //   1065: aload 17
    //   1067: areturn
    //   1068: astore 12
    //   1070: goto +18 -> 1088
    //   1073: astore 12
    //   1075: aload 13
    //   1077: astore 16
    //   1079: goto +9 -> 1088
    //   1082: astore 12
    //   1084: aload 13
    //   1086: astore 16
    //   1088: getstatic 73	com/google/android/gms/internal/ads/zzfn:zza	I
    //   1091: istore 4
    //   1093: iload 4
    //   1095: bipush 23
    //   1097: if_icmpgt +60 -> 1157
    //   1100: aload 17
    //   1102: invokevirtual 391	java/util/ArrayList:isEmpty	()Z
    //   1105: ifne +52 -> 1157
    //   1108: new 220	java/lang/StringBuilder
    //   1111: astore 12
    //   1113: aload 12
    //   1115: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   1118: aload 12
    //   1120: ldc_w 618
    //   1123: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1126: pop
    //   1127: aload 12
    //   1129: aload 13
    //   1131: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1134: pop
    //   1135: aload 12
    //   1137: ldc_w 620
    //   1140: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1143: pop
    //   1144: ldc 104
    //   1146: aload 12
    //   1148: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1151: invokestatic 622	com/google/android/gms/internal/ads/zzer:zzb	(Ljava/lang/String;Ljava/lang/String;)V
    //   1154: goto +61 -> 1215
    //   1157: new 220	java/lang/StringBuilder
    //   1160: astore_0
    //   1161: aload_0
    //   1162: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   1165: aload_0
    //   1166: ldc_w 624
    //   1169: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1172: pop
    //   1173: aload_0
    //   1174: aload 13
    //   1176: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1179: pop
    //   1180: aload_0
    //   1181: ldc_w 626
    //   1184: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1187: pop
    //   1188: aload_0
    //   1189: aload 15
    //   1191: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: pop
    //   1195: aload_0
    //   1196: ldc_w 628
    //   1199: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1202: pop
    //   1203: ldc 104
    //   1205: aload_0
    //   1206: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1209: invokestatic 622	com/google/android/gms/internal/ads/zzer:zzb	(Ljava/lang/String;Ljava/lang/String;)V
    //   1212: aload 12
    //   1214: athrow
    //   1215: iinc 3 1
    //   1218: goto -1185 -> 33
    //   1221: aload 17
    //   1223: areturn
    //   1224: astore_0
    //   1225: new 37	com/google/android/gms/internal/ads/zzsc
    //   1228: dup
    //   1229: aload_0
    //   1230: aconst_null
    //   1231: invokespecial 631	com/google/android/gms/internal/ads/zzsc:<init>	(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzsb;)V
    //   1234: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1235	0	paramzzsa	zzsa
    //   0	1235	1	paramzzsd	zzsd
    //   22	14	2	i	int
    //   32	1184	3	j	int
    //   178	920	4	k	int
    //   483	10	5	m	int
    //   78	973	6	bool1	boolean
    //   704	351	7	bool2	boolean
    //   757	242	8	bool3	boolean
    //   29	965	9	bool4	boolean
    //   841	212	10	bool5	boolean
    //   922	21	11	bool6	boolean
    //   500	394	12	str1	String
    //   975	1	12	localException1	Exception
    //   984	1	12	localException2	Exception
    //   1010	29	12	localObject1	Object
    //   1068	1	12	localException3	Exception
    //   1073	1	12	localException4	Exception
    //   1082	1	12	localException5	Exception
    //   1111	102	12	localStringBuilder	StringBuilder
    //   71	1104	13	str2	String
    //   14	1031	14	str3	String
    //   478	712	15	localObject2	Object
    //   45	1042	16	localObject3	Object
    //   3	1219	17	localArrayList	ArrayList
    //   689	360	18	localCodecCapabilities	android.media.MediaCodecInfo.CodecCapabilities
    // Exception table:
    //   from	to	target	type
    //   947	972	975	java/lang/Exception
    //   1003	1012	975	java/lang/Exception
    //   936	942	984	java/lang/Exception
    //   1040	1065	1068	java/lang/Exception
    //   1012	1036	1073	java/lang/Exception
    //   682	728	1082	java/lang/Exception
    //   744	781	1082	java/lang/Exception
    //   797	812	1082	java/lang/Exception
    //   815	825	1082	java/lang/Exception
    //   834	858	1082	java/lang/Exception
    //   861	904	1082	java/lang/Exception
    //   918	924	1082	java/lang/Exception
    //   0	31	1224	java/lang/Exception
    //   38	63	1224	java/lang/Exception
    //   66	80	1224	java/lang/Exception
    //   90	101	1224	java/lang/Exception
    //   101	175	1224	java/lang/Exception
    //   175	180	1224	java/lang/Exception
    //   187	209	1224	java/lang/Exception
    //   209	317	1224	java/lang/Exception
    //   317	322	1224	java/lang/Exception
    //   329	412	1224	java/lang/Exception
    //   412	443	1224	java/lang/Exception
    //   443	473	1224	java/lang/Exception
    //   473	485	1224	java/lang/Exception
    //   502	512	1224	java/lang/Exception
    //   525	546	1224	java/lang/Exception
    //   554	576	1224	java/lang/Exception
    //   584	606	1224	java/lang/Exception
    //   614	636	1224	java/lang/Exception
    //   644	666	1224	java/lang/Exception
    //   1088	1093	1224	java/lang/Exception
    //   1100	1154	1224	java/lang/Exception
    //   1157	1215	1224	java/lang/Exception
  }
  
  private static void zzi(List paramList, zzsh paramzzsh)
  {
    Collections.sort(paramList, new zzrx(paramzzsh));
  }
  
  private static boolean zzj(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    if (zzfn.zza >= 29) {
      return paramMediaCodecInfo.isSoftwareOnly();
    }
    boolean bool1 = zzcd.zzf(paramString);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramMediaCodecInfo = zzfof.zza(paramMediaCodecInfo.getName());
    if (paramMediaCodecInfo.startsWith("arc.")) {
      return false;
    }
    bool1 = bool2;
    if (!paramMediaCodecInfo.startsWith("omx.google."))
    {
      bool1 = bool2;
      if (!paramMediaCodecInfo.startsWith("omx.ffmpeg.")) {
        if (paramMediaCodecInfo.startsWith("omx.sec."))
        {
          bool1 = bool2;
          if (paramMediaCodecInfo.contains(".sw.")) {}
        }
        else
        {
          bool1 = bool2;
          if (!paramMediaCodecInfo.equals("omx.qcom.video.decoder.hevcswvdec"))
          {
            bool1 = bool2;
            if (!paramMediaCodecInfo.startsWith("c2.android."))
            {
              bool1 = bool2;
              if (!paramMediaCodecInfo.startsWith("c2.google.")) {
                if (!paramMediaCodecInfo.startsWith("omx."))
                {
                  if (!paramMediaCodecInfo.startsWith("c2.")) {
                    bool1 = bool2;
                  } else {
                    return false;
                  }
                }
                else {
                  bool1 = false;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */