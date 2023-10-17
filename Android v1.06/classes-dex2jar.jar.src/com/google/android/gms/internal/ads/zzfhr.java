package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfhr
  implements Runnable
{
  final zzfhs zza;
  private final WebView zzb;
  
  zzfhr(zzfhs paramzzfhs)
  {
    this.zzb = zzfhs.zzl(paramzzfhs);
  }
  
  public final void run()
  {
    this.zzb.destroy();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */