package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;

public final class zzdiw
{
  private final zzdnk zza;
  private final zzdlz zzb;
  private ViewTreeObserver.OnScrollChangedListener zzc;
  
  public zzdiw(zzdnk paramzzdnk, zzdlz paramzzdlz)
  {
    this.zza = paramzzdnk;
    this.zzb = paramzzdlz;
    this.zzc = null;
  }
  
  private static final int zzf(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      paramInt = i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    zzay.zzb();
    return zzbzm.zzx(paramContext, paramInt);
  }
  
  public final View zza(View paramView, WindowManager paramWindowManager)
    throws zzcfm
  {
    zzcfb localzzcfb = this.zza.zza(zzq.zzc(), null, null);
    View localView = (View)localzzcfb;
    localView.setVisibility(4);
    localView.setContentDescription("policy_validator");
    localzzcfb.zzad("/sendMessageToSdk", new zzdis(this));
    localzzcfb.zzad("/hideValidatorOverlay", new zzdit(this, paramWindowManager, paramView));
    localzzcfb.zzad("/open", new zzbis(null, null, null, null, null));
    this.zzb.zzj(new WeakReference(localzzcfb), "/loadNativeAdPolicyViolations", new zzdiu(this, paramView, paramWindowManager));
    this.zzb.zzj(new WeakReference(localzzcfb), "/showValidatorOverlay", zzdiv.zza);
    return localView;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */