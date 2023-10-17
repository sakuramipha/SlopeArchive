package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzxj
{
  private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();
  
  public final void zza(Handler paramHandler, zzxk paramzzxk)
  {
    zzc(paramzzxk);
    this.zza.add(new zzxi(paramHandler, paramzzxk));
  }
  
  public final void zzb(int paramInt, long paramLong1, long paramLong2)
  {
    Iterator localIterator = this.zza.iterator();
    while (localIterator.hasNext())
    {
      zzxi localzzxi = (zzxi)localIterator.next();
      if (!zzxi.zzd(localzzxi)) {
        zzxi.zza(localzzxi).post(new zzxh(localzzxi, paramInt, paramLong1, paramLong2));
      }
    }
  }
  
  public final void zzc(zzxk paramzzxk)
  {
    Iterator localIterator = this.zza.iterator();
    while (localIterator.hasNext())
    {
      zzxi localzzxi = (zzxi)localIterator.next();
      if (zzxi.zzb(localzzxi) == paramzzxk)
      {
        localzzxi.zzc();
        this.zza.remove(localzzxi);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */