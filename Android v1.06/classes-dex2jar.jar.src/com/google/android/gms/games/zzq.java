package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class zzq
  implements Parcelable.Creator
{
  public PlayerEntity zza(Parcel paramParcel)
  {
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    long l3 = 0L;
    long l2 = 0L;
    String str2 = null;
    String str1 = null;
    Object localObject1 = str1;
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
    long l1 = -1L;
    int i = 0;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < j)
    {
      int m = SafeParcelReader.readHeader(paramParcel);
      int k = SafeParcelReader.getFieldId(m);
      if (k != 29)
      {
        if (k != 33)
        {
          if (k != 35)
          {
            if (k != 36) {
              switch (k)
              {
              default: 
                switch (k)
                {
                default: 
                  switch (k)
                  {
                  default: 
                    SafeParcelReader.skipUnknownField(paramParcel, m);
                    break;
                  case 25: 
                    localObject13 = SafeParcelReader.createString(paramParcel, m);
                    break;
                  case 24: 
                    localObject12 = (Uri)SafeParcelReader.createParcelable(paramParcel, m, Uri.CREATOR);
                    break;
                  case 23: 
                    localObject11 = SafeParcelReader.createString(paramParcel, m);
                    break;
                  case 22: 
                    localObject10 = (Uri)SafeParcelReader.createParcelable(paramParcel, m, Uri.CREATOR);
                    break;
                  case 21: 
                    localObject9 = SafeParcelReader.createString(paramParcel, m);
                    break;
                  case 20: 
                    localObject8 = SafeParcelReader.createString(paramParcel, m);
                    break;
                  case 19: 
                    bool2 = SafeParcelReader.readBoolean(paramParcel, m);
                    break;
                  case 18: 
                    bool3 = SafeParcelReader.readBoolean(paramParcel, m);
                  }
                  break;
                case 16: 
                  localObject7 = (PlayerLevelInfo)SafeParcelReader.createParcelable(paramParcel, m, PlayerLevelInfo.CREATOR);
                  break;
                case 15: 
                  localObject6 = (MostRecentGameInfoEntity)SafeParcelReader.createParcelable(paramParcel, m, MostRecentGameInfoEntity.CREATOR);
                  break;
                case 14: 
                  localObject5 = SafeParcelReader.createString(paramParcel, m);
                }
                break;
              case 9: 
                localObject4 = SafeParcelReader.createString(paramParcel, m);
                break;
              case 8: 
                localObject3 = SafeParcelReader.createString(paramParcel, m);
                break;
              case 7: 
                l2 = SafeParcelReader.readLong(paramParcel, m);
                break;
              case 6: 
                i = SafeParcelReader.readInt(paramParcel, m);
                break;
              case 5: 
                l3 = SafeParcelReader.readLong(paramParcel, m);
                break;
              case 4: 
                localObject2 = (Uri)SafeParcelReader.createParcelable(paramParcel, m, Uri.CREATOR);
                break;
              case 3: 
                localObject1 = (Uri)SafeParcelReader.createParcelable(paramParcel, m, Uri.CREATOR);
                break;
              case 2: 
                str1 = SafeParcelReader.createString(paramParcel, m);
                break;
              case 1: 
                str2 = SafeParcelReader.createString(paramParcel, m);
                break;
              }
            } else {
              bool1 = SafeParcelReader.readBoolean(paramParcel, m);
            }
          }
          else {
            localObject15 = (zza)SafeParcelReader.createParcelable(paramParcel, m, zza.CREATOR);
          }
        }
        else {
          localObject14 = (zzt)SafeParcelReader.createParcelable(paramParcel, m, zzt.CREATOR);
        }
      }
      else {
        l1 = SafeParcelReader.readLong(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, j);
    return new PlayerEntity(str2, str1, (Uri)localObject1, (Uri)localObject2, l3, i, l2, (String)localObject3, (String)localObject4, (String)localObject5, (MostRecentGameInfoEntity)localObject6, (PlayerLevelInfo)localObject7, bool3, bool2, (String)localObject8, (String)localObject9, (Uri)localObject10, (String)localObject11, (Uri)localObject12, (String)localObject13, l1, (zzt)localObject14, (zza)localObject15, bool1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */