package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdqz
  implements AppEventListener, zzcyd, zza, zzcvi, zzcwc, zzcwd, zzcww, zzcvl, zzfee
{
  private final List zza;
  private final zzdqn zzb;
  private long zzc;
  
  public zzdqz(zzdqn paramzzdqn, zzcgw paramzzcgw)
  {
    this.zzb = paramzzdqn;
    this.zza = Collections.singletonList(paramzzcgw);
  }
  
  private final void zze(Class paramClass, String paramString, Object... paramVarArgs)
  {
    this.zzb.zza(this.zza, "Event-".concat(String.valueOf(paramClass.getSimpleName())), paramString, paramVarArgs);
  }
  
  public final void onAdClicked()
  {
    zze(zza.class, "onAdClicked", new Object[0]);
  }
  
  public final void onAppEvent(String paramString1, String paramString2)
  {
    zze(AppEventListener.class, "onAppEvent", new Object[] { paramString1, paramString2 });
  }
  
  public final void zza(com.google.android.gms.ads.internal.client.zze paramzze)
  {
    zze(zzcvl.class, "onAdFailedToLoad", new Object[] { Integer.valueOf(paramzze.zza), paramzze.zzb, paramzze.zzc });
  }
  
  public final void zzb(zzezr paramzzezr) {}
  
  public final void zzbA(zzbug paramzzbug)
  {
    this.zzc = zzt.zzB().elapsedRealtime();
    zze(zzcyd.class, "onAdRequest", new Object[0]);
  }
  
  public final void zzbB(zzfdx paramzzfdx, String paramString)
  {
    zze(zzfdw.class, "onTaskCreated", new Object[] { paramString });
  }
  
  public final void zzbC(zzfdx paramzzfdx, String paramString, Throwable paramThrowable)
  {
    zze(zzfdw.class, "onTaskFailed", new Object[] { paramString, paramThrowable.getClass().getSimpleName() });
  }
  
  public final void zzbn(Context paramContext)
  {
    zze(zzcwd.class, "onDestroy", new Object[] { paramContext });
  }
  
  public final void zzbp(Context paramContext)
  {
    zze(zzcwd.class, "onPause", new Object[] { paramContext });
  }
  
  public final void zzbq(Context paramContext)
  {
    zze(zzcwd.class, "onResume", new Object[] { paramContext });
  }
  
  public final void zzbr()
  {
    zze(zzcvi.class, "onRewardedVideoStarted", new Object[0]);
  }
  
  public final void zzc(zzfdx paramzzfdx, String paramString)
  {
    zze(zzfdw.class, "onTaskStarted", new Object[] { paramString });
  }
  
  public final void zzd(zzfdx paramzzfdx, String paramString)
  {
    zze(zzfdw.class, "onTaskSucceeded", new Object[] { paramString });
  }
  
  public final void zzj()
  {
    zze(zzcvi.class, "onAdClosed", new Object[0]);
  }
  
  public final void zzl()
  {
    zze(zzcwc.class, "onAdImpression", new Object[0]);
  }
  
  public final void zzm()
  {
    zze(zzcvi.class, "onAdLeftApplication", new Object[0]);
  }
  
  public final void zzn()
  {
    long l2 = zzt.zzB().elapsedRealtime();
    long l1 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ad Request Latency : ");
    localStringBuilder.append(l2 - l1);
    com.google.android.gms.ads.internal.util.zze.zza(localStringBuilder.toString());
    zze(zzcww.class, "onAdLoaded", new Object[0]);
  }
  
  public final void zzo()
  {
    zze(zzcvi.class, "onAdOpened", new Object[0]);
  }
  
  @ParametersAreNonnullByDefault
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2)
  {
    zze(zzcvi.class, "onRewarded", new Object[] { paramzzbuw, paramString1, paramString2 });
  }
  
  public final void zzq()
  {
    zze(zzcvi.class, "onRewardedVideoCompleted", new Object[0]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */