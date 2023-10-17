package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzm
  implements Parcelable.Creator<GetServiceRequest>
{
  static void zza(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, paramGetServiceRequest.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, paramGetServiceRequest.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, paramGetServiceRequest.zzc);
    SafeParcelWriter.writeString(paramParcel, 4, paramGetServiceRequest.zzd, false);
    SafeParcelWriter.writeIBinder(paramParcel, 5, paramGetServiceRequest.zze, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 6, paramGetServiceRequest.zzf, paramInt, false);
    SafeParcelWriter.writeBundle(paramParcel, 7, paramGetServiceRequest.zzg, false);
    SafeParcelWriter.writeParcelable(paramParcel, 8, paramGetServiceRequest.zzh, paramInt, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 10, paramGetServiceRequest.zzi, paramInt, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 11, paramGetServiceRequest.zzj, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 12, paramGetServiceRequest.zzk);
    SafeParcelWriter.writeInt(paramParcel, 13, paramGetServiceRequest.zzl);
    SafeParcelWriter.writeBoolean(paramParcel, 14, paramGetServiceRequest.zzm);
    SafeParcelWriter.writeString(paramParcel, 15, paramGetServiceRequest.zza(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */