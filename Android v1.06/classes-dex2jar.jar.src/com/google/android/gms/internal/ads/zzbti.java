package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzbti
  implements Parcelable.Creator
{
  public static final zzbth zza(Parcel paramParcel)
  {
    int i4 = SafeParcelReader.validateObjectHeader(paramParcel);
    long l2 = 0L;
    long l1 = 0L;
    Bundle localBundle = null;
    zzl localzzl = null;
    Object localObject1 = localzzl;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    Object localObject9 = localObject8;
    Object localObject10 = localObject9;
    Object localObject11 = localObject10;
    Object localObject12 = localObject11;
    Object localObject13 = localObject12;
    Object localObject14 = localObject13;
    Object localObject15 = localObject14;
    Object localObject16 = localObject15;
    Object localObject17 = localObject16;
    Object localObject18 = localObject17;
    Object localObject19 = localObject18;
    Object localObject20 = localObject19;
    Object localObject21 = localObject20;
    Object localObject22 = localObject21;
    Object localObject23 = localObject22;
    Object localObject24 = localObject23;
    Object localObject25 = localObject24;
    Object localObject26 = localObject25;
    Object localObject27 = localObject26;
    Object localObject28 = localObject27;
    Object localObject29 = localObject28;
    Object localObject30 = localObject29;
    Object localObject31 = localObject30;
    Object localObject32 = localObject31;
    Object localObject33 = localObject32;
    Object localObject34 = localObject33;
    Object localObject35 = localObject34;
    int i3 = 0;
    int i2 = 0;
    boolean bool9 = false;
    int i1 = 0;
    int n = 0;
    float f2 = 0.0F;
    float f1 = 0.0F;
    boolean bool8 = false;
    int m = 0;
    int k = 0;
    boolean bool7 = false;
    boolean bool6 = false;
    int j = 0;
    boolean bool5 = false;
    boolean bool4 = false;
    int i = 0;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i4)
    {
      int i5 = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(i5))
      {
      case 17: 
      case 22: 
      case 23: 
      case 24: 
      case 32: 
      case 38: 
      case 62: 
      default: 
        SafeParcelReader.skipUnknownField(paramParcel, i5);
        break;
      case 65: 
        localObject35 = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 64: 
        localObject34 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 63: 
        localObject33 = (zzbkq)SafeParcelReader.createParcelable(paramParcel, i5, zzbkq.CREATOR);
        break;
      case 61: 
        localObject32 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 60: 
        localObject31 = SafeParcelReader.createStringList(paramParcel, i5);
        break;
      case 59: 
        bool1 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 58: 
        bool2 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 57: 
        bool3 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 56: 
        i = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 55: 
        localObject30 = SafeParcelReader.createStringList(paramParcel, i5);
        break;
      case 54: 
        localObject29 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 53: 
        localObject28 = SafeParcelReader.createIntegerList(paramParcel, i5);
        break;
      case 52: 
        bool4 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 51: 
        localObject27 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 50: 
        localObject26 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 49: 
        localObject25 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 48: 
        localObject24 = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 47: 
        bool5 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 46: 
        localObject23 = (zzdu)SafeParcelReader.createParcelable(paramParcel, i5, zzdu.CREATOR);
        break;
      case 45: 
        localObject22 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 44: 
        localObject21 = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 43: 
        j = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 42: 
        bool6 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 41: 
        localObject20 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 40: 
        bool8 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 39: 
        localObject19 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 37: 
        bool7 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 36: 
        k = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 35: 
        m = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 34: 
        f1 = SafeParcelReader.readFloat(paramParcel, i5);
        break;
      case 33: 
        localObject18 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 31: 
        l1 = SafeParcelReader.readLong(paramParcel, i5);
        break;
      case 30: 
        localObject17 = SafeParcelReader.createStringList(paramParcel, i5);
        break;
      case 29: 
        localObject16 = (zzbee)SafeParcelReader.createParcelable(paramParcel, i5, zzbee.CREATOR);
        break;
      case 28: 
        localObject15 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 27: 
        localObject14 = SafeParcelReader.createStringList(paramParcel, i5);
        break;
      case 26: 
        localObject13 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 25: 
        l2 = SafeParcelReader.readLong(paramParcel, i5);
        break;
      case 21: 
        localObject12 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 20: 
        f2 = SafeParcelReader.readFloat(paramParcel, i5);
        break;
      case 19: 
        n = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 18: 
        i1 = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 16: 
        bool9 = SafeParcelReader.readBoolean(paramParcel, i5);
        break;
      case 15: 
        localObject11 = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 14: 
        localObject10 = SafeParcelReader.createStringList(paramParcel, i5);
        break;
      case 13: 
        i2 = SafeParcelReader.readInt(paramParcel, i5);
        break;
      case 12: 
        localObject9 = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 11: 
        localObject8 = (zzbzz)SafeParcelReader.createParcelable(paramParcel, i5, zzbzz.CREATOR);
        break;
      case 10: 
        localObject7 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 9: 
        localObject6 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 8: 
        localObject5 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 7: 
        localObject4 = (PackageInfo)SafeParcelReader.createParcelable(paramParcel, i5, PackageInfo.CREATOR);
        break;
      case 6: 
        localObject3 = (ApplicationInfo)SafeParcelReader.createParcelable(paramParcel, i5, ApplicationInfo.CREATOR);
        break;
      case 5: 
        localObject2 = SafeParcelReader.createString(paramParcel, i5);
        break;
      case 4: 
        localObject1 = (zzq)SafeParcelReader.createParcelable(paramParcel, i5, zzq.CREATOR);
        break;
      case 3: 
        localzzl = (zzl)SafeParcelReader.createParcelable(paramParcel, i5, zzl.CREATOR);
        break;
      case 2: 
        localBundle = SafeParcelReader.createBundle(paramParcel, i5);
        break;
      case 1: 
        i3 = SafeParcelReader.readInt(paramParcel, i5);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i4);
    return new zzbth(i3, localBundle, localzzl, (zzq)localObject1, (String)localObject2, (ApplicationInfo)localObject3, (PackageInfo)localObject4, (String)localObject5, (String)localObject6, (String)localObject7, (zzbzz)localObject8, (Bundle)localObject9, i2, (List)localObject10, (Bundle)localObject11, bool9, i1, n, f2, (String)localObject12, l2, (String)localObject13, (List)localObject14, (String)localObject15, (zzbee)localObject16, (List)localObject17, l1, (String)localObject18, f1, bool8, m, k, bool7, (String)localObject19, (String)localObject20, bool6, j, (Bundle)localObject21, (String)localObject22, (zzdu)localObject23, bool5, (Bundle)localObject24, (String)localObject25, (String)localObject26, (String)localObject27, bool4, (List)localObject28, (String)localObject29, (List)localObject30, i, bool3, bool2, bool1, (ArrayList)localObject31, (String)localObject32, (zzbkq)localObject33, (String)localObject34, (Bundle)localObject35);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */