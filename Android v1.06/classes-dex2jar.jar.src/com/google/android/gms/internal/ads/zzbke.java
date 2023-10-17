package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbke
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbke> CREATOR = new zzbkf();
  public final String zza;
  public final boolean zzb;
  public final int zzc;
  public final String zzd;
  
  public zzbke(String paramString1, boolean paramBoolean, int paramInt, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramBoolean;
    this.zzc = paramInt;
    this.zzd = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */