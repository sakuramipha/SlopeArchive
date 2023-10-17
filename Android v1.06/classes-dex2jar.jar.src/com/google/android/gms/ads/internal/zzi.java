package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzfkp;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public final class zzi
  implements Runnable, zzaqm
{
  protected boolean zza;
  final CountDownLatch zzb = new CountDownLatch(1);
  private final List zzc = new Vector();
  private final AtomicReference zzd = new AtomicReference();
  private final AtomicReference zze = new AtomicReference();
  private final boolean zzf;
  private final boolean zzg;
  private final Executor zzh;
  private final zzfit zzi;
  private Context zzj;
  private final Context zzk;
  private zzbzz zzl;
  private final zzbzz zzm;
  private final boolean zzn;
  private int zzo;
  
  public zzi(Context paramContext, zzbzz paramzzbzz)
  {
    this.zzj = paramContext;
    this.zzk = paramContext;
    this.zzl = paramzzbzz;
    this.zzm = paramzzbzz;
    paramzzbzz = Executors.newCachedThreadPool();
    this.zzh = paramzzbzz;
    zzbbc localzzbbc = zzbbk.zzcb;
    boolean bool = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
    this.zzn = bool;
    this.zzi = zzfit.zza(paramContext, paramzzbzz, bool);
    paramContext = zzbbk.zzbX;
    this.zzf = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    paramContext = zzbbk.zzcc;
    this.zzg = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    paramContext = zzbbk.zzca;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue()) {
      this.zzo = 2;
    } else {
      this.zzo = 1;
    }
    paramContext = zzbbk.zzdd;
    if (!((Boolean)zzba.zzc().zzb(paramContext)).booleanValue()) {
      this.zza = zzc();
    }
    paramContext = zzbbk.zzcW;
    if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
    {
      zzcag.zza.execute(this);
      return;
    }
    zzay.zzb();
    if (zzbzm.zzu())
    {
      zzcag.zza.execute(this);
      return;
    }
    run();
  }
  
  private final zzaqm zzj()
  {
    if (zzi() == 2) {
      return (zzaqm)this.zze.get();
    }
    return (zzaqm)this.zzd.get();
  }
  
  private final void zzm()
  {
    zzaqm localzzaqm = zzj();
    if ((!this.zzc.isEmpty()) && (localzzaqm != null))
    {
      Iterator localIterator = this.zzc.iterator();
      while (localIterator.hasNext())
      {
        Object[] arrayOfObject = (Object[])localIterator.next();
        int i = arrayOfObject.length;
        if (i == 1) {
          localzzaqm.zzk((MotionEvent)arrayOfObject[0]);
        } else if (i == 3) {
          localzzaqm.zzl(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
        }
      }
      this.zzc.clear();
    }
  }
  
  private final void zzp(boolean paramBoolean)
  {
    zzaqp localzzaqp = zzaqp.zzu(this.zzl.zza, zzq(this.zzj), paramBoolean, this.zzo);
    this.zzd.set(localzzaqp);
  }
  
  private static final Context zzq(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      return paramContext;
    }
    return localContext;
  }
  
  public final void run()
  {
    try
    {
      Object localObject1 = zzbbk.zzdd;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
        this.zza = zzc();
      }
      boolean bool3 = this.zzl.zzd;
      localObject1 = zzbbk.zzaT;
      boolean bool4 = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (!bool4)
      {
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      if (zzi() == 1)
      {
        zzp(bool1);
        if (this.zzo == 2)
        {
          localObject1 = this.zzh;
          zzg localzzg = new com/google/android/gms/ads/internal/zzg;
          localzzg.<init>(this, bool1);
          ((Executor)localObject1).execute(localzzg);
        }
      }
      else
      {
        long l = System.currentTimeMillis();
        try
        {
          localObject1 = zzaqj.zza(this.zzl.zza, zzq(this.zzj), bool1, this.zzn);
          this.zze.set(localObject1);
          if ((this.zzg) && (!((zzaqj)localObject1).zzr()))
          {
            this.zzo = 1;
            zzp(bool1);
          }
        }
        catch (NullPointerException localNullPointerException)
        {
          this.zzo = 1;
          zzp(bool1);
          this.zzi.zzc(2031, System.currentTimeMillis() - l, localNullPointerException);
        }
      }
      return;
    }
    finally
    {
      this.zzb.countDown();
      this.zzj = null;
      this.zzl = null;
    }
  }
  
  protected final boolean zzc()
  {
    Object localObject = this.zzj;
    zzfit localzzfit = this.zzi;
    zzh localzzh = new zzh(this);
    Context localContext = this.zzj;
    int i = zzfjv.zzb((Context)localObject, localzzfit);
    localObject = zzbbk.zzbY;
    return new zzfkp(localContext, i, localzzh, ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()).zzd(1);
  }
  
  public final boolean zzd()
  {
    try
    {
      this.zzb.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzbzt.zzk("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
  
  public final String zze(Context paramContext, String paramString, View paramView)
  {
    return zzf(paramContext, paramString, paramView, null);
  }
  
  public final String zzf(Context paramContext, String paramString, View paramView, Activity paramActivity)
  {
    if (zzd())
    {
      zzaqm localzzaqm = zzj();
      zzbbc localzzbbc = zzbbk.zzjk;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzt.zzp();
        zzs.zzF(paramView, 4, null);
      }
      if (localzzaqm != null)
      {
        zzm();
        return localzzaqm.zzf(zzq(paramContext), paramString, paramView, paramActivity);
      }
    }
    return "";
  }
  
  public final String zzg(Context paramContext)
  {
    if (zzd())
    {
      zzaqm localzzaqm = zzj();
      if (localzzaqm != null)
      {
        zzm();
        return localzzaqm.zzg(zzq(paramContext));
      }
    }
    paramContext = "";
    return paramContext;
  }
  
  public final String zzh(Context paramContext, View paramView, Activity paramActivity)
  {
    Object localObject = zzbbk.zzjj;
    zzbbc localzzbbc;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      if (zzd())
      {
        localObject = zzj();
        localzzbbc = zzbbk.zzjk;
        if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
        {
          zzt.zzp();
          zzs.zzF(paramView, 2, null);
        }
        if (localObject != null) {
          return ((zzaqm)localObject).zzh(paramContext, paramView, paramActivity);
        }
      }
    }
    else
    {
      localObject = zzj();
      localzzbbc = zzbbk.zzjk;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzt.zzp();
        zzs.zzF(paramView, 2, null);
      }
      if (localObject != null) {
        return ((zzaqm)localObject).zzh(paramContext, paramView, paramActivity);
      }
    }
    return "";
  }
  
  protected final int zzi()
  {
    if ((this.zzf) && (!this.zza)) {
      return 1;
    }
    return this.zzo;
  }
  
  public final void zzk(MotionEvent paramMotionEvent)
  {
    zzaqm localzzaqm = zzj();
    if (localzzaqm != null)
    {
      zzm();
      localzzaqm.zzk(paramMotionEvent);
      return;
    }
    this.zzc.add(new Object[] { paramMotionEvent });
  }
  
  public final void zzl(int paramInt1, int paramInt2, int paramInt3)
  {
    zzaqm localzzaqm = zzj();
    if (localzzaqm != null)
    {
      zzm();
      localzzaqm.zzl(paramInt1, paramInt2, paramInt3);
      return;
    }
    this.zzc.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final void zzn(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (zzd())
    {
      zzaqm localzzaqm = zzj();
      if (localzzaqm != null) {
        localzzaqm.zzn(paramArrayOfStackTraceElement);
      }
    }
  }
  
  public final void zzo(View paramView)
  {
    zzaqm localzzaqm = zzj();
    if (localzzaqm != null) {
      localzzaqm.zzo(paramView);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */