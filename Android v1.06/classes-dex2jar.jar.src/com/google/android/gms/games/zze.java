package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class zze
  extends zzf
{
  public final GameEntity zza(Parcel paramParcel)
  {
    if ((!GameEntity.zzk(GameEntity.zzi())) && (!GameEntity.zzl(GameEntity.class.getCanonicalName())))
    {
      String str1 = paramParcel.readString();
      String str3 = paramParcel.readString();
      String str4 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str6 = paramParcel.readString();
      String str5 = paramParcel.readString();
      Object localObject1 = paramParcel.readString();
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Uri.parse((String)localObject1);
      }
      Object localObject2 = paramParcel.readString();
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = Uri.parse((String)localObject2);
      }
      Object localObject3 = paramParcel.readString();
      if (localObject3 == null) {
        localObject3 = null;
      } else {
        localObject3 = Uri.parse((String)localObject3);
      }
      boolean bool1;
      if (paramParcel.readInt() > 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      boolean bool2;
      if (paramParcel.readInt() > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      return new GameEntity(str1, str3, str4, str2, str6, str5, (Uri)localObject1, (Uri)localObject2, (Uri)localObject3, bool1, bool2, paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), false, false, null, null, null, false, false, false, null, false);
    }
    return super.zza(paramParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */