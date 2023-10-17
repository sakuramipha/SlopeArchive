package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;

public final class zaa
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zaa> CREATOR = new zab();
  final int zaa;
  private final StringToIntConverter zab;
  
  zaa(int paramInt, StringToIntConverter paramStringToIntConverter)
  {
    this.zaa = paramInt;
    this.zab = paramStringToIntConverter;
  }
  
  private zaa(StringToIntConverter paramStringToIntConverter)
  {
    this.zaa = 1;
    this.zab = paramStringToIntConverter;
  }
  
  public static zaa zaa(FastJsonResponse.FieldConverter<?, ?> paramFieldConverter)
  {
    if ((paramFieldConverter instanceof StringToIntConverter)) {
      return new zaa((StringToIntConverter)paramFieldConverter);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zab, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final FastJsonResponse.FieldConverter<?, ?> zab()
  {
    StringToIntConverter localStringToIntConverter = this.zab;
    if (localStringToIntConverter != null) {
      return localStringToIntConverter;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\converter\zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */