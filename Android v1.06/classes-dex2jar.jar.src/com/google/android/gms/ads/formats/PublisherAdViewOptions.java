package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;

@Deprecated
public final class PublisherAdViewOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
  private final boolean zza;
  private final zzcb zzb;
  private final IBinder zzc;
  
  PublisherAdViewOptions(boolean paramBoolean, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this.zza = paramBoolean;
    if (paramIBinder1 != null) {
      paramIBinder1 = zzca.zzd(paramIBinder1);
    } else {
      paramIBinder1 = null;
    }
    this.zzb = paramIBinder1;
    this.zzc = paramIBinder2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, this.zza);
    Object localObject = this.zzb;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzcb)localObject).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject, false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final zzcb zza()
  {
    return this.zzb;
  }
  
  public final zzbgh zzb()
  {
    IBinder localIBinder = this.zzc;
    if (localIBinder == null) {
      return null;
    }
    return zzbgg.zzc(localIBinder);
  }
  
  public final boolean zzc()
  {
    return this.zza;
  }
  
  @Deprecated
  public static final class Builder
  {
    private ShouldDelayBannerRenderingListener zza;
    
    public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener paramShouldDelayBannerRenderingListener)
    {
      this.zza = paramShouldDelayBannerRenderingListener;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\PublisherAdViewOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */