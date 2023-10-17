package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzffq
  implements Runnable
{
  private final List zza = new ArrayList();
  private final zzfft zzb;
  private String zzc;
  private String zzd;
  private zzezq zze;
  private zze zzf;
  private Future zzg;
  private int zzh = 2;
  
  zzffq(zzfft paramzzfft)
  {
    this.zzb = paramzzfft;
  }
  
  public final void run()
  {
    try
    {
      zzg();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzffq zza(zzfff paramzzfff)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue())
      {
        Object localObject = this.zza;
        paramzzfff.zzi();
        ((List)localObject).add(paramzzfff);
        paramzzfff = this.zzg;
        if (paramzzfff != null) {
          paramzzfff.cancel(false);
        }
        paramzzfff = zzcag.zzd;
        localObject = zzbbk.zzik;
        this.zzg = paramzzfff.schedule(this, ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue(), TimeUnit.MILLISECONDS);
      }
      return this;
    }
    finally {}
  }
  
  public final zzffq zzb(String paramString)
  {
    try
    {
      if ((((Boolean)zzbcw.zzc.zze()).booleanValue()) && (zzffp.zze(paramString))) {
        this.zzc = paramString;
      }
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final zzffq zzc(zze paramzze)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue()) {
        this.zzf = paramzze;
      }
      return this;
    }
    finally
    {
      paramzze = finally;
      throw paramzze;
    }
  }
  
  public final zzffq zzd(ArrayList paramArrayList)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue()) {
        if ((!paramArrayList.contains("banner")) && (!paramArrayList.contains(AdFormat.BANNER.name())))
        {
          if ((!paramArrayList.contains("interstitial")) && (!paramArrayList.contains(AdFormat.INTERSTITIAL.name())))
          {
            if ((!paramArrayList.contains("native")) && (!paramArrayList.contains(AdFormat.NATIVE.name())))
            {
              if ((!paramArrayList.contains("rewarded")) && (!paramArrayList.contains(AdFormat.REWARDED.name())))
              {
                if (paramArrayList.contains("app_open_ad")) {
                  this.zzh = 7;
                } else if ((paramArrayList.contains("rewarded_interstitial")) || (paramArrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name()))) {
                  this.zzh = 6;
                }
              }
              else {
                this.zzh = 5;
              }
            }
            else {
              this.zzh = 8;
            }
          }
          else {
            this.zzh = 4;
          }
        }
        else {
          this.zzh = 3;
        }
      }
      return this;
    }
    finally {}
  }
  
  public final zzffq zze(String paramString)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue()) {
        this.zzd = paramString;
      }
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final zzffq zzf(zzezq paramzzezq)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue()) {
        this.zze = paramzzezq;
      }
      return this;
    }
    finally
    {
      paramzzezq = finally;
      throw paramzzezq;
    }
  }
  
  public final void zzg()
  {
    try
    {
      boolean bool = ((Boolean)zzbcw.zzc.zze()).booleanValue();
      if (!bool) {
        return;
      }
      Object localObject1 = this.zzg;
      if (localObject1 != null) {
        ((Future)localObject1).cancel(false);
      }
      localObject1 = this.zza.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        zzfff localzzfff = (zzfff)((Iterator)localObject1).next();
        int i = this.zzh;
        if (i != 2) {
          localzzfff.zzm(i);
        }
        if (!TextUtils.isEmpty(this.zzc)) {
          localzzfff.zze(this.zzc);
        }
        if ((!TextUtils.isEmpty(this.zzd)) && (!localzzfff.zzk())) {
          localzzfff.zzd(this.zzd);
        }
        Object localObject3 = this.zze;
        if (localObject3 != null)
        {
          localzzfff.zzb((zzezq)localObject3);
        }
        else
        {
          localObject3 = this.zzf;
          if (localObject3 != null) {
            localzzfff.zza((zze)localObject3);
          }
        }
        this.zzb.zzb(localzzfff.zzl());
      }
      this.zza.clear();
      return;
    }
    finally {}
  }
  
  public final zzffq zzh(int paramInt)
  {
    try
    {
      if (((Boolean)zzbcw.zzc.zze()).booleanValue()) {
        this.zzh = paramInt;
      }
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzffq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */