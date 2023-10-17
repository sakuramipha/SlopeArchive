package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzbpc
  implements NativeMediationAdRequest
{
  private final Date zza;
  private final int zzb;
  private final Set zzc;
  private final boolean zzd;
  private final Location zze;
  private final int zzf;
  private final zzbee zzg;
  private final List zzh;
  private final boolean zzi;
  private final Map zzj;
  private final String zzk;
  
  public zzbpc(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, zzbee paramzzbee, List paramList, boolean paramBoolean2, int paramInt3, String paramString)
  {
    this.zza = paramDate;
    this.zzb = paramInt1;
    this.zzc = paramSet;
    this.zze = paramLocation;
    this.zzd = paramBoolean1;
    this.zzf = paramInt2;
    this.zzg = paramzzbee;
    this.zzi = paramBoolean2;
    this.zzk = paramString;
    this.zzh = new ArrayList();
    this.zzj = new HashMap();
    if (paramList != null)
    {
      paramDate = paramList.iterator();
      while (paramDate.hasNext())
      {
        paramSet = (String)paramDate.next();
        if (paramSet.startsWith("custom:"))
        {
          paramSet = paramSet.split(":", 3);
          if (paramSet.length == 3) {
            if ("true".equals(paramSet[2])) {
              this.zzj.put(paramSet[1], Boolean.valueOf(true));
            } else if ("false".equals(paramSet[2])) {
              this.zzj.put(paramSet[1], Boolean.valueOf(false));
            }
          }
        }
        else
        {
          this.zzh.add(paramSet);
        }
      }
    }
  }
  
  public final float getAdVolume()
  {
    return zzej.zzf().zza();
  }
  
  @Deprecated
  public final Date getBirthday()
  {
    return this.zza;
  }
  
  @Deprecated
  public final int getGender()
  {
    return this.zzb;
  }
  
  public final Set<String> getKeywords()
  {
    return this.zzc;
  }
  
  public final Location getLocation()
  {
    return this.zze;
  }
  
  public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions()
  {
    Object localObject = this.zzg;
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder();
    if (localObject == null)
    {
      localObject = localBuilder.build();
    }
    else
    {
      int i = ((zzbee)localObject).zza;
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            break label100;
          }
          localBuilder.setRequestCustomMuteThisAd(((zzbee)localObject).zzg);
          localBuilder.setMediaAspectRatio(((zzbee)localObject).zzh);
        }
        zzfl localzzfl = ((zzbee)localObject).zzf;
        if (localzzfl != null) {
          localBuilder.setVideoOptions(new VideoOptions(localzzfl));
        }
      }
      localBuilder.setAdChoicesPlacement(((zzbee)localObject).zze);
      label100:
      localBuilder.setReturnUrlsForImageAssets(((zzbee)localObject).zzb);
      localBuilder.setImageOrientation(((zzbee)localObject).zzc);
      localBuilder.setRequestMultipleImages(((zzbee)localObject).zzd);
      localObject = localBuilder.build();
    }
    return (com.google.android.gms.ads.formats.NativeAdOptions)localObject;
  }
  
  public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions()
  {
    return zzbee.zza(this.zzg);
  }
  
  public final boolean isAdMuted()
  {
    return zzej.zzf().zzx();
  }
  
  @Deprecated
  public final boolean isDesignedForFamilies()
  {
    return this.zzi;
  }
  
  public final boolean isTesting()
  {
    return this.zzd;
  }
  
  public final boolean isUnifiedNativeAdRequested()
  {
    return this.zzh.contains("6");
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return this.zzf;
  }
  
  public final Map zza()
  {
    return this.zzj;
  }
  
  public final boolean zzb()
  {
    return this.zzh.contains("3");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */