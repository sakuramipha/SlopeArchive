package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzu
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzu> CREATOR = new zzv();
  public final String zza;
  public long zzb;
  public zze zzc;
  public final Bundle zzd;
  public final String zze;
  public final String zzf;
  public final String zzg;
  public final String zzh;
  
  public zzu(String paramString1, long paramLong, zze paramzze, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.zza = paramString1;
    this.zzb = paramLong;
    this.zzc = paramzze;
    this.zzd = paramBundle;
    this.zze = paramString2;
    this.zzf = paramString3;
    this.zzg = paramString4;
    this.zzh = paramString5;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeBundle(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */