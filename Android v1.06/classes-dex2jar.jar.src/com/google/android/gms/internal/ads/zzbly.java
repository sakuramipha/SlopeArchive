package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;

final class zzbly
  implements Runnable
{
  final zzbmk zze;
  
  zzbly(zzbmk paramzzbmk, zzbmj paramzzbmj, zzblf paramzzblf, ArrayList paramArrayList, long paramLong) {}
  
  public final void run()
  {
    synchronized (zzbmk.zzf(this.zze))
    {
      if ((this.zza.zze() != -1) && (this.zza.zze() != 1))
      {
        this.zza.zzg();
        Object localObject4 = zzcag.zze;
        Object localObject1 = this.zzb;
        Object localObject5 = new com/google/android/gms/internal/ads/zzblx;
        ((zzblx)localObject5).<init>((zzblf)localObject1);
        ((zzfwc)localObject4).execute((Runnable)localObject5);
        localObject1 = zzbbk.zzd;
        localObject4 = String.valueOf(zzba.zzc().zzb((zzbbc)localObject1));
        int j = this.zza.zze();
        int i = zzbmk.zza(this.zze);
        if (this.zzc.isEmpty())
        {
          localObject1 = ". Still waiting for the engine to be loaded";
        }
        else
        {
          localObject5 = String.valueOf(this.zzc.get(0));
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
          ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
        }
        long l1 = zzt.zzB().currentTimeMillis();
        long l2 = this.zzd;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((StringBuilder)localObject5).append("Could not finish the full JS engine loading in ");
        ((StringBuilder)localObject5).append((String)localObject4);
        ((StringBuilder)localObject5).append(" ms. JS engine session reference status(fullLoadTimeout) is ");
        ((StringBuilder)localObject5).append(j);
        ((StringBuilder)localObject5).append(". Update status(fullLoadTimeout) is ");
        ((StringBuilder)localObject5).append(i);
        ((StringBuilder)localObject5).append((String)localObject1);
        ((StringBuilder)localObject5).append(" ms. Total latency(fullLoadTimeout) is ");
        ((StringBuilder)localObject5).append(l1 - l2);
        ((StringBuilder)localObject5).append(" ms at timeout. Rejecting.");
        zze.zza(((StringBuilder)localObject5).toString());
        return;
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */