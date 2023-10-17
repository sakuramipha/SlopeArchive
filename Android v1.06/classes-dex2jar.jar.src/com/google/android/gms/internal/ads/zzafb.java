package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzafb
  implements zzbz
{
  public static final Parcelable.Creator<zzafb> CREATOR = new zzaez();
  public final float zza;
  public final int zzb;
  
  public zzafb(float paramFloat, int paramInt)
  {
    this.zza = paramFloat;
    this.zzb = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzafb)paramObject;
      if ((this.zza == ((zzafb)paramObject).zza) && (this.zzb == ((zzafb)paramObject).zzb)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (Float.valueOf(this.zza).hashCode() + 527) * 31 + this.zzb;
  }
  
  public final String toString()
  {
    float f = this.zza;
    int i = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("smta: captureFrameRate=");
    localStringBuilder.append(f);
    localStringBuilder.append(", svcTemporalLayerCount=");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.zza);
    paramParcel.writeInt(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */