package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzt
  extends zza
{
  public static final Parcelable.Creator<zzt> CREATOR = new zzu();
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SafeParcelWriter.finishObjectHeader(paramParcel, SafeParcelWriter.beginObjectHeader(paramParcel));
  }
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    return (F)paramzzj.zzbk();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */