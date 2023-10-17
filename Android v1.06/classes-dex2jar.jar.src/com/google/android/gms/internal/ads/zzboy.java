package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzboy
  extends zzboa
{
  private final Object zza;
  private zzbpa zzb;
  private zzbvh zzc;
  private IObjectWrapper zzd;
  private View zze;
  private MediationInterstitialAd zzf;
  private UnifiedNativeAdMapper zzg;
  private MediationRewardedAd zzh;
  private MediationInterscrollerAd zzi;
  private MediationAppOpenAd zzj;
  private final String zzk = "";
  
  public zzboy(Adapter paramAdapter)
  {
    this.zza = paramAdapter;
  }
  
  public zzboy(MediationAdapter paramMediationAdapter)
  {
    this.zza = paramMediationAdapter;
  }
  
  private final Bundle zzU(zzl paramzzl)
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
  
  private final Bundle zzV(String paramString1, zzl paramzzl, String paramString2)
    throws RemoteException
  {
    zzbzt.zze("Server parameters: ".concat(String.valueOf(paramString1)));
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramString1 != null)
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString1);
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        paramString1 = localJSONObject.keys();
        while (paramString1.hasNext())
        {
          String str = (String)paramString1.next();
          localBundle.putString(str, localJSONObject.getString(str));
        }
      }
      if ((this.zza instanceof AdMobAdapter))
      {
        localBundle.putString("adJson", paramString2);
        if (paramzzl != null) {
          localBundle.putInt("tagForChildDirectedTreatment", paramzzl.zzg);
        }
      }
      localBundle.remove("max_ad_content_rating");
      return localBundle;
    }
    finally
    {
      zzbzt.zzh("", paramString1);
    }
  }
  
  private static final boolean zzW(zzl paramzzl)
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
  
  private static final String zzX(String paramString, zzl paramzzl)
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
  
  public final void zzA(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Requesting rewarded ad from adapter.");
      try
      {
        Adapter localAdapter = (Adapter)this.zza;
        zzbow localzzbow = new com/google/android/gms/internal/ads/zzbow;
        localzzbow.<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString, paramzzl, null), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString, paramzzl), "");
        localAdapter.loadRewardedAd(paramzzboe, localzzbow);
        return;
      }
      catch (Exception paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
        throw new RemoteException();
      }
    }
    paramzzl = Adapter.class.getCanonicalName();
    paramString = this.zza.getClass().getCanonicalName();
    paramIObjectWrapper = new StringBuilder();
    paramIObjectWrapper.append(paramzzl);
    paramIObjectWrapper.append(" #009 Class mismatch: ");
    paramIObjectWrapper.append(paramString);
    zzbzt.zzj(paramIObjectWrapper.toString());
    throw new RemoteException();
  }
  
  public final void zzB(zzl paramzzl, String paramString1, String paramString2)
    throws RemoteException
  {
    paramString2 = this.zza;
    if ((paramString2 instanceof Adapter))
    {
      zzA(this.zzd, paramzzl, paramString1, new zzbpb((Adapter)paramString2, this.zzc));
      return;
    }
    paramzzl = Adapter.class.getCanonicalName();
    paramString2 = this.zza.getClass().getCanonicalName();
    paramString1 = new StringBuilder();
    paramString1.append(paramzzl);
    paramString1.append(" #009 Class mismatch: ");
    paramString1.append(paramString2);
    zzbzt.zzj(paramString1.toString());
    throw new RemoteException();
  }
  
  public final void zzC(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Requesting rewarded interstitial ad from adapter.");
      try
      {
        Adapter localAdapter = (Adapter)this.zza;
        zzbow localzzbow = new com/google/android/gms/internal/ads/zzbow;
        localzzbow.<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString, paramzzl, null), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString, paramzzl), "");
        localAdapter.loadRewardedInterstitialAd(paramzzboe, localzzbow);
        return;
      }
      catch (Exception paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
        throw new RemoteException();
      }
    }
    paramzzl = Adapter.class.getCanonicalName();
    paramString = this.zza.getClass().getCanonicalName();
    paramIObjectWrapper = new StringBuilder();
    paramIObjectWrapper.append(paramzzl);
    paramIObjectWrapper.append(" #009 Class mismatch: ");
    paramIObjectWrapper.append(paramString);
    zzbzt.zzj(paramIObjectWrapper.toString());
    throw new RemoteException();
  }
  
  public final void zzD(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Context localContext = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramIObjectWrapper = this.zza;
    if ((paramIObjectWrapper instanceof OnContextChangedListener)) {
      ((OnContextChangedListener)paramIObjectWrapper).onContextChanged(localContext);
    }
  }
  
  public final void zzE()
    throws RemoteException
  {
    Object localObject = this.zza;
    if (!(localObject instanceof MediationAdapter)) {
      return;
    }
    try
    {
      ((MediationAdapter)localObject).onPause();
      return;
    }
    finally
    {
      zzbzt.zzh("", localThrowable);
    }
  }
  
  public final void zzF()
    throws RemoteException
  {
    Object localObject = this.zza;
    if (!(localObject instanceof MediationAdapter)) {
      return;
    }
    try
    {
      ((MediationAdapter)localObject).onResume();
      return;
    }
    finally
    {
      zzbzt.zzh("", localThrowable);
    }
  }
  
  public final void zzG(boolean paramBoolean)
    throws RemoteException
  {
    Object localObject = this.zza;
    if ((localObject instanceof OnImmersiveModeUpdatedListener)) {
      try
      {
        ((OnImmersiveModeUpdatedListener)localObject).onImmersiveModeUpdated(paramBoolean);
        return;
      }
      finally
      {
        zzbzt.zzh("", localThrowable);
        return;
      }
    }
    String str2 = OnImmersiveModeUpdatedListener.class.getCanonicalName();
    String str1 = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append(str1);
    zzbzt.zze(localStringBuilder.toString());
  }
  
  public final void zzH(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Show app open ad from adapter.");
      localObject = this.zzj;
      if (localObject != null)
      {
        ((MediationAppOpenAd)localObject).showAd((Context)ObjectWrapper.unwrap(paramIObjectWrapper));
        return;
      }
      zzbzt.zzg("Can not show null mediation app open ad.");
      throw new RemoteException();
    }
    String str = Adapter.class.getCanonicalName();
    paramIObjectWrapper = this.zza.getClass().getCanonicalName();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(" #009 Class mismatch: ");
    ((StringBuilder)localObject).append(paramIObjectWrapper);
    zzbzt.zzj(((StringBuilder)localObject).toString());
    throw new RemoteException();
  }
  
  public final void zzI()
    throws RemoteException
  {
    if ((this.zza instanceof MediationInterstitialAdapter))
    {
      zzbzt.zze("Showing interstitial from adapter.");
      try
      {
        ((MediationInterstitialAdapter)this.zza).showInterstitial();
        return;
      }
      finally
      {
        zzbzt.zzh("", localThrowable);
      }
    }
    String str2 = MediationInterstitialAdapter.class.getCanonicalName();
    String str1 = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append(str1);
    zzbzt.zzj(localStringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void zzJ(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Object localObject = this.zza;
    if ((!(localObject instanceof Adapter)) && (!(localObject instanceof MediationInterstitialAdapter)))
    {
      String str1 = MediationInterstitialAdapter.class.getCanonicalName();
      localObject = Adapter.class.getCanonicalName();
      String str2 = this.zza.getClass().getCanonicalName();
      paramIObjectWrapper = new StringBuilder();
      paramIObjectWrapper.append(str1);
      paramIObjectWrapper.append(" or ");
      paramIObjectWrapper.append((String)localObject);
      paramIObjectWrapper.append(" #009 Class mismatch: ");
      paramIObjectWrapper.append(str2);
      zzbzt.zzj(paramIObjectWrapper.toString());
      throw new RemoteException();
    }
    if ((localObject instanceof MediationInterstitialAdapter))
    {
      zzI();
      return;
    }
    zzbzt.zze("Show interstitial ad from adapter.");
    localObject = this.zzf;
    if (localObject != null)
    {
      ((MediationInterstitialAd)localObject).showAd((Context)ObjectWrapper.unwrap(paramIObjectWrapper));
      return;
    }
    zzbzt.zzg("Can not show null mediation interstitial ad.");
    throw new RemoteException();
  }
  
  public final void zzK(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Show rewarded ad from adapter.");
      localObject = this.zzh;
      if (localObject != null)
      {
        ((MediationRewardedAd)localObject).showAd((Context)ObjectWrapper.unwrap(paramIObjectWrapper));
        return;
      }
      zzbzt.zzg("Can not show null mediation rewarded ad.");
      throw new RemoteException();
    }
    Object localObject = Adapter.class.getCanonicalName();
    paramIObjectWrapper = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append(paramIObjectWrapper);
    zzbzt.zzj(localStringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void zzL()
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      localObject = this.zzh;
      if (localObject != null)
      {
        ((MediationRewardedAd)localObject).showAd((Context)ObjectWrapper.unwrap(this.zzd));
        return;
      }
      zzbzt.zzg("Can not show null mediated rewarded ad.");
      throw new RemoteException();
    }
    String str = Adapter.class.getCanonicalName();
    Object localObject = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append((String)localObject);
    zzbzt.zzj(localStringBuilder.toString());
    throw new RemoteException();
  }
  
  public final boolean zzM()
  {
    return false;
  }
  
  public final boolean zzN()
    throws RemoteException
  {
    if ((this.zza instanceof Adapter)) {
      return this.zzc != null;
    }
    String str1 = Adapter.class.getCanonicalName();
    String str2 = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append(str2);
    zzbzt.zzj(localStringBuilder.toString());
    throw new RemoteException();
  }
  
  public final zzboj zzO()
  {
    return null;
  }
  
  public final zzbok zzP()
  {
    return null;
  }
  
  public final Bundle zze()
  {
    return new Bundle();
  }
  
  public final Bundle zzf()
  {
    return new Bundle();
  }
  
  public final Bundle zzg()
  {
    return new Bundle();
  }
  
  public final zzdq zzh()
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
  
  public final zzbfk zzi()
  {
    Object localObject = this.zzb;
    if (localObject != null)
    {
      localObject = ((zzbpa)localObject).zza();
      if ((localObject instanceof zzbfl)) {
        return ((zzbfl)localObject).zza();
      }
    }
    return null;
  }
  
  public final zzboh zzj()
  {
    MediationInterscrollerAd localMediationInterscrollerAd = this.zzi;
    if (localMediationInterscrollerAd != null) {
      return new zzboz(localMediationInterscrollerAd);
    }
    return null;
  }
  
  public final zzbon zzk()
  {
    Object localObject = this.zza;
    if ((localObject instanceof MediationNativeAdapter))
    {
      localObject = this.zzb;
      if (localObject != null)
      {
        localObject = ((zzbpa)localObject).zzb();
        if (localObject != null) {
          return new zzbpd((UnifiedNativeAdMapper)localObject);
        }
      }
    }
    else if ((localObject instanceof Adapter))
    {
      localObject = this.zzg;
      if (localObject != null) {
        return new zzbpd((UnifiedNativeAdMapper)localObject);
      }
    }
    return null;
  }
  
  public final zzbqj zzl()
  {
    Object localObject = this.zza;
    if (!(localObject instanceof Adapter)) {
      return null;
    }
    return zzbqj.zza(((Adapter)localObject).getVersionInfo());
  }
  
  public final zzbqj zzm()
  {
    Object localObject = this.zza;
    if (!(localObject instanceof Adapter)) {
      return null;
    }
    return zzbqj.zza(((Adapter)localObject).getSDKVersionInfo());
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    Object localObject = this.zza;
    if ((localObject instanceof MediationBannerAdapter)) {
      try
      {
        localObject = ObjectWrapper.wrap(((MediationBannerAdapter)localObject).getBannerView());
        return (IObjectWrapper)localObject;
      }
      finally
      {
        zzbzt.zzh("", localThrowable);
      }
    }
    if ((localThrowable instanceof Adapter)) {
      return ObjectWrapper.wrap(this.zze);
    }
    String str3 = MediationBannerAdapter.class.getCanonicalName();
    String str2 = Adapter.class.getCanonicalName();
    String str1 = this.zza.getClass().getCanonicalName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str3);
    localStringBuilder.append(" or ");
    localStringBuilder.append(str2);
    localStringBuilder.append(" #009 Class mismatch: ");
    localStringBuilder.append(str1);
    zzbzt.zzj(localStringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void zzo()
    throws RemoteException
  {
    Object localObject = this.zza;
    if (!(localObject instanceof MediationAdapter)) {
      return;
    }
    try
    {
      ((MediationAdapter)localObject).onDestroy();
      return;
    }
    finally
    {
      zzbzt.zzh("", localThrowable);
    }
  }
  
  public final void zzp(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, zzbvh paramzzbvh, String paramString2)
    throws RemoteException
  {
    paramzzl = this.zza;
    if ((paramzzl instanceof Adapter))
    {
      this.zzd = paramIObjectWrapper;
      this.zzc = paramzzbvh;
      paramzzbvh.zzl(ObjectWrapper.wrap(paramzzl));
      return;
    }
    paramzzl = Adapter.class.getCanonicalName();
    paramIObjectWrapper = this.zza.getClass().getCanonicalName();
    paramString1 = new StringBuilder();
    paramString1.append(paramzzl);
    paramString1.append(" #009 Class mismatch: ");
    paramString1.append(paramIObjectWrapper);
    zzbzt.zzj(paramString1.toString());
    throw new RemoteException();
  }
  
  public final void zzq(IObjectWrapper paramIObjectWrapper, zzbki paramzzbki, List paramList)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbos localzzbos = new zzbos(this, paramzzbki);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (zzbko)localIterator.next();
        paramzzbki = paramList.zza;
        switch (paramzzbki.hashCode())
        {
        default: 
          break;
        case 1911491517: 
          if (paramzzbki.equals("rewarded_interstitial")) {
            i = 3;
          }
          break;
        case 1167692200: 
          if (paramzzbki.equals("app_open")) {
            i = 5;
          }
          break;
        case 604727084: 
          if (paramzzbki.equals("interstitial")) {
            i = 1;
          }
          break;
        case -239580146: 
          if (paramzzbki.equals("rewarded")) {
            i = 2;
          }
          break;
        case -1052618729: 
          if (paramzzbki.equals("native")) {
            i = 4;
          }
          break;
        case -1396342996: 
          if (paramzzbki.equals("banner")) {
            i = 0;
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
                    paramzzbki = null;
                  } else {
                    paramzzbki = AdFormat.APP_OPEN_AD;
                  }
                }
                else {
                  paramzzbki = AdFormat.NATIVE;
                }
              }
              else {
                paramzzbki = AdFormat.REWARDED_INTERSTITIAL;
              }
            }
            else {
              paramzzbki = AdFormat.REWARDED;
            }
          }
          else {
            paramzzbki = AdFormat.INTERSTITIAL;
          }
        }
        else {
          paramzzbki = AdFormat.BANNER;
        }
        if (paramzzbki != null) {
          localArrayList.add(new MediationConfiguration(paramzzbki, paramList.zzb));
        }
      }
      ((Adapter)this.zza).initialize((Context)ObjectWrapper.unwrap(paramIObjectWrapper), localzzbos, localArrayList);
      return;
    }
    throw new RemoteException();
  }
  
  public final void zzr(IObjectWrapper paramIObjectWrapper, zzbvh paramzzbvh, List paramList)
    throws RemoteException
  {
    zzbzt.zzj("Could not initialize rewarded video adapter.");
    throw new RemoteException();
  }
  
  public final void zzs(zzl paramzzl, String paramString)
    throws RemoteException
  {
    zzB(paramzzl, paramString, null);
  }
  
  public final void zzt(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Requesting app open ad from adapter.");
      try
      {
        Adapter localAdapter = (Adapter)this.zza;
        zzbox localzzbox = new com/google/android/gms/internal/ads/zzbox;
        localzzbox.<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString, paramzzl, null), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString, paramzzl), "");
        localAdapter.loadAppOpenAd(paramzzboe, localzzbox);
        return;
      }
      catch (Exception paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
        throw new RemoteException();
      }
    }
    paramString = Adapter.class.getCanonicalName();
    paramIObjectWrapper = this.zza.getClass().getCanonicalName();
    paramzzl = new StringBuilder();
    paramzzl.append(paramString);
    paramzzl.append(" #009 Class mismatch: ");
    paramzzl.append(paramIObjectWrapper);
    zzbzt.zzj(paramzzl.toString());
    throw new RemoteException();
  }
  
  public final void zzu(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    zzv(paramIObjectWrapper, paramzzq, paramzzl, paramString, null, paramzzboe);
  }
  
  public final void zzv(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    Object localObject1 = this.zza;
    if ((!(localObject1 instanceof MediationBannerAdapter)) && (!(localObject1 instanceof Adapter)))
    {
      paramzzl = MediationBannerAdapter.class.getCanonicalName();
      paramString1 = Adapter.class.getCanonicalName();
      paramzzq = this.zza.getClass().getCanonicalName();
      paramIObjectWrapper = new StringBuilder();
      paramIObjectWrapper.append(paramzzl);
      paramIObjectWrapper.append(" or ");
      paramIObjectWrapper.append(paramString1);
      paramIObjectWrapper.append(" #009 Class mismatch: ");
      paramIObjectWrapper.append(paramzzq);
      zzbzt.zzj(paramIObjectWrapper.toString());
      throw new RemoteException();
    }
    zzbzt.zze("Requesting banner ad from adapter.");
    if (paramzzq.zzn) {
      paramzzq = zzb.zzd(paramzzq.zze, paramzzq.zzb);
    } else {
      paramzzq = zzb.zzc(paramzzq.zze, paramzzq.zzb, paramzzq.zza);
    }
    localObject1 = this.zza;
    Object localObject2;
    if ((localObject1 instanceof MediationBannerAdapter)) {
      try
      {
        MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)localObject1;
        localObject2 = paramzzl.zze;
        if (localObject2 != null)
        {
          localObject1 = new java/util/HashSet;
          ((HashSet)localObject1).<init>((Collection)localObject2);
        }
        else
        {
          localObject1 = null;
        }
        zzboq localzzboq = new com/google/android/gms/internal/ads/zzboq;
        long l = paramzzl.zzb;
        if (l == -1L) {
          localObject2 = null;
        } else {
          localObject2 = new Date(l);
        }
        localzzboq.<init>((Date)localObject2, paramzzl.zzd, (Set)localObject1, paramzzl.zzk, zzW(paramzzl), paramzzl.zzg, paramzzl.zzr, paramzzl.zzt, zzX(paramString1, paramzzl));
        localObject1 = paramzzl.zzm;
        if (localObject1 != null) {
          localObject1 = ((Bundle)localObject1).getBundle(localMediationBannerAdapter.getClass().getName());
        } else {
          localObject1 = null;
        }
        paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
        localObject2 = new com/google/android/gms/internal/ads/zzbpa;
        ((zzbpa)localObject2).<init>(paramzzboe);
        localMediationBannerAdapter.requestBannerAd(paramIObjectWrapper, (MediationBannerListener)localObject2, zzV(paramString1, paramzzl, paramString2), paramzzq, localzzboq, (Bundle)localObject1);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
    if ((localObject1 instanceof Adapter)) {
      try
      {
        localObject1 = (Adapter)localObject1;
        localObject2 = new com/google/android/gms/internal/ads/zzbot;
        ((zzbot)localObject2).<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationBannerAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString1, paramzzl, paramString2), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString1, paramzzl), paramzzq, this.zzk);
        ((Adapter)localObject1).loadBannerAd(paramzzboe, (MediationAdLoadCallback)localObject2);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
  }
  
  public final void zzw(IObjectWrapper paramIObjectWrapper, zzq paramzzq, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    if ((this.zza instanceof Adapter))
    {
      zzbzt.zze("Requesting interscroller ad from adapter.");
      try
      {
        Adapter localAdapter = (Adapter)this.zza;
        zzbor localzzbor = new com/google/android/gms/internal/ads/zzbor;
        localzzbor.<init>(this, paramzzboe, localAdapter);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationBannerAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString1, paramzzl, paramString2), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString1, paramzzl), zzb.zze(paramzzq.zze, paramzzq.zzb), "");
        localAdapter.loadInterscrollerAd(paramzzboe, localzzbor);
        return;
      }
      catch (Exception paramIObjectWrapper)
      {
        zzbzt.zzh("", paramIObjectWrapper);
        throw new RemoteException();
      }
    }
    paramzzq = Adapter.class.getCanonicalName();
    paramIObjectWrapper = this.zza.getClass().getCanonicalName();
    paramzzl = new StringBuilder();
    paramzzl.append(paramzzq);
    paramzzl.append(" #009 Class mismatch: ");
    paramzzl.append(paramIObjectWrapper);
    zzbzt.zzj(paramzzl.toString());
    throw new RemoteException();
  }
  
  public final void zzx(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString, zzboe paramzzboe)
    throws RemoteException
  {
    zzy(paramIObjectWrapper, paramzzl, paramString, null, paramzzboe);
  }
  
  public final void zzy(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe)
    throws RemoteException
  {
    Object localObject1 = this.zza;
    if ((!(localObject1 instanceof MediationInterstitialAdapter)) && (!(localObject1 instanceof Adapter)))
    {
      paramString1 = MediationInterstitialAdapter.class.getCanonicalName();
      paramIObjectWrapper = Adapter.class.getCanonicalName();
      paramzzl = this.zza.getClass().getCanonicalName();
      paramString2 = new StringBuilder();
      paramString2.append(paramString1);
      paramString2.append(" or ");
      paramString2.append(paramIObjectWrapper);
      paramString2.append(" #009 Class mismatch: ");
      paramString2.append(paramzzl);
      zzbzt.zzj(paramString2.toString());
      throw new RemoteException();
    }
    zzbzt.zze("Requesting interstitial ad from adapter.");
    localObject1 = this.zza;
    Object localObject2;
    if ((localObject1 instanceof MediationInterstitialAdapter)) {
      try
      {
        MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)localObject1;
        localObject2 = paramzzl.zze;
        if (localObject2 != null)
        {
          localObject1 = new java/util/HashSet;
          ((HashSet)localObject1).<init>((Collection)localObject2);
        }
        else
        {
          localObject1 = null;
        }
        zzboq localzzboq = new com/google/android/gms/internal/ads/zzboq;
        long l = paramzzl.zzb;
        if (l == -1L) {
          localObject2 = null;
        } else {
          localObject2 = new Date(l);
        }
        localzzboq.<init>((Date)localObject2, paramzzl.zzd, (Set)localObject1, paramzzl.zzk, zzW(paramzzl), paramzzl.zzg, paramzzl.zzr, paramzzl.zzt, zzX(paramString1, paramzzl));
        localObject1 = paramzzl.zzm;
        if (localObject1 != null) {
          localObject1 = ((Bundle)localObject1).getBundle(localMediationInterstitialAdapter.getClass().getName());
        } else {
          localObject1 = null;
        }
        paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
        localObject2 = new com/google/android/gms/internal/ads/zzbpa;
        ((zzbpa)localObject2).<init>(paramzzboe);
        localMediationInterstitialAdapter.requestInterstitialAd(paramIObjectWrapper, (MediationInterstitialListener)localObject2, zzV(paramString1, paramzzl, paramString2), localzzboq, (Bundle)localObject1);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
    if ((localObject1 instanceof Adapter)) {
      try
      {
        localObject2 = (Adapter)localObject1;
        localObject1 = new com/google/android/gms/internal/ads/zzbou;
        ((zzbou)localObject1).<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString1, paramzzl, paramString2), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString1, paramzzl), this.zzk);
        ((Adapter)localObject2).loadInterstitialAd(paramzzboe, (MediationAdLoadCallback)localObject1);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
  }
  
  public final void zzz(IObjectWrapper paramIObjectWrapper, zzl paramzzl, String paramString1, String paramString2, zzboe paramzzboe, zzbee paramzzbee, List paramList)
    throws RemoteException
  {
    Object localObject1 = this.zza;
    if ((!(localObject1 instanceof MediationNativeAdapter)) && (!(localObject1 instanceof Adapter)))
    {
      paramIObjectWrapper = MediationNativeAdapter.class.getCanonicalName();
      paramString1 = Adapter.class.getCanonicalName();
      paramzzl = this.zza.getClass().getCanonicalName();
      paramString2 = new StringBuilder();
      paramString2.append(paramIObjectWrapper);
      paramString2.append(" or ");
      paramString2.append(paramString1);
      paramString2.append(" #009 Class mismatch: ");
      paramString2.append(paramzzl);
      zzbzt.zzj(paramString2.toString());
      throw new RemoteException();
    }
    zzbzt.zze("Requesting native ad from adapter.");
    localObject1 = this.zza;
    if ((localObject1 instanceof MediationNativeAdapter)) {
      try
      {
        MediationNativeAdapter localMediationNativeAdapter = (MediationNativeAdapter)localObject1;
        Object localObject2 = paramzzl.zze;
        if (localObject2 != null)
        {
          localObject1 = new java/util/HashSet;
          ((HashSet)localObject1).<init>((Collection)localObject2);
        }
        else
        {
          localObject1 = null;
        }
        zzbpc localzzbpc = new com/google/android/gms/internal/ads/zzbpc;
        long l = paramzzl.zzb;
        if (l == -1L) {
          localObject2 = null;
        } else {
          localObject2 = new Date(l);
        }
        localzzbpc.<init>((Date)localObject2, paramzzl.zzd, (Set)localObject1, paramzzl.zzk, zzW(paramzzl), paramzzl.zzg, paramzzbee, paramList, paramzzl.zzr, paramzzl.zzt, zzX(paramString1, paramzzl));
        paramzzbee = paramzzl.zzm;
        if (paramzzbee != null) {
          paramzzbee = paramzzbee.getBundle(localMediationNativeAdapter.getClass().getName());
        } else {
          paramzzbee = null;
        }
        paramList = new com/google/android/gms/internal/ads/zzbpa;
        paramList.<init>(paramzzboe);
        this.zzb = paramList;
        localMediationNativeAdapter.requestNativeAd((Context)ObjectWrapper.unwrap(paramIObjectWrapper), this.zzb, zzV(paramString1, paramzzl, paramString2), localzzbpc, paramzzbee);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
    if ((localObject1 instanceof Adapter)) {
      try
      {
        paramList = (Adapter)localObject1;
        localObject1 = new com/google/android/gms/internal/ads/zzbov;
        ((zzbov)localObject1).<init>(this, paramzzboe);
        paramzzboe = new com/google/android/gms/ads/mediation/MediationNativeAdConfiguration;
        paramzzboe.<init>((Context)ObjectWrapper.unwrap(paramIObjectWrapper), "", zzV(paramString1, paramzzl, paramString2), zzU(paramzzl), zzW(paramzzl), paramzzl.zzk, paramzzl.zzg, paramzzl.zzt, zzX(paramString1, paramzzl), this.zzk, paramzzbee);
        paramList.loadNativeAd(paramzzboe, (MediationAdLoadCallback)localObject1);
        return;
      }
      finally
      {
        zzbzt.zzh("", paramIObjectWrapper);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */