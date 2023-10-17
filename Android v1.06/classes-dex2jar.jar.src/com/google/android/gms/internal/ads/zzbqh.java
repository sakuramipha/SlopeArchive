package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbqh
  extends zzbpu
{
  private final RtbAdapter zza;
  private MediationInterstitialAd zzb;
  private MediationRewardedAd zzc;
  private MediationAppOpenAd zzd;
  private String zze = "";
  
  public zzbqh(RtbAdapter paramRtbAdapter)
  {
    this.zza = paramRtbAdapter;
  }
  
  private final Bundle zzv(zzl paramzzl)
  {
    paramzzl = paramzzl.zzm;
    if (paramzzl != null)
    {
      paramzzl = paramzzl.getBundle(this.zza.getClass().getName());
      if (paramzzl != null) {
        return paramzzl;
      }
    }
    return new Bundle();
  }
  
  private static final Bundle zzw(String paramString)
    throws RemoteException
  {
    zzbzt.zzj("Server parameters: ".concat(String.valueOf(paramString)));
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramString != null)
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        paramString = localJSONObject.keys();
        while (paramString.hasNext())
        {
          String str = (String)paramString.next();
          localBundle.putString(str, localJSONObject.getString(str));
        }
      }
      return localBundle;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzh("", paramString);
      throw new RemoteException();
    }
  }
  
  private static final boolean zzx(zzl paramzzl)
  {
    if (!paramzzl.zzf)
    {
      zzay.zzb();
      if (!zzbzm.zzr()) {
        return false;
      }
    }
    return true;
  }
  
  private static final String zzy(String paramString, zzl paramzzl)
  {
    paramzzl = paramzzl.zzu;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject.getString("max_ad_content_rating");
      return paramString;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString = paramzzl;
      }
    }
  }
  
  public final zzdq zze()
  {
    Object localObject = this.zza;
    if ((localObject instanceof zza)) {
      try
      {
        localObject = ((zza)localObject).getVideoController();
        return (zzdq)localObject;
      }
      finally
      {
        zzbzt.zzh("", localThrowable);
      }
    }
    return null;
  }
  
  public final zzbqj zzf()
    throws RemoteException
  {
    return zzbqj.zza(this.zza.getVersionInfo());
  }
  
  public final zzbqj zzg()
    throws RemoteException
  {
    return zzbqj.zza(this.zza.getSDKVersionInfo());
  }
  
  public final void zzh(IObjectWrapper paramIObjectWrapper, String paramString, Bundle paramBundle1, Bundle paramBundle2, zzq paramzzq, zzbpy paramzzbpy)
    throws RemoteException
  {
    try
    {
      zzbqf localzzbqf = new com/google/android/gms/internal/ads/zzbqf;
      localzzbqf.<init>(this, paramzzbpy);
      paramzzbpy = this.zza;
      MediationConfiguration localMediationConfiguration = new com/google/android/gms/ads/mediation/MediationConfiguration;
      int i = paramString.hashCode();
      switch (i)
      {
      default: 
        break;
      case 1911491517: 
        if (paramString.equals("rewarded_interstitial")) {
          i = 3;
        }
        break;
      case 1167692200: 
        if (paramString.equals("app_open")) {
          i = 5;
        }
        break;
      case 604727084: 
        if (paramString.equals("interstitial")) {
          i = 1;
        }
        break;
      case -239580146: 
        if (paramString.equals("rewarded")) {
          i = 2;
        }
        break;
      case -1052618729: 
        if (paramString.equals("native")) {
          i = 4;
        }
        break;
      case -1396342996: 
        if (paramString.equals("banner")) {
          i = 0;
        }
        break;
      }
      i = -1;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i == 5)
                {
                  paramString = AdFormat.APP_OPEN_AD;
                }
                else
                {
                  paramIObjectWrapper = new java/lang/IllegalArgumentException;
                  paramIObjectWrapper.<init>("Internal Error");
                  throw paramIObjectWrapper;
                }
              }
              else {
                paramString = AdFormat.NATIVE;
              }
            }
            else {
              paramString = AdFormat.REWARDED_INTERSTITIAL;
            }
          }
          else {
            paramString = AdFormat.REWARDED;
          }
        }
        else {
          paramString = AdFormat.INTERSTITIAL;
        }
      }
      else {
        paramString = AdFormat.BANNER;
      }
      localMediationConfiguration.<init>(paramString, paramBundle2);
      paramString = new java/util/ArrayList;
      paramString.<init>();
      paramString.add(localMediationConfiguration);
      paramBundle2 = new com/google/android/gms/ads/mediation/rtb/RtbSignalData;
      paramBundle2.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString, paramBundle1, zzb.zzc(paramzzq.zze, paramzzq.zzb, paramzzq.zza));
      paramzzbpy.collectSignals(paramBundle2, localzzbqf);
      return;
    }
    finally
    {
      zzbzt.zzh("Error generating signals for RTB", paramIObjectWrapper);
    }
  }
  
  public final void zzi(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpg paramzzbpg, zzboe paramzzboe)
    throws RemoteException
  {
    try
    {
      zzbqe localzzbqe = new com/google/android/gms/internal/ads/zzbqe;
      localzzbqe.<init>(this, paramzzbpg, paramzzboe);
      paramzzboe = this.zza;
      paramzzbpg = new com/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;
      paramzzbpg.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), this.zze);
      paramzzboe.loadRtbAppOpenAd(paramzzbpg, localzzbqe);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render app open ad.", paramString1);
    }
  }
  
  public final void zzj(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpj paramzzbpj, zzboe paramzzboe, zzq paramzzq)
    throws RemoteException
  {
    try
    {
      zzbqa localzzbqa = new com/google/android/gms/internal/ads/zzbqa;
      localzzbqa.<init>(this, paramzzbpj, paramzzboe);
      paramzzbpj = this.zza;
      paramzzboe = new com/google/android/gms/ads/mediation/MediationBannerAdConfiguration;
      paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), zzb.zzc(paramzzq.zze, paramzzq.zzb, paramzzq.zza), this.zze);
      paramzzbpj.loadRtbBannerAd(paramzzboe, localzzbqa);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render banner ad.", paramString1);
    }
  }
  
  public final void zzk(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpj paramzzbpj, zzboe paramzzboe, zzq paramzzq)
    throws RemoteException
  {
    try
    {
      zzbqb localzzbqb = new com/google/android/gms/internal/ads/zzbqb;
      localzzbqb.<init>(this, paramzzbpj, paramzzboe);
      paramzzboe = this.zza;
      paramzzbpj = new com/google/android/gms/ads/mediation/MediationBannerAdConfiguration;
      paramzzbpj.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), zzb.zzc(paramzzq.zze, paramzzq.zzb, paramzzq.zza), this.zze);
      paramzzboe.loadRtbInterscrollerAd(paramzzbpj, localzzbqb);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render interscroller ad.", paramString1);
    }
  }
  
  public final void zzl(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpm paramzzbpm, zzboe paramzzboe)
    throws RemoteException
  {
    try
    {
      zzbqc localzzbqc = new com/google/android/gms/internal/ads/zzbqc;
      localzzbqc.<init>(this, paramzzbpm, paramzzboe);
      paramzzbpm = this.zza;
      paramzzboe = new com/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;
      paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), this.zze);
      paramzzbpm.loadRtbInterstitialAd(paramzzboe, localzzbqc);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render interstitial ad.", paramString1);
    }
  }
  
  public final void zzm(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpp paramzzbpp, zzboe paramzzboe)
    throws RemoteException
  {
    zzn(paramString1, paramString2, paramzzl, paramIObjectWrapper, paramzzbpp, paramzzboe, null);
  }
  
  public final void zzn(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbpp paramzzbpp, zzboe paramzzboe, zzbee paramzzbee)
    throws RemoteException
  {
    try
    {
      zzbqd localzzbqd = new com/google/android/gms/internal/ads/zzbqd;
      localzzbqd.<init>(this, paramzzbpp, paramzzboe);
      paramzzboe = this.zza;
      paramzzbpp = new com/google/android/gms/ads/mediation/MediationNativeAdConfiguration;
      paramzzbpp.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), this.zze, paramzzbee);
      paramzzboe.loadRtbNativeAd(paramzzbpp, localzzbqd);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render native ad.", paramString1);
    }
  }
  
  public final void zzo(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbps paramzzbps, zzboe paramzzboe)
    throws RemoteException
  {
    try
    {
      zzbqg localzzbqg = new com/google/android/gms/internal/ads/zzbqg;
      localzzbqg.<init>(this, paramzzbps, paramzzboe);
      paramzzboe = this.zza;
      paramzzbps = new com/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;
      paramzzbps.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), this.zze);
      paramzzboe.loadRtbRewardedInterstitialAd(paramzzbps, localzzbqg);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render rewarded interstitial ad.", paramString1);
    }
  }
  
  public final void zzp(String paramString1, String paramString2, zzl paramzzl, IObjectWrapper paramIObjectWrapper, zzbps paramzzbps, zzboe paramzzboe)
    throws RemoteException
  {
    try
    {
      zzbqg localzzbqg = new com/google/android/gms/internal/ads/zzbqg;
      localzzbqg.<init>(this, paramzzbps, paramzzboe);
      paramzzbps = this.zza;
      paramzzboe = new com/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;
      paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramString1, zzw(paramString2), zzv(paramzzl), zzx(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzy(paramString2, paramzzl), this.zze);
      paramzzbps.loadRtbRewardedAd(paramzzboe, localzzbqg);
      return;
    }
    finally
    {
      zzbzt.zzh("Adapter failed to render rewarded ad.", paramString1);
    }
  }
  
  public final void zzq(String paramString)
  {
    this.zze = paramString;
  }
  
  /* Error */
  public final boolean zzr(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	com/google/android/gms/internal/ads/zzbqh:zzd	Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +28 -> 34
    //   9: aload_2
    //   10: aload_1
    //   11: invokestatic 234	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   14: checkcast 236	android/content/Context
    //   17: invokeinterface 386 2 0
    //   22: goto +10 -> 32
    //   25: astore_1
    //   26: ldc 21
    //   28: aload_1
    //   29: invokestatic 115	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   32: iconst_1
    //   33: ireturn
    //   34: iconst_0
    //   35: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zzbqh
    //   0	36	1	paramIObjectWrapper	IObjectWrapper
    //   4	6	2	localMediationAppOpenAd	MediationAppOpenAd
    // Exception table:
    //   from	to	target	type
    //   9	22	25	finally
  }
  
  /* Error */
  public final boolean zzs(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 32	com/google/android/gms/internal/ads/zzbqh:zzb	Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +28 -> 34
    //   9: aload_2
    //   10: aload_1
    //   11: invokestatic 234	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   14: checkcast 236	android/content/Context
    //   17: invokeinterface 390 2 0
    //   22: goto +10 -> 32
    //   25: astore_1
    //   26: ldc 21
    //   28: aload_1
    //   29: invokestatic 115	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   32: iconst_1
    //   33: ireturn
    //   34: iconst_0
    //   35: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zzbqh
    //   0	36	1	paramIObjectWrapper	IObjectWrapper
    //   4	6	2	localMediationInterstitialAd	MediationInterstitialAd
    // Exception table:
    //   from	to	target	type
    //   9	22	25	finally
  }
  
  /* Error */
  public final boolean zzt(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/google/android/gms/internal/ads/zzbqh:zzc	Lcom/google/android/gms/ads/mediation/MediationRewardedAd;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +28 -> 34
    //   9: aload_2
    //   10: aload_1
    //   11: invokestatic 234	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   14: checkcast 236	android/content/Context
    //   17: invokeinterface 393 2 0
    //   22: goto +10 -> 32
    //   25: astore_1
    //   26: ldc 21
    //   28: aload_1
    //   29: invokestatic 115	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   32: iconst_1
    //   33: ireturn
    //   34: iconst_0
    //   35: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	zzbqh
    //   0	36	1	paramIObjectWrapper	IObjectWrapper
    //   4	6	2	localMediationRewardedAd	MediationRewardedAd
    // Exception table:
    //   from	to	target	type
    //   9	22	25	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */