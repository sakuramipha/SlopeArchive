package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

public final class zzawt
{
  private zzawi zza;
  private boolean zzb;
  private final Context zzc;
  private final Object zzd = new Object();
  
  zzawt(Context paramContext)
  {
    this.zzc = paramContext;
  }
  
  final Future zzc(zzawj arg1)
  {
    zzawn localzzawn = new zzawn(this);
    zzawr localzzawr = new zzawr(this, ???, localzzawn);
    zzaws localzzaws = new zzaws(this, localzzawn);
    synchronized (this.zzd)
    {
      zzawi localzzawi = new com/google/android/gms/internal/ads/zzawi;
      localzzawi.<init>(this.zzc, zzt.zzt().zzb(), localzzawr, localzzaws);
      this.zza = localzzawi;
      localzzawi.checkAvailabilityAndConnect();
      return localzzawn;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */