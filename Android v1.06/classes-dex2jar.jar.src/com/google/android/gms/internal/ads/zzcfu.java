package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
final class zzcfu
  extends WebView
  implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfb
{
  public static final int zza = 0;
  private boolean zzA;
  private boolean zzB;
  private zzbed zzC;
  private zzbeb zzD;
  private zzavl zzE;
  private int zzF;
  private int zzG;
  private zzbbz zzH;
  private final zzbbz zzI;
  private zzbbz zzJ;
  private final zzbca zzK;
  private int zzL;
  private com.google.android.gms.ads.internal.overlay.zzl zzM;
  private boolean zzN;
  private final zzci zzO;
  private int zzP = -1;
  private int zzQ = -1;
  private int zzR = -1;
  private int zzS = -1;
  private Map zzT;
  private final WindowManager zzU;
  private final zzawx zzV;
  private final zzcgp zzb;
  private final zzaqq zzc;
  private final zzbcm zzd;
  private final zzbzz zze;
  private com.google.android.gms.ads.internal.zzl zzf;
  private final zza zzg;
  private final DisplayMetrics zzh;
  private final float zzi;
  private zzezf zzj;
  private zzezi zzk;
  private boolean zzl = false;
  private boolean zzm = false;
  private zzcfi zzn;
  private com.google.android.gms.ads.internal.overlay.zzl zzo;
  private zzfgo zzp;
  private zzcgq zzq;
  private final String zzr;
  private boolean zzs;
  private boolean zzt;
  private boolean zzu;
  private boolean zzv;
  private Boolean zzw;
  private boolean zzx = true;
  private final String zzy = "";
  private zzcfx zzz;
  
  protected zzcfu(zzcgp paramzzcgp, zzcgq paramzzcgq, String paramString, boolean paramBoolean1, boolean paramBoolean2, zzaqq paramzzaqq, zzbcm paramzzbcm, zzbzz paramzzbzz, zzbcc paramzzbcc, com.google.android.gms.ads.internal.zzl paramzzl, zza paramzza, zzawx paramzzawx, zzezf paramzzezf, zzezi paramzzezi)
  {
    super(paramzzcgp);
    this.zzb = paramzzcgp;
    this.zzq = paramzzcgq;
    this.zzr = paramString;
    this.zzu = paramBoolean1;
    this.zzc = paramzzaqq;
    this.zzd = paramzzbcm;
    this.zze = paramzzbzz;
    this.zzf = paramzzl;
    this.zzg = paramzza;
    paramzzcgq = (WindowManager)getContext().getSystemService("window");
    this.zzU = paramzzcgq;
    zzt.zzp();
    paramzzcgq = zzs.zzq(paramzzcgq);
    this.zzh = paramzzcgq;
    this.zzi = paramzzcgq.density;
    this.zzV = paramzzawx;
    this.zzj = paramzzezf;
    this.zzk = paramzzezi;
    this.zzO = new zzci(paramzzcgp.zza(), this, this, null);
    setBackgroundColor(0);
    paramzzcgq = getSettings();
    paramzzcgq.setAllowFileAccess(false);
    try
    {
      paramzzcgq.setJavaScriptEnabled(true);
    }
    catch (NullPointerException paramString)
    {
      zzbzt.zzh("Unable to enable Javascript.", paramString);
    }
    paramzzcgq.setSavePassword(false);
    paramzzcgq.setSupportMultipleWindows(true);
    paramzzcgq.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramString = zzbbk.zzjU;
      if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
        paramzzcgq.setMixedContentMode(1);
      } else {
        paramzzcgq.setMixedContentMode(2);
      }
    }
    paramzzcgq.setUserAgentString(zzt.zzp().zzc(paramzzcgp, paramzzbzz.zza));
    zzt.zzp();
    paramString = getContext();
    zzcb.zza(paramString, new zzm(paramzzcgq, paramString));
    paramzzcgq.setAllowFileAccessFromFileURLs(false);
    paramzzcgq.setAllowUniversalAccessFromFileURLs(false);
    paramzzcgq.setMediaPlaybackRequiresUserGesture(false);
    setDownloadListener(this);
    zzaS();
    addJavascriptInterface(new zzcgb(this, new zzcga(this)), "googleAdsJsInterface");
    removeJavascriptInterface("accessibility");
    removeJavascriptInterface("accessibilityTraversal");
    zzba();
    paramzzcgq = new zzbca(new zzbcc(true, "make_wv", this.zzr));
    this.zzK = paramzzcgq;
    paramzzcgq.zza().zzc(null);
    paramString = zzbbk.zzbJ;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
    {
      paramString = this.zzk;
      if ((paramString != null) && (paramString.zzb != null)) {
        paramzzcgq.zza().zzd("gqi", this.zzk.zzb);
      }
    }
    paramzzcgq.zza();
    paramString = zzbcc.zzf();
    this.zzI = paramString;
    paramzzcgq.zzb("native:view_create", paramString);
    this.zzJ = null;
    this.zzH = null;
    zzce.zza().zzb(paramzzcgp);
    zzt.zzo().zzr();
  }
  
  private final void zzaS()
  {
    try
    {
      zzezf localzzezf = this.zzj;
      if ((localzzezf != null) && (localzzezf.zzan))
      {
        zzbzt.zze("Disabling hardware acceleration on an overlay.");
        zzaU();
        return;
      }
      if ((!this.zzu) && (!this.zzq.zzi()))
      {
        zzbzt.zze("Enabling hardware acceleration on an AdView.");
        zzaW();
        return;
      }
      zzbzt.zze("Enabling hardware acceleration on an overlay.");
      zzaW();
      return;
    }
    finally {}
  }
  
  private final void zzaT()
  {
    try
    {
      if (!this.zzN)
      {
        this.zzN = true;
        zzt.zzo().zzq();
        return;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final void zzaU()
  {
    try
    {
      if (!this.zzv) {
        setLayerType(1, null);
      }
      this.zzv = true;
      return;
    }
    finally {}
  }
  
  private final void zzaV(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    String str;
    if (true != paramBoolean) {
      str = "0";
    } else {
      str = "1";
    }
    localHashMap.put("isVisible", str);
    zzd("onAdVisibilityChanged", localHashMap);
  }
  
  private final void zzaW()
  {
    try
    {
      if (this.zzv) {
        setLayerType(0, null);
      }
      this.zzv = false;
      return;
    }
    finally {}
  }
  
  private final void zzaX(String paramString)
  {
    try
    {
      super.loadUrl("about:blank");
      return;
    }
    finally
    {
      paramString = finally;
      try
      {
        zzt.zzo().zzu(paramString, "AdWebViewImpl.loadUrlUnsafe");
        zzbzt.zzk("Could not call loadUrl in destroy(). ", paramString);
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
  }
  
  private final void zzaY()
  {
    zzbbu.zza(this.zzK.zza(), this.zzI, new String[] { "aeh2" });
  }
  
  private final void zzaZ()
  {
    try
    {
      Object localObject1 = this.zzT;
      if (localObject1 != null)
      {
        localObject1 = ((Map)localObject1).values().iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((zzcdn)((Iterator)localObject1).next()).release();
        }
      }
      this.zzT = null;
      return;
    }
    finally {}
  }
  
  private final void zzba()
  {
    Object localObject = this.zzK;
    if (localObject == null) {
      return;
    }
    localObject = ((zzbca)localObject).zza();
    zzbbs localzzbbs = zzt.zzo().zzf();
    if (localzzbbs != null) {
      localzzbbs.zzf((zzbcc)localObject);
    }
  }
  
  private final void zzbb()
  {
    try
    {
      Boolean localBoolean = zzt.zzo().zzk();
      this.zzw = localBoolean;
      if (localBoolean == null) {
        try
        {
          evaluateJavascript("(function(){})()", null);
          zzaQ(Boolean.valueOf(true));
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          zzaQ(Boolean.valueOf(false));
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void destroy()
  {
    try
    {
      zzba();
      this.zzO.zza();
      Object localObject1 = this.zzo;
      if (localObject1 != null)
      {
        ((com.google.android.gms.ads.internal.overlay.zzl)localObject1).zzb();
        this.zzo.zzl();
        this.zzo = null;
      }
      this.zzp = null;
      this.zzn.zzh();
      this.zzE = null;
      this.zzf = null;
      setOnClickListener(null);
      setOnTouchListener(null);
      boolean bool = this.zzt;
      if (bool) {
        return;
      }
      zzt.zzy().zzd(this);
      zzaZ();
      this.zzt = true;
      localObject1 = zzbbk.zzjq;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        zze.zza("Initiating WebView self destruct sequence in 3...");
        zze.zza("Loading blank page in WebView, 2...");
        zzaX("about:blank");
        return;
      }
      zze.zza("Destroying the WebView immediately...");
      zzU();
      return;
    }
    finally {}
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback paramValueCallback)
  {
    try
    {
      if (zzaz())
      {
        zzbzt.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (paramValueCallback != null)
        {
          paramValueCallback.onReceiveValue(null);
          return;
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
    finally {}
  }
  
  /* Error */
  protected final void finalize()
    throws Throwable
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 550	com/google/android/gms/internal/ads/zzcfu:zzt	Z
    //   6: ifne +26 -> 32
    //   9: aload_0
    //   10: getfield 534	com/google/android/gms/internal/ads/zzcfu:zzn	Lcom/google/android/gms/internal/ads/zzcfi;
    //   13: invokevirtual 538	com/google/android/gms/internal/ads/zzcfi:zzh	()V
    //   16: invokestatic 553	com/google/android/gms/ads/internal/zzt:zzy	()Lcom/google/android/gms/internal/ads/zzcdg;
    //   19: aload_0
    //   20: invokevirtual 558	com/google/android/gms/internal/ads/zzcdg:zzd	(Lcom/google/android/gms/internal/ads/zzccc;)Z
    //   23: pop
    //   24: aload_0
    //   25: invokespecial 560	com/google/android/gms/internal/ads/zzcfu:zzaZ	()V
    //   28: aload_0
    //   29: invokespecial 596	com/google/android/gms/internal/ads/zzcfu:zzaT	()V
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_0
    //   35: invokespecial 600	java/lang/Object:finalize	()V
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    //   44: astore_1
    //   45: aload_0
    //   46: invokespecial 600	java/lang/Object:finalize	()V
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	zzcfu
    //   39	4	1	localObject1	Object
    //   44	6	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	32	39	finally
    //   32	34	39	finally
    //   40	42	39	finally
    //   0	2	44	finally
    //   42	44	44	finally
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (!zzaz())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      if (!zzaz())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public final void loadUrl(String paramString)
  {
    try
    {
      boolean bool = zzaz();
      if (!bool) {
        try
        {
          super.loadUrl(paramString);
          return;
        }
        finally
        {
          paramString = finally;
          zzt.zzo().zzu(paramString, "AdWebViewImpl.loadUrl");
          zzbzt.zzk("Could not call loadUrl. ", paramString);
          return;
        }
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public final void onAdClicked()
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.onAdClicked();
    }
  }
  
  protected final void onAttachedToWindow()
  {
    try
    {
      super.onAttachedToWindow();
      if (!zzaz()) {
        this.zzO.zzc();
      }
      boolean bool2 = this.zzA;
      zzcfi localzzcfi = this.zzn;
      boolean bool1 = bool2;
      if (localzzcfi != null)
      {
        bool1 = bool2;
        if (localzzcfi.zzL())
        {
          if (!this.zzB)
          {
            this.zzn.zza();
            this.zzn.zzb();
            this.zzB = true;
          }
          zzaR();
          bool1 = true;
        }
      }
      zzaV(bool1);
      return;
    }
    finally {}
  }
  
  protected final void onDetachedFromWindow()
  {
    try
    {
      if (!zzaz()) {
        this.zzO.zzd();
      }
      super.onDetachedFromWindow();
      if (this.zzB)
      {
        zzcfi localzzcfi = this.zzn;
        if ((localzzcfi != null) && (localzzcfi.zzL()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
        {
          this.zzn.zza();
          this.zzn.zzb();
          this.zzB = false;
        }
      }
      zzaV(false);
      return;
    }
    finally {}
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new android/content/Intent;
      paramString2.<init>("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      zzt.zzp();
      zzs.zzP(getContext(), paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      paramString2 = new StringBuilder();
      paramString2.append("Couldn't find an Activity to view url/mimetype: ");
      paramString2.append(paramString1);
      paramString2.append(" / ");
      paramString2.append(paramString4);
      zzbzt.zze(paramString2.toString());
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (zzaz()) {
      return;
    }
    if ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow())) {
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    float f2 = paramMotionEvent.getAxisValue(9);
    float f1 = paramMotionEvent.getAxisValue(10);
    if ((paramMotionEvent.getActionMasked() == 8) && (((f2 > 0.0F) && (!canScrollVertically(-1))) || ((f2 < 0.0F) && (!canScrollVertically(1))) || ((f1 > 0.0F) && (!canScrollHorizontally(-1))) || ((f1 < 0.0F) && (!canScrollHorizontally(1))))) {
      return false;
    }
    return super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public final void onGlobalLayout()
  {
    boolean bool = zzaR();
    com.google.android.gms.ads.internal.overlay.zzl localzzl = zzL();
    if ((localzzl != null) && (bool)) {
      localzzl.zzm();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      boolean bool = zzaz();
      int m = 0;
      if (bool)
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((!isInEditMode()) && (!this.zzu) && (!this.zzq.zzf()))
      {
        if (this.zzq.zzh())
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
        float f1;
        float f2;
        if (this.zzq.zzj())
        {
          localObject1 = zzbbk.zzdA;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          localObject1 = zzq();
          if (localObject1 != null) {
            f1 = ((zzcfx)localObject1).zze();
          } else {
            f1 = 0.0F;
          }
          if (f1 == 0.0F)
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          j = View.MeasureSpec.getSize(paramInt1);
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          f2 = paramInt2;
          k = (int)(j / f1);
          paramInt1 = paramInt2;
          if (paramInt2 == 0)
          {
            if (k != 0)
            {
              paramInt2 = (int)(k * f1);
              paramInt1 = j;
              i = k;
              j = paramInt2;
            }
            else
            {
              paramInt1 = 0;
            }
          }
          else
          {
            i = (int)(f2 * f1);
            if (j == 0)
            {
              paramInt2 = m;
              if (i != 0)
              {
                k = (int)(i / f1);
                j = paramInt1;
                paramInt2 = i;
                paramInt1 = paramInt2;
                i = j;
                j = paramInt2;
                break label263;
              }
            }
            else
            {
              paramInt2 = j;
            }
            j = i;
            i = paramInt1;
            paramInt1 = paramInt2;
          }
          label263:
          setMeasuredDimension(Math.min(j, paramInt1), Math.min(k, i));
          return;
        }
        if (this.zzq.zzg())
        {
          localObject1 = zzbbk.zzdG;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          localObject1 = new com/google/android/gms/internal/ads/zzcfs;
          ((zzcfs)localObject1).<init>(this);
          zzad("/contentHeight", (zzbii)localObject1);
          zzaO("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
          f1 = this.zzh.density;
          i = View.MeasureSpec.getSize(paramInt1);
          paramInt1 = this.zzG;
          if (paramInt1 != -1) {
            paramInt1 = (int)(paramInt1 * f1);
          } else {
            paramInt1 = View.MeasureSpec.getSize(paramInt2);
          }
          setMeasuredDimension(i, paramInt1);
          return;
        }
        if (this.zzq.zzi())
        {
          setMeasuredDimension(this.zzh.widthPixels, this.zzh.heightPixels);
          return;
        }
        int j = View.MeasureSpec.getMode(paramInt1);
        int k = View.MeasureSpec.getSize(paramInt1);
        paramInt1 = View.MeasureSpec.getMode(paramInt2);
        m = View.MeasureSpec.getSize(paramInt2);
        int i = Integer.MAX_VALUE;
        if ((j != Integer.MIN_VALUE) && (j != 1073741824)) {
          paramInt2 = Integer.MAX_VALUE;
        } else {
          paramInt2 = k;
        }
        if ((paramInt1 == Integer.MIN_VALUE) || (paramInt1 == 1073741824)) {
          i = m;
        }
        Object localObject1 = this.zzq;
        if ((((zzcgq)localObject1).zzb <= paramInt2) && (((zzcgq)localObject1).zza <= i)) {
          paramInt1 = 0;
        } else {
          paramInt1 = 1;
        }
        localObject1 = zzbbk.zzfe;
        j = paramInt1;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
        {
          localObject1 = this.zzq;
          f1 = ((zzcgq)localObject1).zzb;
          f2 = this.zzi;
          if ((f1 / f2 <= paramInt2 / f2) && (((zzcgq)localObject1).zza / f2 <= i / f2)) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          j = paramInt1 & paramInt2;
        }
        if (j != 0)
        {
          localObject1 = this.zzq;
          f2 = ((zzcgq)localObject1).zzb;
          f1 = this.zzi;
          float f4 = f2 / f1;
          f2 = ((zzcgq)localObject1).zza / f1;
          float f3 = k / f1;
          f1 = m / f1;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Not enough space to show ad. Needs ");
          ((StringBuilder)localObject1).append((int)f4);
          ((StringBuilder)localObject1).append("x");
          ((StringBuilder)localObject1).append((int)f2);
          ((StringBuilder)localObject1).append(" dp, but only has ");
          ((StringBuilder)localObject1).append((int)f3);
          ((StringBuilder)localObject1).append("x");
          ((StringBuilder)localObject1).append((int)f1);
          ((StringBuilder)localObject1).append(" dp.");
          zzbzt.zzj(((StringBuilder)localObject1).toString());
          if (getVisibility() != 8) {
            setVisibility(4);
          }
          setMeasuredDimension(0, 0);
          if (!this.zzl)
          {
            this.zzV.zzc(10001);
            this.zzl = true;
            return;
          }
          return;
        }
        if (getVisibility() != 8) {
          setVisibility(0);
        }
        if (!this.zzm)
        {
          this.zzV.zzc(10002);
          this.zzm = true;
        }
        localObject1 = this.zzq;
        setMeasuredDimension(((zzcgq)localObject1).zzb, ((zzcgq)localObject1).zza);
        return;
      }
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    finally {}
  }
  
  public final void onPause()
  {
    if (zzaz()) {
      return;
    }
    try
    {
      super.onPause();
      return;
    }
    catch (Exception localException)
    {
      zzbzt.zzh("Could not pause webview.", localException);
    }
  }
  
  public final void onResume()
  {
    if (zzaz()) {
      return;
    }
    try
    {
      super.onResume();
      return;
    }
    catch (Exception localException)
    {
      zzbzt.zzh("Could not resume webview.", localException);
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.zzn.zzL()) && (!this.zzn.zzJ())) {
      try
      {
        localObject = this.zzC;
        if (localObject != null) {
          ((zzbed)localObject).zzd(paramMotionEvent);
        }
      }
      finally {}
    }
    Object localObject = this.zzc;
    if (localObject != null) {
      ((zzaqq)localObject).zzd(paramMotionEvent);
    }
    localObject = this.zzd;
    if (localObject != null) {
      ((zzbcm)localObject).zzb(paramMotionEvent);
    }
    if (zzaz()) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof zzcfi)) {
      this.zzn = ((zzcfi)paramWebViewClient);
    }
  }
  
  public final void stopLoading()
  {
    if (zzaz()) {
      return;
    }
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      zzbzt.zzh("Could not stop loading webview.", localException);
    }
  }
  
  public final void zzA(int paramInt)
  {
    try
    {
      this.zzL = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzB(int paramInt) {}
  
  public final void zzC(zzcfx paramzzcfx)
  {
    try
    {
      if (this.zzz != null)
      {
        zzbzt.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        return;
      }
      this.zzz = paramzzcfx;
      return;
    }
    finally {}
  }
  
  public final zzezf zzD()
  {
    return this.zzj;
  }
  
  public final Context zzE()
  {
    return this.zzb.zzb();
  }
  
  public final View zzF()
  {
    return this;
  }
  
  public final WebView zzG()
  {
    return this;
  }
  
  public final WebViewClient zzH()
  {
    return this.zzn;
  }
  
  public final zzaqq zzI()
  {
    return this.zzc;
  }
  
  public final zzavl zzJ()
  {
    try
    {
      zzavl localzzavl = this.zzE;
      return localzzavl;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzbed zzK()
  {
    try
    {
      zzbed localzzbed = this.zzC;
      return localzzbed;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.google.android.gms.ads.internal.overlay.zzl zzL()
  {
    try
    {
      com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzo;
      return localzzl;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.google.android.gms.ads.internal.overlay.zzl zzM()
  {
    try
    {
      com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzM;
      return localzzl;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzcgq zzO()
  {
    try
    {
      zzcgq localzzcgq = this.zzq;
      return localzzcgq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzezi zzP()
  {
    return this.zzk;
  }
  
  public final zzfgo zzQ()
  {
    try
    {
      zzfgo localzzfgo = this.zzp;
      return localzzfgo;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzfwb zzR()
  {
    zzbcm localzzbcm = this.zzd;
    if (localzzbcm == null) {
      return zzfvr.zzh(null);
    }
    return localzzbcm.zza();
  }
  
  public final String zzS()
  {
    try
    {
      String str = this.zzr;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzT(zzezf paramzzezf, zzezi paramzzezi)
  {
    this.zzj = paramzzezf;
    this.zzk = paramzzezi;
  }
  
  public final void zzU()
  {
    try
    {
      zze.zza("Destroying WebView!");
      zzaT();
      zzflv localzzflv = zzs.zza;
      zzcft localzzcft = new com/google/android/gms/internal/ads/zzcft;
      localzzcft.<init>(this);
      localzzflv.post(localzzcft);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzV()
  {
    zzaY();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.zze.zza);
    zzd("onhide", localHashMap);
  }
  
  public final void zzW(int paramInt)
  {
    if (paramInt == 0) {
      zzbbu.zza(this.zzK.zza(), this.zzI, new String[] { "aebb2" });
    }
    zzaY();
    this.zzK.zza();
    this.zzK.zza().zzd("close_type", String.valueOf(paramInt));
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.zze.zza);
    zzd("onhide", localHashMap);
  }
  
  public final void zzX()
  {
    if (this.zzH == null)
    {
      zzbbu.zza(this.zzK.zza(), this.zzI, new String[] { "aes2" });
      this.zzK.zza();
      localObject = zzbcc.zzf();
      this.zzH = ((zzbbz)localObject);
      this.zzK.zzb("native:view_show", (zzbbz)localObject);
    }
    Object localObject = new HashMap(1);
    ((HashMap)localObject).put("version", this.zze.zza);
    zzd("onshow", (Map)localObject);
  }
  
  public final void zzY()
  {
    throw null;
  }
  
  public final void zzZ(boolean paramBoolean)
  {
    this.zzn.zzi(paramBoolean);
  }
  
  public final void zza(String paramString)
  {
    throw null;
  }
  
  public final boolean zzaA()
  {
    try
    {
      boolean bool = this.zzu;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzaB()
  {
    return false;
  }
  
  public final boolean zzaC()
  {
    try
    {
      boolean bool = this.zzx;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzaD(zzc paramzzc, boolean paramBoolean)
  {
    this.zzn.zzt(paramzzc, paramBoolean);
  }
  
  public final void zzaE(zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2, int paramInt)
  {
    this.zzn.zzu(paramzzbr, paramzzebc, paramzzdqc, paramzzfen, paramString1, paramString2, 14);
  }
  
  public final void zzaF(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    this.zzn.zzv(paramBoolean1, paramInt, paramBoolean2);
  }
  
  public final void zzaG(boolean paramBoolean1, int paramInt, String paramString, boolean paramBoolean2)
  {
    this.zzn.zzx(paramBoolean1, paramInt, paramString, paramBoolean2);
  }
  
  public final void zzaH(boolean paramBoolean1, int paramInt, String paramString1, String paramString2, boolean paramBoolean2)
  {
    this.zzn.zzy(paramBoolean1, paramInt, paramString1, paramString2, paramBoolean2);
  }
  
  public final zzcfi zzaJ()
  {
    return this.zzn;
  }
  
  final Boolean zzaK()
  {
    try
    {
      Boolean localBoolean = this.zzw;
      return localBoolean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void zzaN(String paramString, ValueCallback paramValueCallback)
  {
    try
    {
      if (!zzaz())
      {
        evaluateJavascript(paramString, null);
        return;
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  protected final void zzaO(String paramString)
  {
    if (PlatformVersion.isAtLeastKitKat())
    {
      if (zzaK() == null) {
        zzbb();
      }
      if (zzaK().booleanValue())
      {
        zzaN(paramString, null);
        return;
      }
      zzaP("javascript:".concat(paramString));
      return;
    }
    zzaP("javascript:".concat(paramString));
  }
  
  protected final void zzaP(String paramString)
  {
    try
    {
      if (!zzaz())
      {
        loadUrl(paramString);
        return;
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  final void zzaQ(Boolean paramBoolean)
  {
    try
    {
      this.zzw = paramBoolean;
      zzt.zzo().zzv(paramBoolean);
      return;
    }
    finally {}
  }
  
  public final boolean zzaR()
  {
    boolean bool2 = this.zzn.zzK();
    boolean bool1 = false;
    if ((!bool2) && (!this.zzn.zzL())) {
      return false;
    }
    zzay.zzb();
    Object localObject = this.zzh;
    int k = zzbzm.zzv((DisplayMetrics)localObject, ((DisplayMetrics)localObject).widthPixels);
    zzay.zzb();
    localObject = this.zzh;
    int m = zzbzm.zzv((DisplayMetrics)localObject, ((DisplayMetrics)localObject).heightPixels);
    localObject = this.zzb.zza();
    int j;
    int i;
    if ((localObject != null) && (((Activity)localObject).getWindow() != null))
    {
      zzt.zzp();
      localObject = zzs.zzM((Activity)localObject);
      zzay.zzb();
      j = zzbzm.zzv(this.zzh, localObject[0]);
      zzay.zzb();
      i = zzbzm.zzv(this.zzh, localObject[1]);
    }
    else
    {
      j = k;
      i = m;
    }
    int n = this.zzQ;
    if ((n == k) && (this.zzP == m) && (this.zzR == j) && (this.zzS == i)) {
      return false;
    }
    if ((n != k) || (this.zzP != m)) {
      bool1 = true;
    }
    this.zzQ = k;
    this.zzP = m;
    this.zzR = j;
    this.zzS = i;
    new zzbqy(this, "").zzi(k, m, j, i, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
    return bool1;
  }
  
  public final void zzaa()
  {
    this.zzO.zzb();
  }
  
  public final void zzab(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (!zzaz())
      {
        paramString3 = zzbbk.zzQ;
        Object localObject = (String)zzba.zzc().zzb(paramString3);
        paramString3 = new org/json/JSONObject;
        paramString3.<init>();
        try
        {
          paramString3.put("version", localObject);
          paramString3.put("sdk", "Google Mobile Ads");
          paramString3.put("sdkVersion", "12.4.51-000");
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
          ((StringBuilder)localObject).append(paramString3.toString());
          ((StringBuilder)localObject).append("}});</script>");
          paramString3 = ((StringBuilder)localObject).toString();
        }
        catch (JSONException paramString3)
        {
          zzbzt.zzk("Unable to build MRAID_ENV", paramString3);
          paramString3 = null;
        }
        super.loadDataWithBaseURL(paramString1, zzcgh.zza(paramString2, new String[] { paramString3 }), "text/html", "UTF-8", null);
        return;
      }
      zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public final void zzac()
  {
    if (this.zzJ == null)
    {
      this.zzK.zza();
      zzbbz localzzbbz = zzbcc.zzf();
      this.zzJ = localzzbbz;
      this.zzK.zzb("native:view_load", localzzbbz);
    }
  }
  
  public final void zzad(String paramString, zzbii paramzzbii)
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.zzz(paramString, paramzzbii);
    }
  }
  
  public final void zzae()
  {
    throw null;
  }
  
  public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl paramzzl)
  {
    try
    {
      this.zzo = paramzzl;
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final void zzag(zzcgq paramzzcgq)
  {
    try
    {
      this.zzq = paramzzcgq;
      requestLayout();
      return;
    }
    finally
    {
      paramzzcgq = finally;
      throw paramzzcgq;
    }
  }
  
  public final void zzah(zzavl paramzzavl)
  {
    try
    {
      this.zzE = paramzzavl;
      return;
    }
    finally
    {
      paramzzavl = finally;
      throw paramzzavl;
    }
  }
  
  public final void zzai(boolean paramBoolean)
  {
    try
    {
      this.zzx = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzaj()
  {
    setBackgroundColor(0);
  }
  
  public final void zzak(Context paramContext)
  {
    this.zzb.setBaseContext(paramContext);
    this.zzO.zze(this.zzb.zza());
  }
  
  public final void zzal(boolean paramBoolean)
  {
    try
    {
      com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzo;
      if (localzzl != null)
      {
        localzzl.zzx(this.zzn.zzK(), paramBoolean);
        return;
      }
      this.zzs = paramBoolean;
      return;
    }
    finally {}
  }
  
  public final void zzam(zzbeb paramzzbeb)
  {
    try
    {
      this.zzD = paramzzbeb;
      return;
    }
    finally
    {
      paramzzbeb = finally;
      throw paramzzbeb;
    }
  }
  
  public final void zzan(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.zzu;
      this.zzu = paramBoolean;
      zzaS();
      if (paramBoolean != bool)
      {
        Object localObject1 = zzbbk.zzR;
        if ((!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) || (!this.zzq.zzi()))
        {
          zzbqy localzzbqy = new com/google/android/gms/internal/ads/zzbqy;
          localzzbqy.<init>(this, "");
          if (true != paramBoolean) {
            localObject1 = "default";
          } else {
            localObject1 = "expanded";
          }
          localzzbqy.zzk((String)localObject1);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzao(zzbed paramzzbed)
  {
    try
    {
      this.zzC = paramzzbed;
      return;
    }
    finally
    {
      paramzzbed = finally;
      throw paramzzbed;
    }
  }
  
  public final void zzap(zzfgo paramzzfgo)
  {
    try
    {
      this.zzp = paramzzfgo;
      return;
    }
    finally
    {
      paramzzfgo = finally;
      throw paramzzfgo;
    }
  }
  
  public final void zzaq(int paramInt)
  {
    try
    {
      com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzo;
      if (localzzl != null)
      {
        localzzl.zzz(paramInt);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzar(com.google.android.gms.ads.internal.overlay.zzl paramzzl)
  {
    try
    {
      this.zzM = paramzzl;
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  public final void zzas(boolean paramBoolean)
  {
    try
    {
      int j = this.zzF;
      int i = 1;
      if (true != paramBoolean) {
        i = -1;
      }
      i = j + i;
      this.zzF = i;
      if (i <= 0)
      {
        com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzo;
        if (localzzl != null)
        {
          localzzl.zzD();
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzat(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      setBackgroundColor(0);
      com.google.android.gms.ads.internal.overlay.zzl localzzl = this.zzo;
      if (localzzl != null)
      {
        localzzl.zzA(paramBoolean);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzau(String paramString, zzbii paramzzbii)
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.zzH(paramString, paramzzbii);
    }
  }
  
  public final void zzav(String paramString, Predicate paramPredicate)
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.zzI(paramString, paramPredicate);
    }
  }
  
  public final boolean zzaw()
  {
    try
    {
      boolean bool = this.zzs;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean zzax()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 1125	com/google/android/gms/internal/ads/zzcfu:zzF	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifle +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzcfu
    //   6	2	1	i	int
    //   12	7	2	bool	boolean
    //   22	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final boolean zzay(boolean paramBoolean, int paramInt)
  {
    destroy();
    this.zzV.zzb(new zzcfr(paramBoolean, paramInt));
    this.zzV.zzc(10003);
    return true;
  }
  
  public final boolean zzaz()
  {
    try
    {
      boolean bool = this.zzt;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("(");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(");");
    zzaO(localStringBuilder.toString());
  }
  
  public final void zzbj()
  {
    try
    {
      com.google.android.gms.ads.internal.zzl localzzl = this.zzf;
      if (localzzl != null)
      {
        localzzl.zzbj();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzbk()
  {
    try
    {
      com.google.android.gms.ads.internal.zzl localzzl = this.zzf;
      if (localzzl != null)
      {
        localzzl.zzbk();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final String zzbl()
  {
    try
    {
      Object localObject1 = this.zzk;
      if (localObject1 != null)
      {
        localObject1 = ((zzezi)localObject1).zzb;
        return (String)localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public final String zzbm()
  {
    try
    {
      String str = this.zzy;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    try
    {
      this.zzA = paramzzatx.zzj;
      zzaV(paramzzatx.zzj);
      return;
    }
    finally {}
  }
  
  public final void zzd(String paramString, Map paramMap)
  {
    try
    {
      paramMap = zzay.zzb().zzi(paramMap);
      zze(paramString, paramMap);
      return;
    }
    catch (JSONException paramString)
    {
      zzbzt.zzj("Could not convert parameters to JSON.");
    }
  }
  
  public final void zze(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    paramJSONObject = ((JSONObject)localObject).toString();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("(window.AFMA_ReceiveMessage || function() {})('");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("',");
    ((StringBuilder)localObject).append(paramJSONObject);
    ((StringBuilder)localObject).append(");");
    zzbzt.zze("Dispatching AFMA event: ".concat(((StringBuilder)localObject).toString()));
    zzaO(((StringBuilder)localObject).toString());
  }
  
  public final int zzf()
  {
    try
    {
      int i = this.zzL;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int zzg()
  {
    return getMeasuredHeight();
  }
  
  public final int zzh()
  {
    return getMeasuredWidth();
  }
  
  public final Activity zzi()
  {
    return this.zzb.zza();
  }
  
  public final zza zzj()
  {
    return this.zzg;
  }
  
  public final zzbbz zzk()
  {
    return this.zzI;
  }
  
  public final void zzl(String paramString, JSONObject paramJSONObject)
  {
    zzb(paramString, paramJSONObject.toString());
  }
  
  public final zzbca zzm()
  {
    return this.zzK;
  }
  
  public final zzbzz zzn()
  {
    return this.zze;
  }
  
  public final zzcbr zzo()
  {
    return null;
  }
  
  public final zzcdn zzp(String paramString)
  {
    try
    {
      Map localMap = this.zzT;
      if (localMap == null) {
        return null;
      }
      paramString = (zzcdn)localMap.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public final zzcfx zzq()
  {
    try
    {
      zzcfx localzzcfx = this.zzz;
      return localzzcfx;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzr()
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.zzr();
    }
  }
  
  public final void zzs()
  {
    zzcfi localzzcfi = this.zzn;
    if (localzzcfi != null) {
      localzzcfi.zzs();
    }
  }
  
  public final void zzt(String paramString, zzcdn paramzzcdn)
  {
    try
    {
      if (this.zzT == null)
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        this.zzT = localHashMap;
      }
      this.zzT.put(paramString, paramzzcdn);
      return;
    }
    finally {}
  }
  
  public final void zzu()
  {
    com.google.android.gms.ads.internal.overlay.zzl localzzl = zzL();
    if (localzzl != null) {
      localzzl.zzd();
    }
  }
  
  public final void zzv(boolean paramBoolean, long paramLong)
  {
    HashMap localHashMap = new HashMap(2);
    String str;
    if (true != paramBoolean) {
      str = "0";
    } else {
      str = "1";
    }
    localHashMap.put("success", str);
    localHashMap.put("duration", Long.toString(paramLong));
    zzd("onCacheAccessComplete", localHashMap);
  }
  
  public final void zzw()
  {
    try
    {
      zzbeb localzzbeb = this.zzD;
      if (localzzbeb != null)
      {
        zzflv localzzflv = zzs.zza;
        zzdky localzzdky = new com/google/android/gms/internal/ads/zzdky;
        localzzdky.<init>((zzdla)localzzbeb);
        localzzflv.post(localzzdky);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzx(int paramInt) {}
  
  public final void zzy(int paramInt) {}
  
  public final void zzz(boolean paramBoolean)
  {
    this.zzn.zzC(false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */