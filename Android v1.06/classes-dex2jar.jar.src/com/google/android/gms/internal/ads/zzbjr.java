package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbjr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbjr> CREATOR = new zzbjs();
  public final String zza;
  public final String[] zzb;
  public final String[] zzc;
  
  zzbjr(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.zza = paramString;
    this.zzb = paramArrayOfString1;
    this.zzc = paramArrayOfString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeStringArray(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeStringArray(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */