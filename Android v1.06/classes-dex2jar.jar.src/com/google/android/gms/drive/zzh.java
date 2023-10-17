package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzh
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzh> CREATOR = new zzi();
  private final long zzab;
  private final long zzac;
  
  public zzh(long paramLong1, long paramLong2)
  {
    this.zzab = paramLong1;
    this.zzac = paramLong2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzab);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzac);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */