package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbyo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbyo> CREATOR = new zzbyp();
  @Deprecated
  public final String zza;
  public final String zzb;
  @Deprecated
  public final zzq zzc;
  public final zzl zzd;
  
  public zzbyo(String paramString1, String paramString2, zzq paramzzq, zzl paramzzl)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramzzq;
    this.zzd = paramzzl;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */