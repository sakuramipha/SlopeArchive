package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzv
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzv> CREATOR = new zzw();
  private zzen zza;
  private long zzb;
  
  private zzv() {}
  
  zzv(IBinder paramIBinder, long paramLong)
  {
    this.zza = paramIBinder;
    this.zzb = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzv))
    {
      paramObject = (zzv)paramObject;
      if ((Objects.equal(this.zza, ((zzv)paramObject).zza)) && (Objects.equal(Long.valueOf(this.zzb), Long.valueOf(((zzv)paramObject).zzb)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Long.valueOf(this.zzb) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    Object localObject = this.zza;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzen)localObject).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 1, (IBinder)localObject, false);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */