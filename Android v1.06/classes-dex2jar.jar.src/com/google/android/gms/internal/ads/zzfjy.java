package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfjy
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfjy> CREATOR = new zzfjz();
  public final int zza;
  public final byte[] zzb;
  
  zzfjy(int paramInt, byte[] paramArrayOfByte)
  {
    this.zza = paramInt;
    this.zzb = paramArrayOfByte;
  }
  
  public zzfjy(byte[] paramArrayOfByte)
  {
    this(1, paramArrayOfByte);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeByteArray(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */