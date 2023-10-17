package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.TransferPreferences;

public final class zzga
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzga> CREATOR = new zzgb();
  private final zzgo zzil;
  
  zzga(zzgo paramzzgo)
  {
    this.zzil = paramzzgo;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzil, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final TransferPreferences zzax()
  {
    return this.zzil;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */