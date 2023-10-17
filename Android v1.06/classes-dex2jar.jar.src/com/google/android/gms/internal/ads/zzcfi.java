package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class zzcfi
  extends WebViewClient
  implements zzcgo
{
  public static final int zzb = 0;
  private boolean zzA;
  private final HashSet zzB;
  private View.OnAttachStateChangeListener zzC;
  protected zzbwu zza;
  private final zzcfb zzc;
  private final zzawx zzd;
  private final HashMap zze = new HashMap();
  private final Object zzf = new Object();
  private zza zzg;
  private zzo zzh;
  private zzcgm zzi;
  private zzcgn zzj;
  private zzbhb zzk;
  private zzbhd zzl;
  private zzdcw zzm;
  private boolean zzn;
  private boolean zzo;
  private boolean zzp;
  private boolean zzq;
  private boolean zzr;
  private zzz zzs;
  private zzbqx zzt;
  private zzb zzu;
  private zzbqs zzv;
  private zzfgj zzw;
  private boolean zzx;
  private boolean zzy;
  private int zzz;
  
  public zzcfi(zzcfb paramzzcfb, zzawx paramzzawx, boolean paramBoolean)
  {
    this.zzd = paramzzawx;
    this.zzc = paramzzcfb;
    this.zzp = paramBoolean;
    this.zzt = localzzbqx;
    this.zzv = null;
    paramzzcfb = zzbbk.zzfp;
    this.zzB = new HashSet(Arrays.asList(((String)zzba.zzc().zzb(paramzzcfb)).split(",")));
  }
  
  private static WebResourceResponse zzN()
  {
    zzbbc localzzbbc = zzbbk.zzaG;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
    }
    return null;
  }
  
  private final WebResourceResponse zzO(String paramString, Map paramMap)
    throws IOException
  {
    paramString = new URL(paramString);
    try
    {
      TrafficStats.setThreadStatsTag(264);
      int i = 0;
      Object localObject2;
      for (;;)
      {
        i++;
        if (i > 20) {
          break label734;
        }
        localObject1 = paramString.openConnection();
        ((URLConnection)localObject1).setConnectTimeout(10000);
        ((URLConnection)localObject1).setReadTimeout(10000);
        localObject3 = paramMap.entrySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject3).next();
          ((URLConnection)localObject1).addRequestProperty((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
        }
        if (!(localObject1 instanceof HttpURLConnection)) {
          break label721;
        }
        localObject2 = (HttpURLConnection)localObject1;
        zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, (HttpURLConnection)localObject2, false, 60000);
        localObject1 = new com/google/android/gms/internal/ads/zzbzs;
        ((zzbzs)localObject1).<init>(null);
        ((zzbzs)localObject1).zzc((HttpURLConnection)localObject2, null);
        int j = ((HttpURLConnection)localObject2).getResponseCode();
        ((zzbzs)localObject1).zze((HttpURLConnection)localObject2, j);
        if ((j < 300) || (j >= 400)) {
          break label395;
        }
        localObject3 = ((HttpURLConnection)localObject2).getHeaderField("Location");
        if (localObject3 == null) {
          break;
        }
        bool = ((String)localObject3).startsWith("tel:");
        if (bool) {
          return null;
        }
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>(paramString, (String)localObject3);
        paramString = ((URL)localObject1).getProtocol();
        if (paramString == null)
        {
          zzbzt.zzj("Protocol is null");
          paramString = zzN();
          return paramString;
        }
        if ((!paramString.equals("http")) && (!paramString.equals("https")))
        {
          paramMap = new java/lang/StringBuilder;
          paramMap.<init>();
          paramMap.append("Unsupported scheme: ");
          paramMap.append(paramString);
          zzbzt.zzj(paramMap.toString());
          paramString = zzN();
          return paramString;
        }
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append("Redirecting to ");
        paramString.append((String)localObject3);
        zzbzt.zze(paramString.toString());
        ((HttpURLConnection)localObject2).disconnect();
        paramString = (String)localObject1;
      }
      paramString = new java/io/IOException;
      paramString.<init>("Missing Location header in redirect");
      throw paramString;
      label395:
      zzt.zzp();
      zzt.zzp();
      paramString = ((HttpURLConnection)localObject2).getContentType();
      boolean bool = TextUtils.isEmpty(paramString);
      Object localObject1 = "";
      if (bool) {
        paramString = "";
      } else {
        paramString = paramString.split(";")[0].trim();
      }
      zzt.zzp();
      paramMap = ((HttpURLConnection)localObject2).getContentType();
      if (TextUtils.isEmpty(paramMap)) {
        paramMap = (Map)localObject1;
      }
      for (;;)
      {
        break;
        localObject3 = paramMap.split(";");
        if (localObject3.length == 1) {
          paramMap = (Map)localObject1;
        } else {
          for (i = 1;; i++)
          {
            paramMap = (Map)localObject1;
            if (i >= localObject3.length) {
              break;
            }
            if (localObject3[i].trim().startsWith("charset"))
            {
              paramMap = localObject3[i].trim().split("=");
              if (paramMap.length > 1)
              {
                paramMap = paramMap[1].trim();
                break;
              }
            }
          }
        }
      }
      Object localObject3 = ((HttpURLConnection)localObject2).getHeaderFields();
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>(((Map)localObject3).size());
      localObject3 = ((Map)localObject3).entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject3).next();
        if ((localEntry.getKey() != null) && (localEntry.getValue() != null) && (!((List)localEntry.getValue()).isEmpty())) {
          ((Map)localObject1).put((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0));
        }
      }
      paramString = zzt.zzq().zzc(paramString, paramMap, ((HttpURLConnection)localObject2).getResponseCode(), ((HttpURLConnection)localObject2).getResponseMessage(), (Map)localObject1, ((HttpURLConnection)localObject2).getInputStream());
      return paramString;
      label721:
      paramString = new java/io/IOException;
      paramString.<init>("Invalid protocol.");
      throw paramString;
      label734:
      throw new IOException("Too many redirects (20)");
    }
    finally
    {
      TrafficStats.clearThreadStatsTag();
    }
  }
  
  private final void zzP(Map paramMap, List paramList, String paramString)
  {
    if (zze.zzc())
    {
      zze.zza("Received GMSG: ".concat(paramString));
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        String str2 = (String)paramMap.get(str1);
        paramString = new StringBuilder();
        paramString.append("  ");
        paramString.append(str1);
        paramString.append(": ");
        paramString.append(str2);
        zze.zza(paramString.toString());
      }
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((zzbii)paramList.next()).zza(this.zzc, paramMap);
    }
  }
  
  private final void zzQ()
  {
    View.OnAttachStateChangeListener localOnAttachStateChangeListener = this.zzC;
    if (localOnAttachStateChangeListener == null) {
      return;
    }
    ((View)this.zzc).removeOnAttachStateChangeListener(localOnAttachStateChangeListener);
  }
  
  private final void zzR(View paramView, zzbwu paramzzbwu, int paramInt)
  {
    if ((paramzzbwu.zzi()) && (paramInt > 0))
    {
      paramzzbwu.zzg(paramView);
      if (paramzzbwu.zzi()) {
        zzs.zza.postDelayed(new zzcfe(this, paramView, paramzzbwu, paramInt), 100L);
      }
    }
  }
  
  private static final boolean zzS(boolean paramBoolean, zzcfb paramzzcfb)
  {
    return (paramBoolean) && (!paramzzcfb.zzO().zzi()) && (!paramzzcfb.zzS().equals("interstitial_mb"));
  }
  
  public final void onAdClicked()
  {
    zza localzza = this.zzg;
    if (localzza != null) {
      localzza.onAdClicked();
    }
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    zze.zza("Loading resource: ".concat(String.valueOf(paramString)));
    paramWebView = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(paramWebView.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(paramWebView.getHost()))) {
      zzj(paramWebView);
    }
  }
  
  public final void onPageFinished(WebView arg1, String paramString)
  {
    synchronized (this.zzf)
    {
      if (this.zzc.zzaz())
      {
        zze.zza("Blank page loaded, 1...");
        this.zzc.zzU();
        return;
      }
      this.zzx = true;
      ??? = this.zzj;
      if (??? != null)
      {
        ???.zza();
        this.zzj = null;
      }
      zzg();
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.zzo = true;
  }
  
  public final boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail)
  {
    return this.zzc.zzay(paramRenderProcessGoneDetail.didCrash(), paramRenderProcessGoneDetail.rendererPriorityAtExit());
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    return zzc(paramString, Collections.emptyMap());
  }
  
  public final boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    if ((i != 79) && (i != 222)) {
      switch (i)
      {
      default: 
        switch (i)
        {
        default: 
          return false;
        }
        break;
      }
    }
    return true;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(paramString)));
    Object localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost())))
    {
      zzj((Uri)localObject1);
    }
    else
    {
      Object localObject2;
      if ((this.zzn) && (paramWebView == this.zzc.zzG()))
      {
        localObject2 = ((Uri)localObject1).getScheme();
        if (("http".equalsIgnoreCase((String)localObject2)) || ("https".equalsIgnoreCase((String)localObject2)))
        {
          localObject1 = this.zzg;
          if (localObject1 != null)
          {
            ((zza)localObject1).onAdClicked();
            localObject1 = this.zza;
            if (localObject1 != null) {
              ((zzbwu)localObject1).zzh(paramString);
            }
            this.zzg = null;
          }
          localObject1 = this.zzm;
          if (localObject1 != null)
          {
            ((zzdcw)localObject1).zzr();
            this.zzm = null;
          }
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
      }
      if (!this.zzc.zzG().willNotDraw())
      {
        try
        {
          localObject2 = this.zzc.zzI();
          paramWebView = (WebView)localObject1;
          if (localObject2 != null)
          {
            paramWebView = (WebView)localObject1;
            if (((zzaqq)localObject2).zzf((Uri)localObject1))
            {
              paramWebView = this.zzc.getContext();
              zzcfb localzzcfb = this.zzc;
              Activity localActivity = localzzcfb.zzi();
              paramWebView = ((zzaqq)localObject2).zza((Uri)localObject1, paramWebView, (View)localzzcfb, localActivity);
            }
          }
        }
        catch (zzaqr paramWebView)
        {
          zzbzt.zzj("Unable to append parameter to URL: ".concat(String.valueOf(paramString)));
          paramWebView = (WebView)localObject1;
        }
        localObject1 = this.zzu;
        if ((localObject1 != null) && (!((zzb)localObject1).zzc())) {
          this.zzu.zzb(paramString);
        } else {
          zzt(new zzc("android.intent.action.VIEW", paramWebView.toString(), null, null, null, null, null, null), true);
        }
      }
      else
      {
        zzbzt.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(paramString)));
      }
    }
    return true;
  }
  
  public final void zzA(zzcgm paramzzcgm)
  {
    this.zzi = paramzzcgm;
  }
  
  public final void zzB(int paramInt1, int paramInt2)
  {
    zzbqs localzzbqs = this.zzv;
    if (localzzbqs != null) {
      localzzbqs.zzd(paramInt1, paramInt2);
    }
  }
  
  public final void zzC(boolean paramBoolean)
  {
    this.zzn = false;
  }
  
  public final void zzD(boolean paramBoolean)
  {
    synchronized (this.zzf)
    {
      this.zzr = paramBoolean;
      return;
    }
  }
  
  public final void zzE()
  {
    synchronized (this.zzf)
    {
      this.zzn = false;
      this.zzp = true;
      zzfwc localzzfwc = zzcag.zze;
      zzcfd localzzcfd = new com/google/android/gms/internal/ads/zzcfd;
      localzzcfd.<init>(this);
      localzzfwc.execute(localzzcfd);
      return;
    }
  }
  
  public final void zzF(boolean paramBoolean)
  {
    synchronized (this.zzf)
    {
      this.zzq = true;
      return;
    }
  }
  
  public final void zzG(zzcgn paramzzcgn)
  {
    this.zzj = paramzzcgn;
  }
  
  public final void zzH(String paramString, zzbii paramzzbii)
  {
    synchronized (this.zzf)
    {
      paramString = (List)this.zze.get(paramString);
      if (paramString == null) {
        return;
      }
      paramString.remove(paramzzbii);
      return;
    }
  }
  
  public final void zzI(String paramString, Predicate paramPredicate)
  {
    synchronized (this.zzf)
    {
      List localList = (List)this.zze.get(paramString);
      if (localList == null) {
        return;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramString = localList.iterator();
      while (paramString.hasNext())
      {
        zzbii localzzbii = (zzbii)paramString.next();
        if (paramPredicate.apply(localzzbii)) {
          localArrayList.add(localzzbii);
        }
      }
      localList.removeAll(localArrayList);
      return;
    }
  }
  
  public final boolean zzJ()
  {
    synchronized (this.zzf)
    {
      boolean bool = this.zzr;
      return bool;
    }
  }
  
  public final boolean zzK()
  {
    synchronized (this.zzf)
    {
      boolean bool = this.zzp;
      return bool;
    }
  }
  
  public final boolean zzL()
  {
    synchronized (this.zzf)
    {
      boolean bool = this.zzq;
      return bool;
    }
  }
  
  public final void zzM(zza paramzza, zzbhb paramzzbhb, zzo paramzzo, zzbhd paramzzbhd, zzz paramzzz, boolean paramBoolean, zzbik paramzzbik, zzb paramzzb, zzbqz paramzzbqz, zzbwu paramzzbwu, zzebc paramzzebc, zzfgj paramzzfgj, zzdqc paramzzdqc, zzfen paramzzfen, zzbja paramzzbja, zzdcw paramzzdcw, zzbiz paramzzbiz, zzbit paramzzbit)
  {
    if (paramzzb == null) {
      paramzzb = new zzb(this.zzc.getContext(), paramzzbwu, null);
    }
    this.zzv = new zzbqs(this.zzc, paramzzbqz);
    this.zza = paramzzbwu;
    paramzzbwu = zzbbk.zzaO;
    if (((Boolean)zzba.zzc().zzb(paramzzbwu)).booleanValue()) {
      zzz("/adMetadata", new zzbha(paramzzbhb));
    }
    if (paramzzbhd != null) {
      zzz("/appEvent", new zzbhc(paramzzbhd));
    }
    zzz("/backButton", zzbih.zzj);
    zzz("/refresh", zzbih.zzk);
    zzz("/canOpenApp", zzbih.zzb);
    zzz("/canOpenURLs", zzbih.zza);
    zzz("/canOpenIntents", zzbih.zzc);
    zzz("/close", zzbih.zzd);
    zzz("/customClose", zzbih.zze);
    zzz("/instrument", zzbih.zzn);
    zzz("/delayPageLoaded", zzbih.zzp);
    zzz("/delayPageClosed", zzbih.zzq);
    zzz("/getLocationInfo", zzbih.zzr);
    zzz("/log", zzbih.zzg);
    zzz("/mraid", new zzbio(paramzzb, this.zzv, paramzzbqz));
    paramzzbqz = this.zzt;
    if (paramzzbqz != null) {
      zzz("/mraidLoaded", paramzzbqz);
    }
    zzz("/open", new zzbis(paramzzb, this.zzv, paramzzebc, paramzzdqc, paramzzfen));
    zzz("/precache", new zzcdo());
    zzz("/touch", zzbih.zzi);
    zzz("/video", zzbih.zzl);
    zzz("/videoMeta", zzbih.zzm);
    if ((paramzzebc != null) && (paramzzfgj != null))
    {
      zzz("/click", new zzfah(paramzzdcw, paramzzfgj, paramzzebc));
      zzz("/httpTrack", new zzfag(paramzzfgj, paramzzebc));
    }
    else
    {
      zzz("/click", new zzbhj(paramzzdcw));
      zzz("/httpTrack", zzbih.zzf);
    }
    if (zzt.zzn().zzu(this.zzc.getContext())) {
      zzz("/logScionEvent", new zzbin(this.zzc.getContext()));
    }
    if (paramzzbik != null) {
      zzz("/setInterstitialProperties", new zzbij(paramzzbik));
    }
    if (paramzzbja != null)
    {
      paramzzbik = zzbbk.zzir;
      if (((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue()) {
        zzz("/inspectorNetworkExtras", paramzzbja);
      }
    }
    paramzzbik = zzbbk.zziK;
    if ((((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue()) && (paramzzbiz != null)) {
      zzz("/shareSheet", paramzzbiz);
    }
    paramzzbik = zzbbk.zziN;
    if ((((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue()) && (paramzzbit != null)) {
      zzz("/inspectorOutOfContextTest", paramzzbit);
    }
    paramzzbik = zzbbk.zzjO;
    if (((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue())
    {
      zzz("/bindPlayStoreOverlay", zzbih.zzu);
      zzz("/presentPlayStoreOverlay", zzbih.zzv);
      zzz("/expandPlayStoreOverlay", zzbih.zzw);
      zzz("/collapsePlayStoreOverlay", zzbih.zzx);
      zzz("/closePlayStoreOverlay", zzbih.zzy);
      paramzzbik = zzbbk.zzcR;
      if (((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue())
      {
        zzz("/setPAIDPersonalizationEnabled", zzbih.zzA);
        zzz("/resetPAID", zzbih.zzz);
      }
    }
    this.zzg = paramzza;
    this.zzh = paramzzo;
    this.zzk = paramzzbhb;
    this.zzl = paramzzbhd;
    this.zzs = paramzzz;
    this.zzu = paramzzb;
    this.zzm = paramzzdcw;
    this.zzn = paramBoolean;
    this.zzw = paramzzfgj;
  }
  
  public final ViewTreeObserver.OnGlobalLayoutListener zza()
  {
    synchronized (this.zzf)
    {
      return null;
    }
  }
  
  public final ViewTreeObserver.OnScrollChangedListener zzb()
  {
    synchronized (this.zzf)
    {
      return null;
    }
  }
  
  protected final WebResourceResponse zzc(String paramString, Map paramMap)
  {
    try
    {
      boolean bool = ((Boolean)zzbdf.zza.zze()).booleanValue();
      if ((bool) && (this.zzw != null) && ("oda".equals(Uri.parse(paramString).getScheme())))
      {
        this.zzw.zzc(paramString, null);
        paramString = new java/io/ByteArrayInputStream;
        paramString.<init>(new byte[0]);
        return new WebResourceResponse("", "", paramString);
      }
      Object localObject = zzbya.zzc(paramString, this.zzc.getContext(), this.zzA);
      if (!((String)localObject).equals(paramString)) {
        return zzO((String)localObject, paramMap);
      }
      localObject = zzawj.zza(Uri.parse(paramString));
      if (localObject != null)
      {
        localObject = zzt.zzc().zzb((zzawj)localObject);
        if ((localObject != null) && (((zzawg)localObject).zze())) {
          return new WebResourceResponse("", "", ((zzawg)localObject).zzc());
        }
      }
      if ((zzbzs.zzk()) && (((Boolean)zzbcz.zzb.zze()).booleanValue()))
      {
        paramString = zzO(paramString, paramMap);
        return paramString;
      }
      return null;
    }
    catch (NoClassDefFoundError paramString) {}catch (Exception paramString) {}
    zzt.zzo().zzu(paramString, "AdWebViewClient.interceptRequest");
    return zzN();
  }
  
  public final zzb zzd()
  {
    return this.zzu;
  }
  
  public final void zzg()
  {
    if ((this.zzi != null) && (((this.zzx) && (this.zzz <= 0)) || (this.zzy) || (this.zzo)))
    {
      Object localObject = zzbbk.zzbJ;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (this.zzc.zzm() != null)) {
        zzbbu.zza(this.zzc.zzm().zza(), this.zzc.zzk(), new String[] { "awfllc" });
      }
      localObject = this.zzi;
      boolean bool3 = this.zzy;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (!bool3)
      {
        bool1 = bool2;
        if (!this.zzo) {
          bool1 = true;
        }
      }
      ((zzcgm)localObject).zza(bool1);
      this.zzi = null;
    }
    this.zzc.zzac();
  }
  
  public final void zzh()
  {
    ??? = this.zza;
    if (??? != null)
    {
      ((zzbwu)???).zze();
      this.zza = null;
    }
    zzQ();
    synchronized (this.zzf)
    {
      this.zze.clear();
      this.zzg = null;
      this.zzh = null;
      this.zzi = null;
      this.zzj = null;
      this.zzk = null;
      this.zzl = null;
      this.zzn = false;
      this.zzp = false;
      this.zzq = false;
      this.zzs = null;
      this.zzu = null;
      this.zzt = null;
      zzbqs localzzbqs = this.zzv;
      if (localzzbqs != null)
      {
        localzzbqs.zza(true);
        this.zzv = null;
      }
      this.zzw = null;
      return;
    }
  }
  
  public final void zzi(boolean paramBoolean)
  {
    this.zzA = paramBoolean;
  }
  
  public final void zzj(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    List localList = (List)this.zze.get(str1);
    if ((str1 != null) && (localList != null))
    {
      String str2 = paramUri.getEncodedQuery();
      zzbbc localzzbbc = zzbbk.zzfo;
      if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (this.zzB.contains(str1)) && (str2 != null))
      {
        localzzbbc = zzbbk.zzfq;
        int i = ((Integer)zzba.zzc().zzb(localzzbbc)).intValue();
        if (str2.length() >= i)
        {
          zze.zza("Parsing gmsg query params on BG thread: ".concat(str1));
          zzfvr.zzq(zzt.zzp().zzb(paramUri), new zzcfg(this, localList, str1, paramUri), zzcag.zze);
          return;
        }
      }
      zzt.zzp();
      zzP(zzs.zzL(paramUri), localList, str1);
      return;
    }
    zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(paramUri))));
    paramUri = zzbbk.zzgx;
    if ((((Boolean)zzba.zzc().zzb(paramUri)).booleanValue()) && (zzt.zzo().zzf() != null))
    {
      if ((str1 != null) && (str1.length() >= 2)) {
        paramUri = str1.substring(1);
      } else {
        paramUri = "null";
      }
      zzcag.zza.execute(new zzcfc(paramUri));
    }
  }
  
  public final void zzk()
  {
    zzawx localzzawx = this.zzd;
    if (localzzawx != null) {
      localzzawx.zzc(10005);
    }
    this.zzy = true;
    zzg();
    this.zzc.destroy();
  }
  
  public final void zzl()
  {
    synchronized (this.zzf)
    {
      this.zzz += 1;
    }
    localObject1 = finally;
    throw ((Throwable)localObject1);
  }
  
  public final void zzm()
  {
    this.zzz -= 1;
    zzg();
  }
  
  public final void zzp(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = this.zzt;
    if (localObject != null) {
      ((zzbqx)localObject).zzb(paramInt1, paramInt2);
    }
    localObject = this.zzv;
    if (localObject != null) {
      ((zzbqs)localObject).zzc(paramInt1, paramInt2, false);
    }
  }
  
  public final void zzq()
  {
    zzbwu localzzbwu = this.zza;
    if (localzzbwu != null)
    {
      Object localObject = this.zzc.zzG();
      if (ViewCompat.isAttachedToWindow((View)localObject))
      {
        zzR((View)localObject, localzzbwu, 10);
        return;
      }
      zzQ();
      localObject = new zzcff(this, localzzbwu);
      this.zzC = ((View.OnAttachStateChangeListener)localObject);
      ((View)this.zzc).addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject);
    }
  }
  
  public final void zzr()
  {
    zzdcw localzzdcw = this.zzm;
    if (localzzdcw != null) {
      localzzdcw.zzr();
    }
  }
  
  public final void zzs()
  {
    zzdcw localzzdcw = this.zzm;
    if (localzzdcw != null) {
      localzzdcw.zzs();
    }
  }
  
  public final void zzt(zzc paramzzc, boolean paramBoolean)
  {
    boolean bool2 = this.zzc.zzaA();
    boolean bool1 = zzS(bool2, this.zzc);
    int j = 1;
    int i = j;
    if (!bool1) {
      if (!paramBoolean) {
        i = j;
      } else {
        i = 0;
      }
    }
    zza localzza;
    if (bool1) {
      localzza = null;
    } else {
      localzza = this.zzg;
    }
    zzo localzzo;
    if (bool2) {
      localzzo = null;
    } else {
      localzzo = this.zzh;
    }
    zzz localzzz = this.zzs;
    zzbzz localzzbzz = this.zzc.zzn();
    zzcfb localzzcfb = this.zzc;
    zzdcw localzzdcw;
    if (i != 0) {
      localzzdcw = null;
    } else {
      localzzdcw = this.zzm;
    }
    zzw(new AdOverlayInfoParcel(paramzzc, localzza, localzzo, localzzz, localzzbzz, localzzcfb, localzzdcw));
  }
  
  public final void zzu(zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2, int paramInt)
  {
    zzcfb localzzcfb = this.zzc;
    zzw(new AdOverlayInfoParcel(localzzcfb, localzzcfb.zzn(), paramzzbr, paramzzebc, paramzzdqc, paramzzfen, paramString1, paramString2, 14));
  }
  
  public final void zzv(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    boolean bool = zzS(this.zzc.zzaA(), this.zzc);
    int j = 1;
    int i = j;
    if (!bool) {
      if (!paramBoolean2) {
        i = j;
      } else {
        i = 0;
      }
    }
    zza localzza;
    if (bool) {
      localzza = null;
    } else {
      localzza = this.zzg;
    }
    zzo localzzo = this.zzh;
    zzz localzzz = this.zzs;
    zzcfb localzzcfb = this.zzc;
    zzbzz localzzbzz = localzzcfb.zzn();
    zzdcw localzzdcw;
    if (i != 0) {
      localzzdcw = null;
    } else {
      localzzdcw = this.zzm;
    }
    zzw(new AdOverlayInfoParcel(localzza, localzzo, localzzz, localzzcfb, paramBoolean1, paramInt, localzzbzz, localzzdcw));
  }
  
  public final void zzw(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Object localObject = this.zzv;
    boolean bool;
    if (localObject != null) {
      bool = ((zzbqs)localObject).zze();
    } else {
      bool = false;
    }
    zzt.zzi();
    zzm.zza(this.zzc.getContext(), paramAdOverlayInfoParcel, bool ^ true);
    zzbwu localzzbwu = this.zza;
    if (localzzbwu != null)
    {
      String str = paramAdOverlayInfoParcel.zzl;
      localObject = str;
      if (str == null)
      {
        paramAdOverlayInfoParcel = paramAdOverlayInfoParcel.zza;
        localObject = str;
        if (paramAdOverlayInfoParcel != null) {
          localObject = paramAdOverlayInfoParcel.zzb;
        }
      }
      localzzbwu.zzh((String)localObject);
    }
  }
  
  public final void zzx(boolean paramBoolean1, int paramInt, String paramString, boolean paramBoolean2)
  {
    boolean bool2 = this.zzc.zzaA();
    boolean bool1 = zzS(bool2, this.zzc);
    int j = 1;
    int i = j;
    if (!bool1) {
      if (!paramBoolean2) {
        i = j;
      } else {
        i = 0;
      }
    }
    zza localzza;
    if (bool1) {
      localzza = null;
    } else {
      localzza = this.zzg;
    }
    zzcfh localzzcfh;
    if (bool2) {
      localzzcfh = null;
    } else {
      localzzcfh = new zzcfh(this.zzc, this.zzh);
    }
    zzbhb localzzbhb = this.zzk;
    zzbhd localzzbhd = this.zzl;
    zzz localzzz = this.zzs;
    zzcfb localzzcfb = this.zzc;
    zzbzz localzzbzz = localzzcfb.zzn();
    zzdcw localzzdcw;
    if (i != 0) {
      localzzdcw = null;
    } else {
      localzzdcw = this.zzm;
    }
    zzw(new AdOverlayInfoParcel(localzza, localzzcfh, localzzbhb, localzzbhd, localzzz, localzzcfb, paramBoolean1, paramInt, paramString, localzzbzz, localzzdcw));
  }
  
  public final void zzy(boolean paramBoolean1, int paramInt, String paramString1, String paramString2, boolean paramBoolean2)
  {
    boolean bool1 = this.zzc.zzaA();
    boolean bool2 = zzS(bool1, this.zzc);
    int j = 1;
    int i = j;
    if (!bool2) {
      if (!paramBoolean2) {
        i = j;
      } else {
        i = 0;
      }
    }
    zza localzza;
    if (bool2) {
      localzza = null;
    } else {
      localzza = this.zzg;
    }
    zzcfh localzzcfh;
    if (bool1) {
      localzzcfh = null;
    } else {
      localzzcfh = new zzcfh(this.zzc, this.zzh);
    }
    zzbhb localzzbhb = this.zzk;
    zzbhd localzzbhd = this.zzl;
    zzz localzzz = this.zzs;
    zzcfb localzzcfb = this.zzc;
    zzbzz localzzbzz = localzzcfb.zzn();
    zzdcw localzzdcw;
    if (i != 0) {
      localzzdcw = null;
    } else {
      localzzdcw = this.zzm;
    }
    zzw(new AdOverlayInfoParcel(localzza, localzzcfh, localzzbhb, localzzbhd, localzzz, localzzcfb, paramBoolean1, paramInt, paramString1, paramString2, localzzbzz, localzzdcw));
  }
  
  public final void zzz(String paramString, zzbii paramzzbii)
  {
    synchronized (this.zzf)
    {
      List localList = (List)this.zze.get(paramString);
      Object localObject1 = localList;
      if (localList == null)
      {
        localObject1 = new java/util/concurrent/CopyOnWriteArrayList;
        ((CopyOnWriteArrayList)localObject1).<init>();
        this.zze.put(paramString, localObject1);
      }
      ((List)localObject1).add(paramzzbii);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */