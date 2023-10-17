package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import java.util.concurrent.Future;

final class zzawr
  implements BaseGmsClient.BaseConnectionCallbacks
{
  public static final int zzd = 0;
  final zzawt zzc;
  
  zzawr(zzawt paramzzawt, zzawj paramzzawj, zzcal paramzzcal) {}
  
  public final void onConnected(Bundle arg1)
  {
    synchronized (zzawt.zzb(this.zzc))
    {
      Object localObject1 = this.zzc;
      if (!zzawt.zzf((zzawt)localObject1))
      {
        zzawt.zzd((zzawt)localObject1, true);
        zzawi localzzawi = zzawt.zza(this.zzc);
        if (localzzawi == null) {
          return;
        }
        Object localObject4 = zzcag.zza;
        localObject1 = this.zza;
        Object localObject3 = this.zzb;
        zzawo localzzawo = new com/google/android/gms/internal/ads/zzawo;
        localzzawo.<init>(this, localzzawi, (zzawj)localObject1, (zzcal)localObject3);
        localObject1 = ((zzfwc)localObject4).zza(localzzawo);
        localObject4 = this.zzb;
        localObject3 = new com/google/android/gms/internal/ads/zzawp;
        ((zzawp)localObject3).<init>((zzcal)localObject4, (Future)localObject1);
        ((zzcal)localObject4).zzc((Runnable)localObject3, zzcag.zzf);
        return;
      }
      return;
    }
  }
  
  public final void onConnectionSuspended(int paramInt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */