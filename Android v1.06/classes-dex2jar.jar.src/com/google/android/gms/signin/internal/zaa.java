package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zaa
  extends AbstractSafeParcelable
  implements Result
{
  public static final Parcelable.Creator<zaa> CREATOR = new zab();
  final int zaa;
  private int zab;
  private Intent zac;
  
  public zaa()
  {
    this(2, 0, null);
  }
  
  zaa(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
    this.zac = paramIntent;
  }
  
  public final Status getStatus()
  {
    if (this.zab == 0) {
      return Status.RESULT_SUCCESS;
    }
    return Status.RESULT_CANCELED;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zab);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zac, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */