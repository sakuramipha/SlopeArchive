package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

public final class zzddp
  extends zzcrf
{
  private final Context zzc;
  private final WeakReference zzd;
  private final zzdce zze;
  private final zzdey zzf;
  private final zzcrz zzg;
  private final zzfje zzh;
  private final zzcvv zzi;
  private boolean zzj = false;
  
  zzddp(zzcre paramzzcre, Context paramContext, @Nullable zzcfb paramzzcfb, zzdce paramzzdce, zzdey paramzzdey, zzcrz paramzzcrz, zzfje paramzzfje, zzcvv paramzzcvv)
  {
    super(paramzzcre);
    this.zzc = paramContext;
    this.zzd = new WeakReference(paramzzcfb);
    this.zze = paramzzdce;
    this.zzf = paramzzdey;
    this.zzg = paramzzcrz;
    this.zzh = paramzzfje;
    this.zzi = paramzzcvv;
  }
  
  public final void finalize()
    throws Throwable
  {
    try
    {
      zzcfb localzzcfb = (zzcfb)this.zzd.get();
      Object localObject2 = zzbbk.zzgw;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        if ((!this.zzj) && (localzzcfb != null))
        {
          zzfwc localzzfwc = zzcag.zze;
          localObject2 = new com/google/android/gms/internal/ads/zzddo;
          ((zzddo)localObject2).<init>(localzzcfb);
          localzzfwc.execute((Runnable)localObject2);
        }
      }
      else if (localzzcfb != null) {
        localzzcfb.destroy();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final boolean zza()
  {
    return this.zzg.zzg();
  }
  
  public final boolean zzc(boolean paramBoolean, @Nullable Activity paramActivity)
  {
    this.zze.zzb();
    Object localObject = zzbbk.zzaB;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzt.zzp();
      if (zzs.zzC(this.zzc))
      {
        zzbzt.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
        this.zzi.zzb();
        paramActivity = zzbbk.zzaC;
        if (!((Boolean)zzba.zzc().zzb(paramActivity)).booleanValue()) {
          break label178;
        }
        this.zzh.zza(this.zza.zzb.zzb.zzb);
        break label178;
      }
    }
    if (this.zzj)
    {
      zzbzt.zzj("The interstitial ad has been showed.");
      this.zzi.zza(zzfba.zzd(10, null, null));
    }
    if (!this.zzj)
    {
      localObject = paramActivity;
      if (paramActivity == null) {
        localObject = this.zzc;
      }
      try
      {
        this.zzf.zza(paramBoolean, (Context)localObject, this.zzi);
        this.zze.zza();
        this.zzj = true;
        return true;
      }
      catch (zzdex paramActivity)
      {
        this.zzi.zzc(paramActivity);
      }
    }
    label178:
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzddp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */