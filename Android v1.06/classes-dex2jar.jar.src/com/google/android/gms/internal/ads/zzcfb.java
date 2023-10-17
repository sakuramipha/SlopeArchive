package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract interface zzcfb
  extends com.google.android.gms.ads.internal.client.zza, zzdcw, zzces, zzblb, zzcfy, zzcgc, zzblo, zzaty, zzcgg, com.google.android.gms.ads.internal.zzl, zzcgj, zzcgk, zzccc, zzcgl
{
  public abstract boolean canGoBack();
  
  public abstract void destroy();
  
  public abstract Context getContext();
  
  public abstract int getHeight();
  
  public abstract ViewGroup.LayoutParams getLayoutParams();
  
  public abstract void getLocationOnScreen(int[] paramArrayOfInt);
  
  public abstract int getMeasuredHeight();
  
  public abstract int getMeasuredWidth();
  
  public abstract ViewParent getParent();
  
  public abstract int getWidth();
  
  public abstract void goBack();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  public abstract void measure(int paramInt1, int paramInt2);
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void setBackgroundColor(int paramInt);
  
  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  public abstract void setWebViewClient(WebViewClient paramWebViewClient);
  
  public abstract void zzC(zzcfx paramzzcfx);
  
  public abstract zzezf zzD();
  
  public abstract Context zzE();
  
  public abstract View zzF();
  
  public abstract WebView zzG();
  
  public abstract WebViewClient zzH();
  
  public abstract zzaqq zzI();
  
  public abstract zzavl zzJ();
  
  public abstract zzbed zzK();
  
  public abstract com.google.android.gms.ads.internal.overlay.zzl zzL();
  
  public abstract com.google.android.gms.ads.internal.overlay.zzl zzM();
  
  public abstract zzcgo zzN();
  
  public abstract zzcgq zzO();
  
  public abstract zzezi zzP();
  
  public abstract zzfgo zzQ();
  
  public abstract zzfwb zzR();
  
  public abstract String zzS();
  
  public abstract void zzT(zzezf paramzzezf, zzezi paramzzezi);
  
  public abstract void zzU();
  
  public abstract void zzV();
  
  public abstract void zzW(int paramInt);
  
  public abstract void zzX();
  
  public abstract void zzY();
  
  public abstract void zzZ(boolean paramBoolean);
  
  public abstract boolean zzaA();
  
  public abstract boolean zzaB();
  
  public abstract boolean zzaC();
  
  public abstract void zzaa();
  
  public abstract void zzab(String paramString1, String paramString2, String paramString3);
  
  public abstract void zzac();
  
  public abstract void zzad(String paramString, zzbii paramzzbii);
  
  public abstract void zzae();
  
  public abstract void zzaf(com.google.android.gms.ads.internal.overlay.zzl paramzzl);
  
  public abstract void zzag(zzcgq paramzzcgq);
  
  public abstract void zzah(zzavl paramzzavl);
  
  public abstract void zzai(boolean paramBoolean);
  
  public abstract void zzaj();
  
  public abstract void zzak(Context paramContext);
  
  public abstract void zzal(boolean paramBoolean);
  
  public abstract void zzam(zzbeb paramzzbeb);
  
  public abstract void zzan(boolean paramBoolean);
  
  public abstract void zzao(zzbed paramzzbed);
  
  public abstract void zzap(zzfgo paramzzfgo);
  
  public abstract void zzaq(int paramInt);
  
  public abstract void zzar(com.google.android.gms.ads.internal.overlay.zzl paramzzl);
  
  public abstract void zzas(boolean paramBoolean);
  
  public abstract void zzat(boolean paramBoolean);
  
  public abstract void zzau(String paramString, zzbii paramzzbii);
  
  public abstract void zzav(String paramString, Predicate paramPredicate);
  
  public abstract boolean zzaw();
  
  public abstract boolean zzax();
  
  public abstract boolean zzay(boolean paramBoolean, int paramInt);
  
  public abstract boolean zzaz();
  
  public abstract Activity zzi();
  
  public abstract com.google.android.gms.ads.internal.zza zzj();
  
  public abstract zzbca zzm();
  
  public abstract zzbzz zzn();
  
  public abstract zzcfx zzq();
  
  public abstract void zzt(String paramString, zzcdn paramzzcdn);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */