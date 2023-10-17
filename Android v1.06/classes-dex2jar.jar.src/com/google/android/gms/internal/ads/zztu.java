package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zztu
{
  public final int zza;
  public final zztl zzb;
  private final CopyOnWriteArrayList zzc;
  
  public zztu()
  {
    this(new CopyOnWriteArrayList(), 0, null);
  }
  
  private zztu(CopyOnWriteArrayList paramCopyOnWriteArrayList, int paramInt, zztl paramzztl)
  {
    this.zzc = paramCopyOnWriteArrayList;
    this.zza = 0;
    this.zzb = paramzztl;
  }
  
  public final zztu zza(int paramInt, zztl paramzztl)
  {
    return new zztu(this.zzc, 0, paramzztl);
  }
  
  public final void zzb(Handler paramHandler, zztv paramzztv)
  {
    this.zzc.add(new zztt(paramHandler, paramzztv));
  }
  
  public final void zzc(zzth paramzzth)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      zztv localzztv = localzztt.zzb;
      zzfn.zzE(localzztt.zza, new zzto(this, localzztv, paramzzth));
    }
  }
  
  public final void zzd(zztc paramzztc, zzth paramzzth)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      zztv localzztv = localzztt.zzb;
      zzfn.zzE(localzztt.zza, new zztp(this, localzztv, paramzztc, paramzzth));
    }
  }
  
  public final void zze(zztc paramzztc, zzth paramzzth)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      zztv localzztv = localzztt.zzb;
      zzfn.zzE(localzztt.zza, new zzts(this, localzztv, paramzztc, paramzzth));
    }
  }
  
  public final void zzf(zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      zztv localzztv = localzztt.zzb;
      zzfn.zzE(localzztt.zza, new zztq(this, localzztv, paramzztc, paramzzth, paramIOException, paramBoolean));
    }
  }
  
  public final void zzg(zztc paramzztc, zzth paramzzth)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      zztv localzztv = localzztt.zzb;
      zzfn.zzE(localzztt.zza, new zztr(this, localzztv, paramzztc, paramzzth));
    }
  }
  
  public final void zzh(zztv paramzztv)
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zztt localzztt = (zztt)localIterator.next();
      if (localzztt.zzb == paramzztv) {
        this.zzc.remove(localzztt);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */