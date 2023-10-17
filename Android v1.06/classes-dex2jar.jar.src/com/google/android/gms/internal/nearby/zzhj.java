package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzhj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhj> CREATOR = new zzhk();
  public static final zzhj zza = new zzhj(1, "", null);
  final int zzb;
  private final String zzc;
  private final String zzd;
  
  zzhj(int paramInt, String paramString1, String paramString2)
  {
    this.zzb = ((Integer)Preconditions.checkNotNull(Integer.valueOf(paramInt))).intValue();
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    this.zzc = str;
    this.zzd = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzhj)) {
      return false;
    }
    paramObject = (zzhj)paramObject;
    return (Objects.equal(this.zzc, ((zzhj)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzhj)paramObject).zzd));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzc, this.zzd });
  }
  
  public final String toString()
  {
    String str2 = this.zzc;
    String str1 = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 40 + String.valueOf(str1).length());
    localStringBuilder.append("NearbyDevice{handle=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", bluetoothAddress=");
    localStringBuilder.append(str1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzd, false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */