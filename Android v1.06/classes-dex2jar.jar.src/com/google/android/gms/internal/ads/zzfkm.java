package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzfkm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfkm> CREATOR = new zzfkn();
  public final int zza;
  public final byte[] zzb;
  public final int zzc;
  
  zzfkm(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    this.zza = paramInt1;
    if (paramArrayOfByte == null) {
      paramArrayOfByte = null;
    } else {
      paramArrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    }
    this.zzb = paramArrayOfByte;
    this.zzc = paramInt2;
  }
  
  public zzfkm(byte[] paramArrayOfByte, int paramInt)
  {
    this(1, null, 1);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeByteArray(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */