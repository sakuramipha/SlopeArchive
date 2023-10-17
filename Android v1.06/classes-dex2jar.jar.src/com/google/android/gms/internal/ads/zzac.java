package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class zzac
  implements Parcelable
{
  public static final Parcelable.Creator<zzac> CREATOR = new zzab();
  public final UUID zza;
  public final String zzb;
  public final String zzc;
  public final byte[] zzd;
  private int zze;
  
  zzac(Parcel paramParcel)
  {
    this.zza = new UUID(paramParcel.readLong(), paramParcel.readLong());
    this.zzb = paramParcel.readString();
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zzc = str;
    this.zzd = paramParcel.createByteArray();
  }
  
  public zzac(UUID paramUUID, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramUUID);
    this.zza = paramUUID;
    this.zzb = null;
    this.zzc = paramString2;
    this.zzd = paramArrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzac)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (zzac)paramObject;
    return (zzfn.zzB(this.zzb, ((zzac)paramObject).zzb)) && (zzfn.zzB(this.zzc, ((zzac)paramObject).zzc)) && (zzfn.zzB(this.zza, ((zzac)paramObject).zza)) && (Arrays.equals(this.zzd, ((zzac)paramObject).zzd));
  }
  
  public final int hashCode()
  {
    int j = this.zze;
    int i = j;
    if (j == 0)
    {
      j = this.zza.hashCode();
      String str = this.zzb;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      i = ((j * 31 + i) * 31 + this.zzc.hashCode()) * 31 + Arrays.hashCode(this.zzd);
      this.zze = i;
    }
    return i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.zza.getMostSignificantBits());
    paramParcel.writeLong(this.zza.getLeastSignificantBits());
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    paramParcel.writeByteArray(this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */