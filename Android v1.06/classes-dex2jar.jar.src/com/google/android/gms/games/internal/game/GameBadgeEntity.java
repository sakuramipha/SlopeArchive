package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity
  extends GamesDowngradeableSafeParcel
  implements zza
{
  public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new zzb();
  private int zza;
  private String zzb;
  private String zzc;
  private Uri zzd;
  
  GameBadgeEntity(int paramInt, String paramString1, String paramString2, Uri paramUri)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramUri;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = paramObject instanceof zza;
    boolean bool1 = true;
    if (!bool2) {}
    do
    {
      bool1 = false;
      break;
      if (this == paramObject) {
        break;
      }
      paramObject = (zza)paramObject;
    } while ((!Objects.equal(Integer.valueOf(((zza)paramObject).zza()), this.zzb)) || (!Objects.equal(((zza)paramObject).zzb(), this.zzd)));
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd });
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("Type", Integer.valueOf(this.zza)).add("Title", this.zzb).add("Description", this.zzc).add("IconImageUri", this.zzd).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!shouldDowngrade())
    {
      int i = SafeParcelWriter.beginObjectHeader(paramParcel);
      SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
      SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
      SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
      SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
      SafeParcelWriter.finishObjectHeader(paramParcel, i);
      return;
    }
    paramParcel.writeInt(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    Object localObject = this.zzd;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Uri)localObject).toString();
    }
    paramParcel.writeString((String)localObject);
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\game\GameBadgeEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */