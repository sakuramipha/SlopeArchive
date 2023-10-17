package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

public class ParentDriveIdSet
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<ParentDriveIdSet> CREATOR = new zzn();
  final List<zzq> zzjj;
  
  public ParentDriveIdSet()
  {
    this(new ArrayList());
  }
  
  ParentDriveIdSet(List<zzq> paramList)
  {
    this.zzjj = paramList;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzjj, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\ParentDriveIdSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */