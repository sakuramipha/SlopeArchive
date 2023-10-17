package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.query.Query;

public final class zzgq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgq> CREATOR = new zzgr();
  private final Query zzir;
  
  public zzgq(Query paramQuery)
  {
    this.zzir = paramQuery;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzir, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */