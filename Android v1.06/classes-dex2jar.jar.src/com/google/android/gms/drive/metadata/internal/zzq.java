package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzq> CREATOR = new zzr();
  final String zzad;
  final long zzae;
  final int zzaf;
  
  public zzq(String paramString, long paramLong, int paramInt)
  {
    this.zzad = paramString;
    this.zzae = paramLong;
    this.zzaf = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzad, false);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzae);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzaf);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */