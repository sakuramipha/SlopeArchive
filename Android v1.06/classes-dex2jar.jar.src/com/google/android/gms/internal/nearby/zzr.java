package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private zzen zza;
  private zzdw zzb;
  private String zzc;
  private byte[] zzd;
  private zzek zze;
  
  private zzr() {}
  
  zzr(IBinder paramIBinder1, IBinder paramIBinder2, String paramString, byte[] paramArrayOfByte, IBinder paramIBinder3)
  {
    this.zza = paramIBinder1;
    this.zzb = paramIBinder2;
    this.zzc = paramString;
    this.zzd = paramArrayOfByte;
    this.zze = paramIBinder3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzr))
    {
      paramObject = (zzr)paramObject;
      if ((Objects.equal(this.zza, ((zzr)paramObject).zza)) && (Objects.equal(this.zzb, ((zzr)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzr)paramObject).zzc)) && (Arrays.equals(this.zzd, ((zzr)paramObject).zzd)) && (Objects.equal(this.zze, ((zzr)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), this.zze });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
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
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeByteArray(paramParcel, 4, this.zzd, false);
    localObject1 = this.zze;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((zzek)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 5, (IBinder)localObject1, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */