package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.BleSignal;

public final class zza
  extends AbstractSafeParcelable
  implements BleSignal
{
  public static final Parcelable.Creator<zza> CREATOR = new zzb();
  final int zza;
  final int zzb;
  final int zzc;
  
  zza(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    if ((paramInt3 <= 65367) || (paramInt3 >= 87)) {
      paramInt3 = Integer.MIN_VALUE;
    }
    this.zzc = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof BleSignal)) {
      return false;
    }
    paramObject = (BleSignal)paramObject;
    return (this.zzb == ((BleSignal)paramObject).getRssi()) && (this.zzc == ((BleSignal)paramObject).getTxPower());
  }
  
  public final int getRssi()
  {
    return this.zzb;
  }
  
  public final int getTxPower()
  {
    return this.zzc;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzb), Integer.valueOf(this.zzc) });
  }
  
  public final String toString()
  {
    int i = this.zzb;
    int j = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder(48);
    localStringBuilder.append("BleSignal{rssi=");
    localStringBuilder.append(i);
    localStringBuilder.append(", txPower=");
    localStringBuilder.append(j);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */