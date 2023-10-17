package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;

public final class zzo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzo> CREATOR = new zzp();
  private final Contents zzdf;
  private final int zzdh;
  private final Boolean zzdj;
  
  public zzo(int paramInt, boolean paramBoolean)
  {
    this(null, Boolean.valueOf(false), paramInt);
  }
  
  public zzo(Contents paramContents, Boolean paramBoolean, int paramInt)
  {
    this.zzdf = paramContents;
    this.zzdj = paramBoolean;
    this.zzdh = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzdf, paramInt, false);
    SafeParcelWriter.writeBooleanObject(paramParcel, 3, this.zzdj, false);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzdh);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */