package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zax
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zax> CREATOR = new zay();
  final int zaa;
  private final int zab;
  private final int zac;
  @Deprecated
  private final Scope[] zad;
  
  zax(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
    this.zac = paramInt3;
    this.zad = paramArrayOfScope;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zab);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zac);
    SafeParcelWriter.writeTypedArray(paramParcel, 4, this.zad, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */