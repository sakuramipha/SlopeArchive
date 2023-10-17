package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzfi
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfi> CREATOR = new zzfj();
  private String zza;
  private String zzb;
  private String zzc;
  private BluetoothDevice zzd;
  private byte[] zze;
  
  private zzfi() {}
  
  zzfi(String paramString1, String paramString2, String paramString3, BluetoothDevice paramBluetoothDevice, byte[] paramArrayOfByte)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramBluetoothDevice;
    this.zze = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfi))
    {
      paramObject = (zzfi)paramObject;
      if ((Objects.equal(this.zza, ((zzfi)paramObject).zza)) && (Objects.equal(this.zzb, ((zzfi)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzfi)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzfi)paramObject).zzd)) && (Arrays.equals(this.zze, ((zzfi)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeByteArray(paramParcel, 5, this.zze, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzc;
  }
  
  public final BluetoothDevice zzd()
  {
    return this.zzd;
  }
  
  public final byte[] zze()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */