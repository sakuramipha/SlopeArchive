package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class zzars
{
  private long zza = -1L;
  private long zzb = -1L;
  private long zzc = -1L;
  private long zzd = -1L;
  private long zze = -1L;
  private long zzf = -1L;
  private long zzg = -1L;
  private long zzh = -1L;
  
  private static DisplayMetrics zzl(Context paramContext)
  {
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    try
    {
      paramContext.getRealMetrics(localDisplayMetrics);
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      paramContext.getMetrics(localDisplayMetrics);
    }
    return localDisplayMetrics;
  }
  
  private static boolean zzm(View paramView)
  {
    View localView = paramView;
    try
    {
      if (paramView.getClass().getName().contains("DebugGestureViewWrapper")) {
        localView = ((ViewGroup)paramView).getChildAt(0);
      }
      paramView = localView.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(localView, new Object[0]);
      int i = ((Integer)paramView.getClass().getField("adType").get(paramView)).intValue();
      paramView = (String)paramView.getClass().getMethod("adTypeToString", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i) });
      if ((!paramView.contains("INTERSTITIAL")) && (!paramView.contains("APP_OPEN")))
      {
        boolean bool = paramView.contains("REWARDED");
        if (!bool) {
          return false;
        }
      }
      return true;
    }
    catch (SecurityException|ReflectiveOperationException paramView) {}
    return false;
  }
  
  public final long zza()
  {
    return this.zzg;
  }
  
  public final long zzb()
  {
    return this.zze;
  }
  
  public final long zzc()
  {
    return this.zza;
  }
  
  public final long zzd()
  {
    return this.zzc;
  }
  
  public final long zze()
  {
    return this.zzh;
  }
  
  public final long zzf()
  {
    return this.zzf;
  }
  
  public final long zzg()
  {
    return this.zzb;
  }
  
  public final long zzh()
  {
    return this.zzd;
  }
  
  public final void zzi()
  {
    this.zzh = this.zzg;
    this.zzg = SystemClock.uptimeMillis();
  }
  
  public final void zzj()
  {
    this.zzb = this.zza;
    this.zza = SystemClock.uptimeMillis();
  }
  
  public final void zzk(Context paramContext, View paramView)
  {
    this.zzd = this.zzc;
    this.zzc = SystemClock.uptimeMillis();
    long l = this.zze;
    if (l != -1L) {
      this.zzf = l;
    }
    paramContext = zzl(paramContext);
    int k = paramContext.widthPixels;
    int i = paramContext.heightPixels;
    if (paramView != null)
    {
      int j = Math.min(paramView.getWidth(), paramContext.widthPixels) * Math.min(paramView.getHeight(), paramContext.heightPixels);
      if ((j + j >= k * i) || ((j == 0) && (zzm(paramView))))
      {
        this.zze = this.zzc;
        return;
      }
    }
    this.zze = -1L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzars.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */