package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

public final class zzgy
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgy> CREATOR = new zzgz();
  private zzen zza;
  private String zzb;
  private long zzc;
  private DiscoveryOptions zzd;
  private zzeg zze;
  private zzed zzf;
  
  private zzgy() {}
  
  zzgy(IBinder paramIBinder1, IBinder paramIBinder2, String paramString, long paramLong, DiscoveryOptions paramDiscoveryOptions, IBinder paramIBinder3)
  {
    this.zza = paramIBinder1;
    this.zzf = paramIBinder2;
    this.zzb = paramString;
    this.zzc = paramLong;
    this.zzd = paramDiscoveryOptions;
    this.zze = paramIBinder3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgy))
    {
      paramObject = (zzgy)paramObject;
      if ((Objects.equal(this.zza, ((zzgy)paramObject).zza)) && (Objects.equal(this.zzf, ((zzgy)paramObject).zzf)) && (Objects.equal(this.zzb, ((zzgy)paramObject).zzb)) && (Objects.equal(Long.valueOf(this.zzc), Long.valueOf(((zzgy)paramObject).zzc))) && (Objects.equal(this.zzd, ((zzgy)paramObject).zzd)) && (Objects.equal(this.zze, ((zzgy)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzf, this.zzb, Long.valueOf(this.zzc), this.zzd, this.zze });
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
    localObject1 = this.zzf;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((zza)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject1, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzb, false);
    SafeParcelWriter.writeLong(paramParcel, 4, this.zzc);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzd, paramInt, false);
    localObject1 = this.zze;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((zzeg)localObject1).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 6, (IBinder)localObject1, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */