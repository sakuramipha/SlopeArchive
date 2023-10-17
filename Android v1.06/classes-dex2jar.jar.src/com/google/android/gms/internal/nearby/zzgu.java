package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

public final class zzgu
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgu> CREATOR = new zzgv();
  private zzeq zza;
  private zzdt zzb;
  private String zzc;
  private String zzd;
  private long zze;
  private AdvertisingOptions zzf;
  private zzdz zzg;
  private byte[] zzh;
  
  private zzgu() {}
  
  zzgu(IBinder paramIBinder1, IBinder paramIBinder2, String paramString1, String paramString2, long paramLong, AdvertisingOptions paramAdvertisingOptions, IBinder paramIBinder3, byte[] paramArrayOfByte)
  {
    this.zza = paramIBinder1;
    this.zzb = paramIBinder2;
    this.zzc = paramString1;
    this.zzd = paramString2;
    this.zze = paramLong;
    this.zzf = paramAdvertisingOptions;
    this.zzg = paramIBinder3;
    this.zzh = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgu))
    {
      paramObject = (zzgu)paramObject;
      if ((Objects.equal(this.zza, ((zzgu)paramObject).zza)) && (Objects.equal(this.zzb, ((zzgu)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzgu)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzgu)paramObject).zzd)) && (Objects.equal(Long.valueOf(this.zze), Long.valueOf(((zzgu)paramObject).zze))) && (Objects.equal(this.zzf, ((zzgu)paramObject).zzf)) && (Objects.equal(this.zzg, ((zzgu)paramObject).zzg)) && (Arrays.equals(this.zzh, ((zzgu)paramObject).zzh))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, this.zzd, Long.valueOf(this.zze), this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Object localObject1 = this.zza;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzeq)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 1, (IBinder)localObject1, false);
    localObject1 = this.zzb;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzdt)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject1, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeLong(paramParcel, 5, this.zze);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    localObject1 = this.zzg;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((zzdz)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 7, (IBinder)localObject1, false);
    SafeParcelWriter.writeByteArray(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */