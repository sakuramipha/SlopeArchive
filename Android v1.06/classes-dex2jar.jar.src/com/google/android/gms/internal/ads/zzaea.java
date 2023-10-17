package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaea
  extends zzaef
{
  public static final Parcelable.Creator<zzaea> CREATOR = new zzadz();
  public final String zza;
  public final String zzb;
  public final String zzc;
  public final byte[] zzd;
  
  zzaea(Parcel paramParcel)
  {
    super("GEOB");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readString();
    this.zzc = paramParcel.readString();
    this.zzd = paramParcel.createByteArray();
  }
  
  public zzaea(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaea)paramObject;
      if ((zzfn.zzB(this.zza, ((zzaea)paramObject).zza)) && (zzfn.zzB(this.zzb, ((zzaea)paramObject).zzb)) && (zzfn.zzB(this.zzc, ((zzaea)paramObject).zzc)) && (Arrays.equals(this.zzd, ((zzaea)paramObject).zzd))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = this.zza;
    int k = 0;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    str = this.zzb;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.zzc;
    if (str != null) {
      k = str.hashCode();
    }
    return (((i + 527) * 31 + j) * 31 + k) * 31 + Arrays.hashCode(this.zzd);
  }
  
  public final String toString()
  {
    String str3 = this.zzf;
    String str4 = this.zza;
    String str1 = this.zzb;
    String str2 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str3);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", filename=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", description=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    paramParcel.writeByteArray(this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */