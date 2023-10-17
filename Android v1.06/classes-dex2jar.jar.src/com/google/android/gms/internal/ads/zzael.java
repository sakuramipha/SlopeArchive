package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzael
  extends zzaef
{
  public static final Parcelable.Creator<zzael> CREATOR = new zzaek();
  public final String zza;
  public final byte[] zzb;
  
  zzael(Parcel paramParcel)
  {
    super("PRIV");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.createByteArray();
  }
  
  public zzael(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    this.zza = paramString;
    this.zzb = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzael)paramObject;
      if ((zzfn.zzB(this.zza, ((zzael)paramObject).zza)) && (Arrays.equals(this.zzb, ((zzael)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = this.zza;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return (i + 527) * 31 + Arrays.hashCode(this.zzb);
  }
  
  public final String toString()
  {
    String str1 = this.zzf;
    String str2 = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(": owner=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeByteArray(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzael.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */