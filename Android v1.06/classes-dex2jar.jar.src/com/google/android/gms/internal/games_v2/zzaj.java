package com.google.android.gms.internal.games_v2;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzaj
{
  private final Handler zza;
  final Object zzb = new Object();
  private boolean zzc;
  private final HashMap zzd;
  
  public zzaj(Looper paramLooper, int paramInt)
  {
    this.zza = new zzfa(paramLooper);
    this.zzd = new HashMap();
  }
  
  protected abstract void zza(String paramString, int paramInt);
  
  public final void zzc(String paramString, int paramInt)
  {
    synchronized (this.zzb)
    {
      if (!this.zzc)
      {
        this.zzc = true;
        localObject1 = this.zza;
        localObject2 = new com/google/android/gms/internal/games_v2/zzai;
        ((zzai)localObject2).<init>(this);
        ((Handler)localObject1).postDelayed((Runnable)localObject2, 1000L);
      }
      Object localObject2 = (AtomicInteger)this.zzd.get(paramString);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new java/util/concurrent/atomic/AtomicInteger;
        ((AtomicInteger)localObject1).<init>();
        this.zzd.put(paramString, localObject1);
      }
      ((AtomicInteger)localObject1).addAndGet(paramInt);
      return;
    }
  }
  
  public final void zzd()
  {
    synchronized (this.zzb)
    {
      Iterator localIterator = this.zzd.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        zza((String)localEntry.getKey(), ((AtomicInteger)localEntry.getValue()).get());
      }
      this.zzd.clear();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */