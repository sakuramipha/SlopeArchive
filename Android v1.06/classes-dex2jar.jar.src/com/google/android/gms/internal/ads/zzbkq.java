package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbkq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbkq> CREATOR = new zzbkr();
  public final int zza;
  public final int zzb;
  public final String zzc;
  public final int zzd;
  
  public zzbkq(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramString;
    this.zzd = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzc, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */