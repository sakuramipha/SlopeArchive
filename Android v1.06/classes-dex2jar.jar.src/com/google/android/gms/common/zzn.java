package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzn
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzn> CREATOR = new zzo();
  private final String zza;
  private final boolean zzb;
  private final boolean zzc;
  private final Context zzd;
  private final boolean zze;
  
  zzn(String paramString, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder, boolean paramBoolean3)
  {
    this.zza = paramString;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = ((Context)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder)));
    this.zze = paramBoolean3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeIBinder(paramParcel, 4, ObjectWrapper.wrap(this.zzd), false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zze);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */