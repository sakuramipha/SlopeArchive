package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zac
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zac> CREATOR = new zae();
  final int zaa;
  final String zab;
  final int zac;
  
  zac(int paramInt1, String paramString, int paramInt2)
  {
    this.zaa = paramInt1;
    this.zab = paramString;
    this.zac = paramInt2;
  }
  
  zac(String paramString, int paramInt)
  {
    this.zaa = 1;
    this.zab = paramString;
    this.zac = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeString(paramParcel, 2, this.zab, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zac);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\converter\zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */