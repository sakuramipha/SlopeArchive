package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcfq
  extends FrameLayout
  implements zzcfb
{
  private final zzcfb zza;
  private final zzcbr zzb;
  private final AtomicBoolean zzc = new AtomicBoolean();
  
  public zzcfq(zzcfb paramzzcfb)
  {
    super(paramzzcfb.getContext());
    this.zza = paramzzcfb;
    this.zzb = new zzcbr(paramzzcfb.zzE(), this, this);
    addView((View)paramzzcfb);
  }
  
  public final boolean canGoBack()
  {
    return this.zza.canGoBack();
  }
  
  public final void destroy()
  {
    Object localObject1 = zzQ();
    if (localObject1 != null)
    {
      zzs.zza.post(new zzcfo((zzfgo)localObject1));
      localObject1 = zzs.zza;
      Object localObject2 = this.zza;
      localObject2.getClass();
      zzcfp localzzcfp = new zzcfp((zzcfb)localObject2);
      localObject2 = zzbbk.zzeL;
      ((zzflv)localObject1).postDelayed(localzzcfp, ((Integer)zzba.zzc().zzb((zzbbc)localObject2)).intValue());
      return;
    }
    this.zza.destroy();
  }
  
  public final void goBack()
  {
    this.zza.goBack();
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.zza.loadData(paramString1, "text/html", paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.zza.loadDataWithBaseURL(paramString1, paramString2, "text/html", "UTF-8", null);
  }
  
  public final void loadUrl(String paramString)
  {
    this.zza.loadUrl(paramString);
  }
  
  public final void onAdClicked()
  {
    zzcfb localzzcfb = this.zza;
    if (localzzcfb != null) {
      localzzcfb.onAdClicked();
    }
  }
  
  public final void onPause()
  {
    this.zzb.zzf();
    this.zza.onPause();
  }
  
  public final void onResume()
  {
    this.zza.onResume();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.zza.setOnClickListener(paramOnClickListener);
  }
  
  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.zza.setOnTouchListener(paramOnTouchListener);
  }
  
  public final void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    this.zza.setWebChromeClient(paramWebChromeClient);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    this.zza.setWebViewClient(paramWebViewClient);
  }
  
  public final void zzA(int paramInt)
  {
    this.zza.zzA(paramInt);
  }
  
  public final void zzB(int paramInt)
  {
    this.zzb.zzg(paramInt);
  }
  
  public final void zzC(zzcfx paramzzcfx)
  {
    this.zza.zzC(paramzzcfx);
  }
  
  public final zzezf zzD()
  {
    return this.zza.zzD();
  }
  
  public final Context zzE()
  {
    return this.zza.zzE();
  }
  
  public final View zzF()
  {
    return this;
  }
  
  public final WebView zzG()
  {
    return (WebView)this.zza;
  }
  
  public final WebViewClient zzH()
  {
    return this.zza.zzH();
  }
  
  public final zzaqq zzI()
  {
    return this.zza.zzI();
  }
  
  public final zzavl zzJ()
  {
    return this.zza.zzJ();
  }
  
  public final zzbed zzK()
  {
    return this.zza.zzK();
  }
  
  public final zzl zzL()
  {
    return this.zza.zzL();
  }
  
  public final zzl zzM()
  {
    return this.zza.zzM();
  }
  
  public final zzcgo zzN()
  {
    return ((zzcfu)this.zza).zzaJ();
  }
  
  public final zzcgq zzO()
  {
    return this.zza.zzO();
  }
  
  public final zzezi zzP()
  {
    return this.zza.zzP();
  }
  
  public final zzfgo zzQ()
  {
    return this.zza.zzQ();
  }
  
  public final zzfwb zzR()
  {
    return this.zza.zzR();
  }
  
  public final String zzS()
  {
    return this.zza.zzS();
  }
  
  public final void zzT(zzezf paramzzezf, zzezi paramzzezi)
  {
    this.zza.zzT(paramzzezf, paramzzezi);
  }
  
  public final void zzU()
  {
    this.zzb.zze();
    this.zza.zzU();
  }
  
  public final void zzV()
  {
    this.zza.zzV();
  }
  
  public final void zzW(int paramInt)
  {
    this.zza.zzW(paramInt);
  }
  
  public final void zzX()
  {
    this.zza.zzX();
  }
  
  public final void zzY()
  {
    Object localObject = this.zza;
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(zzt.zzr().zze()));
    localHashMap.put("app_volume", String.valueOf(zzt.zzr().zza()));
    localObject = (zzcfu)localObject;
    localHashMap.put("device_volume", String.valueOf(zzab.zzb(((zzcfu)localObject).getContext())));
    ((zzcfu)localObject).zzd("volume", localHashMap);
  }
  
  public final void zzZ(boolean paramBoolean)
  {
    this.zza.zzZ(paramBoolean);
  }
  
  public final void zza(String paramString)
  {
    ((zzcfu)this.zza).zzaO(paramString);
  }
  
  public final boolean zzaA()
  {
    return this.zza.zzaA();
  }
  
  public final boolean zzaB()
  {
    return this.zzc.get();
  }
  
  public final boolean zzaC()
  {
    return this.zza.zzaC();
  }
  
  public final void zzaD(zzc paramzzc, boolean paramBoolean)
  {
    this.zza.zzaD(paramzzc, paramBoolean);
  }
  
  public final void zzaE(zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2, int paramInt)
  {
    this.zza.zzaE(paramzzbr, paramzzebc, paramzzdqc, paramzzfen, paramString1, paramString2, 14);
  }
  
  public final void zzaF(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    this.zza.zzaF(paramBoolean1, paramInt, paramBoolean2);
  }
  
  public final void zzaG(boolean paramBoolean1, int paramInt, String paramString, boolean paramBoolean2)
  {
    this.zza.zzaG(paramBoolean1, paramInt, paramString, paramBoolean2);
  }
  
  public final void zzaH(boolean paramBoolean1, int paramInt, String paramString1, String paramString2, boolean paramBoolean2)
  {
    this.zza.zzaH(paramBoolean1, paramInt, paramString1, paramString2, paramBoolean2);
  }
  
  public final void zzaa()
  {
    this.zza.zzaa();
  }
  
  public final void zzab(String paramString1, String paramString2, String paramString3)
  {
    this.zza.zzab(paramString1, paramString2, null);
  }
  
  public final void zzac()
  {
    this.zza.zzac();
  }
  
  public final void zzad(String paramString, zzbii paramzzbii)
  {
    this.zza.zzad(paramString, paramzzbii);
  }
  
  public final void zzae()
  {
    TextView localTextView = new TextView(getContext());
    zzt.zzp();
    localTextView.setText(zzs.zzu());
    localTextView.setTextSize(15.0F);
    localTextView.setTextColor(-1);
    localTextView.setPadding(5, 0, 5, 0);
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setShape(0);
    localGradientDrawable.setColor(-12303292);
    localGradientDrawable.setCornerRadius(8.0F);
    localTextView.setBackground(localGradientDrawable);
    addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 49));
    bringChildToFront(localTextView);
  }
  
  public final void zzaf(zzl paramzzl)
  {
    this.zza.zzaf(paramzzl);
  }
  
  public final void zzag(zzcgq paramzzcgq)
  {
    this.zza.zzag(paramzzcgq);
  }
  
  public final void zzah(zzavl paramzzavl)
  {
    this.zza.zzah(paramzzavl);
  }
  
  public final void zzai(boolean paramBoolean)
  {
    this.zza.zzai(paramBoolean);
  }
  
  public final void zzaj()
  {
    setBackgroundColor(0);
    this.zza.setBackgroundColor(0);
  }
  
  public final void zzak(Context paramContext)
  {
    this.zza.zzak(paramContext);
  }
  
  public final void zzal(boolean paramBoolean)
  {
    this.zza.zzal(paramBoolean);
  }
  
  public final void zzam(zzbeb paramzzbeb)
  {
    this.zza.zzam(paramzzbeb);
  }
  
  public final void zzan(boolean paramBoolean)
  {
    this.zza.zzan(paramBoolean);
  }
  
  public final void zzao(zzbed paramzzbed)
  {
    this.zza.zzao(paramzzbed);
  }
  
  public final void zzap(zzfgo paramzzfgo)
  {
    this.zza.zzap(paramzzfgo);
  }
  
  public final void zzaq(int paramInt)
  {
    this.zza.zzaq(paramInt);
  }
  
  public final void zzar(zzl paramzzl)
  {
    this.zza.zzar(paramzzl);
  }
  
  public final void zzas(boolean paramBoolean)
  {
    this.zza.zzas(paramBoolean);
  }
  
  public final void zzat(boolean paramBoolean)
  {
    this.zza.zzat(paramBoolean);
  }
  
  public final void zzau(String paramString, zzbii paramzzbii)
  {
    this.zza.zzau(paramString, paramzzbii);
  }
  
  public final void zzav(String paramString, Predicate paramPredicate)
  {
    this.zza.zzav(paramString, paramPredicate);
  }
  
  public final boolean zzaw()
  {
    return this.zza.zzaw();
  }
  
  public final boolean zzax()
  {
    return this.zza.zzax();
  }
  
  public final boolean zzay(boolean paramBoolean, int paramInt)
  {
    if (!this.zzc.compareAndSet(false, true)) {
      return true;
    }
    zzbbc localzzbbc = zzbbk.zzaI;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return false;
    }
    if ((this.zza.getParent() instanceof ViewGroup)) {
      ((ViewGroup)this.zza.getParent()).removeView((View)this.zza);
    }
    this.zza.zzay(paramBoolean, paramInt);
    return true;
  }
  
  public final boolean zzaz()
  {
    return this.zza.zzaz();
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    this.zza.zzb("window.inspectorInfo", paramString2);
  }
  
  public final void zzbj()
  {
    this.zza.zzbj();
  }
  
  public final void zzbk()
  {
    this.zza.zzbk();
  }
  
  public final String zzbl()
  {
    return this.zza.zzbl();
  }
  
  public final String zzbm()
  {
    return this.zza.zzbm();
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    this.zza.zzc(paramzzatx);
  }
  
  public final void zzd(String paramString, Map paramMap)
  {
    this.zza.zzd(paramString, paramMap);
  }
  
  public final void zze(String paramString, JSONObject paramJSONObject)
  {
    this.zza.zze(paramString, paramJSONObject);
  }
  
  public final int zzf()
  {
    return this.zza.zzf();
  }
  
  public final int zzg()
  {
    zzbbc localzzbbc = zzbbk.zzdB;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return this.zza.getMeasuredHeight();
    }
    return getMeasuredHeight();
  }
  
  public final int zzh()
  {
    zzbbc localzzbbc = zzbbk.zzdB;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return this.zza.getMeasuredWidth();
    }
    return getMeasuredWidth();
  }
  
  public final Activity zzi()
  {
    return this.zza.zzi();
  }
  
  public final zza zzj()
  {
    return this.zza.zzj();
  }
  
  public final zzbbz zzk()
  {
    return this.zza.zzk();
  }
  
  public final void zzl(String paramString, JSONObject paramJSONObject)
  {
    zzcfb localzzcfb = this.zza;
    paramJSONObject = paramJSONObject.toString();
    ((zzcfu)localzzcfb).zzb(paramString, paramJSONObject);
  }
  
  public final zzbca zzm()
  {
    return this.zza.zzm();
  }
  
  public final zzbzz zzn()
  {
    return this.zza.zzn();
  }
  
  public final zzcbr zzo()
  {
    return this.zzb;
  }
  
  public final zzcdn zzp(String paramString)
  {
    return this.zza.zzp(paramString);
  }
  
  public final zzcfx zzq()
  {
    return this.zza.zzq();
  }
  
  public final void zzr()
  {
    zzcfb localzzcfb = this.zza;
    if (localzzcfb != null) {
      localzzcfb.zzr();
    }
  }
  
  public final void zzs()
  {
    zzcfb localzzcfb = this.zza;
    if (localzzcfb != null) {
      localzzcfb.zzs();
    }
  }
  
  public final void zzt(String paramString, zzcdn paramzzcdn)
  {
    this.zza.zzt(paramString, paramzzcdn);
  }
  
  public final void zzu()
  {
    this.zza.zzu();
  }
  
  public final void zzv(boolean paramBoolean, long paramLong)
  {
    this.zza.zzv(paramBoolean, paramLong);
  }
  
  public final void zzw()
  {
    this.zza.zzw();
  }
  
  public final void zzx(int paramInt) {}
  
  public final void zzy(int paramInt) {}
  
  public final void zzz(boolean paramBoolean)
  {
    this.zza.zzz(false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */