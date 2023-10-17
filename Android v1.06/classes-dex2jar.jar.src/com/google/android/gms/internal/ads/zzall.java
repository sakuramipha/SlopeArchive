package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzall
{
  private final AtomicInteger zza = new AtomicInteger();
  private final Set zzb = new HashSet();
  private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
  private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
  private final zzaks zze;
  private final zzalb zzf;
  private final zzalc[] zzg;
  private zzaku zzh;
  private final List zzi = new ArrayList();
  private final List zzj = new ArrayList();
  private final zzakz zzk;
  
  public zzall(zzaks paramzzaks, zzalb paramzzalb, int paramInt)
  {
    this.zze = paramzzaks;
    this.zzf = paramzzalb;
    this.zzg = new zzalc[4];
    this.zzk = localzzakz;
  }
  
  public final zzali zza(zzali paramzzali)
  {
    paramzzali.zzf(this);
    synchronized (this.zzb)
    {
      this.zzb.add(paramzzali);
      paramzzali.zzg(this.zza.incrementAndGet());
      paramzzali.zzm("add-to-queue");
      zzc(paramzzali, 0);
      this.zzc.add(paramzzali);
      return paramzzali;
    }
  }
  
  final void zzb(zzali paramzzali)
  {
    synchronized (this.zzb)
    {
      this.zzb.remove(paramzzali);
      synchronized (this.zzi)
      {
        Iterator localIterator = this.zzi.iterator();
        while (localIterator.hasNext()) {
          ((zzalk)localIterator.next()).zza();
        }
        zzc(paramzzali, 5);
        return;
      }
    }
  }
  
  final void zzc(zzali arg1, int paramInt)
  {
    synchronized (this.zzj)
    {
      Iterator localIterator = this.zzj.iterator();
      while (localIterator.hasNext()) {
        ((zzalj)localIterator.next()).zza();
      }
      return;
    }
  }
  
  public final void zzd()
  {
    Object localObject = this.zzh;
    if (localObject != null) {
      ((zzaku)localObject).zzb();
    }
    zzalc[] arrayOfzzalc = this.zzg;
    int j = 0;
    for (int i = 0; i < 4; i++)
    {
      localObject = arrayOfzzalc[i];
      if (localObject != null) {
        ((zzalc)localObject).zza();
      }
    }
    localObject = new zzaku(this.zzc, this.zzd, this.zze, this.zzk);
    this.zzh = ((zzaku)localObject);
    ((zzaku)localObject).start();
    for (i = j; i < 4; i++)
    {
      localObject = new zzalc(this.zzd, this.zzf, this.zze, this.zzk);
      this.zzg[i] = localObject;
      ((zzalc)localObject).start();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */