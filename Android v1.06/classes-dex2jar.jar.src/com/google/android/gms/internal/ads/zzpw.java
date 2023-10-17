package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class zzpw
  implements zzoz
{
  private static final Object zza = new Object();
  private static ExecutorService zzb;
  private static int zzc;
  private long zzA;
  private long zzB;
  private long zzC;
  private long zzD;
  private int zzE;
  private boolean zzF;
  private boolean zzG;
  private long zzH;
  private float zzI;
  private ByteBuffer zzJ;
  private int zzK;
  private ByteBuffer zzL;
  private byte[] zzM;
  private int zzN;
  private boolean zzO;
  private boolean zzP;
  private boolean zzQ;
  private boolean zzR;
  private int zzS;
  private zzl zzT;
  private zzpi zzU;
  private long zzV;
  private boolean zzW;
  private boolean zzX;
  private final zzpm zzY;
  private final zzpe zzd;
  private final zzqg zze;
  private final zzfrr zzf;
  private final zzfrr zzg;
  private final zzeb zzh;
  private final zzpd zzi;
  private final ArrayDeque zzj;
  private zzpu zzk;
  private final zzpp zzl;
  private final zzpp zzm;
  private final zzpj zzn;
  private zzof zzo;
  private zzow zzp;
  private zzpl zzq;
  private zzpl zzr;
  private zzdo zzs;
  private AudioTrack zzt;
  private zzoh zzu;
  private zzk zzv;
  private zzpo zzw;
  private zzpo zzx;
  private zzci zzy;
  private boolean zzz;
  
  private final long zzF()
  {
    zzpl localzzpl = this.zzr;
    long l;
    if (localzzpl.zzc == 0) {
      l = this.zzA / localzzpl.zzb;
    } else {
      l = this.zzB;
    }
    return l;
  }
  
  private final long zzG()
  {
    zzpl localzzpl = this.zzr;
    long l;
    if (localzzpl.zzc == 0) {
      l = this.zzC / localzzpl.zzd;
    } else {
      l = this.zzD;
    }
    return l;
  }
  
  private final AudioTrack zzH(zzpl paramzzpl)
    throws zzov
  {
    try
    {
      paramzzpl = paramzzpl.zzb(false, this.zzv, this.zzS);
      return paramzzpl;
    }
    catch (zzov localzzov)
    {
      paramzzpl = this.zzp;
      if (paramzzpl != null) {
        paramzzpl.zza(localzzov);
      }
      throw localzzov;
    }
  }
  
  private final void zzI(long paramLong)
  {
    zzpm localzzpm;
    if (zzS())
    {
      localzzpm = this.zzY;
      localObject = this.zzy;
      localzzpm.zzc((zzci)localObject);
    }
    else
    {
      localObject = zzci.zza;
    }
    this.zzy = ((zzci)localObject);
    boolean bool;
    if (zzS())
    {
      localzzpm = this.zzY;
      bool = this.zzz;
      localzzpm.zzd(bool);
    }
    else
    {
      bool = false;
    }
    this.zzz = bool;
    this.zzj.add(new zzpo((zzci)localObject, Math.max(0L, paramLong), this.zzr.zza(zzG()), null));
    zzN();
    Object localObject = this.zzp;
    if (localObject != null)
    {
      bool = this.zzz;
      zzqc.zzW(((zzqb)localObject).zza).zzs(bool);
    }
  }
  
  private final void zzJ()
  {
    if (!this.zzP)
    {
      this.zzP = true;
      this.zzi.zzc(zzG());
      this.zzt.stop();
    }
  }
  
  private final void zzK(long paramLong)
    throws zzoy
  {
    if (this.zzs.zzh())
    {
      while (!this.zzs.zzg())
      {
        do
        {
          localObject = this.zzs.zzb();
          if (!((ByteBuffer)localObject).hasRemaining()) {
            break;
          }
          zzO((ByteBuffer)localObject, paramLong);
        } while (!((ByteBuffer)localObject).hasRemaining());
        return;
        localObject = this.zzJ;
        if ((localObject == null) || (!((ByteBuffer)localObject).hasRemaining())) {
          break;
        }
        this.zzs.zze(this.zzJ);
      }
      return;
    }
    ByteBuffer localByteBuffer = this.zzJ;
    Object localObject = localByteBuffer;
    if (localByteBuffer == null) {
      localObject = zzdr.zza;
    }
    zzO((ByteBuffer)localObject, paramLong);
  }
  
  private final void zzL(zzci paramzzci)
  {
    paramzzci = new zzpo(paramzzci, -9223372036854775807L, -9223372036854775807L, null);
    if (zzQ())
    {
      this.zzw = paramzzci;
      return;
    }
    this.zzx = paramzzci;
  }
  
  private final void zzM()
  {
    if (!zzQ()) {
      return;
    }
    if (zzfn.zza >= 21)
    {
      this.zzt.setVolume(this.zzI);
      return;
    }
    AudioTrack localAudioTrack = this.zzt;
    float f = this.zzI;
    localAudioTrack.setStereoVolume(f, f);
  }
  
  private final void zzN()
  {
    zzdo localzzdo = this.zzr.zzi;
    this.zzs = localzzdo;
    localzzdo.zzc();
  }
  
  private final void zzO(ByteBuffer paramByteBuffer, long paramLong)
    throws zzoy
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    Object localObject = this.zzL;
    boolean bool3 = true;
    boolean bool2 = true;
    boolean bool1;
    int i;
    if (localObject != null)
    {
      if (localObject == paramByteBuffer) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      zzdy.zzd(bool1);
    }
    else
    {
      this.zzL = paramByteBuffer;
      if (zzfn.zza < 21)
      {
        j = paramByteBuffer.remaining();
        localObject = this.zzM;
        if ((localObject == null) || (localObject.length < j)) {
          this.zzM = new byte[j];
        }
        i = paramByteBuffer.position();
        paramByteBuffer.get(this.zzM, 0, j);
        paramByteBuffer.position(i);
        this.zzN = 0;
      }
    }
    int k = paramByteBuffer.remaining();
    if (zzfn.zza < 21)
    {
      i = this.zzi.zza(this.zzC);
      if (i > 0)
      {
        i = Math.min(k, i);
        j = this.zzt.write(this.zzM, this.zzN, i);
        i = j;
        if (j > 0)
        {
          this.zzN += j;
          paramByteBuffer.position(paramByteBuffer.position() + j);
          i = j;
        }
      }
      else
      {
        i = 0;
      }
    }
    else
    {
      i = this.zzt.write(paramByteBuffer, k, 1);
    }
    this.zzV = SystemClock.elapsedRealtime();
    if (i < 0)
    {
      if (((zzfn.zza >= 24) && (i == -6)) || ((i == -32) && (this.zzD > 0L))) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      localObject = new zzoy(i, this.zzr.zza, bool1);
      paramByteBuffer = this.zzp;
      if (paramByteBuffer != null) {
        paramByteBuffer.zza((Exception)localObject);
      }
      if (!((zzoy)localObject).zzb)
      {
        this.zzm.zzb((Exception)localObject);
        return;
      }
      this.zzu = zzoh.zza;
      throw ((Throwable)localObject);
    }
    this.zzm.zza();
    if (zzR(this.zzt))
    {
      if (this.zzD > 0L) {
        this.zzX = false;
      }
      if (this.zzQ)
      {
        localObject = this.zzp;
        if ((localObject != null) && (i < k) && (!this.zzX))
        {
          localObject = ((zzqb)localObject).zza;
          if (zzqc.zzV((zzqc)localObject) != null) {
            zzqc.zzV((zzqc)localObject).zza();
          }
        }
      }
    }
    int j = this.zzr.zzc;
    if (j == 0) {
      this.zzC += i;
    }
    if (i == k)
    {
      if (j != 0)
      {
        if (paramByteBuffer == this.zzJ) {
          bool1 = bool3;
        } else {
          bool1 = false;
        }
        zzdy.zzf(bool1);
        this.zzD += this.zzE * this.zzK;
      }
      this.zzL = null;
    }
  }
  
  private final boolean zzP()
    throws zzoy
  {
    boolean bool1 = this.zzs.zzh();
    boolean bool2 = false;
    ByteBuffer localByteBuffer;
    if (!bool1)
    {
      localByteBuffer = this.zzL;
      if (localByteBuffer == null) {
        return true;
      }
      zzO(localByteBuffer, Long.MIN_VALUE);
      return this.zzL == null;
    }
    this.zzs.zzd();
    zzK(Long.MIN_VALUE);
    bool1 = bool2;
    if (this.zzs.zzg())
    {
      localByteBuffer = this.zzL;
      if (localByteBuffer != null)
      {
        if (localByteBuffer.hasRemaining()) {
          bool1 = bool2;
        } else {
          return true;
        }
      }
      else {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private final boolean zzQ()
  {
    return this.zzt != null;
  }
  
  private static boolean zzR(AudioTrack paramAudioTrack)
  {
    return (zzfn.zza >= 29) && (paramAudioTrack.isOffloadedPlayback());
  }
  
  private final boolean zzS()
  {
    zzpl localzzpl = this.zzr;
    if (localzzpl.zzc == 0)
    {
      int i = localzzpl.zza.zzB;
      return true;
    }
    return false;
  }
  
  public final int zza(zzam paramzzam)
  {
    int i;
    if ("audio/raw".equals(paramzzam.zzm))
    {
      if (!zzfn.zzC(paramzzam.zzB))
      {
        i = paramzzam.zzB;
        paramzzam = new StringBuilder();
        paramzzam.append("Invalid PCM encoding: ");
        paramzzam.append(i);
        zzer.zze("DefaultAudioSink", paramzzam.toString());
        return 0;
      }
      if (paramzzam.zzB != 2) {
        return 1;
      }
      return 2;
    }
    if (!this.zzW) {
      i = zzfn.zza;
    }
    if (this.zzu.zza(paramzzam) != null) {
      return 2;
    }
    return 0;
  }
  
  public final long zzb(boolean paramBoolean)
  {
    if ((zzQ()) && (!this.zzG))
    {
      long l1 = Math.min(this.zzi.zzb(paramBoolean), this.zzr.zza(zzG()));
      while ((!this.zzj.isEmpty()) && (l1 >= ((zzpo)this.zzj.getFirst()).zzc)) {
        this.zzx = ((zzpo)this.zzj.remove());
      }
      zzpo localzzpo = this.zzx;
      long l2 = l1 - localzzpo.zzc;
      if (localzzpo.zza.equals(zzci.zza))
      {
        l1 = this.zzx.zzb + l2;
      }
      else if (this.zzj.isEmpty())
      {
        l1 = this.zzY.zza(l2) + this.zzx.zzb;
      }
      else
      {
        localzzpo = (zzpo)this.zzj.getFirst();
        l1 = zzfn.zzm(localzzpo.zzc - l1, this.zzx.zza.zzc);
        l1 = localzzpo.zzb - l1;
      }
      return l1 + this.zzr.zza(this.zzY.zzb());
    }
    return Long.MIN_VALUE;
  }
  
  public final zzci zzc()
  {
    return this.zzy;
  }
  
  public final void zzd(zzam paramzzam, int paramInt, int[] paramArrayOfInt)
    throws zzou
  {
    int i1;
    int k;
    int i;
    int n;
    int m;
    if ("audio/raw".equals(paramzzam.zzm))
    {
      zzdy.zzd(zzfn.zzC(paramzzam.zzB));
      i1 = zzfn.zzk(paramzzam.zzB, paramzzam.zzz);
      localObject1 = new zzfro();
      paramInt = paramzzam.zzB;
      ((zzfro)localObject1).zzh(this.zzf);
      ((zzfro)localObject1).zzg(this.zzY.zze());
      Object localObject2 = new zzdo(((zzfro)localObject1).zzi());
      localObject1 = localObject2;
      if (((zzdo)localObject2).equals(this.zzs)) {
        localObject1 = this.zzs;
      }
      this.zze.zzq(paramzzam.zzC, paramzzam.zzD);
      if ((zzfn.zza < 21) && (paramzzam.zzz == 8) && (paramArrayOfInt == null))
      {
        localObject2 = new int[6];
        for (paramInt = 0;; paramInt++)
        {
          paramArrayOfInt = (int[])localObject2;
          if (paramInt >= 6) {
            break;
          }
          localObject2[paramInt] = paramInt;
        }
      }
      this.zzd.zzo(paramArrayOfInt);
      paramArrayOfInt = new zzdp(paramzzam.zzA, paramzzam.zzz, paramzzam.zzB);
      try
      {
        paramArrayOfInt = ((zzdo)localObject1).zza(paramArrayOfInt);
        paramInt = paramArrayOfInt.zzd;
        k = paramArrayOfInt.zzb;
        i = paramArrayOfInt.zzc;
        n = zzfn.zzf(i);
        i = zzfn.zzk(paramInt, i);
        paramArrayOfInt = (int[])localObject1;
        m = 0;
      }
      catch (zzdq paramArrayOfInt)
      {
        throw new zzou(paramArrayOfInt, paramzzam);
      }
    }
    else
    {
      paramArrayOfInt = new zzdo(zzfrr.zzl());
      k = paramzzam.zzA;
      paramInt = zzfn.zza;
      localObject1 = this.zzu.zza(paramzzam);
      if (localObject1 == null) {
        break label729;
      }
      paramInt = ((Integer)((Pair)localObject1).first).intValue();
      n = ((Integer)((Pair)localObject1).second).intValue();
      m = 2;
      i1 = -1;
      i = -1;
    }
    if (paramInt != 0)
    {
      if (n != 0)
      {
        int i5 = AudioTrack.getMinBufferSize(k, n, paramInt);
        boolean bool;
        if (i5 != -2) {
          bool = true;
        } else {
          bool = false;
        }
        zzdy.zzf(bool);
        int i2;
        if (i != -1) {
          i2 = i;
        } else {
          i2 = 1;
        }
        int i6 = paramzzam.zzi;
        int i4 = 250000;
        if (m != 0)
        {
          if (m != 1)
          {
            j = 5;
            if (paramInt == 5)
            {
              paramInt = 500000;
              i3 = 5;
            }
            else
            {
              j = paramInt;
              i3 = paramInt;
              paramInt = i4;
            }
            if (i6 != -1) {
              i3 = zzftx.zza(i6, 8, RoundingMode.CEILING);
            } else {
              i3 = zzpy.zzb(i3);
            }
            int i3 = zzftz.zza(paramInt * i3 / 1000000L);
            paramInt = j;
            j = i3;
          }
          else
          {
            j = zzftz.zza(zzpy.zzb(paramInt) * 50000000L / 1000000L);
          }
        }
        else {
          j = Math.max(zzpy.zza(250000, k, i2), Math.min(i5 * 4, zzpy.zza(750000, k, i2)));
        }
        int j = (Math.max(i5, (int)j) + i2 - 1) / i2;
        this.zzW = false;
        paramzzam = new zzpl(paramzzam, i1, m, i, k, n, paramInt, j * i2, paramArrayOfInt, false);
        if (zzQ())
        {
          this.zzq = paramzzam;
          return;
        }
        this.zzr = paramzzam;
        return;
      }
      localObject1 = String.valueOf(paramzzam);
      paramArrayOfInt = new StringBuilder();
      paramArrayOfInt.append("Invalid output channel config (mode=");
      paramArrayOfInt.append(m);
      paramArrayOfInt.append(") for: ");
      paramArrayOfInt.append((String)localObject1);
      throw new zzou(paramArrayOfInt.toString(), paramzzam);
    }
    paramArrayOfInt = String.valueOf(paramzzam);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Invalid output encoding (mode=");
    ((StringBuilder)localObject1).append(m);
    ((StringBuilder)localObject1).append(") for: ");
    ((StringBuilder)localObject1).append(paramArrayOfInt);
    throw new zzou(((StringBuilder)localObject1).toString(), paramzzam);
    label729:
    throw new zzou("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(paramzzam))), paramzzam);
  }
  
  public final void zze()
  {
    if (zzQ())
    {
      this.zzA = 0L;
      this.zzB = 0L;
      this.zzC = 0L;
      this.zzD = 0L;
      this.zzX = false;
      this.zzE = 0;
      this.zzx = new zzpo(this.zzy, 0L, 0L, null);
      this.zzH = 0L;
      this.zzw = null;
      this.zzj.clear();
      this.zzJ = null;
      this.zzK = 0;
      this.zzL = null;
      this.zzP = false;
      this.zzO = false;
      this.zze.zzp();
      zzN();
      if (this.zzi.zzh()) {
        this.zzt.pause();
      }
      if (zzR(this.zzt))
      {
        ??? = this.zzk;
        Objects.requireNonNull(???);
        ((zzpu)???).zzb(this.zzt);
      }
      if ((zzfn.zza < 21) && (!this.zzR)) {
        this.zzS = 0;
      }
      ??? = this.zzq;
      if (??? != null)
      {
        this.zzr = ((zzpl)???);
        this.zzq = null;
      }
      this.zzi.zzd();
      AudioTrack localAudioTrack = this.zzt;
      zzeb localzzeb = this.zzh;
      localzzeb.zzc();
      synchronized (zza)
      {
        if (zzb == null) {
          zzb = zzfn.zzz("ExoPlayer:AudioTrackReleaseThread");
        }
        zzc += 1;
        ExecutorService localExecutorService = zzb;
        zzpf localzzpf = new com/google/android/gms/internal/ads/zzpf;
        localzzpf.<init>(localAudioTrack, localzzeb);
        localExecutorService.execute(localzzpf);
        this.zzt = null;
      }
    }
    this.zzm.zza();
    this.zzl.zza();
  }
  
  public final void zzf()
  {
    this.zzF = true;
  }
  
  public final void zzg()
  {
    this.zzQ = false;
    if ((zzQ()) && (this.zzi.zzk())) {
      this.zzt.pause();
    }
  }
  
  public final void zzh()
  {
    this.zzQ = true;
    if (zzQ())
    {
      this.zzi.zzf();
      this.zzt.play();
    }
  }
  
  public final void zzi()
    throws zzoy
  {
    if ((!this.zzO) && (zzQ()) && (zzP()))
    {
      zzJ();
      this.zzO = true;
    }
  }
  
  public final void zzj()
  {
    zze();
    Object localObject = this.zzf;
    int j = ((List)localObject).size();
    for (int i = 0; i < j; i++) {
      ((zzdr)((List)localObject).get(i)).zzf();
    }
    localObject = this.zzg;
    j = ((List)localObject).size();
    for (i = 0; i < j; i++) {
      ((zzdr)((List)localObject).get(i)).zzf();
    }
    localObject = this.zzs;
    if (localObject != null) {
      ((zzdo)localObject).zzf();
    }
    this.zzQ = false;
    this.zzW = false;
  }
  
  public final void zzk(zzk paramzzk)
  {
    if (this.zzv.equals(paramzzk)) {
      return;
    }
    this.zzv = paramzzk;
    zze();
  }
  
  public final void zzl(int paramInt)
  {
    if (this.zzS != paramInt)
    {
      this.zzS = paramInt;
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.zzR = bool;
      zze();
    }
  }
  
  public final void zzm(zzl paramzzl)
  {
    if (this.zzT.equals(paramzzl)) {
      return;
    }
    int i = paramzzl.zza;
    float f = paramzzl.zzb;
    if (this.zzt != null) {
      i = this.zzT.zza;
    }
    this.zzT = paramzzl;
  }
  
  public final void zzn(zzow paramzzow)
  {
    this.zzp = paramzzow;
  }
  
  public final void zzo(zzci paramzzci)
  {
    this.zzy = new zzci(Math.max(0.1F, Math.min(paramzzci.zzc, 8.0F)), Math.max(0.1F, Math.min(paramzzci.zzd, 8.0F)));
    zzL(paramzzci);
  }
  
  public final void zzp(zzof paramzzof)
  {
    this.zzo = paramzzof;
  }
  
  public final void zzq(AudioDeviceInfo paramAudioDeviceInfo)
  {
    if (paramAudioDeviceInfo == null) {
      paramAudioDeviceInfo = null;
    } else {
      paramAudioDeviceInfo = new zzpi(paramAudioDeviceInfo);
    }
    this.zzU = paramAudioDeviceInfo;
    AudioTrack localAudioTrack = this.zzt;
    if (localAudioTrack != null) {
      zzpg.zza(localAudioTrack, paramAudioDeviceInfo);
    }
  }
  
  public final void zzr(boolean paramBoolean)
  {
    this.zzz = paramBoolean;
    zzL(this.zzy);
  }
  
  public final void zzs(float paramFloat)
  {
    if (this.zzI != paramFloat)
    {
      this.zzI = paramFloat;
      zzM();
    }
  }
  
  /* Error */
  public final boolean zzt(ByteBuffer paramByteBuffer, long paramLong, int paramInt)
    throws zzov, zzoy
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 365	com/google/android/gms/internal/ads/zzpw:zzJ	Ljava/nio/ByteBuffer;
    //   4: astore 14
    //   6: aload 14
    //   8: ifnull +18 -> 26
    //   11: aload_1
    //   12: aload 14
    //   14: if_acmpne +6 -> 20
    //   17: goto +9 -> 26
    //   20: iconst_0
    //   21: istore 11
    //   23: goto +6 -> 29
    //   26: iconst_1
    //   27: istore 11
    //   29: iload 11
    //   31: invokestatic 397	com/google/android/gms/internal/ads/zzdy:zzd	(Z)V
    //   34: aload_0
    //   35: getfield 671	com/google/android/gms/internal/ads/zzpw:zzq	Lcom/google/android/gms/internal/ads/zzpl;
    //   38: ifnull +202 -> 240
    //   41: aload_0
    //   42: invokespecial 745	com/google/android/gms/internal/ads/zzpw:zzP	()Z
    //   45: ifne +5 -> 50
    //   48: iconst_0
    //   49: ireturn
    //   50: aload_0
    //   51: getfield 671	com/google/android/gms/internal/ads/zzpw:zzq	Lcom/google/android/gms/internal/ads/zzpl;
    //   54: astore 15
    //   56: aload_0
    //   57: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   60: astore 14
    //   62: aload 14
    //   64: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   67: aload 15
    //   69: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   72: if_icmpne +146 -> 218
    //   75: aload 14
    //   77: getfield 805	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   80: aload 15
    //   82: getfield 805	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   85: if_icmpne +133 -> 218
    //   88: aload 14
    //   90: getfield 807	com/google/android/gms/internal/ads/zzpl:zze	I
    //   93: aload 15
    //   95: getfield 807	com/google/android/gms/internal/ads/zzpl:zze	I
    //   98: if_icmpne +120 -> 218
    //   101: aload 14
    //   103: getfield 809	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   106: aload 15
    //   108: getfield 809	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   111: if_icmpne +107 -> 218
    //   114: aload 14
    //   116: getfield 279	com/google/android/gms/internal/ads/zzpl:zzd	I
    //   119: aload 15
    //   121: getfield 279	com/google/android/gms/internal/ads/zzpl:zzd	I
    //   124: if_icmpne +94 -> 218
    //   127: aload 14
    //   129: getfield 811	com/google/android/gms/internal/ads/zzpl:zzj	Z
    //   132: istore 11
    //   134: aload 15
    //   136: getfield 811	com/google/android/gms/internal/ads/zzpl:zzj	Z
    //   139: istore 11
    //   141: aload_0
    //   142: aload 15
    //   144: putfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   147: aload_0
    //   148: aconst_null
    //   149: putfield 671	com/google/android/gms/internal/ads/zzpw:zzq	Lcom/google/android/gms/internal/ads/zzpl;
    //   152: aload_0
    //   153: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   156: invokestatic 455	com/google/android/gms/internal/ads/zzpw:zzR	(Landroid/media/AudioTrack;)Z
    //   159: ifeq +76 -> 235
    //   162: aload_0
    //   163: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   166: invokevirtual 814	android/media/AudioTrack:getPlayState	()I
    //   169: iconst_3
    //   170: if_icmpne +10 -> 180
    //   173: aload_0
    //   174: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   177: invokevirtual 817	android/media/AudioTrack:setOffloadEndOfStream	()V
    //   180: aload_0
    //   181: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   184: astore 14
    //   186: aload_0
    //   187: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   190: getfield 439	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   193: astore 15
    //   195: aload 14
    //   197: aload 15
    //   199: getfield 589	com/google/android/gms/internal/ads/zzam:zzC	I
    //   202: aload 15
    //   204: getfield 591	com/google/android/gms/internal/ads/zzam:zzD	I
    //   207: invokevirtual 820	android/media/AudioTrack:setOffloadDelayPadding	(II)V
    //   210: aload_0
    //   211: iconst_1
    //   212: putfield 457	com/google/android/gms/internal/ads/zzpw:zzX	Z
    //   215: goto +20 -> 235
    //   218: aload_0
    //   219: invokespecial 747	com/google/android/gms/internal/ads/zzpw:zzJ	()V
    //   222: aload_0
    //   223: invokevirtual 822	com/google/android/gms/internal/ads/zzpw:zzu	()Z
    //   226: ifeq +5 -> 231
    //   229: iconst_0
    //   230: ireturn
    //   231: aload_0
    //   232: invokevirtual 749	com/google/android/gms/internal/ads/zzpw:zze	()V
    //   235: aload_0
    //   236: lload_2
    //   237: invokespecial 824	com/google/android/gms/internal/ads/zzpw:zzI	(J)V
    //   240: aload_0
    //   241: invokespecial 377	com/google/android/gms/internal/ads/zzpw:zzQ	()Z
    //   244: ifeq +6 -> 250
    //   247: goto +396 -> 643
    //   250: aload_0
    //   251: getfield 127	com/google/android/gms/internal/ads/zzpw:zzh	Lcom/google/android/gms/internal/ads/zzeb;
    //   254: invokevirtual 826	com/google/android/gms/internal/ads/zzeb:zzd	()Z
    //   257: istore 11
    //   259: iload 11
    //   261: ifne +5 -> 266
    //   264: iconst_0
    //   265: ireturn
    //   266: aload_0
    //   267: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   270: astore 14
    //   272: aload 14
    //   274: invokestatic 711	java/util/Objects:requireNonNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   277: pop
    //   278: aload_0
    //   279: aload 14
    //   281: invokespecial 828	com/google/android/gms/internal/ads/zzpw:zzH	(Lcom/google/android/gms/internal/ads/zzpl;)Landroid/media/AudioTrack;
    //   284: astore 14
    //   286: goto +129 -> 415
    //   289: astore 15
    //   291: aload_0
    //   292: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   295: astore 18
    //   297: aload 18
    //   299: getfield 830	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   302: ldc_w 831
    //   305: if_icmple +1418 -> 1723
    //   308: new 268	com/google/android/gms/internal/ads/zzpl
    //   311: astore 16
    //   313: aload 18
    //   315: getfield 439	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   318: astore 14
    //   320: aload 18
    //   322: getfield 273	com/google/android/gms/internal/ads/zzpl:zzb	I
    //   325: istore 7
    //   327: aload 18
    //   329: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   332: istore 9
    //   334: aload 18
    //   336: getfield 279	com/google/android/gms/internal/ads/zzpl:zzd	I
    //   339: istore 8
    //   341: aload 18
    //   343: getfield 807	com/google/android/gms/internal/ads/zzpl:zze	I
    //   346: istore 10
    //   348: aload 18
    //   350: getfield 809	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   353: istore 5
    //   355: aload 18
    //   357: getfield 805	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   360: istore 6
    //   362: aload 18
    //   364: getfield 389	com/google/android/gms/internal/ads/zzpl:zzi	Lcom/google/android/gms/internal/ads/zzdo;
    //   367: astore 17
    //   369: aload 18
    //   371: getfield 811	com/google/android/gms/internal/ads/zzpl:zzj	Z
    //   374: istore 11
    //   376: aload 16
    //   378: aload 14
    //   380: iload 7
    //   382: iload 9
    //   384: iload 8
    //   386: iload 10
    //   388: iload 5
    //   390: iload 6
    //   392: ldc_w 831
    //   395: aload 17
    //   397: iconst_0
    //   398: invokespecial 669	com/google/android/gms/internal/ads/zzpl:<init>	(Lcom/google/android/gms/internal/ads/zzam;IIIIIIILcom/google/android/gms/internal/ads/zzdo;Z)V
    //   401: aload_0
    //   402: aload 16
    //   404: invokespecial 828	com/google/android/gms/internal/ads/zzpw:zzH	(Lcom/google/android/gms/internal/ads/zzpl;)Landroid/media/AudioTrack;
    //   407: astore 14
    //   409: aload_0
    //   410: aload 16
    //   412: putfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   415: aload_0
    //   416: aload 14
    //   418: putfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   421: aload 14
    //   423: invokestatic 455	com/google/android/gms/internal/ads/zzpw:zzR	(Landroid/media/AudioTrack;)Z
    //   426: ifeq +72 -> 498
    //   429: aload_0
    //   430: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   433: astore 15
    //   435: aload_0
    //   436: getfield 705	com/google/android/gms/internal/ads/zzpw:zzk	Lcom/google/android/gms/internal/ads/zzpu;
    //   439: ifnonnull +20 -> 459
    //   442: new 713	com/google/android/gms/internal/ads/zzpu
    //   445: astore 14
    //   447: aload 14
    //   449: aload_0
    //   450: invokespecial 834	com/google/android/gms/internal/ads/zzpu:<init>	(Lcom/google/android/gms/internal/ads/zzpw;)V
    //   453: aload_0
    //   454: aload 14
    //   456: putfield 705	com/google/android/gms/internal/ads/zzpw:zzk	Lcom/google/android/gms/internal/ads/zzpu;
    //   459: aload_0
    //   460: getfield 705	com/google/android/gms/internal/ads/zzpw:zzk	Lcom/google/android/gms/internal/ads/zzpu;
    //   463: aload 15
    //   465: invokevirtual 836	com/google/android/gms/internal/ads/zzpu:zza	(Landroid/media/AudioTrack;)V
    //   468: aload_0
    //   469: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   472: astore 15
    //   474: aload_0
    //   475: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   478: getfield 439	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   481: astore 14
    //   483: aload 15
    //   485: aload 14
    //   487: getfield 589	com/google/android/gms/internal/ads/zzam:zzC	I
    //   490: aload 14
    //   492: getfield 591	com/google/android/gms/internal/ads/zzam:zzD	I
    //   495: invokevirtual 820	android/media/AudioTrack:setOffloadDelayPadding	(II)V
    //   498: getstatic 111	com/google/android/gms/internal/ads/zzfn:zza	I
    //   501: bipush 31
    //   503: if_icmplt +23 -> 526
    //   506: aload_0
    //   507: getfield 785	com/google/android/gms/internal/ads/zzpw:zzo	Lcom/google/android/gms/internal/ads/zzof;
    //   510: astore 14
    //   512: aload 14
    //   514: ifnull +12 -> 526
    //   517: aload_0
    //   518: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   521: aload 14
    //   523: invokestatic 841	com/google/android/gms/internal/ads/zzph:zza	(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzof;)V
    //   526: aload_0
    //   527: aload_0
    //   528: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   531: invokevirtual 844	android/media/AudioTrack:getAudioSessionId	()I
    //   534: putfield 180	com/google/android/gms/internal/ads/zzpw:zzS	I
    //   537: aload_0
    //   538: getfield 142	com/google/android/gms/internal/ads/zzpw:zzi	Lcom/google/android/gms/internal/ads/zzpd;
    //   541: astore 15
    //   543: aload_0
    //   544: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   547: astore 16
    //   549: aload_0
    //   550: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   553: astore 14
    //   555: aload 14
    //   557: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   560: iconst_2
    //   561: if_icmpne +9 -> 570
    //   564: iconst_1
    //   565: istore 11
    //   567: goto +6 -> 573
    //   570: iconst_0
    //   571: istore 11
    //   573: aload 15
    //   575: aload 16
    //   577: iload 11
    //   579: aload 14
    //   581: getfield 805	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   584: aload 14
    //   586: getfield 279	com/google/android/gms/internal/ads/zzpl:zzd	I
    //   589: aload 14
    //   591: getfield 830	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   594: invokevirtual 847	com/google/android/gms/internal/ads/zzpd:zze	(Landroid/media/AudioTrack;ZIII)V
    //   597: aload_0
    //   598: invokespecial 800	com/google/android/gms/internal/ads/zzpw:zzM	()V
    //   601: aload_0
    //   602: getfield 187	com/google/android/gms/internal/ads/zzpw:zzT	Lcom/google/android/gms/internal/ads/zzl;
    //   605: getfield 765	com/google/android/gms/internal/ads/zzl:zza	I
    //   608: istore 5
    //   610: aload_0
    //   611: getfield 792	com/google/android/gms/internal/ads/zzpw:zzU	Lcom/google/android/gms/internal/ads/zzpi;
    //   614: astore 14
    //   616: aload 14
    //   618: ifnull +20 -> 638
    //   621: getstatic 111	com/google/android/gms/internal/ads/zzfn:zza	I
    //   624: bipush 23
    //   626: if_icmplt +12 -> 638
    //   629: aload_0
    //   630: getfield 239	com/google/android/gms/internal/ads/zzpw:zzt	Landroid/media/AudioTrack;
    //   633: aload 14
    //   635: invokestatic 797	com/google/android/gms/internal/ads/zzpg:zza	(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzpi;)V
    //   638: aload_0
    //   639: iconst_1
    //   640: putfield 530	com/google/android/gms/internal/ads/zzpw:zzG	Z
    //   643: aload_0
    //   644: getfield 216	com/google/android/gms/internal/ads/zzpw:zzl	Lcom/google/android/gms/internal/ads/zzpp;
    //   647: invokevirtual 452	com/google/android/gms/internal/ads/zzpp:zza	()V
    //   650: aload_0
    //   651: getfield 530	com/google/android/gms/internal/ads/zzpw:zzG	Z
    //   654: ifeq +38 -> 692
    //   657: aload_0
    //   658: lconst_0
    //   659: lload_2
    //   660: invokestatic 309	java/lang/Math:max	(JJ)J
    //   663: putfield 692	com/google/android/gms/internal/ads/zzpw:zzH	J
    //   666: aload_0
    //   667: iconst_0
    //   668: putfield 736	com/google/android/gms/internal/ads/zzpw:zzF	Z
    //   671: aload_0
    //   672: iconst_0
    //   673: putfield 530	com/google/android/gms/internal/ads/zzpw:zzG	Z
    //   676: aload_0
    //   677: lload_2
    //   678: invokespecial 824	com/google/android/gms/internal/ads/zzpw:zzI	(J)V
    //   681: aload_0
    //   682: getfield 263	com/google/android/gms/internal/ads/zzpw:zzQ	Z
    //   685: ifeq +7 -> 692
    //   688: aload_0
    //   689: invokevirtual 849	com/google/android/gms/internal/ads/zzpw:zzh	()V
    //   692: aload_0
    //   693: getfield 142	com/google/android/gms/internal/ads/zzpw:zzi	Lcom/google/android/gms/internal/ads/zzpd;
    //   696: aload_0
    //   697: invokespecial 311	com/google/android/gms/internal/ads/zzpw:zzG	()J
    //   700: invokevirtual 852	com/google/android/gms/internal/ads/zzpd:zzj	(J)Z
    //   703: ifne +5 -> 708
    //   706: iconst_0
    //   707: ireturn
    //   708: aload_0
    //   709: getfield 365	com/google/android/gms/internal/ads/zzpw:zzJ	Ljava/nio/ByteBuffer;
    //   712: ifnonnull +919 -> 1631
    //   715: aload_1
    //   716: invokevirtual 856	java/nio/ByteBuffer:order	()Ljava/nio/ByteOrder;
    //   719: getstatic 862	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   722: if_acmpne +9 -> 731
    //   725: iconst_1
    //   726: istore 11
    //   728: goto +6 -> 734
    //   731: iconst_0
    //   732: istore 11
    //   734: iload 11
    //   736: invokestatic 397	com/google/android/gms/internal/ads/zzdy:zzd	(Z)V
    //   739: aload_1
    //   740: invokevirtual 360	java/nio/ByteBuffer:hasRemaining	()Z
    //   743: ifne +5 -> 748
    //   746: iconst_1
    //   747: ireturn
    //   748: aload_0
    //   749: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   752: astore 14
    //   754: aload 14
    //   756: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   759: ifeq +621 -> 1380
    //   762: aload_0
    //   763: getfield 467	com/google/android/gms/internal/ads/zzpw:zzE	I
    //   766: ifne +614 -> 1380
    //   769: aload 14
    //   771: getfield 805	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   774: istore 5
    //   776: iload 5
    //   778: tableswitch	default:+78->856, 5:+580->1358, 6:+580->1358, 7:+381->1159, 8:+381->1159, 9:+351->1129, 10:+343->1121, 11:+335->1113, 12:+335->1113, 13:+78->856, 14:+183->961, 15:+175->953, 16:+343->1121, 17:+122->900, 18:+580->1358, 19:+78->856, 20:+113->891
    //   856: new 501	java/lang/StringBuilder
    //   859: dup
    //   860: invokespecial 502	java/lang/StringBuilder:<init>	()V
    //   863: astore_1
    //   864: aload_1
    //   865: ldc_w 864
    //   868: invokevirtual 508	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: aload_1
    //   873: iload 5
    //   875: invokevirtual 511	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   878: pop
    //   879: new 866	java/lang/IllegalStateException
    //   882: dup
    //   883: aload_1
    //   884: invokevirtual 517	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   887: invokespecial 869	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   890: athrow
    //   891: aload_1
    //   892: invokestatic 874	com/google/android/gms/internal/ads/zzabj:zza	(Ljava/nio/ByteBuffer;)I
    //   895: istore 5
    //   897: goto +251 -> 1148
    //   900: getstatic 877	com/google/android/gms/internal/ads/zzzs:zza	I
    //   903: istore 5
    //   905: bipush 16
    //   907: newarray <illegal type>
    //   909: astore 14
    //   911: aload_1
    //   912: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   915: istore 5
    //   917: aload_1
    //   918: aload 14
    //   920: invokevirtual 880	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   923: pop
    //   924: aload_1
    //   925: iload 5
    //   927: invokevirtual 413	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   930: pop
    //   931: new 882	com/google/android/gms/internal/ads/zzfc
    //   934: dup
    //   935: aload 14
    //   937: bipush 16
    //   939: invokespecial 885	com/google/android/gms/internal/ads/zzfc:<init>	([BI)V
    //   942: invokestatic 888	com/google/android/gms/internal/ads/zzzs:zza	(Lcom/google/android/gms/internal/ads/zzfc;)Lcom/google/android/gms/internal/ads/zzzr;
    //   945: getfield 891	com/google/android/gms/internal/ads/zzzr:zzc	I
    //   948: istore 5
    //   950: goto +198 -> 1148
    //   953: sipush 512
    //   956: istore 5
    //   958: goto +190 -> 1148
    //   961: getstatic 894	com/google/android/gms/internal/ads/zzzp:zza	I
    //   964: istore 5
    //   966: aload_1
    //   967: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   970: istore 6
    //   972: aload_1
    //   973: invokevirtual 897	java/nio/ByteBuffer:limit	()I
    //   976: istore 7
    //   978: iload 6
    //   980: istore 5
    //   982: iload 5
    //   984: iload 7
    //   986: bipush 10
    //   988: isub
    //   989: if_icmpgt +36 -> 1025
    //   992: aload_1
    //   993: iload 5
    //   995: iconst_4
    //   996: iadd
    //   997: invokestatic 900	com/google/android/gms/internal/ads/zzfn:zzg	(Ljava/nio/ByteBuffer;I)I
    //   1000: bipush -2
    //   1002: iand
    //   1003: ldc_w 901
    //   1006: if_icmpne +13 -> 1019
    //   1009: iload 5
    //   1011: iload 6
    //   1013: isub
    //   1014: istore 5
    //   1016: goto +12 -> 1028
    //   1019: iinc 5 1
    //   1022: goto -40 -> 982
    //   1025: iconst_m1
    //   1026: istore 5
    //   1028: iload 5
    //   1030: iconst_m1
    //   1031: if_icmpne +9 -> 1040
    //   1034: iconst_0
    //   1035: istore 5
    //   1037: goto +111 -> 1148
    //   1040: aload_1
    //   1041: aload_1
    //   1042: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   1045: iload 5
    //   1047: iadd
    //   1048: bipush 7
    //   1050: iadd
    //   1051: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1054: istore 6
    //   1056: aload_1
    //   1057: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   1060: istore 7
    //   1062: iload 6
    //   1064: sipush 255
    //   1067: iand
    //   1068: sipush 187
    //   1071: if_icmpne +10 -> 1081
    //   1074: bipush 9
    //   1076: istore 6
    //   1078: goto +7 -> 1085
    //   1081: bipush 8
    //   1083: istore 6
    //   1085: bipush 40
    //   1087: aload_1
    //   1088: iload 7
    //   1090: iload 5
    //   1092: iadd
    //   1093: iload 6
    //   1095: iadd
    //   1096: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1099: iconst_4
    //   1100: ishr
    //   1101: bipush 7
    //   1103: iand
    //   1104: ishl
    //   1105: bipush 16
    //   1107: imul
    //   1108: istore 5
    //   1110: goto +38 -> 1148
    //   1113: sipush 2048
    //   1116: istore 5
    //   1118: goto +30 -> 1148
    //   1121: sipush 1024
    //   1124: istore 5
    //   1126: goto +22 -> 1148
    //   1129: aload_1
    //   1130: aload_1
    //   1131: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   1134: invokestatic 900	com/google/android/gms/internal/ads/zzfn:zzg	(Ljava/nio/ByteBuffer;I)I
    //   1137: invokestatic 908	com/google/android/gms/internal/ads/zzabi:zzc	(I)I
    //   1140: istore 5
    //   1142: iload 5
    //   1144: iconst_m1
    //   1145: if_icmpeq +6 -> 1151
    //   1148: goto +216 -> 1364
    //   1151: new 910	java/lang/IllegalArgumentException
    //   1154: dup
    //   1155: invokespecial 911	java/lang/IllegalArgumentException:<init>	()V
    //   1158: athrow
    //   1159: getstatic 914	com/google/android/gms/internal/ads/zzaal:zza	I
    //   1162: istore 5
    //   1164: aload_1
    //   1165: invokevirtual 406	java/nio/ByteBuffer:position	()I
    //   1168: istore 7
    //   1170: aload_1
    //   1171: iload 7
    //   1173: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1176: istore 5
    //   1178: iload 5
    //   1180: bipush -2
    //   1182: if_icmpeq +130 -> 1312
    //   1185: iload 5
    //   1187: iconst_m1
    //   1188: if_icmpeq +71 -> 1259
    //   1191: iload 5
    //   1193: bipush 31
    //   1195: if_icmpeq +35 -> 1230
    //   1198: aload_1
    //   1199: iload 7
    //   1201: iconst_4
    //   1202: iadd
    //   1203: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1206: iconst_1
    //   1207: iand
    //   1208: bipush 6
    //   1210: ishl
    //   1211: istore 6
    //   1213: aload_1
    //   1214: iload 7
    //   1216: iconst_5
    //   1217: iadd
    //   1218: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1221: sipush 252
    //   1224: iand
    //   1225: istore 5
    //   1227: goto +73 -> 1300
    //   1230: aload_1
    //   1231: iload 7
    //   1233: iconst_5
    //   1234: iadd
    //   1235: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1238: bipush 7
    //   1240: iand
    //   1241: iconst_4
    //   1242: ishl
    //   1243: istore 5
    //   1245: aload_1
    //   1246: iload 7
    //   1248: bipush 6
    //   1250: iadd
    //   1251: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1254: istore 6
    //   1256: goto +29 -> 1285
    //   1259: aload_1
    //   1260: iload 7
    //   1262: iconst_4
    //   1263: iadd
    //   1264: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1267: bipush 7
    //   1269: iand
    //   1270: iconst_4
    //   1271: ishl
    //   1272: istore 5
    //   1274: aload_1
    //   1275: iload 7
    //   1277: bipush 7
    //   1279: iadd
    //   1280: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1283: istore 6
    //   1285: iload 6
    //   1287: bipush 60
    //   1289: iand
    //   1290: istore 7
    //   1292: iload 5
    //   1294: istore 6
    //   1296: iload 7
    //   1298: istore 5
    //   1300: iload 5
    //   1302: iconst_2
    //   1303: ishr
    //   1304: iload 6
    //   1306: ior
    //   1307: istore 5
    //   1309: goto +37 -> 1346
    //   1312: aload_1
    //   1313: iload 7
    //   1315: iconst_5
    //   1316: iadd
    //   1317: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1320: istore 5
    //   1322: aload_1
    //   1323: iload 7
    //   1325: iconst_4
    //   1326: iadd
    //   1327: invokevirtual 904	java/nio/ByteBuffer:get	(I)B
    //   1330: sipush 252
    //   1333: iand
    //   1334: iconst_2
    //   1335: ishr
    //   1336: iload 5
    //   1338: iconst_1
    //   1339: iand
    //   1340: bipush 6
    //   1342: ishl
    //   1343: ior
    //   1344: istore 5
    //   1346: iload 5
    //   1348: iconst_1
    //   1349: iadd
    //   1350: bipush 32
    //   1352: imul
    //   1353: istore 5
    //   1355: goto +9 -> 1364
    //   1358: aload_1
    //   1359: invokestatic 915	com/google/android/gms/internal/ads/zzzp:zza	(Ljava/nio/ByteBuffer;)I
    //   1362: istore 5
    //   1364: aload_0
    //   1365: iload 5
    //   1367: putfield 467	com/google/android/gms/internal/ads/zzpw:zzE	I
    //   1370: iload 5
    //   1372: ifeq +6 -> 1378
    //   1375: goto +5 -> 1380
    //   1378: iconst_1
    //   1379: ireturn
    //   1380: aload_0
    //   1381: getfield 379	com/google/android/gms/internal/ads/zzpw:zzw	Lcom/google/android/gms/internal/ads/zzpo;
    //   1384: ifnull +22 -> 1406
    //   1387: aload_0
    //   1388: invokespecial 745	com/google/android/gms/internal/ads/zzpw:zzP	()Z
    //   1391: ifne +5 -> 1396
    //   1394: iconst_0
    //   1395: ireturn
    //   1396: aload_0
    //   1397: lload_2
    //   1398: invokespecial 824	com/google/android/gms/internal/ads/zzpw:zzI	(J)V
    //   1401: aload_0
    //   1402: aconst_null
    //   1403: putfield 379	com/google/android/gms/internal/ads/zzpw:zzw	Lcom/google/android/gms/internal/ads/zzpo;
    //   1406: aload_0
    //   1407: getfield 692	com/google/android/gms/internal/ads/zzpw:zzH	J
    //   1410: lstore 12
    //   1412: aload_0
    //   1413: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   1416: astore 14
    //   1418: lload 12
    //   1420: aload_0
    //   1421: invokespecial 485	com/google/android/gms/internal/ads/zzpw:zzF	()J
    //   1424: aload_0
    //   1425: getfield 152	com/google/android/gms/internal/ads/zzpw:zze	Lcom/google/android/gms/internal/ads/zzqg;
    //   1428: invokevirtual 917	com/google/android/gms/internal/ads/zzqg:zzo	()J
    //   1431: lsub
    //   1432: ldc2_w 655
    //   1435: lmul
    //   1436: aload 14
    //   1438: getfield 439	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   1441: getfield 601	com/google/android/gms/internal/ads/zzam:zzA	I
    //   1444: i2l
    //   1445: ldiv
    //   1446: ladd
    //   1447: lstore 12
    //   1449: aload_0
    //   1450: getfield 736	com/google/android/gms/internal/ads/zzpw:zzF	Z
    //   1453: ifne +50 -> 1503
    //   1456: lload 12
    //   1458: lload_2
    //   1459: lsub
    //   1460: invokestatic 920	java/lang/Math:abs	(J)J
    //   1463: ldc2_w 921
    //   1466: lcmp
    //   1467: ifle +36 -> 1503
    //   1470: aload_0
    //   1471: getfield 242	com/google/android/gms/internal/ads/zzpw:zzp	Lcom/google/android/gms/internal/ads/zzow;
    //   1474: astore 14
    //   1476: aload 14
    //   1478: ifnull +20 -> 1498
    //   1481: aload 14
    //   1483: new 924	com/google/android/gms/internal/ads/zzox
    //   1486: dup
    //   1487: lload_2
    //   1488: lload 12
    //   1490: invokespecial 927	com/google/android/gms/internal/ads/zzox:<init>	(JJ)V
    //   1493: invokeinterface 292 2 0
    //   1498: aload_0
    //   1499: iconst_1
    //   1500: putfield 736	com/google/android/gms/internal/ads/zzpw:zzF	Z
    //   1503: aload_0
    //   1504: getfield 736	com/google/android/gms/internal/ads/zzpw:zzF	Z
    //   1507: ifeq +68 -> 1575
    //   1510: aload_0
    //   1511: invokespecial 745	com/google/android/gms/internal/ads/zzpw:zzP	()Z
    //   1514: ifne +5 -> 1519
    //   1517: iconst_0
    //   1518: ireturn
    //   1519: lload_2
    //   1520: lload 12
    //   1522: lsub
    //   1523: lstore 12
    //   1525: aload_0
    //   1526: aload_0
    //   1527: getfield 692	com/google/android/gms/internal/ads/zzpw:zzH	J
    //   1530: lload 12
    //   1532: ladd
    //   1533: putfield 692	com/google/android/gms/internal/ads/zzpw:zzH	J
    //   1536: aload_0
    //   1537: iconst_0
    //   1538: putfield 736	com/google/android/gms/internal/ads/zzpw:zzF	Z
    //   1541: aload_0
    //   1542: lload_2
    //   1543: invokespecial 824	com/google/android/gms/internal/ads/zzpw:zzI	(J)V
    //   1546: aload_0
    //   1547: getfield 242	com/google/android/gms/internal/ads/zzpw:zzp	Lcom/google/android/gms/internal/ads/zzow;
    //   1550: astore 14
    //   1552: aload 14
    //   1554: ifnull +21 -> 1575
    //   1557: lload 12
    //   1559: lconst_0
    //   1560: lcmp
    //   1561: ifeq +14 -> 1575
    //   1564: aload 14
    //   1566: checkcast 322	com/google/android/gms/internal/ads/zzqb
    //   1569: getfield 325	com/google/android/gms/internal/ads/zzqb:zza	Lcom/google/android/gms/internal/ads/zzqc;
    //   1572: invokevirtual 930	com/google/android/gms/internal/ads/zzqc:zzad	()V
    //   1575: aload_0
    //   1576: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   1579: getfield 269	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   1582: ifne +20 -> 1602
    //   1585: aload_0
    //   1586: aload_0
    //   1587: getfield 271	com/google/android/gms/internal/ads/zzpw:zzA	J
    //   1590: aload_1
    //   1591: invokevirtual 401	java/nio/ByteBuffer:remaining	()I
    //   1594: i2l
    //   1595: ladd
    //   1596: putfield 271	com/google/android/gms/internal/ads/zzpw:zzA	J
    //   1599: goto +21 -> 1620
    //   1602: aload_0
    //   1603: aload_0
    //   1604: getfield 275	com/google/android/gms/internal/ads/zzpw:zzB	J
    //   1607: aload_0
    //   1608: getfield 467	com/google/android/gms/internal/ads/zzpw:zzE	I
    //   1611: i2l
    //   1612: iload 4
    //   1614: i2l
    //   1615: lmul
    //   1616: ladd
    //   1617: putfield 275	com/google/android/gms/internal/ads/zzpw:zzB	J
    //   1620: aload_0
    //   1621: aload_1
    //   1622: putfield 365	com/google/android/gms/internal/ads/zzpw:zzJ	Ljava/nio/ByteBuffer;
    //   1625: aload_0
    //   1626: iload 4
    //   1628: putfield 469	com/google/android/gms/internal/ads/zzpw:zzK	I
    //   1631: aload_0
    //   1632: lload_2
    //   1633: invokespecial 475	com/google/android/gms/internal/ads/zzpw:zzK	(J)V
    //   1636: aload_0
    //   1637: getfield 365	com/google/android/gms/internal/ads/zzpw:zzJ	Ljava/nio/ByteBuffer;
    //   1640: invokevirtual 360	java/nio/ByteBuffer:hasRemaining	()Z
    //   1643: ifne +15 -> 1658
    //   1646: aload_0
    //   1647: aconst_null
    //   1648: putfield 365	com/google/android/gms/internal/ads/zzpw:zzJ	Ljava/nio/ByteBuffer;
    //   1651: aload_0
    //   1652: iconst_0
    //   1653: putfield 469	com/google/android/gms/internal/ads/zzpw:zzK	I
    //   1656: iconst_1
    //   1657: ireturn
    //   1658: aload_0
    //   1659: getfield 142	com/google/android/gms/internal/ads/zzpw:zzi	Lcom/google/android/gms/internal/ads/zzpd;
    //   1662: aload_0
    //   1663: invokespecial 311	com/google/android/gms/internal/ads/zzpw:zzG	()J
    //   1666: invokevirtual 932	com/google/android/gms/internal/ads/zzpd:zzi	(J)Z
    //   1669: ifeq +18 -> 1687
    //   1672: ldc_w 513
    //   1675: ldc_w 934
    //   1678: invokestatic 522	com/google/android/gms/internal/ads/zzer:zze	(Ljava/lang/String;Ljava/lang/String;)V
    //   1681: aload_0
    //   1682: invokevirtual 749	com/google/android/gms/internal/ads/zzpw:zze	()V
    //   1685: iconst_1
    //   1686: ireturn
    //   1687: iconst_0
    //   1688: ireturn
    //   1689: astore_1
    //   1690: ldc_w 936
    //   1693: ldc_w 938
    //   1696: iconst_1
    //   1697: anewarray 940	java/lang/Class
    //   1700: dup
    //   1701: iconst_0
    //   1702: ldc_w 936
    //   1705: aastore
    //   1706: invokevirtual 944	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   1709: aload 15
    //   1711: iconst_1
    //   1712: anewarray 4	java/lang/Object
    //   1715: dup
    //   1716: iconst_0
    //   1717: aload_1
    //   1718: aastore
    //   1719: invokevirtual 950	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1722: pop
    //   1723: aload_0
    //   1724: getfield 266	com/google/android/gms/internal/ads/zzpw:zzr	Lcom/google/android/gms/internal/ads/zzpl;
    //   1727: invokevirtual 951	com/google/android/gms/internal/ads/zzpl:zzc	()Z
    //   1730: ifeq +8 -> 1738
    //   1733: aload_0
    //   1734: iconst_1
    //   1735: putfield 524	com/google/android/gms/internal/ads/zzpw:zzW	Z
    //   1738: aload 15
    //   1740: athrow
    //   1741: astore_1
    //   1742: aload_1
    //   1743: getfield 952	com/google/android/gms/internal/ads/zzov:zzb	Z
    //   1746: ifne +13 -> 1759
    //   1749: aload_0
    //   1750: getfield 216	com/google/android/gms/internal/ads/zzpw:zzl	Lcom/google/android/gms/internal/ads/zzpp;
    //   1753: aload_1
    //   1754: invokevirtual 446	com/google/android/gms/internal/ads/zzpp:zzb	(Ljava/lang/Exception;)V
    //   1757: iconst_0
    //   1758: ireturn
    //   1759: aload_1
    //   1760: athrow
    //   1761: astore_1
    //   1762: goto -39 -> 1723
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1765	0	this	zzpw
    //   0	1765	1	paramByteBuffer	ByteBuffer
    //   0	1765	2	paramLong	long
    //   0	1765	4	paramInt	int
    //   353	1018	5	i	int
    //   360	947	6	j	int
    //   325	1002	7	k	int
    //   339	46	8	m	int
    //   332	51	9	n	int
    //   346	41	10	i1	int
    //   21	714	11	bool	boolean
    //   1410	148	12	l	long
    //   4	1561	14	localObject1	Object
    //   54	149	15	localObject2	Object
    //   289	1	15	localzzov	zzov
    //   433	1306	15	localObject3	Object
    //   311	265	16	localObject4	Object
    //   367	29	17	localzzdo	zzdo
    //   295	75	18	localzzpl	zzpl
    // Exception table:
    //   from	to	target	type
    //   266	272	289	com/google/android/gms/internal/ads/zzov
    //   278	286	289	com/google/android/gms/internal/ads/zzov
    //   401	415	1689	com/google/android/gms/internal/ads/zzov
    //   250	259	1741	com/google/android/gms/internal/ads/zzov
    //   291	401	1741	com/google/android/gms/internal/ads/zzov
    //   415	459	1741	com/google/android/gms/internal/ads/zzov
    //   459	498	1741	com/google/android/gms/internal/ads/zzov
    //   498	512	1741	com/google/android/gms/internal/ads/zzov
    //   517	526	1741	com/google/android/gms/internal/ads/zzov
    //   526	564	1741	com/google/android/gms/internal/ads/zzov
    //   573	616	1741	com/google/android/gms/internal/ads/zzov
    //   621	638	1741	com/google/android/gms/internal/ads/zzov
    //   638	643	1741	com/google/android/gms/internal/ads/zzov
    //   1723	1738	1741	com/google/android/gms/internal/ads/zzov
    //   1738	1741	1741	com/google/android/gms/internal/ads/zzov
    //   1690	1723	1761	java/lang/Exception
  }
  
  public final boolean zzu()
  {
    return (zzQ()) && (this.zzi.zzg(zzG()));
  }
  
  public final boolean zzv()
  {
    boolean bool2 = zzQ();
    boolean bool1 = false;
    if (bool2)
    {
      if (!this.zzO) {
        return bool1;
      }
      if (zzu()) {
        return false;
      }
    }
    bool1 = true;
    return bool1;
  }
  
  public final boolean zzw(zzam paramzzam)
  {
    return zza(paramzzam) != 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */