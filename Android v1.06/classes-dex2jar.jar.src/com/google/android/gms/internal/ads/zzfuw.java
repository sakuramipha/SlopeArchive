package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

abstract class zzfuw
  extends zzfuf.zzi
{
  private static final zzfus zzbb;
  private static final Logger zzbc = Logger.getLogger(zzfuw.class.getName());
  private volatile int remaining;
  @CheckForNull
  private volatile Set<Throwable> seenExceptions = null;
  
  static
  {
    try
    {
      localObject2 = new com/google/android/gms/internal/ads/zzfut;
      ((zzfut)localObject2).<init>(AtomicReferenceFieldUpdater.newUpdater(zzfuw.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuw.class, "remaining"));
      Object localObject1 = null;
    }
    catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
    Object localObject2 = new zzfuv(null);
    zzbb = (zzfus)localObject2;
    if (localRuntimeException != null) {
      zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", localRuntimeException);
    }
  }
  
  zzfuw(int paramInt)
  {
    this.remaining = paramInt;
  }
  
  final int zzB()
  {
    return zzbb.zza(this);
  }
  
  final Set zzD()
  {
    Set localSet2 = this.seenExceptions;
    Set localSet1 = localSet2;
    if (localSet2 == null)
    {
      localSet1 = Collections.newSetFromMap(new ConcurrentHashMap());
      zzf(localSet1);
      zzbb.zzb(this, null, localSet1);
      localSet1 = this.seenExceptions;
      localSet1.getClass();
    }
    return localSet1;
  }
  
  final void zzG()
  {
    this.seenExceptions = null;
  }
  
  abstract void zzf(Set paramSet);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */