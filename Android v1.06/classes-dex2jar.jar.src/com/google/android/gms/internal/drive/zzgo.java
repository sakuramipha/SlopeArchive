package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.TransferPreferences;

public final class zzgo
  extends AbstractSafeParcelable
  implements TransferPreferences
{
  public static final Parcelable.Creator<zzgo> CREATOR = new zzgp();
  private final boolean zzbm;
  private final int zzbn;
  private final int zzgy;
  
  zzgo(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zzgy = paramInt1;
    this.zzbn = paramInt2;
    this.zzbm = paramBoolean;
  }
  
  public final int getBatteryUsagePreference()
  {
    return this.zzbn;
  }
  
  public final int getNetworkPreference()
  {
    return this.zzgy;
  }
  
  public final boolean isRoamingAllowed()
  {
    return this.zzbm;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzgy);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzbn);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzbm);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */