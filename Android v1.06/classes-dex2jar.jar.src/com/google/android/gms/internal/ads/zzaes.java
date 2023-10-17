package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaes
  implements zzbz
{
  public static final Parcelable.Creator<zzaes> CREATOR = new zzaeq();
  public final String zza;
  public final byte[] zzb;
  public final int zzc;
  public final int zzd;
  
  public zzaes(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.zza = paramString;
    this.zzb = paramArrayOfByte;
    this.zzc = paramInt1;
    this.zzd = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaes)paramObject;
      if ((this.zza.equals(((zzaes)paramObject).zza)) && (Arrays.equals(this.zzb, ((zzaes)paramObject).zzb)) && (this.zzc == ((zzaes)paramObject).zzc) && (this.zzd == ((zzaes)paramObject).zzd)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((this.zza.hashCode() + 527) * 31 + Arrays.hashCode(this.zzb)) * 31 + this.zzc) * 31 + this.zzd;
  }
  
  public final String toString()
  {
    String str = this.zza;
    Object localObject = this.zzb;
    int i = localObject.length;
    StringBuilder localStringBuilder = new StringBuilder(i + i);
    for (i = 0; i < localObject.length; i++)
    {
      localStringBuilder.append(Character.forDigit(localObject[i] >> 4 & 0xF, 16));
      localStringBuilder.append(Character.forDigit(localObject[i] & 0xF, 16));
    }
    localObject = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("mdta: key=");
    localStringBuilder.append(str);
    localStringBuilder.append(", value=");
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeByteArray(this.zzb);
    paramParcel.writeInt(this.zzc);
    paramParcel.writeInt(this.zzd);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */