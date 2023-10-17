package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class zzdul
  implements zzgvo
{
  private final zzgwb zza;
  
  public zzdul(zzgwb paramzzgwb)
  {
    this.zza = paramzzgwb;
  }
  
  public final ApplicationInfo zza()
  {
    ApplicationInfo localApplicationInfo = ((Context)this.zza.zzb()).getApplicationInfo();
    zzgvw.zzb(localApplicationInfo);
    return localApplicationInfo;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */