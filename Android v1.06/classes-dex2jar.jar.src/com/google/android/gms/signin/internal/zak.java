package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

public final class zak
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zak> CREATOR = new zal();
  final int zaa;
  private final ConnectionResult zab;
  private final zav zac;
  
  zak(int paramInt, ConnectionResult paramConnectionResult, zav paramzav)
  {
    this.zaa = paramInt;
    this.zab = paramConnectionResult;
    this.zac = paramzav;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zab, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zac, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final ConnectionResult zaa()
  {
    return this.zab;
  }
  
  public final zav zab()
  {
    return this.zac;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */