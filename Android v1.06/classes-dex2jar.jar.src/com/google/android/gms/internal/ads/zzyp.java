package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.view.Surface;

public final class zzyp
  extends Surface
{
  private static int zzb;
  private static boolean zzc;
  public final boolean zza;
  private final zzyn zzd;
  private boolean zze;
  
  public static zzyp zza(Context paramContext, boolean paramBoolean)
  {
    int i = 0;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramBoolean) {
      if (zzb(paramContext)) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    zzdy.zzf(bool1);
    paramContext = new zzyn();
    if (paramBoolean) {
      i = zzb;
    }
    return paramContext.zza(i);
  }
  
  public static boolean zzb(Context paramContext)
  {
    try
    {
      if (!zzc)
      {
        i = zzfn.zza;
        int j = 2;
        if (i < 24) {}
        do
        {
          do
          {
            i = 0;
            break;
          } while (((zzfn.zza < 26) && (("samsung".equals(zzfn.zzc)) || ("XT1650".equals(zzfn.zzd)))) || ((zzfn.zza < 26) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))));
          paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        } while ((paramContext == null) || (!paramContext.contains("EGL_EXT_protected_content")));
        paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        i = j;
        if (paramContext != null)
        {
          i = j;
          if (paramContext.contains("EGL_KHR_surfaceless_context")) {
            i = 1;
          }
        }
        zzb = i;
        zzc = true;
      }
      int i = zzb;
      return i != 0;
    }
    finally {}
  }
  
  public final void release()
  {
    super.release();
    synchronized (this.zzd)
    {
      if (!this.zze)
      {
        this.zzd.zzb();
        this.zze = true;
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */