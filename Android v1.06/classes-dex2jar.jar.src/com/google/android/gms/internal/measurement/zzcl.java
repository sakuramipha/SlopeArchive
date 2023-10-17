package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
  public final long zza;
  public final long zzb;
  public final boolean zzc;
  public final String zzd;
  public final String zze;
  public final String zzf;
  public final Bundle zzg;
  public final String zzh;
  
  public zzcl(long paramLong1, long paramLong2, boolean paramBoolean, String paramString1, String paramString2, String paramString3, Bundle paramBundle, String paramString4)
  {
    this.zza = paramLong1;
    this.zzb = paramLong2;
    this.zzc = paramBoolean;
    this.zzd = paramString1;
    this.zze = paramString2;
    this.zzf = paramString3;
    this.zzg = paramBundle;
    this.zzh = paramString4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 1, this.zza);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeBundle(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */