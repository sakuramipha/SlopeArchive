package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class zzuo
  implements zztj, zzaar, zzxr, zzxw, zzva
{
  private static final Map zzb;
  private static final zzam zzc;
  private boolean zzA;
  private int zzB;
  private boolean zzC;
  private boolean zzD;
  private int zzE;
  private boolean zzF;
  private long zzG;
  private long zzH;
  private boolean zzI;
  private int zzJ;
  private boolean zzK;
  private boolean zzL;
  private final zzxq zzM;
  private final zzxm zzN;
  private final Uri zzd;
  private final zzfx zze;
  private final zzqr zzf;
  private final zztu zzg;
  private final zzql zzh;
  private final zzuk zzi;
  private final long zzj;
  private final zzxz zzk;
  private final zzue zzl;
  private final zzeb zzm;
  private final Runnable zzn;
  private final Runnable zzo;
  private final Handler zzp;
  private zzti zzq;
  private zzado zzr;
  private zzvb[] zzs;
  private zzum[] zzt;
  private boolean zzu;
  private boolean zzv;
  private boolean zzw;
  private zzun zzx;
  private zzabn zzy;
  private long zzz;
  
  static
  {
    Object localObject = new HashMap();
    ((Map)localObject).put("Icy-MetaData", "1");
    zzb = Collections.unmodifiableMap((Map)localObject);
    localObject = new zzak();
    ((zzak)localObject).zzH("icy");
    ((zzak)localObject).zzS("application/x-icy");
    zzc = ((zzak)localObject).zzY();
  }
  
  public zzuo(Uri paramUri, zzfx paramzzfx, zzue paramzzue, zzqr paramzzqr, zzql paramzzql, zzxq paramzzxq, zztu paramzztu, zzuk paramzzuk, zzxm paramzzxm, String paramString, int paramInt)
  {
    this.zzd = paramUri;
    this.zze = paramzzfx;
    this.zzf = paramzzqr;
    this.zzh = paramzzql;
    this.zzM = paramzzxq;
    this.zzg = paramzztu;
    this.zzi = paramzzuk;
    this.zzN = paramzzxm;
    this.zzj = paramInt;
    this.zzk = new zzxz("ProgressiveMediaPeriod");
    this.zzl = paramzzue;
    this.zzm = new zzeb(zzdz.zza);
    this.zzn = new zzuf(this);
    this.zzo = new zzug(this);
    this.zzp = zzfn.zzs(null);
    this.zzt = new zzum[0];
    this.zzs = new zzvb[0];
    this.zzH = -9223372036854775807L;
    this.zzz = -9223372036854775807L;
    this.zzB = 1;
  }
  
  private final int zzP()
  {
    zzvb[] arrayOfzzvb = this.zzs;
    int k = arrayOfzzvb.length;
    int j = 0;
    int i = 0;
    while (j < k)
    {
      i += arrayOfzzvb[j].zzc();
      j++;
    }
    return i;
  }
  
  private final long zzQ(boolean paramBoolean)
  {
    int i = 0;
    long l1;
    for (long l2 = Long.MIN_VALUE;; l2 = l1)
    {
      zzvb[] arrayOfzzvb = this.zzs;
      if (i >= arrayOfzzvb.length) {
        break;
      }
      if (!paramBoolean)
      {
        zzun localzzun = this.zzx;
        Objects.requireNonNull(localzzun);
        l1 = l2;
        if (localzzun.zzc[i] == 0) {}
      }
      else
      {
        l1 = Math.max(l2, arrayOfzzvb[i].zzg());
      }
      i++;
    }
    return l2;
  }
  
  private final zzabr zzR(zzum paramzzum)
  {
    int j = this.zzs.length;
    for (int i = 0; i < j; i++) {
      if (paramzzum.equals(this.zzt[i])) {
        return this.zzs[i];
      }
    }
    zzvb localzzvb = new zzvb(this.zzN, this.zzf, this.zzh);
    localzzvb.zzu(this);
    zzum[] arrayOfzzum = this.zzt;
    i = j + 1;
    arrayOfzzum = (zzum[])Arrays.copyOf(arrayOfzzum, i);
    arrayOfzzum[j] = paramzzum;
    int k = zzfn.zza;
    this.zzt = arrayOfzzum;
    paramzzum = (zzvb[])Arrays.copyOf(this.zzs, i);
    paramzzum[j] = localzzvb;
    this.zzs = paramzzum;
    return localzzvb;
  }
  
  @EnsuresNonNull({"trackState", "seekMap"})
  private final void zzS()
  {
    zzdy.zzf(this.zzv);
    Objects.requireNonNull(this.zzx);
    Objects.requireNonNull(this.zzy);
  }
  
  private final void zzT()
  {
    if ((!this.zzL) && (!this.zzv) && (this.zzu) && (this.zzy != null))
    {
      Object localObject1 = this.zzs;
      int j = localObject1.length;
      for (int i = 0; i < j; i++) {
        if (localObject1[i].zzh() == null) {
          return;
        }
      }
      this.zzm.zzc();
      j = this.zzs.length;
      zzcz[] arrayOfzzcz = new zzcz[j];
      boolean[] arrayOfBoolean = new boolean[j];
      for (i = 0; i < j; i++)
      {
        zzam localzzam = this.zzs[i].zzh();
        Objects.requireNonNull(localzzam);
        localObject1 = localzzam.zzm;
        boolean bool = zzcd.zzf((String)localObject1);
        int m;
        if ((!bool) && (!zzcd.zzg((String)localObject1))) {
          m = 0;
        } else {
          m = 1;
        }
        arrayOfBoolean[i] = m;
        this.zzw = (m | this.zzw);
        zzado localzzado = this.zzr;
        Object localObject2 = localzzam;
        if (localzzado != null)
        {
          if (!bool)
          {
            localObject1 = localzzam;
            if (!this.zzt[i].zzb) {}
          }
          else
          {
            localObject1 = localzzam.zzk;
            if (localObject1 == null) {
              localObject1 = new zzca(-9223372036854775807L, new zzbz[] { localzzado });
            } else {
              localObject1 = ((zzca)localObject1).zzc(new zzbz[] { localzzado });
            }
            localObject2 = localzzam.zzb();
            ((zzak)localObject2).zzM((zzca)localObject1);
            localObject1 = ((zzak)localObject2).zzY();
          }
          localObject2 = localObject1;
          if (bool)
          {
            localObject2 = localObject1;
            if (((zzam)localObject1).zzg == -1)
            {
              localObject2 = localObject1;
              if (((zzam)localObject1).zzh == -1)
              {
                int k = localzzado.zza;
                localObject2 = localObject1;
                if (k != -1)
                {
                  localObject1 = ((zzam)localObject1).zzb();
                  ((zzak)localObject1).zzv(k);
                  localObject2 = ((zzak)localObject1).zzY();
                }
              }
            }
          }
        }
        localObject1 = ((zzam)localObject2).zzc(this.zzf.zza((zzam)localObject2));
        arrayOfzzcz[i] = new zzcz(Integer.toString(i), new zzam[] { localObject1 });
      }
      this.zzx = new zzun(new zzvk(arrayOfzzcz), arrayOfBoolean);
      this.zzv = true;
      localObject1 = this.zzq;
      Objects.requireNonNull(localObject1);
      ((zzti)localObject1).zzi(this);
    }
  }
  
  private final void zzU(int paramInt)
  {
    zzS();
    Object localObject = this.zzx;
    boolean[] arrayOfBoolean = ((zzun)localObject).zzd;
    if (arrayOfBoolean[paramInt] == 0)
    {
      localObject = ((zzun)localObject).zza.zzb(paramInt).zzb(0);
      this.zzg.zzc(new zzth(1, zzcd.zzb(((zzam)localObject).zzm), (zzam)localObject, 0, null, zzfn.zzq(this.zzG), -9223372036854775807L));
      arrayOfBoolean[paramInt] = true;
    }
  }
  
  private final void zzV(int paramInt)
  {
    zzS();
    Object localObject = this.zzx.zzb;
    if ((this.zzI) && (localObject[paramInt] != 0) && (!this.zzs[paramInt].zzx(false)))
    {
      this.zzH = 0L;
      this.zzI = false;
      this.zzD = true;
      this.zzG = 0L;
      this.zzJ = 0;
      localObject = this.zzs;
      int i = localObject.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        localObject[paramInt].zzp(false);
      }
      localObject = this.zzq;
      Objects.requireNonNull(localObject);
      ((zzti)localObject).zzg(this);
    }
  }
  
  private final void zzW()
  {
    zzuj localzzuj = new zzuj(this, this.zzd, this.zze, this.zzl, this, this.zzm);
    if (this.zzv)
    {
      zzdy.zzf(zzX());
      l1 = this.zzz;
      if ((l1 != -9223372036854775807L) && (this.zzH > l1))
      {
        this.zzK = true;
        this.zzH = -9223372036854775807L;
        return;
      }
      localObject1 = this.zzy;
      Objects.requireNonNull(localObject1);
      zzuj.zzf(localzzuj, ((zzabn)localObject1).zzg(this.zzH).zza.zzc, this.zzH);
      localObject1 = this.zzs;
      int j = localObject1.length;
      for (int i = 0; i < j; i++) {
        localObject1[i].zzt(this.zzH);
      }
      this.zzH = -9223372036854775807L;
    }
    this.zzJ = zzP();
    long l1 = this.zzk.zza(localzzuj, this, zzxq.zza(this.zzB));
    Object localObject2 = zzuj.zzd(localzzuj);
    Object localObject1 = this.zzg;
    localObject2 = new zztc(zzuj.zzb(localzzuj), (zzgc)localObject2, ((zzgc)localObject2).zza, Collections.emptyMap(), l1, 0L, 0L);
    l1 = zzuj.zzc(localzzuj);
    long l2 = this.zzz;
    ((zztu)localObject1).zzg((zztc)localObject2, new zzth(1, -1, null, 0, null, zzfn.zzq(l1), zzfn.zzq(l2)));
  }
  
  private final boolean zzX()
  {
    return this.zzH != -9223372036854775807L;
  }
  
  private final boolean zzY()
  {
    return (this.zzD) || (zzX());
  }
  
  public final void zzC()
  {
    this.zzu = true;
    this.zzp.post(this.zzn);
  }
  
  final void zzG()
    throws IOException
  {
    this.zzk.zzi(zzxq.zza(this.zzB));
  }
  
  final void zzH(int paramInt)
    throws IOException
  {
    this.zzs[paramInt].zzm();
    zzG();
  }
  
  public final void zzK()
  {
    zzvb[] arrayOfzzvb = this.zzs;
    int j = arrayOfzzvb.length;
    for (int i = 0; i < j; i++) {
      arrayOfzzvb[i].zzo();
    }
    this.zzl.zze();
  }
  
  public final void zzL(zzam paramzzam)
  {
    this.zzp.post(this.zzn);
  }
  
  public final void zzM()
  {
    if (this.zzv)
    {
      zzvb[] arrayOfzzvb = this.zzs;
      int j = arrayOfzzvb.length;
      for (int i = 0; i < j; i++) {
        arrayOfzzvb[i].zzn();
      }
    }
    this.zzk.zzj(this);
    this.zzp.removeCallbacksAndMessages(null);
    this.zzq = null;
    this.zzL = true;
  }
  
  public final void zzN(zzabn paramzzabn)
  {
    this.zzp.post(new zzui(this, paramzzabn));
  }
  
  final boolean zzO(int paramInt)
  {
    return (!zzY()) && (this.zzs[paramInt].zzx(this.zzK));
  }
  
  public final long zza(long paramLong, zzlh paramzzlh)
  {
    zzS();
    if (!this.zzy.zzh()) {
      return 0L;
    }
    zzabl localzzabl = this.zzy.zzg(paramLong);
    long l3 = localzzabl.zza.zzb;
    long l4 = localzzabl.zzb.zzb;
    long l1 = paramzzlh.zzf;
    long l2 = l1;
    if (l1 == 0L)
    {
      if (paramzzlh.zzg != 0L) {
        l2 = 0L;
      }
    }
    else
    {
      int i = zzfn.zza;
      long l6 = paramLong - l2;
      long l7 = paramzzlh.zzg;
      long l5 = paramLong + l7;
      l1 = l6;
      if (((l2 ^ paramLong) & (paramLong ^ l6)) < 0L) {
        l1 = Long.MIN_VALUE;
      }
      l2 = l5;
      if (((paramLong ^ l5) & (l7 ^ l5)) < 0L) {
        l2 = Long.MAX_VALUE;
      }
      int j = 1;
      if ((l1 <= l3) && (l3 <= l2)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((l1 > l4) || (l4 > l2)) {
        j = 0;
      }
      if ((i != 0) && (j != 0))
      {
        if (Math.abs(l3 - paramLong) > Math.abs(l4 - paramLong)) {
          return l4;
        }
      }
      else {
        if (i == 0) {
          break label247;
        }
      }
      paramLong = l3;
      break label255;
      label247:
      if (j == 0) {
        break label257;
      }
      paramLong = l4;
    }
    label255:
    return paramLong;
    label257:
    return l1;
  }
  
  public final long zzb()
  {
    zzS();
    if ((!this.zzK) && (this.zzE != 0))
    {
      if (zzX()) {
        return this.zzH;
      }
      if (this.zzw)
      {
        int j = this.zzs.length;
        l1 = Long.MAX_VALUE;
        int i = 0;
        for (;;)
        {
          l2 = l1;
          if (i >= j) {
            break;
          }
          zzun localzzun = this.zzx;
          l2 = l1;
          if (localzzun.zzb[i] != 0)
          {
            l2 = l1;
            if (localzzun.zzc[i] != 0)
            {
              l2 = l1;
              if (!this.zzs[i].zzw()) {
                l2 = Math.min(l1, this.zzs[i].zzg());
              }
            }
          }
          i++;
          l1 = l2;
        }
      }
      long l2 = Long.MAX_VALUE;
      long l1 = l2;
      if (l2 == Long.MAX_VALUE) {
        l1 = zzQ(false);
      }
      if (l1 == Long.MIN_VALUE) {
        return this.zzG;
      }
      return l1;
    }
    return Long.MIN_VALUE;
  }
  
  public final long zzc()
  {
    return zzb();
  }
  
  public final long zzd()
  {
    if ((this.zzD) && ((this.zzK) || (zzP() > this.zzJ)))
    {
      this.zzD = false;
      return this.zzG;
    }
    return -9223372036854775807L;
  }
  
  public final long zze(long paramLong)
  {
    zzS();
    Object localObject = this.zzx.zzb;
    if (true != this.zzy.zzh()) {
      paramLong = 0L;
    }
    int j = 0;
    this.zzD = false;
    this.zzG = paramLong;
    if (zzX())
    {
      this.zzH = paramLong;
      return paramLong;
    }
    int k;
    int i;
    if (this.zzB != 7)
    {
      k = this.zzs.length;
      for (i = 0; i < k; i++) {
        if ((!this.zzs[i].zzy(paramLong, false)) && ((localObject[i] != 0) || (!this.zzw))) {
          break label118;
        }
      }
      return paramLong;
    }
    label118:
    this.zzI = false;
    this.zzH = paramLong;
    this.zzK = false;
    localObject = this.zzk;
    if (((zzxz)localObject).zzl())
    {
      localObject = this.zzs;
      k = localObject.length;
      for (i = j; i < k; i++) {
        localObject[i].zzj();
      }
      this.zzk.zzg();
    }
    else
    {
      ((zzxz)localObject).zzh();
      localObject = this.zzs;
      j = localObject.length;
      for (i = 0; i < j; i++) {
        localObject[i].zzp(false);
      }
    }
    return paramLong;
  }
  
  public final long zzf(zzwx[] paramArrayOfzzwx, boolean[] paramArrayOfBoolean1, zzvc[] paramArrayOfzzvc, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    zzS();
    Object localObject = this.zzx;
    zzvk localzzvk = ((zzun)localObject).zza;
    localObject = ((zzun)localObject).zzc;
    int j = this.zzE;
    int n = 0;
    int m = 0;
    for (int i = 0; i < paramArrayOfzzwx.length; i++)
    {
      zzvc localzzvc = paramArrayOfzzvc[i];
      if ((localzzvc != null) && ((paramArrayOfzzwx[i] == null) || (paramArrayOfBoolean1[i] == 0)))
      {
        k = zzul.zzc((zzul)localzzvc);
        zzdy.zzf(localObject[k]);
        this.zzE -= 1;
        localObject[k] = 0;
        paramArrayOfzzvc[i] = null;
      }
    }
    if (this.zzC)
    {
      l = paramLong;
      if (j != 0) {
        break label151;
      }
    }
    else
    {
      if (paramLong == 0L) {
        break label148;
      }
    }
    i = 1;
    break label158;
    label148:
    long l = 0L;
    label151:
    i = 0;
    paramLong = l;
    label158:
    j = 0;
    for (int k = i; j < paramArrayOfzzwx.length; k = i)
    {
      i = k;
      if (paramArrayOfzzvc[j] == null)
      {
        paramArrayOfBoolean1 = paramArrayOfzzwx[j];
        i = k;
        if (paramArrayOfBoolean1 != null)
        {
          boolean bool;
          if (paramArrayOfBoolean1.zzc() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          zzdy.zzf(bool);
          if (paramArrayOfBoolean1.zza(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          zzdy.zzf(bool);
          int i1 = localzzvk.zza(paramArrayOfBoolean1.zze());
          zzdy.zzf(localObject[i1] ^ 0x1);
          this.zzE += 1;
          localObject[i1] = 1;
          paramArrayOfzzvc[j] = new zzul(this, i1);
          paramArrayOfBoolean2[j] = true;
          i = k;
          if (k == 0)
          {
            paramArrayOfBoolean1 = this.zzs[i1];
            if ((!paramArrayOfBoolean1.zzy(paramLong, true)) && (paramArrayOfBoolean1.zza() != 0)) {
              i = 1;
            } else {
              i = 0;
            }
          }
        }
      }
      j++;
    }
    if (this.zzE == 0)
    {
      this.zzI = false;
      this.zzD = false;
      if (this.zzk.zzl())
      {
        paramArrayOfzzwx = this.zzs;
        j = paramArrayOfzzwx.length;
        for (i = m; i < j; i++) {
          paramArrayOfzzwx[i].zzj();
        }
        this.zzk.zzg();
        l = paramLong;
      }
      else
      {
        paramArrayOfzzwx = this.zzs;
        j = paramArrayOfzzwx.length;
        for (i = 0;; i++)
        {
          l = paramLong;
          if (i >= j) {
            break;
          }
          paramArrayOfzzwx[i].zzp(false);
        }
      }
    }
    else
    {
      l = paramLong;
      if (k != 0)
      {
        paramLong = zze(paramLong);
        for (i = n;; i++)
        {
          l = paramLong;
          if (i >= paramArrayOfzzvc.length) {
            break;
          }
          if (paramArrayOfzzvc[i] != null) {
            paramArrayOfBoolean2[i] = true;
          }
        }
      }
    }
    this.zzC = true;
    return l;
  }
  
  final int zzg(int paramInt1, zzkf paramzzkf, zzhi paramzzhi, int paramInt2)
  {
    if (zzY()) {
      return -3;
    }
    zzU(paramInt1);
    paramInt2 = this.zzs[paramInt1].zzd(paramzzkf, paramzzhi, paramInt2, this.zzK);
    if (paramInt2 == -3) {
      zzV(paramInt1);
    }
    return paramInt2;
  }
  
  public final zzvk zzh()
  {
    zzS();
    return this.zzx.zza;
  }
  
  final int zzi(int paramInt, long paramLong)
  {
    if (zzY()) {
      return 0;
    }
    zzU(paramInt);
    zzvb localzzvb = this.zzs[paramInt];
    int i = localzzvb.zzb(paramLong, this.zzK);
    localzzvb.zzv(i);
    if (i == 0)
    {
      zzV(paramInt);
      return 0;
    }
    return i;
  }
  
  public final void zzj(long paramLong, boolean paramBoolean)
  {
    zzS();
    if (zzX()) {
      return;
    }
    boolean[] arrayOfBoolean = this.zzx.zzc;
    int j = this.zzs.length;
    for (int i = 0; i < j; i++) {
      this.zzs[i].zzi(paramLong, false, arrayOfBoolean[i]);
    }
  }
  
  public final void zzk()
    throws IOException
  {
    zzG();
    if ((this.zzK) && (!this.zzv)) {
      throw zzce.zza("Loading finished before preparation is complete.", null);
    }
  }
  
  public final void zzl(zzti paramzzti, long paramLong)
  {
    this.zzq = paramzzti;
    this.zzm.zze();
    zzW();
  }
  
  public final void zzm(long paramLong) {}
  
  public final boolean zzo(long paramLong)
  {
    if ((!this.zzK) && (!this.zzk.zzk()) && (!this.zzI) && ((!this.zzv) || (this.zzE != 0)))
    {
      boolean bool = this.zzm.zze();
      if (!this.zzk.zzl())
      {
        zzW();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public final boolean zzp()
  {
    return (this.zzk.zzl()) && (this.zzm.zzd());
  }
  
  final zzabr zzu()
  {
    return zzR(new zzum(0, true));
  }
  
  public final zzabr zzv(int paramInt1, int paramInt2)
  {
    return zzR(new zzum(paramInt1, false));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzuo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */