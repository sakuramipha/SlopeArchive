package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzgf
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgf> CREATOR = new zzgg();
  private final ParcelFileDescriptor zzin;
  private final IBinder zzio;
  private final String zzm;
  
  zzgf(ParcelFileDescriptor paramParcelFileDescriptor, IBinder paramIBinder, String paramString)
  {
    this.zzin = paramParcelFileDescriptor;
    this.zzio = paramIBinder;
    this.zzm = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzin, paramInt | 0x1, false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, this.zzio, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzm, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */