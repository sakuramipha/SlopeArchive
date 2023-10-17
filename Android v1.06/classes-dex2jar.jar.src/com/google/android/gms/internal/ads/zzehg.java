package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzehg
  implements zzf
{
  final AtomicBoolean zza = new AtomicBoolean(false);
  private final zzcvg zzb;
  private final zzcwa zzc;
  private final zzdcy zzd;
  private final zzdcq zze;
  private final zzcnz zzf;
  
  zzehg(zzcvg paramzzcvg, zzcwa paramzzcwa, zzdcy paramzzdcy, zzdcq paramzzdcq, zzcnz paramzzcnz)
  {
    this.zzb = paramzzcvg;
    this.zzc = paramzzcwa;
    this.zzd = paramzzdcy;
    this.zze = paramzzdcq;
    this.zzf = paramzzcnz;
  }
  
  public final void zza(View paramView)
  {
    try
    {
      boolean bool = this.zza.compareAndSet(false, true);
      if (!bool) {
        return;
      }
      this.zzf.zzl();
      this.zze.zza(paramView);
      return;
    }
    finally {}
  }
  
  public final void zzb()
  {
    if (this.zza.get()) {
      this.zzb.onAdClicked();
    }
  }
  
  public final void zzc()
  {
    if (this.zza.get())
    {
      this.zzc.zza();
      this.zzd.zza();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzehg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */