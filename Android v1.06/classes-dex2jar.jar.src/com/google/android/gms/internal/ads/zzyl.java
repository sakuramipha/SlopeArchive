package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

final class zzyl
{
  private final zzyx zza;
  private final zzym zzb;
  private final ArrayDeque zzc;
  private final ArrayDeque zzd;
  private Handler zze;
  private zzdl zzf;
  private CopyOnWriteArrayList zzg;
  private zzam zzh;
  private Pair zzi;
  private Pair zzj;
  private int zzk;
  private boolean zzl;
  private boolean zzm;
  private final zzdn zzn;
  private long zzo;
  private long zzp;
  
  public zzyl(zzyx paramzzyx, zzym paramzzym)
  {
    this.zza = paramzzyx;
    this.zzb = paramzzym;
    this.zzc = new ArrayDeque();
    this.zzd = new ArrayDeque();
    this.zzk = -1;
    this.zzl = true;
    this.zzn = zzdn.zza;
    this.zzo = -9223372036854775807L;
    this.zzp = -9223372036854775807L;
  }
  
  private final void zzp(long paramLong, boolean paramBoolean)
  {
    zzdy.zzb(this.zzf);
    this.zzf.zzf();
    this.zzc.remove();
    zzym.zzaC(this.zzb, SystemClock.elapsedRealtime() * 1000L);
    if (paramLong != -2L) {
      this.zzb.zzaE();
    }
  }
  
  public final long zza(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (this.zzp != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    return paramLong1 + paramLong2 - this.zzp;
  }
  
  public final MediaFormat zzb(MediaFormat paramMediaFormat)
  {
    if ((zzfn.zza >= 29) && (zzym.zzaA(this.zzb).getApplicationContext().getApplicationInfo().targetSdkVersion >= 29)) {
      paramMediaFormat.setInteger("allow-frame-drop", 0);
    }
    return paramMediaFormat;
  }
  
  public final Surface zzc()
  {
    zzdl localzzdl = this.zzf;
    Objects.requireNonNull(localzzdl);
    return localzzdl.zzb();
  }
  
  public final void zzd()
  {
    zzdl localzzdl = this.zzf;
    Objects.requireNonNull(localzzdl);
    localzzdl.zzh();
    this.zzj = null;
  }
  
  public final void zze()
  {
    zzdy.zzb(this.zzf);
    this.zzf.zzc();
    this.zzc.clear();
    this.zze.removeCallbacksAndMessages(null);
    if (this.zzm) {
      this.zzm = false;
    }
  }
  
  public final void zzf(String paramString)
  {
    Context localContext = zzym.zzaA(this.zzb);
    int k = zzfn.zza;
    int j = 1;
    int i = j;
    if (k >= 29) {
      if (localContext.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
        i = j;
      } else if (zzfof.zzb(paramString).startsWith("OMX.")) {
        i = 5;
      } else {
        i = Integer.MAX_VALUE;
      }
    }
    this.zzk = i;
  }
  
  public final void zzg(long paramLong1, long paramLong2)
  {
    zzdy.zzb(this.zzf);
    while (!this.zzc.isEmpty())
    {
      boolean bool;
      if (this.zzb.zzbc() == 2) {
        bool = true;
      } else {
        bool = false;
      }
      Object localObject = (Long)this.zzc.peek();
      Objects.requireNonNull(localObject);
      long l1 = ((Long)localObject).longValue() + this.zzp;
      long l3 = zzym.zzaz(this.zzb, paramLong1, paramLong2, SystemClock.elapsedRealtime() * 1000L, l1, bool);
      if (zzym.zzaK(this.zzb, paramLong1, l3))
      {
        zzp(-1L, false);
        return;
      }
      if ((!bool) || (paramLong1 == zzym.zzad(this.zzb)) || (l3 > 50000L)) {
        break;
      }
      this.zza.zzd(l1);
      long l2 = System.nanoTime();
      l2 = this.zza.zza(l2 + l3 * 1000L);
      if (zzym.zzaN((l2 - System.nanoTime()) / 1000L, paramLong2, false))
      {
        zzp(-2L, false);
      }
      else
      {
        if ((!this.zzd.isEmpty()) && (l1 > ((Long)((Pair)this.zzd.peek()).first).longValue())) {
          this.zzi = ((Pair)this.zzd.remove());
        }
        localObject = (zzam)this.zzi.second;
        if (this.zzo >= l1)
        {
          this.zzo = -9223372036854775807L;
          zzym.zzaD(this.zzb, this.zzn);
        }
        zzp(l2, false);
      }
    }
  }
  
  public final void zzh()
  {
    Object localObject = this.zzf;
    Objects.requireNonNull(localObject);
    ((zzdl)localObject).zze();
    this.zzf = null;
    localObject = this.zze;
    if (localObject != null) {
      ((Handler)localObject).removeCallbacksAndMessages(null);
    }
    localObject = this.zzg;
    if (localObject != null) {
      ((CopyOnWriteArrayList)localObject).clear();
    }
    this.zzc.clear();
    this.zzl = true;
  }
  
  public final void zzi(zzam paramzzam)
  {
    zzdl localzzdl = this.zzf;
    Objects.requireNonNull(localzzdl);
    zzan localzzan = new zzan(paramzzam.zzr, paramzzam.zzs);
    localzzan.zza(paramzzam.zzv);
    localzzan.zzb();
    localzzdl.zzg();
    this.zzh = paramzzam;
    if (this.zzm) {
      this.zzm = false;
    }
  }
  
  public final void zzj(Surface paramSurface, zzff paramzzff)
  {
    Pair localPair = this.zzj;
    if ((localPair != null) && (((Surface)localPair.first).equals(paramSurface)) && (((zzff)this.zzj.second).equals(paramzzff))) {
      return;
    }
    this.zzj = Pair.create(paramSurface, paramzzff);
    if (zzl())
    {
      paramSurface = this.zzf;
      Objects.requireNonNull(paramSurface);
      paramzzff.zzb();
      paramzzff.zza();
      paramSurface.zzh();
    }
  }
  
  public final void zzk(List paramList)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = this.zzg;
    if (localCopyOnWriteArrayList == null)
    {
      this.zzg = new CopyOnWriteArrayList(paramList);
      return;
    }
    localCopyOnWriteArrayList.clear();
    this.zzg.addAll(paramList);
  }
  
  public final boolean zzl()
  {
    return this.zzf != null;
  }
  
  public final boolean zzm()
  {
    Pair localPair = this.zzj;
    return (localPair == null) || (!((zzff)localPair.second).equals(zzff.zza));
  }
  
  public final boolean zzn(zzam paramzzam, long paramLong)
    throws zzia
  {
    zzdy.zzf(zzl() ^ true);
    if (!this.zzl) {
      return false;
    }
    if (this.zzg == null)
    {
      this.zzl = false;
      return false;
    }
    this.zze = zzfn.zzs(null);
    Object localObject1 = paramzzam.zzy;
    Object localObject2 = zzs.zza;
    int i;
    if (localObject1 != null)
    {
      i = ((zzs)localObject1).zzf;
      if (i != 7)
      {
        if (i == 6)
        {
          localObject1 = Pair.create(localObject1, localObject1);
          break label133;
        }
      }
      else
      {
        localObject2 = ((zzs)localObject1).zzc();
        ((zzr)localObject2).zzc(6);
        localObject1 = Pair.create(localObject1, ((zzr)localObject2).zzd());
        break label133;
      }
    }
    localObject1 = zzs.zza;
    localObject1 = Pair.create(localObject1, localObject1);
    try
    {
      label133:
      if (!zzym.zzaL())
      {
        i = paramzzam.zzu;
        if (i != 0) {
          this.zzg.add(0, zzyk.zza(i));
        }
      }
      localObject2 = zzyk.zzb();
      Object localObject3 = this.zzg;
      Objects.requireNonNull(localObject3);
      localObject3 = zzv.zzb;
      localObject3 = (zzs)((Pair)localObject1).first;
      localObject1 = (zzs)((Pair)localObject1).second;
      this.zze.getClass();
      this.zzf = ((zzdk)localObject2).zza();
      this.zzp = paramLong;
      localObject1 = this.zzj;
      if (localObject1 != null)
      {
        localObject3 = (zzff)((Pair)localObject1).second;
        localObject2 = this.zzf;
        localObject1 = (Surface)this.zzj.first;
        ((zzff)localObject3).zzb();
        ((zzff)localObject3).zza();
        ((zzdl)localObject2).zzh();
      }
      zzi(paramzzam);
      return true;
    }
    catch (Exception localException)
    {
      throw zzym.zzaB(this.zzb, localException, paramzzam, 7000);
    }
  }
  
  public final boolean zzo(zzam paramzzam, long paramLong, boolean paramBoolean)
  {
    zzdy.zzb(this.zzf);
    boolean bool;
    if (this.zzk != -1) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    zzdy.zzf(this.zzm ^ true);
    if (this.zzf.zza() < this.zzk)
    {
      this.zzf.zzd();
      Pair localPair = this.zzi;
      if (localPair == null) {
        this.zzi = Pair.create(Long.valueOf(paramLong), paramzzam);
      } else if (!zzfn.zzB(paramzzam, localPair.second)) {
        this.zzd.add(Pair.create(Long.valueOf(paramLong), paramzzam));
      }
      if (paramBoolean) {
        this.zzm = true;
      }
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */