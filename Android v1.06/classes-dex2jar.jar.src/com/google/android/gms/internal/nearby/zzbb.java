package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate.Builder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzbb
  extends zzej
{
  private final Context zza;
  private final ListenerHolder<PayloadCallback> zzb;
  private final Map<zzba, PayloadTransferUpdate> zzc = new ArrayMap();
  private final zzfx zzd;
  
  zzbb(Context paramContext, ListenerHolder<PayloadCallback> paramListenerHolder, zzfx paramzzfx)
  {
    this.zza = ((Context)Preconditions.checkNotNull(paramContext));
    this.zzb = ((ListenerHolder)Preconditions.checkNotNull(paramListenerHolder));
    this.zzd = paramzzfx;
  }
  
  public final void zzb(zzfm paramzzfm)
  {
    try
    {
      Payload localPayload = zzgf.zza(this.zza, paramzzfm.zzb());
      if (localPayload == null)
      {
        Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[] { Long.valueOf(paramzzfm.zzb().zza()) }));
        return;
      }
      Map localMap = this.zzc;
      Object localObject2 = new com/google/android/gms/internal/nearby/zzba;
      ((zzba)localObject2).<init>(paramzzfm.zza(), paramzzfm.zzb().zza());
      Object localObject1 = new com/google/android/gms/nearby/connection/PayloadTransferUpdate$Builder;
      ((PayloadTransferUpdate.Builder)localObject1).<init>();
      ((PayloadTransferUpdate.Builder)localObject1).setPayloadId(paramzzfm.zzb().zza());
      localMap.put(localObject2, ((PayloadTransferUpdate.Builder)localObject1).build());
      localObject1 = this.zzb;
      localObject2 = new com/google/android/gms/internal/nearby/zzax;
      ((zzax)localObject2).<init>(this, paramzzfm, localPayload);
      ((ListenerHolder)localObject1).notifyListener((ListenerHolder.Notifier)localObject2);
      return;
    }
    finally {}
  }
  
  public final void zzc(zzfo paramzzfo)
  {
    try
    {
      if (paramzzfo.zzb().getStatus() == 3)
      {
        localObject1 = this.zzc;
        localObject2 = new com/google/android/gms/internal/nearby/zzba;
        ((zzba)localObject2).<init>(paramzzfo.zza(), paramzzfo.zzb().getPayloadId());
        ((Map)localObject1).put(localObject2, paramzzfo.zzb());
      }
      else
      {
        localObject2 = this.zzc;
        localObject1 = new com/google/android/gms/internal/nearby/zzba;
        ((zzba)localObject1).<init>(paramzzfo.zza(), paramzzfo.zzb().getPayloadId());
        ((Map)localObject2).remove(localObject1);
        localObject1 = this.zzd;
        if (localObject1 != null) {
          ((zzfx)localObject1).zzb(paramzzfo.zzb().getPayloadId());
        }
      }
      Object localObject1 = this.zzb;
      Object localObject2 = new com/google/android/gms/internal/nearby/zzay;
      ((zzay)localObject2).<init>(this, paramzzfo);
      ((ListenerHolder)localObject1).notifyListener((ListenerHolder.Notifier)localObject2);
      return;
    }
    finally {}
  }
  
  final void zzd()
  {
    try
    {
      Iterator localIterator = this.zzc.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        String str = ((zzba)((Map.Entry)localObject2).getKey()).zza();
        PayloadTransferUpdate localPayloadTransferUpdate = (PayloadTransferUpdate)((Map.Entry)localObject2).getValue();
        localObject2 = this.zzb;
        zzaz localzzaz = new com/google/android/gms/internal/nearby/zzaz;
        localzzaz.<init>(this, str, localPayloadTransferUpdate);
        ((ListenerHolder)localObject2).notifyListener(localzzaz);
      }
      this.zzc.clear();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */