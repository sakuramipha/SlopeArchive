package com.google.android.gms.internal.ads;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class zzatq
{
  public static final int zza = 0;
  private static final ClassLoader zzb = zzatq.class.getClassLoader();
  
  public static Parcelable zza(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static ArrayList zzb(Parcel paramParcel)
  {
    return paramParcel.readArrayList(zzb);
  }
  
  public static void zzc(Parcel paramParcel)
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
  
  public static void zzd(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static void zze(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 1);
  }
  
  public static void zzf(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null)
    {
      paramParcel.writeStrongBinder(null);
      return;
    }
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
  
  public static boolean zzg(Parcel paramParcel)
  {
    return paramParcel.readInt() != 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */