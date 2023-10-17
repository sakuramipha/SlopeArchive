package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;

public final class zzfh
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfh> CREATOR = new zzfi();
  final Contents zzes;
  final boolean zzhv;
  
  public zzfh(Contents paramContents, boolean paramBoolean)
  {
    this.zzes = paramContents;
    this.zzhv = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzes, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzhv);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final Contents zzar()
  {
    return this.zzes;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */