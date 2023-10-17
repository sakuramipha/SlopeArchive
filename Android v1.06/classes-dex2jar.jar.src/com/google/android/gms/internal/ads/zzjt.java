package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

final class zzjt
  extends zzm
  implements zzil
{
  public static final int zzd = 0;
  private final zzlq zzA;
  private final zzlr zzB;
  private final long zzC;
  private int zzD;
  private int zzE;
  private boolean zzF;
  private int zzG;
  private zzlh zzH;
  private zzcm zzI;
  private zzbw zzJ;
  private zzbw zzK;
  private zzam zzL;
  private zzam zzM;
  private AudioTrack zzN;
  private Object zzO;
  private Surface zzP;
  private int zzQ;
  private zzff zzR;
  private zzhs zzS;
  private zzhs zzT;
  private int zzU;
  private zzk zzV;
  private float zzW;
  private boolean zzX;
  private zzdx zzY;
  private boolean zzZ;
  private boolean zzaa;
  private zzz zzab;
  private zzdn zzac;
  private zzbw zzad;
  private zzky zzae;
  private int zzaf;
  private long zzag;
  private final zzjg zzah;
  private zzvf zzai;
  final zzxe zzb;
  final zzcm zzc;
  private final zzeb zze;
  private final Context zzf;
  private final zzcq zzg;
  private final zzle[] zzh;
  private final zzxd zzi;
  private final zzei zzj;
  private final zzkd zzk;
  private final zzeo zzl;
  private final CopyOnWriteArraySet zzm;
  private final zzcu zzn;
  private final List zzo;
  private final boolean zzp;
  private final zztk zzq;
  private final zzls zzr;
  private final Looper zzs;
  private final zzxl zzt;
  private final zzdz zzu;
  private final zzjp zzv;
  private final zzjr zzw;
  private final zzhm zzx;
  private final zzhq zzy;
  private final zzlp zzz;
  
  static
  {
    zzbr.zzb("media3.exoplayer");
  }
  
  public zzjt(zzik paramzzik, zzcq paramzzcq)
  {
    zzeb localzzeb = new zzeb(zzdz.zza);
    this.zze = localzzeb;
    try
    {
      Object localObject3 = Integer.toHexString(System.identityHashCode(this));
      Object localObject2 = zzfn.zze;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Init ");
      ((StringBuilder)localObject1).append((String)localObject3);
      ((StringBuilder)localObject1).append(" [AndroidXMedia3/1.0.1] [");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append("]");
      zzer.zzd("ExoPlayerImpl", ((StringBuilder)localObject1).toString());
      Context localContext = paramzzik.zza.getApplicationContext();
      this.zzf = localContext;
      Object localObject4 = paramzzik.zzh.apply(paramzzik.zzb);
      this.zzr = ((zzls)localObject4);
      this.zzV = paramzzik.zzj;
      this.zzQ = paramzzik.zzk;
      this.zzX = false;
      this.zzC = paramzzik.zzo;
      localObject3 = new com/google/android/gms/internal/ads/zzjp;
      ((zzjp)localObject3).<init>(this, null);
      this.zzv = ((zzjp)localObject3);
      localObject2 = new com/google/android/gms/internal/ads/zzjr;
      ((zzjr)localObject2).<init>(null);
      this.zzw = ((zzjr)localObject2);
      Handler localHandler = new android/os/Handler;
      localHandler.<init>(paramzzik.zzi);
      zzle[] arrayOfzzle = ((zzie)paramzzik.zzc).zza.zza(localHandler, (zzzj)localObject3, (zzot)localObject3, (zzvn)localObject3, (zzsl)localObject3);
      this.zzh = arrayOfzzle;
      int i = arrayOfzzle.length;
      localObject1 = (zzxd)paramzzik.zze.zza();
      this.zzi = ((zzxd)localObject1);
      this.zzq = zzik.zza(((zzif)paramzzik.zzd).zza);
      zzxp localzzxp = zzxp.zzg(((zzii)paramzzik.zzg).zza);
      this.zzt = localzzxp;
      this.zzp = paramzzik.zzl;
      this.zzH = paramzzik.zzm;
      Looper localLooper = paramzzik.zzi;
      this.zzs = localLooper;
      zzdz localzzdz = paramzzik.zzb;
      this.zzu = localzzdz;
      this.zzg = paramzzcq;
      zzeo localzzeo = new com/google/android/gms/internal/ads/zzeo;
      Object localObject5 = new com/google/android/gms/internal/ads/zzjf;
      ((zzjf)localObject5).<init>(this);
      localzzeo.<init>(localLooper, localzzdz, (zzem)localObject5);
      this.zzl = localzzeo;
      localObject5 = new java/util/concurrent/CopyOnWriteArraySet;
      ((CopyOnWriteArraySet)localObject5).<init>();
      this.zzm = ((CopyOnWriteArraySet)localObject5);
      Object localObject6 = new java/util/ArrayList;
      ((ArrayList)localObject6).<init>();
      this.zzo = ((List)localObject6);
      localObject6 = new com/google/android/gms/internal/ads/zzvf;
      ((zzvf)localObject6).<init>(0);
      this.zzai = ((zzvf)localObject6);
      localObject6 = new com/google/android/gms/internal/ads/zzxe;
      i = arrayOfzzle.length;
      ((zzxe)localObject6).<init>(new zzlg[2], new zzwx[2], zzdi.zza, null);
      this.zzb = ((zzxe)localObject6);
      Object localObject7 = new com/google/android/gms/internal/ads/zzcu;
      ((zzcu)localObject7).<init>();
      this.zzn = ((zzcu)localObject7);
      localObject7 = new com/google/android/gms/internal/ads/zzck;
      ((zzck)localObject7).<init>();
      ((zzck)localObject7).zzc(new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 32 });
      ((zzxd)localObject1).zzl();
      ((zzck)localObject7).zzd(29, true);
      localObject7 = ((zzck)localObject7).zze();
      this.zzc = ((zzcm)localObject7);
      Object localObject8 = new com/google/android/gms/internal/ads/zzck;
      ((zzck)localObject8).<init>();
      ((zzck)localObject8).zzb((zzcm)localObject7);
      ((zzck)localObject8).zza(4);
      ((zzck)localObject8).zza(10);
      this.zzI = ((zzck)localObject8).zze();
      this.zzj = localzzdz.zzb(localLooper, null);
      localObject7 = new com/google/android/gms/internal/ads/zzjg;
      ((zzjg)localObject7).<init>(this);
      this.zzah = ((zzjg)localObject7);
      this.zzae = zzky.zzi((zzxe)localObject6);
      ((zzls)localObject4).zzS(paramzzcq, localLooper);
      if (zzfn.zza < 31)
      {
        paramzzcq = new com/google/android/gms/internal/ads/zzof;
        paramzzcq.<init>();
      }
      for (;;)
      {
        break;
        paramzzcq = zzji.zza(localContext, this, paramzzik.zzp);
      }
      localObject8 = new com/google/android/gms/internal/ads/zzkd;
      ((zzkd)localObject8).<init>(arrayOfzzle, (zzxd)localObject1, (zzxe)localObject6, (zzkg)paramzzik.zzf.zza(), localzzxp, 0, false, (zzls)localObject4, this.zzH, paramzzik.zzr, paramzzik.zzn, false, localLooper, localzzdz, (zzjg)localObject7, paramzzcq, null);
      this.zzk = ((zzkd)localObject8);
      this.zzW = 1.0F;
      this.zzJ = zzbw.zza;
      paramzzcq = zzbw.zza;
      this.zzK = paramzzcq;
      this.zzad = paramzzcq;
      this.zzaf = -1;
      if (zzfn.zza >= 21)
      {
        paramzzcq = (AudioManager)localContext.getSystemService("audio");
        if (paramzzcq == null) {
          i = -1;
        } else {
          i = paramzzcq.generateAudioSessionId();
        }
        this.zzU = i;
      }
      else
      {
        paramzzcq = this.zzN;
        if ((paramzzcq != null) && (paramzzcq.getAudioSessionId() != 0))
        {
          this.zzN.release();
          this.zzN = null;
        }
        if (this.zzN == null)
        {
          paramzzcq = new android/media/AudioTrack;
          paramzzcq.<init>(3, 4000, 4, 2, 2, 0, 0);
          this.zzN = paramzzcq;
        }
        this.zzU = this.zzN.getAudioSessionId();
      }
      this.zzY = zzdx.zza;
      this.zzZ = true;
      Objects.requireNonNull(localObject4);
      localzzeo.zzb(localObject4);
      paramzzcq = new android/os/Handler;
      paramzzcq.<init>(localLooper);
      localzzxp.zze(paramzzcq, (zzxk)localObject4);
      ((CopyOnWriteArraySet)localObject5).add(localObject3);
      paramzzcq = new com/google/android/gms/internal/ads/zzhm;
      paramzzcq.<init>(paramzzik.zza, localHandler, (zzhl)localObject3);
      this.zzx = paramzzcq;
      paramzzcq = new com/google/android/gms/internal/ads/zzhq;
      paramzzcq.<init>(paramzzik.zza, localHandler, (zzhp)localObject3);
      this.zzy = paramzzcq;
      zzfn.zzB(null, null);
      paramzzcq = new com/google/android/gms/internal/ads/zzlp;
      paramzzcq.<init>(paramzzik.zza, localHandler, (zzll)localObject3);
      this.zzz = paramzzcq;
      i = this.zzV.zzc;
      paramzzcq.zzf(3);
      localObject3 = new com/google/android/gms/internal/ads/zzlq;
      ((zzlq)localObject3).<init>(paramzzik.zza);
      this.zzA = ((zzlq)localObject3);
      localObject3 = new com/google/android/gms/internal/ads/zzlr;
      ((zzlr)localObject3).<init>(paramzzik.zza);
      this.zzB = ((zzlr)localObject3);
      this.zzab = zzah(paramzzcq);
      this.zzac = zzdn.zza;
      this.zzR = zzff.zza;
      ((zzxd)localObject1).zzi(this.zzV);
      zzal(1, 10, Integer.valueOf(this.zzU));
      zzal(2, 10, Integer.valueOf(this.zzU));
      zzal(1, 3, this.zzV);
      zzal(2, 4, Integer.valueOf(this.zzQ));
      zzal(2, 5, Integer.valueOf(0));
      zzal(1, 9, Boolean.valueOf(this.zzX));
      zzal(2, 7, localObject2);
      zzal(6, 8, localObject2);
      return;
    }
    finally
    {
      this.zze.zze();
    }
  }
  
  private final int zzab()
  {
    if (this.zzae.zza.zzo()) {
      return this.zzaf;
    }
    zzky localzzky = this.zzae;
    return localzzky.zza.zzn(localzzky.zzb.zza, this.zzn).zzd;
  }
  
  private static int zzac(boolean paramBoolean, int paramInt)
  {
    if ((paramBoolean) && (paramInt != 1)) {
      return 2;
    }
    return 1;
  }
  
  private final long zzad(zzky paramzzky)
  {
    if (paramzzky.zza.zzo()) {
      return zzfn.zzo(this.zzag);
    }
    long l;
    if (paramzzky.zzo) {
      l = paramzzky.zza();
    } else {
      l = paramzzky.zzr;
    }
    if (paramzzky.zzb.zzb()) {
      return l;
    }
    zzaf(paramzzky.zza, paramzzky.zzb, l);
    return l;
  }
  
  private static long zzae(zzky paramzzky)
  {
    zzcw localzzcw = new zzcw();
    zzcu localzzcu = new zzcu();
    paramzzky.zza.zzn(paramzzky.zzb.zza, localzzcu);
    long l2 = paramzzky.zzc;
    long l1 = l2;
    if (l2 == -9223372036854775807L)
    {
      paramzzky = paramzzky.zza;
      int i = localzzcu.zzd;
      l1 = 0L;
      l2 = paramzzky.zze(i, localzzcw, 0L).zzm;
    }
    return l1;
  }
  
  private final long zzaf(zzcx paramzzcx, zztl paramzztl, long paramLong)
  {
    paramzzcx.zzn(paramzztl.zza, this.zzn);
    return paramLong;
  }
  
  private final Pair zzag(zzcx paramzzcx, int paramInt, long paramLong)
  {
    if (paramzzcx.zzo())
    {
      this.zzaf = paramInt;
      long l = paramLong;
      if (paramLong == -9223372036854775807L) {
        l = 0L;
      }
      this.zzag = l;
      return null;
    }
    int i;
    if (paramInt != -1)
    {
      i = paramInt;
      if (paramInt < paramzzcx.zzc()) {}
    }
    else
    {
      i = paramzzcx.zzg(false);
      paramLong = paramzzcx.zze(i, this.zza, 0L).zzm;
      paramLong = zzfn.zzq(0L);
    }
    return paramzzcx.zzl(this.zza, this.zzn, i, zzfn.zzo(paramLong));
  }
  
  private static zzz zzah(zzlp paramzzlp)
  {
    zzx localzzx = new zzx(0);
    localzzx.zzd(paramzzlp.zzb());
    localzzx.zzc(paramzzlp.zza());
    return localzzx.zze();
  }
  
  private final zzky zzai(zzky paramzzky, zzcx paramzzcx, Pair paramPair)
  {
    boolean bool3;
    if ((!paramzzcx.zzo()) && (paramPair == null)) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    zzdy.zzd(bool3);
    zzcx localzzcx = paramzzky.zza;
    zzky localzzky = paramzzky.zzh(paramzzcx);
    if (paramzzcx.zzo())
    {
      paramzzky = zzky.zzj();
      l1 = zzfn.zzo(this.zzag);
      paramzzky = localzzky.zzd(paramzzky, l1, l1, l1, 0L, zzvk.zza, this.zzb, zzfrr.zzl()).zzc(paramzzky);
      paramzzky.zzp = paramzzky.zzr;
      return paramzzky;
    }
    paramzzky = localzzky.zzb.zza;
    int i = zzfn.zza;
    boolean bool1 = paramzzky.equals(paramPair.first) ^ true;
    zztl localzztl;
    if (bool1) {
      localzztl = new zztl(paramPair.first);
    } else {
      localzztl = localzzky.zzb;
    }
    long l2 = ((Long)paramPair.second).longValue();
    long l1 = zzfn.zzo(zzj());
    if (!localzzcx.zzo()) {
      localzzcx.zzn(paramzzky, this.zzn);
    }
    int j;
    if (!bool1)
    {
      boolean bool2 = l2 < l1;
      if (!bool2)
      {
        if (!bool2)
        {
          j = paramzzcx.zza(localzzky.zzk.zza);
          if (j != -1)
          {
            paramzzky = localzzky;
            if (paramzzcx.zzd(j, this.zzn, false).zzd == paramzzcx.zzn(localzztl.zza, this.zzn).zzd) {}
          }
          else
          {
            paramzzcx.zzn(localzztl.zza, this.zzn);
            if (localzztl.zzb()) {
              l1 = this.zzn.zzh(localzztl.zzb, localzztl.zzc);
            } else {
              l1 = this.zzn.zze;
            }
            paramzzky = localzzky.zzd(localzztl, localzzky.zzr, localzzky.zzr, localzzky.zzd, l1 - localzzky.zzr, localzzky.zzh, localzzky.zzi, localzzky.zzj).zzc(localzztl);
            paramzzky.zzp = l1;
          }
        }
        else
        {
          zzdy.zzf(localzztl.zzb() ^ true);
          long l3 = Math.max(0L, localzzky.zzq - (l2 - l1));
          l1 = localzzky.zzp;
          if (localzzky.zzk.equals(localzzky.zzb)) {
            l1 = l2 + l3;
          }
          paramzzky = localzzky.zzd(localzztl, l2, l2, l2, l3, localzzky.zzh, localzzky.zzi, localzzky.zzj);
          paramzzky.zzp = l1;
        }
        return paramzzky;
      }
    }
    zzdy.zzf(localzztl.zzb() ^ true);
    if (j != 0) {
      paramzzky = zzvk.zza;
    } else {
      paramzzky = localzzky.zzh;
    }
    if (j != 0) {
      paramzzcx = this.zzb;
    } else {
      paramzzcx = localzzky.zzi;
    }
    if (j != 0) {
      paramPair = zzfrr.zzl();
    } else {
      paramPair = localzzky.zzj;
    }
    paramzzky = localzzky.zzd(localzztl, l2, l2, l2, 0L, paramzzky, paramzzcx, paramPair).zzc(localzztl);
    paramzzky.zzp = l2;
    return paramzzky;
  }
  
  private final zzlb zzaj(zzla paramzzla)
  {
    int i = zzab();
    zzkd localzzkd = this.zzk;
    zzcx localzzcx = this.zzae.zza;
    if (i == -1) {
      i = 0;
    }
    return new zzlb(localzzkd, paramzzla, localzzcx, i, this.zzu, localzzkd.zzb());
  }
  
  private final void zzak(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.zzR.zzb()) && (paramInt2 == this.zzR.zza())) {
      return;
    }
    this.zzR = new zzff(paramInt1, paramInt2);
    zzeo localzzeo = this.zzl;
    localzzeo.zzd(24, new zzin(paramInt1, paramInt2));
    localzzeo.zzc();
    zzal(2, 14, new zzff(paramInt1, paramInt2));
  }
  
  private final void zzal(int paramInt1, int paramInt2, Object paramObject)
  {
    zzle[] arrayOfzzle = this.zzh;
    int i = arrayOfzzle.length;
    for (i = 0; i < 2; i++)
    {
      Object localObject = arrayOfzzle[i];
      if (((zzle)localObject).zzb() == paramInt1)
      {
        localObject = zzaj((zzla)localObject);
        ((zzlb)localObject).zzf(paramInt2);
        ((zzlb)localObject).zze(paramObject);
        ((zzlb)localObject).zzd();
      }
    }
  }
  
  private final void zzam()
  {
    zzal(1, 2, Float.valueOf(this.zzW * this.zzy.zza()));
  }
  
  private final void zzan(Object paramObject)
  {
    Object localObject1 = new ArrayList();
    Object localObject3 = this.zzh;
    int i = localObject3.length;
    int m = 0;
    int k = 0;
    for (i = 0; i < 2; i++)
    {
      Object localObject4 = localObject3[i];
      if (((zzle)localObject4).zzb() == 2)
      {
        localObject4 = zzaj((zzla)localObject4);
        ((zzlb)localObject4).zzf(1);
        ((zzlb)localObject4).zze(paramObject);
        ((zzlb)localObject4).zzd();
        ((List)localObject1).add(localObject4);
      }
    }
    localObject3 = this.zzO;
    int j = m;
    if (localObject3 != null)
    {
      j = m;
      if (localObject3 != paramObject)
      {
        try
        {
          localObject1 = ((List)localObject1).iterator();
          for (;;)
          {
            i = k;
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            ((zzlb)((Iterator)localObject1).next()).zzi(this.zzC);
          }
          localObject2 = this.zzO;
        }
        catch (TimeoutException localTimeoutException)
        {
          i = 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          i = k;
        }
        Object localObject2;
        localObject3 = this.zzP;
        j = i;
        if (localObject2 == localObject3)
        {
          ((Surface)localObject3).release();
          this.zzP = null;
          j = i;
        }
      }
    }
    this.zzO = paramObject;
    if (j != 0) {
      zzao(zzia.zzd(new zzke(3), 1003));
    }
  }
  
  private final void zzao(zzia paramzzia)
  {
    Object localObject = this.zzae;
    localObject = ((zzky)localObject).zzc(((zzky)localObject).zzb);
    ((zzky)localObject).zzp = ((zzky)localObject).zzr;
    ((zzky)localObject).zzq = 0L;
    zzky localzzky = ((zzky)localObject).zzg(1);
    localObject = localzzky;
    if (paramzzia != null) {
      localObject = localzzky.zzf(paramzzia);
    }
    this.zzD += 1;
    this.zzk.zzo();
    zzaq((zzky)localObject, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  private final void zzap(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int j = 0;
    if ((paramBoolean) && (paramInt1 != -1)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    int i = j;
    if (paramBoolean)
    {
      i = j;
      if (paramInt1 != 1) {
        i = 1;
      }
    }
    zzky localzzky2 = this.zzae;
    if ((localzzky2.zzl == paramBoolean) && (localzzky2.zzm == i)) {
      return;
    }
    this.zzD += 1;
    zzky localzzky1 = localzzky2;
    if (localzzky2.zzo) {
      localzzky1 = localzzky2.zzb();
    }
    localzzky1 = localzzky1.zze(paramBoolean, i);
    this.zzk.zzn(paramBoolean, i);
    zzaq(localzzky1, 0, paramInt2, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  private final void zzaq(zzky paramzzky, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3, long paramLong, int paramInt4, boolean paramBoolean3)
  {
    zzky localzzky = this.zzae;
    this.zzae = paramzzky;
    paramBoolean3 = localzzky.zza.equals(paramzzky.zza);
    Object localObject1 = Boolean.valueOf(true);
    boolean bool1 = paramBoolean3 ^ true;
    Object localObject4 = localzzky.zza;
    Object localObject5 = paramzzky.zza;
    paramBoolean3 = ((zzcx)localObject5).zzo();
    Object localObject3 = Integer.valueOf(-1);
    Object localObject2 = Boolean.valueOf(false);
    int i;
    if ((paramBoolean3) && (((zzcx)localObject4).zzo()))
    {
      localObject1 = new Pair(localObject2, localObject3);
    }
    else
    {
      if (((zzcx)localObject5).zzo() != ((zzcx)localObject4).zzo()) {
        localObject1 = new Pair(localObject1, Integer.valueOf(3));
      }
      for (;;)
      {
        break;
        if (!((zzcx)localObject4).zze(((zzcx)localObject4).zzn(localzzky.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(((zzcx)localObject5).zze(((zzcx)localObject5).zzn(paramzzky.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc))
        {
          if ((paramBoolean2) && (paramInt3 == 0))
          {
            i = 1;
          }
          else if ((paramBoolean2) && (paramInt3 == 1))
          {
            i = 2;
          }
          else
          {
            if (!bool1) {
              break label260;
            }
            i = 3;
          }
          localObject1 = new Pair(localObject1, Integer.valueOf(i));
          break;
          label260:
          throw new IllegalStateException();
        }
        else if ((paramBoolean2) && (paramInt3 == 0) && (localzzky.zzb.zzd < paramzzky.zzb.zzd))
        {
          localObject1 = new Pair(localObject1, Integer.valueOf(0));
        }
        else
        {
          localObject1 = new Pair(localObject2, localObject3);
        }
      }
    }
    paramBoolean3 = ((Boolean)((Pair)localObject1).first).booleanValue();
    int m = ((Integer)((Pair)localObject1).second).intValue();
    localObject3 = this.zzJ;
    if (paramBoolean3)
    {
      if (!paramzzky.zza.zzo())
      {
        i = paramzzky.zza.zzn(paramzzky.zzb.zza, this.zzn).zzd;
        localObject1 = paramzzky.zza.zze(i, this.zza, 0L).zzd;
      }
      else
      {
        localObject1 = null;
      }
      this.zzad = zzbw.zza;
      localObject2 = localObject1;
    }
    else
    {
      localObject2 = null;
    }
    int j;
    if (!paramBoolean3)
    {
      localObject1 = localObject3;
      if (localzzky.zzj.equals(paramzzky.zzj)) {}
    }
    else
    {
      localObject1 = this.zzad.zza();
      localObject4 = paramzzky.zzj;
      for (i = 0; i < ((List)localObject4).size(); i++)
      {
        localObject3 = (zzca)((List)localObject4).get(i);
        for (j = 0; j < ((zzca)localObject3).zza(); j++) {
          ((zzca)localObject3).zzb(j).zza((zzbu)localObject1);
        }
      }
      this.zzad = ((zzbu)localObject1).zzu();
      localObject1 = zzn();
      if (((zzcx)localObject1).zzo())
      {
        localObject1 = this.zzad;
      }
      else
      {
        localObject3 = ((zzcx)localObject1).zze(zzd(), this.zza, 0L).zzd;
        localObject1 = this.zzad.zza();
        ((zzbu)localObject1).zzb(((zzbq)localObject3).zzg);
        localObject1 = ((zzbu)localObject1).zzu();
      }
    }
    boolean bool2 = ((zzbw)localObject1).equals(this.zzJ);
    this.zzJ = ((zzbw)localObject1);
    if (localzzky.zzl != paramzzky.zzl) {
      i = 1;
    } else {
      i = 0;
    }
    if (localzzky.zze != paramzzky.zze) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) || (i != 0)) {
      zzar();
    }
    int k;
    if (localzzky.zzg != paramzzky.zzg) {
      k = 1;
    } else {
      k = 0;
    }
    if (bool1) {
      this.zzl.zzd(0, new zzio(paramzzky, paramInt1));
    }
    if (paramBoolean2)
    {
      localObject5 = new zzcu();
      if (!localzzky.zza.zzo())
      {
        localObject3 = localzzky.zzb.zza;
        localzzky.zza.zzn(localObject3, (zzcu)localObject5);
        paramInt1 = ((zzcu)localObject5).zzd;
        paramInt4 = localzzky.zza.zza(localObject3);
        localObject4 = localzzky.zza.zze(paramInt1, this.zza, 0L).zzc;
        localObject1 = this.zza.zzd;
      }
      else
      {
        paramInt1 = paramInt4;
        localObject4 = null;
        localObject1 = null;
        localObject3 = null;
        paramInt4 = -1;
      }
      if (paramInt3 == 0)
      {
        if (localzzky.zzb.zzb())
        {
          localzztl = localzzky.zzb;
          l1 = ((zzcu)localObject5).zzh(localzztl.zzb, localzztl.zzc);
          l2 = zzae(localzzky);
          break label976;
        }
        if (localzzky.zzb.zze != -1) {
          l1 = zzae(this.zzae);
        } else {
          l1 = ((zzcu)localObject5).zze;
        }
      }
      else
      {
        if (localzzky.zzb.zzb())
        {
          l1 = localzzky.zzr;
          l2 = zzae(localzzky);
          break label976;
        }
        l1 = localzzky.zzr;
      }
      long l2 = l1;
      label976:
      int n = zzfn.zza;
      localObject5 = localzzky.zzb;
      n = ((zztl)localObject5).zzb;
      int i1 = ((zztl)localObject5).zzc;
      localObject5 = new zzcp(localObject4, paramInt1, (zzbq)localObject1, localObject3, paramInt4, zzfn.zzq(l1), zzfn.zzq(l2), n, i1);
      paramInt4 = zzd();
      if (!this.zzae.zza.zzo())
      {
        localObject1 = this.zzae;
        localObject3 = ((zzky)localObject1).zzb.zza;
        ((zzky)localObject1).zza.zzn(localObject3, this.zzn);
        paramInt1 = this.zzae.zza.zza(localObject3);
        localObject1 = this.zzae.zza.zze(paramInt4, this.zza, 0L).zzc;
        localObject4 = this.zza.zzd;
      }
      else
      {
        localObject1 = null;
        localObject4 = null;
        localObject3 = null;
        paramInt1 = -1;
      }
      long l1 = zzfn.zzq(paramLong);
      if (this.zzae.zzb.zzb()) {
        paramLong = zzfn.zzq(zzae(this.zzae));
      } else {
        paramLong = l1;
      }
      zztl localzztl = this.zzae.zzb;
      localObject1 = new zzcp(localObject1, paramInt4, (zzbq)localObject4, localObject3, paramInt1, l1, paramLong, localzztl.zzb, localzztl.zzc);
      this.zzl.zzd(11, new zziu(paramInt3, (zzcp)localObject5, (zzcp)localObject1));
    }
    if (paramBoolean3) {
      this.zzl.zzd(1, new zziv((zzbq)localObject2, m));
    }
    if (localzzky.zzf != paramzzky.zzf)
    {
      this.zzl.zzd(10, new zziw(paramzzky));
      if (paramzzky.zzf != null) {
        this.zzl.zzd(10, new zzix(paramzzky));
      }
    }
    localObject2 = localzzky.zzi;
    localObject1 = paramzzky.zzi;
    if (localObject2 != localObject1)
    {
      this.zzi.zzo(((zzxe)localObject1).zze);
      this.zzl.zzd(2, new zziy(paramzzky));
    }
    if ((bool2 ^ true))
    {
      localObject1 = this.zzJ;
      this.zzl.zzd(14, new zziz((zzbw)localObject1));
    }
    if (k != 0) {
      this.zzl.zzd(3, new zzja(paramzzky));
    }
    if ((j != 0) || (i != 0)) {
      this.zzl.zzd(-1, new zzjb(paramzzky));
    }
    if (j != 0) {
      this.zzl.zzd(4, new zzjc(paramzzky));
    }
    if (i != 0) {
      this.zzl.zzd(5, new zzip(paramzzky, paramInt2));
    }
    if (localzzky.zzm != paramzzky.zzm) {
      this.zzl.zzd(6, new zziq(paramzzky));
    }
    if (localzzky.zzk() != paramzzky.zzk()) {
      this.zzl.zzd(7, new zzir(paramzzky));
    }
    if (!localzzky.zzn.equals(paramzzky.zzn)) {
      this.zzl.zzd(12, new zzis(paramzzky));
    }
    if (paramBoolean1) {
      this.zzl.zzd(-1, zzit.zza);
    }
    localObject1 = this.zzI;
    localObject3 = this.zzg;
    localObject2 = this.zzc;
    paramInt1 = zzfn.zza;
    paramBoolean2 = ((zzcq)localObject3).zzx();
    localObject4 = (zzm)localObject3;
    localObject5 = ((zzm)localObject4).zzn();
    if ((!((zzcx)localObject5).zzo()) && (((zzcx)localObject5).zze(((zzm)localObject4).zzd(), ((zzm)localObject4).zza, 0L).zzh)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    localObject5 = ((zzm)localObject4).zzn();
    if (((zzcx)localObject5).zzo()) {}
    do
    {
      paramInt2 = 0;
      break;
      paramInt2 = ((zzm)localObject4).zzd();
      ((zzm)localObject4).zzh();
      ((zzm)localObject4).zzw();
    } while (((zzcx)localObject5).zzk(paramInt2, 0, false) == -1);
    paramInt2 = 1;
    localObject5 = ((zzm)localObject4).zzn();
    if (((zzcx)localObject5).zzo()) {}
    do
    {
      paramInt3 = 0;
      break;
      paramInt3 = ((zzm)localObject4).zzd();
      ((zzm)localObject4).zzh();
      ((zzm)localObject4).zzw();
    } while (((zzcx)localObject5).zzj(paramInt3, 0, false) == -1);
    paramInt3 = 1;
    localObject5 = ((zzm)localObject4).zzn();
    if ((!((zzcx)localObject5).zzo()) && (((zzcx)localObject5).zze(((zzm)localObject4).zzd(), ((zzm)localObject4).zza, 0L).zzb())) {
      paramInt4 = 1;
    } else {
      paramInt4 = 0;
    }
    localObject5 = ((zzm)localObject4).zzn();
    if ((!((zzcx)localObject5).zzo()) && (((zzcx)localObject5).zze(((zzm)localObject4).zzd(), ((zzm)localObject4).zza, 0L).zzi)) {
      i = 1;
    } else {
      i = 0;
    }
    bool2 = ((zzcq)localObject3).zzn().zzo();
    localObject3 = new zzck();
    ((zzck)localObject3).zzb((zzcm)localObject2);
    paramBoolean3 = paramBoolean2 ^ true;
    ((zzck)localObject3).zzd(4, paramBoolean3);
    if ((paramInt1 != 0) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(5, paramBoolean1);
    if ((paramInt2 != 0) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(6, paramBoolean1);
    if ((!bool2) && ((paramInt2 != 0) || (paramInt4 == 0) || (paramInt1 != 0)) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(7, paramBoolean1);
    if ((paramInt3 != 0) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(8, paramBoolean1);
    if ((!bool2) && ((paramInt3 != 0) || ((paramInt4 != 0) && (i != 0))) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(9, paramBoolean1);
    ((zzck)localObject3).zzd(10, paramBoolean3);
    if ((paramInt1 != 0) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(11, paramBoolean1);
    if ((paramInt1 != 0) && (!paramBoolean2)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((zzck)localObject3).zzd(12, paramBoolean1);
    localObject2 = ((zzck)localObject3).zze();
    this.zzI = ((zzcm)localObject2);
    if (!((zzcm)localObject2).equals(localObject1)) {
      this.zzl.zzd(13, new zzje(this));
    }
    this.zzl.zzc();
    if (localzzky.zzo != paramzzky.zzo)
    {
      localObject1 = this.zzm.iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((zzib)((Iterator)localObject1).next()).zza(paramzzky.zzo);
      }
    }
  }
  
  private final void zzar()
  {
    int i = zzf();
    if ((i != 2) && (i != 3)) {
      return;
    }
    zzas();
    boolean bool = this.zzae.zzo;
    zzv();
    zzv();
  }
  
  private final void zzas()
  {
    this.zze.zzb();
    if (Thread.currentThread() != this.zzs.getThread())
    {
      String str = Thread.currentThread().getName();
      Object localObject = this.zzs.getThread().getName();
      str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[] { str, localObject });
      if (!this.zzZ)
      {
        if (this.zzaa) {
          localObject = null;
        } else {
          localObject = new IllegalStateException();
        }
        zzer.zzf("ExoPlayerImpl", str, (Throwable)localObject);
        this.zzaa = true;
        return;
      }
      throw new IllegalStateException(str);
    }
  }
  
  public final void zzA(zzlv paramzzlv)
  {
    zzas();
    this.zzr.zzR(paramzzlv);
  }
  
  public final void zzB(zztn paramzztn)
  {
    zzas();
    Object localObject2 = Collections.singletonList(paramzztn);
    zzas();
    zzas();
    zzab();
    zzk();
    this.zzD += 1;
    if (!this.zzo.isEmpty())
    {
      j = this.zzo.size();
      for (i = j - 1; i >= 0; i--) {
        this.zzo.remove(i);
      }
      this.zzai = this.zzai.zzh(0, j);
    }
    paramzztn = new ArrayList();
    for (int i = 0; i < ((List)localObject2).size(); i++)
    {
      localObject1 = new zzkv((zztn)((List)localObject2).get(i), this.zzp);
      paramzztn.add(localObject1);
      this.zzo.add(i, new zzjs(((zzkv)localObject1).zzb, ((zzkv)localObject1).zza.zzB()));
    }
    this.zzai = this.zzai.zzg(0, paramzztn.size());
    Object localObject1 = new zzlc(this.zzo, this.zzai);
    if ((!((zzcx)localObject1).zzo()) && (((zzcx)localObject1).zzc() < 0)) {
      throw new zzaq((zzcx)localObject1, -1, -9223372036854775807L);
    }
    int k = ((zzcx)localObject1).zzg(false);
    localObject2 = zzai(this.zzae, (zzcx)localObject1, zzag((zzcx)localObject1, k, -9223372036854775807L));
    int j = ((zzky)localObject2).zze;
    i = j;
    if (k != -1)
    {
      i = j;
      if (j != 1) {
        if ((!((zzcx)localObject1).zzo()) && (k < ((zzcx)localObject1).zzc())) {
          i = 2;
        } else {
          i = 4;
        }
      }
    }
    localObject1 = ((zzky)localObject2).zzg(i);
    this.zzk.zzq(paramzztn, k, zzfn.zzo(-9223372036854775807L), this.zzai);
    boolean bool;
    if ((!this.zzae.zzb.zza.equals(((zzky)localObject1).zzb.zza)) && (!this.zzae.zza.zzo())) {
      bool = true;
    } else {
      bool = false;
    }
    zzaq((zzky)localObject1, 0, 1, false, bool, 4, zzad((zzky)localObject1), -1, false);
  }
  
  public final zzia zzG()
  {
    zzas();
    return this.zzae.zzf;
  }
  
  public final void zza(int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    zzas();
    paramInt2 = 1;
    if (paramInt1 >= 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    zzdy.zzd(paramBoolean);
    this.zzr.zzx();
    Object localObject = this.zzae.zza;
    if ((!((zzcx)localObject).zzo()) && (paramInt1 >= ((zzcx)localObject).zzc())) {
      return;
    }
    this.zzD += 1;
    if (zzx())
    {
      zzer.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
      localObject = new zzkb(this.zzae);
      ((zzkb)localObject).zza(1);
      this.zzah.zza.zzY((zzkb)localObject);
      return;
    }
    if (zzf() != 1) {
      paramInt2 = 2;
    }
    int i = zzd();
    zzky localzzky = zzai(this.zzae.zzg(paramInt2), (zzcx)localObject, zzag((zzcx)localObject, paramInt1, paramLong));
    this.zzk.zzl((zzcx)localObject, paramInt1, zzfn.zzo(paramLong));
    zzaq(localzzky, 0, 1, true, true, 1, zzad(localzzky), i, false);
  }
  
  public final int zzb()
  {
    zzas();
    if (zzx()) {
      return this.zzae.zzb.zzb;
    }
    return -1;
  }
  
  public final int zzc()
  {
    zzas();
    if (zzx()) {
      return this.zzae.zzb.zzc;
    }
    return -1;
  }
  
  public final int zzd()
  {
    zzas();
    int j = zzab();
    int i = j;
    if (j == -1) {
      i = 0;
    }
    return i;
  }
  
  public final int zze()
  {
    zzas();
    if (this.zzae.zza.zzo()) {
      return 0;
    }
    zzky localzzky = this.zzae;
    return localzzky.zza.zza(localzzky.zzb.zza);
  }
  
  public final int zzf()
  {
    zzas();
    return this.zzae.zze;
  }
  
  public final int zzg()
  {
    zzas();
    return this.zzae.zzm;
  }
  
  public final int zzh()
  {
    zzas();
    return 0;
  }
  
  public final long zzi()
  {
    zzas();
    zzky localzzky;
    long l1;
    if (zzx())
    {
      localzzky = this.zzae;
      if (localzzky.zzk.equals(localzzky.zzb)) {
        l1 = zzfn.zzq(this.zzae.zzp);
      } else {
        l1 = zzl();
      }
      return l1;
    }
    zzas();
    if (this.zzae.zza.zzo())
    {
      l1 = this.zzag;
    }
    else
    {
      localzzky = this.zzae;
      long l2 = localzzky.zzk.zzd;
      long l3 = localzzky.zzb.zzd;
      l1 = 0L;
      if (l2 != l3)
      {
        l1 = zzfn.zzq(localzzky.zza.zze(zzd(), this.zza, 0L).zzn);
      }
      else
      {
        l2 = localzzky.zzp;
        if (this.zzae.zzk.zzb())
        {
          localzzky = this.zzae;
          localzzky.zza.zzn(localzzky.zzk.zza, this.zzn).zzi(this.zzae.zzk.zzb);
        }
        else
        {
          l1 = l2;
        }
        localzzky = this.zzae;
        zzaf(localzzky.zza, localzzky.zzk, l1);
        l1 = zzfn.zzq(l1);
      }
    }
    return l1;
  }
  
  public final long zzj()
  {
    zzas();
    if (zzx())
    {
      zzky localzzky = this.zzae;
      localzzky.zza.zzn(localzzky.zzb.zza, this.zzn);
      localzzky = this.zzae;
      long l;
      if (localzzky.zzc == -9223372036854775807L)
      {
        l = localzzky.zza.zze(zzd(), this.zza, 0L).zzm;
        l = zzfn.zzq(0L);
      }
      else
      {
        int i = zzfn.zza;
        l = zzfn.zzq(this.zzae.zzc) + zzfn.zzq(0L);
      }
      return l;
    }
    return zzk();
  }
  
  public final long zzk()
  {
    zzas();
    return zzfn.zzq(zzad(this.zzae));
  }
  
  public final long zzl()
  {
    zzas();
    if (!zzx())
    {
      localObject = zzn();
      if (((zzcx)localObject).zzo()) {
        return -9223372036854775807L;
      }
      return zzfn.zzq(((zzcx)localObject).zze(zzd(), this.zza, 0L).zzn);
    }
    zzky localzzky = this.zzae;
    Object localObject = localzzky.zzb;
    localzzky.zza.zzn(((zztl)localObject).zza, this.zzn);
    return zzfn.zzq(this.zzn.zzh(((zztl)localObject).zzb, ((zztl)localObject).zzc));
  }
  
  public final long zzm()
  {
    zzas();
    return zzfn.zzq(this.zzae.zzq);
  }
  
  public final zzcx zzn()
  {
    zzas();
    return this.zzae.zza;
  }
  
  public final zzdi zzo()
  {
    zzas();
    return this.zzae.zzi.zzd;
  }
  
  public final void zzp()
  {
    zzas();
    boolean bool = zzv();
    Object localObject = this.zzy;
    int i = 2;
    int j = ((zzhq)localObject).zzb(bool, 2);
    zzap(bool, j, zzac(bool, j));
    localObject = this.zzae;
    if (((zzky)localObject).zze != 1) {
      return;
    }
    localObject = ((zzky)localObject).zzf(null);
    if (true == ((zzky)localObject).zza.zzo()) {
      i = 4;
    }
    localObject = ((zzky)localObject).zzg(i);
    this.zzD += 1;
    this.zzk.zzk();
    zzaq((zzky)localObject, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final void zzq()
  {
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    String str1 = zzfn.zze;
    String str2 = zzbr.zza();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Release ");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" [AndroidXMedia3/1.0.1] [");
    localStringBuilder.append(str1);
    localStringBuilder.append("] [");
    localStringBuilder.append(str2);
    localStringBuilder.append("]");
    zzer.zzd("ExoPlayerImpl", localStringBuilder.toString());
    zzas();
    if (zzfn.zza < 21)
    {
      localObject = this.zzN;
      if (localObject != null)
      {
        ((AudioTrack)localObject).release();
        this.zzN = null;
      }
    }
    this.zzz.zze();
    this.zzy.zzd();
    if (!this.zzk.zzp())
    {
      localObject = this.zzl;
      ((zzeo)localObject).zzd(10, zzim.zza);
      ((zzeo)localObject).zzc();
    }
    this.zzl.zze();
    this.zzj.zze(null);
    this.zzt.zzf(this.zzr);
    localObject = this.zzae;
    if (((zzky)localObject).zzo) {
      this.zzae = ((zzky)localObject).zzb();
    }
    localObject = this.zzae.zzg(1);
    this.zzae = ((zzky)localObject);
    localObject = ((zzky)localObject).zzc(((zzky)localObject).zzb);
    this.zzae = ((zzky)localObject);
    ((zzky)localObject).zzp = ((zzky)localObject).zzr;
    this.zzae.zzq = 0L;
    this.zzr.zzQ();
    this.zzi.zzh();
    localObject = this.zzP;
    if (localObject != null)
    {
      ((Surface)localObject).release();
      this.zzP = null;
    }
    this.zzY = zzdx.zza;
  }
  
  public final void zzr(boolean paramBoolean)
  {
    zzas();
    int i = this.zzy.zzb(paramBoolean, zzf());
    zzap(paramBoolean, i, zzac(paramBoolean, i));
  }
  
  public final void zzs(Surface paramSurface)
  {
    zzas();
    zzan(paramSurface);
    int i;
    if (paramSurface == null) {
      i = 0;
    } else {
      i = -1;
    }
    zzak(i, i);
  }
  
  public final void zzt(float paramFloat)
  {
    zzas();
    paramFloat = Math.max(0.0F, Math.min(paramFloat, 1.0F));
    if (this.zzW == paramFloat) {
      return;
    }
    this.zzW = paramFloat;
    zzam();
    zzeo localzzeo = this.zzl;
    localzzeo.zzd(22, new zzjd(paramFloat));
    localzzeo.zzc();
  }
  
  public final void zzu()
  {
    zzas();
    this.zzy.zzb(zzv(), 1);
    zzao(null);
    this.zzY = new zzdx(zzfrr.zzl(), this.zzae.zzr);
  }
  
  public final boolean zzv()
  {
    zzas();
    return this.zzae.zzl;
  }
  
  public final boolean zzw()
  {
    zzas();
    return false;
  }
  
  public final boolean zzx()
  {
    zzas();
    return this.zzae.zzb.zzb();
  }
  
  public final int zzy()
  {
    zzas();
    int i = this.zzh.length;
    return 2;
  }
  
  public final void zzz(zzlv paramzzlv)
  {
    zzls localzzls = this.zzr;
    Objects.requireNonNull(paramzzlv);
    localzzls.zzw(paramzzlv);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */