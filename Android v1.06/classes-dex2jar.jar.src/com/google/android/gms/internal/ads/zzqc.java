package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

public final class zzqc
  extends zzrt
  implements zzkh
{
  private final Context zzb;
  private final zzos zzc;
  private final zzoz zzd;
  private int zze;
  private boolean zzf;
  private zzam zzg;
  private zzam zzh;
  private long zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  private zzld zzm;
  
  public zzqc(Context paramContext, zzrl paramzzrl, zzrv paramzzrv, boolean paramBoolean, Handler paramHandler, zzot paramzzot, zzoz paramzzoz)
  {
    super(1, paramzzrl, paramzzrv, false, 44100.0F);
    this.zzb = paramContext.getApplicationContext();
    this.zzd = paramzzoz;
    this.zzc = new zzos(paramHandler, paramzzot);
    paramzzoz.zzn(new zzqb(this, null));
  }
  
  private static List zzaA(zzrv paramzzrv, zzam paramzzam, boolean paramBoolean, zzoz paramzzoz)
    throws zzsc
  {
    paramzzrv = paramzzam.zzm;
    if (paramzzrv == null) {
      return zzfrr.zzl();
    }
    if (paramzzoz.zzw(paramzzam))
    {
      paramzzoz = zzsi.zzd();
      if (paramzzoz != null) {
        return zzfrr.zzm(paramzzoz);
      }
    }
    paramzzrv = zzsi.zzf(paramzzrv, false, false);
    paramzzam = zzsi.zze(paramzzam);
    if (paramzzam == null) {
      return zzfrr.zzj(paramzzrv);
    }
    paramzzoz = zzsi.zzf(paramzzam, false, false);
    paramzzam = new zzfro();
    paramzzam.zzh(paramzzrv);
    paramzzam.zzh(paramzzoz);
    return paramzzam.zzi();
  }
  
  private final void zzaB()
  {
    long l = this.zzd.zzb(zzO());
    if (l != Long.MIN_VALUE)
    {
      if (!this.zzk) {
        l = Math.max(this.zzi, l);
      }
      this.zzi = l;
      this.zzk = false;
    }
  }
  
  private final int zzaz(zzrp paramzzrp, zzam paramzzam)
  {
    if (("OMX.google.raw.decoder".equals(paramzzrp.zza)) && (zzfn.zza < 24) && ((zzfn.zza != 23) || (!zzfn.zzD(this.zzb)))) {
      return -1;
    }
    return paramzzam.zzn;
  }
  
  public final String zzM()
  {
    return "MediaCodecAudioRenderer";
  }
  
  public final boolean zzO()
  {
    return (super.zzO()) && (this.zzd.zzv());
  }
  
  public final boolean zzP()
  {
    return (this.zzd.zzu()) || (super.zzP());
  }
  
  protected final float zzR(float paramFloat, zzam paramzzam, zzam[] paramArrayOfzzam)
  {
    int i = 0;
    int j;
    for (int k = -1; i < paramArrayOfzzam.length; k = j)
    {
      int m = paramArrayOfzzam[i].zzA;
      j = k;
      if (m != -1) {
        j = Math.max(k, m);
      }
      i++;
    }
    if (k == -1) {
      return -1.0F;
    }
    return k * paramFloat;
  }
  
  protected final int zzS(zzrv paramzzrv, zzam paramzzam)
    throws zzsc
  {
    boolean bool = zzcd.zzf(paramzzam.zzm);
    int i1 = 128;
    if (!bool) {
      return 128;
    }
    int i;
    if (zzfn.zza >= 21) {
      i = 32;
    } else {
      i = 0;
    }
    int j = paramzzam.zzF;
    bool = zzay(paramzzam);
    if ((bool) && (this.zzd.zzw(paramzzam)) && ((j == 0) || (zzsi.zzd() != null))) {
      return i | 0x8C;
    }
    if (("audio/raw".equals(paramzzam.zzm)) && (!this.zzd.zzw(paramzzam))) {
      return 129;
    }
    if (!this.zzd.zzw(zzfn.zzu(2, paramzzam.zzz, paramzzam.zzA))) {
      return 129;
    }
    List localList = zzaA(paramzzrv, paramzzam, false, this.zzd);
    if (localList.isEmpty()) {
      return 129;
    }
    if (!bool) {
      return 130;
    }
    paramzzrv = (zzrp)localList.get(0);
    bool = paramzzrv.zze(paramzzam);
    if (!bool) {
      for (j = 1; j < localList.size(); j++)
      {
        zzrp localzzrp = (zzrp)localList.get(j);
        if (localzzrp.zze(paramzzam))
        {
          paramzzrv = localzzrp;
          j = 0;
          bool = true;
          break label267;
        }
      }
    }
    j = 1;
    label267:
    int k;
    if (true != bool) {
      k = 3;
    } else {
      k = 4;
    }
    int n = 8;
    int m = n;
    if (bool)
    {
      m = n;
      if (paramzzrv.zzf(paramzzam)) {
        m = 16;
      }
    }
    if (true != paramzzrv.zzg) {
      n = 0;
    } else {
      n = 64;
    }
    if (1 != j) {
      i1 = 0;
    }
    return k | m | i | n | i1;
  }
  
  protected final zzht zzT(zzrp paramzzrp, zzam paramzzam1, zzam paramzzam2)
  {
    zzht localzzht = paramzzrp.zzb(paramzzam1, paramzzam2);
    int j = localzzht.zze;
    int i = j;
    if (zzaz(paramzzrp, paramzzam2) > this.zze) {
      i = j | 0x40;
    }
    paramzzrp = paramzzrp.zza;
    if (i != 0)
    {
      j = 0;
    }
    else
    {
      j = localzzht.zzd;
      i = 0;
    }
    return new zzht(paramzzrp, paramzzam1, paramzzam2, j, i);
  }
  
  protected final zzht zzU(zzkf paramzzkf)
    throws zzia
  {
    zzam localzzam = paramzzkf.zza;
    Objects.requireNonNull(localzzam);
    this.zzg = localzzam;
    paramzzkf = super.zzU(paramzzkf);
    this.zzc.zzg(this.zzg, paramzzkf);
    return paramzzkf;
  }
  
  protected final zzrk zzX(zzrp paramzzrp, zzam paramzzam, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    paramMediaCrypto = zzL();
    int m = paramMediaCrypto.length;
    int i = zzaz(paramzzrp, paramzzam);
    int k;
    if (m == 1)
    {
      k = i;
    }
    else
    {
      int j = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        localObject = paramMediaCrypto[j];
        k = i;
        if (paramzzrp.zzb(paramzzam, (zzam)localObject).zzd != 0) {
          k = Math.max(i, zzaz(paramzzrp, (zzam)localObject));
        }
        j++;
        i = k;
      }
    }
    this.zze = k;
    paramMediaCrypto = paramzzrp.zza;
    boolean bool;
    if ((zzfn.zza < 24) && ("OMX.SEC.aac.dec".equals(paramMediaCrypto)) && ("samsung".equals(zzfn.zzc)) && ((zzfn.zzb.startsWith("zeroflte")) || (zzfn.zzb.startsWith("herolte")) || (zzfn.zzb.startsWith("heroqlte")))) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzf = bool;
    paramMediaCrypto = paramzzrp.zzc;
    i = this.zze;
    Object localObject = new MediaFormat();
    ((MediaFormat)localObject).setString("mime", paramMediaCrypto);
    ((MediaFormat)localObject).setInteger("channel-count", paramzzam.zzz);
    ((MediaFormat)localObject).setInteger("sample-rate", paramzzam.zzA);
    zzet.zzb((MediaFormat)localObject, paramzzam.zzo);
    zzet.zza((MediaFormat)localObject, "max-input-size", i);
    if (zzfn.zza >= 23)
    {
      ((MediaFormat)localObject).setInteger("priority", 0);
      if ((paramFloat != -1.0F) && ((zzfn.zza != 23) || ((!"ZTE B2017G".equals(zzfn.zzd)) && (!"AXON 7 mini".equals(zzfn.zzd))))) {
        ((MediaFormat)localObject).setFloat("operating-rate", paramFloat);
      }
    }
    if ((zzfn.zza <= 28) && ("audio/ac4".equals(paramzzam.zzm))) {
      ((MediaFormat)localObject).setInteger("ac4-is-sync", 1);
    }
    if ((zzfn.zza >= 24) && (this.zzd.zza(zzfn.zzu(4, paramzzam.zzz, paramzzam.zzA)) == 2)) {
      ((MediaFormat)localObject).setInteger("pcm-encoding", 4);
    }
    if (zzfn.zza >= 32) {
      ((MediaFormat)localObject).setInteger("max-output-channel-count", 99);
    }
    if (("audio/raw".equals(paramzzrp.zzb)) && (!"audio/raw".equals(paramzzam.zzm))) {
      paramMediaCrypto = paramzzam;
    } else {
      paramMediaCrypto = null;
    }
    this.zzh = paramMediaCrypto;
    return zzrk.zza(paramzzrp, (MediaFormat)localObject, paramzzam, null);
  }
  
  protected final List zzY(zzrv paramzzrv, zzam paramzzam, boolean paramBoolean)
    throws zzsc
  {
    return zzsi.zzg(zzaA(paramzzrv, paramzzam, false, this.zzd), paramzzam);
  }
  
  protected final void zzZ(Exception paramException)
  {
    zzer.zzc("MediaCodecAudioRenderer", "Audio codec error", paramException);
    this.zzc.zza(paramException);
  }
  
  public final long zza()
  {
    if (zzbc() == 2) {
      zzaB();
    }
    return this.zzi;
  }
  
  protected final void zzaa(String paramString, zzrk paramzzrk, long paramLong1, long paramLong2)
  {
    this.zzc.zzc(paramString, paramLong1, paramLong2);
  }
  
  protected final void zzab(String paramString)
  {
    this.zzc.zzd(paramString);
  }
  
  protected final void zzac(zzam paramzzam, MediaFormat paramMediaFormat)
    throws zzia
  {
    zzam localzzam = this.zzh;
    Object localObject = null;
    int[] arrayOfInt = null;
    if (localzzam != null)
    {
      paramzzam = localzzam;
      paramMediaFormat = (MediaFormat)localObject;
    }
    else if (zzal() == null)
    {
      paramMediaFormat = (MediaFormat)localObject;
    }
    else
    {
      int i;
      if ("audio/raw".equals(paramzzam.zzm)) {
        i = paramzzam.zzB;
      } else if ((zzfn.zza >= 24) && (paramMediaFormat.containsKey("pcm-encoding"))) {
        i = paramMediaFormat.getInteger("pcm-encoding");
      } else if (paramMediaFormat.containsKey("v-bits-per-sample")) {
        i = zzfn.zzj(paramMediaFormat.getInteger("v-bits-per-sample"));
      } else {
        i = 2;
      }
      localObject = new zzak();
      ((zzak)localObject).zzS("audio/raw");
      ((zzak)localObject).zzN(i);
      ((zzak)localObject).zzC(paramzzam.zzC);
      ((zzak)localObject).zzD(paramzzam.zzD);
      ((zzak)localObject).zzw(paramMediaFormat.getInteger("channel-count"));
      ((zzak)localObject).zzT(paramMediaFormat.getInteger("sample-rate"));
      localObject = ((zzak)localObject).zzY();
      paramMediaFormat = arrayOfInt;
      if (this.zzf)
      {
        paramMediaFormat = arrayOfInt;
        if (((zzam)localObject).zzz == 6)
        {
          i = paramzzam.zzz;
          paramMediaFormat = arrayOfInt;
          if (i < 6)
          {
            arrayOfInt = new int[i];
            for (i = 0;; i++)
            {
              paramMediaFormat = arrayOfInt;
              if (i >= paramzzam.zzz) {
                break;
              }
              arrayOfInt[i] = i;
            }
          }
        }
      }
      paramzzam = (zzam)localObject;
    }
    try
    {
      this.zzd.zzd(paramzzam, 0, paramMediaFormat);
      return;
    }
    catch (zzou paramzzam)
    {
      throw zzbe(paramzzam, paramzzam.zza, false, 5001);
    }
  }
  
  protected final void zzad()
  {
    this.zzk = true;
  }
  
  protected final void zzae()
  {
    this.zzd.zzf();
  }
  
  protected final void zzaf(zzhi paramzzhi)
  {
    if ((this.zzj) && (!paramzzhi.zzf()))
    {
      if (Math.abs(paramzzhi.zzd - this.zzi) > 500000L) {
        this.zzi = paramzzhi.zzd;
      }
      this.zzj = false;
    }
  }
  
  protected final void zzag()
    throws zzia
  {
    try
    {
      this.zzd.zzi();
      return;
    }
    catch (zzoy localzzoy)
    {
      throw zzbe(localzzoy, localzzoy.zzc, localzzoy.zzb, 5002);
    }
  }
  
  protected final boolean zzah(long paramLong1, long paramLong2, zzrm paramzzrm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, zzam paramzzam)
    throws zzia
  {
    Objects.requireNonNull(paramByteBuffer);
    if ((this.zzh != null) && ((paramInt2 & 0x2) != 0))
    {
      Objects.requireNonNull(paramzzrm);
      paramzzrm.zzn(paramInt1, false);
      return true;
    }
    if (paramBoolean1)
    {
      if (paramzzrm != null) {
        paramzzrm.zzn(paramInt1, false);
      }
      paramzzrm = this.zza;
      paramzzrm.zzf += paramInt3;
      this.zzd.zzf();
      return true;
    }
    try
    {
      paramBoolean1 = this.zzd.zzt(paramByteBuffer, paramLong3, paramInt3);
      if (paramBoolean1)
      {
        if (paramzzrm != null) {
          paramzzrm.zzn(paramInt1, false);
        }
        paramzzrm = this.zza;
        paramzzrm.zze += paramInt3;
        return true;
      }
      return false;
    }
    catch (zzoy paramzzrm)
    {
      throw zzbe(paramzzrm, paramzzam, paramzzrm.zzb, 5002);
    }
    catch (zzov paramzzrm)
    {
      throw zzbe(paramzzrm, this.zzg, paramzzrm.zzb, 5001);
    }
  }
  
  protected final boolean zzai(zzam paramzzam)
  {
    return this.zzd.zzw(paramzzam);
  }
  
  public final zzci zzc()
  {
    return this.zzd.zzc();
  }
  
  public final void zzg(zzci paramzzci)
  {
    this.zzd.zzo(paramzzci);
  }
  
  public final zzkh zzi()
  {
    return this;
  }
  
  public final void zzq(int paramInt, Object paramObject)
    throws zzia
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 6)
        {
          switch (paramInt)
          {
          default: 
            break;
          case 12: 
            if (zzfn.zza >= 23) {
              zzpz.zza(this.zzd, paramObject);
            }
            return;
          case 11: 
            this.zzm = ((zzld)paramObject);
            return;
          case 10: 
            this.zzd.zzl(((Integer)paramObject).intValue());
            return;
          }
          this.zzd.zzr(((Boolean)paramObject).booleanValue());
          return;
        }
        paramObject = (zzl)paramObject;
        this.zzd.zzm((zzl)paramObject);
        return;
      }
      paramObject = (zzk)paramObject;
      this.zzd.zzk((zzk)paramObject);
      return;
    }
    this.zzd.zzs(((Float)paramObject).floatValue());
  }
  
  /* Error */
  protected final void zzt()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 549	com/google/android/gms/internal/ads/zzqc:zzl	Z
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 255	com/google/android/gms/internal/ads/zzqc:zzg	Lcom/google/android/gms/internal/ads/zzam;
    //   10: aload_0
    //   11: getfield 42	com/google/android/gms/internal/ads/zzqc:zzd	Lcom/google/android/gms/internal/ads/zzoz;
    //   14: invokeinterface 551 1 0
    //   19: aload_0
    //   20: invokespecial 553	com/google/android/gms/internal/ads/zzrt:zzt	()V
    //   23: aload_0
    //   24: getfield 49	com/google/android/gms/internal/ads/zzqc:zzc	Lcom/google/android/gms/internal/ads/zzos;
    //   27: aload_0
    //   28: getfield 483	com/google/android/gms/internal/ads/zzqc:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   31: invokevirtual 556	com/google/android/gms/internal/ads/zzos:zze	(Lcom/google/android/gms/internal/ads/zzhs;)V
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: getfield 49	com/google/android/gms/internal/ads/zzqc:zzc	Lcom/google/android/gms/internal/ads/zzos;
    //   40: aload_0
    //   41: getfield 483	com/google/android/gms/internal/ads/zzqc:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   44: invokevirtual 556	com/google/android/gms/internal/ads/zzos:zze	(Lcom/google/android/gms/internal/ads/zzhs;)V
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_0
    //   51: invokespecial 553	com/google/android/gms/internal/ads/zzrt:zzt	()V
    //   54: aload_0
    //   55: getfield 49	com/google/android/gms/internal/ads/zzqc:zzc	Lcom/google/android/gms/internal/ads/zzos;
    //   58: aload_0
    //   59: getfield 483	com/google/android/gms/internal/ads/zzqc:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   62: invokevirtual 556	com/google/android/gms/internal/ads/zzos:zze	(Lcom/google/android/gms/internal/ads/zzhs;)V
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 49	com/google/android/gms/internal/ads/zzqc:zzc	Lcom/google/android/gms/internal/ads/zzos;
    //   72: aload_0
    //   73: getfield 483	com/google/android/gms/internal/ads/zzqc:zza	Lcom/google/android/gms/internal/ads/zzhs;
    //   76: invokevirtual 556	com/google/android/gms/internal/ads/zzos:zze	(Lcom/google/android/gms/internal/ads/zzhs;)V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	zzqc
    //   35	13	1	localObject1	Object
    //   49	17	1	localObject2	Object
    //   67	13	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   19	23	35	finally
    //   10	19	49	finally
    //   50	54	67	finally
  }
  
  protected final void zzu(boolean paramBoolean1, boolean paramBoolean2)
    throws zzia
  {
    super.zzu(paramBoolean1, paramBoolean2);
    this.zzc.zzf(this.zza);
    zzk();
    this.zzd.zzp(zzl());
  }
  
  protected final void zzv(long paramLong, boolean paramBoolean)
    throws zzia
  {
    super.zzv(paramLong, paramBoolean);
    this.zzd.zze();
    this.zzi = paramLong;
    this.zzj = true;
    this.zzk = true;
  }
  
  protected final void zzw()
  {
    try
    {
      super.zzw();
      if (this.zzl)
      {
        this.zzl = false;
        this.zzd.zzj();
      }
      return;
    }
    finally
    {
      if (this.zzl)
      {
        this.zzl = false;
        this.zzd.zzj();
      }
    }
  }
  
  protected final void zzx()
  {
    this.zzd.zzh();
  }
  
  protected final void zzy()
  {
    zzaB();
    this.zzd.zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */