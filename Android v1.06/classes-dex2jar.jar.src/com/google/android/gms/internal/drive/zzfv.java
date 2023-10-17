package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.zzu;

public final class zzfv
  extends zzu
{
  public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
  final DataHolder zzij;
  
  public zzfv(DataHolder paramDataHolder)
  {
    this.zzij = paramDataHolder;
  }
  
  protected final void zza(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzij, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final DataHolder zzav()
  {
    return this.zzij;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */