package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;

final class zzbiq
  implements zzx
{
  boolean zza = false;
  
  zzbiq(zzbis paramzzbis, boolean paramBoolean, zza paramzza, Map paramMap1, Map paramMap2) {}
  
  public final void zza(boolean paramBoolean)
  {
    if (!this.zza)
    {
      if ((paramBoolean) && (this.zzb)) {
        ((zzdcw)this.zzc).zzr();
      }
      this.zza = true;
      this.zzd.put((String)this.zze.get("event_id"), Boolean.valueOf(paramBoolean));
      ((zzblb)this.zzc).zzd("openIntentAsync", this.zzd);
    }
  }
  
  public final void zzb(int paramInt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbiq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */