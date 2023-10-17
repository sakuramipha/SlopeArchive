package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzebn;
import com.google.android.gms.internal.ads.zzebo;
import com.google.android.gms.internal.ads.zzebp;
import com.google.android.gms.internal.ads.zzebs;
import com.google.android.gms.internal.ads.zzfgo;
import com.google.android.gms.internal.ads.zzflv;
import java.util.Collections;

public class zzl
  extends zzbru
  implements zzad
{
  static final int zza = Color.argb(0, 0, 0, 0);
  protected final Activity zzb;
  AdOverlayInfoParcel zzc;
  zzcfb zzd;
  zzh zze;
  zzr zzf;
  boolean zzg = false;
  FrameLayout zzh;
  WebChromeClient.CustomViewCallback zzi;
  boolean zzj = false;
  boolean zzk = false;
  zzg zzl;
  boolean zzm = false;
  int zzn = 1;
  private final Object zzo = new Object();
  private Runnable zzp;
  private boolean zzq;
  private boolean zzr;
  private boolean zzs = false;
  private boolean zzt = false;
  private boolean zzu = true;
  
  public zzl(Activity paramActivity)
  {
    this.zzb = paramActivity;
  }
  
  private final void zzH(Configuration paramConfiguration)
  {
    Object localObject = this.zzc;
    int m = 1;
    int k = 0;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzo;
      if ((localObject != null) && (((zzj)localObject).zzb))
      {
        i = 1;
        break label44;
      }
    }
    int i = 0;
    label44:
    boolean bool = zzt.zzq().zze(this.zzb, paramConfiguration);
    int j;
    if (((!this.zzk) || (i != 0)) && (!bool))
    {
      paramConfiguration = this.zzc;
      j = m;
      i = k;
      if (paramConfiguration != null)
      {
        paramConfiguration = paramConfiguration.zzo;
        j = m;
        i = k;
        if (paramConfiguration != null)
        {
          j = m;
          i = k;
          if (paramConfiguration.zzg)
          {
            i = 1;
            j = m;
          }
        }
      }
    }
    else
    {
      j = 0;
      i = k;
    }
    paramConfiguration = this.zzb.getWindow();
    localObject = zzbbk.zzbb;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      paramConfiguration = paramConfiguration.getDecorView();
      if (j != 0)
      {
        if (i != 0) {
          i = 5894;
        } else {
          i = 5380;
        }
      }
      else {
        i = 256;
      }
      paramConfiguration.setSystemUiVisibility(i);
      return;
    }
    if (j != 0)
    {
      paramConfiguration.addFlags(1024);
      paramConfiguration.clearFlags(2048);
      if (i != 0) {
        paramConfiguration.getDecorView().setSystemUiVisibility(4098);
      }
      return;
    }
    paramConfiguration.addFlags(2048);
    paramConfiguration.clearFlags(1024);
  }
  
  private static final void zzI(zzfgo paramzzfgo, View paramView)
  {
    if ((paramzzfgo != null) && (paramView != null)) {
      zzt.zzA().zzc(paramzzfgo, paramView);
    }
  }
  
  public final void zzA(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.zzl.setBackgroundColor(0);
      return;
    }
    this.zzl.setBackgroundColor(-16777216);
  }
  
  public final void zzB(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    FrameLayout localFrameLayout = new FrameLayout(this.zzb);
    this.zzh = localFrameLayout;
    localFrameLayout.setBackgroundColor(-16777216);
    this.zzh.addView(paramView, -1, -1);
    this.zzb.setContentView(this.zzh);
    this.zzr = true;
    this.zzi = paramCustomViewCallback;
    this.zzg = true;
  }
  
  protected final void zzC(boolean paramBoolean)
    throws zzf
  {
    if (!this.zzr) {
      this.zzb.requestWindowFeature(1);
    }
    Object localObject3 = this.zzb.getWindow();
    if (localObject3 != null)
    {
      Object localObject1 = this.zzc.zzd;
      Object localObject5 = null;
      if (localObject1 != null) {
        localObject1 = ((zzcfb)localObject1).zzN();
      } else {
        localObject1 = null;
      }
      boolean bool5 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool2;
      if ((localObject1 != null) && (((zzcgo)localObject1).zzK())) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      this.zzm = false;
      boolean bool1 = bool3;
      if (bool2)
      {
        int i = this.zzc.zzj;
        if (i == 6)
        {
          bool1 = bool4;
          if (this.zzb.getResources().getConfiguration().orientation == 1) {
            bool1 = true;
          }
          this.zzm = bool1;
        }
        else
        {
          bool1 = bool3;
          if (i == 7)
          {
            bool1 = bool5;
            if (this.zzb.getResources().getConfiguration().orientation == 2) {
              bool1 = true;
            }
            this.zzm = bool1;
          }
        }
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Delay onShow to next orientation change: ");
      ((StringBuilder)localObject1).append(bool1);
      zzbzt.zze(((StringBuilder)localObject1).toString());
      zzz(this.zzc.zzj);
      ((Window)localObject3).setFlags(16777216, 16777216);
      zzbzt.zze("Hardware acceleration on the AdActivity window enabled.");
      if (!this.zzk) {
        this.zzl.setBackgroundColor(-16777216);
      } else {
        this.zzl.setBackgroundColor(zza);
      }
      this.zzb.setContentView(this.zzl);
      this.zzr = true;
      if (paramBoolean) {
        try
        {
          zzt.zzz();
          Object localObject6 = this.zzb;
          localObject1 = this.zzc.zzd;
          if (localObject1 != null) {
            localObject1 = ((zzcfb)localObject1).zzO();
          } else {
            localObject1 = null;
          }
          localObject3 = this.zzc.zzd;
          if (localObject3 != null) {
            localObject3 = ((zzcfb)localObject3).zzS();
          } else {
            localObject3 = null;
          }
          Object localObject4 = this.zzc;
          Object localObject7 = ((AdOverlayInfoParcel)localObject4).zzm;
          localObject4 = ((AdOverlayInfoParcel)localObject4).zzd;
          if (localObject4 != null) {
            localObject4 = ((zzcfb)localObject4).zzj();
          } else {
            localObject4 = null;
          }
          localObject1 = zzcfn.zza((Context)localObject6, (zzcgq)localObject1, (String)localObject3, true, bool2, null, null, (zzbzz)localObject7, null, null, (com.google.android.gms.ads.internal.zza)localObject4, zzawx.zza(), null, null);
          this.zzd = ((zzcfb)localObject1);
          localObject7 = ((zzcfb)localObject1).zzN();
          localObject1 = this.zzc;
          localObject6 = ((AdOverlayInfoParcel)localObject1).zzp;
          localObject4 = ((AdOverlayInfoParcel)localObject1).zze;
          localObject3 = ((AdOverlayInfoParcel)localObject1).zzi;
          zzcfb localzzcfb = ((AdOverlayInfoParcel)localObject1).zzd;
          localObject1 = localObject5;
          if (localzzcfb != null) {
            localObject1 = localzzcfb.zzN().zzd();
          }
          ((zzcgo)localObject7).zzM(null, (zzbhb)localObject6, null, (zzbhd)localObject4, (zzz)localObject3, true, null, (com.google.android.gms.ads.internal.zzb)localObject1, null, null, null, null, null, null, null, null, null, null);
          this.zzd.zzN().zzA(new zzd(this));
          localObject1 = this.zzc;
          localObject3 = ((AdOverlayInfoParcel)localObject1).zzl;
          if (localObject3 != null)
          {
            this.zzd.loadUrl((String)localObject3);
          }
          else
          {
            localObject3 = ((AdOverlayInfoParcel)localObject1).zzh;
            if (localObject3 == null) {
              break label645;
            }
            this.zzd.loadDataWithBaseURL(((AdOverlayInfoParcel)localObject1).zzf, (String)localObject3, "text/html", "UTF-8", null);
          }
          localObject1 = this.zzc.zzd;
          if (localObject1 == null) {
            break label705;
          }
          ((zzcfb)localObject1).zzar(this);
          break label705;
          label645:
          throw new zzf("No URL or HTML to display in ad overlay.");
        }
        catch (Exception localException)
        {
          zzbzt.zzh("Error obtaining webview.", localException);
          throw new zzf("Could not obtain webview for the overlay.", localException);
        }
      }
      Object localObject2 = this.zzc.zzd;
      this.zzd = ((zzcfb)localObject2);
      ((zzcfb)localObject2).zzak(this.zzb);
      label705:
      this.zzd.zzaf(this);
      localObject2 = this.zzc.zzd;
      if (localObject2 != null) {
        zzI(((zzcfb)localObject2).zzQ(), this.zzl);
      }
      if (this.zzc.zzk != 5)
      {
        localObject2 = this.zzd.getParent();
        if ((localObject2 != null) && ((localObject2 instanceof ViewGroup))) {
          ((ViewGroup)localObject2).removeView(this.zzd.zzF());
        }
        if (this.zzk) {
          this.zzd.zzaj();
        }
        this.zzl.addView(this.zzd.zzF(), -1, -1);
      }
      if ((!paramBoolean) && (!this.zzm)) {
        zze();
      }
      localObject2 = this.zzc;
      if (((AdOverlayInfoParcel)localObject2).zzk != 5)
      {
        zzv(bool2);
        if (this.zzd.zzaw()) {
          zzx(bool2, true);
        }
        return;
      }
      zzebn.zzk(this.zzb, this, ((AdOverlayInfoParcel)localObject2).zzu, ((AdOverlayInfoParcel)localObject2).zzr, ((AdOverlayInfoParcel)localObject2).zzs, ((AdOverlayInfoParcel)localObject2).zzt, ((AdOverlayInfoParcel)localObject2).zzq, ((AdOverlayInfoParcel)localObject2).zzv, false);
      return;
    }
    throw new zzf("Invalid activity, no window available.");
  }
  
  public final void zzD()
  {
    synchronized (this.zzo)
    {
      this.zzq = true;
      if (this.zzp != null)
      {
        zzs.zza.removeCallbacks(this.zzp);
        zzs.zza.post(this.zzp);
      }
      return;
    }
  }
  
  protected final void zzE()
  {
    if ((this.zzb.isFinishing()) && (!this.zzs))
    {
      this.zzs = true;
      ??? = this.zzd;
      if (??? != null)
      {
        ((zzcfb)???).zzW(this.zzn - 1);
        synchronized (this.zzo)
        {
          if ((!this.zzq) && (this.zzd.zzax()))
          {
            Object localObject2 = zzbbk.zzez;
            if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue()) && (!this.zzt))
            {
              localObject2 = this.zzc;
              if (localObject2 != null)
              {
                localObject2 = ((AdOverlayInfoParcel)localObject2).zzc;
                if (localObject2 != null) {
                  ((zzo)localObject2).zzby();
                }
              }
            }
            localObject2 = new com/google/android/gms/ads/internal/overlay/zze;
            ((zze)localObject2).<init>(this);
            this.zzp = ((Runnable)localObject2);
            zzflv localzzflv = zzs.zza;
            localObject2 = this.zzp;
            zzbbc localzzbbc = zzbbk.zzaU;
            localzzflv.postDelayed((Runnable)localObject2, ((Long)zzba.zzc().zzb(localzzbbc)).longValue());
            return;
          }
        }
      }
      zzc();
    }
  }
  
  public final boolean zzF()
  {
    this.zzn = 1;
    if (this.zzd == null) {
      return true;
    }
    zzbbc localzzbbc = zzbbk.zzir;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (this.zzd.canGoBack()))
    {
      this.zzd.goBack();
      return false;
    }
    boolean bool = this.zzd.zzaC();
    if (!bool) {
      this.zzd.zzd("onbackblocked", Collections.emptyMap());
    }
    return bool;
  }
  
  public final void zzb()
  {
    this.zzn = 3;
    this.zzb.finish();
    AdOverlayInfoParcel localAdOverlayInfoParcel = this.zzc;
    if ((localAdOverlayInfoParcel != null) && (localAdOverlayInfoParcel.zzk == 5)) {
      this.zzb.overridePendingTransition(0, 0);
    }
  }
  
  final void zzc()
  {
    if (this.zzt) {
      return;
    }
    this.zzt = true;
    Object localObject = this.zzd;
    if (localObject != null)
    {
      this.zzl.removeView(((zzcfb)localObject).zzF());
      localObject = this.zze;
      if (localObject != null)
      {
        this.zzd.zzak(((zzh)localObject).zzd);
        this.zzd.zzan(false);
        localObject = this.zze.zzc;
        View localView = this.zzd.zzF();
        zzh localzzh = this.zze;
        ((ViewGroup)localObject).addView(localView, localzzh.zza, localzzh.zzb);
        this.zze = null;
      }
      else if (this.zzb.getApplicationContext() != null)
      {
        this.zzd.zzak(this.zzb.getApplicationContext());
      }
      this.zzd = null;
    }
    localObject = this.zzc;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzc;
      if (localObject != null) {
        ((zzo)localObject).zzf(this.zzn);
      }
    }
    localObject = this.zzc;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzd;
      if (localObject != null) {
        zzI(((zzcfb)localObject).zzQ(), this.zzc.zzd.zzF());
      }
    }
  }
  
  public final void zzd()
  {
    this.zzl.zzb = true;
  }
  
  protected final void zze()
  {
    this.zzd.zzX();
  }
  
  public final void zzf()
  {
    Object localObject = this.zzc;
    if ((localObject != null) && (this.zzg)) {
      zzz(((AdOverlayInfoParcel)localObject).zzj);
    }
    if (this.zzh != null)
    {
      this.zzb.setContentView(this.zzl);
      this.zzr = true;
      this.zzh.removeAllViews();
      this.zzh = null;
    }
    localObject = this.zzi;
    if (localObject != null)
    {
      ((WebChromeClient.CustomViewCallback)localObject).onCustomViewHidden();
      this.zzi = null;
    }
    this.zzg = false;
  }
  
  public final void zzg(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void zzh()
  {
    this.zzn = 1;
  }
  
  public final void zzi()
  {
    this.zzn = 2;
    this.zzb.finish();
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
  {
    zzH((Configuration)ObjectWrapper.unwrap(paramIObjectWrapper));
  }
  
  public void zzk(Bundle paramBundle)
  {
    this.zzb.requestWindowFeature(1);
    boolean bool;
    if ((paramBundle != null) && (paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false))) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzj = bool;
    try
    {
      Object localObject1 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
      this.zzc = ((AdOverlayInfoParcel)localObject1);
      if (localObject1 != null)
      {
        if (((AdOverlayInfoParcel)localObject1).zzm.zzc > 7500000) {
          this.zzn = 4;
        }
        if (this.zzb.getIntent() != null) {
          this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        Object localObject2 = this.zzc;
        localObject1 = ((AdOverlayInfoParcel)localObject2).zzo;
        if (localObject1 != null)
        {
          bool = ((zzj)localObject1).zza;
          this.zzk = bool;
          if (!bool) {
            break label200;
          }
        }
        else
        {
          if (((AdOverlayInfoParcel)localObject2).zzk != 5) {
            break label195;
          }
          this.zzk = true;
        }
        if ((((AdOverlayInfoParcel)localObject2).zzk != 5) && (((zzj)localObject1).zzf != -1))
        {
          localObject1 = new com/google/android/gms/ads/internal/overlay/zzk;
          ((zzk)localObject1).<init>(this, null);
          ((com.google.android.gms.ads.internal.util.zzb)localObject1).zzb();
          break label200;
          label195:
          this.zzk = false;
        }
        label200:
        if (paramBundle == null)
        {
          if (this.zzu)
          {
            paramBundle = this.zzc.zzx;
            if (paramBundle != null) {
              paramBundle.zze();
            }
            paramBundle = this.zzc.zzc;
            if (paramBundle != null) {
              paramBundle.zzb();
            }
          }
          paramBundle = this.zzc;
          if (paramBundle.zzk != 1)
          {
            paramBundle = paramBundle.zzb;
            if (paramBundle != null) {
              paramBundle.onAdClicked();
            }
            paramBundle = this.zzc.zzy;
            if (paramBundle != null) {
              paramBundle.zzr();
            }
          }
        }
        paramBundle = new com/google/android/gms/ads/internal/overlay/zzg;
        localObject2 = this.zzb;
        localObject1 = this.zzc;
        paramBundle.<init>((Context)localObject2, ((AdOverlayInfoParcel)localObject1).zzn, ((AdOverlayInfoParcel)localObject1).zzm.zza, ((AdOverlayInfoParcel)localObject1).zzw);
        this.zzl = paramBundle;
        paramBundle.setId(1000);
        zzt.zzq().zzl(this.zzb);
        localObject1 = this.zzc;
        int i = ((AdOverlayInfoParcel)localObject1).zzk;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5)
              {
                zzC(false);
                return;
              }
              paramBundle = new com/google/android/gms/ads/internal/overlay/zzf;
              paramBundle.<init>("Could not determine ad overlay type.");
              throw paramBundle;
            }
            zzC(true);
            return;
          }
          paramBundle = new com/google/android/gms/ads/internal/overlay/zzh;
          paramBundle.<init>(((AdOverlayInfoParcel)localObject1).zzd);
          this.zze = paramBundle;
          zzC(false);
          return;
        }
        zzC(false);
        return;
      }
      paramBundle = new com/google/android/gms/ads/internal/overlay/zzf;
      paramBundle.<init>("Could not get info for ad overlay.");
      throw paramBundle;
    }
    catch (zzf paramBundle)
    {
      zzbzt.zzj(paramBundle.getMessage());
      this.zzn = 4;
      this.zzb.finish();
    }
  }
  
  public final void zzl()
  {
    zzcfb localzzcfb = this.zzd;
    if (localzzcfb != null) {}
    try
    {
      this.zzl.removeView(localzzcfb.zzF());
      zzE();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;) {}
    }
  }
  
  public final void zzm()
  {
    if (this.zzm)
    {
      this.zzm = false;
      zze();
    }
  }
  
  public final void zzn()
  {
    zzf();
    Object localObject = this.zzc;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzc;
      if (localObject != null) {
        ((zzo)localObject).zzbo();
      }
    }
    localObject = zzbbk.zzeB;
    if ((!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (this.zzd != null) && ((!this.zzb.isFinishing()) || (this.zze == null))) {
      this.zzd.onPause();
    }
    zzE();
  }
  
  public final void zzo(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 12345)
    {
      zzebo localzzebo = zzebp.zzi();
      localzzebo.zza(this.zzb);
      localzzebo.zzb(this);
      localzzebo.zzh(this.zzc.zzu);
      localzzebo.zzd(this.zzc.zzr);
      localzzebo.zzc(this.zzc.zzs);
      localzzebo.zzf(this.zzc.zzt);
      localzzebo.zze(this.zzc.zzq);
      localzzebo.zzg(this.zzc.zzv);
      zzebn.zzh(paramArrayOfString, paramArrayOfInt, localzzebo.zzi());
    }
  }
  
  public final void zzp() {}
  
  public final void zzq()
  {
    Object localObject = this.zzc;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzc;
      if (localObject != null) {
        ((zzo)localObject).zzbF();
      }
    }
    zzH(this.zzb.getResources().getConfiguration());
    localObject = zzbbk.zzeB;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzd;
      if ((localObject != null) && (!((zzcfb)localObject).zzaz()))
      {
        this.zzd.onResume();
        return;
      }
      zzbzt.zzj("The webview does not exist. Ignoring action.");
    }
  }
  
  public final void zzr(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
  }
  
  public final void zzs()
  {
    Object localObject = zzbbk.zzeB;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzd;
      if ((localObject != null) && (!((zzcfb)localObject).zzaz()))
      {
        this.zzd.onResume();
        return;
      }
      zzbzt.zzj("The webview does not exist. Ignoring action.");
    }
  }
  
  public final void zzt()
  {
    zzbbc localzzbbc = zzbbk.zzeB;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (this.zzd != null) && ((!this.zzb.isFinishing()) || (this.zze == null))) {
      this.zzd.onPause();
    }
    zzE();
  }
  
  public final void zzu()
  {
    Object localObject = this.zzc;
    if (localObject != null)
    {
      localObject = ((AdOverlayInfoParcel)localObject).zzc;
      if (localObject != null) {
        ((zzo)localObject).zze();
      }
    }
  }
  
  public final void zzv(boolean paramBoolean)
  {
    Object localObject = zzbbk.zzeD;
    int i = ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue();
    localObject = zzbbk.zzaX;
    boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    int m = 0;
    int j;
    if ((!bool) && (!paramBoolean)) {
      j = 0;
    } else {
      j = 1;
    }
    localObject = new zzq();
    ((zzq)localObject).zzd = 50;
    if (1 != j) {
      k = 0;
    } else {
      k = i;
    }
    ((zzq)localObject).zza = k;
    int k = m;
    if (1 != j) {
      k = i;
    }
    ((zzq)localObject).zzb = k;
    ((zzq)localObject).zzc = i;
    this.zzf = new zzr(this.zzb, (zzq)localObject, this);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(10);
    if (1 != j) {
      i = 9;
    } else {
      i = 11;
    }
    ((RelativeLayout.LayoutParams)localObject).addRule(i);
    zzx(paramBoolean, this.zzc.zzg);
    this.zzl.addView(this.zzf, (ViewGroup.LayoutParams)localObject);
  }
  
  public final void zzw()
  {
    this.zzr = true;
  }
  
  public final void zzx(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = zzbbk.zzaV;
    boolean bool2 = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    boolean bool1 = true;
    if (bool2)
    {
      localObject = this.zzc;
      if (localObject != null)
      {
        localObject = ((AdOverlayInfoParcel)localObject).zzo;
        if ((localObject != null) && (((zzj)localObject).zzh))
        {
          i = 1;
          break label67;
        }
      }
    }
    int i = 0;
    label67:
    localObject = zzbbk.zzaW;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzc;
      if (localObject != null)
      {
        localObject = ((AdOverlayInfoParcel)localObject).zzo;
        if ((localObject != null) && (((zzj)localObject).zzi))
        {
          j = 1;
          break label129;
        }
      }
    }
    int j = 0;
    label129:
    if ((paramBoolean1) && (paramBoolean2) && (i != 0) && (j == 0)) {
      new zzbqy(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
    }
    localObject = this.zzf;
    if (localObject != null)
    {
      paramBoolean1 = bool1;
      if (j == 0) {
        if ((paramBoolean2) && (i == 0)) {
          paramBoolean1 = bool1;
        } else {
          paramBoolean1 = false;
        }
      }
      ((zzr)localObject).zzb(paramBoolean1);
    }
  }
  
  public final void zzy()
  {
    this.zzl.removeView(this.zzf);
    zzv(true);
  }
  
  public final void zzz(int paramInt)
  {
    int i = this.zzb.getApplicationInfo().targetSdkVersion;
    zzbbc localzzbbc = zzbbk.zzfJ;
    if (i >= ((Integer)zzba.zzc().zzb(localzzbbc)).intValue())
    {
      i = this.zzb.getApplicationInfo().targetSdkVersion;
      localzzbbc = zzbbk.zzfK;
      if (i <= ((Integer)zzba.zzc().zzb(localzzbbc)).intValue())
      {
        i = Build.VERSION.SDK_INT;
        localzzbbc = zzbbk.zzfL;
        if (i >= ((Integer)zzba.zzc().zzb(localzzbbc)).intValue())
        {
          i = Build.VERSION.SDK_INT;
          localzzbbc = zzbbk.zzfM;
          if (i <= ((Integer)zzba.zzc().zzb(localzzbbc)).intValue()) {
            return;
          }
        }
      }
    }
    try
    {
      this.zzb.setRequestedOrientation(paramInt);
      return;
    }
    finally
    {
      zzt.zzo().zzt(localThrowable, "AdOverlay.setRequestedOrientation");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */