package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public abstract class zzrt
  extends zzhr
{
  private static final byte[] zzb = { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
  private zzrr zzA;
  private zzrp zzB;
  private int zzC;
  private boolean zzD;
  private boolean zzE;
  private boolean zzF;
  private boolean zzG;
  private boolean zzH;
  private boolean zzI;
  private boolean zzJ;
  private boolean zzK;
  private boolean zzL;
  private zzrh zzM;
  private long zzN;
  private int zzO;
  private int zzP;
  private ByteBuffer zzQ;
  private boolean zzR;
  private boolean zzS;
  private boolean zzT;
  private boolean zzU;
  private boolean zzV;
  private boolean zzW;
  private int zzX;
  private int zzY;
  private int zzZ;
  protected zzhs zza;
  private boolean zzaa;
  private boolean zzab;
  private boolean zzac;
  private long zzad;
  private long zzae;
  private boolean zzaf;
  private boolean zzag;
  private boolean zzah;
  private zzrs zzai;
  private long zzaj;
  private boolean zzak;
  private zzqs zzal;
  private zzqs zzam;
  private final zzrl zzc;
  private final zzrv zzd;
  private final float zze;
  private final zzhi zzf;
  private final zzhi zzg;
  private final zzhi zzh;
  private final zzrg zzi;
  private final ArrayList zzj;
  private final MediaCodec.BufferInfo zzk;
  private final ArrayDeque zzl;
  private final zzqd zzm;
  private zzam zzn;
  private zzam zzo;
  private MediaCrypto zzp;
  private boolean zzq;
  private long zzr;
  private float zzs;
  private float zzt;
  private zzrm zzu;
  private zzam zzv;
  private MediaFormat zzw;
  private boolean zzx;
  private float zzy;
  private ArrayDeque zzz;
  
  public zzrt(int paramInt, zzrl paramzzrl, zzrv paramzzrv, boolean paramBoolean, float paramFloat)
  {
    super(paramInt);
    this.zzc = paramzzrl;
    Objects.requireNonNull(paramzzrv);
    this.zzd = paramzzrv;
    this.zze = paramFloat;
    this.zzf = new zzhi(0, 0);
    this.zzg = new zzhi(0, 0);
    this.zzh = new zzhi(2, 0);
    paramzzrl = new zzrg();
    this.zzi = paramzzrl;
    this.zzj = new ArrayList();
    this.zzk = new MediaCodec.BufferInfo();
    this.zzs = 1.0F;
    this.zzt = 1.0F;
    this.zzr = -9223372036854775807L;
    this.zzl = new ArrayDeque();
    zzaD(zzrs.zza);
    paramzzrl.zzj(0);
    paramzzrl.zzb.order(ByteOrder.nativeOrder());
    this.zzm = new zzqd();
    this.zzy = -1.0F;
    this.zzC = 0;
    this.zzX = 0;
    this.zzO = -1;
    this.zzP = -1;
    this.zzN = -9223372036854775807L;
    this.zzad = -9223372036854775807L;
    this.zzae = -9223372036854775807L;
    this.zzaj = -9223372036854775807L;
    this.zzY = 0;
    this.zzZ = 0;
  }
  
  private final void zzV()
  {
    this.zzV = false;
    this.zzi.zzb();
    this.zzh.zzb();
    this.zzU = false;
    this.zzT = false;
    this.zzm.zzb();
  }
  
  private final void zzW()
    throws zzia
  {
    if (this.zzaa)
    {
      this.zzY = 1;
      this.zzZ = 3;
      return;
    }
    zzas();
    zzap();
  }
  
  private final void zzaA()
    throws zzia
  {
    int i = this.zzZ;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          this.zzag = true;
          zzag();
          return;
        }
        zzas();
        zzap();
        return;
      }
      zzad();
      zzaE();
      return;
    }
    zzad();
  }
  
  private final void zzaB()
  {
    this.zzO = -1;
    this.zzg.zzb = null;
  }
  
  private final void zzaC()
  {
    this.zzP = -1;
    this.zzQ = null;
  }
  
  private final void zzaD(zzrs paramzzrs)
  {
    this.zzai = paramzzrs;
    if (paramzzrs.zzc != -9223372036854775807L) {
      this.zzak = true;
    }
  }
  
  private final void zzaE()
    throws zzia
  {
    try
    {
      throw null;
    }
    catch (MediaCryptoException localMediaCryptoException)
    {
      throw zzbe(localMediaCryptoException, this.zzn, false, 6006);
    }
  }
  
  private final boolean zzaF()
    throws zzia
  {
    if (this.zzaa)
    {
      this.zzY = 1;
      if ((!this.zzE) && (!this.zzG))
      {
        this.zzZ = 2;
      }
      else
      {
        this.zzZ = 3;
        return false;
      }
    }
    else
    {
      zzaE();
    }
    return true;
  }
  
  private final boolean zzaG()
    throws zzia
  {
    Object localObject1 = this.zzu;
    if ((localObject1 != null) && (this.zzY != 2) && (!this.zzaf))
    {
      if (this.zzO < 0)
      {
        i = ((zzrm)localObject1).zza();
        this.zzO = i;
        if (i < 0) {
          return false;
        }
        this.zzg.zzb = this.zzu.zzf(i);
        this.zzg.zzb();
      }
      if (this.zzY == 1)
      {
        if (!this.zzL)
        {
          this.zzab = true;
          this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
          zzaB();
        }
        this.zzY = 2;
        return false;
      }
      if (this.zzJ)
      {
        this.zzJ = false;
        this.zzg.zzb.put(zzb);
        this.zzu.zzj(this.zzO, 0, 38, 0L, 0);
        zzaB();
        this.zzaa = true;
        return true;
      }
      if (this.zzX == 1)
      {
        for (i = 0; i < this.zzv.zzo.size(); i++)
        {
          localObject1 = (byte[])this.zzv.zzo.get(i);
          this.zzg.zzb.put((byte[])localObject1);
        }
        this.zzX = 2;
      }
      int i = this.zzg.zzb.position();
      localObject1 = zzh();
      try
      {
        int j = zzbd((zzkf)localObject1, this.zzg, 0);
        if ((zzI()) || (this.zzg.zzi())) {
          this.zzae = this.zzad;
        }
        if (j == -3) {
          return false;
        }
        if (j == -5)
        {
          if (this.zzX == 2)
          {
            this.zzg.zzb();
            this.zzX = 1;
          }
          zzU((zzkf)localObject1);
          return true;
        }
        localObject1 = this.zzg;
        if (((zzhc)localObject1).zzg())
        {
          if (this.zzX == 2)
          {
            ((zzhc)localObject1).zzb();
            this.zzX = 1;
          }
          this.zzaf = true;
          if (!this.zzaa)
          {
            zzaA();
            return false;
          }
          try
          {
            if (!this.zzL)
            {
              this.zzab = true;
              this.zzu.zzj(this.zzO, 0, 0, 0L, 4);
              zzaB();
            }
            return false;
          }
          catch (MediaCodec.CryptoException localCryptoException1)
          {
            throw zzbe(localCryptoException1, this.zzn, false, zzfn.zzh(localCryptoException1.getErrorCode()));
          }
        }
        if ((!this.zzaa) && (!localCryptoException1.zzh()))
        {
          localCryptoException1.zzb();
          if (this.zzX == 2) {
            this.zzX = 1;
          }
          return true;
        }
        boolean bool = localCryptoException1.zzl();
        if (bool) {
          localCryptoException1.zza.zzb(i);
        }
        if ((this.zzD) && (!bool))
        {
          localObject2 = this.zzg.zzb;
          localObject3 = zzew.zza;
          int i2 = ((ByteBuffer)localObject2).position();
          int m = 0;
          i = 0;
          for (;;)
          {
            int n = m + 1;
            if (n >= i2) {
              break;
            }
            int i1 = ((ByteBuffer)localObject2).get(m) & 0xFF;
            int k;
            if (i == 3)
            {
              j = i;
              k = i1;
              if (i1 == 1)
              {
                if ((((ByteBuffer)localObject2).get(n) & 0x1F) == 7)
                {
                  localObject3 = ((ByteBuffer)localObject2).duplicate();
                  ((ByteBuffer)localObject3).position(m - 3);
                  ((ByteBuffer)localObject3).limit(i2);
                  ((ByteBuffer)localObject2).position(0);
                  ((ByteBuffer)localObject2).put((ByteBuffer)localObject3);
                  break label693;
                }
                k = 1;
                j = i;
              }
            }
            else
            {
              j = i;
              k = i1;
              if (i1 == 0)
              {
                j = i + 1;
                k = i1;
              }
            }
            i = j;
            if (k != 0) {
              i = 0;
            }
            m = n;
          }
          ((ByteBuffer)localObject2).clear();
          label693:
          if (this.zzg.zzb.position() == 0) {
            return true;
          }
          this.zzD = false;
        }
        Object localObject2 = this.zzg;
        long l = ((zzhi)localObject2).zzd;
        Object localObject3 = this.zzM;
        if (localObject3 != null)
        {
          l = ((zzrh)localObject3).zzb(this.zzn, (zzhi)localObject2);
          this.zzad = Math.max(this.zzad, this.zzM.zza(this.zzn));
        }
        if (this.zzg.zzf()) {
          this.zzj.add(Long.valueOf(l));
        }
        if (this.zzah)
        {
          if (!this.zzl.isEmpty()) {
            ((zzrs)this.zzl.peekLast()).zzd.zzd(l, this.zzn);
          } else {
            this.zzai.zzd.zzd(l, this.zzn);
          }
          this.zzah = false;
        }
        this.zzad = Math.max(this.zzad, l);
        this.zzg.zzk();
        localObject2 = this.zzg;
        if (((zzhc)localObject2).zze()) {
          zzao((zzhi)localObject2);
        }
        zzaf(this.zzg);
        if (bool) {}
        try
        {
          this.zzu.zzk(this.zzO, 0, this.zzg.zza, l, 0);
          break label965;
          this.zzu.zzj(this.zzO, 0, this.zzg.zzb.limit(), l, 0);
          label965:
          zzaB();
          this.zzaa = true;
          this.zzX = 0;
          localObject2 = this.zza;
          ((zzhs)localObject2).zzc += 1;
          return true;
        }
        catch (MediaCodec.CryptoException localCryptoException2)
        {
          throw zzbe(localCryptoException2, this.zzn, false, zzfn.zzh(localCryptoException2.getErrorCode()));
        }
        return false;
      }
      catch (zzhh localzzhh)
      {
        zzZ(localzzhh);
        zzaI(0);
        zzad();
        return true;
      }
    }
  }
  
  private final boolean zzaH()
  {
    return this.zzP >= 0;
  }
  
  private final boolean zzaI(int paramInt)
    throws zzia
  {
    zzkf localzzkf = zzh();
    this.zzf.zzb();
    paramInt = zzbd(localzzkf, this.zzf, paramInt | 0x4);
    if (paramInt == -5)
    {
      zzU(localzzkf);
      return true;
    }
    if ((paramInt == -4) && (this.zzf.zzg()))
    {
      this.zzaf = true;
      zzaA();
    }
    return false;
  }
  
  private final boolean zzaJ(long paramLong)
  {
    return (this.zzr == -9223372036854775807L) || (SystemClock.elapsedRealtime() - paramLong < this.zzr);
  }
  
  private final boolean zzaK(zzam paramzzam)
    throws zzia
  {
    if (zzfn.zza < 23) {
      return true;
    }
    if ((this.zzu != null) && (this.zzZ != 3) && (zzbc() != 0))
    {
      float f1 = zzR(this.zzt, paramzzam, zzL());
      float f2 = this.zzy;
      if (f2 == f1) {
        return true;
      }
      if (f1 == -1.0F)
      {
        zzW();
        return false;
      }
      if ((f2 == -1.0F) && (f1 <= this.zze)) {
        return true;
      }
      paramzzam = new Bundle();
      paramzzam.putFloat("operating-rate", f1);
      this.zzu.zzp(paramzzam);
      this.zzy = f1;
    }
    return true;
  }
  
  private final void zzad()
  {
    try
    {
      this.zzu.zzi();
      return;
    }
    finally
    {
      zzat();
    }
  }
  
  protected static boolean zzay(zzam paramzzam)
  {
    return paramzzam.zzF == 0;
  }
  
  private final void zzaz(zzrp paramzzrp, MediaCrypto paramMediaCrypto)
    throws Exception
  {
    String str = paramzzrp.zza;
    float f1;
    if (zzfn.zza < 23) {
      f1 = -1.0F;
    } else {
      f1 = zzR(this.zzt, this.zzn, zzL());
    }
    float f2 = f1;
    if (f1 <= this.zze) {
      f2 = -1.0F;
    }
    zzar(this.zzn);
    long l1 = SystemClock.elapsedRealtime();
    paramMediaCrypto = this.zzn;
    Object localObject1 = null;
    paramMediaCrypto = zzX(paramzzrp, paramMediaCrypto, null, f2);
    if (zzfn.zza >= 31) {
      zzrq.zza(paramMediaCrypto, zzl());
    }
    try
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("createCodec:");
      ((StringBuilder)localObject2).append(str);
      Trace.beginSection(((StringBuilder)localObject2).toString());
      int i;
      if ((zzfn.zza >= 23) && (zzfn.zza >= 31))
      {
        i = zzcd.zzb(paramMediaCrypto.zzc.zzm);
        zzer.zzd("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfn.zzx(i)));
        localObject1 = new com/google/android/gms/internal/ads/zzqx;
        ((zzqx)localObject1).<init>(i, false);
        localObject1 = ((zzqx)localObject1).zzc(paramMediaCrypto);
      }
      try
      {
        localObject2 = paramMediaCrypto.zza;
        Objects.requireNonNull(localObject2);
        localObject2 = ((zzrp)localObject2).zza;
        Trace.beginSection("createCodec:".concat((String)localObject2));
        localObject2 = MediaCodec.createByCodecName((String)localObject2);
        Trace.endSection();
        try
        {
          Trace.beginSection("configureCodec");
          ((MediaCodec)localObject2).configure(paramMediaCrypto.zzb, paramMediaCrypto.zzd, null, 0);
          Trace.endSection();
          Trace.beginSection("startCodec");
          ((MediaCodec)localObject2).start();
          Trace.endSection();
          localObject1 = new zzsk((MediaCodec)localObject2, null);
          this.zzu = ((zzrm)localObject1);
          Trace.endSection();
          long l2 = SystemClock.elapsedRealtime();
          if (!paramzzrp.zze(this.zzn))
          {
            localObject1 = this.zzn;
            localObject2 = zzam.zza;
            if (localObject1 == null) {}
            for (localObject1 = "null";; localObject1 = ((StringBuilder)localObject2).toString())
            {
              break;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("id=");
              ((StringBuilder)localObject2).append(((zzam)localObject1).zzb);
              ((StringBuilder)localObject2).append(", mimeType=");
              ((StringBuilder)localObject2).append(((zzam)localObject1).zzm);
              if (((zzam)localObject1).zzi != -1)
              {
                ((StringBuilder)localObject2).append(", bitrate=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzi);
              }
              if (((zzam)localObject1).zzj != null)
              {
                ((StringBuilder)localObject2).append(", codecs=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzj);
              }
              if (((zzam)localObject1).zzp != null)
              {
                localObject3 = new LinkedHashSet();
                for (i = 0;; i++)
                {
                  Object localObject4 = ((zzam)localObject1).zzp;
                  if (i >= ((zzad)localObject4).zzb) {
                    break;
                  }
                  localObject4 = ((zzad)localObject4).zza(i).zza;
                  if (((UUID)localObject4).equals(zzo.zzb)) {
                    ((Set)localObject3).add("cenc");
                  }
                  for (;;)
                  {
                    break;
                    if (((UUID)localObject4).equals(zzo.zzc))
                    {
                      ((Set)localObject3).add("clearkey");
                    }
                    else if (((UUID)localObject4).equals(zzo.zze))
                    {
                      ((Set)localObject3).add("playready");
                    }
                    else if (((UUID)localObject4).equals(zzo.zzd))
                    {
                      ((Set)localObject3).add("widevine");
                    }
                    else if (((UUID)localObject4).equals(zzo.zza))
                    {
                      ((Set)localObject3).add("universal");
                    }
                    else
                    {
                      localObject4 = localObject4.toString();
                      StringBuilder localStringBuilder = new StringBuilder();
                      localStringBuilder.append("unknown (");
                      localStringBuilder.append((String)localObject4);
                      localStringBuilder.append(")");
                      ((Set)localObject3).add(localStringBuilder.toString());
                    }
                  }
                }
                ((StringBuilder)localObject2).append(", drm=[");
                zzfoo.zzb((StringBuilder)localObject2, (Iterable)localObject3, ",");
                ((StringBuilder)localObject2).append(']');
              }
              if ((((zzam)localObject1).zzr != -1) && (((zzam)localObject1).zzs != -1))
              {
                ((StringBuilder)localObject2).append(", res=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzr);
                ((StringBuilder)localObject2).append("x");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzs);
              }
              Object localObject3 = ((zzam)localObject1).zzy;
              if ((localObject3 != null) && (((zzs)localObject3).zze()))
              {
                ((StringBuilder)localObject2).append(", color=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzy.zzd());
              }
              if (((zzam)localObject1).zzt != -1.0F)
              {
                ((StringBuilder)localObject2).append(", fps=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzt);
              }
              if (((zzam)localObject1).zzz != -1)
              {
                ((StringBuilder)localObject2).append(", channels=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzz);
              }
              if (((zzam)localObject1).zzA != -1)
              {
                ((StringBuilder)localObject2).append(", sample_rate=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzA);
              }
              if (((zzam)localObject1).zzd != null)
              {
                ((StringBuilder)localObject2).append(", language=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzd);
              }
              if (((zzam)localObject1).zzc != null)
              {
                ((StringBuilder)localObject2).append(", label=");
                ((StringBuilder)localObject2).append(((zzam)localObject1).zzc);
              }
              if (((zzam)localObject1).zze != 0)
              {
                localObject3 = new ArrayList();
                if ((((zzam)localObject1).zze & 0x1) != 0) {
                  ((List)localObject3).add("default");
                }
                if ((((zzam)localObject1).zze & 0x2) != 0) {
                  ((List)localObject3).add("forced");
                }
                ((StringBuilder)localObject2).append(", selectionFlags=[");
                zzfoo.zzb((StringBuilder)localObject2, (Iterable)localObject3, ",");
                ((StringBuilder)localObject2).append("]");
              }
            }
            zzer.zze("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", new Object[] { localObject1, str }));
          }
          this.zzB = paramzzrp;
          this.zzy = f2;
          this.zzv = this.zzn;
          if ((zzfn.zza <= 25) && ("OMX.Exynos.avc.dec.secure".equals(str)) && ((zzfn.zzd.startsWith("SM-T585")) || (zzfn.zzd.startsWith("SM-A510")) || (zzfn.zzd.startsWith("SM-A520")) || (zzfn.zzd.startsWith("SM-J700")))) {
            i = 2;
          } else if ((zzfn.zza < 24) && (("OMX.Nvidia.h264.decode".equals(str)) || ("OMX.Nvidia.h264.decode.secure".equals(str))) && (("flounder".equals(zzfn.zzb)) || ("flounder_lte".equals(zzfn.zzb)) || ("grouper".equals(zzfn.zzb)) || ("tilapia".equals(zzfn.zzb)))) {
            i = 1;
          } else {
            i = 0;
          }
          this.zzC = i;
          localObject1 = this.zzv;
          if ((zzfn.zza < 21) && (((zzam)localObject1).zzo.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzD = bool;
          if ((zzfn.zza == 19) && (zzfn.zzd.startsWith("SM-G800")) && (("OMX.Exynos.avc.dec".equals(str)) || ("OMX.Exynos.avc.dec.secure".equals(str)))) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzE = bool;
          if ((zzfn.zza == 29) && ("c2.android.aac.decoder".equals(str))) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzF = bool;
          if ((zzfn.zza <= 23) && ("OMX.google.vorbis.decoder".equals(str))) {}
          while ((zzfn.zza <= 19) && (("hb2000".equals(zzfn.zzb)) || ("stvm8".equals(zzfn.zzb))) && (("OMX.amlogic.avc.decoder.awesome".equals(str)) || ("OMX.amlogic.avc.decoder.awesome.secure".equals(str))))
          {
            bool = true;
            break;
          }
          boolean bool = false;
          this.zzG = bool;
          if ((zzfn.zza == 21) && ("OMX.google.aac.decoder".equals(str))) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzH = bool;
          if ((zzfn.zza < 21) && ("OMX.SEC.mp3.dec".equals(str)) && ("samsung".equals(zzfn.zzc)) && ((zzfn.zzb.startsWith("baffin")) || (zzfn.zzb.startsWith("grand")) || (zzfn.zzb.startsWith("fortuna")) || (zzfn.zzb.startsWith("gprimelte")) || (zzfn.zzb.startsWith("j2y18lte")) || (zzfn.zzb.startsWith("ms01")))) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzI = bool;
          localObject1 = paramzzrp.zza;
          if ((zzfn.zza <= 25) && ("OMX.rk.video_decoder.avc".equals(localObject1))) {}
          while (((zzfn.zza <= 29) && (("OMX.broadcom.video_decoder.tunnel".equals(localObject1)) || ("OMX.broadcom.video_decoder.tunnel.secure".equals(localObject1)) || ("OMX.bcm.vdec.avc.tunnel".equals(localObject1)) || ("OMX.bcm.vdec.avc.tunnel.secure".equals(localObject1)) || ("OMX.bcm.vdec.hevc.tunnel".equals(localObject1)) || ("OMX.bcm.vdec.hevc.tunnel.secure".equals(localObject1)))) || (("Amazon".equals(zzfn.zzc)) && ("AFTS".equals(zzfn.zzd)) && (paramzzrp.zzf)))
          {
            bool = true;
            break;
          }
          bool = false;
          this.zzL = bool;
          this.zzu.zzr();
          if ("c2.android.mp3.decoder".equals(paramzzrp.zza)) {
            this.zzM = new zzrh();
          }
          if (zzbc() == 2) {
            this.zzN = (SystemClock.elapsedRealtime() + 1000L);
          }
          paramzzrp = this.zza;
          paramzzrp.zza += 1;
          zzaa(str, paramMediaCrypto, l2, l2 - l1);
          return;
        }
        catch (RuntimeException paramzzrp) {}catch (IOException paramzzrp) {}
        paramMediaCrypto = (MediaCrypto)localObject2;
      }
      catch (RuntimeException paramzzrp)
      {
        paramMediaCrypto = (MediaCrypto)localObject1;
      }
      catch (IOException paramzzrp)
      {
        paramMediaCrypto = (MediaCrypto)localObject1;
      }
      if (paramMediaCrypto != null) {
        paramMediaCrypto.release();
      }
      throw paramzzrp;
    }
    finally
    {
      Trace.endSection();
    }
  }
  
  public void zzF(float paramFloat1, float paramFloat2)
    throws zzia
  {
    this.zzs = paramFloat1;
    this.zzt = paramFloat2;
    zzaK(this.zzv);
  }
  
  /* Error */
  public void zzN(long paramLong1, long paramLong2)
    throws zzia
  {
    // Byte code:
    //   0: aload_0
    //   1: astore 13
    //   3: aload 13
    //   5: astore 14
    //   7: aload 13
    //   9: getfield 261	com/google/android/gms/internal/ads/zzrt:zzag	Z
    //   12: ifeq +12 -> 24
    //   15: aload 13
    //   17: astore 14
    //   19: aload_0
    //   20: invokevirtual 263	com/google/android/gms/internal/ads/zzrt:zzag	()V
    //   23: return
    //   24: aload 13
    //   26: astore 14
    //   28: aload 13
    //   30: getfield 283	com/google/android/gms/internal/ads/zzrt:zzn	Lcom/google/android/gms/internal/ads/zzam;
    //   33: ifnonnull +20 -> 53
    //   36: aload 13
    //   38: astore 14
    //   40: aload 13
    //   42: iconst_2
    //   43: invokespecial 483	com/google/android/gms/internal/ads/zzrt:zzaI	(I)Z
    //   46: ifeq +6 -> 52
    //   49: goto +4 -> 53
    //   52: return
    //   53: aload 13
    //   55: astore 14
    //   57: aload_0
    //   58: invokevirtual 257	com/google/android/gms/internal/ads/zzrt:zzap	()V
    //   61: aload 13
    //   63: astore 14
    //   65: aload 13
    //   67: getfield 246	com/google/android/gms/internal/ads/zzrt:zzT	Z
    //   70: ifeq +765 -> 835
    //   73: aload 13
    //   75: astore 14
    //   77: getstatic 496	com/google/android/gms/internal/ads/zzfn:zza	I
    //   80: istore 5
    //   82: aload 13
    //   84: astore 14
    //   86: ldc_w 917
    //   89: invokestatic 574	android/os/Trace:beginSection	(Ljava/lang/String;)V
    //   92: aload 13
    //   94: astore 15
    //   96: aload 15
    //   98: astore 14
    //   100: aload 15
    //   102: getfield 261	com/google/android/gms/internal/ads/zzrt:zzag	Z
    //   105: iconst_1
    //   106: ixor
    //   107: invokestatic 922	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   110: aload 15
    //   112: astore 14
    //   114: aload 15
    //   116: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   119: astore 16
    //   121: aload 15
    //   123: astore 13
    //   125: aload 15
    //   127: astore 14
    //   129: aload 16
    //   131: invokevirtual 924	com/google/android/gms/internal/ads/zzrg:zzq	()Z
    //   134: ifeq +155 -> 289
    //   137: aload 15
    //   139: astore 14
    //   141: aload 16
    //   143: getfield 196	com/google/android/gms/internal/ads/zzrg:zzb	Ljava/nio/ByteBuffer;
    //   146: astore 13
    //   148: aload 15
    //   150: astore 14
    //   152: aload 15
    //   154: getfield 224	com/google/android/gms/internal/ads/zzrt:zzP	I
    //   157: istore 5
    //   159: aload 15
    //   161: astore 14
    //   163: aload 16
    //   165: invokevirtual 926	com/google/android/gms/internal/ads/zzrg:zzm	()I
    //   168: istore 6
    //   170: aload 15
    //   172: astore 14
    //   174: aload 16
    //   176: getfield 927	com/google/android/gms/internal/ads/zzrg:zzd	J
    //   179: lstore 9
    //   181: aload 15
    //   183: astore 14
    //   185: aload 16
    //   187: invokevirtual 428	com/google/android/gms/internal/ads/zzhc:zzf	()Z
    //   190: istore 7
    //   192: aload 15
    //   194: astore 14
    //   196: aload 16
    //   198: invokevirtual 361	com/google/android/gms/internal/ads/zzhc:zzg	()Z
    //   201: istore 8
    //   203: aload 15
    //   205: astore 14
    //   207: aload 15
    //   209: getfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   212: astore 15
    //   214: aload_0
    //   215: lload_1
    //   216: lload_3
    //   217: aconst_null
    //   218: aload 13
    //   220: iload 5
    //   222: iconst_0
    //   223: iload 6
    //   225: lload 9
    //   227: iload 7
    //   229: iload 8
    //   231: aload 15
    //   233: invokevirtual 932	com/google/android/gms/internal/ads/zzrt:zzah	(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z
    //   236: istore 7
    //   238: iload 7
    //   240: ifeq +38 -> 278
    //   243: aload_0
    //   244: astore 13
    //   246: aload 13
    //   248: astore 14
    //   250: aload 13
    //   252: aload 13
    //   254: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   257: invokevirtual 934	com/google/android/gms/internal/ads/zzrg:zzn	()J
    //   260: invokevirtual 938	com/google/android/gms/internal/ads/zzrt:zzaq	(J)V
    //   263: aload 13
    //   265: astore 14
    //   267: aload 13
    //   269: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   272: invokevirtual 242	com/google/android/gms/internal/ads/zzhc:zzb	()V
    //   275: goto +14 -> 289
    //   278: aload_0
    //   279: astore 15
    //   281: goto +540 -> 821
    //   284: astore 13
    //   286: goto +1635 -> 1921
    //   289: aload 13
    //   291: astore 14
    //   293: aload 13
    //   295: getfield 302	com/google/android/gms/internal/ads/zzrt:zzaf	Z
    //   298: ifeq +20 -> 318
    //   301: aload 13
    //   303: astore 14
    //   305: aload 13
    //   307: iconst_1
    //   308: putfield 261	com/google/android/gms/internal/ads/zzrt:zzag	Z
    //   311: aload 13
    //   313: astore 15
    //   315: goto +506 -> 821
    //   318: aload 13
    //   320: astore 14
    //   322: aload 13
    //   324: getfield 244	com/google/android/gms/internal/ads/zzrt:zzU	Z
    //   327: ifeq +36 -> 363
    //   330: aload 13
    //   332: astore 14
    //   334: aload 13
    //   336: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   339: aload 13
    //   341: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   344: invokevirtual 941	com/google/android/gms/internal/ads/zzrg:zzp	(Lcom/google/android/gms/internal/ads/zzhi;)Z
    //   347: invokestatic 922	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   350: aload 13
    //   352: astore 14
    //   354: aload 13
    //   356: iconst_0
    //   357: putfield 244	com/google/android/gms/internal/ads/zzrt:zzU	Z
    //   360: goto +3 -> 363
    //   363: aload 13
    //   365: astore 14
    //   367: aload 13
    //   369: getfield 238	com/google/android/gms/internal/ads/zzrt:zzV	Z
    //   372: ifeq +64 -> 436
    //   375: aload 13
    //   377: astore 15
    //   379: aload 13
    //   381: astore 14
    //   383: aload 13
    //   385: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   388: invokevirtual 924	com/google/android/gms/internal/ads/zzrg:zzq	()Z
    //   391: ifne -295 -> 96
    //   394: aload 13
    //   396: astore 14
    //   398: aload_0
    //   399: invokespecial 943	com/google/android/gms/internal/ads/zzrt:zzV	()V
    //   402: aload 13
    //   404: astore 14
    //   406: aload 13
    //   408: iconst_0
    //   409: putfield 238	com/google/android/gms/internal/ads/zzrt:zzV	Z
    //   412: aload 13
    //   414: astore 14
    //   416: aload_0
    //   417: invokevirtual 257	com/google/android/gms/internal/ads/zzrt:zzap	()V
    //   420: aload 13
    //   422: astore 15
    //   424: aload 13
    //   426: astore 14
    //   428: aload 13
    //   430: getfield 246	com/google/android/gms/internal/ads/zzrt:zzT	Z
    //   433: ifeq +388 -> 821
    //   436: aload 13
    //   438: astore 14
    //   440: aload 13
    //   442: getfield 302	com/google/android/gms/internal/ads/zzrt:zzaf	Z
    //   445: iconst_1
    //   446: ixor
    //   447: invokestatic 922	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   450: aload 13
    //   452: astore 14
    //   454: aload_0
    //   455: invokevirtual 348	com/google/android/gms/internal/ads/zzhr:zzh	()Lcom/google/android/gms/internal/ads/zzkf;
    //   458: astore 15
    //   460: aload 13
    //   462: astore 14
    //   464: aload 13
    //   466: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   469: invokevirtual 242	com/google/android/gms/internal/ads/zzhc:zzb	()V
    //   472: aload 13
    //   474: astore 14
    //   476: aload 13
    //   478: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   481: invokevirtual 242	com/google/android/gms/internal/ads/zzhc:zzb	()V
    //   484: aload 13
    //   486: astore 14
    //   488: aload 13
    //   490: aload 15
    //   492: aload 13
    //   494: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   497: iconst_0
    //   498: invokevirtual 352	com/google/android/gms/internal/ads/zzhr:zzbd	(Lcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I
    //   501: istore 5
    //   503: iload 5
    //   505: bipush -5
    //   507: if_icmpeq +212 -> 719
    //   510: iload 5
    //   512: bipush -4
    //   514: if_icmpeq +6 -> 520
    //   517: goto +214 -> 731
    //   520: aload 13
    //   522: astore 14
    //   524: aload 13
    //   526: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   529: invokevirtual 361	com/google/android/gms/internal/ads/zzhc:zzg	()Z
    //   532: ifeq +16 -> 548
    //   535: aload 13
    //   537: astore 14
    //   539: aload 13
    //   541: iconst_1
    //   542: putfield 302	com/google/android/gms/internal/ads/zzrt:zzaf	Z
    //   545: goto +186 -> 731
    //   548: aload 13
    //   550: astore 14
    //   552: aload 13
    //   554: getfield 440	com/google/android/gms/internal/ads/zzrt:zzah	Z
    //   557: ifeq +53 -> 610
    //   560: aload 13
    //   562: astore 14
    //   564: aload 13
    //   566: getfield 283	com/google/android/gms/internal/ads/zzrt:zzn	Lcom/google/android/gms/internal/ads/zzam;
    //   569: astore 16
    //   571: aload 16
    //   573: invokestatic 140	java/util/Objects:requireNonNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   576: pop
    //   577: aload 13
    //   579: astore 14
    //   581: aload 13
    //   583: aload 16
    //   585: putfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   588: aload 13
    //   590: astore 14
    //   592: aload 13
    //   594: aload 16
    //   596: aconst_null
    //   597: invokevirtual 946	com/google/android/gms/internal/ads/zzrt:zzac	(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V
    //   600: aload 13
    //   602: astore 14
    //   604: aload 13
    //   606: iconst_0
    //   607: putfield 440	com/google/android/gms/internal/ads/zzrt:zzah	Z
    //   610: aload 13
    //   612: astore 14
    //   614: aload 13
    //   616: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   619: invokevirtual 457	com/google/android/gms/internal/ads/zzhi:zzk	()V
    //   622: aload 13
    //   624: astore 14
    //   626: aload 13
    //   628: getfield 283	com/google/android/gms/internal/ads/zzrt:zzn	Lcom/google/android/gms/internal/ads/zzam;
    //   631: astore 16
    //   633: aload 16
    //   635: ifnull +51 -> 686
    //   638: aload 13
    //   640: astore 14
    //   642: aload 16
    //   644: getfield 580	com/google/android/gms/internal/ads/zzam:zzm	Ljava/lang/String;
    //   647: astore 16
    //   649: aload 16
    //   651: ifnull +35 -> 686
    //   654: aload 13
    //   656: astore 14
    //   658: aload 16
    //   660: ldc_w 948
    //   663: invokevirtual 805	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   666: ifeq +20 -> 686
    //   669: aload 13
    //   671: astore 14
    //   673: aload 13
    //   675: getfield 213	com/google/android/gms/internal/ads/zzrt:zzm	Lcom/google/android/gms/internal/ads/zzqd;
    //   678: aload 13
    //   680: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   683: invokevirtual 950	com/google/android/gms/internal/ads/zzqd:zza	(Lcom/google/android/gms/internal/ads/zzhi;)V
    //   686: aload 13
    //   688: astore 14
    //   690: aload 13
    //   692: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   695: aload 13
    //   697: getfield 155	com/google/android/gms/internal/ads/zzrt:zzh	Lcom/google/android/gms/internal/ads/zzhi;
    //   700: invokevirtual 941	com/google/android/gms/internal/ads/zzrg:zzp	(Lcom/google/android/gms/internal/ads/zzhi;)Z
    //   703: ifne -231 -> 472
    //   706: aload 13
    //   708: astore 14
    //   710: aload 13
    //   712: iconst_1
    //   713: putfield 244	com/google/android/gms/internal/ads/zzrt:zzU	Z
    //   716: goto +15 -> 731
    //   719: aload 13
    //   721: astore 14
    //   723: aload 13
    //   725: aload 15
    //   727: invokevirtual 359	com/google/android/gms/internal/ads/zzrt:zzU	(Lcom/google/android/gms/internal/ads/zzkf;)Lcom/google/android/gms/internal/ads/zzht;
    //   730: pop
    //   731: aload 13
    //   733: astore 14
    //   735: aload 13
    //   737: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   740: astore 15
    //   742: aload 13
    //   744: astore 14
    //   746: aload 15
    //   748: invokevirtual 924	com/google/android/gms/internal/ads/zzrg:zzq	()Z
    //   751: ifeq +12 -> 763
    //   754: aload 13
    //   756: astore 14
    //   758: aload 15
    //   760: invokevirtual 457	com/google/android/gms/internal/ads/zzhi:zzk	()V
    //   763: aload 13
    //   765: astore 15
    //   767: aload 13
    //   769: astore 14
    //   771: aload 13
    //   773: getfield 161	com/google/android/gms/internal/ads/zzrt:zzi	Lcom/google/android/gms/internal/ads/zzrg;
    //   776: invokevirtual 924	com/google/android/gms/internal/ads/zzrg:zzq	()Z
    //   779: ifne -683 -> 96
    //   782: aload 13
    //   784: astore 15
    //   786: aload 13
    //   788: astore 14
    //   790: aload 13
    //   792: getfield 302	com/google/android/gms/internal/ads/zzrt:zzaf	Z
    //   795: ifne -699 -> 96
    //   798: aload 13
    //   800: astore 15
    //   802: aload 13
    //   804: astore 14
    //   806: aload 13
    //   808: getfield 238	com/google/android/gms/internal/ads/zzrt:zzV	Z
    //   811: ifeq +10 -> 821
    //   814: aload 13
    //   816: astore 15
    //   818: goto -722 -> 96
    //   821: aload 15
    //   823: astore 14
    //   825: invokestatic 622	android/os/Trace:endSection	()V
    //   828: aload 15
    //   830: astore 14
    //   832: goto +1444 -> 2276
    //   835: aload 13
    //   837: astore 14
    //   839: aload 13
    //   841: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   844: astore 15
    //   846: aload 15
    //   848: ifnull +1382 -> 2230
    //   851: aload 13
    //   853: astore 14
    //   855: invokestatic 492	android/os/SystemClock:elapsedRealtime	()J
    //   858: lstore 9
    //   860: aload 13
    //   862: astore 14
    //   864: getstatic 496	com/google/android/gms/internal/ads/zzfn:zza	I
    //   867: istore 5
    //   869: aload 13
    //   871: astore 14
    //   873: ldc_w 952
    //   876: invokestatic 574	android/os/Trace:beginSection	(Ljava/lang/String;)V
    //   879: aload 13
    //   881: astore 14
    //   883: aload_0
    //   884: invokespecial 954	com/google/android/gms/internal/ads/zzrt:zzaH	()Z
    //   887: istore 7
    //   889: iload 7
    //   891: ifne +872 -> 1763
    //   894: aload 13
    //   896: astore 14
    //   898: aload 13
    //   900: getfield 856	com/google/android/gms/internal/ads/zzrt:zzH	Z
    //   903: ifeq +79 -> 982
    //   906: aload 13
    //   908: astore 14
    //   910: aload 13
    //   912: getfield 314	com/google/android/gms/internal/ads/zzrt:zzab	Z
    //   915: istore 7
    //   917: iload 7
    //   919: ifeq +63 -> 982
    //   922: aload 13
    //   924: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   927: aload 13
    //   929: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   932: invokeinterface 957 2 0
    //   937: istore 5
    //   939: goto +64 -> 1003
    //   942: astore 14
    //   944: aload 13
    //   946: astore 14
    //   948: aload_0
    //   949: invokespecial 363	com/google/android/gms/internal/ads/zzrt:zzaA	()V
    //   952: aload 13
    //   954: astore 14
    //   956: aload 13
    //   958: getfield 261	com/google/android/gms/internal/ads/zzrt:zzag	Z
    //   961: ifeq +11 -> 972
    //   964: aload 13
    //   966: astore 14
    //   968: aload_0
    //   969: invokevirtual 254	com/google/android/gms/internal/ads/zzrt:zzas	()V
    //   972: lload 9
    //   974: lstore_1
    //   975: aload 13
    //   977: astore 14
    //   979: goto +1176 -> 2155
    //   982: aload 13
    //   984: astore 14
    //   986: aload 13
    //   988: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   991: aload 13
    //   993: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   996: invokeinterface 957 2 0
    //   1001: istore 5
    //   1003: iload 5
    //   1005: ifge +167 -> 1172
    //   1008: iload 5
    //   1010: bipush -2
    //   1012: if_icmpne +112 -> 1124
    //   1015: aload 13
    //   1017: astore 14
    //   1019: aload 13
    //   1021: iconst_1
    //   1022: putfield 959	com/google/android/gms/internal/ads/zzrt:zzac	Z
    //   1025: aload 13
    //   1027: astore 14
    //   1029: aload 13
    //   1031: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   1034: invokeinterface 962 1 0
    //   1039: astore 15
    //   1041: aload 13
    //   1043: astore 14
    //   1045: aload 13
    //   1047: getfield 218	com/google/android/gms/internal/ads/zzrt:zzC	I
    //   1050: ifeq +50 -> 1100
    //   1053: aload 13
    //   1055: astore 14
    //   1057: aload 15
    //   1059: ldc_w 964
    //   1062: invokevirtual 969	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   1065: bipush 32
    //   1067: if_icmpne +33 -> 1100
    //   1070: aload 13
    //   1072: astore 14
    //   1074: aload 15
    //   1076: ldc_w 971
    //   1079: invokevirtual 969	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   1082: bipush 32
    //   1084: if_icmpne +16 -> 1100
    //   1087: aload 13
    //   1089: astore 14
    //   1091: aload 13
    //   1093: iconst_1
    //   1094: putfield 973	com/google/android/gms/internal/ads/zzrt:zzK	Z
    //   1097: goto +114 -> 1211
    //   1100: aload 13
    //   1102: astore 14
    //   1104: aload 13
    //   1106: aload 15
    //   1108: putfield 975	com/google/android/gms/internal/ads/zzrt:zzw	Landroid/media/MediaFormat;
    //   1111: aload 13
    //   1113: astore 14
    //   1115: aload 13
    //   1117: iconst_1
    //   1118: putfield 977	com/google/android/gms/internal/ads/zzrt:zzx	Z
    //   1121: goto +90 -> 1211
    //   1124: aload 13
    //   1126: astore 14
    //   1128: aload 13
    //   1130: getfield 312	com/google/android/gms/internal/ads/zzrt:zzL	Z
    //   1133: ifeq -161 -> 972
    //   1136: aload 13
    //   1138: astore 14
    //   1140: aload 13
    //   1142: getfield 302	com/google/android/gms/internal/ads/zzrt:zzaf	Z
    //   1145: ifne +16 -> 1161
    //   1148: aload 13
    //   1150: astore 14
    //   1152: aload 13
    //   1154: getfield 234	com/google/android/gms/internal/ads/zzrt:zzY	I
    //   1157: iconst_2
    //   1158: if_icmpne -186 -> 972
    //   1161: aload 13
    //   1163: astore 14
    //   1165: aload_0
    //   1166: invokespecial 363	com/google/android/gms/internal/ads/zzrt:zzaA	()V
    //   1169: goto -197 -> 972
    //   1172: aload 13
    //   1174: astore 14
    //   1176: aload 13
    //   1178: getfield 973	com/google/android/gms/internal/ads/zzrt:zzK	Z
    //   1181: ifeq +41 -> 1222
    //   1184: aload 13
    //   1186: astore 14
    //   1188: aload 13
    //   1190: iconst_0
    //   1191: putfield 973	com/google/android/gms/internal/ads/zzrt:zzK	Z
    //   1194: aload 13
    //   1196: astore 14
    //   1198: aload 13
    //   1200: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   1203: iload 5
    //   1205: iconst_0
    //   1206: invokeinterface 979 3 0
    //   1211: lload 9
    //   1213: lstore 11
    //   1215: aload 13
    //   1217: astore 14
    //   1219: goto +901 -> 2120
    //   1222: aload 13
    //   1224: astore 14
    //   1226: aload 13
    //   1228: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1231: getfield 981	android/media/MediaCodec$BufferInfo:size	I
    //   1234: ifne +31 -> 1265
    //   1237: aload 13
    //   1239: astore 14
    //   1241: aload 13
    //   1243: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1246: getfield 984	android/media/MediaCodec$BufferInfo:flags	I
    //   1249: iconst_4
    //   1250: iand
    //   1251: ifeq +14 -> 1265
    //   1254: aload 13
    //   1256: astore 14
    //   1258: aload_0
    //   1259: invokespecial 363	com/google/android/gms/internal/ads/zzrt:zzaA	()V
    //   1262: goto -290 -> 972
    //   1265: aload 13
    //   1267: astore 14
    //   1269: aload 13
    //   1271: iload 5
    //   1273: putfield 224	com/google/android/gms/internal/ads/zzrt:zzP	I
    //   1276: aload 13
    //   1278: astore 14
    //   1280: aload 13
    //   1282: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   1285: iload 5
    //   1287: invokeinterface 986 2 0
    //   1292: astore 15
    //   1294: aload 13
    //   1296: astore 14
    //   1298: aload 13
    //   1300: aload 15
    //   1302: putfield 273	com/google/android/gms/internal/ads/zzrt:zzQ	Ljava/nio/ByteBuffer;
    //   1305: aload 15
    //   1307: ifnull +51 -> 1358
    //   1310: aload 13
    //   1312: astore 14
    //   1314: aload 15
    //   1316: aload 13
    //   1318: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1321: getfield 989	android/media/MediaCodec$BufferInfo:offset	I
    //   1324: invokevirtual 398	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   1327: pop
    //   1328: aload 13
    //   1330: astore 14
    //   1332: aload 13
    //   1334: getfield 273	com/google/android/gms/internal/ads/zzrt:zzQ	Ljava/nio/ByteBuffer;
    //   1337: aload 13
    //   1339: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1342: getfield 989	android/media/MediaCodec$BufferInfo:offset	I
    //   1345: aload 13
    //   1347: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1350: getfield 981	android/media/MediaCodec$BufferInfo:size	I
    //   1353: iadd
    //   1354: invokevirtual 401	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   1357: pop
    //   1358: aload 13
    //   1360: astore 14
    //   1362: aload 13
    //   1364: getfield 875	com/google/android/gms/internal/ads/zzrt:zzI	Z
    //   1367: ifeq +71 -> 1438
    //   1370: aload 13
    //   1372: astore 14
    //   1374: aload 13
    //   1376: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1379: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1382: lconst_0
    //   1383: lcmp
    //   1384: ifne +54 -> 1438
    //   1387: aload 13
    //   1389: astore 14
    //   1391: aload 13
    //   1393: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1396: getfield 984	android/media/MediaCodec$BufferInfo:flags	I
    //   1399: iconst_4
    //   1400: iand
    //   1401: ifeq +37 -> 1438
    //   1404: aload 13
    //   1406: astore 14
    //   1408: aload 13
    //   1410: getfield 228	com/google/android/gms/internal/ads/zzrt:zzad	J
    //   1413: lstore 11
    //   1415: lload 11
    //   1417: ldc2_w 176
    //   1420: lcmp
    //   1421: ifeq +17 -> 1438
    //   1424: aload 13
    //   1426: astore 14
    //   1428: aload 13
    //   1430: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1433: lload 11
    //   1435: putfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1438: aload 13
    //   1440: astore 14
    //   1442: aload 13
    //   1444: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1447: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1450: lstore 11
    //   1452: aload 13
    //   1454: astore 14
    //   1456: aload 13
    //   1458: getfield 166	com/google/android/gms/internal/ads/zzrt:zzj	Ljava/util/ArrayList;
    //   1461: invokevirtual 993	java/util/ArrayList:size	()I
    //   1464: istore 6
    //   1466: iconst_0
    //   1467: istore 5
    //   1469: iload 5
    //   1471: iload 6
    //   1473: if_icmpge +56 -> 1529
    //   1476: aload 13
    //   1478: astore 14
    //   1480: aload 13
    //   1482: getfield 166	com/google/android/gms/internal/ads/zzrt:zzj	Ljava/util/ArrayList;
    //   1485: iload 5
    //   1487: invokevirtual 994	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   1490: checkcast 430	java/lang/Long
    //   1493: invokevirtual 997	java/lang/Long:longValue	()J
    //   1496: lload 11
    //   1498: lcmp
    //   1499: ifne +24 -> 1523
    //   1502: aload 13
    //   1504: astore 14
    //   1506: aload 13
    //   1508: getfield 166	com/google/android/gms/internal/ads/zzrt:zzj	Ljava/util/ArrayList;
    //   1511: iload 5
    //   1513: invokevirtual 1000	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   1516: pop
    //   1517: iconst_1
    //   1518: istore 7
    //   1520: goto +12 -> 1532
    //   1523: iinc 5 1
    //   1526: goto -57 -> 1469
    //   1529: iconst_0
    //   1530: istore 7
    //   1532: aload 13
    //   1534: astore 14
    //   1536: aload 13
    //   1538: iload 7
    //   1540: putfield 1002	com/google/android/gms/internal/ads/zzrt:zzR	Z
    //   1543: aload 13
    //   1545: astore 14
    //   1547: aload 13
    //   1549: getfield 230	com/google/android/gms/internal/ads/zzrt:zzae	J
    //   1552: aload 13
    //   1554: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1557: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1560: lcmp
    //   1561: ifne +9 -> 1570
    //   1564: iconst_1
    //   1565: istore 7
    //   1567: goto +6 -> 1573
    //   1570: iconst_0
    //   1571: istore 7
    //   1573: aload 13
    //   1575: astore 14
    //   1577: aload 13
    //   1579: iload 7
    //   1581: putfield 1004	com/google/android/gms/internal/ads/zzrt:zzS	Z
    //   1584: aload 13
    //   1586: astore 14
    //   1588: aload 13
    //   1590: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1593: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1596: lstore 11
    //   1598: aload 13
    //   1600: astore 14
    //   1602: aload 13
    //   1604: getfield 275	com/google/android/gms/internal/ads/zzrt:zzai	Lcom/google/android/gms/internal/ads/zzrs;
    //   1607: getfield 450	com/google/android/gms/internal/ads/zzrs:zzd	Lcom/google/android/gms/internal/ads/zzfk;
    //   1610: lload 11
    //   1612: invokevirtual 1007	com/google/android/gms/internal/ads/zzfk:zzc	(J)Ljava/lang/Object;
    //   1615: checkcast 329	com/google/android/gms/internal/ads/zzam
    //   1618: astore 16
    //   1620: aload 16
    //   1622: astore 15
    //   1624: aload 16
    //   1626: ifnonnull +55 -> 1681
    //   1629: aload 16
    //   1631: astore 15
    //   1633: aload 13
    //   1635: astore 14
    //   1637: aload 13
    //   1639: getfield 279	com/google/android/gms/internal/ads/zzrt:zzak	Z
    //   1642: ifeq +39 -> 1681
    //   1645: aload 16
    //   1647: astore 15
    //   1649: aload 13
    //   1651: astore 14
    //   1653: aload 13
    //   1655: getfield 975	com/google/android/gms/internal/ads/zzrt:zzw	Landroid/media/MediaFormat;
    //   1658: ifnull +23 -> 1681
    //   1661: aload 13
    //   1663: astore 14
    //   1665: aload 13
    //   1667: getfield 275	com/google/android/gms/internal/ads/zzrt:zzai	Lcom/google/android/gms/internal/ads/zzrs;
    //   1670: getfield 450	com/google/android/gms/internal/ads/zzrs:zzd	Lcom/google/android/gms/internal/ads/zzfk;
    //   1673: invokevirtual 1009	com/google/android/gms/internal/ads/zzfk:zzb	()Ljava/lang/Object;
    //   1676: checkcast 329	com/google/android/gms/internal/ads/zzam
    //   1679: astore 15
    //   1681: aload 15
    //   1683: ifnull +17 -> 1700
    //   1686: aload 13
    //   1688: astore 14
    //   1690: aload 13
    //   1692: aload 15
    //   1694: putfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   1697: goto +27 -> 1724
    //   1700: aload 13
    //   1702: astore 14
    //   1704: aload 13
    //   1706: getfield 977	com/google/android/gms/internal/ads/zzrt:zzx	Z
    //   1709: ifeq +54 -> 1763
    //   1712: aload 13
    //   1714: astore 14
    //   1716: aload 13
    //   1718: getfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   1721: ifnull +42 -> 1763
    //   1724: aload 13
    //   1726: astore 14
    //   1728: aload 13
    //   1730: aload 13
    //   1732: getfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   1735: aload 13
    //   1737: getfield 975	com/google/android/gms/internal/ads/zzrt:zzw	Landroid/media/MediaFormat;
    //   1740: invokevirtual 946	com/google/android/gms/internal/ads/zzrt:zzac	(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V
    //   1743: aload 13
    //   1745: astore 14
    //   1747: aload 13
    //   1749: iconst_0
    //   1750: putfield 977	com/google/android/gms/internal/ads/zzrt:zzx	Z
    //   1753: aload 13
    //   1755: astore 14
    //   1757: aload 13
    //   1759: iconst_0
    //   1760: putfield 279	com/google/android/gms/internal/ads/zzrt:zzak	Z
    //   1763: aload 13
    //   1765: astore 14
    //   1767: aload 13
    //   1769: getfield 856	com/google/android/gms/internal/ads/zzrt:zzH	Z
    //   1772: istore 7
    //   1774: iload 7
    //   1776: ifeq +156 -> 1932
    //   1779: aload 13
    //   1781: getfield 314	com/google/android/gms/internal/ads/zzrt:zzab	Z
    //   1784: istore 7
    //   1786: iload 7
    //   1788: ifeq +144 -> 1932
    //   1791: aload 13
    //   1793: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   1796: astore 15
    //   1798: aload 13
    //   1800: getfield 273	com/google/android/gms/internal/ads/zzrt:zzQ	Ljava/nio/ByteBuffer;
    //   1803: astore 14
    //   1805: aload 13
    //   1807: getfield 224	com/google/android/gms/internal/ads/zzrt:zzP	I
    //   1810: istore 5
    //   1812: aload 13
    //   1814: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1817: getfield 984	android/media/MediaCodec$BufferInfo:flags	I
    //   1820: istore 6
    //   1822: aload 13
    //   1824: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1827: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1830: lstore 11
    //   1832: aload 13
    //   1834: getfield 1002	com/google/android/gms/internal/ads/zzrt:zzR	Z
    //   1837: istore 8
    //   1839: aload 13
    //   1841: getfield 1004	com/google/android/gms/internal/ads/zzrt:zzS	Z
    //   1844: istore 7
    //   1846: aload 13
    //   1848: getfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   1851: astore 13
    //   1853: aload_0
    //   1854: lload_1
    //   1855: lload_3
    //   1856: aload 15
    //   1858: aload 14
    //   1860: iload 5
    //   1862: iload 6
    //   1864: iconst_1
    //   1865: lload 11
    //   1867: iload 8
    //   1869: iload 7
    //   1871: aload 13
    //   1873: invokevirtual 932	com/google/android/gms/internal/ads/zzrt:zzah	(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z
    //   1876: istore 7
    //   1878: goto +173 -> 2051
    //   1881: astore 13
    //   1883: aload_0
    //   1884: invokespecial 363	com/google/android/gms/internal/ads/zzrt:zzaA	()V
    //   1887: aload_0
    //   1888: astore 13
    //   1890: aload 13
    //   1892: astore 14
    //   1894: aload 13
    //   1896: getfield 261	com/google/android/gms/internal/ads/zzrt:zzag	Z
    //   1899: ifeq +11 -> 1910
    //   1902: aload 13
    //   1904: astore 14
    //   1906: aload_0
    //   1907: invokevirtual 254	com/google/android/gms/internal/ads/zzrt:zzas	()V
    //   1910: aload_0
    //   1911: astore 14
    //   1913: lload 9
    //   1915: lstore_1
    //   1916: goto +239 -> 2155
    //   1919: astore 13
    //   1921: aload_0
    //   1922: astore 14
    //   1924: goto +389 -> 2313
    //   1927: astore 14
    //   1929: goto +281 -> 2210
    //   1932: aload 13
    //   1934: astore 14
    //   1936: aload 13
    //   1938: getfield 300	com/google/android/gms/internal/ads/zzrt:zzu	Lcom/google/android/gms/internal/ads/zzrm;
    //   1941: astore 15
    //   1943: aload 13
    //   1945: astore 14
    //   1947: aload 13
    //   1949: getfield 273	com/google/android/gms/internal/ads/zzrt:zzQ	Ljava/nio/ByteBuffer;
    //   1952: astore 16
    //   1954: aload 13
    //   1956: astore 14
    //   1958: aload 13
    //   1960: getfield 224	com/google/android/gms/internal/ads/zzrt:zzP	I
    //   1963: istore 6
    //   1965: aload 13
    //   1967: astore 14
    //   1969: aload 13
    //   1971: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1974: getfield 984	android/media/MediaCodec$BufferInfo:flags	I
    //   1977: istore 5
    //   1979: aload 13
    //   1981: astore 14
    //   1983: aload 13
    //   1985: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   1988: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   1991: lstore 11
    //   1993: aload 13
    //   1995: astore 14
    //   1997: aload 13
    //   1999: getfield 1002	com/google/android/gms/internal/ads/zzrt:zzR	Z
    //   2002: istore 7
    //   2004: aload 13
    //   2006: astore 14
    //   2008: aload 13
    //   2010: getfield 1004	com/google/android/gms/internal/ads/zzrt:zzS	Z
    //   2013: istore 8
    //   2015: aload 13
    //   2017: astore 14
    //   2019: aload 13
    //   2021: getfield 929	com/google/android/gms/internal/ads/zzrt:zzo	Lcom/google/android/gms/internal/ads/zzam;
    //   2024: astore 13
    //   2026: aload_0
    //   2027: lload_1
    //   2028: lload_3
    //   2029: aload 15
    //   2031: aload 16
    //   2033: iload 6
    //   2035: iload 5
    //   2037: iconst_1
    //   2038: lload 11
    //   2040: iload 7
    //   2042: iload 8
    //   2044: aload 13
    //   2046: invokevirtual 932	com/google/android/gms/internal/ads/zzrt:zzah	(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z
    //   2049: istore 7
    //   2051: iload 7
    //   2053: ifeq +99 -> 2152
    //   2056: aload_0
    //   2057: astore 14
    //   2059: aload 14
    //   2061: astore 13
    //   2063: aload 14
    //   2065: aload 14
    //   2067: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   2070: getfield 992	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   2073: invokevirtual 938	com/google/android/gms/internal/ads/zzrt:zzaq	(J)V
    //   2076: aload 14
    //   2078: astore 13
    //   2080: aload 14
    //   2082: getfield 171	com/google/android/gms/internal/ads/zzrt:zzk	Landroid/media/MediaCodec$BufferInfo;
    //   2085: getfield 984	android/media/MediaCodec$BufferInfo:flags	I
    //   2088: istore 5
    //   2090: aload 14
    //   2092: astore 13
    //   2094: aload_0
    //   2095: invokespecial 1011	com/google/android/gms/internal/ads/zzrt:zzaC	()V
    //   2098: iload 5
    //   2100: iconst_4
    //   2101: iand
    //   2102: ifeq +14 -> 2116
    //   2105: aload 14
    //   2107: astore 13
    //   2109: aload_0
    //   2110: invokespecial 363	com/google/android/gms/internal/ads/zzrt:zzaA	()V
    //   2113: goto -203 -> 1910
    //   2116: lload 9
    //   2118: lstore 11
    //   2120: lload 9
    //   2122: lstore 11
    //   2124: aload 14
    //   2126: astore 13
    //   2128: aload 14
    //   2130: lload 11
    //   2132: invokespecial 1013	com/google/android/gms/internal/ads/zzrt:zzaJ	(J)Z
    //   2135: ifne +6 -> 2141
    //   2138: goto +17 -> 2155
    //   2141: aload 14
    //   2143: astore 13
    //   2145: lload 11
    //   2147: lstore 9
    //   2149: goto -1270 -> 879
    //   2152: goto -242 -> 1910
    //   2155: lload 9
    //   2157: lstore_1
    //   2158: aload 14
    //   2160: astore 13
    //   2162: aload_0
    //   2163: invokespecial 1015	com/google/android/gms/internal/ads/zzrt:zzaG	()Z
    //   2166: ifeq +16 -> 2182
    //   2169: aload 14
    //   2171: astore 13
    //   2173: aload 14
    //   2175: lload_1
    //   2176: invokespecial 1013	com/google/android/gms/internal/ads/zzrt:zzaJ	(J)Z
    //   2179: ifne -24 -> 2155
    //   2182: aload 14
    //   2184: astore 13
    //   2186: invokestatic 622	android/os/Trace:endSection	()V
    //   2189: goto +87 -> 2276
    //   2192: astore 13
    //   2194: aload_0
    //   2195: astore 14
    //   2197: goto +111 -> 2308
    //   2200: astore 15
    //   2202: aload 14
    //   2204: astore 13
    //   2206: aload 15
    //   2208: astore 14
    //   2210: aload 13
    //   2212: astore 15
    //   2214: aload 14
    //   2216: astore 13
    //   2218: aload 15
    //   2220: astore 14
    //   2222: goto +86 -> 2308
    //   2225: astore 13
    //   2227: goto +81 -> 2308
    //   2230: aload 13
    //   2232: astore 14
    //   2234: aload 14
    //   2236: astore 13
    //   2238: aload 14
    //   2240: getfield 472	com/google/android/gms/internal/ads/zzrt:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   2243: astore 15
    //   2245: aload 14
    //   2247: astore 13
    //   2249: aload 15
    //   2251: aload 15
    //   2253: getfield 1017	com/google/android/gms/internal/ads/zzhs:zzd	I
    //   2256: aload_0
    //   2257: lload_1
    //   2258: invokevirtual 1020	com/google/android/gms/internal/ads/zzhr:zzd	(J)I
    //   2261: iadd
    //   2262: putfield 1017	com/google/android/gms/internal/ads/zzhs:zzd	I
    //   2265: aload 14
    //   2267: astore 15
    //   2269: aload 14
    //   2271: iconst_1
    //   2272: invokespecial 483	com/google/android/gms/internal/ads/zzrt:zzaI	(I)Z
    //   2275: pop
    //   2276: aload 14
    //   2278: astore 15
    //   2280: aload 14
    //   2282: getfield 472	com/google/android/gms/internal/ads/zzrt:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   2285: invokevirtual 1022	com/google/android/gms/internal/ads/zzhs:zza	()V
    //   2288: return
    //   2289: astore 13
    //   2291: aload 15
    //   2293: astore 14
    //   2295: goto +18 -> 2313
    //   2298: astore 15
    //   2300: aload 13
    //   2302: astore 14
    //   2304: aload 15
    //   2306: astore 13
    //   2308: goto +5 -> 2313
    //   2311: astore 13
    //   2313: getstatic 496	com/google/android/gms/internal/ads/zzfn:zza	I
    //   2316: bipush 21
    //   2318: if_icmplt +14 -> 2332
    //   2321: aload 13
    //   2323: instanceof 1024
    //   2326: ifeq +6 -> 2332
    //   2329: goto +32 -> 2361
    //   2332: aload 13
    //   2334: invokevirtual 1028	java/lang/IllegalStateException:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   2337: astore 15
    //   2339: aload 15
    //   2341: arraylength
    //   2342: ifle +99 -> 2441
    //   2345: aload 15
    //   2347: iconst_0
    //   2348: aaload
    //   2349: invokevirtual 1033	java/lang/StackTraceElement:getClassName	()Ljava/lang/String;
    //   2352: ldc_w 1035
    //   2355: invokevirtual 805	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2358: ifeq +83 -> 2441
    //   2361: aload 14
    //   2363: aload 13
    //   2365: invokevirtual 479	com/google/android/gms/internal/ads/zzrt:zzZ	(Ljava/lang/Exception;)V
    //   2368: getstatic 496	com/google/android/gms/internal/ads/zzfn:zza	I
    //   2371: bipush 21
    //   2373: if_icmplt +28 -> 2401
    //   2376: aload 13
    //   2378: instanceof 1024
    //   2381: ifeq +20 -> 2401
    //   2384: aload 13
    //   2386: checkcast 1024	android/media/MediaCodec$CodecException
    //   2389: invokevirtual 1038	android/media/MediaCodec$CodecException:isRecoverable	()Z
    //   2392: ifeq +9 -> 2401
    //   2395: iconst_1
    //   2396: istore 7
    //   2398: goto +6 -> 2404
    //   2401: iconst_0
    //   2402: istore 7
    //   2404: iload 7
    //   2406: ifeq +7 -> 2413
    //   2409: aload_0
    //   2410: invokevirtual 254	com/google/android/gms/internal/ads/zzrt:zzas	()V
    //   2413: aload 14
    //   2415: aload 14
    //   2417: aload 13
    //   2419: aload 14
    //   2421: getfield 802	com/google/android/gms/internal/ads/zzrt:zzB	Lcom/google/android/gms/internal/ads/zzrp;
    //   2424: invokevirtual 1041	com/google/android/gms/internal/ads/zzrt:zzam	(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzrp;)Lcom/google/android/gms/internal/ads/zzrn;
    //   2427: aload 14
    //   2429: getfield 283	com/google/android/gms/internal/ads/zzrt:zzn	Lcom/google/android/gms/internal/ads/zzam;
    //   2432: iload 7
    //   2434: sipush 4003
    //   2437: invokevirtual 287	com/google/android/gms/internal/ads/zzhr:zzbe	(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;
    //   2440: athrow
    //   2441: aload 13
    //   2443: athrow
    //   2444: astore 13
    //   2446: goto -563 -> 1883
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2449	0	this	zzrt
    //   0	2449	1	paramLong1	long
    //   0	2449	3	paramLong2	long
    //   80	2022	5	i	int
    //   168	1866	6	j	int
    //   190	2243	7	bool1	boolean
    //   201	1842	8	bool2	boolean
    //   179	1977	9	l1	long
    //   1213	933	11	l2	long
    //   1	267	13	localObject1	Object
    //   284	1563	13	localIllegalStateException1	IllegalStateException
    //   1851	21	13	localzzam	zzam
    //   1881	1	13	localIllegalStateException2	IllegalStateException
    //   1888	15	13	localzzrt	zzrt
    //   1919	101	13	localIllegalStateException3	IllegalStateException
    //   2024	161	13	localObject2	Object
    //   2192	1	13	localIllegalStateException4	IllegalStateException
    //   2204	13	13	localObject3	Object
    //   2225	6	13	localIllegalStateException5	IllegalStateException
    //   2236	12	13	localObject4	Object
    //   2289	12	13	localIllegalStateException6	IllegalStateException
    //   2306	1	13	localObject5	Object
    //   2311	131	13	localIllegalStateException7	IllegalStateException
    //   2444	1	13	localIllegalStateException8	IllegalStateException
    //   5	904	14	localObject6	Object
    //   942	1	14	localIllegalStateException9	IllegalStateException
    //   946	977	14	localObject7	Object
    //   1927	1	14	localIllegalStateException10	IllegalStateException
    //   1934	494	14	localObject8	Object
    //   94	1936	15	localObject9	Object
    //   2200	7	15	localIllegalStateException11	IllegalStateException
    //   2212	80	15	localObject10	Object
    //   2298	7	15	localIllegalStateException12	IllegalStateException
    //   2337	9	15	arrayOfStackTraceElement	StackTraceElement[]
    //   119	1913	16	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   214	238	284	java/lang/IllegalStateException
    //   922	939	942	java/lang/IllegalStateException
    //   1791	1853	1881	java/lang/IllegalStateException
    //   1883	1887	1919	java/lang/IllegalStateException
    //   1779	1786	1927	java/lang/IllegalStateException
    //   2026	2051	2192	java/lang/IllegalStateException
    //   1894	1902	2200	java/lang/IllegalStateException
    //   1906	1910	2200	java/lang/IllegalStateException
    //   1936	1943	2200	java/lang/IllegalStateException
    //   1947	1954	2200	java/lang/IllegalStateException
    //   1958	1965	2200	java/lang/IllegalStateException
    //   1969	1979	2200	java/lang/IllegalStateException
    //   1983	1993	2200	java/lang/IllegalStateException
    //   1997	2004	2200	java/lang/IllegalStateException
    //   2008	2015	2200	java/lang/IllegalStateException
    //   2019	2026	2200	java/lang/IllegalStateException
    //   855	860	2225	java/lang/IllegalStateException
    //   864	869	2225	java/lang/IllegalStateException
    //   873	879	2225	java/lang/IllegalStateException
    //   883	889	2225	java/lang/IllegalStateException
    //   1767	1774	2225	java/lang/IllegalStateException
    //   2269	2276	2289	java/lang/IllegalStateException
    //   2280	2288	2289	java/lang/IllegalStateException
    //   2063	2076	2298	java/lang/IllegalStateException
    //   2080	2090	2298	java/lang/IllegalStateException
    //   2094	2098	2298	java/lang/IllegalStateException
    //   2109	2113	2298	java/lang/IllegalStateException
    //   2128	2138	2298	java/lang/IllegalStateException
    //   2162	2169	2298	java/lang/IllegalStateException
    //   2173	2182	2298	java/lang/IllegalStateException
    //   2186	2189	2298	java/lang/IllegalStateException
    //   2238	2245	2298	java/lang/IllegalStateException
    //   2249	2265	2298	java/lang/IllegalStateException
    //   7	15	2311	java/lang/IllegalStateException
    //   19	23	2311	java/lang/IllegalStateException
    //   28	36	2311	java/lang/IllegalStateException
    //   40	49	2311	java/lang/IllegalStateException
    //   57	61	2311	java/lang/IllegalStateException
    //   65	73	2311	java/lang/IllegalStateException
    //   77	82	2311	java/lang/IllegalStateException
    //   86	92	2311	java/lang/IllegalStateException
    //   100	110	2311	java/lang/IllegalStateException
    //   114	121	2311	java/lang/IllegalStateException
    //   129	137	2311	java/lang/IllegalStateException
    //   141	148	2311	java/lang/IllegalStateException
    //   152	159	2311	java/lang/IllegalStateException
    //   163	170	2311	java/lang/IllegalStateException
    //   174	181	2311	java/lang/IllegalStateException
    //   185	192	2311	java/lang/IllegalStateException
    //   196	203	2311	java/lang/IllegalStateException
    //   207	214	2311	java/lang/IllegalStateException
    //   250	263	2311	java/lang/IllegalStateException
    //   267	275	2311	java/lang/IllegalStateException
    //   293	301	2311	java/lang/IllegalStateException
    //   305	311	2311	java/lang/IllegalStateException
    //   322	330	2311	java/lang/IllegalStateException
    //   334	350	2311	java/lang/IllegalStateException
    //   354	360	2311	java/lang/IllegalStateException
    //   367	375	2311	java/lang/IllegalStateException
    //   383	394	2311	java/lang/IllegalStateException
    //   398	402	2311	java/lang/IllegalStateException
    //   406	412	2311	java/lang/IllegalStateException
    //   416	420	2311	java/lang/IllegalStateException
    //   428	436	2311	java/lang/IllegalStateException
    //   440	450	2311	java/lang/IllegalStateException
    //   454	460	2311	java/lang/IllegalStateException
    //   464	472	2311	java/lang/IllegalStateException
    //   476	484	2311	java/lang/IllegalStateException
    //   488	503	2311	java/lang/IllegalStateException
    //   524	535	2311	java/lang/IllegalStateException
    //   539	545	2311	java/lang/IllegalStateException
    //   552	560	2311	java/lang/IllegalStateException
    //   564	571	2311	java/lang/IllegalStateException
    //   581	588	2311	java/lang/IllegalStateException
    //   592	600	2311	java/lang/IllegalStateException
    //   604	610	2311	java/lang/IllegalStateException
    //   614	622	2311	java/lang/IllegalStateException
    //   626	633	2311	java/lang/IllegalStateException
    //   642	649	2311	java/lang/IllegalStateException
    //   658	669	2311	java/lang/IllegalStateException
    //   673	686	2311	java/lang/IllegalStateException
    //   690	706	2311	java/lang/IllegalStateException
    //   710	716	2311	java/lang/IllegalStateException
    //   723	731	2311	java/lang/IllegalStateException
    //   735	742	2311	java/lang/IllegalStateException
    //   746	754	2311	java/lang/IllegalStateException
    //   758	763	2311	java/lang/IllegalStateException
    //   771	782	2311	java/lang/IllegalStateException
    //   790	798	2311	java/lang/IllegalStateException
    //   806	814	2311	java/lang/IllegalStateException
    //   825	828	2311	java/lang/IllegalStateException
    //   839	846	2311	java/lang/IllegalStateException
    //   898	906	2311	java/lang/IllegalStateException
    //   910	917	2311	java/lang/IllegalStateException
    //   948	952	2311	java/lang/IllegalStateException
    //   956	964	2311	java/lang/IllegalStateException
    //   968	972	2311	java/lang/IllegalStateException
    //   986	1003	2311	java/lang/IllegalStateException
    //   1019	1025	2311	java/lang/IllegalStateException
    //   1029	1041	2311	java/lang/IllegalStateException
    //   1045	1053	2311	java/lang/IllegalStateException
    //   1057	1070	2311	java/lang/IllegalStateException
    //   1074	1087	2311	java/lang/IllegalStateException
    //   1091	1097	2311	java/lang/IllegalStateException
    //   1104	1111	2311	java/lang/IllegalStateException
    //   1115	1121	2311	java/lang/IllegalStateException
    //   1128	1136	2311	java/lang/IllegalStateException
    //   1140	1148	2311	java/lang/IllegalStateException
    //   1152	1161	2311	java/lang/IllegalStateException
    //   1165	1169	2311	java/lang/IllegalStateException
    //   1176	1184	2311	java/lang/IllegalStateException
    //   1188	1194	2311	java/lang/IllegalStateException
    //   1198	1211	2311	java/lang/IllegalStateException
    //   1226	1237	2311	java/lang/IllegalStateException
    //   1241	1254	2311	java/lang/IllegalStateException
    //   1258	1262	2311	java/lang/IllegalStateException
    //   1269	1276	2311	java/lang/IllegalStateException
    //   1280	1294	2311	java/lang/IllegalStateException
    //   1298	1305	2311	java/lang/IllegalStateException
    //   1314	1328	2311	java/lang/IllegalStateException
    //   1332	1358	2311	java/lang/IllegalStateException
    //   1362	1370	2311	java/lang/IllegalStateException
    //   1374	1387	2311	java/lang/IllegalStateException
    //   1391	1404	2311	java/lang/IllegalStateException
    //   1408	1415	2311	java/lang/IllegalStateException
    //   1428	1438	2311	java/lang/IllegalStateException
    //   1442	1452	2311	java/lang/IllegalStateException
    //   1456	1466	2311	java/lang/IllegalStateException
    //   1480	1502	2311	java/lang/IllegalStateException
    //   1506	1517	2311	java/lang/IllegalStateException
    //   1536	1543	2311	java/lang/IllegalStateException
    //   1547	1564	2311	java/lang/IllegalStateException
    //   1577	1584	2311	java/lang/IllegalStateException
    //   1588	1598	2311	java/lang/IllegalStateException
    //   1602	1620	2311	java/lang/IllegalStateException
    //   1637	1645	2311	java/lang/IllegalStateException
    //   1653	1661	2311	java/lang/IllegalStateException
    //   1665	1681	2311	java/lang/IllegalStateException
    //   1690	1697	2311	java/lang/IllegalStateException
    //   1704	1712	2311	java/lang/IllegalStateException
    //   1716	1724	2311	java/lang/IllegalStateException
    //   1728	1743	2311	java/lang/IllegalStateException
    //   1747	1753	2311	java/lang/IllegalStateException
    //   1757	1763	2311	java/lang/IllegalStateException
    //   1853	1878	2444	java/lang/IllegalStateException
  }
  
  public boolean zzO()
  {
    return this.zzag;
  }
  
  public boolean zzP()
  {
    zzam localzzam = this.zzn;
    boolean bool2 = true;
    if (localzzam != null)
    {
      bool1 = bool2;
      if (zzK()) {
        return bool1;
      }
      bool1 = bool2;
      if (zzaH()) {
        return bool1;
      }
      if ((this.zzN != -9223372036854775807L) && (SystemClock.elapsedRealtime() < this.zzN)) {
        return true;
      }
    }
    boolean bool1 = false;
    return bool1;
  }
  
  public final int zzQ(zzam paramzzam)
    throws zzia
  {
    try
    {
      int i = zzS(this.zzd, paramzzam);
      return i;
    }
    catch (zzsc localzzsc)
    {
      throw zzbe(localzzsc, paramzzam, false, 4002);
    }
  }
  
  protected float zzR(float paramFloat, zzam paramzzam, zzam[] paramArrayOfzzam)
  {
    throw null;
  }
  
  protected abstract int zzS(zzrv paramzzrv, zzam paramzzam)
    throws zzsc;
  
  protected zzht zzT(zzrp paramzzrp, zzam paramzzam1, zzam paramzzam2)
  {
    throw null;
  }
  
  protected zzht zzU(zzkf paramzzkf)
    throws zzia
  {
    boolean bool2 = true;
    this.zzah = true;
    zzam localzzam1 = paramzzkf.zza;
    Objects.requireNonNull(localzzam1);
    if (localzzam1.zzm != null)
    {
      zzqs localzzqs = paramzzkf.zzb;
      this.zzam = localzzqs;
      this.zzn = localzzam1;
      if (this.zzT)
      {
        this.zzV = true;
        return null;
      }
      zzrm localzzrm = this.zzu;
      if (localzzrm == null)
      {
        this.zzz = null;
        zzap();
        return null;
      }
      paramzzkf = this.zzB;
      zzam localzzam2 = this.zzv;
      Object localObject = this.zzal;
      if (localObject == localzzqs)
      {
        if (localzzqs != localObject) {
          i = 1;
        } else {
          i = 0;
        }
        boolean bool1;
        if ((i != 0) && (zzfn.zza < 23)) {
          bool1 = false;
        } else {
          bool1 = true;
        }
        zzdy.zzf(bool1);
        localObject = zzT(paramzzkf, localzzam2, localzzam1);
        int k = ((zzht)localObject).zzd;
        int j = 2;
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (zzaK(localzzam1))
              {
                this.zzv = localzzam1;
                if ((i == 0) || (zzaF())) {
                  break label416;
                }
                i = j;
                break label418;
              }
            }
            else if (zzaK(localzzam1))
            {
              this.zzW = true;
              this.zzX = 1;
              k = this.zzC;
              bool1 = bool2;
              if (k != 2) {
                if ((k == 1) && (localzzam1.zzr == localzzam2.zzr) && (localzzam1.zzs == localzzam2.zzs)) {
                  bool1 = bool2;
                } else {
                  bool1 = false;
                }
              }
              this.zzJ = bool1;
              this.zzv = localzzam1;
              if ((i == 0) || (zzaF())) {
                break label416;
              }
              i = j;
              break label418;
            }
          }
          else {
            if (zzaK(localzzam1)) {
              break label343;
            }
          }
          i = 16;
          break label418;
          label343:
          this.zzv = localzzam1;
          if (i != 0)
          {
            if (!zzaF())
            {
              i = j;
              break label418;
            }
          }
          else if (this.zzaa)
          {
            this.zzY = 1;
            if ((!this.zzE) && (!this.zzG))
            {
              this.zzZ = 1;
            }
            else
            {
              this.zzZ = 3;
              i = j;
              break label418;
            }
          }
        }
        else
        {
          zzW();
        }
        label416:
        int i = 0;
        label418:
        if ((((zzht)localObject).zzd != 0) && ((this.zzu != localzzrm) || (this.zzZ == 3))) {
          return new zzht(paramzzkf.zza, localzzam2, localzzam1, 0, i);
        }
        return (zzht)localObject;
      }
      if ((localzzqs != null) && (localObject != null) && (zzo.zza.equals(zzo.zza)) && (zzfn.zza >= 23) && (!zzo.zze.equals(zzo.zza))) {
        zzo.zze.equals(zzo.zza);
      }
      zzW();
      return new zzht(paramzzkf.zza, localzzam2, localzzam1, 0, 128);
    }
    throw zzbe(new IllegalArgumentException(), localzzam1, false, 4005);
  }
  
  protected abstract zzrk zzX(zzrp paramzzrp, zzam paramzzam, MediaCrypto paramMediaCrypto, float paramFloat);
  
  protected abstract List zzY(zzrv paramzzrv, zzam paramzzam, boolean paramBoolean)
    throws zzsc;
  
  protected void zzZ(Exception paramException)
  {
    throw null;
  }
  
  protected void zzaa(String paramString, zzrk paramzzrk, long paramLong1, long paramLong2)
  {
    throw null;
  }
  
  protected void zzab(String paramString)
  {
    throw null;
  }
  
  protected void zzac(zzam paramzzam, MediaFormat paramMediaFormat)
    throws zzia
  {
    throw null;
  }
  
  protected void zzae() {}
  
  protected void zzaf(zzhi paramzzhi)
    throws zzia
  {
    throw null;
  }
  
  protected void zzag()
    throws zzia
  {}
  
  protected abstract boolean zzah(long paramLong1, long paramLong2, zzrm paramzzrm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, zzam paramzzam)
    throws zzia;
  
  protected boolean zzai(zzam paramzzam)
  {
    return false;
  }
  
  protected final float zzaj()
  {
    return this.zzs;
  }
  
  protected final long zzak()
  {
    return this.zzai.zzc;
  }
  
  protected final zzrm zzal()
  {
    return this.zzu;
  }
  
  protected zzrn zzam(Throwable paramThrowable, zzrp paramzzrp)
  {
    return new zzrn(paramThrowable, paramzzrp);
  }
  
  protected final zzrp zzan()
  {
    return this.zzB;
  }
  
  protected void zzao(zzhi paramzzhi)
    throws zzia
  {}
  
  protected final void zzap()
    throws zzia
  {
    if ((this.zzu == null) && (!this.zzT))
    {
      Object localObject1 = this.zzn;
      if (localObject1 != null)
      {
        if ((this.zzam == null) && (zzai((zzam)localObject1)))
        {
          localObject1 = this.zzn;
          zzV();
          localObject1 = ((zzam)localObject1).zzm;
          if ((!"audio/mp4a-latm".equals(localObject1)) && (!"audio/mpeg".equals(localObject1)) && (!"audio/opus".equals(localObject1))) {
            this.zzi.zzo(1);
          } else {
            this.zzi.zzo(32);
          }
          this.zzT = true;
          return;
        }
        this.zzal = this.zzam;
        localObject1 = this.zzn.zzm;
        if ((this.zzal != null) && (zzqt.zza))
        {
          localObject1 = this.zzal.zza();
          throw zzbe((Throwable)localObject1, this.zzn, false, ((zzqj)localObject1).zza);
        }
        try
        {
          localObject1 = this.zzz;
          if (localObject1 == null) {
            try
            {
              localObject3 = zzY(this.zzd, this.zzn, false);
              ((List)localObject3).isEmpty();
              localObject1 = new java/util/ArrayDeque;
              ((ArrayDeque)localObject1).<init>();
              this.zzz = ((ArrayDeque)localObject1);
              if (!((List)localObject3).isEmpty()) {
                this.zzz.add((zzrp)((List)localObject3).get(0));
              }
              this.zzA = null;
            }
            catch (zzsc localzzsc)
            {
              Object localObject3 = new com/google/android/gms/internal/ads/zzrr;
              ((zzrr)localObject3).<init>(this.zzn, localzzsc, false, -49998);
              throw ((Throwable)localObject3);
            }
          }
          if (!this.zzz.isEmpty())
          {
            localObject2 = (zzrp)this.zzz.peekFirst();
            while (this.zzu == null)
            {
              Object localObject4 = (zzrp)this.zzz.peekFirst();
              boolean bool = zzax((zzrp)localObject4);
              if (!bool) {
                return;
              }
              try
              {
                zzaz((zzrp)localObject4, null);
              }
              catch (Exception localException1)
              {
                if (localObject4 == localObject2) {}
                try
                {
                  zzer.zze("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                  Thread.sleep(50L);
                  zzaz((zzrp)localObject4, null);
                }
                catch (Exception localException2)
                {
                  zzer.zzf("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(localObject4))), localException2);
                  this.zzz.removeFirst();
                  zzrr localzzrr2 = new com/google/android/gms/internal/ads/zzrr;
                  localzzrr2.<init>(this.zzn, localException2, false, (zzrp)localObject4);
                  zzZ(localzzrr2);
                  localObject4 = this.zzA;
                  if (localObject4 != null) {
                    break label433;
                  }
                  this.zzA = localzzrr2;
                  break label443;
                  this.zzA = zzrr.zza((zzrr)localObject4, localzzrr2);
                }
                throw localException1;
              }
              label433:
              label443:
              if (this.zzz.isEmpty()) {
                throw this.zzA;
              }
            }
            this.zzz = null;
            return;
          }
          Object localObject2 = new com/google/android/gms/internal/ads/zzrr;
          ((zzrr)localObject2).<init>(this.zzn, null, false, -49999);
          throw ((Throwable)localObject2);
        }
        catch (zzrr localzzrr1)
        {
          throw zzbe(localzzrr1, this.zzn, false, 4001);
        }
      }
    }
  }
  
  protected void zzaq(long paramLong)
  {
    this.zzaj = paramLong;
    while ((!this.zzl.isEmpty()) && (paramLong >= ((zzrs)this.zzl.peek()).zzb))
    {
      zzaD((zzrs)this.zzl.poll());
      zzae();
    }
  }
  
  protected void zzar(zzam paramzzam)
    throws zzia
  {}
  
  protected final void zzas()
  {
    try
    {
      Object localObject1 = this.zzu;
      if (localObject1 != null)
      {
        ((zzrm)localObject1).zzl();
        localObject1 = this.zza;
        ((zzhs)localObject1).zzb += 1;
        zzab(this.zzB.zza);
      }
      return;
    }
    finally
    {
      this.zzu = null;
      this.zzp = null;
      this.zzal = null;
      zzau();
    }
  }
  
  protected void zzat()
  {
    zzaB();
    zzaC();
    this.zzN = -9223372036854775807L;
    this.zzab = false;
    this.zzaa = false;
    this.zzJ = false;
    this.zzK = false;
    this.zzR = false;
    this.zzS = false;
    this.zzj.clear();
    this.zzad = -9223372036854775807L;
    this.zzae = -9223372036854775807L;
    this.zzaj = -9223372036854775807L;
    zzrh localzzrh = this.zzM;
    if (localzzrh != null) {
      localzzrh.zzc();
    }
    this.zzY = 0;
    this.zzZ = 0;
    this.zzX = this.zzW;
  }
  
  protected final void zzau()
  {
    zzat();
    this.zzM = null;
    this.zzz = null;
    this.zzB = null;
    this.zzv = null;
    this.zzw = null;
    this.zzx = false;
    this.zzac = false;
    this.zzy = -1.0F;
    this.zzC = 0;
    this.zzD = false;
    this.zzE = false;
    this.zzF = false;
    this.zzG = false;
    this.zzH = false;
    this.zzI = false;
    this.zzL = false;
    this.zzW = false;
    this.zzX = 0;
    this.zzq = false;
  }
  
  protected final boolean zzav()
    throws zzia
  {
    boolean bool = zzaw();
    if (bool) {
      zzap();
    }
    return bool;
  }
  
  protected final boolean zzaw()
  {
    if (this.zzu == null) {
      return false;
    }
    int i = this.zzZ;
    if ((i != 3) && (!this.zzE) && ((!this.zzF) || (this.zzac)) && ((!this.zzG) || (!this.zzab)))
    {
      if (i == 2)
      {
        boolean bool;
        if (zzfn.zza >= 23) {
          bool = true;
        } else {
          bool = false;
        }
        zzdy.zzf(bool);
        if (zzfn.zza >= 23) {
          try
          {
            zzaE();
          }
          catch (zzia localzzia)
          {
            zzer.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", localzzia);
            zzas();
            return true;
          }
        }
      }
      zzad();
      return false;
    }
    zzas();
    return true;
  }
  
  protected boolean zzax(zzrp paramzzrp)
  {
    return true;
  }
  
  public final int zze()
  {
    return 8;
  }
  
  protected void zzt()
  {
    this.zzn = null;
    zzaD(zzrs.zza);
    this.zzl.clear();
    zzaw();
  }
  
  protected void zzu(boolean paramBoolean1, boolean paramBoolean2)
    throws zzia
  {
    this.zza = new zzhs();
  }
  
  protected void zzv(long paramLong, boolean paramBoolean)
    throws zzia
  {
    this.zzaf = false;
    this.zzag = false;
    if (this.zzT)
    {
      this.zzi.zzb();
      this.zzh.zzb();
      this.zzU = false;
    }
    else
    {
      zzav();
    }
    zzfk localzzfk = this.zzai.zzd;
    if (localzzfk.zza() > 0) {
      this.zzah = true;
    }
    localzzfk.zze();
    this.zzl.clear();
  }
  
  protected void zzw()
  {
    try
    {
      zzV();
      zzas();
      return;
    }
    finally
    {
      this.zzam = null;
    }
  }
  
  protected final void zzz(zzam[] paramArrayOfzzam, long paramLong1, long paramLong2)
    throws zzia
  {
    if (this.zzai.zzc == -9223372036854775807L)
    {
      zzaD(new zzrs(-9223372036854775807L, paramLong1, paramLong2));
      return;
    }
    if (this.zzl.isEmpty())
    {
      long l2 = this.zzad;
      if (l2 != -9223372036854775807L)
      {
        long l1 = this.zzaj;
        if ((l1 == -9223372036854775807L) || (l1 < l2)) {}
      }
      else
      {
        zzaD(new zzrs(-9223372036854775807L, paramLong1, paramLong2));
        if (this.zzai.zzc != -9223372036854775807L) {
          zzae();
        }
        return;
      }
    }
    this.zzl.add(new zzrs(this.zzad, paramLong1, paramLong2));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */