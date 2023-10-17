package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import java.util.Iterator;
import java.util.Set;

final class zzap
  extends zzef
{
  private final ListenerHolder<EndpointDiscoveryCallback> zza;
  private final Set<String> zzb = new ArraySet();
  
  zzap(ListenerHolder<EndpointDiscoveryCallback> paramListenerHolder)
  {
    this.zza = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
  }
  
  private static boolean zzg(zzfi paramzzfi)
  {
    BluetoothDevice localBluetoothDevice = paramzzfi.zzd();
    boolean bool = true;
    if (localBluetoothDevice != null)
    {
      if (paramzzfi.zza() == null) {
        return bool;
      }
      if ("__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(paramzzfi.zza())) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
  
  public final void zzb(zzfg paramzzfg)
  {
    try
    {
      ListenerHolder localListenerHolder = this.zza;
      zzal localzzal = new com/google/android/gms/internal/nearby/zzal;
      localzzal.<init>(this, paramzzfg);
      localListenerHolder.notifyListener(localzzal);
      return;
    }
    finally
    {
      paramzzfg = finally;
      throw paramzzfg;
    }
  }
  
  public final void zzc(zzfi paramzzfi)
  {
    try
    {
      if (!zzg(paramzzfi)) {
        this.zzb.add(paramzzfi.zza());
      }
      ListenerHolder localListenerHolder = this.zza;
      zzam localzzam = new com/google/android/gms/internal/nearby/zzam;
      localzzam.<init>(this, paramzzfi);
      localListenerHolder.notifyListener(localzzam);
      return;
    }
    finally {}
  }
  
  public final void zzd(zzfk paramzzfk)
  {
    try
    {
      this.zzb.remove(paramzzfk.zza());
      ListenerHolder localListenerHolder = this.zza;
      zzan localzzan = new com/google/android/gms/internal/nearby/zzan;
      localzzan.<init>(this, paramzzfk);
      localListenerHolder.notifyListener(localzzan);
      return;
    }
    finally
    {
      paramzzfk = finally;
      throw paramzzfk;
    }
  }
  
  final void zze()
  {
    try
    {
      Iterator localIterator = this.zzb.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ListenerHolder localListenerHolder = this.zza;
        zzao localzzao = new com/google/android/gms/internal/nearby/zzao;
        localzzao.<init>(this, str);
        localListenerHolder.notifyListener(localzzao);
      }
      this.zzb.clear();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */