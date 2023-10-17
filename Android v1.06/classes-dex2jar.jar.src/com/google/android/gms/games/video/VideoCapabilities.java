package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class VideoCapabilities
  extends zzh
{
  public static final Parcelable.Creator<VideoCapabilities> CREATOR = new zza();
  private final boolean zza;
  private final boolean zzb;
  private final boolean zzc;
  private final boolean[] zzd;
  private final boolean[] zze;
  
  public VideoCapabilities(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    this.zza = paramBoolean1;
    this.zzb = paramBoolean2;
    this.zzc = paramBoolean3;
    this.zzd = paramArrayOfBoolean1;
    this.zze = paramArrayOfBoolean2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof VideoCapabilities)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (VideoCapabilities)paramObject;
    return (Objects.equal(((VideoCapabilities)paramObject).getSupportedCaptureModes(), getSupportedCaptureModes())) && (Objects.equal(((VideoCapabilities)paramObject).getSupportedQualityLevels(), getSupportedQualityLevels())) && (Objects.equal(Boolean.valueOf(((VideoCapabilities)paramObject).isCameraSupported()), Boolean.valueOf(isCameraSupported()))) && (Objects.equal(Boolean.valueOf(((VideoCapabilities)paramObject).isMicSupported()), Boolean.valueOf(isMicSupported()))) && (Objects.equal(Boolean.valueOf(((VideoCapabilities)paramObject).isWriteStorageSupported()), Boolean.valueOf(isWriteStorageSupported())));
  }
  
  public boolean[] getSupportedCaptureModes()
  {
    return this.zzd;
  }
  
  public boolean[] getSupportedQualityLevels()
  {
    return this.zze;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { getSupportedCaptureModes(), getSupportedQualityLevels(), Boolean.valueOf(isCameraSupported()), Boolean.valueOf(isMicSupported()), Boolean.valueOf(isWriteStorageSupported()) });
  }
  
  public boolean isCameraSupported()
  {
    return this.zza;
  }
  
  public boolean isFullySupported(int paramInt1, int paramInt2)
  {
    return (this.zza) && (this.zzb) && (this.zzc) && (supportsCaptureMode(paramInt1)) && (supportsQualityLevel(paramInt2));
  }
  
  public boolean isMicSupported()
  {
    return this.zzb;
  }
  
  public boolean isWriteStorageSupported()
  {
    return this.zzc;
  }
  
  public boolean supportsCaptureMode(int paramInt)
  {
    Preconditions.checkState(VideoConfiguration.isValidCaptureMode(paramInt, false));
    return this.zzd[paramInt];
  }
  
  public boolean supportsQualityLevel(int paramInt)
  {
    Preconditions.checkState(VideoConfiguration.isValidQualityLevel(paramInt, false));
    return this.zze[paramInt];
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("SupportedCaptureModes", getSupportedCaptureModes()).add("SupportedQualityLevels", getSupportedQualityLevels()).add("CameraSupported", Boolean.valueOf(isCameraSupported())).add("MicSupported", Boolean.valueOf(isMicSupported())).add("StorageWriteSupported", Boolean.valueOf(isWriteStorageSupported())).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, isCameraSupported());
    SafeParcelWriter.writeBoolean(paramParcel, 2, isMicSupported());
    SafeParcelWriter.writeBoolean(paramParcel, 3, isWriteStorageSupported());
    SafeParcelWriter.writeBooleanArray(paramParcel, 4, getSupportedCaptureModes(), false);
    SafeParcelWriter.writeBooleanArray(paramParcel, 5, getSupportedQualityLevels(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\video\VideoCapabilities.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */