package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.FileUploadPreferences;
import com.google.android.gms.drive.TransferPreferences;

@Deprecated
public final class zzei
  extends AbstractSafeParcelable
  implements FileUploadPreferences
{
  public static final Parcelable.Creator<zzei> CREATOR = new zzej();
  private int zzbn;
  private int zzgy;
  private boolean zzgz;
  
  public zzei(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zzgy = paramInt1;
    this.zzbn = paramInt2;
    this.zzgz = paramBoolean;
  }
  
  public zzei(TransferPreferences paramTransferPreferences)
  {
    this(paramTransferPreferences.getNetworkPreference(), paramTransferPreferences.getBatteryUsagePreference(), paramTransferPreferences.isRoamingAllowed());
  }
  
  private static boolean zzh(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2);
  }
  
  private static boolean zzi(int paramInt)
  {
    return (paramInt == 256) || (paramInt == 257);
  }
  
  public final int getBatteryUsagePreference()
  {
    if (!zzi(this.zzbn)) {
      return 0;
    }
    return this.zzbn;
  }
  
  public final int getNetworkTypePreference()
  {
    if (!zzh(this.zzgy)) {
      return 0;
    }
    return this.zzgy;
  }
  
  public final boolean isRoamingAllowed()
  {
    return this.zzgz;
  }
  
  public final void setBatteryUsagePreference(int paramInt)
  {
    if (zzi(paramInt))
    {
      this.zzbn = paramInt;
      return;
    }
    throw new IllegalArgumentException("Invalid battery usage preference value.");
  }
  
  public final void setNetworkTypePreference(int paramInt)
  {
    if (zzh(paramInt))
    {
      this.zzgy = paramInt;
      return;
    }
    throw new IllegalArgumentException("Invalid data connection preference value.");
  }
  
  public final void setRoamingAllowed(boolean paramBoolean)
  {
    this.zzgz = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzgy);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzbn);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzgz);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */