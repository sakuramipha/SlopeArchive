package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.zzu;

public final class zzft
  extends zzu
{
  public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
  final boolean zzea;
  final DataHolder zzii;
  
  public zzft(DataHolder paramDataHolder, boolean paramBoolean)
  {
    this.zzii = paramDataHolder;
    this.zzea = paramBoolean;
  }
  
  protected final void zza(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzii, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzea);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final DataHolder zzau()
  {
    return this.zzii;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */