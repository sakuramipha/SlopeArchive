package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdhy
  extends zzbet
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdiy
{
  public static final zzfrr zza = zzfrr.zzo("2011", "1009", "3010");
  private final String zzb;
  private Map zzc = new HashMap();
  private FrameLayout zzd;
  private FrameLayout zze;
  private final zzfwc zzf;
  private View zzg;
  private final int zzh;
  private zzdgx zzi;
  private zzatz zzj;
  private IObjectWrapper zzk = null;
  private zzben zzl;
  private boolean zzm;
  private boolean zzn = false;
  private GestureDetector zzo;
  
  public zzdhy(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2, int paramInt)
  {
    this.zzd = paramFrameLayout1;
    this.zze = paramFrameLayout2;
    this.zzh = 231700000;
    String str = paramFrameLayout1.getClass().getCanonicalName();
    boolean bool = "com.google.android.gms.ads.formats.NativeContentAdView".equals(str);
    paramFrameLayout2 = "3012";
    if (bool) {
      paramFrameLayout2 = "1007";
    } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(str)) {
      paramFrameLayout2 = "2009";
    } else {
      "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(str);
    }
    this.zzb = paramFrameLayout2;
    zzt.zzx();
    zzcat.zza(paramFrameLayout1, this);
    zzt.zzx();
    zzcat.zzb(paramFrameLayout1, this);
    this.zzf = zzcag.zze;
    this.zzj = new zzatz(this.zzd.getContext(), this.zzd);
    paramFrameLayout1.setOnTouchListener(this);
    paramFrameLayout1.setOnClickListener(this);
  }
  
  private final void zzt(String paramString)
  {
    try
    {
      FrameLayout localFrameLayout = new android/widget/FrameLayout;
      localFrameLayout.<init>(this.zze.getContext());
      Object localObject1 = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject1).<init>(-1, -1);
      localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      Object localObject2 = this.zze.getContext();
      localFrameLayout.setClickable(false);
      localFrameLayout.setFocusable(false);
      if (!TextUtils.isEmpty(paramString))
      {
        localObject1 = localObject2;
        if (((Context)localObject2).getApplicationContext() != null) {
          localObject1 = ((Context)localObject2).getApplicationContext();
        }
        localObject1 = ((Context)localObject1).getResources();
        if (localObject1 != null)
        {
          localObject1 = ((Resources)localObject1).getDisplayMetrics();
          if (localObject1 != null) {
            try
            {
              paramString = Base64.decode(paramString, 0);
              paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
              localObject2 = new android/graphics/drawable/BitmapDrawable;
              ((BitmapDrawable)localObject2).<init>(paramString);
              ((BitmapDrawable)localObject2).setTargetDensity(((DisplayMetrics)localObject1).densityDpi);
              ((BitmapDrawable)localObject2).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
              localFrameLayout.setBackground((Drawable)localObject2);
            }
            catch (IllegalArgumentException paramString)
            {
              zzbzt.zzk("Encountered invalid base64 watermark.", paramString);
            }
          }
        }
      }
      this.zze.addView(localFrameLayout);
      return;
    }
    finally {}
  }
  
  private final void zzu()
  {
    try
    {
      zzfwc localzzfwc = this.zzf;
      zzdhx localzzdhx = new com/google/android/gms/internal/ads/zzdhx;
      localzzdhx.<init>(this);
      localzzfwc.execute(localzzdhx);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final void zzv()
  {
    try
    {
      Object localObject1 = zzbbk.zzjP;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (this.zzi.zza() != 0))
      {
        localObject1 = new android/view/GestureDetector;
        Context localContext = this.zzd.getContext();
        zzdie localzzdie = new com/google/android/gms/internal/ads/zzdie;
        localzzdie.<init>(this.zzi, this);
        ((GestureDetector)localObject1).<init>(localContext, localzzdie);
        this.zzo = ((GestureDetector)localObject1);
        return;
      }
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public final void onClick(View paramView)
  {
    try
    {
      zzdgx localzzdgx = this.zzi;
      if ((localzzdgx != null) && (localzzdgx.zzT()))
      {
        this.zzi.zzs();
        this.zzi.zzC(paramView, this.zzd, zzl(), zzm(), false);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void onGlobalLayout()
  {
    try
    {
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx != null)
      {
        FrameLayout localFrameLayout = this.zzd;
        localzzdgx.zzA(localFrameLayout, zzl(), zzm(), zzdgx.zzW(localFrameLayout));
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void onScrollChanged()
  {
    try
    {
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx != null)
      {
        FrameLayout localFrameLayout = this.zzd;
        localzzdgx.zzA(localFrameLayout, zzl(), zzm(), zzdgx.zzW(localFrameLayout));
        return;
      }
      return;
    }
    finally {}
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    try
    {
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx == null) {
        return false;
      }
      localzzdgx.zzJ(paramView, paramMotionEvent, this.zzd);
      paramView = zzbbk.zzjP;
      if ((((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) && (this.zzo != null) && (this.zzi.zza() != 0)) {
        this.zzo.onTouchEvent(paramMotionEvent);
      }
      return false;
    }
    finally {}
  }
  
  public final IObjectWrapper zzb(String paramString)
  {
    try
    {
      paramString = ObjectWrapper.wrap(zzg(paramString));
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzbs(String paramString, IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      zzq(paramString, (View)ObjectWrapper.unwrap(paramIObjectWrapper), true);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzbt(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      this.zzi.zzL((View)ObjectWrapper.unwrap(paramIObjectWrapper));
      return;
    }
    finally
    {
      paramIObjectWrapper = finally;
      throw paramIObjectWrapper;
    }
  }
  
  public final void zzbu(zzben paramzzben)
  {
    try
    {
      boolean bool = this.zzn;
      if (bool) {
        return;
      }
      this.zzm = true;
      this.zzl = paramzzben;
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx != null)
      {
        localzzdgx.zzc().zzb(paramzzben);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzbv(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      boolean bool = this.zzn;
      if (bool) {
        return;
      }
      this.zzk = paramIObjectWrapper;
      return;
    }
    finally {}
  }
  
  public final void zzbw(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      boolean bool = this.zzn;
      if (bool) {
        return;
      }
      paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
      if (!(paramIObjectWrapper instanceof zzdgx))
      {
        zzbzt.zzj("Not an instance of native engine. This is most likely a transient error");
        return;
      }
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx != null) {
        localzzdgx.zzR(this);
      }
      zzu();
      paramIObjectWrapper = (zzdgx)paramIObjectWrapper;
      this.zzi = paramIObjectWrapper;
      paramIObjectWrapper.zzQ(this);
      this.zzi.zzI(this.zzd);
      this.zzi.zzr(this.zze);
      if (this.zzm) {
        this.zzi.zzc().zzb(this.zzl);
      }
      paramIObjectWrapper = zzbbk.zzdF;
      if ((((Boolean)zzba.zzc().zzb(paramIObjectWrapper)).booleanValue()) && (!TextUtils.isEmpty(this.zzi.zzg()))) {
        zzt(this.zzi.zzg());
      }
      zzv();
      return;
    }
    finally {}
  }
  
  public final void zzc()
  {
    try
    {
      boolean bool = this.zzn;
      if (bool) {
        return;
      }
      zzdgx localzzdgx = this.zzi;
      if (localzzdgx != null)
      {
        localzzdgx.zzR(this);
        this.zzi = null;
      }
      this.zzc.clear();
      this.zzd.removeAllViews();
      this.zze.removeAllViews();
      this.zzc = null;
      this.zzd = null;
      this.zze = null;
      this.zzg = null;
      this.zzj = null;
      this.zzn = true;
      return;
    }
    finally {}
  }
  
  public final void zzd(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (MotionEvent)ObjectWrapper.unwrap(paramIObjectWrapper);
    onTouch(this.zzd, paramIObjectWrapper);
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, int paramInt) {}
  
  public final View zzg(String paramString)
  {
    try
    {
      boolean bool = this.zzn;
      if (bool) {
        return null;
      }
      paramString = (WeakReference)this.zzc.get(paramString);
      if (paramString == null) {
        return null;
      }
      paramString = (View)paramString.get();
      return paramString;
    }
    finally {}
  }
  
  public final FrameLayout zzh()
  {
    return this.zze;
  }
  
  public final zzatz zzi()
  {
    return this.zzj;
  }
  
  public final IObjectWrapper zzj()
  {
    return this.zzk;
  }
  
  public final String zzk()
  {
    try
    {
      String str = this.zzb;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Map zzl()
  {
    try
    {
      Map localMap = this.zzc;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Map zzm()
  {
    try
    {
      Map localMap = this.zzc;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Map zzn()
  {
    return null;
  }
  
  public final JSONObject zzo()
  {
    try
    {
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        localObject1 = ((zzdgx)localObject1).zzi(this.zzd, zzl(), zzm());
        return (JSONObject)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final JSONObject zzp()
  {
    try
    {
      Object localObject1 = this.zzi;
      if (localObject1 != null)
      {
        localObject1 = ((zzdgx)localObject1).zzk(this.zzd, zzl(), zzm());
        return (JSONObject)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final void zzq(String paramString, View paramView, boolean paramBoolean)
  {
    try
    {
      paramBoolean = this.zzn;
      if (paramBoolean) {
        return;
      }
      if (paramView == null)
      {
        this.zzc.remove(paramString);
        return;
      }
      Map localMap = this.zzc;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramView);
      localMap.put(paramString, localWeakReference);
      if ((!"1098".equals(paramString)) && (!"3011".equals(paramString)))
      {
        if (zzbx.zzi(this.zzh)) {
          paramView.setOnTouchListener(this);
        }
        paramView.setClickable(true);
        paramView.setOnClickListener(this);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final FrameLayout zzr()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */