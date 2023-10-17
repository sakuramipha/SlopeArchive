package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzdsv;
import com.google.android.gms.internal.ads.zzdsz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzas
{
  private final Context zza;
  private final zzdsz zzb;
  private String zzc;
  private String zzd;
  private String zze;
  private String zzf;
  private int zzg = 0;
  private int zzh;
  private PointF zzi;
  private PointF zzj;
  private Handler zzk;
  private Runnable zzl = new zzar(this);
  
  public zzas(Context paramContext)
  {
    this.zza = paramContext;
    this.zzh = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    zzt.zzt().zzb();
    this.zzk = zzt.zzt().zza();
    this.zzb = zzt.zzs().zza();
  }
  
  public zzas(Context paramContext, String paramString)
  {
    this(paramContext);
    this.zzc = paramString;
  }
  
  private final void zzs(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    int i = zzu(localArrayList, "None", true);
    int j = zzu(localArrayList, "Shake", true);
    int k = zzu(localArrayList, "Flick", true);
    Object localObject = zzdsv.zza;
    int m = this.zzb.zza().ordinal();
    if (m != 1)
    {
      if (m == 2) {
        i = k;
      }
    }
    else {
      i = j;
    }
    zzt.zzp();
    paramContext = zzs.zzG(paramContext);
    localObject = new AtomicInteger(i);
    paramContext.setTitle("Setup gesture");
    paramContext.setSingleChoiceItems((CharSequence[])localArrayList.toArray(new String[0]), i, new zzaj((AtomicInteger)localObject));
    paramContext.setNegativeButton("Dismiss", new zzak(this));
    paramContext.setPositiveButton("Save", new zzal(this, (AtomicInteger)localObject, i, j, k));
    paramContext.setOnCancelListener(new zzam(this));
    paramContext.create().show();
  }
  
  private final boolean zzt(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (Math.abs(this.zzi.x - paramFloat1) < this.zzh) && (Math.abs(this.zzi.y - paramFloat2) < this.zzh) && (Math.abs(this.zzj.x - paramFloat3) < this.zzh) && (Math.abs(this.zzj.y - paramFloat4) < this.zzh);
  }
  
  private static final int zzu(List paramList, String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return -1;
    }
    paramList.add(paramString);
    return paramList.size() - 1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    localStringBuilder.append("{Dialog: ");
    localStringBuilder.append(this.zzc);
    localStringBuilder.append(",DebugSignal: ");
    localStringBuilder.append(this.zzf);
    localStringBuilder.append(",AFMA Version: ");
    localStringBuilder.append(this.zze);
    localStringBuilder.append(",Ad Unit ID: ");
    localStringBuilder.append(this.zzd);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void zzm(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getHistorySize();
    int j = paramMotionEvent.getPointerCount();
    if (i == 0)
    {
      this.zzg = 0;
      this.zzi = new PointF(paramMotionEvent.getX(0), paramMotionEvent.getY(0));
      return;
    }
    int m = this.zzg;
    if (m == -1) {
      return;
    }
    if (m == 0)
    {
      if (i == 5)
      {
        this.zzg = 5;
        this.zzj = new PointF(paramMotionEvent.getX(1), paramMotionEvent.getY(1));
        paramMotionEvent = this.zzk;
        Runnable localRunnable = this.zzl;
        zzbbc localzzbbc = zzbbk.zzes;
        paramMotionEvent.postDelayed(localRunnable, ((Long)zzba.zzc().zzb(localzzbbc)).longValue());
      }
    }
    else if (m == 5) {
      if (j == 2)
      {
        if (i == 2)
        {
          j = 0;
          i = 0;
          boolean bool;
          while (j < k)
          {
            i |= zzt(paramMotionEvent.getHistoricalX(0, j), paramMotionEvent.getHistoricalY(0, j), paramMotionEvent.getHistoricalX(1, j), paramMotionEvent.getHistoricalY(1, j)) ^ true;
            j++;
          }
          if ((zzt(paramMotionEvent.getX(), paramMotionEvent.getY(), paramMotionEvent.getX(1), paramMotionEvent.getY(1))) && (!bool)) {}
        }
      }
      else
      {
        this.zzg = -1;
        this.zzk.removeCallbacks(this.zzl);
      }
    }
  }
  
  public final void zzn(String paramString)
  {
    this.zzd = paramString;
  }
  
  public final void zzo(String paramString)
  {
    this.zze = paramString;
  }
  
  public final void zzp(String paramString)
  {
    this.zzc = paramString;
  }
  
  public final void zzq(String paramString)
  {
    this.zzf = paramString;
  }
  
  public final void zzr()
  {
    try
    {
      if (!(this.zza instanceof Activity))
      {
        zzbzt.zzi("Can not create dialog without Activity Context");
        return;
      }
      boolean bool = TextUtils.isEmpty(zzt.zzs().zzb());
      Object localObject1 = "Creative preview (enabled)";
      if (true == bool) {
        localObject1 = "Creative preview";
      }
      bool = zzt.zzs().zzm();
      Object localObject2 = "Troubleshooting (enabled)";
      if (true != bool) {
        localObject2 = "Troubleshooting";
      }
      Object localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      int j = zzu((List)localObject3, "Ad information", true);
      int k = zzu((List)localObject3, (String)localObject1, true);
      int i = zzu((List)localObject3, (String)localObject2, true);
      localObject1 = zzbbk.zziG;
      bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      int n = zzu((List)localObject3, "Open ad inspector", bool);
      int m = zzu((List)localObject3, "Ad inspector settings", bool);
      zzt.zzp();
      localObject1 = zzs.zzG(this.zza);
      localObject2 = ((AlertDialog.Builder)localObject1).setTitle("Select a debug mode");
      CharSequence[] arrayOfCharSequence = (CharSequence[])((List)localObject3).toArray(new String[0]);
      localObject3 = new com/google/android/gms/ads/internal/util/zzap;
      ((zzap)localObject3).<init>(this, j, k, i, n, m);
      ((AlertDialog.Builder)localObject2).setItems(arrayOfCharSequence, (DialogInterface.OnClickListener)localObject3);
      ((AlertDialog.Builder)localObject1).create().show();
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      zze.zzb("", localBadTokenException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */