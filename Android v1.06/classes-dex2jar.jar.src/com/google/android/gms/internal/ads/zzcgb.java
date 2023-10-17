package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

public final class zzcgb
{
  private final zzcgc zza;
  private final zzcga zzb;
  
  public zzcgb(zzcgc paramzzcgc, zzcga paramzzcga)
  {
    this.zzb = paramzzcga;
    this.zza = paramzzcgc;
  }
  
  @JavascriptInterface
  public String getClickSignals(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      zze.zza("Click string is empty, not proceeding.");
      return "";
    }
    Object localObject2 = this.zza;
    Object localObject1 = ((zzcgj)localObject2).zzI();
    if (localObject1 == null)
    {
      zze.zza("Signal utils is empty, ignoring.");
      return "";
    }
    localObject1 = ((zzaqq)localObject1).zzc();
    if (localObject1 == null)
    {
      zze.zza("Signals object is empty, ignoring.");
      return "";
    }
    if (((zzcgc)localObject2).getContext() == null)
    {
      zze.zza("Context is null, ignoring.");
      return "";
    }
    localObject2 = this.zza.getContext();
    zzcgc localzzcgc = this.zza;
    Activity localActivity = localzzcgc.zzi();
    return ((zzaqm)localObject1).zzf((Context)localObject2, paramString, (View)localzzcgc, localActivity);
  }
  
  @JavascriptInterface
  public String getViewSignals()
  {
    Object localObject2 = this.zza;
    Object localObject1 = ((zzcgj)localObject2).zzI();
    if (localObject1 == null)
    {
      zze.zza("Signal utils is empty, ignoring.");
      return "";
    }
    localObject1 = ((zzaqq)localObject1).zzc();
    if (localObject1 == null)
    {
      zze.zza("Signals object is empty, ignoring.");
      return "";
    }
    if (((zzcgc)localObject2).getContext() == null)
    {
      zze.zza("Context is null, ignoring.");
      return "";
    }
    localObject2 = this.zza.getContext();
    zzcgc localzzcgc = this.zza;
    Activity localActivity = localzzcgc.zzi();
    return ((zzaqm)localObject1).zzh((Context)localObject2, (View)localzzcgc, localActivity);
  }
  
  @JavascriptInterface
  public void notify(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      zzbzt.zzj("URL is empty, ignoring message");
      return;
    }
    zzs.zza.post(new zzcfz(this, paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */