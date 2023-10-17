package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfkb
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfkb> CREATOR = new zzfkc();
  public final int zza;
  public final String zzb;
  public final String zzc;
  
  zzfkb(int paramInt, String paramString1, String paramString2)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
  }
  
  public zzfkb(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */