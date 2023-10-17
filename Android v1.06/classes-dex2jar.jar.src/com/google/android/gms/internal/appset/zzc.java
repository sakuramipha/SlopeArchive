package com.google.android.gms.internal.appset;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzc
{
  private static final ClassLoader zza = zzc.class.getClassLoader();
  
  public static <T extends Parcelable> T zza(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void zzb(Parcel paramParcel, Parcelable paramParcelable)
  {
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zzc(Parcel paramParcel, IInterface paramIInterface)
  {
    paramParcel.writeStrongBinder(paramIInterface);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */