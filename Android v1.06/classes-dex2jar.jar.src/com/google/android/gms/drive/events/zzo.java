package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.zzu;

public final class zzo
  extends zzu
  implements DriveEvent
{
  public static final Parcelable.Creator<zzo> CREATOR = new zzp();
  private final DataHolder zzav;
  private final boolean zzcq;
  private final int zzcr;
  
  public zzo(DataHolder paramDataHolder, boolean paramBoolean, int paramInt)
  {
    this.zzav = paramDataHolder;
    this.zzcq = paramBoolean;
    this.zzcr = paramInt;
  }
  
  public final int getType()
  {
    return 3;
  }
  
  public final void zza(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzav, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzcq);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzcr);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final boolean zzaa()
  {
    return this.zzcq;
  }
  
  public final int zzab()
  {
    return this.zzcr;
  }
  
  public final DataHolder zzz()
  {
    return this.zzav;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */