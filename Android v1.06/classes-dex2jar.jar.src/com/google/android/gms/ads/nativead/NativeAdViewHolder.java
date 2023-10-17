package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class NativeAdViewHolder
{
  public static final WeakHashMap zza = new WeakHashMap();
  @NotOnlyInitialized
  private zzbfa zzb;
  private WeakReference zzc;
  
  public NativeAdViewHolder(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2)
  {
    Preconditions.checkNotNull(paramView, "ContainerView must not be null");
    if ((paramView instanceof NativeAdView))
    {
      zzbzt.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
      return;
    }
    WeakHashMap localWeakHashMap = zza;
    if (localWeakHashMap.get(paramView) != null)
    {
      zzbzt.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
      return;
    }
    localWeakHashMap.put(paramView, this);
    this.zzc = new WeakReference(paramView);
    paramMap1 = zza(paramMap1);
    paramMap2 = zza(paramMap2);
    this.zzb = zzay.zza().zzi(paramView, paramMap1, paramMap2);
  }
  
  private static final HashMap zza(Map paramMap)
  {
    if (paramMap == null) {
      return new HashMap();
    }
    return new HashMap(paramMap);
  }
  
  public final void setClickConfirmingView(View paramView)
  {
    try
    {
      this.zzb.zzb(ObjectWrapper.wrap(paramView));
      return;
    }
    catch (RemoteException paramView)
    {
      zzbzt.zzh("Unable to call setClickConfirmingView on delegate", paramView);
    }
  }
  
  public void setNativeAd(NativeAd paramNativeAd)
  {
    Object localObject = paramNativeAd.zza();
    paramNativeAd = this.zzc;
    if (paramNativeAd != null) {
      paramNativeAd = (View)paramNativeAd.get();
    } else {
      paramNativeAd = null;
    }
    if (paramNativeAd == null)
    {
      zzbzt.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
      return;
    }
    WeakHashMap localWeakHashMap = zza;
    if (!localWeakHashMap.containsKey(paramNativeAd)) {
      localWeakHashMap.put(paramNativeAd, this);
    }
    paramNativeAd = this.zzb;
    if (paramNativeAd != null) {
      try
      {
        paramNativeAd.zzc((IObjectWrapper)localObject);
        return;
      }
      catch (RemoteException paramNativeAd)
      {
        zzbzt.zzh("Unable to call setNativeAd on delegate", paramNativeAd);
      }
    }
  }
  
  public void unregisterNativeAd()
  {
    zzbfa localzzbfa = this.zzb;
    if (localzzbfa != null) {
      try
      {
        localzzbfa.zzd();
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzh("Unable to call unregisterNativeAd on delegate", localRemoteException);
      }
    }
    Object localObject = this.zzc;
    if (localObject != null) {
      localObject = (View)((WeakReference)localObject).get();
    } else {
      localObject = null;
    }
    if (localObject != null) {
      zza.remove(localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\NativeAdViewHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */