package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzt
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzt> CREATOR = new zzu();
  private int zza;
  private int zzb;
  private int zzc;
  private boolean zzd;
  
  private zzt() {}
  
  zzt(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    this.zzd = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzt))
    {
      paramObject = (zzt)paramObject;
      if ((Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(((zzt)paramObject).zza))) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzt)paramObject).zzb))) && (Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(((zzt)paramObject).zzc))) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((zzt)paramObject).zzd)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd) });
  }
  
  public final String toString()
  {
    int j = this.zza;
    int k = this.zzb;
    int i = this.zzc;
    boolean bool = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder(146);
    localStringBuilder.append("UwbRangingData{rawDistance=");
    localStringBuilder.append(j);
    localStringBuilder.append(", rawAngleOfArrivalAzimuth=");
    localStringBuilder.append(k);
    localStringBuilder.append(", rawAngleOfArrivalPolar=");
    localStringBuilder.append(i);
    localStringBuilder.append(", isValidAngleOfArrivalData=");
    localStringBuilder.append(bool);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */