package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture.SafeAtomicHelper..ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

final class zzfut
  extends zzfus
{
  final AtomicReferenceFieldUpdater zza;
  final AtomicIntegerFieldUpdater zzb;
  
  zzfut(AtomicReferenceFieldUpdater paramAtomicReferenceFieldUpdater, AtomicIntegerFieldUpdater paramAtomicIntegerFieldUpdater)
  {
    super(null);
    this.zza = paramAtomicReferenceFieldUpdater;
    this.zzb = paramAtomicIntegerFieldUpdater;
  }
  
  final int zza(zzfuw paramzzfuw)
  {
    return this.zzb.decrementAndGet(paramzzfuw);
  }
  
  final void zzb(zzfuw paramzzfuw, @CheckForNull Set paramSet1, Set paramSet2)
  {
    paramSet1 = this.zza;
    while ((!AbstractResolvableFuture.SafeAtomicHelper..ExternalSyntheticBackportWithForwarding0.m(paramSet1, paramzzfuw, null, paramSet2)) && (paramSet1.get(paramzzfuw) == null)) {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */