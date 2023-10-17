package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;

final class zzb
  extends zzc
{
  public final GameBadgeEntity zza(Parcel paramParcel)
  {
    if ((!GameBadgeEntity.zzd(GameBadgeEntity.zzc())) && (!GameBadgeEntity.zze(GameBadgeEntity.class.getCanonicalName())))
    {
      int i = paramParcel.readInt();
      String str2 = paramParcel.readString();
      String str1 = paramParcel.readString();
      paramParcel = paramParcel.readString();
      if (paramParcel == null) {
        paramParcel = null;
      } else {
        paramParcel = Uri.parse(paramParcel);
      }
      return new GameBadgeEntity(i, str2, str1, paramParcel);
    }
    return super.zza(paramParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\game\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */