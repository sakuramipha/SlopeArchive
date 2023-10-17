package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.zza;
import com.google.android.gms.drive.zzu;
import java.util.List;

public final class zzff
  extends zzu
{
  public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
  private final DataHolder zzhr;
  private final List<DriveId> zzhs;
  private final zza zzht;
  private final boolean zzhu;
  
  public zzff(DataHolder paramDataHolder, List<DriveId> paramList, zza paramzza, boolean paramBoolean)
  {
    this.zzhr = paramDataHolder;
    this.zzhs = paramList;
    this.zzht = paramzza;
    this.zzhu = paramBoolean;
  }
  
  protected final void zza(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzhr, i, false);
    SafeParcelWriter.writeTypedList(paramParcel, 3, this.zzhs, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzht, i, false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzhu);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */