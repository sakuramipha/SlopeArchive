package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class zzym
  extends zzrt
{
  private static final int[] zzb = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  private static boolean zzc;
  private static boolean zzd;
  private long zzA;
  private long zzB;
  private int zzC;
  private long zzD;
  private zzdn zzE;
  private zzdn zzF;
  private int zzG;
  private zzyq zzH;
  private final Context zze;
  private final zzyx zzf;
  private final zzzi zzg;
  private final zzyl zzh;
  private final boolean zzi;
  private zzyj zzj;
  private boolean zzk;
  private boolean zzl;
  private Surface zzm;
  private zzyp zzn;
  private boolean zzo;
  private int zzp;
  private boolean zzq;
  private boolean zzr;
  private boolean zzs;
  private long zzt;
  private long zzu;
  private long zzv;
  private int zzw;
  private int zzx;
  private int zzy;
  private long zzz;
  
  public zzym(Context paramContext, zzrl paramzzrl, zzrv paramzzrv, long paramLong, boolean paramBoolean, Handler paramHandler, zzzj paramzzzj, int paramInt, float paramFloat)
  {
    super(2, paramzzrl, paramzzrv, false, 30.0F);
    paramContext = paramContext.getApplicationContext();
    this.zze = paramContext;
    paramContext = new zzyx(paramContext);
    this.zzf = paramContext;
    this.zzg = new zzzi(paramHandler, paramzzzj);
    this.zzh = new zzyl(paramContext, this);
    this.zzi = "NVIDIA".equals(zzfn.zzc);
    this.zzu = -9223372036854775807L;
    this.zzp = 1;
    this.zzE = zzdn.zza;
    this.zzG = 0;
    this.zzF = null;
  }
  
  public static int zzV(zzrp paramzzrp, zzam paramzzam)
  {
    int j = paramzzam.zzr;
    int k = paramzzam.zzs;
    if ((j != -1) && (k != -1))
    {
      String str = paramzzam.zzm;
      boolean bool = "video/dolby-vision".equals(str);
      int i = 2;
      if (bool)
      {
        paramzzam = zzsi.zzb(paramzzam);
        if (paramzzam != null)
        {
          int m = ((Integer)paramzzam.first).intValue();
          if ((m == 512) || (m == 1) || (m == 2))
          {
            str = "video/avc";
            break label99;
          }
        }
        str = "video/hevc";
      }
      label99:
      switch (str.hashCode())
      {
      default: 
        break;
      case 1599127257: 
        if (str.equals("video/x-vnd.on2.vp9")) {
          i = 6;
        }
        break;
      case 1599127256: 
        if (str.equals("video/x-vnd.on2.vp8")) {
          i = 3;
        }
        break;
      case 1331836730: 
        if (str.equals("video/avc")) {
          i = 5;
        }
        break;
      case 1187890754: 
        if (str.equals("video/mp4v-es")) {
          i = 1;
        }
        break;
      case -1662541442: 
        if (str.equals("video/hevc")) {
          i = 4;
        }
        break;
      case -1662735862: 
        if (!str.equals("video/av01")) {
          break;
        }
        break;
      case -1664118616: 
        if (str.equals("video/3gpp")) {
          i = 0;
        }
        break;
      }
      i = -1;
      switch (i)
      {
      default: 
        return -1;
      case 6: 
        return j * k * 3 / 8;
      case 5: 
        if ((!"BRAVIA 4K 2015".equals(zzfn.zzd)) && ((!"Amazon".equals(zzfn.zzc)) || ((!"KFSOWI".equals(zzfn.zzd)) && ((!"AFTS".equals(zzfn.zzd)) || (!paramzzrp.zzf))))) {
          return (j + 15) / 16 * ((k + 15) / 16) * 768 / 4;
        }
        return -1;
      case 4: 
        return Math.max(2097152, j * k * 3 / 4);
      }
      return j * k * 3 / 4;
    }
    return -1;
  }
  
  protected static int zzW(zzrp paramzzrp, zzam paramzzam)
  {
    if (paramzzam.zzn != -1)
    {
      int k = paramzzam.zzo.size();
      int i = 0;
      int j = 0;
      while (i < k)
      {
        j += ((byte[])paramzzam.zzo.get(i)).length;
        i++;
      }
      return paramzzam.zzn + j;
    }
    return zzV(paramzzrp, paramzzam);
  }
  
  protected static final boolean zzaM(String paramString)
  {
    boolean bool1 = paramString.startsWith("OMX.google");
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      if (!zzc)
      {
        int i = zzfn.zza;
        int k = 28;
        int j = -1;
        if (i <= 28)
        {
          paramString = zzfn.zzb;
          i = paramString.hashCode();
          switch (i)
          {
          default: 
            break;
          case 825323514: 
            if (paramString.equals("machuca")) {
              i = 5;
            }
            break;
          case 3415681: 
            if (paramString.equals("once")) {
              i = 6;
            }
            break;
          case -64886864: 
            if (paramString.equals("magnolia")) {
              i = 4;
            }
            break;
          case -760312546: 
            if (paramString.equals("aquaman")) {
              i = 0;
            }
            break;
          case -1012436106: 
            if (paramString.equals("oneday")) {
              i = 7;
            }
            break;
          case -1220066608: 
            if (paramString.equals("dangalUHD")) {
              i = 2;
            }
            break;
          case -1220081023: 
            if (paramString.equals("dangalFHD")) {
              i = 3;
            }
            break;
          case -1339091551: 
            if (paramString.equals("dangal")) {
              i = 1;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          default: 
            break;
          }
        }
        do
        {
          do
          {
            bool1 = true;
            break;
          } while ((zzfn.zza <= 27) && ("HWEML".equals(zzfn.zzb)));
          String str = zzfn.zzd;
          i = str.hashCode();
          switch (i)
          {
          default: 
            break;
          case 2119412532: 
            if (str.equals("AFTEUFF014")) {
              i = 5;
            }
            break;
          case 1798172390: 
            if (str.equals("AFTSO001")) {
              i = 8;
            }
            break;
          case 1785421876: 
            if (str.equals("AFTEU014")) {
              i = 4;
            }
            break;
          case 1785421873: 
            if (str.equals("AFTEU011")) {
              i = 3;
            }
            break;
          case 2006371: 
            if (str.equals("AFTR")) {
              i = 2;
            }
            break;
          case 2006367: 
            if (str.equals("AFTN")) {
              i = 1;
            }
            break;
          case 2006354: 
            if (str.equals("AFTA")) {
              i = 0;
            }
            break;
          case -321033677: 
            if (str.equals("AFTKMST12")) {
              i = 7;
            }
            break;
          case -349662828: 
            if (str.equals("AFTJMST12")) {
              i = 6;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          }
          bool1 = bool2;
          if (zzfn.zza > 26) {
            break;
          }
          paramString = zzfn.zzb;
          i = paramString.hashCode();
          switch (i)
          {
          default: 
            break;
          case 2048855701: 
            if (paramString.equals("HWWAS-H")) {
              i = 66;
            }
            break;
          case 2048319463: 
            if (paramString.equals("HWVNS-H")) {
              i = 65;
            }
            break;
          case 2047252157: 
            if (paramString.equals("ELUGA_Prim")) {
              i = 33;
            }
            break;
          case 2047190025: 
            if (paramString.equals("ELUGA_Note")) {
              i = 32;
            }
            break;
          case 2033393791: 
            if (paramString.equals("ASUS_X00AD_2")) {
              i = 14;
            }
            break;
          case 2030379515: 
            if (paramString.equals("HWCAM-H")) {
              i = 64;
            }
            break;
          case 2029784656: 
            if (paramString.equals("HWBLN-H")) {
              i = 63;
            }
            break;
          case 2019281702: 
            if (paramString.equals("DM-01K")) {
              i = 29;
            }
            break;
          case 2006372676: 
            if (paramString.equals("BRAVIA_ATV3_4K")) {
              i = 19;
            }
            break;
          case 1977196784: 
            if (paramString.equals("Infinix-X572")) {
              i = 69;
            }
            break;
          case 1906253259: 
            if (paramString.equals("PB2-670M")) {
              i = 100;
            }
            break;
          case 1865889110: 
            if (paramString.equals("santoni")) {
              i = 117;
            }
            break;
          case 1709443163: 
            if (paramString.equals("iball8735_9806")) {
              i = 68;
            }
            break;
          case 1691544261: 
            if (paramString.equals("CPH1715")) {
              i = 24;
            }
            break;
          case 1691543273: 
            if (paramString.equals("CPH1609")) {
              i = 23;
            }
            break;
          case 1522194893: 
            if (paramString.equals("woods_f")) {
              i = 133;
            }
            break;
          case 1349174697: 
            if (paramString.equals("htc_e56ml_dtul")) {
              i = 61;
            }
            break;
          case 1306947716: 
            if (paramString.equals("EverStar_S")) {
              i = 35;
            }
            break;
          case 1280332038: 
            if (paramString.equals("hwALE-H")) {
              i = 62;
            }
            break;
          case 1176899427: 
            if (paramString.equals("itel_S41")) {
              i = 71;
            }
            break;
          case 1150207623: 
            if (paramString.equals("LS-5017")) {
              i = 78;
            }
            break;
          case 1060579533: 
            if (paramString.equals("panell_d")) {
              i = 96;
            }
            break;
          case 958008161: 
            if (paramString.equals("j2xlteins")) {
              i = 72;
            }
            break;
          case 917340916: 
            if (paramString.equals("A7000plus")) {
              i = 10;
            }
            break;
          case 835649806: 
            if (paramString.equals("manning")) {
              i = 81;
            }
            break;
          case 794040393: 
            if (paramString.equals("GIONEE_WBL7519")) {
              i = 59;
            }
            break;
          case 794038622: 
            if (paramString.equals("GIONEE_WBL7365")) {
              i = 58;
            }
            break;
          case 793982701: 
            if (paramString.equals("GIONEE_WBL5708")) {
              i = 57;
            }
            break;
          case 507412548: 
            if (paramString.equals("QM16XE_U")) {
              i = 114;
            }
            break;
          case 407160593: 
            if (paramString.equals("Pixi5-10_4G")) {
              i = 106;
            }
            break;
          case 316246818: 
            if (paramString.equals("TB3-850M")) {
              i = 125;
            }
            break;
          case 316246811: 
            if (paramString.equals("TB3-850F")) {
              i = 124;
            }
            break;
          case 316215116: 
            if (paramString.equals("TB3-730X")) {
              i = 123;
            }
            break;
          case 316215098: 
            if (paramString.equals("TB3-730F")) {
              i = 122;
            }
            break;
          case 308517133: 
            if (paramString.equals("A7020a48")) {
              i = 12;
            }
            break;
          case 307593612: 
            if (paramString.equals("A7010a48")) {
              i = 11;
            }
            break;
          case 287431619: 
            if (paramString.equals("griffin")) {
              i = 60;
            }
            break;
          case 245388979: 
            if (paramString.equals("marino_f")) {
              i = 82;
            }
            break;
          case 182191441: 
            if (paramString.equals("CPY83_I00")) {
              i = 25;
            }
            break;
          case 165221241: 
            if (paramString.equals("A2016a40")) {
              i = 8;
            }
            break;
          case 102844228: 
            if (paramString.equals("le_x6")) {
              i = 77;
            }
            break;
          case 101370885: 
            if (paramString.equals("l5460")) {
              i = 76;
            }
            break;
          case 98715550: 
            if (paramString.equals("i9031")) {
              i = 67;
            }
            break;
          case 82882791: 
            if (paramString.equals("X3_HK")) {
              i = 135;
            }
            break;
          case 80963634: 
            if (paramString.equals("V23GB")) {
              i = 128;
            }
            break;
          case 76404911: 
            if (paramString.equals("Q4310")) {
              i = 112;
            }
            break;
          case 76404105: 
            if (paramString.equals("Q4260")) {
              i = 110;
            }
            break;
          case 76402249: 
            if (paramString.equals("PRO7S")) {
              i = 108;
            }
            break;
          case 66216390: 
            if (paramString.equals("F3311")) {
              i = 48;
            }
            break;
          case 66215433: 
            if (paramString.equals("F3215")) {
              i = 47;
            }
            break;
          case 66215431: 
            if (paramString.equals("F3213")) {
              i = 46;
            }
            break;
          case 66215429: 
            if (paramString.equals("F3211")) {
              i = 45;
            }
            break;
          case 66214473: 
            if (paramString.equals("F3116")) {
              i = 44;
            }
            break;
          case 66214470: 
            if (paramString.equals("F3113")) {
              i = 43;
            }
            break;
          case 66214468: 
            if (paramString.equals("F3111")) {
              i = 42;
            }
            break;
          case 65355429: 
            if (paramString.equals("E5643")) {
              i = 30;
            }
            break;
          case 61542055: 
            if (paramString.equals("A1601")) {
              i = 7;
            }
            break;
          case 55178625: 
            if (paramString.equals("Aura_Note_2")) {
              i = 15;
            }
            break;
          case 51350594: 
            if (paramString.equals("602LV")) {
              i = 4;
            }
            break;
          case 51349633: 
            if (paramString.equals("601LV")) {
              i = 3;
            }
            break;
          case 41325051: 
            if (paramString.equals("MEIZU_M5")) {
              i = 83;
            }
            break;
          case 3386211: 
            if (paramString.equals("p212")) {
              i = 92;
            }
            break;
          case 3351335: 
            if (paramString.equals("mido")) {
              i = 85;
            }
            break;
          case 3284551: 
            if (paramString.equals("kate")) {
              i = 75;
            }
            break;
          case 3154429: 
            if (paramString.equals("fugu")) {
              i = 50;
            }
            break;
          case 2689555: 
            if (paramString.equals("XE2X")) {
              i = 136;
            }
            break;
          case 2464648: 
            if (paramString.equals("Q427")) {
              i = 111;
            }
            break;
          case 2463773: 
            if (paramString.equals("Q350")) {
              i = 109;
            }
            break;
          case 2436959: 
            if (paramString.equals("P681")) {
              i = 93;
            }
            break;
          case 2133184: 
            if (paramString.equals("F04J")) {
              i = 41;
            }
            break;
          case 2133182: 
            if (paramString.equals("F04H")) {
              i = 40;
            }
            break;
          case 2133151: 
            if (paramString.equals("F03H")) {
              i = 39;
            }
            break;
          case 2133120: 
            if (paramString.equals("F02H")) {
              i = 38;
            }
            break;
          case 2133091: 
            if (paramString.equals("F01J")) {
              i = 37;
            }
            break;
          case 2133089: 
            if (paramString.equals("F01H")) {
              i = 36;
            }
            break;
          case 1514185: 
            if (paramString.equals("1714")) {
              i = 2;
            }
            break;
          case 1514184: 
            if (paramString.equals("1713")) {
              i = 1;
            }
            break;
          case 1513190: 
            if (paramString.equals("1601")) {
              i = 0;
            }
            break;
          case 101481: 
            if (paramString.equals("flo")) {
              i = 49;
            }
            break;
          case 99329: 
            if (paramString.equals("deb")) {
              i = k;
            }
            break;
          case 98848: 
            if (paramString.equals("cv3")) {
              i = 27;
            }
            break;
          case 98846: 
            if (paramString.equals("cv1")) {
              i = 26;
            }
            break;
          case 88274: 
            if (paramString.equals("Z80")) {
              i = 139;
            }
            break;
          case 80618: 
            if (paramString.equals("QX1")) {
              i = 115;
            }
            break;
          case 79305: 
            if (paramString.equals("PLE")) {
              i = 107;
            }
            break;
          case 78669: 
            if (paramString.equals("P85")) {
              i = 94;
            }
            break;
          case 76779: 
            if (paramString.equals("MX6")) {
              i = 86;
            }
            break;
          case 75739: 
            if (paramString.equals("M5c")) {
              i = 80;
            }
            break;
          case 75537: 
            if (paramString.equals("M04")) {
              i = 79;
            }
            break;
          case 73405: 
            if (paramString.equals("JGZ")) {
              i = 73;
            }
            break;
          case 3483: 
            if (paramString.equals("mh")) {
              i = 84;
            }
            break;
          case 3091: 
            if (paramString.equals("b5")) {
              i = 16;
            }
            break;
          case 2719: 
            if (paramString.equals("V5")) {
              i = 129;
            }
            break;
          case 2715: 
            if (paramString.equals("V1")) {
              i = 127;
            }
            break;
          case 2564: 
            if (paramString.equals("Q5")) {
              i = 113;
            }
            break;
          case 2126: 
            if (paramString.equals("C1")) {
              i = 20;
            }
            break;
          case -56598463: 
            if (paramString.equals("woods_fn")) {
              i = 134;
            }
            break;
          case -173639913: 
            if (paramString.equals("ELUGA_A3_Pro")) {
              i = 31;
            }
            break;
          case -277133239: 
            if (paramString.equals("Z12_PRO")) {
              i = 138;
            }
            break;
          case -282781963: 
            if (paramString.equals("BLACK-1X")) {
              i = 17;
            }
            break;
          case -290434366: 
            if (paramString.equals("taido_row")) {
              i = 121;
            }
            break;
          case -430914369: 
            if (paramString.equals("Pixi4-7_3G")) {
              i = 105;
            }
            break;
          case -521118391: 
            if (paramString.equals("GIONEE_GBL7360")) {
              i = 53;
            }
            break;
          case -575125681: 
            if (paramString.equals("GiONEE_CBL7513")) {
              i = 51;
            }
            break;
          case -782144577: 
            if (paramString.equals("OnePlus5T")) {
              i = 91;
            }
            break;
          case -788334647: 
            if (paramString.equals("whyred")) {
              i = 132;
            }
            break;
          case -794946968: 
            if (paramString.equals("watson")) {
              i = 131;
            }
            break;
          case -797483286: 
            if (paramString.equals("SVP-DTV15")) {
              i = 119;
            }
            break;
          case -821392978: 
            if (paramString.equals("A7000-a")) {
              i = 9;
            }
            break;
          case -842500323: 
            if (paramString.equals("nicklaus_f")) {
              i = 88;
            }
            break;
          case -879245230: 
            if (paramString.equals("tcl_eu")) {
              i = 126;
            }
            break;
          case -958336948: 
            if (paramString.equals("ELUGA_Ray_X")) {
              i = 34;
            }
            break;
          case -965403638: 
            if (paramString.equals("s905x018")) {
              i = 120;
            }
            break;
          case -993250458: 
            if (paramString.equals("A10-70L")) {
              i = 6;
            }
            break;
          case -993250464: 
            if (paramString.equals("A10-70F")) {
              i = 5;
            }
            break;
          case -1052835013: 
            if (paramString.equals("namath")) {
              i = 87;
            }
            break;
          case -1139198265: 
            if (paramString.equals("Slate_Pro")) {
              i = 118;
            }
            break;
          case -1180384755: 
            if (paramString.equals("iris60")) {
              i = 70;
            }
            break;
          case -1217592143: 
            if (paramString.equals("BRAVIA_ATV2")) {
              i = 18;
            }
            break;
          case -1320080169: 
            if (paramString.equals("GiONEE_GBL7319")) {
              i = 52;
            }
            break;
          case -1481772729: 
            if (paramString.equals("panell_dt")) {
              i = 99;
            }
            break;
          case -1481772730: 
            if (paramString.equals("panell_ds")) {
              i = 98;
            }
            break;
          case -1481772737: 
            if (paramString.equals("panell_dl")) {
              i = 97;
            }
            break;
          case -1554255044: 
            if (paramString.equals("vernee_M5")) {
              i = 130;
            }
            break;
          case -1600724499: 
            if (paramString.equals("pacificrim")) {
              i = 95;
            }
            break;
          case -1615810839: 
            if (paramString.equals("Phantom6")) {
              i = 104;
            }
            break;
          case -1680025915: 
            if (paramString.equals("ComioS1")) {
              i = 21;
            }
            break;
          case -1696512866: 
            if (paramString.equals("XT1663")) {
              i = 137;
            }
            break;
          case -1885099851: 
            if (paramString.equals("RAIJIN")) {
              i = 116;
            }
            break;
          case -1931988508: 
            if (paramString.equals("AquaPowerM")) {
              i = 13;
            }
            break;
          case -1936688065: 
            if (paramString.equals("PGN611")) {
              i = 103;
            }
            break;
          case -1936688066: 
            if (paramString.equals("PGN610")) {
              i = 102;
            }
            break;
          case -1936688988: 
            if (paramString.equals("PGN528")) {
              i = 101;
            }
            break;
          case -1978990237: 
            if (paramString.equals("NX573J")) {
              i = 90;
            }
            break;
          case -1978993182: 
            if (paramString.equals("NX541J")) {
              i = 89;
            }
            break;
          case -2022874474: 
            if (paramString.equals("CP8676_I02")) {
              i = 22;
            }
            break;
          case -2097309513: 
            if (paramString.equals("K50a40")) {
              i = 74;
            }
            break;
          case -2144781160: 
            if (paramString.equals("GIONEE_SWW1631")) {
              i = 56;
            }
            break;
          case -2144781185: 
            if (paramString.equals("GIONEE_SWW1627")) {
              i = 55;
            }
            break;
          case -2144781245: 
            if (paramString.equals("GIONEE_SWW1609")) {
              i = 54;
            }
            break;
          }
          i = -1;
          switch (i)
          {
          }
          i = str.hashCode();
          if (i != -594534941)
          {
            i = j;
          }
          else
          {
            i = j;
            if (str.equals("JSN-L21")) {
              i = 0;
            }
          }
        } while (i == 0);
        bool1 = bool2;
        zzd = bool1;
        zzc = true;
      }
      return zzd;
    }
    finally {}
  }
  
  protected static final boolean zzaN(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    return (zzaV(paramLong1)) && (!paramBoolean);
  }
  
  private final long zzaO(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    double d = zzaj();
    paramLong4 = ((paramLong4 - paramLong1) / d);
    paramLong1 = paramLong4;
    if (paramBoolean) {
      paramLong1 = paramLong4 - (paramLong3 - paramLong2);
    }
    return paramLong1;
  }
  
  private static List zzaP(Context paramContext, zzrv paramzzrv, zzam paramzzam, boolean paramBoolean1, boolean paramBoolean2)
    throws zzsc
  {
    paramzzrv = paramzzam.zzm;
    if (paramzzrv == null) {
      return zzfrr.zzl();
    }
    paramzzrv = zzsi.zzf(paramzzrv, paramBoolean1, paramBoolean2);
    Object localObject = zzsi.zze(paramzzam);
    if (localObject == null) {
      return zzfrr.zzj(paramzzrv);
    }
    localObject = zzsi.zzf((String)localObject, paramBoolean1, paramBoolean2);
    if ((zzfn.zza >= 26) && ("video/dolby-vision".equals(paramzzam.zzm)) && (!((List)localObject).isEmpty()) && (!zzyi.zza(paramContext))) {
      return zzfrr.zzj((Collection)localObject);
    }
    paramContext = new zzfro();
    paramContext.zzh(paramzzrv);
    paramContext.zzh((Iterable)localObject);
    return paramContext.zzi();
  }
  
  private final void zzaQ(zzdn paramzzdn)
  {
    if ((!paramzzdn.equals(zzdn.zza)) && (!paramzzdn.equals(this.zzF)))
    {
      this.zzF = paramzzdn;
      this.zzg.zzt(paramzzdn);
    }
  }
  
  private final void zzaR()
  {
    zzdn localzzdn = this.zzF;
    if (localzzdn != null) {
      this.zzg.zzt(localzzdn);
    }
  }
  
  private final void zzaS()
  {
    Surface localSurface = this.zzm;
    zzyp localzzyp = this.zzn;
    if (localSurface == localzzyp) {
      this.zzm = null;
    }
    localzzyp.release();
    this.zzn = null;
  }
  
  private final void zzaT(zzrm paramzzrm, zzam paramzzam, int paramInt, long paramLong, boolean paramBoolean)
  {
    long l;
    if (this.zzh.zzl()) {
      l = this.zzh.zza(paramLong, zzak()) * 1000L;
    } else {
      l = System.nanoTime();
    }
    if (zzfn.zza >= 21)
    {
      zzaG(paramzzrm, paramInt, paramLong, l);
      return;
    }
    zzaF(paramzzrm, paramInt, paramLong);
  }
  
  private static boolean zzaU()
  {
    return zzfn.zza >= 21;
  }
  
  private static boolean zzaV(long paramLong)
  {
    return paramLong < -30000L;
  }
  
  private final boolean zzaW(long paramLong1, long paramLong2)
  {
    int i = zzbc();
    boolean bool2 = this.zzs;
    boolean bool1 = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (!bool2 ? (i != 0) || (this.zzr) : !this.zzq) {
      j = 1;
    } else {
      j = 0;
    }
    long l2 = SystemClock.elapsedRealtime();
    long l1 = this.zzA;
    if ((this.zzu == -9223372036854775807L) && (paramLong1 >= zzak()))
    {
      if (j != 0) {
        break label138;
      }
      if ((i != 0) && (zzaV(paramLong2)) && (l2 * 1000L - l1 > 100000L)) {
        return true;
      }
    }
    bool1 = false;
    label138:
    return bool1;
  }
  
  private final boolean zzaX(zzrp paramzzrp)
  {
    int i = zzfn.zza;
    boolean bool = true;
    if ((i >= 23) && (!zzaM(paramzzrp.zza)))
    {
      if (!paramzzrp.zzf) {
        return bool;
      }
      if (zzyp.zzb(this.zze)) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
  
  public final void zzF(float paramFloat1, float paramFloat2)
    throws zzia
  {
    super.zzF(paramFloat1, paramFloat2);
    this.zzf.zze(paramFloat1);
  }
  
  public final String zzM()
  {
    return "MediaCodecVideoRenderer";
  }
  
  public final void zzN(long paramLong1, long paramLong2)
    throws zzia
  {
    super.zzN(paramLong1, paramLong2);
    if (this.zzh.zzl()) {
      this.zzh.zzg(paramLong1, paramLong2);
    }
  }
  
  public final boolean zzO()
  {
    boolean bool = super.zzO();
    if (this.zzh.zzl()) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean zzP()
  {
    if ((super.zzP()) && ((!this.zzh.zzl()) || (this.zzh.zzm()))) {
      if (!this.zzq)
      {
        zzyp localzzyp = this.zzn;
        if (((localzzyp == null) || (this.zzm != localzzyp)) && (zzal() != null)) {}
      }
      else
      {
        this.zzu = -9223372036854775807L;
        return true;
      }
    }
    if (this.zzu == -9223372036854775807L) {
      return false;
    }
    if (SystemClock.elapsedRealtime() < this.zzu) {
      return true;
    }
    this.zzu = -9223372036854775807L;
    return false;
  }
  
  protected final float zzR(float paramFloat, zzam paramzzam, zzam[] paramArrayOfzzam)
  {
    int i = 0;
    float f2;
    for (float f1 = -1.0F; i < paramArrayOfzzam.length; f1 = f2)
    {
      float f3 = paramArrayOfzzam[i].zzt;
      f2 = f1;
      if (f3 != -1.0F) {
        f2 = Math.max(f1, f3);
      }
      i++;
    }
    if (f1 == -1.0F) {
      return -1.0F;
    }
    return f1 * paramFloat;
  }
  
  protected final int zzS(zzrv paramzzrv, zzam paramzzam)
    throws zzsc
  {
    boolean bool1 = zzcd.zzg(paramzzam.zzm);
    int i2 = 128;
    if (!bool1) {
      return 128;
    }
    Object localObject1 = paramzzam.zzp;
    int i1 = 0;
    if (localObject1 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject2 = zzaP(this.zze, paramzzrv, paramzzam, bool1, false);
    localObject1 = localObject2;
    if (bool1)
    {
      localObject1 = localObject2;
      if (((List)localObject2).isEmpty()) {
        localObject1 = zzaP(this.zze, paramzzrv, paramzzam, false, false);
      }
    }
    if (((List)localObject1).isEmpty()) {
      return 129;
    }
    if (!zzay(paramzzam)) {
      return 130;
    }
    zzrp localzzrp = (zzrp)((List)localObject1).get(0);
    boolean bool2 = localzzrp.zze(paramzzam);
    if (!bool2) {
      for (i = 1; i < ((List)localObject1).size(); i++)
      {
        localObject2 = (zzrp)((List)localObject1).get(i);
        if (((zzrp)localObject2).zze(paramzzam))
        {
          localObject1 = localObject2;
          m = 0;
          bool2 = true;
          break label208;
        }
      }
    }
    int m = 1;
    localObject1 = localzzrp;
    label208:
    int j;
    if (true != bool2) {
      j = 3;
    } else {
      j = 4;
    }
    int k;
    if (true != ((zzrp)localObject1).zzf(paramzzam)) {
      k = 8;
    } else {
      k = 16;
    }
    int n;
    if (true != ((zzrp)localObject1).zzg) {
      n = 0;
    } else {
      n = 64;
    }
    int i = i2;
    if (1 != m) {
      i = 0;
    }
    m = i;
    if (zzfn.zza >= 26)
    {
      m = i;
      if ("video/dolby-vision".equals(paramzzam.zzm))
      {
        m = i;
        if (!zzyi.zza(this.zze)) {
          m = 256;
        }
      }
    }
    i = i1;
    if (bool2)
    {
      paramzzrv = zzaP(this.zze, paramzzrv, paramzzam, bool1, true);
      i = i1;
      if (!paramzzrv.isEmpty())
      {
        paramzzrv = (zzrp)zzsi.zzg(paramzzrv, paramzzam).get(0);
        i = i1;
        if (paramzzrv.zze(paramzzam))
        {
          i = i1;
          if (paramzzrv.zzf(paramzzam)) {
            i = 32;
          }
        }
      }
    }
    return j | k | i | n | m;
  }
  
  protected final zzht zzT(zzrp paramzzrp, zzam paramzzam1, zzam paramzzam2)
  {
    zzht localzzht = paramzzrp.zzb(paramzzam1, paramzzam2);
    int j = localzzht.zze;
    int i = paramzzam2.zzr;
    zzyj localzzyj = this.zzj;
    if (i <= localzzyj.zza)
    {
      i = j;
      if (paramzzam2.zzs <= localzzyj.zzb) {}
    }
    else
    {
      i = j | 0x100;
    }
    j = i;
    if (zzW(paramzzrp, paramzzam2) > this.zzj.zzc) {
      j = i | 0x40;
    }
    paramzzrp = paramzzrp.zza;
    if (j != 0)
    {
      i = 0;
    }
    else
    {
      i = localzzht.zzd;
      j = 0;
    }
    return new zzht(paramzzrp, paramzzam1, paramzzam2, i, j);
  }
  
  protected final zzht zzU(zzkf paramzzkf)
    throws zzia
  {
    zzht localzzht = super.zzU(paramzzkf);
    this.zzg.zzf(paramzzkf.zza, localzzht);
    return localzzht;
  }
  
  protected final zzrk zzX(zzrp paramzzrp, zzam paramzzam, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    paramMediaCrypto = this.zzn;
    if ((paramMediaCrypto != null) && (paramMediaCrypto.zza != paramzzrp.zzf)) {
      zzaS();
    }
    paramMediaCrypto = paramzzrp.zzc;
    zzam[] arrayOfzzam = zzL();
    int k = paramzzam.zzr;
    int i1 = paramzzam.zzs;
    int i = zzW(paramzzrp, paramzzam);
    int i5 = arrayOfzzam.length;
    int j;
    int i4;
    int i3;
    int i2;
    if (i5 == 1)
    {
      j = i;
      if (i != -1)
      {
        m = zzV(paramzzrp, paramzzam);
        j = i;
        if (m != -1) {
          j = Math.min((int)(i * 1.5F), m);
        }
      }
      localObject2 = new zzyj(k, i1, j);
      localObject1 = paramMediaCrypto;
      paramMediaCrypto = (MediaCrypto)localObject2;
    }
    else
    {
      m = 0;
      n = 0;
      j = i1;
      while (m < i5)
      {
        localObject2 = arrayOfzzam[m];
        localObject1 = localObject2;
        if (paramzzam.zzy != null)
        {
          localObject1 = localObject2;
          if (((zzam)localObject2).zzy == null)
          {
            localObject1 = ((zzam)localObject2).zzb();
            ((zzak)localObject1).zzy(paramzzam.zzy);
            localObject1 = ((zzak)localObject1).zzY();
          }
        }
        i4 = k;
        i3 = j;
        i2 = i;
        i1 = n;
        if (paramzzrp.zzb(paramzzam, (zzam)localObject1).zzd != 0)
        {
          i2 = ((zzam)localObject1).zzr;
          if ((i2 != -1) && (((zzam)localObject1).zzs != -1)) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          i1 = n | i1;
          i4 = Math.max(k, i2);
          i3 = Math.max(j, ((zzam)localObject1).zzs);
          i2 = Math.max(i, zzW(paramzzrp, (zzam)localObject1));
        }
        m++;
        k = i4;
        j = i3;
        i = i2;
        n = i1;
      }
      if (n != 0)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Resolutions unknown. Codec max resolution: ");
        ((StringBuilder)localObject1).append(k);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(j);
        zzer.zze("MediaCodecVideoRenderer", ((StringBuilder)localObject1).toString());
        i1 = paramzzam.zzs;
        i2 = paramzzam.zzr;
        if (i1 > i2) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0) {
          n = i1;
        } else {
          n = i2;
        }
        if (1 == m) {
          i1 = i2;
        }
        localObject1 = zzb;
        i2 = 0;
      }
    }
    for (;;)
    {
      float f1;
      if (i2 < 9)
      {
        float f3 = i1;
        f1 = n;
        i4 = localObject1[i2];
        float f2 = i4;
        if (i4 > n)
        {
          i3 = (int)(f2 * (f3 / f1));
          if (i3 > i1) {
            if (zzfn.zza >= 21)
            {
              if (1 != m) {
                i5 = i4;
              } else {
                i5 = i3;
              }
              if (1 == m) {
                i3 = i4;
              }
              localObject2 = paramzzrp.zza(i5, i3);
              f1 = paramzzam.zzt;
              if (!paramzzrp.zzg(((Point)localObject2).x, ((Point)localObject2).y, f1)) {
                break label667;
              }
              localObject1 = localObject2;
              break label676;
            }
          }
        }
      }
      try
      {
        i4 = (i4 + 15) / 16 * 16;
        i3 = (i3 + 15) / 16 * 16;
        if (i4 * i3 <= zzsi.zza())
        {
          if (1 != m) {
            n = i4;
          } else {
            n = i3;
          }
          if (1 != m) {
            i4 = i3;
          }
          localObject1 = new Point(n, i4);
          break label676;
        }
        label667:
        i2++;
      }
      catch (zzsc localzzsc)
      {
        label676:
        boolean bool;
        for (;;) {}
      }
    }
    Object localObject1 = null;
    Object localObject2 = paramMediaCrypto;
    int m = k;
    int n = j;
    i1 = i;
    paramMediaCrypto = (MediaCrypto)localObject2;
    if (localObject1 != null)
    {
      m = Math.max(k, ((Point)localObject1).x);
      n = Math.max(j, ((Point)localObject1).y);
      paramMediaCrypto = paramzzam.zzb();
      paramMediaCrypto.zzX(m);
      paramMediaCrypto.zzF(n);
      i1 = Math.max(i, zzV(paramzzrp, paramMediaCrypto.zzY()));
      paramMediaCrypto = new StringBuilder();
      paramMediaCrypto.append("Codec max resolution adjusted to: ");
      paramMediaCrypto.append(m);
      paramMediaCrypto.append("x");
      paramMediaCrypto.append(n);
      zzer.zze("MediaCodecVideoRenderer", paramMediaCrypto.toString());
      paramMediaCrypto = (MediaCrypto)localObject2;
      break label823;
      i1 = i;
      n = j;
      m = k;
    }
    label823:
    localObject2 = new zzyj(m, n, i1);
    localObject1 = paramMediaCrypto;
    paramMediaCrypto = (MediaCrypto)localObject2;
    this.zzj = paramMediaCrypto;
    bool = this.zzi;
    localObject2 = new MediaFormat();
    ((MediaFormat)localObject2).setString("mime", (String)localObject1);
    ((MediaFormat)localObject2).setInteger("width", paramzzam.zzr);
    ((MediaFormat)localObject2).setInteger("height", paramzzam.zzs);
    zzet.zzb((MediaFormat)localObject2, paramzzam.zzo);
    f1 = paramzzam.zzt;
    if (f1 != -1.0F) {
      ((MediaFormat)localObject2).setFloat("frame-rate", f1);
    }
    zzet.zza((MediaFormat)localObject2, "rotation-degrees", paramzzam.zzu);
    localObject1 = paramzzam.zzy;
    if (localObject1 != null)
    {
      zzet.zza((MediaFormat)localObject2, "color-transfer", ((zzs)localObject1).zzf);
      zzet.zza((MediaFormat)localObject2, "color-standard", ((zzs)localObject1).zzd);
      zzet.zza((MediaFormat)localObject2, "color-range", ((zzs)localObject1).zze);
      localObject1 = ((zzs)localObject1).zzg;
      if (localObject1 != null) {
        ((MediaFormat)localObject2).setByteBuffer("hdr-static-info", ByteBuffer.wrap((byte[])localObject1));
      }
    }
    if ("video/dolby-vision".equals(paramzzam.zzm))
    {
      localObject1 = zzsi.zzb(paramzzam);
      if (localObject1 != null) {
        zzet.zza((MediaFormat)localObject2, "profile", ((Integer)((Pair)localObject1).first).intValue());
      }
    }
    ((MediaFormat)localObject2).setInteger("max-width", paramMediaCrypto.zza);
    ((MediaFormat)localObject2).setInteger("max-height", paramMediaCrypto.zzb);
    zzet.zza((MediaFormat)localObject2, "max-input-size", paramMediaCrypto.zzc);
    if (zzfn.zza >= 23)
    {
      ((MediaFormat)localObject2).setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        ((MediaFormat)localObject2).setFloat("operating-rate", paramFloat);
      }
    }
    if (bool)
    {
      ((MediaFormat)localObject2).setInteger("no-post-process", 1);
      ((MediaFormat)localObject2).setInteger("auto-frc", 0);
    }
    if (this.zzm == null) {
      if (zzaX(paramzzrp))
      {
        if (this.zzn == null) {
          this.zzn = zzyp.zza(this.zze, paramzzrp.zzf);
        }
        this.zzm = this.zzn;
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    if (this.zzh.zzl()) {
      this.zzh.zzb((MediaFormat)localObject2);
    }
    if (this.zzh.zzl()) {
      paramMediaCrypto = this.zzh.zzc();
    } else {
      paramMediaCrypto = this.zzm;
    }
    return zzrk.zzb(paramzzrp, (MediaFormat)localObject2, paramzzam, paramMediaCrypto, null);
  }
  
  protected final List zzY(zzrv paramzzrv, zzam paramzzam, boolean paramBoolean)
    throws zzsc
  {
    return zzsi.zzg(zzaP(this.zze, paramzzrv, paramzzam, false, false), paramzzam);
  }
  
  protected final void zzZ(Exception paramException)
  {
    zzer.zzc("MediaCodecVideoRenderer", "Video codec error", paramException);
    this.zzg.zzs(paramException);
  }
  
  final void zzaE()
  {
    this.zzs = true;
    if (!this.zzq)
    {
      this.zzq = true;
      this.zzg.zzq(this.zzm);
      this.zzo = true;
    }
  }
  
  protected final void zzaF(zzrm paramzzrm, int paramInt, long paramLong)
  {
    int i = zzfn.zza;
    Trace.beginSection("releaseOutputBuffer");
    paramzzrm.zzn(paramInt, true);
    Trace.endSection();
    paramzzrm = this.zza;
    paramzzrm.zze += 1;
    this.zzx = 0;
    if (!this.zzh.zzl())
    {
      this.zzA = (SystemClock.elapsedRealtime() * 1000L);
      zzaQ(this.zzE);
      zzaE();
    }
  }
  
  protected final void zzaG(zzrm paramzzrm, int paramInt, long paramLong1, long paramLong2)
  {
    int i = zzfn.zza;
    Trace.beginSection("releaseOutputBuffer");
    paramzzrm.zzm(paramInt, paramLong2);
    Trace.endSection();
    paramzzrm = this.zza;
    paramzzrm.zze += 1;
    this.zzx = 0;
    if (!this.zzh.zzl())
    {
      this.zzA = (SystemClock.elapsedRealtime() * 1000L);
      zzaQ(this.zzE);
      zzaE();
    }
  }
  
  protected final void zzaH(zzrm paramzzrm, int paramInt, long paramLong)
  {
    int i = zzfn.zza;
    Trace.beginSection("skipVideoBuffer");
    paramzzrm.zzn(paramInt, false);
    Trace.endSection();
    paramzzrm = this.zza;
    paramzzrm.zzf += 1;
  }
  
  protected final void zzaI(int paramInt1, int paramInt2)
  {
    zzhs localzzhs = this.zza;
    localzzhs.zzh += paramInt1;
    int i = localzzhs.zzg;
    paramInt1 += paramInt2;
    localzzhs.zzg = (i + paramInt1);
    this.zzw += paramInt1;
    paramInt1 = this.zzx + paramInt1;
    this.zzx = paramInt1;
    localzzhs.zzi = Math.max(paramInt1, localzzhs.zzi);
  }
  
  protected final void zzaJ(long paramLong)
  {
    zzhs localzzhs = this.zza;
    localzzhs.zzk += paramLong;
    localzzhs.zzl += 1;
    this.zzB += paramLong;
    this.zzC += 1;
  }
  
  protected final void zzaa(String paramString, zzrk paramzzrk, long paramLong1, long paramLong2)
  {
    this.zzg.zza(paramString, paramLong1, paramLong2);
    this.zzk = zzaM(paramString);
    paramzzrk = zzan();
    Objects.requireNonNull(paramzzrk);
    int i = zzfn.zza;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 29)
    {
      bool1 = bool2;
      if ("video/x-vnd.on2.vp9".equals(paramzzrk.zzb))
      {
        paramzzrk = paramzzrk.zzh();
        int j = paramzzrk.length;
        for (i = 0;; i++)
        {
          bool1 = bool2;
          if (i >= j) {
            break;
          }
          if (paramzzrk[i].profile == 16384)
          {
            bool1 = true;
            break;
          }
        }
      }
    }
    this.zzl = bool1;
    this.zzh.zzf(paramString);
  }
  
  protected final void zzab(String paramString)
  {
    this.zzg.zzb(paramString);
  }
  
  protected final void zzac(zzam paramzzam, MediaFormat paramMediaFormat)
  {
    zzrm localzzrm = zzal();
    if (localzzrm != null) {
      localzzrm.zzq(this.zzp);
    }
    Objects.requireNonNull(paramMediaFormat);
    boolean bool = paramMediaFormat.containsKey("crop-right");
    int i1 = 0;
    int j;
    if ((bool) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top"))) {
      j = 1;
    } else {
      j = 0;
    }
    int i;
    if (j != 0) {
      i = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
    } else {
      i = paramMediaFormat.getInteger("width");
    }
    if (j != 0) {
      j = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
    } else {
      j = paramMediaFormat.getInteger("height");
    }
    float f2 = paramzzam.zzv;
    int k;
    int m;
    int n;
    float f1;
    if (zzaU())
    {
      int i2 = paramzzam.zzu;
      if (i2 != 90)
      {
        k = i;
        m = j;
        n = i1;
        f1 = f2;
        if (i2 != 270) {}
      }
      else
      {
        f1 = 1.0F / f2;
        k = j;
        m = i;
        n = i1;
      }
    }
    else
    {
      k = i;
      m = j;
      n = i1;
      f1 = f2;
      if (!this.zzh.zzl())
      {
        n = paramzzam.zzu;
        f1 = f2;
        m = j;
        k = i;
      }
    }
    this.zzE = new zzdn(k, m, n, f1);
    this.zzf.zzc(paramzzam.zzt);
    if (this.zzh.zzl())
    {
      paramMediaFormat = this.zzh;
      paramzzam = paramzzam.zzb();
      paramzzam.zzX(k);
      paramzzam.zzF(m);
      paramzzam.zzR(n);
      paramzzam.zzP(f1);
      paramMediaFormat.zzi(paramzzam.zzY());
    }
  }
  
  protected final void zzae()
  {
    this.zzq = false;
    int i = zzfn.zza;
  }
  
  protected final void zzaf(zzhi paramzzhi)
    throws zzia
  {
    this.zzy += 1;
    int i = zzfn.zza;
  }
  
  protected final boolean zzah(long paramLong1, long paramLong2, zzrm paramzzrm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, zzam paramzzam)
    throws zzia
  {
    Objects.requireNonNull(paramzzrm);
    if (this.zzt == -9223372036854775807L) {
      this.zzt = paramLong1;
    }
    if (paramLong3 != this.zzz)
    {
      if (!this.zzh.zzl()) {
        this.zzf.zzd(paramLong3);
      }
      this.zzz = paramLong3;
    }
    long l1 = paramLong3 - zzak();
    if ((paramBoolean1) && (!paramBoolean2))
    {
      zzaH(paramzzrm, paramInt1, l1);
      return true;
    }
    if (zzbc() == 2) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    paramLong3 = zzaO(paramLong1, paramLong2, SystemClock.elapsedRealtime() * 1000L, paramLong3, paramBoolean1);
    if (this.zzm == this.zzn) {
      if (zzaV(paramLong3))
      {
        zzaH(paramzzrm, paramInt1, l1);
        zzaJ(paramLong3);
      }
    }
    for (;;)
    {
      return true;
      return false;
      if (zzaW(paramLong1, paramLong3))
      {
        if (this.zzh.zzl())
        {
          if (this.zzh.zzo(paramzzam, l1, paramBoolean2)) {
            paramBoolean1 = false;
          } else {
            return false;
          }
        }
        else {
          paramBoolean1 = true;
        }
        zzaT(paramzzrm, paramzzam, paramInt1, l1, paramBoolean1);
        zzaJ(paramLong3);
      }
      else
      {
        if ((!paramBoolean1) || (paramLong1 == this.zzt)) {
          break label686;
        }
        long l3 = System.nanoTime();
        long l2 = this.zzf.zza(l3 + paramLong3 * 1000L);
        if (!this.zzh.zzl()) {
          paramLong3 = (l2 - l3) / 1000L;
        }
        l3 = this.zzu;
        if ((paramLong3 < -500000L) && (!paramBoolean2))
        {
          paramInt2 = zzd(paramLong1);
          if (paramInt2 != 0)
          {
            if (l3 != -9223372036854775807L)
            {
              paramzzrm = this.zza;
              paramzzrm.zzd += paramInt2;
              paramzzrm.zzf += this.zzy;
            }
            else
            {
              paramzzrm = this.zza;
              paramzzrm.zzj += 1;
              zzaI(paramInt2, this.zzy);
            }
            zzav();
            if (this.zzh.zzl()) {
              this.zzh.zze();
            }
            return false;
          }
        }
        if (zzaN(paramLong3, paramLong2, paramBoolean2))
        {
          if (l3 != -9223372036854775807L)
          {
            zzaH(paramzzrm, paramInt1, l1);
          }
          else
          {
            paramInt2 = zzfn.zza;
            Trace.beginSection("dropVideoBuffer");
            paramzzrm.zzn(paramInt1, false);
            Trace.endSection();
            zzaI(0, 1);
          }
          zzaJ(paramLong3);
          return true;
        }
        if (this.zzh.zzl())
        {
          this.zzh.zzg(paramLong1, paramLong2);
          if (this.zzh.zzo(paramzzam, l1, paramBoolean2)) {
            zzaT(paramzzrm, paramzzam, paramInt1, l1, false);
          } else {
            return false;
          }
        }
        else if (zzfn.zza >= 21)
        {
          if (paramLong3 >= 50000L) {
            break;
          }
          if (l2 == this.zzD) {
            zzaH(paramzzrm, paramInt1, l1);
          } else {
            zzaG(paramzzrm, paramInt1, l1, l2);
          }
          zzaJ(paramLong3);
          this.zzD = l2;
        }
        else
        {
          if (paramLong3 >= 30000L) {
            break;
          }
          if (paramLong3 > 11000L) {
            try
            {
              Thread.sleep((-10000L + paramLong3) / 1000L);
            }
            catch (InterruptedException paramzzrm)
            {
              Thread.currentThread().interrupt();
              return false;
            }
          }
          zzaF(paramzzrm, paramInt1, l1);
          zzaJ(paramLong3);
        }
      }
    }
    return false;
    label686:
    return false;
  }
  
  protected final zzrn zzam(Throwable paramThrowable, zzrp paramzzrp)
  {
    return new zzyh(paramThrowable, paramzzrp, this.zzm);
  }
  
  protected final void zzao(zzhi paramzzhi)
    throws zzia
  {
    if (!this.zzl) {
      return;
    }
    Object localObject = paramzzhi.zze;
    Objects.requireNonNull(localObject);
    if (((ByteBuffer)localObject).remaining() >= 7)
    {
      int k = ((ByteBuffer)localObject).get();
      int j = ((ByteBuffer)localObject).getShort();
      int n = ((ByteBuffer)localObject).getShort();
      int m = ((ByteBuffer)localObject).get();
      int i = ((ByteBuffer)localObject).get();
      ((ByteBuffer)localObject).position(0);
      if ((k == -75) && (j == 60) && (n == 1) && (m == 4) && ((i == 0) || (i == 1)))
      {
        paramzzhi = new byte[((ByteBuffer)localObject).remaining()];
        ((ByteBuffer)localObject).get(paramzzhi);
        ((ByteBuffer)localObject).position(0);
        zzrm localzzrm = zzal();
        localObject = new Bundle();
        ((Bundle)localObject).putByteArray("hdr10-plus-info", paramzzhi);
        localzzrm.zzp((Bundle)localObject);
      }
    }
  }
  
  protected final void zzaq(long paramLong)
  {
    super.zzaq(paramLong);
    this.zzy -= 1;
  }
  
  protected final void zzar(zzam paramzzam)
    throws zzia
  {
    if (!this.zzh.zzl()) {
      this.zzh.zzn(paramzzam, zzak());
    }
  }
  
  protected final void zzat()
  {
    super.zzat();
    this.zzy = 0;
  }
  
  protected final boolean zzax(zzrp paramzzrp)
  {
    return (this.zzm != null) || (zzaX(paramzzrp));
  }
  
  public final void zzq(int paramInt, Object paramObject)
    throws zzia
  {
    Object localObject;
    if (paramInt != 1)
    {
      if (paramInt != 7)
      {
        if (paramInt != 10)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5)
            {
              if (paramInt != 13)
              {
                if (paramInt == 14)
                {
                  Objects.requireNonNull(paramObject);
                  paramObject = (zzff)paramObject;
                  if ((((zzff)paramObject).zzb() != 0) && (((zzff)paramObject).zza() != 0))
                  {
                    localObject = this.zzm;
                    if (localObject != null) {
                      this.zzh.zzj((Surface)localObject, (zzff)paramObject);
                    }
                  }
                }
              }
              else
              {
                Objects.requireNonNull(paramObject);
                paramObject = (List)paramObject;
                this.zzh.zzk((List)paramObject);
              }
            }
            else {
              this.zzf.zzj(((Integer)paramObject).intValue());
            }
          }
          else
          {
            paramInt = ((Integer)paramObject).intValue();
            this.zzp = paramInt;
            paramObject = zzal();
            if (paramObject != null) {
              ((zzrm)paramObject).zzq(paramInt);
            }
          }
        }
        else
        {
          paramInt = ((Integer)paramObject).intValue();
          if (this.zzG != paramInt) {
            this.zzG = paramInt;
          }
        }
      }
      else {
        this.zzH = ((zzyq)paramObject);
      }
    }
    else
    {
      if ((paramObject instanceof Surface)) {
        paramObject = (Surface)paramObject;
      } else {
        paramObject = null;
      }
      localObject = paramObject;
      if (paramObject == null)
      {
        localObject = this.zzn;
        if (localObject == null)
        {
          zzrp localzzrp = zzan();
          localObject = paramObject;
          if (localzzrp != null)
          {
            localObject = paramObject;
            if (zzaX(localzzrp))
            {
              localObject = zzyp.zza(this.zze, localzzrp.zzf);
              this.zzn = ((zzyp)localObject);
            }
          }
        }
      }
      if (this.zzm != localObject)
      {
        this.zzm = ((Surface)localObject);
        this.zzf.zzi((Surface)localObject);
        this.zzo = false;
        int i = zzbc();
        paramObject = zzal();
        if ((paramObject != null) && (!this.zzh.zzl())) {
          if ((zzfn.zza >= 23) && (localObject != null) && (!this.zzk))
          {
            ((zzrm)paramObject).zzo((Surface)localObject);
          }
          else
          {
            zzas();
            zzap();
          }
        }
        if ((localObject != null) && (localObject != this.zzn))
        {
          zzaR();
          this.zzq = false;
          paramInt = zzfn.zza;
          if (i == 2) {
            this.zzu = -9223372036854775807L;
          }
          if (this.zzh.zzl()) {
            this.zzh.zzj((Surface)localObject, zzff.zza);
          }
        }
        else
        {
          this.zzF = null;
          this.zzq = false;
          paramInt = zzfn.zza;
          if (this.zzh.zzl()) {
            this.zzh.zzd();
          }
        }
      }
      else if ((localObject != null) && (localObject != this.zzn))
      {
        zzaR();
        if (this.zzo) {
          this.zzg.zzq(this.zzm);
        }
      }
    }
  }
  
  protected final void zzt()
  {
    this.zzF = null;
    this.zzq = false;
    int i = zzfn.zza;
    this.zzo = false;
    try
    {
      super.zzt();
      return;
    }
    finally
    {
      this.zzg.zzc(this.zza);
    }
  }
  
  protected final void zzu(boolean paramBoolean1, boolean paramBoolean2)
    throws zzia
  {
    super.zzu(paramBoolean1, paramBoolean2);
    zzk();
    this.zzg.zze(this.zza);
    this.zzr = paramBoolean2;
    this.zzs = false;
  }
  
  protected final void zzv(long paramLong, boolean paramBoolean)
    throws zzia
  {
    super.zzv(paramLong, paramBoolean);
    if (this.zzh.zzl()) {
      this.zzh.zze();
    }
    this.zzq = false;
    int i = zzfn.zza;
    this.zzf.zzf();
    this.zzz = -9223372036854775807L;
    this.zzt = -9223372036854775807L;
    this.zzx = 0;
    this.zzu = -9223372036854775807L;
  }
  
  protected final void zzw()
  {
    try
    {
      super.zzw();
      if (this.zzh.zzl()) {
        this.zzh.zzh();
      }
      if (this.zzn != null) {
        zzaS();
      }
      return;
    }
    finally
    {
      if (this.zzh.zzl()) {
        this.zzh.zzh();
      }
      if (this.zzn != null) {
        zzaS();
      }
    }
  }
  
  protected final void zzx()
  {
    this.zzw = 0;
    this.zzv = SystemClock.elapsedRealtime();
    this.zzA = (SystemClock.elapsedRealtime() * 1000L);
    this.zzB = 0L;
    this.zzC = 0;
    this.zzf.zzg();
  }
  
  protected final void zzy()
  {
    this.zzu = -9223372036854775807L;
    if (this.zzw > 0)
    {
      long l2 = SystemClock.elapsedRealtime();
      long l1 = this.zzv;
      this.zzg.zzd(this.zzw, l2 - l1);
      this.zzw = 0;
      this.zzv = l2;
    }
    int i = this.zzC;
    if (i != 0)
    {
      this.zzg.zzr(this.zzB, i);
      this.zzB = 0L;
      this.zzC = 0;
    }
    this.zzf.zzh();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */