package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzeo
{
  private final zzdz zza;
  private final zzei zzb;
  private final zzem zzc;
  private final CopyOnWriteArraySet zzd;
  private final ArrayDeque zze;
  private final ArrayDeque zzf;
  private final Object zzg;
  private boolean zzh;
  private boolean zzi;
  
  public zzeo(Looper paramLooper, zzdz paramzzdz, zzem paramzzem)
  {
    this(new CopyOnWriteArraySet(), paramLooper, paramzzdz, paramzzem);
  }
  
  private zzeo(CopyOnWriteArraySet paramCopyOnWriteArraySet, Looper paramLooper, zzdz paramzzdz, zzem paramzzem)
  {
    this.zza = paramzzdz;
    this.zzd = paramCopyOnWriteArraySet;
    this.zzc = paramzzem;
    this.zzg = new Object();
    this.zze = new ArrayDeque();
    this.zzf = new ArrayDeque();
    this.zzb = paramzzdz.zzb(paramLooper, new zzej(this));
    this.zzi = true;
  }
  
  private final void zzh()
  {
    if (!this.zzi) {
      return;
    }
    boolean bool;
    if (Thread.currentThread() == this.zzb.zza().getThread()) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
  }
  
  public final zzeo zza(Looper paramLooper, zzem paramzzem)
  {
    zzdz localzzdz = this.zza;
    return new zzeo(this.zzd, paramLooper, localzzdz, paramzzem);
  }
  
  public final void zzb(Object paramObject)
  {
    synchronized (this.zzg)
    {
      if (this.zzh) {
        return;
      }
      CopyOnWriteArraySet localCopyOnWriteArraySet = this.zzd;
      zzen localzzen = new com/google/android/gms/internal/ads/zzen;
      localzzen.<init>(paramObject);
      localCopyOnWriteArraySet.add(localzzen);
      return;
    }
  }
  
  public final void zzc()
  {
    zzh();
    if (this.zzf.isEmpty()) {
      return;
    }
    if (!this.zzb.zzg(0))
    {
      zzei localzzei = this.zzb;
      localzzei.zzk(localzzei.zzb(0));
    }
    boolean bool = this.zze.isEmpty();
    this.zze.addAll(this.zzf);
    this.zzf.clear();
    if (!(bool ^ true)) {
      while (!this.zze.isEmpty())
      {
        ((Runnable)this.zze.peekFirst()).run();
        this.zze.removeFirst();
      }
    }
  }
  
  public final void zzd(int paramInt, zzel paramzzel)
  {
    zzh();
    CopyOnWriteArraySet localCopyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
    this.zzf.add(new zzek(localCopyOnWriteArraySet, paramInt, paramzzel));
  }
  
  public final void zze()
  {
    zzh();
    synchronized (this.zzg)
    {
      this.zzh = true;
      Iterator localIterator = this.zzd.iterator();
      while (localIterator.hasNext()) {
        ((zzen)localIterator.next()).zzc(this.zzc);
      }
      this.zzd.clear();
      return;
    }
  }
  
  public final void zzf(Object paramObject)
  {
    zzh();
    Iterator localIterator = this.zzd.iterator();
    while (localIterator.hasNext())
    {
      zzen localzzen = (zzen)localIterator.next();
      if (localzzen.zza.equals(paramObject))
      {
        localzzen.zzc(this.zzc);
        this.zzd.remove(localzzen);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */