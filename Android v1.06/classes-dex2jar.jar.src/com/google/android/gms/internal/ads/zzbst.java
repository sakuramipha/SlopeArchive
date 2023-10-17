package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbst
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbst> CREATOR = new zzbsu();
  public final View zza;
  public final Map zzb;
  
  public zzbst(IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this.zza = ((View)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder1)));
    this.zzb = ((Map)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder2)));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeIBinder(paramParcel, 1, ObjectWrapper.wrap(this.zza).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 2, ObjectWrapper.wrap(this.zzb).asBinder(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */