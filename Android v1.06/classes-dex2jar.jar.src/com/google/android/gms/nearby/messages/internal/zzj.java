package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzj> CREATOR = new zzk();
  public final int zza;
  @Deprecated
  public final ClientAppContext zzb;
  public final int zzc;
  
  zzj(int paramInt1, ClientAppContext paramClientAppContext, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = paramClientAppContext;
    this.zzc = paramInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */