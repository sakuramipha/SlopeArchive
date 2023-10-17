package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzz
  extends zza
{
  public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SafeParcelWriter.finishObjectHeader(paramParcel, SafeParcelWriter.beginObjectHeader(paramParcel));
  }
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    return (F)paramzzj.zzbj();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */