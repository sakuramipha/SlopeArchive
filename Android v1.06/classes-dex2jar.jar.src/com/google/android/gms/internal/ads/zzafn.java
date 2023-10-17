package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzafn
  implements zzaao
{
  public static final zzaav zza = zzafj.zza;
  private static final byte[] zzb = { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
  private static final byte[] zzc;
  private static final byte[] zzd;
  private static final byte[] zze;
  private static final UUID zzf;
  private static final Map zzg;
  private long zzA = -9223372036854775807L;
  private zzafm zzB;
  private boolean zzC;
  private int zzD;
  private long zzE;
  private boolean zzF;
  private long zzG = -1L;
  private long zzH = -1L;
  private long zzI = -9223372036854775807L;
  private zzes zzJ;
  private zzes zzK;
  private boolean zzL;
  private boolean zzM;
  private int zzN;
  private long zzO;
  private long zzP;
  private int zzQ;
  private int zzR;
  private int[] zzS;
  private int zzT;
  private int zzU;
  private int zzV;
  private int zzW;
  private boolean zzX;
  private long zzY;
  private int zzZ;
  private int zzaa;
  private int zzab;
  private boolean zzac;
  private boolean zzad;
  private boolean zzae;
  private int zzaf;
  private byte zzag;
  private boolean zzah;
  private zzaar zzai;
  private final zzafi zzh;
  private final zzafp zzi;
  private final SparseArray zzj;
  private final boolean zzk;
  private final zzfd zzl;
  private final zzfd zzm;
  private final zzfd zzn;
  private final zzfd zzo;
  private final zzfd zzp;
  private final zzfd zzq;
  private final zzfd zzr;
  private final zzfd zzs;
  private final zzfd zzt;
  private final zzfd zzu;
  private ByteBuffer zzv;
  private long zzw;
  private long zzx = -1L;
  private long zzy = -9223372036854775807L;
  private long zzz = -9223372036854775807L;
  
  static
  {
    int i = zzfn.zza;
    zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfol.zzc);
    zzd = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
    zze = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
    zzf = new UUID(72057594037932032L, -9223371306706625679L);
    HashMap localHashMap = new HashMap();
    localHashMap.put("htc_video_rotA-000", Integer.valueOf(0));
    localHashMap.put("htc_video_rotA-090", Integer.valueOf(90));
    localHashMap.put("htc_video_rotA-180", Integer.valueOf(180));
    localHashMap.put("htc_video_rotA-270", Integer.valueOf(270));
    zzg = Collections.unmodifiableMap(localHashMap);
  }
  
  public zzafn()
  {
    this(0);
  }
  
  public zzafn(int paramInt)
  {
    this.zzh = localzzafg;
    localzzafg.zza(new zzafl(this, null));
    this.zzk = true;
    this.zzi = new zzafp();
    this.zzj = new SparseArray();
    this.zzn = new zzfd(4);
    this.zzo = new zzfd(ByteBuffer.allocate(4).putInt(-1).array());
    this.zzp = new zzfd(4);
    this.zzl = new zzfd(zzew.zza);
    this.zzm = new zzfd(4);
    this.zzq = new zzfd();
    this.zzr = new zzfd();
    this.zzs = new zzfd(8);
    this.zzt = new zzfd();
    this.zzu = new zzfd();
    this.zzS = new int[1];
  }
  
  @RequiresNonNull({"#2.output"})
  private final int zzn(zzaap paramzzaap, zzafm paramzzafm, int paramInt, boolean paramBoolean)
    throws IOException
  {
    if ("S_TEXT/UTF8".equals(paramzzafm.zzb))
    {
      zzv(paramzzaap, zzb, paramInt);
      paramInt = this.zzaa;
      zzu();
      return paramInt;
    }
    if ("S_TEXT/ASS".equals(paramzzafm.zzb))
    {
      zzv(paramzzaap, zzd, paramInt);
      paramInt = this.zzaa;
      zzu();
      return paramInt;
    }
    if ("S_TEXT/WEBVTT".equals(paramzzafm.zzb))
    {
      zzv(paramzzaap, zze, paramInt);
      paramInt = this.zzaa;
      zzu();
      return paramInt;
    }
    zzabr localzzabr = paramzzafm.zzV;
    boolean bool2 = this.zzac;
    boolean bool1 = true;
    int k;
    if (!bool2)
    {
      if (paramzzafm.zzg)
      {
        this.zzV &= 0xBFFFFFFF;
        bool2 = this.zzad;
        i = 128;
        if (!bool2)
        {
          localObject = this.zzn.zzH();
          ((zzaae)paramzzaap).zzn((byte[])localObject, 0, 1, false);
          this.zzZ += 1;
          if ((this.zzn.zzH()[0] & 0x80) != 128)
          {
            this.zzag = this.zzn.zzH()[0];
            this.zzad = true;
          }
          else
          {
            throw zzce.zza("Extension bit is set in signal byte", null);
          }
        }
        j = this.zzag;
        if ((j & 0x1) == 1)
        {
          j &= 0x2;
          this.zzV |= 0x40000000;
          if (!this.zzah)
          {
            localObject = this.zzs.zzH();
            ((zzaae)paramzzaap).zzn((byte[])localObject, 0, 8, false);
            this.zzZ += 8;
            this.zzah = true;
            localObject = this.zzn.zzH();
            if (j != 2) {
              i = 0;
            }
            localObject[0] = ((byte)(i | 0x8));
            this.zzn.zzF(0);
            localzzabr.zzr(this.zzn, 1, 1);
            this.zzaa += 1;
            this.zzs.zzF(0);
            localzzabr.zzr(this.zzs, 8, 1);
            this.zzaa += 8;
          }
          if (j == 2)
          {
            if (!this.zzae)
            {
              localObject = this.zzn.zzH();
              ((zzaae)paramzzaap).zzn((byte[])localObject, 0, 1, false);
              this.zzZ += 1;
              this.zzn.zzF(0);
              this.zzaf = this.zzn.zzk();
              this.zzae = true;
            }
            i = this.zzaf * 4;
            this.zzn.zzC(i);
            localObject = this.zzn.zzH();
            ((zzaae)paramzzaap).zzn((byte[])localObject, 0, i, false);
            this.zzZ += i;
            i = (this.zzaf >> 1) + 1;
            int m = i * 6 + 2;
            localObject = this.zzv;
            if ((localObject == null) || (((ByteBuffer)localObject).capacity() < m)) {
              this.zzv = ByteBuffer.allocate(m);
            }
            short s = (short)i;
            this.zzv.position(0);
            this.zzv.putShort(s);
            j = 0;
            for (i = 0;; i = k)
            {
              k = this.zzaf;
              if (j >= k) {
                break;
              }
              k = this.zzn.zzn();
              if (j % 2 == 0) {
                this.zzv.putShort((short)(k - i));
              } else {
                this.zzv.putInt(k - i);
              }
              j++;
            }
            i = paramInt - this.zzZ - i;
            if ((k & 0x1) == 1)
            {
              this.zzv.putInt(i);
            }
            else
            {
              this.zzv.putShort((short)i);
              this.zzv.putInt(0);
            }
            this.zzt.zzD(this.zzv.array(), m);
            localzzabr.zzr(this.zzt, m, 1);
            this.zzaa += m;
          }
        }
      }
      else
      {
        localObject = paramzzafm.zzh;
        if (localObject != null) {
          this.zzq.zzD((byte[])localObject, localObject.length);
        }
      }
      if ("A_OPUS".equals(paramzzafm.zzb) ? paramBoolean : paramzzafm.zzf > 0)
      {
        this.zzV |= 0x10000000;
        this.zzu.zzC(0);
        i = this.zzq.zzd() + paramInt - this.zzZ;
        this.zzn.zzC(4);
        this.zzn.zzH()[0] = ((byte)(i >> 24 & 0xFF));
        this.zzn.zzH()[1] = ((byte)(i >> 16 & 0xFF));
        this.zzn.zzH()[2] = ((byte)(i >> 8 & 0xFF));
        this.zzn.zzH()[3] = ((byte)(i & 0xFF));
        localzzabr.zzr(this.zzn, 4, 2);
        this.zzaa += 4;
      }
      this.zzac = true;
    }
    paramInt += this.zzq.zzd();
    if ((!"V_MPEG4/ISO/AVC".equals(paramzzafm.zzb)) && (!"V_MPEGH/ISO/HEVC".equals(paramzzafm.zzb)))
    {
      if (paramzzafm.zzS != null)
      {
        if (this.zzq.zzd() == 0) {
          paramBoolean = bool1;
        } else {
          paramBoolean = false;
        }
        zzdy.zzf(paramBoolean);
        paramzzafm.zzS.zzd(paramzzaap);
      }
      for (;;)
      {
        i = this.zzZ;
        if (i >= paramInt) {
          break;
        }
        i = zzo(paramzzaap, localzzabr, paramInt - i);
        this.zzZ += i;
        this.zzaa += i;
      }
    }
    Object localObject = this.zzm.zzH();
    localObject[0] = 0;
    localObject[1] = 0;
    localObject[2] = 0;
    int i = paramzzafm.zzW;
    int j = 4 - i;
    while (this.zzZ < paramInt)
    {
      k = this.zzab;
      if (k == 0)
      {
        k = Math.min(i, this.zzq.zza());
        ((zzaae)paramzzaap).zzn((byte[])localObject, j + k, i - k, false);
        if (k > 0) {
          this.zzq.zzB((byte[])localObject, j, k);
        }
        this.zzZ += i;
        this.zzm.zzF(0);
        this.zzab = this.zzm.zzn();
        this.zzl.zzF(0);
        zzabp.zzb(localzzabr, this.zzl, 4);
        this.zzaa += 4;
      }
      else
      {
        k = zzo(paramzzaap, localzzabr, k);
        this.zzZ += k;
        this.zzaa += k;
        this.zzab -= k;
      }
    }
    if ("A_VORBIS".equals(paramzzafm.zzb))
    {
      this.zzo.zzF(0);
      zzabp.zzb(localzzabr, this.zzo, 4);
      this.zzaa += 4;
    }
    paramInt = this.zzaa;
    zzu();
    return paramInt;
  }
  
  private final int zzo(zzaap paramzzaap, zzabr paramzzabr, int paramInt)
    throws IOException
  {
    int i = this.zzq.zza();
    if (i > 0)
    {
      paramInt = Math.min(paramInt, i);
      zzabp.zzb(paramzzabr, this.zzq, paramInt);
    }
    else
    {
      paramInt = zzabp.zza(paramzzabr, paramzzaap, paramInt, false);
    }
    return paramInt;
  }
  
  private final long zzp(long paramLong)
    throws zzce
  {
    long l = this.zzy;
    if (l != -9223372036854775807L) {
      return zzfn.zzp(paramLong, l, 1000L);
    }
    throw zzce.zza("Can't scale timecode prior to timecodeScale being set.", null);
  }
  
  @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
  private final void zzq(int paramInt)
    throws zzce
  {
    if ((this.zzJ != null) && (this.zzK != null)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a Cues");
    throw zzce.zza(localStringBuilder.toString(), null);
  }
  
  @EnsuresNonNull({"currentTrack"})
  private final void zzr(int paramInt)
    throws zzce
  {
    if (this.zzB != null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Element ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" must be in a TrackEntry");
    throw zzce.zza(localStringBuilder.toString(), null);
  }
  
  @RequiresNonNull({"#1.output"})
  private final void zzs(zzafm paramzzafm, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = paramzzafm.zzS;
    if (localObject1 != null)
    {
      ((zzabs)localObject1).zzc(paramzzafm.zzV, paramLong, paramInt1, paramInt2, paramInt3, paramzzafm.zzi);
    }
    else
    {
      long l;
      if (("S_TEXT/UTF8".equals(paramzzafm.zzb)) || ("S_TEXT/ASS".equals(paramzzafm.zzb)) || ("S_TEXT/WEBVTT".equals(paramzzafm.zzb))) {
        if (this.zzR > 1)
        {
          zzer.zze("MatroskaExtractor", "Skipping subtitle sample in laced block.");
        }
        else
        {
          l = this.zzP;
          if (l != -9223372036854775807L) {
            break label120;
          }
          zzer.zze("MatroskaExtractor", "Skipping subtitle sample with no duration.");
        }
      }
      break label406;
      label120:
      localObject1 = paramzzafm.zzb;
      Object localObject2 = this.zzr.zzH();
      int i = ((String)localObject1).hashCode();
      if (i != 738597099)
      {
        if (i != 1045209816)
        {
          if ((i == 1422270023) && (((String)localObject1).equals("S_TEXT/UTF8")))
          {
            i = 0;
            break label223;
          }
        }
        else if (((String)localObject1).equals("S_TEXT/WEBVTT"))
        {
          i = 2;
          break label223;
        }
      }
      else if (((String)localObject1).equals("S_TEXT/ASS"))
      {
        i = 1;
        break label223;
      }
      i = -1;
      label223:
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            i = 25;
            localObject1 = zzw(l, "%02d:%02d:%02d.%03d", 1000L);
          }
          else
          {
            throw new IllegalArgumentException();
          }
        }
        else
        {
          i = 21;
          localObject1 = zzw(l, "%01d:%02d:%02d:%02d", 10000L);
        }
      }
      else
      {
        i = 19;
        localObject1 = zzw(l, "%02d:%02d:%02d,%03d", 1000L);
      }
      System.arraycopy(localObject1, 0, localObject2, i, localObject1.length);
      for (i = this.zzr.zzc(); i < this.zzr.zzd(); i++) {
        if (this.zzr.zzH()[i] == 0)
        {
          this.zzr.zzE(i);
          break;
        }
      }
      localObject2 = paramzzafm.zzV;
      localObject1 = this.zzr;
      zzabp.zzb((zzabr)localObject2, (zzfd)localObject1, ((zzfd)localObject1).zzd());
      paramInt2 += this.zzr.zzd();
      label406:
      i = paramInt2;
      if ((paramInt1 & 0x10000000) != 0) {
        if (this.zzR > 1)
        {
          this.zzu.zzC(0);
          i = paramInt2;
        }
        else
        {
          i = this.zzu.zzd();
          paramzzafm.zzV.zzr(this.zzu, i, 2);
          i = paramInt2 + i;
        }
      }
      paramzzafm.zzV.zzs(paramLong, paramInt1, i, paramInt3, paramzzafm.zzi);
    }
    this.zzM = true;
  }
  
  private final void zzt(zzaap paramzzaap, int paramInt)
    throws IOException
  {
    if (this.zzn.zzd() >= paramInt) {
      return;
    }
    if (this.zzn.zzb() < paramInt)
    {
      localObject = this.zzn;
      i = ((zzfd)localObject).zzb();
      ((zzfd)localObject).zzz(Math.max(i + i, paramInt));
    }
    Object localObject = this.zzn.zzH();
    int j = this.zzn.zzd();
    int i = this.zzn.zzd();
    ((zzaae)paramzzaap).zzn((byte[])localObject, j, paramInt - i, false);
    this.zzn.zzE(paramInt);
  }
  
  private final void zzu()
  {
    this.zzZ = 0;
    this.zzaa = 0;
    this.zzab = 0;
    this.zzac = false;
    this.zzad = false;
    this.zzae = false;
    this.zzaf = 0;
    this.zzag = 0;
    this.zzah = false;
    this.zzq.zzC(0);
  }
  
  private final void zzv(zzaap paramzzaap, byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    int i = paramArrayOfByte.length;
    int j = i + paramInt;
    if (this.zzr.zzb() < j)
    {
      zzfd localzzfd = this.zzr;
      paramArrayOfByte = Arrays.copyOf(paramArrayOfByte, j + paramInt);
      localzzfd.zzD(paramArrayOfByte, paramArrayOfByte.length);
    }
    else
    {
      System.arraycopy(paramArrayOfByte, 0, this.zzr.zzH(), 0, i);
    }
    paramArrayOfByte = this.zzr.zzH();
    ((zzaae)paramzzaap).zzn(paramArrayOfByte, i, paramInt, false);
    this.zzr.zzF(0);
    this.zzr.zzE(j);
  }
  
  private static byte[] zzw(long paramLong1, String paramString, long paramLong2)
  {
    boolean bool;
    if (paramLong1 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    long l = paramLong1 / 3600000000L;
    Locale localLocale = Locale.US;
    int j = (int)l;
    paramLong1 -= j * 3600000000L;
    int k = (int)(paramLong1 / 60000000L);
    paramLong1 -= k * 60000000L;
    int i = (int)(paramLong1 / 1000000L);
    paramString = String.format(localLocale, paramString, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf((int)((paramLong1 - i * 1000000L) / paramLong2)) });
    i = zzfn.zza;
    return paramString.getBytes(zzfol.zzc);
  }
  
  private static int[] zzx(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return new int[paramInt];
    }
    int i = paramArrayOfInt.length;
    if (i >= paramInt) {
      return paramArrayOfInt;
    }
    return new int[Math.max(i + i, paramInt)];
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    int j = 0;
    this.zzM = false;
    while (!this.zzM)
    {
      int i = j;
      if (this.zzh.zzc(paramzzaap))
      {
        long l = paramzzaap.zzf();
        if (this.zzF)
        {
          this.zzH = l;
          paramzzabk.zza = this.zzG;
          this.zzF = false;
        }
        else
        {
          if (!this.zzC) {
            continue;
          }
          l = this.zzH;
          if (l == -1L) {
            continue;
          }
          paramzzabk.zza = l;
          this.zzH = -1L;
        }
        return 1;
      }
      else
      {
        while (i < this.zzj.size())
        {
          paramzzaap = (zzafm)this.zzj.valueAt(i);
          zzafm.zzd(paramzzaap);
          paramzzabk = paramzzaap.zzS;
          if (paramzzabk != null) {
            paramzzabk.zza(paramzzaap.zzV, paramzzaap.zzi);
          }
          i++;
        }
        return -1;
      }
    }
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzai = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzI = -9223372036854775807L;
    int i = 0;
    this.zzN = 0;
    this.zzh.zzb();
    this.zzi.zze();
    zzu();
    while (i < this.zzj.size())
    {
      zzabs localzzabs = ((zzafm)this.zzj.valueAt(i)).zzS;
      if (localzzabs != null) {
        localzzabs.zzb();
      }
      i++;
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return new zzafo().zza(paramzzaap);
  }
  
  protected final void zzg(int paramInt1, int paramInt2, zzaap paramzzaap)
    throws IOException
  {
    int i = paramInt1;
    if ((i != 161) && (i != 163))
    {
      if (i != 165)
      {
        if (i != 16877)
        {
          if (i != 16981)
          {
            if (i != 18402)
            {
              if (i != 21419)
              {
                if (i != 25506)
                {
                  if (i == 30322)
                  {
                    zzr(paramInt1);
                    localObject1 = this.zzB;
                    ((zzafm)localObject1).zzu = new byte[paramInt2];
                    localObject1 = ((zzafm)localObject1).zzu;
                    ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
                    return;
                  }
                  paramzzaap = new StringBuilder();
                  paramzzaap.append("Unexpected id: ");
                  paramzzaap.append(i);
                  throw zzce.zza(paramzzaap.toString(), null);
                }
                zzr(paramInt1);
                localObject1 = this.zzB;
                ((zzafm)localObject1).zzj = new byte[paramInt2];
                localObject1 = ((zzafm)localObject1).zzj;
                ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
                return;
              }
              Arrays.fill(this.zzp.zzH(), (byte)0);
              localObject1 = this.zzp.zzH();
              ((zzaae)paramzzaap).zzn((byte[])localObject1, 4 - paramInt2, paramInt2, false);
              this.zzp.zzF(0);
              this.zzD = ((int)this.zzp.zzs());
              return;
            }
            localObject1 = new byte[paramInt2];
            ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
            zzr(paramInt1);
            this.zzB.zzi = new zzabq(1, (byte[])localObject1, 0, 0);
            return;
          }
          zzr(paramInt1);
          localObject1 = this.zzB;
          ((zzafm)localObject1).zzh = new byte[paramInt2];
          localObject1 = ((zzafm)localObject1).zzh;
          ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
          return;
        }
        zzr(paramInt1);
        localObject1 = this.zzB;
        if ((zzafm.zza((zzafm)localObject1) != 1685485123) && (zzafm.zza((zzafm)localObject1) != 1685480259))
        {
          ((zzaae)paramzzaap).zzo(paramInt2, false);
          return;
        }
        ((zzafm)localObject1).zzM = new byte[paramInt2];
        localObject1 = ((zzafm)localObject1).zzM;
        ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
        return;
      }
      if (this.zzN != 2) {
        return;
      }
      localObject1 = (zzafm)this.zzj.get(this.zzT);
      if ((this.zzW == 4) && ("V_VP9".equals(((zzafm)localObject1).zzb)))
      {
        this.zzu.zzC(paramInt2);
        localObject1 = this.zzu.zzH();
        ((zzaae)paramzzaap).zzn((byte[])localObject1, 0, paramInt2, false);
        return;
      }
      ((zzaae)paramzzaap).zzo(paramInt2, false);
      return;
    }
    if (this.zzN == 0)
    {
      this.zzT = ((int)this.zzi.zzd(paramzzaap, false, true, 8));
      this.zzU = this.zzi.zza();
      this.zzP = -9223372036854775807L;
      this.zzN = 1;
      this.zzn.zzC(0);
    }
    Object localObject1 = (zzafm)this.zzj.get(this.zzT);
    if (localObject1 == null)
    {
      paramInt1 = this.zzU;
      ((zzaae)paramzzaap).zzo(paramInt2 - paramInt1, false);
      this.zzN = 0;
      return;
    }
    zzafm.zzd((zzafm)localObject1);
    paramInt1 = i;
    Object localObject2;
    long l1;
    if (this.zzN == 1)
    {
      zzt(paramzzaap, 3);
      int j = (this.zzn.zzH()[2] & 0x6) >> 1;
      if (j == 0)
      {
        this.zzR = 1;
        localObject2 = zzx(this.zzS, 1);
        this.zzS = ((int[])localObject2);
        localObject2[0] = (paramInt2 - this.zzU - 3);
      }
      else
      {
        zzt(paramzzaap, 4);
        paramInt1 = (this.zzn.zzH()[3] & 0xFF) + 1;
        this.zzR = paramInt1;
        localObject2 = zzx(this.zzS, paramInt1);
        this.zzS = ((int[])localObject2);
        if (j == 2)
        {
          j = this.zzU;
          paramInt1 = this.zzR;
          Arrays.fill((int[])localObject2, 0, paramInt1, (paramInt2 - j - 4) / paramInt1);
        }
        else
        {
          int k;
          int m;
          int i1;
          int n;
          if (j == 1)
          {
            k = 0;
            j = 0;
            paramInt1 = 4;
            for (;;)
            {
              m = this.zzR - 1;
              if (k >= m) {
                break;
              }
              this.zzS[k] = 0;
              m = paramInt1;
              do
              {
                paramInt1 = m + 1;
                zzt(paramzzaap, paramInt1);
                i1 = this.zzn.zzH()[(paramInt1 - 1)] & 0xFF;
                localObject2 = this.zzS;
                n = localObject2[k] + i1;
                localObject2[k] = n;
                m = paramInt1;
              } while (i1 == 255);
              j += n;
              k++;
            }
            this.zzS[m] = (paramInt2 - this.zzU - paramInt1 - j);
          }
          else
          {
            if (j != 3) {
              break label1330;
            }
            k = 0;
            paramInt1 = 4;
            j = 0;
            for (;;)
            {
              m = this.zzR - 1;
              if (k >= m) {
                break label1190;
              }
              this.zzS[k] = 0;
              paramInt1++;
              zzt(paramzzaap, paramInt1);
              localObject2 = this.zzn.zzH();
              i1 = paramInt1 - 1;
              if (localObject2[i1] == 0) {
                break label1182;
              }
              for (m = 0; m < 8; m++)
              {
                int i2 = 1 << 7 - m;
                if ((this.zzn.zzH()[i1] & i2) != 0)
                {
                  n = paramInt1 + m;
                  zzt(paramzzaap, n);
                  long l2 = (i2 ^ 0xFFFFFFFF) & this.zzn.zzH()[i1] & 0xFF;
                  for (paramInt1 = i1 + 1; paramInt1 < n; paramInt1++) {
                    l2 = l2 << 8 | this.zzn.zzH()[paramInt1] & 0xFF;
                  }
                  paramInt1 = n;
                  l1 = l2;
                  if (k <= 0) {
                    break label1104;
                  }
                  l1 = l2 - ((1L << m * 7 + 6) - 1L);
                  paramInt1 = n;
                  break label1104;
                }
              }
              l1 = 0L;
              label1104:
              if ((l1 < -2147483648L) || (l1 > 2147483647L)) {
                break;
              }
              localObject2 = this.zzS;
              n = (int)l1;
              m = n;
              if (k != 0) {
                m = n + localObject2[(k - 1)];
              }
              localObject2[k] = m;
              j += m;
              k++;
            }
            throw zzce.zza("EBML lacing sample size out of range.", null);
            label1182:
            throw zzce.zza("No valid varint length mask found", null);
            label1190:
            this.zzS[m] = (paramInt2 - this.zzU - paramInt1 - j);
          }
        }
      }
      paramInt1 = this.zzn.zzH()[0];
      paramInt2 = this.zzn.zzH()[1];
      this.zzO = (this.zzI + zzp(paramInt1 << 8 | paramInt2 & 0xFF));
      paramInt1 = i;
      if (((zzafm)localObject1).zzd != 2)
      {
        paramInt1 = i;
        if (i == 163)
        {
          if ((this.zzn.zzH()[2] & 0x80) == 128) {
            paramInt1 = 163;
          } else {
            paramInt1 = 163;
          }
        }
        else
        {
          paramInt2 = 0;
          break label1312;
        }
      }
      paramInt2 = 1;
      label1312:
      this.zzV = paramInt2;
      this.zzN = 2;
      this.zzQ = 0;
      break label1338;
      label1330:
      throw zzce.zza("Unexpected lacing value: 2", null);
    }
    label1338:
    if (paramInt1 == 163)
    {
      for (;;)
      {
        paramInt1 = this.zzQ;
        if (paramInt1 >= this.zzR) {
          break;
        }
        paramInt1 = zzn(paramzzaap, (zzafm)localObject1, this.zzS[paramInt1], false);
        l1 = this.zzO;
        zzs((zzafm)localObject1, this.zzQ * ((zzafm)localObject1).zze / 1000 + l1, this.zzV, paramInt1, 0);
        this.zzQ += 1;
      }
      this.zzN = 0;
      return;
    }
    for (;;)
    {
      paramInt1 = this.zzQ;
      if (paramInt1 >= this.zzR) {
        break;
      }
      localObject2 = this.zzS;
      localObject2[paramInt1] = zzn(paramzzaap, (zzafm)localObject1, localObject2[paramInt1], true);
      this.zzQ += 1;
    }
  }
  
  protected final void zzh(int paramInt)
    throws zzce
  {
    zzdy.zzb(this.zzai);
    int i = 8;
    Object localObject2;
    Object localObject1;
    long l1;
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 19899)
        {
          if (paramInt != 25152)
          {
            if (paramInt != 28032)
            {
              if (paramInt != 357149030)
              {
                if (paramInt != 374648427)
                {
                  if (paramInt == 475249515)
                  {
                    if (!this.zzC)
                    {
                      zzaar localzzaar = this.zzai;
                      localObject2 = this.zzJ;
                      localObject1 = this.zzK;
                      if ((this.zzx != -1L) && (this.zzA != -9223372036854775807L) && (localObject2 != null) && (((zzes)localObject2).zza() != 0) && (localObject1 != null) && (((zzes)localObject1).zza() == ((zzes)localObject2).zza()))
                      {
                        j = ((zzes)localObject2).zza();
                        int[] arrayOfInt2 = new int[j];
                        long[] arrayOfLong3 = new long[j];
                        long[] arrayOfLong2 = new long[j];
                        long[] arrayOfLong1 = new long[j];
                        for (paramInt = 0; paramInt < j; paramInt++)
                        {
                          arrayOfLong1[paramInt] = ((zzes)localObject2).zzb(paramInt);
                          arrayOfLong3[paramInt] = (this.zzx + ((zzes)localObject1).zzb(paramInt));
                        }
                        for (paramInt = 0;; paramInt = i)
                        {
                          i = j - 1;
                          if (paramInt >= i) {
                            break;
                          }
                          i = paramInt + 1;
                          arrayOfInt2[paramInt] = ((int)(arrayOfLong3[i] - arrayOfLong3[paramInt]));
                          arrayOfLong1[i] -= arrayOfLong1[paramInt];
                        }
                        arrayOfInt2[i] = ((int)(this.zzx + this.zzw - arrayOfLong3[i]));
                        l1 = this.zzA - arrayOfLong1[i];
                        arrayOfLong2[i] = l1;
                        int[] arrayOfInt1 = arrayOfInt2;
                        localObject3 = arrayOfLong3;
                        localObject2 = arrayOfLong2;
                        localObject1 = arrayOfLong1;
                        if (l1 <= 0L)
                        {
                          localObject1 = new StringBuilder();
                          ((StringBuilder)localObject1).append("Discarding last cue point with unexpected duration: ");
                          ((StringBuilder)localObject1).append(l1);
                          zzer.zze("MatroskaExtractor", ((StringBuilder)localObject1).toString());
                          arrayOfInt1 = Arrays.copyOf(arrayOfInt2, i);
                          localObject3 = Arrays.copyOf(arrayOfLong3, i);
                          localObject2 = Arrays.copyOf(arrayOfLong2, i);
                          localObject1 = Arrays.copyOf(arrayOfLong1, i);
                        }
                        localObject1 = new zzaac(arrayOfInt1, (long[])localObject3, (long[])localObject2, (long[])localObject1);
                      }
                      else
                      {
                        localObject1 = new zzabm(this.zzA, 0L);
                      }
                      localzzaar.zzN((zzabn)localObject1);
                      this.zzC = true;
                    }
                    this.zzJ = null;
                    this.zzK = null;
                  }
                }
                else
                {
                  if (this.zzj.size() != 0)
                  {
                    this.zzai.zzC();
                    return;
                  }
                  throw zzce.zza("No valid tracks were found", null);
                }
              }
              else
              {
                if (this.zzy == -9223372036854775807L) {
                  this.zzy = 1000000L;
                }
                l1 = this.zzz;
                if (l1 != -9223372036854775807L) {
                  this.zzA = zzp(l1);
                }
              }
            }
            else
            {
              zzr(paramInt);
              localObject1 = this.zzB;
              if ((((zzafm)localObject1).zzg) && (((zzafm)localObject1).zzh != null)) {
                throw zzce.zza("Combining encryption and compression is not supported", null);
              }
            }
          }
          else
          {
            zzr(paramInt);
            localObject1 = this.zzB;
            if (((zzafm)localObject1).zzg)
            {
              if (((zzafm)localObject1).zzi != null)
              {
                ((zzafm)localObject1).zzk = new zzad(null, new zzac[] { new zzac(zzo.zza, null, "video/webm", this.zzB.zzi.zzb) });
                return;
              }
              throw zzce.zza("Encrypted Track found but ContentEncKeyID was not found", null);
            }
          }
        }
        else
        {
          paramInt = this.zzD;
          if (paramInt == -1) {
            break label678;
          }
          l1 = this.zzE;
          if (l1 == -1L) {
            break label678;
          }
          if (paramInt == 475249515) {
            this.zzG = l1;
          }
        }
        return;
        label678:
        throw zzce.zza("Mandatory element SeekID or SeekPosition not found", null);
      }
      localObject2 = this.zzB;
      zzdy.zzb(localObject2);
      localObject1 = ((zzafm)localObject2).zzb;
      if (localObject1 != null)
      {
        switch (((String)localObject1).hashCode())
        {
        default: 
          break;
        case 1951062397: 
          if (((String)localObject1).equals("A_OPUS")) {
            paramInt = 11;
          }
          break;
        case 1950789798: 
          if (((String)localObject1).equals("A_FLAC")) {
            paramInt = 22;
          }
          break;
        case 1950749482: 
          if (((String)localObject1).equals("A_EAC3")) {
            paramInt = 17;
          }
          break;
        case 1809237540: 
          if (((String)localObject1).equals("V_MPEG2")) {
            paramInt = 3;
          }
          break;
        case 1422270023: 
          if (((String)localObject1).equals("S_TEXT/UTF8")) {
            paramInt = 27;
          }
          break;
        case 1045209816: 
          if (((String)localObject1).equals("S_TEXT/WEBVTT")) {
            paramInt = 29;
          }
          break;
        case 855502857: 
          if (((String)localObject1).equals("V_MPEGH/ISO/HEVC")) {
            paramInt = i;
          }
          break;
        case 738597099: 
          if (((String)localObject1).equals("S_TEXT/ASS")) {
            paramInt = 28;
          }
          break;
        case 725957860: 
          if (((String)localObject1).equals("A_PCM/INT/LIT")) {
            paramInt = 24;
          }
          break;
        case 725948237: 
          if (((String)localObject1).equals("A_PCM/INT/BIG")) {
            paramInt = 25;
          }
          break;
        case 635596514: 
          if (((String)localObject1).equals("A_PCM/FLOAT/IEEE")) {
            paramInt = 26;
          }
          break;
        case 542569478: 
          if (((String)localObject1).equals("A_DTS/EXPRESS")) {
            paramInt = 20;
          }
          break;
        case 444813526: 
          if (((String)localObject1).equals("V_THEORA")) {
            paramInt = 10;
          }
          break;
        case 99146302: 
          if (((String)localObject1).equals("S_HDMV/PGS")) {
            paramInt = 31;
          }
          break;
        case 82338134: 
          if (((String)localObject1).equals("V_VP9")) {
            paramInt = 1;
          }
          break;
        case 82338133: 
          if (((String)localObject1).equals("V_VP8")) {
            paramInt = 0;
          }
          break;
        case 82318131: 
          if (((String)localObject1).equals("V_AV1")) {
            paramInt = 2;
          }
          break;
        case 62927045: 
          if (((String)localObject1).equals("A_DTS")) {
            paramInt = 19;
          }
          break;
        case 62923603: 
          if (((String)localObject1).equals("A_AC3")) {
            paramInt = 16;
          }
          break;
        case 62923557: 
          if (((String)localObject1).equals("A_AAC")) {
            paramInt = 13;
          }
          break;
        case -356037306: 
          if (((String)localObject1).equals("A_DTS/LOSSLESS")) {
            paramInt = 21;
          }
          break;
        case -425012669: 
          if (((String)localObject1).equals("S_VOBSUB")) {
            paramInt = 30;
          }
          break;
        case -538363109: 
          if (((String)localObject1).equals("V_MPEG4/ISO/AVC")) {
            paramInt = 7;
          }
          break;
        case -538363189: 
          if (((String)localObject1).equals("V_MPEG4/ISO/ASP")) {
            paramInt = 5;
          }
          break;
        case -933872740: 
          if (((String)localObject1).equals("S_DVBSUB")) {
            paramInt = 32;
          }
          break;
        case -1373388978: 
          if (((String)localObject1).equals("V_MS/VFW/FOURCC")) {
            paramInt = 9;
          }
          break;
        case -1482641357: 
          if (((String)localObject1).equals("A_MPEG/L3")) {
            paramInt = 15;
          }
          break;
        case -1482641358: 
          if (((String)localObject1).equals("A_MPEG/L2")) {
            paramInt = 14;
          }
          break;
        case -1730367663: 
          if (((String)localObject1).equals("A_VORBIS")) {
            paramInt = 12;
          }
          break;
        case -1784763192: 
          if (((String)localObject1).equals("A_TRUEHD")) {
            paramInt = 18;
          }
          break;
        case -1985379776: 
          if (((String)localObject1).equals("A_MS/ACM")) {
            paramInt = 23;
          }
          break;
        case -2095575984: 
          if (((String)localObject1).equals("V_MPEG4/ISO/SP")) {
            paramInt = 4;
          }
          break;
        case -2095576542: 
          if (((String)localObject1).equals("V_MPEG4/ISO/AP")) {
            paramInt = 6;
          }
          break;
        }
        paramInt = -1;
        switch (paramInt)
        {
        }
        for (;;)
        {
          break;
          ((zzafm)localObject2).zze(this.zzai, ((zzafm)localObject2).zzc);
          this.zzj.put(((zzafm)localObject2).zzc, localObject2);
        }
        this.zzB = null;
        return;
      }
      throw zzce.zza("CodecId is missing in TrackEntry element", null);
    }
    if (this.zzN != 2) {
      return;
    }
    Object localObject3 = (zzafm)this.zzj.get(this.zzT);
    zzafm.zzd((zzafm)localObject3);
    if ((this.zzY > 0L) && ("A_OPUS".equals(((zzafm)localObject3).zzb)))
    {
      localObject1 = this.zzu;
      localObject2 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
      ((zzfd)localObject1).zzD((byte[])localObject2, localObject2.length);
    }
    paramInt = 0;
    for (i = 0; i < this.zzR; i++) {
      paramInt += this.zzS[i];
    }
    i = 0;
    int j = paramInt;
    while (i < this.zzR)
    {
      l1 = this.zzO;
      long l2 = ((zzafm)localObject3).zze * i / 1000;
      int k = this.zzV;
      if (i == 0)
      {
        paramInt = k;
        if (!this.zzX) {
          paramInt = k | 0x1;
        }
        i = 0;
      }
      else
      {
        paramInt = k;
      }
      k = this.zzS[i];
      j -= k;
      zzs((zzafm)localObject3, l1 + l2, paramInt, k, j);
      i++;
    }
    this.zzN = 0;
  }
  
  protected final void zzi(int paramInt, double paramDouble)
    throws zzce
  {
    if (paramInt != 181)
    {
      if (paramInt != 17545)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            return;
          case 30325: 
            zzr(paramInt);
            this.zzB.zzt = ((float)paramDouble);
            return;
          case 30324: 
            zzr(paramInt);
            this.zzB.zzs = ((float)paramDouble);
            return;
          }
          zzr(paramInt);
          this.zzB.zzr = ((float)paramDouble);
          return;
        case 21978: 
          zzr(paramInt);
          this.zzB.zzL = ((float)paramDouble);
          return;
        case 21977: 
          zzr(paramInt);
          this.zzB.zzK = ((float)paramDouble);
          return;
        case 21976: 
          zzr(paramInt);
          this.zzB.zzJ = ((float)paramDouble);
          return;
        case 21975: 
          zzr(paramInt);
          this.zzB.zzI = ((float)paramDouble);
          return;
        case 21974: 
          zzr(paramInt);
          this.zzB.zzH = ((float)paramDouble);
          return;
        case 21973: 
          zzr(paramInt);
          this.zzB.zzG = ((float)paramDouble);
          return;
        case 21972: 
          zzr(paramInt);
          this.zzB.zzF = ((float)paramDouble);
          return;
        case 21971: 
          zzr(paramInt);
          this.zzB.zzE = ((float)paramDouble);
          return;
        case 21970: 
          zzr(paramInt);
          this.zzB.zzD = ((float)paramDouble);
          return;
        }
        zzr(paramInt);
        this.zzB.zzC = ((float)paramDouble);
        return;
      }
      this.zzz = (paramDouble);
      return;
    }
    zzr(paramInt);
    this.zzB.zzP = ((int)paramDouble);
  }
  
  protected final void zzj(int paramInt, long paramLong)
    throws zzce
  {
    if (paramInt != 20529)
    {
      if (paramInt != 20530)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            break;
          case 21949: 
            zzr(paramInt);
            this.zzB.zzB = ((int)paramLong);
            return;
          case 21948: 
            zzr(paramInt);
            this.zzB.zzA = ((int)paramLong);
            return;
          case 21947: 
            zzr(paramInt);
            this.zzB.zzw = true;
            paramInt = zzs.zza((int)paramLong);
            if (paramInt == -1) {
              break;
            }
            this.zzB.zzx = paramInt;
            return;
          case 21946: 
            zzr(paramInt);
            paramInt = zzs.zzb((int)paramLong);
            if (paramInt == -1) {
              break;
            }
            this.zzB.zzy = paramInt;
            return;
          case 21945: 
            zzr(paramInt);
            paramInt = (int)paramLong;
            if (paramInt != 1)
            {
              if (paramInt != 2) {
                break;
              }
              this.zzB.zzz = 1;
              return;
            }
            this.zzB.zzz = 2;
            return;
          }
          break;
        case 2807729: 
          this.zzy = paramLong;
          return;
        case 2352003: 
          zzr(paramInt);
          this.zzB.zze = ((int)paramLong);
          return;
        case 30321: 
          zzr(paramInt);
          paramInt = (int)paramLong;
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              if (paramInt != 2)
              {
                if (paramInt != 3) {
                  break;
                }
                this.zzB.zzq = 3;
                return;
              }
              this.zzB.zzq = 2;
              return;
            }
            this.zzB.zzq = 1;
            return;
          }
          this.zzB.zzq = 0;
          return;
        case 30114: 
          this.zzY = paramLong;
          return;
        case 25188: 
          zzr(paramInt);
          this.zzB.zzO = ((int)paramLong);
          return;
        case 22203: 
          zzr(paramInt);
          this.zzB.zzR = paramLong;
          return;
        case 22186: 
          zzr(paramInt);
          this.zzB.zzQ = paramLong;
          return;
        case 21998: 
          zzr(paramInt);
          this.zzB.zzf = ((int)paramLong);
          return;
        case 21930: 
          zzr(paramInt);
          localObject = this.zzB;
          bool1 = bool2;
          if (paramLong == 1L) {
            bool1 = true;
          }
          ((zzafm)localObject).zzT = bool1;
          return;
        case 21690: 
          zzr(paramInt);
          this.zzB.zzo = ((int)paramLong);
          return;
        case 21682: 
          zzr(paramInt);
          this.zzB.zzp = ((int)paramLong);
          return;
        case 21680: 
          zzr(paramInt);
          this.zzB.zzn = ((int)paramLong);
          return;
        case 21432: 
          int i = (int)paramLong;
          zzr(paramInt);
          if (i != 0)
          {
            if (i != 1)
            {
              if (i != 3)
              {
                if (i != 15) {
                  break;
                }
                this.zzB.zzv = 3;
                return;
              }
              this.zzB.zzv = 1;
              return;
            }
            this.zzB.zzv = 2;
            return;
          }
          this.zzB.zzv = 0;
          return;
        case 21420: 
          this.zzE = (paramLong + this.zzx);
          return;
        case 18408: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("AESSettingsCipherMode ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw zzce.zza(((StringBuilder)localObject).toString(), null);
        case 18401: 
          if (paramLong == 5L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("ContentEncAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw zzce.zza(((StringBuilder)localObject).toString(), null);
        case 17143: 
          if (paramLong == 1L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("EBMLReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw zzce.zza(((StringBuilder)localObject).toString(), null);
        case 17029: 
          if ((paramLong >= 1L) && (paramLong <= 2L)) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("DocTypeReadVersion ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw zzce.zza(((StringBuilder)localObject).toString(), null);
        case 16980: 
          if (paramLong == 3L) {
            break;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("ContentCompAlgo ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append(" not supported");
          throw zzce.zza(((StringBuilder)localObject).toString(), null);
        case 16871: 
          zzr(paramInt);
          zzafm.zzb(this.zzB, (int)paramLong);
          return;
        case 251: 
          this.zzX = true;
          return;
        case 241: 
          if (this.zzL) {
            break;
          }
          zzq(paramInt);
          this.zzK.zzc(paramLong);
          this.zzL = true;
          return;
        case 238: 
          this.zzW = ((int)paramLong);
          return;
        case 231: 
          this.zzI = zzp(paramLong);
          return;
        case 215: 
          zzr(paramInt);
          this.zzB.zzc = ((int)paramLong);
          return;
        case 186: 
          zzr(paramInt);
          this.zzB.zzm = ((int)paramLong);
          return;
        case 179: 
          zzq(paramInt);
          this.zzJ.zzc(zzp(paramLong));
          return;
        case 176: 
          zzr(paramInt);
          this.zzB.zzl = ((int)paramLong);
          return;
        case 159: 
          zzr(paramInt);
          this.zzB.zzN = ((int)paramLong);
          return;
        case 155: 
          this.zzP = zzp(paramLong);
          return;
        case 136: 
          zzr(paramInt);
          localObject = this.zzB;
          if (paramLong == 1L) {
            bool1 = true;
          }
          ((zzafm)localObject).zzU = bool1;
          return;
        case 131: 
          zzr(paramInt);
          this.zzB.zzd = ((int)paramLong);
          return;
        }
      }
      else if (paramLong != 1L)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("ContentEncodingScope ");
        ((StringBuilder)localObject).append(paramLong);
        ((StringBuilder)localObject).append(" not supported");
        throw zzce.zza(((StringBuilder)localObject).toString(), null);
      }
    }
    else {
      if (paramLong != 0L) {
        break label1297;
      }
    }
    return;
    label1297:
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("ContentEncodingOrder ");
    ((StringBuilder)localObject).append(paramLong);
    ((StringBuilder)localObject).append(" not supported");
    throw zzce.zza(((StringBuilder)localObject).toString(), null);
  }
  
  protected final void zzk(int paramInt, long paramLong1, long paramLong2)
    throws zzce
  {
    zzdy.zzb(this.zzai);
    if (paramInt != 160)
    {
      if (paramInt != 174)
      {
        if (paramInt != 187)
        {
          if (paramInt != 19899)
          {
            if (paramInt != 20533)
            {
              if (paramInt != 21968)
              {
                if (paramInt != 408125543)
                {
                  if (paramInt != 475249515)
                  {
                    if ((paramInt == 524531317) && (!this.zzC))
                    {
                      if ((this.zzk) && (this.zzG != -1L))
                      {
                        this.zzF = true;
                        return;
                      }
                      this.zzai.zzN(new zzabm(this.zzA, 0L));
                      this.zzC = true;
                    }
                    return;
                  }
                  this.zzJ = new zzes(32);
                  this.zzK = new zzes(32);
                  return;
                }
                long l = this.zzx;
                if ((l != -1L) && (l != paramLong1)) {
                  throw zzce.zza("Multiple Segment elements not supported", null);
                }
                this.zzx = paramLong1;
                this.zzw = paramLong2;
                return;
              }
              zzr(paramInt);
              this.zzB.zzw = true;
              return;
            }
            zzr(paramInt);
            this.zzB.zzg = true;
            return;
          }
          this.zzD = -1;
          this.zzE = -1L;
          return;
        }
        this.zzL = false;
        return;
      }
      this.zzB = new zzafm();
      return;
    }
    this.zzX = false;
    this.zzY = 0L;
  }
  
  protected final void zzl(int paramInt, String paramString)
    throws zzce
  {
    if (paramInt != 134)
    {
      if (paramInt != 17026)
      {
        if (paramInt != 21358)
        {
          if (paramInt == 2274716)
          {
            zzr(paramInt);
            zzafm.zzc(this.zzB, paramString);
          }
        }
        else
        {
          zzr(paramInt);
          this.zzB.zza = paramString;
        }
      }
      else if ((!"webm".equals(paramString)) && (!"matroska".equals(paramString)))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("DocType ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" not supported");
        throw zzce.zza(localStringBuilder.toString(), null);
      }
      return;
    }
    zzr(paramInt);
    this.zzB.zzb = paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */