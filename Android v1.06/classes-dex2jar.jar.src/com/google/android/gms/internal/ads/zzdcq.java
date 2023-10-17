package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzdcq
  extends zzdas
  implements zzaty
{
  private final Map zzb = new WeakHashMap(1);
  private final Context zzc;
  private final zzezf zzd;
  
  public zzdcq(Context paramContext, Set paramSet, zzezf paramzzezf)
  {
    super(paramSet);
    this.zzc = paramContext;
    this.zzd = paramzzezf;
  }
  
  public final void zza(View paramView)
  {
    try
    {
      zzatz localzzatz2 = (zzatz)this.zzb.get(paramView);
      zzatz localzzatz1 = localzzatz2;
      if (localzzatz2 == null)
      {
        localzzatz1 = new com/google/android/gms/internal/ads/zzatz;
        localzzatz1.<init>(this.zzc, paramView);
        localzzatz1.zzc(this);
        this.zzb.put(paramView, localzzatz1);
      }
      if (this.zzd.zzY)
      {
        paramView = zzbbk.zzbk;
        if (((Boolean)zzba.zzc().zzb(paramView)).booleanValue())
        {
          paramView = zzbbk.zzbj;
          localzzatz1.zzg(((Long)zzba.zzc().zzb(paramView)).longValue());
          return;
        }
      }
      localzzatz1.zzf();
      return;
    }
    finally {}
  }
  
  public final void zzb(View paramView)
  {
    try
    {
      if (this.zzb.containsKey(paramView))
      {
        ((zzatz)this.zzb.get(paramView)).zze(this);
        this.zzb.remove(paramView);
        return;
      }
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    try
    {
      zzdcp localzzdcp = new com/google/android/gms/internal/ads/zzdcp;
      localzzdcp.<init>(paramzzatx);
      zzp(localzzdcp);
      return;
    }
    finally
    {
      paramzzatx = finally;
      throw paramzzatx;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */