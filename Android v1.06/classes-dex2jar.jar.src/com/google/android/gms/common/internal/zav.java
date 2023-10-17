package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zav
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zav> CREATOR = new zaw();
  final int zaa;
  final IBinder zab;
  private final ConnectionResult zac;
  private final boolean zad;
  private final boolean zae;
  
  zav(int paramInt, IBinder paramIBinder, ConnectionResult paramConnectionResult, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zaa = paramInt;
    this.zab = paramIBinder;
    this.zac = paramConnectionResult;
    this.zad = paramBoolean1;
    this.zae = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zav)) {
      return false;
    }
    paramObject = (zav)paramObject;
    return (this.zac.equals(((zav)paramObject).zac)) && (Objects.equal(zab(), ((zav)paramObject).zab()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zab, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zac, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zad);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zae);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final ConnectionResult zaa()
  {
    return this.zac;
  }
  
  public final IAccountAccessor zab()
  {
    IBinder localIBinder = this.zab;
    if (localIBinder == null) {
      return null;
    }
    return IAccountAccessor.Stub.asInterface(localIBinder);
  }
  
  public final boolean zac()
  {
    return this.zad;
  }
  
  public final boolean zad()
  {
    return this.zae;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */