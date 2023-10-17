package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbko
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbko> CREATOR = new zzbkp();
  public final String zza;
  public final Bundle zzb;
  
  public zzbko(String paramString, Bundle paramBundle)
  {
    this.zza = paramString;
    this.zzb = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeBundle(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */