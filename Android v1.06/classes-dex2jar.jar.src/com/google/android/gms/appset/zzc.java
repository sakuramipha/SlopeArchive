package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzc> CREATOR = new zzd();
  private final String zza;
  private final int zzb;
  
  public zzc(String paramString, int paramInt)
  {
    this.zza = paramString;
    this.zzb = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return this.zzb;
  }
  
  public final String zzb()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\appset\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */