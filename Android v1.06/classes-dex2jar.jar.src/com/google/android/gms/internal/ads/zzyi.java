package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Display.HdrCapabilities;

final class zzyi
{
  public static boolean zza(Context paramContext)
  {
    paramContext = (DisplayManager)paramContext.getSystemService("display");
    boolean bool2 = false;
    if (paramContext != null) {
      paramContext = paramContext.getDisplay(0);
    } else {
      paramContext = null;
    }
    boolean bool1 = bool2;
    if (paramContext != null)
    {
      bool1 = bool2;
      if (paramContext.isHdr())
      {
        paramContext = paramContext.getHdrCapabilities().getSupportedHdrTypes();
        int j = paramContext.length;
        for (int i = 0;; i++)
        {
          bool1 = bool2;
          if (i >= j) {
            break;
          }
          if (paramContext[i] == 1)
          {
            bool1 = true;
            break;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */