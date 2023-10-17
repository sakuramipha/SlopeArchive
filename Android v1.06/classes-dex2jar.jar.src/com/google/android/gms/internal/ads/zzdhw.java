package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdhw
  extends zzbez
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdiy
{
  private final WeakReference zza;
  private final Map zzb = new HashMap();
  private final Map zzc = new HashMap();
  private final Map zzd = new HashMap();
  private zzdgx zze;
  private zzatz zzf;
  
  public zzdhw(View paramView, HashMap paramHashMap1, HashMap paramHashMap2)
  {
    paramView.setOnTouchListener(this);
    paramView.setOnClickListener(this);
    zzt.zzx();
    zzcat.zza(paramView, this);
    zzt.zzx();
    zzcat.zzb(paramView, this);
    this.zza = new WeakReference(paramView);
    Object localObject1 = paramHashMap1.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      paramHashMap1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (View)((Map.Entry)localObject2).getValue();
      if (localObject2 != null)
      {
        this.zzb.put(paramHashMap1, new WeakReference(localObject2));
        if ((!"1098".equals(paramHashMap1)) && (!"3011".equals(paramHashMap1)))
        {
          ((View)localObject2).setOnTouchListener(this);
          ((View)localObject2).setClickable(true);
          ((View)localObject2).setOnClickListener(this);
        }
      }
    }
    this.zzd.putAll(this.zzb);
    paramHashMap1 = paramHashMap2.entrySet().iterator();
    while (paramHashMap1.hasNext())
    {
      paramHashMap2 = (Map.Entry)paramHashMap1.next();
      localObject1 = (View)paramHashMap2.getValue();
      if (localObject1 != null)
      {
        this.zzc.put((String)paramHashMap2.getKey(), new WeakReference(localObject1));
        ((View)localObject1).setOnTouchListener(this);
        ((View)localObject1).setClickable(false);
      }
    }
    this.zzd.putAll(this.zzc);
    this.zzf = new zzatz(paramView.getContext(), paramView);
  }
  
  public final void onClick(View paramView)
  {
    try
    {
      zzdgx localzzdgx = this.zze;
      if (localzzdgx != null)
      {
        localzzdgx.zzC(paramView, zzf(), zzl(), zzm(), true);
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
      zzdgx localzzdgx = this.zze;
      if (localzzdgx != null)
      {
        localzzdgx.zzA(zzf(), zzl(), zzm(), zzdgx.zzW(zzf()));
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
      zzdgx localzzdgx = this.zze;
      if (localzzdgx != null)
      {
        localzzdgx.zzA(zzf(), zzl(), zzm(), zzdgx.zzW(zzf()));
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
      zzdgx localzzdgx = this.zze;
      if (localzzdgx != null) {
        localzzdgx.zzJ(paramView, paramMotionEvent, zzf());
      }
      return false;
    }
    finally {}
  }
  
  public final void zzb(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      if (this.zze != null)
      {
        paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
        if (!(paramIObjectWrapper instanceof View)) {
          zzbzt.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
        }
        this.zze.zzL((View)paramIObjectWrapper);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzc(IObjectWrapper paramIObjectWrapper)
  {
    try
    {
      Object localObject = ObjectWrapper.unwrap(paramIObjectWrapper);
      if (!(localObject instanceof zzdgx))
      {
        zzbzt.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
        return;
      }
      paramIObjectWrapper = this.zze;
      if (paramIObjectWrapper != null) {
        paramIObjectWrapper.zzR(this);
      }
      paramIObjectWrapper = (zzdgx)localObject;
      if (paramIObjectWrapper.zzS())
      {
        this.zze = paramIObjectWrapper;
        paramIObjectWrapper.zzQ(this);
        this.zze.zzI(zzf());
        return;
      }
      zzbzt.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
      return;
    }
    finally {}
  }
  
  public final void zzd()
  {
    try
    {
      zzdgx localzzdgx = this.zze;
      if (localzzdgx != null)
      {
        localzzdgx.zzR(this);
        this.zze = null;
        return;
      }
      return;
    }
    finally {}
  }
  
  public final View zzf()
  {
    return (View)this.zza.get();
  }
  
  public final View zzg(String paramString)
  {
    try
    {
      paramString = (WeakReference)this.zzd.get(paramString);
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
    return null;
  }
  
  public final zzatz zzi()
  {
    return this.zzf;
  }
  
  public final IObjectWrapper zzj()
  {
    return null;
  }
  
  public final String zzk()
  {
    return "1007";
  }
  
  public final Map zzl()
  {
    try
    {
      Map localMap = this.zzd;
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
      Map localMap = this.zzb;
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
  
  public final JSONObject zzo()
  {
    return null;
  }
  
  public final JSONObject zzp()
  {
    try
    {
      Object localObject1 = this.zze;
      if (localObject1 != null)
      {
        localObject1 = ((zzdgx)localObject1).zzk(zzf(), zzl(), zzm());
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
      Object localObject2 = this.zzd;
      Object localObject1 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject1).<init>(paramView);
      ((Map)localObject2).put(paramString, localObject1);
      if ((!"1098".equals(paramString)) && (!"3011".equals(paramString)))
      {
        localObject1 = this.zzb;
        localObject2 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject2).<init>(paramView);
        ((Map)localObject1).put(paramString, localObject2);
        paramView.setClickable(true);
        paramView.setOnClickListener(this);
        paramView.setOnTouchListener(this);
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */