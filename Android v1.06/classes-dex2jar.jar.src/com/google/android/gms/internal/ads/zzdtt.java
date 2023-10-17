package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

public final class zzdtt
  extends zzdi
{
  final Map zza = new HashMap();
  private final Context zzb;
  private final zzdth zzc;
  private final zzfwc zzd;
  private final zzdtu zze;
  private zzdsz zzf;
  
  zzdtt(Context paramContext, zzdth paramzzdth, zzdtu paramzzdtu, zzfwc paramzzfwc)
  {
    this.zzb = paramContext;
    this.zzc = paramzzdth;
    this.zzd = paramzzfwc;
    this.zze = paramzzdtu;
  }
  
  private static AdRequest zzj()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("request_origin", "inspector_ooct");
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, localBundle);
    return localBuilder.build();
  }
  
  private static String zzk(Object paramObject)
  {
    if ((paramObject instanceof LoadAdError))
    {
      paramObject = ((LoadAdError)paramObject).getResponseInfo();
    }
    else if ((paramObject instanceof AppOpenAd))
    {
      paramObject = ((AppOpenAd)paramObject).getResponseInfo();
    }
    else if ((paramObject instanceof InterstitialAd))
    {
      paramObject = ((InterstitialAd)paramObject).getResponseInfo();
    }
    else if ((paramObject instanceof RewardedAd))
    {
      paramObject = ((RewardedAd)paramObject).getResponseInfo();
    }
    else if ((paramObject instanceof RewardedInterstitialAd))
    {
      paramObject = ((RewardedInterstitialAd)paramObject).getResponseInfo();
    }
    else if ((paramObject instanceof AdView))
    {
      paramObject = ((AdView)paramObject).getResponseInfo();
    }
    else
    {
      if (!(paramObject instanceof NativeAd)) {
        break label151;
      }
      paramObject = ((NativeAd)paramObject).getResponseInfo();
    }
    if (paramObject == null) {
      return "";
    }
    paramObject = ((ResponseInfo)paramObject).zzc();
    if (paramObject == null) {
      return "";
    }
    try
    {
      paramObject = ((zzdn)paramObject).zzh();
      return (String)paramObject;
    }
    catch (RemoteException paramObject)
    {
      label151:
      for (;;) {}
    }
    return "";
  }
  
  /* Error */
  private final void zzl(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 114	com/google/android/gms/internal/ads/zzdtt:zzf	Lcom/google/android/gms/internal/ads/zzdsz;
    //   6: aload_1
    //   7: invokevirtual 119	com/google/android/gms/internal/ads/zzdsz:zzb	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;
    //   10: astore_3
    //   11: new 121	com/google/android/gms/internal/ads/zzdtr
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: aload_2
    //   18: invokespecial 124	com/google/android/gms/internal/ads/zzdtr:<init>	(Lcom/google/android/gms/internal/ads/zzdtt;Ljava/lang/String;)V
    //   21: aload_3
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 32	com/google/android/gms/internal/ads/zzdtt:zzd	Lcom/google/android/gms/internal/ads/zzfwc;
    //   27: invokestatic 130	com/google/android/gms/internal/ads/zzfvr:zzq	(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: goto +24 -> 58
    //   37: astore_1
    //   38: invokestatic 136	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   41: aload_1
    //   42: ldc -118
    //   44: invokevirtual 144	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield 30	com/google/android/gms/internal/ads/zzdtt:zzc	Lcom/google/android/gms/internal/ads/zzdth;
    //   51: aload_2
    //   52: invokevirtual 149	com/google/android/gms/internal/ads/zzdth:zzk	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	zzdtt
    //   0	62	1	paramString1	String
    //   0	62	2	paramString2	String
    //   10	12	3	localzzfwb	zzfwb
    // Exception table:
    //   from	to	target	type
    //   2	11	33	finally
    //   11	30	33	finally
    //   38	55	33	finally
    //   2	11	37	java/lang/NullPointerException
  }
  
  /* Error */
  private final void zzm(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 114	com/google/android/gms/internal/ads/zzdtt:zzf	Lcom/google/android/gms/internal/ads/zzdsz;
    //   6: aload_1
    //   7: invokevirtual 119	com/google/android/gms/internal/ads/zzdsz:zzb	(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;
    //   10: astore_3
    //   11: new 152	com/google/android/gms/internal/ads/zzdts
    //   14: astore_1
    //   15: aload_1
    //   16: aload_0
    //   17: aload_2
    //   18: invokespecial 153	com/google/android/gms/internal/ads/zzdts:<init>	(Lcom/google/android/gms/internal/ads/zzdtt;Ljava/lang/String;)V
    //   21: aload_3
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 32	com/google/android/gms/internal/ads/zzdtt:zzd	Lcom/google/android/gms/internal/ads/zzfwc;
    //   27: invokestatic 130	com/google/android/gms/internal/ads/zzfvr:zzq	(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: goto +24 -> 58
    //   37: astore_1
    //   38: invokestatic 136	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   41: aload_1
    //   42: ldc -101
    //   44: invokevirtual 144	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield 30	com/google/android/gms/internal/ads/zzdtt:zzc	Lcom/google/android/gms/internal/ads/zzdth;
    //   51: aload_2
    //   52: invokevirtual 149	com/google/android/gms/internal/ads/zzdth:zzk	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	zzdtt
    //   0	62	1	paramString1	String
    //   0	62	2	paramString2	String
    //   10	12	3	localzzfwb	zzfwb
    // Exception table:
    //   from	to	target	type
    //   2	11	33	finally
    //   11	30	33	finally
    //   38	55	33	finally
    //   2	11	37	java/lang/NullPointerException
  }
  
  public final void zze(String paramString, IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2)
  {
    paramIObjectWrapper1 = (Context)ObjectWrapper.unwrap(paramIObjectWrapper1);
    ViewGroup localViewGroup = (ViewGroup)ObjectWrapper.unwrap(paramIObjectWrapper2);
    if ((paramIObjectWrapper1 != null) && (localViewGroup != null))
    {
      paramIObjectWrapper2 = this.zza.get(paramString);
      if (paramIObjectWrapper2 != null) {
        this.zza.remove(paramString);
      }
      if ((paramIObjectWrapper2 instanceof AdView))
      {
        zzdtu.zza(paramIObjectWrapper1, localViewGroup, (AdView)paramIObjectWrapper2);
        return;
      }
      if ((paramIObjectWrapper2 instanceof NativeAd)) {
        zzdtu.zzb(paramIObjectWrapper1, localViewGroup, (NativeAd)paramIObjectWrapper2);
      }
    }
  }
  
  public final void zzf(zzdsz paramzzdsz)
  {
    this.zzf = paramzzdsz;
  }
  
  protected final void zzg(String paramString1, Object paramObject, String paramString2)
  {
    try
    {
      this.zza.put(paramString1, paramObject);
      zzl(zzk(paramObject), paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void zzh(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      switch (paramString2.hashCode())
      {
      default: 
        break;
      case 1951953708: 
        if (paramString2.equals("BANNER")) {
          i = 1;
        }
        break;
      case 1854800829: 
        if (paramString2.equals("REWARDED_INTERSTITIAL")) {
          i = 5;
        }
        break;
      case 543046670: 
        if (paramString2.equals("REWARDED")) {
          i = 4;
        }
        break;
      case -428325382: 
        if (paramString2.equals("APP_OPEN_AD")) {
          i = 0;
        }
        break;
      case -1372958932: 
        if (paramString2.equals("INTERSTITIAL")) {
          i = 2;
        }
        break;
      case -1999289321: 
        boolean bool = paramString2.equals("NATIVE");
        if (bool) {
          i = 3;
        }
        break;
      }
      int i = -1;
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
                if (i != 5) {
                  return;
                }
                localObject2 = this.zzb;
                paramString2 = zzj();
                localObject1 = new com/google/android/gms/internal/ads/zzdtp;
                ((zzdtp)localObject1).<init>(this, paramString1, paramString3);
                RewardedInterstitialAd.load((Context)localObject2, paramString1, paramString2, (RewardedInterstitialAdLoadCallback)localObject1);
                return;
              }
              localObject1 = this.zzb;
              localObject2 = zzj();
              paramString2 = new com/google/android/gms/internal/ads/zzdto;
              paramString2.<init>(this, paramString1, paramString3);
              RewardedAd.load((Context)localObject1, paramString1, (AdRequest)localObject2, paramString2);
              return;
            }
            paramString2 = new com/google/android/gms/ads/AdLoader$Builder;
            paramString2.<init>(this.zzb, paramString1);
            localObject1 = new com/google/android/gms/internal/ads/zzdtk;
            ((zzdtk)localObject1).<init>(this, paramString1, paramString3);
            paramString2.forNativeAd((NativeAd.OnNativeAdLoadedListener)localObject1);
            paramString1 = new com/google/android/gms/internal/ads/zzdtq;
            paramString1.<init>(this, paramString3);
            paramString2.withAdListener(paramString1);
            paramString2.build().loadAd(zzj());
            return;
          }
          localObject2 = this.zzb;
          localObject1 = zzj();
          paramString2 = new com/google/android/gms/internal/ads/zzdtn;
          paramString2.<init>(this, paramString1, paramString3);
          InterstitialAd.load((Context)localObject2, paramString1, (AdRequest)localObject1, paramString2);
          return;
        }
        localObject1 = new com/google/android/gms/ads/AdView;
        ((AdView)localObject1).<init>(this.zzb);
        ((BaseAdView)localObject1).setAdSize(AdSize.BANNER);
        ((BaseAdView)localObject1).setAdUnitId(paramString1);
        paramString2 = new com/google/android/gms/internal/ads/zzdtm;
        paramString2.<init>(this, paramString1, (AdView)localObject1, paramString3);
        ((BaseAdView)localObject1).setAdListener(paramString2);
        ((BaseAdView)localObject1).loadAd(zzj());
        return;
      }
      Object localObject2 = this.zzb;
      Object localObject1 = zzj();
      paramString2 = new com/google/android/gms/internal/ads/zzdtl;
      paramString2.<init>(this, paramString1, paramString3);
      AppOpenAd.load((Context)localObject2, paramString1, (AdRequest)localObject1, 1, paramString2);
      return;
    }
    finally {}
  }
  
  public final void zzi(String paramString1, String paramString2)
  {
    try
    {
      Activity localActivity = this.zzc.zzg();
      if (localActivity == null) {
        return;
      }
      Object localObject = this.zza.get(paramString1);
      if (localObject == null) {
        return;
      }
      zzbbc localzzbbc = zzbbk.zziO;
      if ((!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) || ((localObject instanceof AppOpenAd)) || ((localObject instanceof InterstitialAd)) || ((localObject instanceof RewardedAd)) || ((localObject instanceof RewardedInterstitialAd))) {
        this.zza.remove(paramString1);
      }
      zzm(zzk(localObject), paramString2);
      if ((localObject instanceof AppOpenAd))
      {
        ((AppOpenAd)localObject).show(localActivity);
        return;
      }
      if ((localObject instanceof InterstitialAd))
      {
        ((InterstitialAd)localObject).show(localActivity);
        return;
      }
      if ((localObject instanceof RewardedAd))
      {
        ((RewardedAd)localObject).show(localActivity, zzdti.zza);
        return;
      }
      if ((localObject instanceof RewardedInterstitialAd))
      {
        ((RewardedInterstitialAd)localObject).show(localActivity, zzdtj.zza);
        return;
      }
      paramString2 = zzbbk.zziO;
      if ((((Boolean)zzba.zzc().zzb(paramString2)).booleanValue()) && (((localObject instanceof AdView)) || ((localObject instanceof NativeAd))))
      {
        paramString2 = new android/content/Intent;
        paramString2.<init>();
        paramString2.setClassName(this.zzb, "com.google.android.gms.ads.OutOfContextTestingActivity");
        paramString2.putExtra("adUnit", paramString1);
        zzt.zzp();
        zzs.zzP(this.zzb, paramString2);
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdtt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */