package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;

public final class AdManagerAdViewOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
  private final boolean zza;
  private final IBinder zzb;
  
  AdManagerAdViewOptions(boolean paramBoolean, IBinder paramIBinder)
  {
    this.zza = paramBoolean;
    this.zzb = paramIBinder;
  }
  
  public boolean getManualImpressionsEnabled()
  {
    return this.zza;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, getManualImpressionsEnabled());
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final zzbgh zza()
  {
    IBinder localIBinder = this.zzb;
    if (localIBinder == null) {
      return null;
    }
    return zzbgg.zzc(localIBinder);
  }
  
  public static final class Builder
  {
    private boolean zza = false;
    private ShouldDelayBannerRenderingListener zzb;
    
    public AdManagerAdViewOptions build()
    {
      return new AdManagerAdViewOptions(this, null);
    }
    
    public Builder setManualImpressionsEnabled(boolean paramBoolean)
    {
      this.zza = paramBoolean;
      return this;
    }
    
    public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener paramShouldDelayBannerRenderingListener)
    {
      this.zzb = paramShouldDelayBannerRenderingListener;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\AdManagerAdViewOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */