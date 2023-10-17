package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzhg
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhg> CREATOR = new zzhh();
  private final int zza;
  private final ParcelUuid zzb;
  private final ParcelUuid zzc;
  private final ParcelUuid zzd;
  private final byte[] zze;
  private final byte[] zzf;
  private final int zzg;
  private final byte[] zzh;
  private final byte[] zzi;
  
  zzhg(int paramInt1, ParcelUuid paramParcelUuid1, ParcelUuid paramParcelUuid2, ParcelUuid paramParcelUuid3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4)
  {
    this.zza = paramInt1;
    this.zzb = paramParcelUuid1;
    this.zzc = paramParcelUuid2;
    this.zzd = paramParcelUuid3;
    this.zze = paramArrayOfByte1;
    this.zzf = paramArrayOfByte2;
    this.zzg = paramInt2;
    this.zzh = paramArrayOfByte3;
    this.zzi = paramArrayOfByte4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzhg)paramObject;
      if ((this.zzg == ((zzhg)paramObject).zzg) && (Arrays.equals(this.zzh, ((zzhg)paramObject).zzh)) && (Arrays.equals(this.zzi, ((zzhg)paramObject).zzi)) && (Objects.equal(this.zzd, ((zzhg)paramObject).zzd)) && (Arrays.equals(this.zze, ((zzhg)paramObject).zze)) && (Arrays.equals(this.zzf, ((zzhg)paramObject).zzf)) && (Objects.equal(this.zzb, ((zzhg)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzhg)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), Integer.valueOf(Arrays.hashCode(this.zzi)), this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzb, this.zzc });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzb, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzd, paramInt, false);
    SafeParcelWriter.writeByteArray(paramParcel, 7, this.zze, false);
    SafeParcelWriter.writeByteArray(paramParcel, 8, this.zzf, false);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zzg);
    SafeParcelWriter.writeByteArray(paramParcel, 10, this.zzh, false);
    SafeParcelWriter.writeByteArray(paramParcel, 11, this.zzi, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */