package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

final class zzyu
  implements zzyt
{
  private final WindowManager zza;
  
  private zzyu(WindowManager paramWindowManager)
  {
    this.zza = paramWindowManager;
  }
  
  public static zzyt zzc(Context paramContext)
  {
    paramContext = (WindowManager)paramContext.getSystemService("window");
    if (paramContext != null) {
      return new zzyu(paramContext);
    }
    return null;
  }
  
  public final void zza() {}
  
  public final void zzb(zzyr paramzzyr)
  {
    Display localDisplay = this.zza.getDefaultDisplay();
    zzyx.zzb(paramzzyr.zza, localDisplay);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */