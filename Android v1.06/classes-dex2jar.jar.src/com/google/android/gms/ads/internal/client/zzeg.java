package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

final class zzeg
  extends zzcz
{
  public final void zze(@Nullable zze paramzze)
  {
    OnAdInspectorClosedListener localOnAdInspectorClosedListener = zzej.zzb(zzej.zzf());
    if (localOnAdInspectorClosedListener != null)
    {
      if (paramzze == null) {
        paramzze = null;
      } else {
        paramzze = new AdInspectorError(paramzze.zza, paramzze.zzb, paramzze.zzc);
      }
      localOnAdInspectorClosedListener.onAdInspectorClosed(paramzze);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */