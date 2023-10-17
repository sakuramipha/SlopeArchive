package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzalt
{
  public static final boolean zza = zzalu.zzb;
  private final List zzb = new ArrayList();
  private boolean zzc = false;
  
  protected final void finalize()
    throws Throwable
  {
    if (!this.zzc)
    {
      zzb("Request on the loose");
      zzalu.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
  
  public final void zza(String paramString, long paramLong)
  {
    try
    {
      if (!this.zzc)
      {
        List localList = this.zzb;
        zzals localzzals = new com/google/android/gms/internal/ads/zzals;
        localzzals.<init>(paramString, paramLong, SystemClock.elapsedRealtime());
        localList.add(localzzals);
        return;
      }
      paramString = new java/lang/IllegalStateException;
      paramString.<init>("Marker added to finished log");
      throw paramString;
    }
    finally {}
  }
  
  public final void zzb(String paramString)
  {
    try
    {
      this.zzc = true;
      Object localObject;
      if (this.zzb.size() == 0)
      {
        l1 = 0L;
      }
      else
      {
        l1 = ((zzals)this.zzb.get(0)).zzc;
        localObject = this.zzb;
        l2 = ((zzals)((List)localObject).get(((List)localObject).size() - 1)).zzc;
        l1 = l2 - l1;
      }
      if (l1 <= 0L) {
        return;
      }
      long l2 = ((zzals)this.zzb.get(0)).zzc;
      zzalu.zza("(%-4d ms) %s", new Object[] { Long.valueOf(l1), paramString });
      paramString = this.zzb.iterator();
      for (long l1 = l2; paramString.hasNext(); l1 = l2)
      {
        localObject = (zzals)paramString.next();
        l2 = ((zzals)localObject).zzc;
        zzalu.zza("(+%-4d) [%2d] %s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(((zzals)localObject).zzb), ((zzals)localObject).zza });
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */