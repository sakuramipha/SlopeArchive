package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public final class zzc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzc> CREATOR = new zzd();
  final String value;
  final CustomPropertyKey zzje;
  
  public zzc(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    Preconditions.checkNotNull(paramCustomPropertyKey, "key");
    this.zzje = paramCustomPropertyKey;
    this.value = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      paramObject = (zzc)paramObject;
      if ((Objects.equal(this.zzje, ((zzc)paramObject).zzje)) && (Objects.equal(this.value, ((zzc)paramObject).value))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzje, this.value });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzje, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.value, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */