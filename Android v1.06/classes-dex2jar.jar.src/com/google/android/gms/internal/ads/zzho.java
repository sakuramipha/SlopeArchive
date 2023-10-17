package com.google.android.gms.internal.ads;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

final class zzho
  implements AudioManager.OnAudioFocusChangeListener
{
  final zzhq zza;
  private final Handler zzb;
  
  public zzho(zzhq paramzzhq, Handler paramHandler)
  {
    this.zzb = paramHandler;
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    this.zzb.post(new zzhn(this, paramInt));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */