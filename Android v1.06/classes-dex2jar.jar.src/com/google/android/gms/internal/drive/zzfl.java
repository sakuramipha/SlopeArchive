package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.zzh;
import java.util.Collections;
import java.util.List;

public final class zzfl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfl> CREATOR = new zzfm();
  private static final List<zzh> zzhx = ;
  private final int status;
  final long zzhy;
  final long zzhz;
  private final List<zzh> zzia;
  
  public zzfl(long paramLong1, long paramLong2, int paramInt, List<zzh> paramList)
  {
    this.zzhy = paramLong1;
    this.zzhz = paramLong2;
    this.status = paramInt;
    this.zzia = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzhy);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzhz);
    SafeParcelWriter.writeInt(paramParcel, 4, this.status);
    SafeParcelWriter.writeTypedList(paramParcel, 5, this.zzia, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */