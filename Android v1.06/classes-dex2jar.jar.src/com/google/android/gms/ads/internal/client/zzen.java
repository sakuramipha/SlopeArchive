package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzen
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
  private final int zza;
  private final int zzb;
  private final String zzc;
  
  public zzen()
  {
    this(231710100, 231700000, "22.2.0");
  }
  
  public zzen(int paramInt1, int paramInt2, String paramString)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */