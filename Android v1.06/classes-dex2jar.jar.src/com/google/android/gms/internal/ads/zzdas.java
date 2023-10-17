package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdas
{
  protected final Map zza = new HashMap();
  
  protected zzdas(Set paramSet)
  {
    zzo(paramSet);
  }
  
  public final void zzj(zzdco paramzzdco)
  {
    try
    {
      zzm(paramzzdco.zza, paramzzdco.zzb);
      return;
    }
    finally
    {
      paramzzdco = finally;
      throw paramzzdco;
    }
  }
  
  public final void zzm(Object paramObject, Executor paramExecutor)
  {
    try
    {
      this.zza.put(paramObject, paramExecutor);
      return;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public final void zzo(Set paramSet)
  {
    try
    {
      paramSet = paramSet.iterator();
      while (paramSet.hasNext()) {
        zzj((zzdco)paramSet.next());
      }
      return;
    }
    finally {}
  }
  
  protected final void zzp(zzdar paramzzdar)
  {
    try
    {
      Iterator localIterator = this.zza.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        Object localObject1 = ((Map.Entry)localObject2).getKey();
        Executor localExecutor = (Executor)((Map.Entry)localObject2).getValue();
        localObject2 = new com/google/android/gms/internal/ads/zzdaq;
        ((zzdaq)localObject2).<init>(paramzzdar, localObject1);
        localExecutor.execute((Runnable)localObject2);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */