package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

final class zzfuf$zze
  extends zzfuf.zza
{
  final AtomicReferenceFieldUpdater<zzfuf.zzk, Thread> zza;
  final AtomicReferenceFieldUpdater<zzfuf.zzk, zzfuf.zzk> zzb;
  final AtomicReferenceFieldUpdater<zzfuf, zzfuf.zzk> zzc;
  final AtomicReferenceFieldUpdater<zzfuf, zzfuf.zzd> zzd;
  final AtomicReferenceFieldUpdater<zzfuf, Object> zze;
  
  zzfuf$zze(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater5)
  {
    super(null);
    this.zza = paramAtomicReferenceFieldUpdater1;
    this.zzb = paramAtomicReferenceFieldUpdater2;
    this.zzc = paramAtomicReferenceFieldUpdater3;
    this.zzd = paramAtomicReferenceFieldUpdater4;
    this.zze = paramAtomicReferenceFieldUpdater5;
  }
  
  final zzfuf.zzd zza(zzfuf paramzzfuf, zzfuf.zzd paramzzd)
  {
    return (zzfuf.zzd)this.zzd.getAndSet(paramzzfuf, paramzzd);
  }
  
  final zzfuf.zzk zzb(zzfuf paramzzfuf, zzfuf.zzk paramzzk)
  {
    return (zzfuf.zzk)this.zzc.getAndSet(paramzzfuf, paramzzk);
  }
  
  final void zzc(zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    this.zzb.lazySet(paramzzk1, paramzzk2);
  }
  
  final void zzd(zzfuf.zzk paramzzk, Thread paramThread)
  {
    this.zza.lazySet(paramzzk, paramThread);
  }
  
  final boolean zze(zzfuf paramzzfuf, @CheckForNull zzfuf.zzd paramzzd1, zzfuf.zzd paramzzd2)
  {
    return zzfug.zza(this.zzd, paramzzfuf, paramzzd1, paramzzd2);
  }
  
  final boolean zzf(zzfuf paramzzfuf, @CheckForNull Object paramObject1, Object paramObject2)
  {
    return zzfug.zza(this.zze, paramzzfuf, paramObject1, paramObject2);
  }
  
  final boolean zzg(zzfuf paramzzfuf, @CheckForNull zzfuf.zzk paramzzk1, @CheckForNull zzfuf.zzk paramzzk2)
  {
    return zzfug.zza(this.zzc, paramzzfuf, paramzzk1, paramzzk2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf$zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */