package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

public final class zzgm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgm> CREATOR = new zzgn();
  private zzen zza;
  private zzdw zzb;
  private zzec zzc;
  private String zzd;
  private String zze;
  private byte[] zzf;
  private zzdz zzg;
  private byte[] zzh;
  private ConnectionOptions zzi;
  
  private zzgm() {}
  
  zzgm(IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, String paramString1, String paramString2, byte[] paramArrayOfByte1, IBinder paramIBinder4, byte[] paramArrayOfByte2, ConnectionOptions paramConnectionOptions)
  {
    this.zza = paramIBinder1;
    this.zzb = paramIBinder2;
    this.zzc = paramIBinder3;
    this.zzd = paramString1;
    this.zze = paramString2;
    this.zzf = paramArrayOfByte1;
    this.zzg = paramIBinder4;
    this.zzh = paramArrayOfByte2;
    this.zzi = paramConnectionOptions;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgm))
    {
      paramObject = (zzgm)paramObject;
      if ((Objects.equal(this.zza, ((zzgm)paramObject).zza)) && (Objects.equal(this.zzb, ((zzgm)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzgm)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzgm)paramObject).zzd)) && (Objects.equal(this.zze, ((zzgm)paramObject).zze)) && (Arrays.equals(this.zzf, ((zzgm)paramObject).zzf)) && (Objects.equal(this.zzg, ((zzgm)paramObject).zzg)) && (Arrays.equals(this.zzh, ((zzgm)paramObject).zzh)) && (Objects.equal(this.zzi, ((zzgm)paramObject).zzi))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Object localObject1 = this.zza;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzen)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 1, (IBinder)localObject1, false);
    localObject1 = this.zzb;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzdw)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject1, false);
    localObject1 = this.zzc;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zzec)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 3, (IBinder)localObject1, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeByteArray(paramParcel, 6, this.zzf, false);
    localObject1 = this.zzg;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((zzdz)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 7, (IBinder)localObject1, false);
    SafeParcelWriter.writeByteArray(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.writeParcelable(paramParcel, 9, this.zzi, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */