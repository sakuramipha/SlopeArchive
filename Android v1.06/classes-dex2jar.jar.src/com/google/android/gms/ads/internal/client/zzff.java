package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzff
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
  public final int zza;
  public final int zzb;
  
  public zzff(int paramInt1, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
  }
  
  public zzff(RequestConfiguration paramRequestConfiguration)
  {
    this.zza = paramRequestConfiguration.getTagForChildDirectedTreatment();
    this.zzb = paramRequestConfiguration.getTagForUnderAgeOfConsent();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */