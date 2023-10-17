package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcxr
  extends zzdas
  implements zzcwc, zzcxh
{
  private final zzezf zzb;
  private final AtomicBoolean zzc = new AtomicBoolean();
  
  public zzcxr(Set paramSet, zzezf paramzzezf)
  {
    super(paramSet);
    this.zzb = paramzzezf;
  }
  
  private final void zzb()
  {
    Object localObject = zzbbk.zzhp;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (this.zzc.compareAndSet(false, true)))
    {
      localObject = this.zzb.zzaf;
      if ((localObject != null) && (((zzs)localObject).zza == 3)) {
        zzp(new zzcxq(this));
      }
    }
  }
  
  public final void zzg()
  {
    if (this.zzb.zzb == 1) {
      zzb();
    }
  }
  
  public final void zzl()
  {
    int i = this.zzb.zzb;
    if ((i != 2) && (i != 5) && (i != 4) && (i != 6) && (i != 7)) {
      return;
    }
    zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */