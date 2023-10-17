package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final class zzalv
  implements zzalh
{
  private final Map zza = new HashMap();
  private final zzaku zzb;
  private final BlockingQueue zzc;
  private final zzakz zzd;
  
  zzalv(zzaku paramzzaku, BlockingQueue paramBlockingQueue, zzakz paramzzakz)
  {
    this.zzd = paramzzakz;
    this.zzb = paramzzaku;
    this.zzc = paramBlockingQueue;
  }
  
  public final void zza(zzali paramzzali)
  {
    try
    {
      String str = paramzzali.zzj();
      paramzzali = (List)this.zza.remove(str);
      if ((paramzzali != null) && (!paramzzali.isEmpty()))
      {
        if (zzalu.zzb) {
          zzalu.zzd("%d waiting requests for cacheKey=%s; resend to network", new Object[] { Integer.valueOf(paramzzali.size()), str });
        }
        zzali localzzali = (zzali)paramzzali.remove(0);
        this.zza.put(str, paramzzali);
        localzzali.zzu(this);
        try
        {
          this.zzc.put(localzzali);
          return;
        }
        catch (InterruptedException paramzzali)
        {
          zzalu.zzb("Couldn't add request to queue. %s", new Object[] { paramzzali.toString() });
          Thread.currentThread().interrupt();
          this.zzb.zzb();
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzb(zzali paramzzali, zzalo paramzzalo)
  {
    Object localObject = paramzzalo.zzb;
    if ((localObject != null) && (!((zzakr)localObject).zza(System.currentTimeMillis())))
    {
      localObject = paramzzali.zzj();
      try
      {
        paramzzali = (List)this.zza.remove(localObject);
        if (paramzzali != null)
        {
          if (zzalu.zzb) {
            zzalu.zzd("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(paramzzali.size()), localObject });
          }
          localObject = paramzzali.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramzzali = (zzali)((Iterator)localObject).next();
            this.zzd.zzb(paramzzali, paramzzalo, null);
          }
        }
        return;
      }
      finally {}
    }
    zza(paramzzali);
  }
  
  final boolean zzc(zzali paramzzali)
  {
    try
    {
      String str = paramzzali.zzj();
      if (this.zza.containsKey(str))
      {
        List localList = (List)this.zza.get(str);
        Object localObject = localList;
        if (localList == null)
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
        }
        paramzzali.zzm("waiting-for-response");
        ((List)localObject).add(paramzzali);
        this.zza.put(str, localObject);
        if (zzalu.zzb) {
          zzalu.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
        }
        return true;
      }
      this.zza.put(str, null);
      paramzzali.zzu(this);
      if (zzalu.zzb) {
        zzalu.zza("new request, sending to network %s", new Object[] { str });
      }
      return false;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */