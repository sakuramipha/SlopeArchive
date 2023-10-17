package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.nativead.NativeAdOptions.Builder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbee
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbee> CREATOR = new zzbef();
  public final int zza;
  public final boolean zzb;
  public final int zzc;
  public final boolean zzd;
  public final int zze;
  public final zzfl zzf;
  public final boolean zzg;
  public final int zzh;
  public final int zzi;
  public final boolean zzj;
  
  public zzbee(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, zzfl paramzzfl, boolean paramBoolean3, int paramInt4, int paramInt5, boolean paramBoolean4)
  {
    this.zza = paramInt1;
    this.zzb = paramBoolean1;
    this.zzc = paramInt2;
    this.zzd = paramBoolean2;
    this.zze = paramInt3;
    this.zzf = paramzzfl;
    this.zzg = paramBoolean3;
    this.zzh = paramInt4;
    this.zzj = paramBoolean4;
    this.zzi = paramInt5;
  }
  
  @Deprecated
  public zzbee(com.google.android.gms.ads.formats.NativeAdOptions paramNativeAdOptions)
  {
    this(4, bool2, i, bool1, j, localzzfl, paramNativeAdOptions.zza(), paramNativeAdOptions.getMediaAspectRatio(), 0, false);
  }
  
  public static com.google.android.gms.ads.nativead.NativeAdOptions zza(zzbee paramzzbee)
  {
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder();
    if (paramzzbee == null) {
      return localBuilder.build();
    }
    int i = paramzzbee.zza;
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4) {
          break label102;
        }
        localBuilder.setRequestCustomMuteThisAd(paramzzbee.zzg);
        localBuilder.setMediaAspectRatio(paramzzbee.zzh);
        localBuilder.enableCustomClickGestureDirection(paramzzbee.zzi, paramzzbee.zzj);
      }
      zzfl localzzfl = paramzzbee.zzf;
      if (localzzfl != null) {
        localBuilder.setVideoOptions(new VideoOptions(localzzfl));
      }
    }
    localBuilder.setAdChoicesPlacement(paramzzbee.zze);
    label102:
    localBuilder.setReturnUrlsForImageAssets(paramzzbee.zzb);
    localBuilder.setRequestMultipleImages(paramzzbee.zzd);
    return localBuilder.build();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zze);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeInt(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */