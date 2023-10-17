package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbwd
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbwd> CREATOR = new zzbwe();
  public final String zza;
  public final String zzb;
  
  public zzbwd(ServerSideVerificationOptions paramServerSideVerificationOptions)
  {
    this(paramServerSideVerificationOptions.getUserId(), paramServerSideVerificationOptions.getCustomData());
  }
  
  public zzbwd(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */