package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbsm
{
  private static zzbyk zza;
  private final Context zzb;
  private final AdFormat zzc;
  private final zzdx zzd;
  
  public zzbsm(Context paramContext, AdFormat paramAdFormat, zzdx paramzzdx)
  {
    this.zzb = paramContext;
    this.zzc = paramAdFormat;
    this.zzd = paramzzdx;
  }
  
  public static zzbyk zza(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        zzaw localzzaw = zzay.zza();
        zzbnv localzzbnv = new com/google/android/gms/internal/ads/zzbnv;
        localzzbnv.<init>();
        zza = localzzaw.zzr(paramContext, localzzbnv);
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public final void zzb(QueryInfoGenerationCallback paramQueryInfoGenerationCallback)
  {
    zzbyk localzzbyk = zza(this.zzb);
    if (localzzbyk == null)
    {
      paramQueryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
      return;
    }
    IObjectWrapper localIObjectWrapper = ObjectWrapper.wrap(this.zzb);
    Object localObject = this.zzd;
    if (localObject == null) {
      localObject = new zzm().zza();
    } else {
      localObject = zzp.zza.zza(this.zzb, (zzdx)localObject);
    }
    zzbyo localzzbyo = new zzbyo(null, this.zzc.name(), null, (zzl)localObject);
    try
    {
      localObject = new com/google/android/gms/internal/ads/zzbsl;
      ((zzbsl)localObject).<init>(this, paramQueryInfoGenerationCallback);
      localzzbyk.zze(localIObjectWrapper, localzzbyo, (zzbyh)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramQueryInfoGenerationCallback.onFailure("Internal Error.");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */