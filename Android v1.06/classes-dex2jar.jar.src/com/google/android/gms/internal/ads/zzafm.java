package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzafm
{
  public int zzA = 1000;
  public int zzB = 200;
  public float zzC = -1.0F;
  public float zzD = -1.0F;
  public float zzE = -1.0F;
  public float zzF = -1.0F;
  public float zzG = -1.0F;
  public float zzH = -1.0F;
  public float zzI = -1.0F;
  public float zzJ = -1.0F;
  public float zzK = -1.0F;
  public float zzL = -1.0F;
  public byte[] zzM;
  public int zzN = 1;
  public int zzO = -1;
  public int zzP = 8000;
  public long zzQ = 0L;
  public long zzR = 0L;
  public zzabs zzS;
  public boolean zzT;
  public boolean zzU = true;
  public zzabr zzV;
  public int zzW;
  private int zzX;
  private String zzY = "eng";
  public String zza;
  public String zzb;
  public int zzc;
  public int zzd;
  public int zze;
  public int zzf;
  public boolean zzg;
  public byte[] zzh;
  public zzabq zzi;
  public byte[] zzj;
  public zzad zzk;
  public int zzl = -1;
  public int zzm = -1;
  public int zzn = -1;
  public int zzo = -1;
  public int zzp = 0;
  public int zzq = -1;
  public float zzr = 0.0F;
  public float zzs = 0.0F;
  public float zzt = 0.0F;
  public byte[] zzu = null;
  public int zzv = -1;
  public boolean zzw = false;
  public int zzx = -1;
  public int zzy = -1;
  public int zzz = -1;
  
  private static Pair zzf(zzfd paramzzfd)
    throws zzce
  {
    try
    {
      paramzzfd.zzG(16);
      long l = paramzzfd.zzq();
      if (l == 1482049860L) {
        return new Pair("video/divx", null);
      }
      if (l == 859189832L) {
        return new Pair("video/3gpp", null);
      }
      if (l == 826496599L)
      {
        int i = paramzzfd.zzc() + 20;
        paramzzfd = paramzzfd.zzH();
        for (;;)
        {
          int j = paramzzfd.length;
          if (i >= j - 4) {
            break;
          }
          if ((paramzzfd[i] == 0) && (paramzzfd[(i + 1)] == 0) && (paramzzfd[(i + 2)] == 1) && (paramzzfd[(i + 3)] == 15)) {
            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(paramzzfd, i, j)));
          }
          i++;
        }
        throw zzce.zza("Failed to find FourCC VC1 initialization data", null);
      }
      zzer.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
      return new Pair("video/x-unknown", null);
    }
    catch (ArrayIndexOutOfBoundsException paramzzfd)
    {
      throw zzce.zza("Error parsing FourCC private data", null);
    }
  }
  
  private static List zzg(byte[] paramArrayOfByte)
    throws zzce
  {
    int j;
    int i;
    int k;
    int m;
    if (paramArrayOfByte[0] == 2)
    {
      j = 1;
      for (i = 0;; i += 255)
      {
        k = paramArrayOfByte[j] & 0xFF;
        if (k != 255) {
          break;
        }
        j++;
      }
      k = i + k;
      j++;
      for (i = 0;; i += 255)
      {
        m = paramArrayOfByte[j] & 0xFF;
        if (m != 255) {
          break;
        }
        j++;
      }
      j++;
      if (paramArrayOfByte[j] != 1) {}
    }
    try
    {
      byte[] arrayOfByte2 = new byte[k];
      System.arraycopy(paramArrayOfByte, j, arrayOfByte2, 0, k);
      j += k;
      if (paramArrayOfByte[j] == 3)
      {
        j += i + m;
        if (paramArrayOfByte[j] == 5)
        {
          i = paramArrayOfByte.length - j;
          byte[] arrayOfByte1 = new byte[i];
          System.arraycopy(paramArrayOfByte, j, arrayOfByte1, 0, i);
          paramArrayOfByte = new java/util/ArrayList;
          paramArrayOfByte.<init>(2);
          paramArrayOfByte.add(arrayOfByte2);
          paramArrayOfByte.add(arrayOfByte1);
          return paramArrayOfByte;
        }
        throw zzce.zza("Error parsing vorbis codec private", null);
      }
      throw zzce.zza("Error parsing vorbis codec private", null);
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
    {
      throw zzce.zza("Error parsing vorbis codec private", null);
    }
    throw zzce.zza("Error parsing vorbis codec private", null);
    throw zzce.zza("Error parsing vorbis codec private", null);
  }
  
  private static boolean zzh(zzfd paramzzfd)
    throws zzce
  {
    try
    {
      int i = paramzzfd.zzi();
      if (i == 1) {
        return true;
      }
      if (i == 65534)
      {
        paramzzfd.zzF(24);
        if (paramzzfd.zzr() == zzafn.zzf().getMostSignificantBits())
        {
          long l1 = paramzzfd.zzr();
          long l2 = zzafn.zzf().getLeastSignificantBits();
          if (l1 == l2) {
            return true;
          }
        }
      }
      return false;
    }
    catch (ArrayIndexOutOfBoundsException paramzzfd)
    {
      throw zzce.zza("Error parsing MS/ACM codec private", null);
    }
  }
  
  @EnsuresNonNull({"codecPrivate"})
  private final byte[] zzi(String paramString)
    throws zzce
  {
    byte[] arrayOfByte = this.zzj;
    if (arrayOfByte != null) {
      return arrayOfByte;
    }
    throw zzce.zza("Missing CodecPrivate for codec ".concat(String.valueOf(paramString)), null);
  }
  
  @EnsuresNonNull({"this.output"})
  @RequiresNonNull({"codecId"})
  public final void zze(zzaar paramzzaar, int paramInt)
    throws zzce
  {
    Object localObject1 = this.zzb;
    int i = ((String)localObject1).hashCode();
    int i1 = 1;
    int j = 4;
    int n = 0;
    switch (i)
    {
    default: 
      break;
    case 1951062397: 
      if (((String)localObject1).equals("A_OPUS")) {
        i = 12;
      }
      break;
    case 1950789798: 
      if (((String)localObject1).equals("A_FLAC")) {
        i = 22;
      }
      break;
    case 1950749482: 
      if (((String)localObject1).equals("A_EAC3")) {
        i = 17;
      }
      break;
    case 1809237540: 
      if (((String)localObject1).equals("V_MPEG2")) {
        i = 3;
      }
      break;
    case 1422270023: 
      if (((String)localObject1).equals("S_TEXT/UTF8")) {
        i = 27;
      }
      break;
    case 1045209816: 
      if (((String)localObject1).equals("S_TEXT/WEBVTT")) {
        i = 29;
      }
      break;
    case 855502857: 
      if (((String)localObject1).equals("V_MPEGH/ISO/HEVC")) {
        i = 8;
      }
      break;
    case 738597099: 
      if (((String)localObject1).equals("S_TEXT/ASS")) {
        i = 28;
      }
      break;
    case 725957860: 
      if (((String)localObject1).equals("A_PCM/INT/LIT")) {
        i = 24;
      }
      break;
    case 725948237: 
      if (((String)localObject1).equals("A_PCM/INT/BIG")) {
        i = 25;
      }
      break;
    case 635596514: 
      if (((String)localObject1).equals("A_PCM/FLOAT/IEEE")) {
        i = 26;
      }
      break;
    case 542569478: 
      if (((String)localObject1).equals("A_DTS/EXPRESS")) {
        i = 20;
      }
      break;
    case 444813526: 
      if (((String)localObject1).equals("V_THEORA")) {
        i = 10;
      }
      break;
    case 99146302: 
      if (((String)localObject1).equals("S_HDMV/PGS")) {
        i = 31;
      }
      break;
    case 82338134: 
      if (((String)localObject1).equals("V_VP9")) {
        i = 1;
      }
      break;
    case 82338133: 
      if (((String)localObject1).equals("V_VP8")) {
        i = 0;
      }
      break;
    case 82318131: 
      if (((String)localObject1).equals("V_AV1")) {
        i = 2;
      }
      break;
    case 62927045: 
      if (((String)localObject1).equals("A_DTS")) {
        i = 19;
      }
      break;
    case 62923603: 
      if (((String)localObject1).equals("A_AC3")) {
        i = 16;
      }
      break;
    case 62923557: 
      if (((String)localObject1).equals("A_AAC")) {
        i = 13;
      }
      break;
    case -356037306: 
      if (((String)localObject1).equals("A_DTS/LOSSLESS")) {
        i = 21;
      }
      break;
    case -425012669: 
      if (((String)localObject1).equals("S_VOBSUB")) {
        i = 30;
      }
      break;
    case -538363109: 
      if (((String)localObject1).equals("V_MPEG4/ISO/AVC")) {
        i = 7;
      }
      break;
    case -538363189: 
      if (((String)localObject1).equals("V_MPEG4/ISO/ASP")) {
        i = 5;
      }
      break;
    case -933872740: 
      if (((String)localObject1).equals("S_DVBSUB")) {
        i = 32;
      }
      break;
    case -1373388978: 
      if (((String)localObject1).equals("V_MS/VFW/FOURCC")) {
        i = 9;
      }
      break;
    case -1482641357: 
      if (((String)localObject1).equals("A_MPEG/L3")) {
        i = 15;
      }
      break;
    case -1482641358: 
      if (((String)localObject1).equals("A_MPEG/L2")) {
        i = 14;
      }
      break;
    case -1730367663: 
      if (((String)localObject1).equals("A_VORBIS")) {
        i = 11;
      }
      break;
    case -1784763192: 
      if (((String)localObject1).equals("A_TRUEHD")) {
        i = 18;
      }
      break;
    case -1985379776: 
      if (((String)localObject1).equals("A_MS/ACM")) {
        i = 23;
      }
      break;
    case -2095575984: 
      if (((String)localObject1).equals("V_MPEG4/ISO/SP")) {
        i = 4;
      }
      break;
    case -2095576542: 
      if (((String)localObject1).equals("V_MPEG4/ISO/AP")) {
        i = 6;
      }
      break;
    }
    i = -1;
    Object localObject3 = "audio/raw";
    Object localObject6 = null;
    ByteBuffer localByteBuffer = null;
    switch (i)
    {
    default: 
      throw zzce.zza("Unrecognized codec identifier.", null);
    case 32: 
      localObject2 = new byte[4];
      System.arraycopy(zzi((String)localObject1), 0, localObject2, 0, 4);
      localObject1 = zzfrr.zzm(localObject2);
      localObject3 = "application/dvbsubs";
      break;
    case 31: 
      localObject1 = "application/pgs";
      break;
    case 30: 
      localObject1 = zzfrr.zzm(zzi((String)localObject1));
      localObject3 = "application/vobsub";
      break;
    case 29: 
      localObject1 = null;
      localObject2 = null;
      localObject3 = "text/vtt";
      break;
    case 28: 
      localObject1 = zzfrr.zzn(zzafn.zzm(), zzi(this.zzb));
      localObject2 = null;
      localObject3 = "text/x-ssa";
      break;
    case 27: 
      localObject1 = "application/x-subrip";
      break;
    case 26: 
      i = this.zzO;
      if (i == 32)
      {
        i = j;
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unsupported floating point PCM bit depth: ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append(". Setting mimeType to audio/x-unknown");
        zzer.zze("MatroskaExtractor", ((StringBuilder)localObject1).toString());
      }
      break;
    case 25: 
      i = this.zzO;
      if (i == 8)
      {
        localObject1 = null;
        localObject2 = null;
        j = -1;
        k = 3;
        break label2055;
      }
      if (i == 16)
      {
        i = 268435456;
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unsupported big endian PCM bit depth: ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append(". Setting mimeType to audio/x-unknown");
        zzer.zze("MatroskaExtractor", ((StringBuilder)localObject1).toString());
      }
      break;
    case 24: 
      j = zzfn.zzj(this.zzO);
      i = j;
      if (j == 0)
      {
        i = this.zzO;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unsupported little endian PCM bit depth: ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append(". Setting mimeType to audio/x-unknown");
        zzer.zze("MatroskaExtractor", ((StringBuilder)localObject1).toString());
      }
      break;
    case 23: 
      do
      {
        localObject1 = null;
        localObject2 = null;
        j = -1;
        k = i;
        break label2055;
        if (!zzh(new zzfd(zzi(this.zzb)))) {
          break;
        }
        j = zzfn.zzj(this.zzO);
        i = j;
      } while (j != 0);
      i = this.zzO;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Unsupported PCM bit depth: ");
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append(". Setting mimeType to audio/x-unknown");
      zzer.zze("MatroskaExtractor", ((StringBuilder)localObject1).toString());
      break label1518;
      zzer.zze("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
      localObject1 = null;
      localObject2 = null;
      localObject3 = "audio/x-unknown";
      break;
    case 22: 
      localObject1 = Collections.singletonList(zzi((String)localObject1));
      localObject3 = "audio/flac";
      break;
    case 21: 
      localObject1 = "audio/vnd.dts.hd";
      break;
    case 19: 
    case 20: 
      localObject1 = "audio/vnd.dts";
      break;
    case 18: 
      this.zzS = new zzabs();
      localObject1 = "audio/true-hd";
      break;
    case 17: 
      localObject1 = "audio/eac3";
      break;
    case 16: 
      localObject1 = "audio/ac3";
      break;
    case 15: 
      localObject3 = "audio/mpeg";
      break;
    case 14: 
      localObject3 = "audio/mpeg-L2";
      localObject1 = null;
      localObject2 = null;
      i = 4096;
      break;
    case 13: 
      localObject1 = Collections.singletonList(zzi((String)localObject1));
      localObject2 = zzzm.zza(this.zzj);
      this.zzP = ((zzzl)localObject2).zza;
      this.zzN = ((zzzl)localObject2).zzb;
      localObject2 = ((zzzl)localObject2).zzc;
      localObject3 = "audio/mp4a-latm";
      break;
    case 12: 
      localObject1 = new ArrayList(3);
      ((List)localObject1).add(zzi(this.zzb));
      ((List)localObject1).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
      ((List)localObject1).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
      localObject3 = "audio/opus";
      localObject2 = null;
      i = 5760;
      break;
    case 11: 
      localObject1 = zzg(zzi((String)localObject1));
      localObject3 = "audio/vorbis";
      localObject2 = null;
      i = 8192;
      break;
    case 10: 
      localObject1 = "video/x-unknown";
      break;
    case 9: 
      localObject1 = zzf(new zzfd(zzi(this.zzb)));
      localObject3 = (String)((Pair)localObject1).first;
      localObject1 = (List)((Pair)localObject1).second;
    case 8: 
    case 7: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        localObject2 = null;
        break;
        localObject2 = zzabe.zza(new zzfd(zzi(this.zzb)));
        localObject1 = ((zzabe)localObject2).zza;
        this.zzW = ((zzabe)localObject2).zzb;
        localObject2 = ((zzabe)localObject2).zzg;
        localObject3 = "video/hevc";
        break label1961;
        localObject2 = zzzt.zza(new zzfd(zzi(this.zzb)));
        localObject1 = ((zzzt)localObject2).zza;
        this.zzW = ((zzzt)localObject2).zzb;
        localObject2 = ((zzzt)localObject2).zzi;
        localObject3 = "video/avc";
        j = -1;
        k = -1;
        break label2055;
        localObject1 = this.zzj;
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = Collections.singletonList(localObject1);
        }
        localObject3 = "video/mp4v-es";
      }
    case 3: 
      localObject1 = "video/mpeg2";
      break;
    case 2: 
      localObject1 = "video/av01";
      break;
    case 1: 
      label1518:
      label1961:
      localObject1 = "video/x-vnd.on2.vp9";
      break;
    }
    localObject1 = "video/x-vnd.on2.vp8";
    Object localObject4 = null;
    Object localObject2 = null;
    localObject3 = localObject1;
    localObject1 = localObject4;
    i = -1;
    int k = -1;
    j = i;
    label2055:
    Object localObject5 = localObject2;
    localObject4 = localObject3;
    if (this.zzM != null)
    {
      zzaak localzzaak = zzaak.zza(new zzfd(this.zzM));
      localObject5 = localObject2;
      localObject4 = localObject3;
      if (localzzaak != null)
      {
        localObject5 = localzzaak.zza;
        localObject4 = "video/dolby-vision";
      }
    }
    int i4 = this.zzU;
    int m;
    if (true != this.zzT) {
      m = 0;
    } else {
      m = 2;
    }
    localObject3 = new zzak();
    if (zzcd.zzf((String)localObject4))
    {
      ((zzak)localObject3).zzw(this.zzN);
      ((zzak)localObject3).zzT(this.zzP);
      ((zzak)localObject3).zzN(k);
      i = i1;
    }
    else if (zzcd.zzg((String)localObject4))
    {
      if (this.zzp == 0)
      {
        k = this.zzn;
        i = k;
        if (k == -1) {
          i = this.zzl;
        }
        this.zzn = i;
        k = this.zzo;
        i = k;
        if (k == -1) {
          i = this.zzm;
        }
        this.zzo = i;
      }
      k = -1;
      i = this.zzn;
      if (i != -1)
      {
        int i3 = this.zzo;
        if (i3 != -1)
        {
          i1 = this.zzm;
          int i2 = this.zzl;
          f = i1 * i / (i2 * i3);
          break label2319;
        }
      }
      float f = -1.0F;
      label2319:
      localObject2 = localObject6;
      if (this.zzw)
      {
        localObject2 = localByteBuffer;
        if (this.zzC != -1.0F)
        {
          localObject2 = localByteBuffer;
          if (this.zzD != -1.0F)
          {
            localObject2 = localByteBuffer;
            if (this.zzE != -1.0F)
            {
              localObject2 = localByteBuffer;
              if (this.zzF != -1.0F)
              {
                localObject2 = localByteBuffer;
                if (this.zzG != -1.0F)
                {
                  localObject2 = localByteBuffer;
                  if (this.zzH != -1.0F)
                  {
                    localObject2 = localByteBuffer;
                    if (this.zzI != -1.0F)
                    {
                      localObject2 = localByteBuffer;
                      if (this.zzJ != -1.0F)
                      {
                        localObject2 = localByteBuffer;
                        if (this.zzK != -1.0F) {
                          if (this.zzL == -1.0F)
                          {
                            localObject2 = localByteBuffer;
                          }
                          else
                          {
                            localObject2 = new byte[25];
                            localByteBuffer = ByteBuffer.wrap((byte[])localObject2).order(ByteOrder.LITTLE_ENDIAN);
                            localByteBuffer.put((byte)0);
                            localByteBuffer.putShort((short)(int)(this.zzC * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzD * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzE * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzF * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzG * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzH * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzI * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzJ * 50000.0F + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzK + 0.5F));
                            localByteBuffer.putShort((short)(int)(this.zzL + 0.5F));
                            localByteBuffer.putShort((short)this.zzA);
                            localByteBuffer.putShort((short)this.zzB);
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
        localObject2 = new zzs(this.zzx, this.zzz, this.zzy, (byte[])localObject2);
      }
      i = k;
      if (this.zza != null)
      {
        i = k;
        if (zzafn.zze().containsKey(this.zza)) {
          i = ((Integer)zzafn.zze().get(this.zza)).intValue();
        }
      }
      if ((this.zzq == 0) && (Float.compare(this.zzr, 0.0F) == 0) && (Float.compare(this.zzs, 0.0F) == 0)) {
        if (Float.compare(this.zzt, 0.0F) == 0) {
          i = n;
        } else if (Float.compare(this.zzs, 90.0F) == 0) {
          i = 90;
        } else if ((Float.compare(this.zzs, -180.0F) != 0) && (Float.compare(this.zzs, 180.0F) != 0))
        {
          if (Float.compare(this.zzs, -90.0F) == 0) {
            i = 270;
          }
        }
        else {
          i = 180;
        }
      }
      ((zzak)localObject3).zzX(this.zzl);
      ((zzak)localObject3).zzF(this.zzm);
      ((zzak)localObject3).zzP(f);
      ((zzak)localObject3).zzR(i);
      ((zzak)localObject3).zzQ(this.zzu);
      ((zzak)localObject3).zzV(this.zzv);
      ((zzak)localObject3).zzy((zzs)localObject2);
      i = 2;
    }
    else
    {
      if ((!"application/x-subrip".equals(localObject4)) && (!"text/x-ssa".equals(localObject4)) && (!"text/vtt".equals(localObject4)) && (!"application/vobsub".equals(localObject4)) && (!"application/pgs".equals(localObject4)) && (!"application/dvbsubs".equals(localObject4))) {
        throw zzce.zza("Unexpected MIME type.", null);
      }
      i = 3;
    }
    if ((this.zza != null) && (!zzafn.zze().containsKey(this.zza))) {
      ((zzak)localObject3).zzJ(this.zza);
    }
    ((zzak)localObject3).zzG(paramInt);
    ((zzak)localObject3).zzS((String)localObject4);
    ((zzak)localObject3).zzL(j);
    ((zzak)localObject3).zzK(this.zzY);
    ((zzak)localObject3).zzU(i4 | m);
    ((zzak)localObject3).zzI((List)localObject1);
    ((zzak)localObject3).zzx((String)localObject5);
    ((zzak)localObject3).zzB(this.zzk);
    localObject1 = ((zzak)localObject3).zzY();
    paramzzaar = paramzzaar.zzv(this.zzc, i);
    this.zzV = paramzzaar;
    paramzzaar.zzk((zzam)localObject1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */