package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzql
{
  public final int zza;
  public final zztl zzb;
  private final CopyOnWriteArrayList zzc;
  
  public zzql()
  {
    this(new CopyOnWriteArrayList(), 0, null);
  }
  
  private zzql(CopyOnWriteArrayList paramCopyOnWriteArrayList, int paramInt, zztl paramzztl)
  {
    this.zzc = paramCopyOnWriteArrayList;
    this.zza = 0;
    this.zzb = paramzztl;
  }
  
  public final zzql zza(int paramInt, zztl paramzztl)
  {
    return new zzql(this.zzc, 0, paramzztl);
  }
  
  public final void zzb(Handler paramHandler, zzqm paramzzqm)
  {
    this.zzc.add(new zzqk(paramHandler, paramzzqm));
  }
  
  public final void zzc(zzqm paramzzqm)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zzqk localzzqk = (zzqk)localIterator.next();
      if (localzzqk.zzb == paramzzqm) {
        this.zzc.remove(localzzqk);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */