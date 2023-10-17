package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfl> CREATOR = new zzfm();
  public final boolean zza;
  public final boolean zzb;
  public final boolean zzc;
  
  public zzfl(VideoOptions paramVideoOptions)
  {
    this(paramVideoOptions.getStartMuted(), paramVideoOptions.getCustomControlsRequested(), paramVideoOptions.getClickToExpandRequested());
  }
  
  public zzfl(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.zza = paramBoolean1;
    this.zzb = paramBoolean2;
    this.zzc = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zza);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */