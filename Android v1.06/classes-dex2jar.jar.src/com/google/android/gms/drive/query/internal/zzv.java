package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.query.Filter;

public final class zzv
  extends zza
{
  public static final Parcelable.Creator<zzv> CREATOR = new zzw();
  private final FilterHolder zzmp;
  
  public zzv(Filter paramFilter)
  {
    this(new FilterHolder(paramFilter));
  }
  
  zzv(FilterHolder paramFilterHolder)
  {
    this.zzmp = paramFilterHolder;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzmp, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final <T> T zza(zzj<T> paramzzj)
  {
    return (T)paramzzj.zza(this.zzmp.getFilter().zza(paramzzj));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */