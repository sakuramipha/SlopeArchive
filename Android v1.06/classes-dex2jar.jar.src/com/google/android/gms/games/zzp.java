package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class zzp
  extends zzq
{
  public final PlayerEntity zza(Parcel paramParcel)
  {
    if ((!PlayerEntity.zzl(PlayerEntity.zzj())) && (!PlayerEntity.zzm(PlayerEntity.class.getCanonicalName())))
    {
      String str1 = paramParcel.readString();
      String str3 = paramParcel.readString();
      String str5 = paramParcel.readString();
      Object localObject = paramParcel.readString();
      long l = paramParcel.readLong();
      String str2 = paramParcel.readString();
      String str4 = paramParcel.readString();
      if (str5 == null) {
        paramParcel = null;
      } else {
        paramParcel = Uri.parse(str5);
      }
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Uri.parse((String)localObject);
      }
      return new PlayerEntity(str1, str3, paramParcel, (Uri)localObject, l, -1, -1L, null, null, null, null, null, true, false, str2, str4, null, null, null, null, -1L, null, null, false);
    }
    return super.zza(paramParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */