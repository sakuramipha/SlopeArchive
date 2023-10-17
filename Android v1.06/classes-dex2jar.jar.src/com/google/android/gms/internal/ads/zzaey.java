package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaey
  implements zzbz
{
  public static final Parcelable.Creator<zzaey> CREATOR = new zzaew();
  public final float zza;
  public final float zzb;
  
  public zzaey(float paramFloat1, float paramFloat2)
  {
    this.zza = paramFloat1;
    this.zzb = paramFloat2;
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
      paramObject = (zzaey)paramObject;
      if ((this.zza == ((zzaey)paramObject).zza) && (this.zzb == ((zzaey)paramObject).zzb)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (Float.valueOf(this.zza).hashCode() + 527) * 31 + Float.valueOf(this.zzb).hashCode();
  }
  
  public final String toString()
  {
    float f2 = this.zza;
    float f1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("xyz: latitude=");
    localStringBuilder.append(f2);
    localStringBuilder.append(", longitude=");
    localStringBuilder.append(f1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.zza);
    paramParcel.writeFloat(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */