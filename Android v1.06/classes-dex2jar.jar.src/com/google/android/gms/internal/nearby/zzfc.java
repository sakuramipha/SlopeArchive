package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzfc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfc> CREATOR = new zzfd();
  private String zza;
  private int zzb;
  private byte[] zzc;
  
  private zzfc() {}
  
  zzfc(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    this.zza = paramString;
    this.zzb = paramInt;
    this.zzc = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfc))
    {
      paramObject = (zzfc)paramObject;
      if ((Objects.equal(this.zza, ((zzfc)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzfc)paramObject).zzb))) && (Arrays.equals(this.zzc, ((zzfc)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeByteArray(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */