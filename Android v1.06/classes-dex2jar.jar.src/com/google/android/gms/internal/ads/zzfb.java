package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzfb
{
  private static zzfb zza;
  private final Handler zzb = new Handler(Looper.getMainLooper());
  private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
  private final Object zzd = new Object();
  private int zze = 0;
  
  private zzfb(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(new zzfa(this, null), localIntentFilter);
  }
  
  public static zzfb zzb(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        zzfb localzzfb = new com/google/android/gms/internal/ads/zzfb;
        localzzfb.<init>(paramContext);
        zza = localzzfb;
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public final int zza()
  {
    synchronized (this.zzd)
    {
      int i = this.zze;
      return i;
    }
  }
  
  public final void zzd(zzxn paramzzxn)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == null) {
        this.zzc.remove(localWeakReference);
      }
    }
    this.zzc.add(new WeakReference(paramzzxn));
    this.zzb.post(new zzex(this, paramzzxn));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */