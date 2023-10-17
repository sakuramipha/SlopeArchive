package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zam
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zam> CREATOR = new zak();
  final int zaa;
  final String zab;
  final FastJsonResponse.Field<?, ?> zac;
  
  zam(int paramInt, String paramString, FastJsonResponse.Field<?, ?> paramField)
  {
    this.zaa = paramInt;
    this.zab = paramString;
    this.zac = paramField;
  }
  
  zam(String paramString, FastJsonResponse.Field<?, ?> paramField)
  {
    this.zaa = 1;
    this.zab = paramString;
    this.zac = paramField;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeString(paramParcel, 2, this.zab, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zac, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\zam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */