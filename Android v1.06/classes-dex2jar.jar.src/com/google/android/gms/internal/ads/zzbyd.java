package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzbyd
{
  private final Map zza = new HashMap();
  private final List zzb = new ArrayList();
  private final Context zzc;
  private final zzbxa zzd;
  
  zzbyd(Context paramContext, zzbxa paramzzbxa)
  {
    this.zzc = paramContext;
    this.zzd = paramzzbxa;
  }
  
  final void zzc(String paramString)
  {
    try
    {
      boolean bool = this.zza.containsKey(paramString);
      if (bool) {
        return;
      }
      SharedPreferences localSharedPreferences;
      if ("__default__".equals(paramString)) {
        localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
      } else {
        localSharedPreferences = this.zzc.getSharedPreferences(paramString, 0);
      }
      zzbyc localzzbyc = new com/google/android/gms/internal/ads/zzbyc;
      localzzbyc.<init>(this, paramString);
      this.zza.put(paramString, localzzbyc);
      localSharedPreferences.registerOnSharedPreferenceChangeListener(localzzbyc);
      return;
    }
    finally {}
  }
  
  final void zzd(zzbyb paramzzbyb)
  {
    try
    {
      this.zzb.add(paramzzbyb);
      return;
    }
    finally
    {
      paramzzbyb = finally;
      throw paramzzbyb;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */