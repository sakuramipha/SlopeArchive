package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdly
  implements zzbii
{
  final zzdlz zza;
  private final WeakReference zzb;
  private final String zzc;
  private final zzbii zzd;
  
  public final void zza(Object paramObject, Map paramMap)
  {
    paramObject = this.zzb.get();
    if (paramObject == null)
    {
      this.zza.zzk(this.zzc, this);
      return;
    }
    this.zzd.zza(paramObject, paramMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */