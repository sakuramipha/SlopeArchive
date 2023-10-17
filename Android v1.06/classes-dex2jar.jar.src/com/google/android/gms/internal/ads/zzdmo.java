package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

public final class zzdmo
  extends zzcrf
{
  private final Context zzc;
  private final WeakReference zzd;
  private final zzdey zze;
  private final zzdce zzf;
  private final zzcvv zzg;
  private final zzcxc zzh;
  private final zzcrz zzi;
  private final zzbvm zzj;
  private final zzfje zzk;
  private final zzezt zzl;
  private boolean zzm = false;
  
  zzdmo(zzcre paramzzcre, Context paramContext, zzcfb paramzzcfb, zzdey paramzzdey, zzdce paramzzdce, zzcvv paramzzcvv, zzcxc paramzzcxc, zzcrz paramzzcrz, zzezf paramzzezf, zzfje paramzzfje, zzezt paramzzezt)
  {
    super(paramzzcre);
    this.zzc = paramContext;
    this.zze = paramzzdey;
    this.zzd = new WeakReference(paramzzcfb);
    this.zzf = paramzzdce;
    this.zzg = paramzzcvv;
    this.zzh = paramzzcxc;
    this.zzi = paramzzcrz;
    this.zzk = paramzzfje;
    paramContext = paramzzezf.zzm;
    if (paramContext != null) {
      paramzzcre = paramContext.zza;
    } else {
      paramzzcre = "";
    }
    int i;
    if (paramContext != null) {
      i = paramContext.zzb;
    } else {
      i = 1;
    }
    this.zzj = new zzbwg(paramzzcre, i);
    this.zzl = paramzzezt;
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
        if ((!this.zzm) && (localzzcfb != null))
        {
          zzfwc localzzfwc = zzcag.zze;
          localObject2 = new com/google/android/gms/internal/ads/zzdmn;
          ((zzdmn)localObject2).<init>(localzzcfb);
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
  
  public final Bundle zza()
  {
    return this.zzh.zzb();
  }
  
  public final zzbvm zzc()
  {
    return this.zzj;
  }
  
  public final zzezt zzd()
  {
    return this.zzl;
  }
  
  public final boolean zze()
  {
    return this.zzi.zzg();
  }
  
  public final boolean zzf()
  {
    return this.zzm;
  }
  
  public final boolean zzg()
  {
    zzcfb localzzcfb = (zzcfb)this.zzd.get();
    return (localzzcfb != null) && (!localzzcfb.zzaB());
  }
  
  public final boolean zzh(boolean paramBoolean, Activity paramActivity)
  {
    Object localObject = zzbbk.zzaB;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzt.zzp();
      if (zzs.zzC(this.zzc))
      {
        zzbzt.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
        this.zzg.zzb();
        paramActivity = zzbbk.zzaC;
        if (((Boolean)zzba.zzc().zzb(paramActivity)).booleanValue()) {
          this.zzk.zza(this.zza.zzb.zzb.zzb);
        }
        return false;
      }
    }
    if (this.zzm)
    {
      zzbzt.zzj("The rewarded ad have been showed.");
      this.zzg.zza(zzfba.zzd(10, null, null));
      return false;
    }
    this.zzm = true;
    this.zzf.zzb();
    localObject = paramActivity;
    if (paramActivity == null) {
      localObject = this.zzc;
    }
    try
    {
      this.zze.zza(paramBoolean, (Context)localObject, this.zzg);
      this.zzf.zza();
      return true;
    }
    catch (zzdex paramActivity)
    {
      this.zzg.zzc(paramActivity);
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */