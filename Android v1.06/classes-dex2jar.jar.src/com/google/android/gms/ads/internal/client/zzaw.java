package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.HashMap;

public final class zzaw
{
  private final zzk zza;
  private final zzi zzb;
  private final zzeq zzc;
  private final zzbgp zzd;
  private final zzbwb zze;
  private final zzbrs zzf;
  private final zzbgq zzg;
  private zzbta zzh;
  
  public zzaw(zzk paramzzk, zzi paramzzi, zzeq paramzzeq, zzbgp paramzzbgp, zzbwb paramzzbwb, zzbrs paramzzbrs, zzbgq paramzzbgq)
  {
    this.zza = paramzzk;
    this.zzb = paramzzi;
    this.zzc = paramzzeq;
    this.zzd = paramzzbgp;
    this.zze = paramzzbwb;
    this.zzf = paramzzbrs;
    this.zzg = paramzzbgq;
  }
  
  public final zzbq zzc(Context paramContext, String paramString, zzbny paramzzbny)
  {
    return (zzbq)new zzao(this, paramContext, paramString, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzbu zzd(Context paramContext, zzq paramzzq, String paramString, zzbny paramzzbny)
  {
    return (zzbu)new zzak(this, paramContext, paramzzq, paramString, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzbu zze(Context paramContext, zzq paramzzq, String paramString, zzbny paramzzbny)
  {
    return (zzbu)new zzam(this, paramContext, paramzzq, paramString, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzdj zzf(Context paramContext, zzbny paramzzbny)
  {
    return (zzdj)new zzac(this, paramContext, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzbeu zzh(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    return (zzbeu)new zzas(this, paramFrameLayout1, paramFrameLayout2, paramContext).zzd(paramContext, false);
  }
  
  public final zzbfa zzi(View paramView, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    return (zzbfa)new zzau(this, paramView, paramHashMap1, paramHashMap2).zzd(paramView.getContext(), false);
  }
  
  public final zzbji zzl(Context paramContext, zzbny paramzzbny, OnH5AdsEventListener paramOnH5AdsEventListener)
  {
    return (zzbji)new zzai(this, paramContext, paramzzbny, paramOnH5AdsEventListener).zzd(paramContext, false);
  }
  
  public final zzbro zzm(Context paramContext, zzbny paramzzbny)
  {
    return (zzbro)new zzag(this, paramContext, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzbrv zzo(Activity paramActivity)
  {
    zzaa localzzaa = new zzaa(this, paramActivity);
    Intent localIntent = paramActivity.getIntent();
    boolean bool2 = localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar");
    boolean bool1 = false;
    if (!bool2) {
      zzbzt.zzg("useClientJar flag not found in activity intent extras.");
    } else {
      bool1 = localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    }
    return (zzbrv)localzzaa.zzd(paramActivity, bool1);
  }
  
  public final zzbvp zzq(Context paramContext, String paramString, zzbny paramzzbny)
  {
    return (zzbvp)new zzav(this, paramContext, paramString, paramzzbny).zzd(paramContext, false);
  }
  
  public final zzbyk zzr(Context paramContext, zzbny paramzzbny)
  {
    return (zzbyk)new zzae(this, paramContext, paramzzbny).zzd(paramContext, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */