package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzeji
  implements zzcxt
{
  private final AtomicReference zza = new AtomicReference();
  
  public final void zza(zzdg paramzzdg)
  {
    this.zza.set(paramzzdg);
  }
  
  public final void zzh(zzs paramzzs)
  {
    zzewk.zza(this.zza, new zzejh(paramzzs));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */