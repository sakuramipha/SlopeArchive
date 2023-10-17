package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfkk
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfkk> CREATOR = new zzfkl();
  public final int zza;
  public final int zzb;
  public final String zzc;
  public final String zzd;
  public final int zze;
  
  zzfkk(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramString1;
    this.zzd = paramString2;
    this.zze = paramInt3;
  }
  
  public zzfkk(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this(1, 1, paramInt2 - 1, paramString1, paramString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zze);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */