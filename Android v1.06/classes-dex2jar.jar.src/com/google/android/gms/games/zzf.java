package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class zzf
  implements Parcelable.Creator
{
  public GameEntity zza(Parcel paramParcel)
  {
    int m = SafeParcelReader.validateObjectHeader(paramParcel);
    String str6 = null;
    String str5 = null;
    String str1 = str5;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    Object localObject1 = str4;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    boolean bool8 = false;
    boolean bool7 = false;
    int k = 0;
    int j = 0;
    int i = 0;
    boolean bool6 = false;
    boolean bool5 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < m)
    {
      int n = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(n))
      {
      default: 
        SafeParcelReader.skipUnknownField(paramParcel, n);
        break;
      case 25: 
        bool1 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 24: 
        localObject8 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 23: 
        bool2 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 22: 
        bool3 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 21: 
        bool4 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 20: 
        localObject7 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 19: 
        localObject6 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 18: 
        localObject5 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 17: 
        bool5 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 16: 
        bool6 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 15: 
        i = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 14: 
        j = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 13: 
        k = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 12: 
        localObject4 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 11: 
        bool7 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 10: 
        bool8 = SafeParcelReader.readBoolean(paramParcel, n);
        break;
      case 9: 
        localObject3 = (Uri)SafeParcelReader.createParcelable(paramParcel, n, Uri.CREATOR);
        break;
      case 8: 
        localObject2 = (Uri)SafeParcelReader.createParcelable(paramParcel, n, Uri.CREATOR);
        break;
      case 7: 
        localObject1 = (Uri)SafeParcelReader.createParcelable(paramParcel, n, Uri.CREATOR);
        break;
      case 6: 
        str4 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 5: 
        str3 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 4: 
        str2 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 3: 
        str1 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 2: 
        str5 = SafeParcelReader.createString(paramParcel, n);
        break;
      case 1: 
        str6 = SafeParcelReader.createString(paramParcel, n);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, m);
    return new GameEntity(str6, str5, str1, str2, str3, str4, (Uri)localObject1, (Uri)localObject2, (Uri)localObject3, bool8, bool7, (String)localObject4, k, j, i, bool6, bool5, (String)localObject5, (String)localObject6, (String)localObject7, bool4, bool3, bool2, (String)localObject8, bool1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */