package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzj
{
  private static final ClassLoader zza = zzj.class.getClassLoader();
  
  public static Parcelable zza(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void zzb(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    paramParcel = new StringBuilder();
    paramParcel.append("Parcel data not fully consumed, unread size: ");
    paramParcel.append(i);
    throw new BadParcelableException(paramParcel.toString());
  }
  
  public static void zzc(Parcel paramParcel, Parcelable paramParcelable)
  {
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zzd(Parcel paramParcel, IInterface paramIInterface)
  {
    paramParcel.writeStrongBinder(paramIInterface);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */