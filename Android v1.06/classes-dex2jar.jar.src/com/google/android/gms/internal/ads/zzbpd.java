package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class zzbpd
  extends zzbom
{
  private final UnifiedNativeAdMapper zza;
  
  public zzbpd(UnifiedNativeAdMapper paramUnifiedNativeAdMapper)
  {
    this.zza = paramUnifiedNativeAdMapper;
  }
  
  public final boolean zzA()
  {
    return this.zza.getOverrideClickHandling();
  }
  
  public final boolean zzB()
  {
    return this.zza.getOverrideImpressionRecording();
  }
  
  public final double zze()
  {
    if (this.zza.getStarRating() != null) {
      return this.zza.getStarRating().doubleValue();
    }
    return -1.0D;
  }
  
  public final float zzf()
  {
    return this.zza.getMediaContentAspectRatio();
  }
  
  public final float zzg()
  {
    return this.zza.getCurrentTime();
  }
  
  public final float zzh()
  {
    return this.zza.getDuration();
  }
  
  public final Bundle zzi()
  {
    return this.zza.getExtras();
  }
  
  public final zzdq zzj()
  {
    if (this.zza.zzb() != null) {
      return this.zza.zzb().zza();
    }
    return null;
  }
  
  public final zzbei zzk()
  {
    return null;
  }
  
  public final zzbeq zzl()
  {
    NativeAd.Image localImage = this.zza.getIcon();
    if (localImage != null) {
      return new zzbec(localImage.getDrawable(), localImage.getUri(), localImage.getScale(), localImage.zzb(), localImage.zza());
    }
    return null;
  }
  
  public final IObjectWrapper zzm()
  {
    View localView = this.zza.getAdChoicesContent();
    if (localView == null) {
      return null;
    }
    return ObjectWrapper.wrap(localView);
  }
  
  public final IObjectWrapper zzn()
  {
    View localView = this.zza.zza();
    if (localView == null) {
      return null;
    }
    return ObjectWrapper.wrap(localView);
  }
  
  public final IObjectWrapper zzo()
  {
    Object localObject = this.zza.zzc();
    if (localObject == null) {
      return null;
    }
    return ObjectWrapper.wrap(localObject);
  }
  
  public final String zzp()
  {
    return this.zza.getAdvertiser();
  }
  
  public final String zzq()
  {
    return this.zza.getBody();
  }
  
  public final String zzr()
  {
    return this.zza.getCallToAction();
  }
  
  public final String zzs()
  {
    return this.zza.getHeadline();
  }
  
  public final String zzt()
  {
    return this.zza.getPrice();
  }
  
  public final String zzu()
  {
    return this.zza.getStore();
  }
  
  public final List zzv()
  {
    Object localObject = this.zza.getImages();
    ArrayList localArrayList = new ArrayList();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        NativeAd.Image localImage = (NativeAd.Image)((Iterator)localObject).next();
        localArrayList.add(new zzbec(localImage.getDrawable(), localImage.getUri(), localImage.getScale(), localImage.zzb(), localImage.zza()));
      }
    }
    return localArrayList;
  }
  
  public final void zzw(IObjectWrapper paramIObjectWrapper)
  {
    this.zza.handleClick((View)ObjectWrapper.unwrap(paramIObjectWrapper));
  }
  
  public final void zzx()
  {
    this.zza.recordImpression();
  }
  
  public final void zzy(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
  {
    paramIObjectWrapper2 = (HashMap)ObjectWrapper.unwrap(paramIObjectWrapper2);
    paramIObjectWrapper3 = (HashMap)ObjectWrapper.unwrap(paramIObjectWrapper3);
    this.zza.trackViews((View)ObjectWrapper.unwrap(paramIObjectWrapper1), paramIObjectWrapper2, paramIObjectWrapper3);
  }
  
  public final void zzz(IObjectWrapper paramIObjectWrapper)
  {
    this.zza.untrackView((View)ObjectWrapper.unwrap(paramIObjectWrapper));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */