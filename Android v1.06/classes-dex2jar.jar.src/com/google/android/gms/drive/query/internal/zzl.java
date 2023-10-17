package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzl
  extends zza
{
  public static final Parcelable.Creator<zzl> CREATOR = new zzm();
  private final String value;
  
  public zzl(String paramString)
  {
    this.value = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.value, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    return (F)paramzzj.zzi(this.value);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */