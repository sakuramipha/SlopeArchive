package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzj> CREATOR = new zzk();
  public final boolean zza;
  public final boolean zzb;
  public final String zzc;
  public final boolean zzd;
  public final float zze;
  public final int zzf;
  public final boolean zzg;
  public final boolean zzh;
  public final boolean zzi;
  
  zzj(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.zza = paramBoolean1;
    this.zzb = paramBoolean2;
    this.zzc = paramString;
    this.zzd = paramBoolean3;
    this.zze = paramFloat;
    this.zzf = paramInt;
    this.zzg = paramBoolean4;
    this.zzh = paramBoolean5;
    this.zzi = paramBoolean6;
  }
  
  public zzj(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    this(paramBoolean1, paramBoolean2, null, paramBoolean3, paramFloat, -1, paramBoolean4, paramBoolean5, paramBoolean6);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zza);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzc, false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzd);
    SafeParcelWriter.writeFloat(paramParcel, 6, this.zze);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzf);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzg);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzh);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzi);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */