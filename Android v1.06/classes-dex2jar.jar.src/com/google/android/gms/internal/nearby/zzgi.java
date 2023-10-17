package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzgi
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgi> CREATOR = new zzgj();
  private zzen zza;
  private String zzb;
  
  private zzgi() {}
  
  zzgi(IBinder paramIBinder, String paramString)
  {
    this.zza = paramIBinder;
    this.zzb = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgi))
    {
      paramObject = (zzgi)paramObject;
      if ((Objects.equal(this.zza, ((zzgi)paramObject).zza)) && (Objects.equal(this.zzb, ((zzgi)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb });
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
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */