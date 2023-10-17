package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdnp
  implements zzcwd
{
  private final zzcfb zza;
  
  zzdnp(zzcfb paramzzcfb)
  {
    this.zza = paramzzcfb;
  }
  
  public final void zzbn(Context paramContext)
  {
    paramContext = this.zza;
    if (paramContext != null) {
      paramContext.destroy();
    }
  }
  
  public final void zzbp(Context paramContext)
  {
    paramContext = this.zza;
    if (paramContext != null) {
      paramContext.onPause();
    }
  }
  
  public final void zzbq(Context paramContext)
  {
    paramContext = this.zza;
    if (paramContext != null) {
      paramContext.onResume();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdnp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */