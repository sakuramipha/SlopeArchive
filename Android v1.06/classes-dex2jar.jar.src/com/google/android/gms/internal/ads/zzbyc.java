package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Iterator;
import java.util.List;

final class zzbyc
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  final zzbyd zza;
  private final String zzb;
  
  public zzbyc(zzbyd paramzzbyd, String paramString)
  {
    this.zzb = paramString;
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    synchronized (this.zza)
    {
      Iterator localIterator = zzbyd.zza(this.zza).iterator();
      while (localIterator.hasNext())
      {
        zzbyb localzzbyb = (zzbyb)localIterator.next();
        String str = this.zzb;
        localzzbyb.zza.zzb(localzzbyb.zzb, paramSharedPreferences, str, paramString);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */