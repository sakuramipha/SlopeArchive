package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import java.util.Iterator;
import java.util.Set;

final class zzag
  extends zzdy
{
  private final ListenerHolder<ConnectionLifecycleCallback> zza;
  private final Set<String> zzb = new ArraySet();
  private final Set<String> zzc = new ArraySet();
  
  zzag(ListenerHolder<ConnectionLifecycleCallback> paramListenerHolder)
  {
    this.zza = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  public final void zzb(zzew paramzzew)
  {
    try
    {
      this.zzb.add(paramzzew.zza());
      ListenerHolder localListenerHolder = this.zza;
      zzaa localzzaa = new com/google/android/gms/internal/nearby/zzaa;
      localzzaa.<init>(this, paramzzew);
      localListenerHolder.notifyListener(localzzaa);
      return;
    }
    finally
    {
      paramzzew = finally;
      throw paramzzew;
    }
  }
  
  public final void zzc(zzfc paramzzfc)
  {
    try
    {
      this.zzb.remove(paramzzfc.zza());
      Status localStatus = zzbf.zzE(paramzzfc.zzb());
      if (localStatus.isSuccess()) {
        this.zzc.add(paramzzfc.zza());
      }
      ListenerHolder localListenerHolder = this.zza;
      zzab localzzab = new com/google/android/gms/internal/nearby/zzab;
      localzzab.<init>(this, paramzzfc, localStatus);
      localListenerHolder.notifyListener(localzzab);
      return;
    }
    finally {}
  }
  
  public final void zzd(zzfe paramzzfe)
  {
    try
    {
      this.zzc.remove(paramzzfe.zza());
      ListenerHolder localListenerHolder = this.zza;
      zzac localzzac = new com/google/android/gms/internal/nearby/zzac;
      localzzac.<init>(this, paramzzfe);
      localListenerHolder.notifyListener(localzzac);
      return;
    }
    finally
    {
      paramzzfe = finally;
      throw paramzzfe;
    }
  }
  
  public final void zze(zzeu paramzzeu)
  {
    this.zza.notifyListener(new zzad(this, paramzzeu));
  }
  
  final void zzf()
  {
    try
    {
      Iterator localIterator = this.zzb.iterator();
      String str;
      ListenerHolder localListenerHolder;
      Object localObject2;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localListenerHolder = this.zza;
        localObject2 = new com/google/android/gms/internal/nearby/zzae;
        ((zzae)localObject2).<init>(this, str);
        localListenerHolder.notifyListener((ListenerHolder.Notifier)localObject2);
      }
      this.zzb.clear();
      localIterator = this.zzc.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localListenerHolder = this.zza;
        localObject2 = new com/google/android/gms/internal/nearby/zzaf;
        ((zzaf)localObject2).<init>(this, str);
        localListenerHolder.notifyListener((ListenerHolder.Notifier)localObject2);
      }
      this.zzc.clear();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */