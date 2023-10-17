package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

public final class zzbqs
  extends zzbqy
{
  static final Set zza = CollectionUtils.setOf(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  private String zzb = "top-right";
  private boolean zzc = true;
  private int zzd = 0;
  private int zze = 0;
  private int zzf = -1;
  private int zzg = 0;
  private int zzh = 0;
  private int zzi = -1;
  private final Object zzj = new Object();
  private final zzcfb zzk;
  private final Activity zzl;
  private zzcgq zzm;
  private ImageView zzn;
  private LinearLayout zzo;
  private final zzbqz zzp;
  private PopupWindow zzq;
  private RelativeLayout zzr;
  private ViewGroup zzs;
  
  public zzbqs(zzcfb paramzzcfb, zzbqz paramzzbqz)
  {
    super(paramzzcfb, "resize");
    this.zzk = paramzzcfb;
    this.zzl = paramzzcfb.zzi();
    this.zzp = paramzzbqz;
  }
  
  public final void zza(boolean paramBoolean)
  {
    synchronized (this.zzj)
    {
      Object localObject2 = this.zzq;
      if (localObject2 != null)
      {
        ((PopupWindow)localObject2).dismiss();
        this.zzr.removeView((View)this.zzk);
        localObject2 = this.zzs;
        if (localObject2 != null)
        {
          ((ViewGroup)localObject2).removeView(this.zzn);
          this.zzs.addView((View)this.zzk);
          this.zzk.zzag(this.zzm);
        }
        if (paramBoolean)
        {
          zzk("default");
          localObject2 = this.zzp;
          if (localObject2 != null) {
            ((zzbqz)localObject2).zzb();
          }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
      }
      return;
    }
  }
  
  public final void zzb(Map paramMap)
  {
    synchronized (this.zzj)
    {
      if (this.zzl == null)
      {
        zzg("Not an activity context. Cannot resize.");
        return;
      }
      if (this.zzk.zzO() == null)
      {
        zzg("Webview is not yet available, size is not set.");
        return;
      }
      if (this.zzk.zzO().zzi())
      {
        zzg("Is interstitial. Cannot resize an interstitial.");
        return;
      }
      if (!this.zzk.zzaA())
      {
        if (!TextUtils.isEmpty((CharSequence)paramMap.get("width")))
        {
          zzt.zzp();
          this.zzi = zzs.zzK((String)paramMap.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)paramMap.get("height")))
        {
          zzt.zzp();
          this.zzf = zzs.zzK((String)paramMap.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX")))
        {
          zzt.zzp();
          this.zzg = zzs.zzK((String)paramMap.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY")))
        {
          zzt.zzp();
          this.zzh = zzs.zzK((String)paramMap.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen"))) {
          this.zzc = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
        }
        paramMap = (String)paramMap.get("customClosePosition");
        if (!TextUtils.isEmpty(paramMap)) {
          this.zzb = paramMap;
        }
        if ((this.zzi >= 0) && (this.zzf >= 0))
        {
          Object localObject2 = this.zzl.getWindow();
          if ((localObject2 != null) && (((Window)localObject2).getDecorView() != null))
          {
            zzt.zzp();
            Object localObject3 = zzs.zzR(this.zzl);
            zzt.zzp();
            paramMap = zzs.zzN(this.zzl);
            int k = localObject3[0];
            int i = localObject3[1];
            int j = this.zzi;
            int m;
            if ((j >= 50) && (j <= k))
            {
              m = this.zzf;
              if ((m >= 50) && (m <= i))
              {
                if ((m == i) && (j == k))
                {
                  zzbzt.zzj("Cannot resize to a full-screen ad.");
                }
                else
                {
                  int n;
                  if (this.zzc)
                  {
                    localObject3 = this.zzb;
                    i = ((String)localObject3).hashCode();
                    switch (i)
                    {
                    default: 
                      break;
                    case 1755462605: 
                      if (((String)localObject3).equals("top-center")) {
                        i = 1;
                      }
                      break;
                    case 1288627767: 
                      if (((String)localObject3).equals("bottom-center")) {
                        i = 4;
                      }
                      break;
                    case 1163912186: 
                      if (((String)localObject3).equals("bottom-right")) {
                        i = 5;
                      }
                      break;
                    case -655373719: 
                      if (((String)localObject3).equals("bottom-left")) {
                        i = 3;
                      }
                      break;
                    case -1012429441: 
                      if (((String)localObject3).equals("top-left")) {
                        i = 0;
                      }
                      break;
                    case -1364013995: 
                      if (((String)localObject3).equals("center")) {
                        i = 2;
                      }
                      break;
                    }
                    i = -1;
                    if (i != 0) {
                      if (i != 1)
                      {
                        if (i != 2)
                        {
                          if (i != 3) {
                            if (i != 4)
                            {
                              if (i != 5)
                              {
                                i = this.zzd + this.zzg + j - 50;
                                j = this.zze;
                                break label809;
                              }
                              i = this.zzd + this.zzg + j - 50;
                              j = this.zze;
                            }
                            else
                            {
                              i = this.zzd + this.zzg + (j >> 1) - 25;
                            }
                          }
                          for (j = this.zze;; j = this.zze)
                          {
                            n = this.zzh;
                            break;
                            i = this.zzd + this.zzg;
                          }
                          j = j + n + m - 50;
                          break label841;
                        }
                        else
                        {
                          i = this.zzd + this.zzg + (j >> 1) - 25;
                          j = this.zze + this.zzh + (m >> 1) - 25;
                          break label841;
                        }
                      }
                      else {
                        i = this.zzd + this.zzg + (j >> 1) - 25;
                      }
                    }
                    for (j = this.zze;; j = this.zze)
                    {
                      label809:
                      m = this.zzh;
                      break;
                      i = this.zzd + this.zzg;
                    }
                    j += m;
                    label841:
                    if ((i >= 0) && (i + 50 <= k) && (j >= paramMap[0]) && (j + 50 <= paramMap[1]))
                    {
                      paramMap = new int[2];
                      paramMap[0] = (this.zzd + this.zzg);
                      paramMap[1] = (this.zze + this.zzh);
                      break label1063;
                    }
                  }
                  else
                  {
                    zzt.zzp();
                    paramMap = zzs.zzR(this.zzl);
                    zzt.zzp();
                    localObject3 = zzs.zzN(this.zzl);
                    n = paramMap[0];
                    j = this.zzd + this.zzg;
                    k = this.zze + this.zzh;
                    if (j < 0)
                    {
                      i = 0;
                    }
                    else
                    {
                      m = this.zzi;
                      i = j;
                      if (j + m > n) {
                        i = n - m;
                      }
                    }
                    j = localObject3[0];
                    if (k >= j)
                    {
                      m = this.zzf;
                      n = localObject3[1];
                      j = k;
                      if (k + m > n) {
                        j = n - m;
                      }
                    }
                    paramMap = new int[2];
                    paramMap[0] = i;
                    paramMap[1] = j;
                    break label1063;
                  }
                }
              }
              else {
                zzbzt.zzj("Height is too small or too large.");
              }
            }
            else
            {
              zzbzt.zzj("Width is too small or too large.");
            }
            paramMap = null;
            label1063:
            if (paramMap == null)
            {
              zzg("Resize location out of screen or close button is not visible.");
              return;
            }
            zzay.zzb();
            k = zzbzm.zzx(this.zzl, this.zzi);
            zzay.zzb();
            j = zzbzm.zzx(this.zzl, this.zzf);
            localObject3 = ((View)this.zzk).getParent();
            if ((localObject3 != null) && ((localObject3 instanceof ViewGroup)))
            {
              localObject3 = (ViewGroup)localObject3;
              ((ViewGroup)localObject3).removeView((View)this.zzk);
              Object localObject4 = this.zzq;
              if (localObject4 == null)
              {
                this.zzs = ((ViewGroup)localObject3);
                zzt.zzp();
                localObject4 = this.zzk;
                ((View)localObject4).setDrawingCacheEnabled(true);
                localObject3 = Bitmap.createBitmap(((View)localObject4).getDrawingCache());
                ((View)localObject4).setDrawingCacheEnabled(false);
                localObject4 = new android/widget/ImageView;
                ((ImageView)localObject4).<init>(this.zzl);
                this.zzn = ((ImageView)localObject4);
                ((ImageView)localObject4).setImageBitmap((Bitmap)localObject3);
                this.zzm = this.zzk.zzO();
                this.zzs.addView(this.zzn);
              }
              else
              {
                ((PopupWindow)localObject4).dismiss();
              }
              localObject3 = new android/widget/RelativeLayout;
              ((RelativeLayout)localObject3).<init>(this.zzl);
              this.zzr = ((RelativeLayout)localObject3);
              ((RelativeLayout)localObject3).setBackgroundColor(0);
              localObject4 = this.zzr;
              localObject3 = new android/view/ViewGroup$LayoutParams;
              ((ViewGroup.LayoutParams)localObject3).<init>(k, j);
              ((RelativeLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject3);
              zzt.zzp();
              localObject3 = this.zzr;
              localObject4 = new android/widget/PopupWindow;
              ((PopupWindow)localObject4).<init>((View)localObject3, k, j, false);
              this.zzq = ((PopupWindow)localObject4);
              ((PopupWindow)localObject4).setOutsideTouchable(false);
              this.zzq.setTouchable(true);
              this.zzq.setClippingEnabled(this.zzc ^ true);
              this.zzr.addView((View)this.zzk, -1, -1);
              localObject3 = new android/widget/LinearLayout;
              ((LinearLayout)localObject3).<init>(this.zzl);
              this.zzo = ((LinearLayout)localObject3);
              localObject3 = new android/widget/RelativeLayout$LayoutParams;
              zzay.zzb();
              i = zzbzm.zzx(this.zzl, 50);
              zzay.zzb();
              ((RelativeLayout.LayoutParams)localObject3).<init>(i, zzbzm.zzx(this.zzl, 50));
              localObject4 = this.zzb;
              i = ((String)localObject4).hashCode();
              switch (i)
              {
              default: 
                break;
              case 1755462605: 
                if (((String)localObject4).equals("top-center")) {
                  i = 1;
                }
                break;
              case 1288627767: 
                if (((String)localObject4).equals("bottom-center")) {
                  i = 4;
                }
                break;
              case 1163912186: 
                if (((String)localObject4).equals("bottom-right")) {
                  i = 5;
                }
                break;
              case -655373719: 
                if (((String)localObject4).equals("bottom-left")) {
                  i = 3;
                }
                break;
              case -1012429441: 
                if (((String)localObject4).equals("top-left")) {
                  i = 0;
                }
                break;
              case -1364013995: 
                if (((String)localObject4).equals("center")) {
                  i = 2;
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
                        if (i != 5)
                        {
                          ((RelativeLayout.LayoutParams)localObject3).addRule(10);
                          ((RelativeLayout.LayoutParams)localObject3).addRule(11);
                        }
                        else
                        {
                          ((RelativeLayout.LayoutParams)localObject3).addRule(12);
                          ((RelativeLayout.LayoutParams)localObject3).addRule(11);
                        }
                      }
                      else
                      {
                        ((RelativeLayout.LayoutParams)localObject3).addRule(12);
                        ((RelativeLayout.LayoutParams)localObject3).addRule(14);
                      }
                    }
                    else
                    {
                      ((RelativeLayout.LayoutParams)localObject3).addRule(12);
                      ((RelativeLayout.LayoutParams)localObject3).addRule(9);
                    }
                  }
                  else {
                    ((RelativeLayout.LayoutParams)localObject3).addRule(13);
                  }
                }
                else
                {
                  ((RelativeLayout.LayoutParams)localObject3).addRule(10);
                  ((RelativeLayout.LayoutParams)localObject3).addRule(14);
                }
              }
              else
              {
                ((RelativeLayout.LayoutParams)localObject3).addRule(10);
                ((RelativeLayout.LayoutParams)localObject3).addRule(9);
              }
              LinearLayout localLinearLayout = this.zzo;
              localObject4 = new com/google/android/gms/internal/ads/zzbqr;
              ((zzbqr)localObject4).<init>(this);
              localLinearLayout.setOnClickListener((View.OnClickListener)localObject4);
              this.zzo.setContentDescription("Close button");
              this.zzr.addView(this.zzo, (ViewGroup.LayoutParams)localObject3);
              try
              {
                localObject3 = this.zzq;
                localObject2 = ((Window)localObject2).getDecorView();
                zzay.zzb();
                i = zzbzm.zzx(this.zzl, paramMap[0]);
                zzay.zzb();
                ((PopupWindow)localObject3).showAtLocation((View)localObject2, 0, i, zzbzm.zzx(this.zzl, paramMap[1]));
                i = paramMap[0];
                m = paramMap[1];
                localObject2 = this.zzp;
                if (localObject2 != null) {
                  ((zzbqz)localObject2).zza(i, m, this.zzi, this.zzf);
                }
                this.zzk.zzag(zzcgq.zzb(k, j));
                i = paramMap[0];
                j = paramMap[1];
                zzt.zzp();
                zzj(i, j - zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                zzk("resized");
                return;
              }
              catch (RuntimeException paramMap)
              {
                localObject2 = paramMap.getMessage();
                paramMap = new java/lang/StringBuilder;
                paramMap.<init>();
                paramMap.append("Cannot show popup window: ");
                paramMap.append((String)localObject2);
                zzg(paramMap.toString());
                this.zzr.removeView((View)this.zzk);
                paramMap = this.zzs;
                if (paramMap != null)
                {
                  paramMap.removeView(this.zzn);
                  this.zzs.addView((View)this.zzk);
                  this.zzk.zzag(this.zzm);
                }
                return;
              }
            }
            zzg("Webview is detached, probably in the middle of a resize or expand.");
            return;
          }
          zzg("Activity context is not ready, cannot get window or decor view.");
          return;
        }
        zzg("Invalid width and height options. Cannot resize.");
        return;
      }
      zzg("Cannot resize an expanded banner.");
      return;
    }
  }
  
  public final void zzc(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.zzj)
    {
      this.zzd = paramInt1;
      this.zze = paramInt2;
      return;
    }
  }
  
  public final void zzd(int paramInt1, int paramInt2)
  {
    this.zzd = paramInt1;
    this.zze = paramInt2;
  }
  
  public final boolean zze()
  {
    synchronized (this.zzj)
    {
      boolean bool;
      if (this.zzq != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */