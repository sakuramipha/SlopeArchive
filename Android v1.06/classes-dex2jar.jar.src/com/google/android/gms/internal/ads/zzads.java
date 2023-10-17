package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzads
  extends zzaef
{
  public static final Parcelable.Creator<zzads> CREATOR = new zzadr();
  public final byte[] zza;
  
  zzads(Parcel paramParcel)
  {
    super(str);
    this.zza = paramParcel.createByteArray();
  }
  
  public zzads(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    this.zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzads)paramObject;
      if ((this.zzf.equals(((zzads)paramObject).zzf)) && (Arrays.equals(this.zza, ((zzads)paramObject).zza))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.zzf.hashCode() + 527) * 31 + Arrays.hashCode(this.zza);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zzf);
    paramParcel.writeByteArray(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzads.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */