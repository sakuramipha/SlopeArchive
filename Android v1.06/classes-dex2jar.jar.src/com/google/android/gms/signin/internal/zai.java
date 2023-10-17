package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

public final class zai
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zai> CREATOR = new zaj();
  final int zaa;
  final zat zab;
  
  zai(int paramInt, zat paramzat)
  {
    this.zaa = paramInt;
    this.zab = paramzat;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zab, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */