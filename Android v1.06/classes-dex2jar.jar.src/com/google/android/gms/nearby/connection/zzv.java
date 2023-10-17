package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzv
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzv> CREATOR = new zzw();
  private byte[] zza;
  private int zzb;
  private int zzc;
  
  private zzv() {}
  
  zzv(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.zza = paramArrayOfByte;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzv))
    {
      paramObject = (zzv)paramObject;
      if ((Arrays.equals(this.zza, ((zzv)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzv)paramObject).zzb))) && (Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(((zzv)paramObject).zzc)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc) });
  }
  
  public final String toString()
  {
    String str = Arrays.toString(this.zza);
    int j = this.zzb;
    int i = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
    localStringBuilder.append("UwbSenderInfo{address=");
    localStringBuilder.append(str);
    localStringBuilder.append(", channel=");
    localStringBuilder.append(j);
    localStringBuilder.append(", preambleIndex=");
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeByteArray(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */