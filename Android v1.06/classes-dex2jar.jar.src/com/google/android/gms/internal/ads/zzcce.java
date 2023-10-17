package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

final class zzcce
  implements Runnable
{
  private final zzcbq zza;
  private boolean zzb = false;
  
  zzcce(zzcbq paramzzcbq)
  {
    this.zza = paramzzcbq;
  }
  
  private final void zzc()
  {
    zzs.zza.removeCallbacks(this);
    zzs.zza.postDelayed(this, 250L);
  }
  
  public final void run()
  {
    if (!this.zzb)
    {
      this.zza.zzt();
      zzc();
    }
  }
  
  public final void zza()
  {
    this.zzb = true;
    this.zza.zzt();
  }
  
  public final void zzb()
  {
    this.zzb = false;
    zzc();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */