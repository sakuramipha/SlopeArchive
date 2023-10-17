package com.google.android.gms.internal.ads;

import android.app.AppOpsManager.OnOpActiveChangedListener;

final class zzarz
  implements AppOpsManager.OnOpActiveChangedListener
{
  final zzasa zza;
  
  zzarz(zzasa paramzzasa) {}
  
  public final void onOpActiveChanged(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzasa.zzg(this.zza, System.currentTimeMillis());
      zzasa.zzf(this.zza, true);
      return;
    }
    long l = System.currentTimeMillis();
    paramString1 = this.zza;
    if ((zzasa.zza(paramString1) > 0L) && (l >= zzasa.zza(paramString1))) {
      zzasa.zze(paramString1, l - zzasa.zza(paramString1));
    }
    zzasa.zzf(this.zza, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzarz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */