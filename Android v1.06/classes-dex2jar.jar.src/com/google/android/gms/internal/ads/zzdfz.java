package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdfz
  implements zzdhk
{
  private zzcs zzA;
  private final Context zza;
  private final zzdhn zzb;
  private final JSONObject zzc;
  private final zzdlz zzd;
  private final zzdhc zze;
  private final zzaqq zzf;
  private final zzcwa zzg;
  private final zzcvg zzh;
  private final zzdcu zzi;
  private final zzezf zzj;
  private final zzbzz zzk;
  private final zzfaa zzl;
  private final zzcnz zzm;
  private final zzdig zzn;
  private final Clock zzo;
  private final zzdcq zzp;
  private final zzfgj zzq;
  private final zzffq zzr;
  private boolean zzs = false;
  private boolean zzt;
  private boolean zzu = false;
  private boolean zzv = false;
  private Point zzw = new Point();
  private Point zzx = new Point();
  private long zzy = 0L;
  private long zzz = 0L;
  
  public zzdfz(Context paramContext, zzdhn paramzzdhn, JSONObject paramJSONObject, zzdlz paramzzdlz, zzdhc paramzzdhc, zzaqq paramzzaqq, zzcwa paramzzcwa, zzcvg paramzzcvg, zzdcu paramzzdcu, zzezf paramzzezf, zzbzz paramzzbzz, zzfaa paramzzfaa, zzcnz paramzzcnz, zzdig paramzzdig, Clock paramClock, zzdcq paramzzdcq, zzfgj paramzzfgj, zzffq paramzzffq)
  {
    this.zza = paramContext;
    this.zzb = paramzzdhn;
    this.zzc = paramJSONObject;
    this.zzd = paramzzdlz;
    this.zze = paramzzdhc;
    this.zzf = paramzzaqq;
    this.zzg = paramzzcwa;
    this.zzh = paramzzcvg;
    this.zzi = paramzzdcu;
    this.zzj = paramzzezf;
    this.zzk = paramzzbzz;
    this.zzl = paramzzfaa;
    this.zzm = paramzzcnz;
    this.zzn = paramzzdig;
    this.zzo = paramClock;
    this.zzp = paramzzdcq;
    this.zzq = paramzzfgj;
    this.zzr = paramzzffq;
  }
  
  private final String zzD(View paramView, Map paramMap)
  {
    if ((paramMap != null) && (paramView != null))
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (paramView.equals((View)((WeakReference)localEntry.getValue()).get())) {
          return (String)localEntry.getKey();
        }
      }
    }
    int i = this.zze.zzc();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 6) {
          return null;
        }
        return "3099";
      }
      return "2099";
    }
    return "1099";
  }
  
  private final boolean zzE(String paramString)
  {
    JSONObject localJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
    return (localJSONObject != null) && (localJSONObject.optBoolean(paramString, false));
  }
  
  private final boolean zzF()
  {
    return this.zzc.optBoolean("allow_custom_click_gesture", false);
  }
  
  private final boolean zzG(JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, boolean paramBoolean)
  {
    Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.zzc);
      localJSONObject.put("asset_view_signal", paramJSONObject2);
      localJSONObject.put("ad_view_signal", paramJSONObject1);
      localJSONObject.put("scroll_view_signal", paramJSONObject3);
      localJSONObject.put("lock_screen_signal", paramJSONObject4);
      localJSONObject.put("provided_signals", paramJSONObject5);
      paramJSONObject1 = zzbbk.zzdg;
      if (((Boolean)zzba.zzc().zzb(paramJSONObject1)).booleanValue()) {
        localJSONObject.put("view_signals", paramString);
      }
      localJSONObject.put("policy_validator_enabled", paramBoolean);
      paramJSONObject3 = this.zza;
      paramJSONObject1 = new org/json/JSONObject;
      paramJSONObject1.<init>();
      zzt.zzp();
      paramJSONObject2 = zzs.zzq((WindowManager)paramJSONObject3.getSystemService("window"));
      try
      {
        int i = paramJSONObject2.widthPixels;
        paramJSONObject1.put("width", zzay.zzb().zzb(paramJSONObject3, i));
        i = paramJSONObject2.heightPixels;
        paramJSONObject1.put("height", zzay.zzb().zzb(paramJSONObject3, i));
      }
      catch (JSONException paramJSONObject1)
      {
        paramJSONObject1 = null;
      }
      localJSONObject.put("screen", paramJSONObject1);
      paramJSONObject1 = zzbbk.zzhX;
      if (((Boolean)zzba.zzc().zzb(paramJSONObject1)).booleanValue())
      {
        paramJSONObject1 = this.zzd;
        paramJSONObject2 = new com/google/android/gms/internal/ads/zzdfw;
        paramJSONObject2.<init>(this, null);
        paramJSONObject1.zzi("/clickRecorded", paramJSONObject2);
      }
      else
      {
        paramJSONObject2 = this.zzd;
        paramJSONObject1 = new com/google/android/gms/internal/ads/zzdfu;
        paramJSONObject1.<init>(this, null);
        paramJSONObject2.zzi("/logScionEvent", paramJSONObject1);
      }
      paramJSONObject1 = this.zzd;
      paramJSONObject2 = new com/google/android/gms/internal/ads/zzdfy;
      paramJSONObject2.<init>(this, null);
      paramJSONObject1.zzi("/nativeImpression", paramJSONObject2);
      zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", localJSONObject), "Error during performing handleImpression");
      if (!this.zzs) {
        this.zzs = zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
      }
      return true;
    }
    catch (JSONException paramJSONObject1)
    {
      zzbzt.zzh("Unable to create impression JSON.", paramJSONObject1);
    }
    return false;
  }
  
  public final boolean zzA()
  {
    if (zza() != 0)
    {
      zzbbc localzzbbc = zzbbk.zzjP;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return this.zzl.zzi.zzj;
      }
    }
    return true;
  }
  
  public final boolean zzB()
  {
    return zzF();
  }
  
  public final boolean zzC(Bundle paramBundle)
  {
    if (!zzE("impression_reporting"))
    {
      zzbzt.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
      return false;
    }
    return zzG(null, null, null, null, null, zzay.zzb().zzj(paramBundle, null), false);
  }
  
  public final int zza()
  {
    if (this.zzl.zzi != null)
    {
      zzbbc localzzbbc = zzbbk.zzjP;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        return this.zzl.zzi.zzi;
      }
    }
    return 0;
  }
  
  public final JSONObject zze(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    paramMap1 = zzbx.zzd(this.zza, paramMap1, paramMap2, paramView, paramScaleType);
    paramScaleType = zzbx.zzg(this.zza, paramView);
    paramMap2 = zzbx.zzf(paramView);
    paramView = zzbx.zze(this.zza, paramView);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("asset_view_signal", paramMap1);
      localJSONObject.put("ad_view_signal", paramScaleType);
      localJSONObject.put("scroll_view_signal", paramMap2);
      localJSONObject.put("lock_screen_signal", paramView);
      return localJSONObject;
    }
    catch (JSONException paramView)
    {
      zzbzt.zzh("Unable to create native ad view signals JSON.", paramView);
    }
    return null;
  }
  
  public final JSONObject zzf(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    paramMap1 = zze(paramView, paramMap1, paramMap2, paramScaleType);
    paramView = new JSONObject();
    try
    {
      if ((this.zzv) && (zzF())) {
        paramView.put("custom_click_gesture_eligible", true);
      }
      if (paramMap1 != null) {
        paramView.put("nas", paramMap1);
      }
    }
    catch (JSONException paramMap1)
    {
      zzbzt.zzh("Unable to create native click meta data JSON.", paramMap1);
    }
    return paramView;
  }
  
  public final void zzg()
  {
    try
    {
      zzcs localzzcs = this.zzA;
      if (localzzcs != null) {
        localzzcs.zze();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void zzh()
  {
    if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
      return;
    }
    this.zzn.zzb();
  }
  
  public final void zzi()
  {
    this.zzd.zzf();
  }
  
  public final void zzj(zzcw paramzzcw)
  {
    try
    {
      if (this.zzu) {
        return;
      }
      if (paramzzcw == null)
      {
        zzdhc localzzdhc = this.zze;
        if (localzzdhc.zzk() != null)
        {
          this.zzu = true;
          this.zzq.zzc(localzzdhc.zzk().zzf(), this.zzr);
          zzg();
          return;
        }
      }
      this.zzu = true;
      this.zzq.zzc(paramzzcw.zzf(), this.zzr);
      zzg();
      return;
    }
    catch (RemoteException paramzzcw)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramzzcw);
    }
  }
  
  public final void zzk(View paramView1, View paramView2, Map paramMap1, Map paramMap2, boolean paramBoolean, ImageView.ScaleType paramScaleType)
  {
    paramScaleType = zzbx.zzd(this.zza, paramMap1, paramMap2, paramView2, paramScaleType);
    JSONObject localJSONObject1 = zzbx.zzg(this.zza, paramView2);
    JSONObject localJSONObject2 = zzbx.zzf(paramView2);
    paramMap2 = zzbx.zze(this.zza, paramView2);
    String str = zzD(paramView1, paramMap1);
    paramMap1 = zzbx.zzc(str, this.zza, this.zzx, this.zzw);
    zzbbc localzzbbc = zzbbk.zzdn;
    if (true == ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      paramView1 = paramView2;
    }
    zzn(paramView1, localJSONObject1, paramScaleType, localJSONObject2, paramMap2, str, paramMap1, null, paramBoolean, false);
  }
  
  public final void zzl(String paramString)
  {
    zzn(null, null, null, null, null, paramString, null, null, false, false);
  }
  
  public final void zzm(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      zzbzt.zze("Click data is null. No click is reported.");
      return;
    }
    if (!zzE("click_reporting"))
    {
      zzbzt.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
      return;
    }
    Object localObject = paramBundle.getBundle("click_signal");
    if (localObject != null) {
      localObject = ((Bundle)localObject).getString("asset_id");
    } else {
      localObject = null;
    }
    zzn(null, null, null, null, null, (String)localObject, null, zzay.zzb().zzj(paramBundle, null), false, false);
  }
  
  protected final void zzn(View paramView, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, JSONObject paramJSONObject6, boolean paramBoolean1, boolean paramBoolean2)
  {
    Preconditions.checkMainThread("performClick must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.zzc);
      localJSONObject.put("asset_view_signal", paramJSONObject2);
      localJSONObject.put("ad_view_signal", paramJSONObject1);
      localJSONObject.put("click_signal", paramJSONObject5);
      localJSONObject.put("scroll_view_signal", paramJSONObject3);
      localJSONObject.put("lock_screen_signal", paramJSONObject4);
      paramJSONObject1 = this.zzb.zzc(this.zze.zzz());
      boolean bool2 = false;
      boolean bool1;
      if (paramJSONObject1 != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      localJSONObject.put("has_custom_click_handler", bool1);
      localJSONObject.put("provided_signals", paramJSONObject6);
      paramJSONObject3 = new org/json/JSONObject;
      paramJSONObject3.<init>();
      paramJSONObject3.put("asset_id", paramString);
      paramJSONObject3.put("template", this.zze.zzc());
      paramJSONObject3.put("view_aware_api_used", paramBoolean1);
      paramJSONObject1 = this.zzl.zzi;
      if ((paramJSONObject1 != null) && (paramJSONObject1.zzg)) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      paramJSONObject3.put("custom_mute_requested", paramBoolean1);
      if ((!this.zze.zzG().isEmpty()) && (this.zze.zzk() != null)) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      paramJSONObject3.put("custom_mute_enabled", paramBoolean1);
      if ((this.zzn.zza() != null) && (this.zzc.optBoolean("custom_one_point_five_click_enabled", false))) {
        paramJSONObject3.put("custom_one_point_five_click_eligible", true);
      }
      paramJSONObject3.put("timestamp", this.zzo.currentTimeMillis());
      if ((this.zzv) && (zzF())) {
        paramJSONObject3.put("custom_click_gesture_eligible", true);
      }
      if (paramBoolean2) {
        paramJSONObject3.put("is_custom_click_gesture", true);
      }
      paramBoolean1 = bool2;
      if (this.zzb.zzc(this.zze.zzz()) != null) {
        paramBoolean1 = true;
      }
      paramJSONObject3.put("has_custom_click_handler", paramBoolean1);
      try
      {
        paramJSONObject2 = this.zzc.optJSONObject("tracking_urls_and_actions");
        paramJSONObject1 = paramJSONObject2;
        if (paramJSONObject2 == null)
        {
          paramJSONObject1 = new org/json/JSONObject;
          paramJSONObject1.<init>();
        }
        paramJSONObject1 = paramJSONObject1.optString("click_string");
        paramView = this.zzf.zzc().zze(this.zza, paramJSONObject1, paramView);
      }
      catch (Exception paramView)
      {
        zzbzt.zzh("Exception obtaining click signals", paramView);
        paramView = null;
      }
      paramJSONObject3.put("click_signals", paramView);
      paramView = zzbbk.zzeo;
      if (((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) {
        paramJSONObject3.put("open_chrome_custom_tab", true);
      }
      paramView = zzbbk.zzib;
      if ((((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) && (PlatformVersion.isAtLeastR())) {
        paramJSONObject3.put("try_fallback_for_deep_link", true);
      }
      paramView = zzbbk.zzic;
      if ((((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) && (PlatformVersion.isAtLeastR())) {
        paramJSONObject3.put("in_app_link_handling_for_android_11_enabled", true);
      }
      localJSONObject.put("click", paramJSONObject3);
      paramView = new org/json/JSONObject;
      paramView.<init>();
      long l = this.zzo.currentTimeMillis();
      paramView.put("time_from_last_touch_down", l - this.zzy);
      paramView.put("time_from_last_touch", l - this.zzz);
      localJSONObject.put("touch_signal", paramView);
      zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", localJSONObject), "Error during performing handleClick");
      return;
    }
    catch (JSONException paramView)
    {
      zzbzt.zzh("Unable to create click JSON.", paramView);
    }
  }
  
  public final void zzo(View paramView1, View paramView2, Map paramMap1, Map paramMap2, boolean paramBoolean, ImageView.ScaleType paramScaleType, int paramInt)
  {
    Object localObject = this.zzc;
    int j = 0;
    int i = j;
    if (((JSONObject)localObject).optBoolean("allow_sdk_custom_click_gesture", false))
    {
      localObject = zzbbk.zzjP;
      i = j;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
        i = 1;
      }
    }
    if (i == 0)
    {
      if (!this.zzv)
      {
        zzbzt.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
        return;
      }
      if (!zzF())
      {
        zzbzt.zze("Custom click reporting failed. Ad unit id not in the allow list.");
        return;
      }
    }
    localObject = zzbx.zzd(this.zza, paramMap1, paramMap2, paramView2, paramScaleType);
    paramScaleType = zzbx.zzg(this.zza, paramView2);
    JSONObject localJSONObject1 = zzbx.zzf(paramView2);
    paramMap2 = zzbx.zze(this.zza, paramView2);
    String str = zzD(paramView1, paramMap1);
    JSONObject localJSONObject2 = zzbx.zzc(str, this.zza, this.zzx, this.zzw);
    if (i != 0) {
      try
      {
        JSONObject localJSONObject3 = this.zzc;
        Point localPoint = this.zzx;
        paramMap1 = this.zzw;
        try
        {
          paramView1 = new org/json/JSONObject;
          paramView1.<init>();
          try
          {
            JSONObject localJSONObject5 = new org/json/JSONObject;
            localJSONObject5.<init>();
            JSONObject localJSONObject4 = new org/json/JSONObject;
            localJSONObject4.<init>();
            if (localPoint != null)
            {
              localJSONObject5.put("x", localPoint.x);
              localJSONObject5.put("y", localPoint.y);
            }
            if (paramMap1 != null)
            {
              localJSONObject4.put("x", paramMap1.x);
              localJSONObject4.put("y", paramMap1.y);
            }
            paramView1.put("start_point", localJSONObject5);
            paramView1.put("end_point", localJSONObject4);
            paramView1.put("duration_ms", paramInt);
          }
          catch (Exception paramMap1) {}
          zzbzt.zzh("Error occurred while grabbing custom click gesture signals.", paramMap1);
        }
        catch (Exception paramMap1)
        {
          paramView1 = null;
        }
        localJSONObject3.put("custom_click_gesture_signal", paramView1);
      }
      catch (JSONException paramView1)
      {
        zzbzt.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", paramView1);
        zzt.zzo().zzu(paramView1, "FirstPartyNativeAdCore.performCustomClickGesture");
      }
    }
    zzn(paramView2, paramScaleType, (JSONObject)localObject, localJSONObject1, paramMap2, str, localJSONObject2, null, paramBoolean, true);
  }
  
  public final void zzp()
  {
    Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.zzc);
      zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", localJSONObject), "Error during performing handleDownloadedImpression");
      return;
    }
    catch (JSONException localJSONException)
    {
      zzbzt.zzh("", localJSONException);
    }
  }
  
  public final void zzq(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    JSONObject localJSONObject = zzbx.zzd(this.zza, paramMap1, paramMap2, paramView, paramScaleType);
    paramScaleType = zzbx.zzg(this.zza, paramView);
    paramMap2 = zzbx.zzf(paramView);
    paramMap1 = zzbx.zze(this.zza, paramView);
    zzbbc localzzbbc = zzbbk.zzdg;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {}
    for (;;)
    {
      paramView = null;
      break;
      try
      {
        paramView = this.zzf.zzc().zzh(this.zza, paramView, null);
      }
      catch (Exception paramView)
      {
        zzbzt.zzg("Exception getting data.");
      }
    }
    zzG(paramScaleType, localJSONObject, paramMap2, paramMap1, paramView, null, zzbx.zzh(this.zza, this.zzj));
  }
  
  public final void zzr()
  {
    zzG(null, null, null, null, null, null, false);
  }
  
  public final void zzs(View paramView1, MotionEvent paramMotionEvent, View paramView2)
  {
    this.zzw = zzbx.zza(paramMotionEvent, paramView2);
    long l = this.zzo.currentTimeMillis();
    this.zzz = l;
    if (paramMotionEvent.getAction() == 0)
    {
      this.zzy = l;
      this.zzx = this.zzw;
    }
    paramView1 = MotionEvent.obtain(paramMotionEvent);
    paramView1.setLocation(this.zzw.x, this.zzw.y);
    this.zzf.zzd(paramView1);
    paramView1.recycle();
  }
  
  public final void zzt(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      zzbzt.zze("Touch event data is null. No touch event is reported.");
      return;
    }
    if (!zzE("touch_reporting"))
    {
      zzbzt.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
      return;
    }
    int k = (int)paramBundle.getFloat("x");
    int i = (int)paramBundle.getFloat("y");
    int j = paramBundle.getInt("duration_ms");
    this.zzf.zzc().zzl(k, i, j);
  }
  
  public final void zzu(View paramView)
  {
    if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false))
    {
      zzbzt.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
      return;
    }
    zzdig localzzdig = this.zzn;
    if (paramView == null) {
      return;
    }
    paramView.setOnClickListener(localzzdig);
    paramView.setClickable(true);
    localzzdig.zzc = new WeakReference(paramView);
  }
  
  public final void zzv()
  {
    this.zzv = true;
  }
  
  public final void zzw(zzcs paramzzcs)
  {
    this.zzA = paramzzcs;
  }
  
  public final void zzx(zzbgk paramzzbgk)
  {
    if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false))
    {
      zzbzt.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
      return;
    }
    this.zzn.zzc(paramzzbgk);
  }
  
  public final void zzy(View paramView, Map paramMap1, Map paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    this.zzw = new Point();
    this.zzx = new Point();
    if (!this.zzt)
    {
      this.zzp.zza(paramView);
      this.zzt = true;
    }
    paramView.setOnTouchListener(paramOnTouchListener);
    paramView.setClickable(true);
    paramView.setOnClickListener(paramOnClickListener);
    this.zzm.zzi(this);
    boolean bool = zzbx.zzi(this.zzk.zzc);
    if (paramMap1 != null)
    {
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        paramView = (View)((WeakReference)((Map.Entry)paramMap1.next()).getValue()).get();
        if (paramView != null)
        {
          if (bool) {
            paramView.setOnTouchListener(paramOnTouchListener);
          }
          paramView.setClickable(true);
          paramView.setOnClickListener(paramOnClickListener);
        }
      }
    }
    if (paramMap2 != null)
    {
      paramMap1 = paramMap2.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        paramView = (View)((WeakReference)((Map.Entry)paramMap1.next()).getValue()).get();
        if (paramView != null)
        {
          if (bool) {
            paramView.setOnTouchListener(paramOnTouchListener);
          }
          paramView.setClickable(false);
        }
      }
    }
  }
  
  public final void zzz(View paramView, Map paramMap)
  {
    this.zzw = new Point();
    this.zzx = new Point();
    if (paramView != null) {
      this.zzp.zzb(paramView);
    }
    this.zzt = false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */