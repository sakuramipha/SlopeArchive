package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Display;

final class zzyv
  implements DisplayManager.DisplayListener, zzyt
{
  private final DisplayManager zza;
  private zzyr zzb;
  
  private zzyv(DisplayManager paramDisplayManager)
  {
    this.zza = paramDisplayManager;
  }
  
  public static zzyt zzc(Context paramContext)
  {
    paramContext = (DisplayManager)paramContext.getSystemService("display");
    if (paramContext != null) {
      return new zzyv(paramContext);
    }
    return null;
  }
  
  private final Display zzd()
  {
    return this.zza.getDisplay(0);
  }
  
  public final void onDisplayAdded(int paramInt) {}
  
  public final void onDisplayChanged(int paramInt)
  {
    zzyr localzzyr = this.zzb;
    if ((localzzyr != null) && (paramInt == 0))
    {
      Display localDisplay = zzd();
      zzyx.zzb(localzzyr.zza, localDisplay);
    }
  }
  
  public final void onDisplayRemoved(int paramInt) {}
  
  public final void zza()
  {
    this.zza.unregisterDisplayListener(this);
    this.zzb = null;
  }
  
  public final void zzb(zzyr paramzzyr)
  {
    this.zzb = paramzzyr;
    this.zza.registerDisplayListener(this, zzfn.zzs(null));
    Display localDisplay = zzd();
    zzyx.zzb(paramzzyr.zza, localDisplay);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */