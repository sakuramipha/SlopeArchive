package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

public final class zzbss
{
  @Nonnull
  private final View zza;
  private final Map zzb;
  private final zzbyk zzc;
  
  public zzbss(zzbsr paramzzbsr)
  {
    View localView = zzbsr.zza(paramzzbsr);
    this.zza = localView;
    Map localMap = zzbsr.zzd(paramzzbsr);
    this.zzb = localMap;
    paramzzbsr = zzbsm.zza(zzbsr.zza(paramzzbsr).getContext());
    this.zzc = paramzzbsr;
    if ((paramzzbsr != null) && (!localMap.isEmpty())) {
      try
      {
        zzbst localzzbst = new com/google/android/gms/internal/ads/zzbst;
        localzzbst.<init>(ObjectWrapper.wrap(localView).asBinder(), ObjectWrapper.wrap(localMap).asBinder());
        paramzzbsr.zzf(localzzbst);
        return;
      }
      catch (RemoteException paramzzbsr)
      {
        zzbzt.zzg("Failed to call remote method.");
      }
    }
  }
  
  public final void zza(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      if (this.zzc == null) {
        zzbzt.zzj("Failed to get internal reporting info generator in recordClick.");
      }
      try
      {
        zzbyk localzzbyk = this.zzc;
        IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zza);
        zzbsq localzzbsq = new com/google/android/gms/internal/ads/zzbsq;
        localzzbsq.<init>(this, paramList);
        localzzbyk.zzg(paramList, localIObjectWrapper, localzzbsq);
        return;
      }
      catch (RemoteException paramList)
      {
        zzbzt.zzg("RemoteException recording click: ".concat(paramList.toString()));
        return;
      }
    }
    zzbzt.zzj("No click urls were passed to recordClick");
  }
  
  public final void zzb(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      zzbyk localzzbyk = this.zzc;
      if (localzzbyk != null) {
        try
        {
          IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zza);
          zzbsp localzzbsp = new com/google/android/gms/internal/ads/zzbsp;
          localzzbsp.<init>(this, paramList);
          localzzbyk.zzh(paramList, localIObjectWrapper, localzzbsp);
          return;
        }
        catch (RemoteException paramList)
        {
          zzbzt.zzg("RemoteException recording impression urls: ".concat(paramList.toString()));
          return;
        }
      }
      zzbzt.zzj("Failed to get internal reporting info generator from recordImpression.");
      return;
    }
    zzbzt.zzj("No impression urls were passed to recordImpression");
  }
  
  public final void zzc(MotionEvent paramMotionEvent)
  {
    zzbyk localzzbyk = this.zzc;
    if (localzzbyk != null) {
      try
      {
        localzzbyk.zzj(ObjectWrapper.wrap(paramMotionEvent));
        return;
      }
      catch (RemoteException paramMotionEvent)
      {
        zzbzt.zzg("Failed to call remote method.");
        return;
      }
    }
    zzbzt.zze("Failed to get internal reporting info generator.");
  }
  
  public final void zzd(Uri paramUri, UpdateClickUrlCallback paramUpdateClickUrlCallback)
  {
    if (this.zzc == null) {
      paramUpdateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
    }
    try
    {
      zzbyk localzzbyk = this.zzc;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(Arrays.asList(new Uri[] { paramUri }));
      paramUri = ObjectWrapper.wrap(this.zza);
      zzbso localzzbso = new com/google/android/gms/internal/ads/zzbso;
      localzzbso.<init>(this, paramUpdateClickUrlCallback);
      localzzbyk.zzk(localArrayList, paramUri, localzzbso);
      return;
    }
    catch (RemoteException paramUri)
    {
      paramUpdateClickUrlCallback.onFailure("Internal error: ".concat(paramUri.toString()));
    }
  }
  
  public final void zze(List paramList, UpdateImpressionUrlsCallback paramUpdateImpressionUrlsCallback)
  {
    if (this.zzc == null) {
      paramUpdateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
    }
    try
    {
      zzbyk localzzbyk = this.zzc;
      IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zza);
      zzbsn localzzbsn = new com/google/android/gms/internal/ads/zzbsn;
      localzzbsn.<init>(this, paramUpdateImpressionUrlsCallback);
      localzzbyk.zzl(paramList, localIObjectWrapper, localzzbsn);
      return;
    }
    catch (RemoteException paramList)
    {
      paramUpdateImpressionUrlsCallback.onFailure("Internal error: ".concat(paramList.toString()));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */