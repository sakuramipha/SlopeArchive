package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcnz
  implements zzaty, zzcwd, zzo, zzcwc
{
  private final zzcnu zza;
  private final zzcnv zzb;
  private final Set zzc = new HashSet();
  private final zzbnk zzd;
  private final Executor zze;
  private final Clock zzf;
  private final AtomicBoolean zzg = new AtomicBoolean(false);
  private final zzcny zzh = new zzcny();
  private boolean zzi = false;
  private WeakReference zzj = new WeakReference(this);
  
  public zzcnz(zzbnh paramzzbnh, zzcnv paramzzcnv, Executor paramExecutor, zzcnu paramzzcnu, Clock paramClock)
  {
    this.zza = paramzzcnu;
    this.zzd = paramzzbnh.zza("google.afma.activeView.handleUpdate", zzbmv.zza, zzbmv.zza);
    this.zzb = paramzzcnv;
    this.zze = paramExecutor;
    this.zzf = paramClock;
  }
  
  private final void zzk()
  {
    Iterator localIterator = this.zzc.iterator();
    while (localIterator.hasNext())
    {
      zzcfb localzzcfb = (zzcfb)localIterator.next();
      this.zza.zzf(localzzcfb);
    }
    this.zza.zze();
  }
  
  public final void zzb() {}
  
  public final void zzbF()
  {
    try
    {
      this.zzh.zzb = false;
      zzg();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzbn(Context paramContext)
  {
    try
    {
      this.zzh.zze = "u";
      zzg();
      zzk();
      this.zzi = true;
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void zzbo()
  {
    try
    {
      this.zzh.zzb = true;
      zzg();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzbp(Context paramContext)
  {
    try
    {
      this.zzh.zzb = true;
      zzg();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void zzbq(Context paramContext)
  {
    try
    {
      this.zzh.zzb = false;
      zzg();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void zzby() {}
  
  public final void zzc(zzatx paramzzatx)
  {
    try
    {
      zzcny localzzcny = this.zzh;
      localzzcny.zza = paramzzatx.zzj;
      localzzcny.zzf = paramzzatx;
      zzg();
      return;
    }
    finally
    {
      paramzzatx = finally;
      throw paramzzatx;
    }
  }
  
  public final void zze() {}
  
  public final void zzf(int paramInt) {}
  
  public final void zzg()
  {
    try
    {
      if (this.zzj.get() != null)
      {
        if (!this.zzi)
        {
          boolean bool = this.zzg.get();
          if (bool) {
            try
            {
              this.zzh.zzd = this.zzf.elapsedRealtime();
              JSONObject localJSONObject = this.zzb.zza(this.zzh);
              Iterator localIterator = this.zzc.iterator();
              while (localIterator.hasNext())
              {
                zzcfb localzzcfb = (zzcfb)localIterator.next();
                Executor localExecutor = this.zze;
                zzcnx localzzcnx = new com/google/android/gms/internal/ads/zzcnx;
                localzzcnx.<init>(localzzcfb, localJSONObject);
                localExecutor.execute(localzzcnx);
              }
              zzcaj.zzb(this.zzd.zzb(localJSONObject), "ActiveViewListener.callActiveViewJs");
              return;
            }
            catch (Exception localException)
            {
              zze.zzb("Failed to call ActiveViewJS", localException);
              return;
            }
          }
        }
        return;
      }
      zzj();
      return;
    }
    finally {}
  }
  
  public final void zzh(zzcfb paramzzcfb)
  {
    try
    {
      this.zzc.add(paramzzcfb);
      this.zza.zzd(paramzzcfb);
      return;
    }
    finally
    {
      paramzzcfb = finally;
      throw paramzzcfb;
    }
  }
  
  public final void zzi(Object paramObject)
  {
    this.zzj = new WeakReference(paramObject);
  }
  
  public final void zzj()
  {
    try
    {
      zzk();
      this.zzi = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzl()
  {
    try
    {
      if (this.zzg.compareAndSet(false, true))
      {
        this.zza.zzc(this);
        zzg();
        return;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */