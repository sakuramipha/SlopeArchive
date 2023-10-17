package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbvd
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbvd> CREATOR = new zzbve();
  public final zzl zza;
  public final String zzb;
  
  public zzbvd(zzl paramzzl, String paramString)
  {
    this.zza = paramzzl;
    this.zzb = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zza, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */