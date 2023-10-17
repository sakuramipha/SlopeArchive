package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class ScreenshotEntity
  extends zzh
  implements Freezable, Parcelable
{
  public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new zzd();
  private final Uri zza;
  private final int zzb;
  private final int zzc;
  
  public ScreenshotEntity(Uri paramUri, int paramInt1, int paramInt2)
  {
    this.zza = paramUri;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = paramObject instanceof ScreenshotEntity;
    boolean bool1 = true;
    if (!bool2) {}
    do
    {
      bool1 = false;
      break;
      if (this == paramObject) {
        break;
      }
      paramObject = (ScreenshotEntity)paramObject;
    } while ((!Objects.equal(((ScreenshotEntity)paramObject).zza, this.zza)) || (!Objects.equal(Integer.valueOf(((ScreenshotEntity)paramObject).zzb), Integer.valueOf(this.zzb))) || (!Objects.equal(Integer.valueOf(((ScreenshotEntity)paramObject).zzc), Integer.valueOf(this.zzc))));
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc) });
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("Uri", this.zza).add("Width", Integer.valueOf(this.zzb)).add("Height", Integer.valueOf(this.zzc)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zza, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\game\ScreenshotEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */