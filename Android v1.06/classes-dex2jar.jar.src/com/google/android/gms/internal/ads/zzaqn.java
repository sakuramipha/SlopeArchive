package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zzaqn
  implements zzaqm
{
  protected static volatile zzarr zza;
  protected MotionEvent zzb;
  protected final LinkedList zzc = new LinkedList();
  protected long zzd = 0L;
  protected long zze = 0L;
  protected long zzf = 0L;
  protected long zzg = 0L;
  protected long zzh = 0L;
  protected long zzi = 0L;
  protected long zzj = 0L;
  protected double zzk;
  protected float zzl;
  protected float zzm;
  protected float zzn;
  protected float zzo;
  protected boolean zzp = false;
  protected DisplayMetrics zzq;
  protected zzarj zzr;
  private double zzs;
  private double zzt;
  private boolean zzu = false;
  
  protected zzaqn(Context paramContext)
  {
    try
    {
      zzapf.zzd();
      this.zzq = paramContext.getResources().getDisplayMetrics();
      paramContext = zzbbk.zzcr;
      if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
      {
        paramContext = new com/google/android/gms/internal/ads/zzarj;
        paramContext.<init>();
        this.zzr = paramContext;
      }
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  private final void zzj()
  {
    this.zzh = 0L;
    this.zzd = 0L;
    this.zze = 0L;
    this.zzf = 0L;
    this.zzg = 0L;
    this.zzi = 0L;
    this.zzj = 0L;
    Object localObject;
    if (this.zzc.size() > 0)
    {
      localObject = this.zzc.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((MotionEvent)((Iterator)localObject).next()).recycle();
      }
      this.zzc.clear();
    }
    else
    {
      localObject = this.zzb;
      if (localObject != null) {
        ((MotionEvent)localObject).recycle();
      }
    }
    this.zzb = null;
  }
  
  private final String zzm(Context paramContext, String paramString, int paramInt, View paramView, Activity paramActivity, byte[] paramArrayOfByte)
  {
    long l1 = System.currentTimeMillis();
    paramArrayOfByte = zzbbk.zzcj;
    boolean bool = ((Boolean)zzba.zzc().zzb(paramArrayOfByte)).booleanValue();
    Object localObject = null;
    String str;
    byte[] arrayOfByte;
    if (bool)
    {
      if (zza != null) {
        paramArrayOfByte = zza.zzd();
      } else {
        paramArrayOfByte = null;
      }
      str = "be";
      arrayOfByte = paramArrayOfByte;
    }
    else
    {
      arrayOfByte = null;
      str = null;
    }
    if (paramInt == 3)
    {
      paramArrayOfByte = (byte[])localObject;
      try
      {
        paramContext = zzb(paramContext, paramView, paramActivity);
        try
        {
          this.zzu = true;
          i = 1002;
        }
        catch (Exception paramActivity)
        {
          break label220;
        }
        if (paramInt != 2) {
          break label143;
        }
      }
      catch (Exception paramView)
      {
        paramContext = paramArrayOfByte;
      }
    }
    else
    {
      paramArrayOfByte = (byte[])localObject;
      paramContext = zzd(paramContext, paramView, paramActivity);
      i = 1008;
      break label159;
    }
    label143:
    paramArrayOfByte = (byte[])localObject;
    paramContext = zzc(paramContext, null);
    int i = 1000;
    label159:
    if ((bool) && (arrayOfByte != null))
    {
      paramArrayOfByte = paramContext;
      long l2 = System.currentTimeMillis();
      try
      {
        arrayOfByte.zzc(i, -1, l2 - l1, str, null);
        paramView = paramContext;
      }
      catch (Exception paramView)
      {
        break label216;
      }
    }
    else
    {
      paramView = paramContext;
    }
    label216:
    label220:
    do
    {
      do
      {
        i = paramInt;
        paramContext = paramView;
        break;
        paramActivity = paramView;
        paramView = paramContext;
      } while (!bool);
      paramView = paramContext;
    } while (arrayOfByte == null);
    if (paramInt == 3)
    {
      i = 1003;
    }
    else if (paramInt == 2)
    {
      i = 1009;
    }
    else
    {
      paramInt = 1;
      i = 1001;
    }
    arrayOfByte.zzc(i, -1, System.currentTimeMillis() - l1, str, paramActivity);
    i = paramInt;
    l1 = System.currentTimeMillis();
    if (paramContext != null) {}
    try
    {
      if (((zzaol)paramContext.zzal()).zzaz() != 0)
      {
        paramContext = (zzaol)paramContext.zzal();
        paramInt = zzapf.zzc;
        paramString = zzapf.zza(paramContext.zzax(), paramString);
        paramContext = paramString;
        if (bool)
        {
          paramContext = paramString;
          if (arrayOfByte != null)
          {
            if (i == 3) {
              paramInt = 1006;
            } else if (i == 2) {
              paramInt = 1010;
            } else {
              paramInt = 1004;
            }
            arrayOfByte.zzc(paramInt, -1, System.currentTimeMillis() - l1, str, null);
            paramContext = paramString;
          }
        }
      }
      else
      {
        paramContext = Integer.toString(5);
      }
    }
    catch (Exception paramView)
    {
      paramString = Integer.toString(7);
      paramContext = paramString;
      if (bool)
      {
        paramContext = paramString;
        if (arrayOfByte != null)
        {
          if (i == 3) {
            paramInt = 1007;
          } else if (i == 2) {
            paramInt = 1011;
          } else {
            paramInt = 1005;
          }
          arrayOfByte.zzc(paramInt, -1, System.currentTimeMillis() - l1, str, paramView);
          paramContext = paramString;
        }
      }
    }
    return paramContext;
  }
  
  protected abstract long zza(StackTraceElement[] paramArrayOfStackTraceElement)
    throws zzarh;
  
  protected abstract zzano zzb(Context paramContext, View paramView, Activity paramActivity);
  
  protected abstract zzano zzc(Context paramContext, zzanh paramzzanh);
  
  protected abstract zzano zzd(Context paramContext, View paramView, Activity paramActivity);
  
  public final String zze(Context paramContext, String paramString, View paramView)
  {
    return zzm(paramContext, paramString, 3, paramView, null, null);
  }
  
  public final String zzf(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    return zzm(paramContext, paramString, 3, paramView, paramActivity, null);
  }
  
  public final String zzg(Context paramContext)
  {
    if (!zzaru.zzc()) {
      return zzm(paramContext, null, 1, null, null, null);
    }
    throw new IllegalStateException("The caller must not be called from the UI thread.");
  }
  
  public final String zzh(Context paramContext, View paramView, Activity paramActivity)
  {
    return zzm(paramContext, null, 2, paramView, paramActivity, null);
  }
  
  protected abstract zzart zzi(MotionEvent paramMotionEvent)
    throws zzarh;
  
  public final void zzk(MotionEvent paramMotionEvent)
  {
    for (;;)
    {
      Long localLong;
      label410:
      try
      {
        if (this.zzu)
        {
          zzj();
          this.zzu = false;
        }
        int i = paramMotionEvent.getAction();
        if (i != 0)
        {
          if ((i == 1) || (i == 2))
          {
            double d4 = paramMotionEvent.getRawX();
            double d1 = paramMotionEvent.getRawY();
            double d2 = d4 - this.zzs;
            double d3 = d1 - this.zzt;
            this.zzk += Math.sqrt(d2 * d2 + d3 * d3);
            this.zzs = d4;
            this.zzt = d1;
          }
        }
        else
        {
          this.zzk = 0.0D;
          this.zzs = paramMotionEvent.getRawX();
          this.zzt = paramMotionEvent.getRawY();
        }
        i = paramMotionEvent.getAction();
        if (i != 0) {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3) {
                continue;
              }
              this.zzg += 1L;
              continue;
            }
            this.zze += paramMotionEvent.getHistorySize() + 1;
          }
        }
      }
      finally {}
      try
      {
        paramMotionEvent = zzi(paramMotionEvent);
        localLong = paramMotionEvent.zzd;
        if ((localLong != null) && (paramMotionEvent.zzg != null)) {
          this.zzi += localLong.longValue() + paramMotionEvent.zzg.longValue();
        }
        if (this.zzq == null) {
          continue;
        }
        localLong = paramMotionEvent.zze;
        if ((localLong == null) || (paramMotionEvent.zzh == null)) {
          continue;
        }
        this.zzj += localLong.longValue() + paramMotionEvent.zzh.longValue();
      }
      catch (zzarh paramMotionEvent) {}
    }
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    this.zzb = paramMotionEvent;
    this.zzc.add(paramMotionEvent);
    if (this.zzc.size() > 6) {
      ((MotionEvent)this.zzc.remove()).recycle();
    }
    this.zzf += 1L;
    paramMotionEvent = new java/lang/Throwable;
    paramMotionEvent.<init>();
    this.zzh = zza(paramMotionEvent.getStackTrace());
    break label410;
    this.zzl = paramMotionEvent.getX();
    this.zzm = paramMotionEvent.getY();
    this.zzn = paramMotionEvent.getRawX();
    this.zzo = paramMotionEvent.getRawY();
    this.zzd += 1L;
    this.zzp = true;
  }
  
  public final void zzl(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      if (this.zzb != null)
      {
        localObject1 = zzbbk.zzch;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
          zzj();
        } else {
          this.zzb.recycle();
        }
      }
      Object localObject1 = this.zzq;
      if (localObject1 != null)
      {
        long l = paramInt3;
        float f2 = paramInt1;
        float f3 = ((DisplayMetrics)localObject1).density;
        float f1 = paramInt2;
        this.zzb = MotionEvent.obtain(0L, l, 1, f2 * f3, this.zzq.density * f1, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
      }
      else
      {
        this.zzb = null;
      }
      this.zzp = false;
      return;
    }
    finally {}
  }
  
  public final void zzn(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    Object localObject = zzbbk.zzcr;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzr;
      if (localObject != null) {
        ((zzarj)localObject).zzb(Arrays.asList(paramArrayOfStackTraceElement));
      }
    }
  }
  
  public void zzo(View paramView) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */