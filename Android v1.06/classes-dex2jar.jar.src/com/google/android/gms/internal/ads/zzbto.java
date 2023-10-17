package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbto
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbto> CREATOR = new zzbtp();
  public final String zza;
  public final int zzb;
  public final Bundle zzc;
  public final byte[] zzd;
  public final boolean zze;
  public final String zzf;
  public final String zzg;
  
  public zzbto(String paramString1, int paramInt, Bundle paramBundle, byte[] paramArrayOfByte, boolean paramBoolean, String paramString2, String paramString3)
  {
    this.zza = paramString1;
    this.zzb = paramInt;
    this.zzc = paramBundle;
    this.zzd = paramArrayOfByte;
    this.zze = paramBoolean;
    this.zzf = paramString2;
    this.zzg = paramString3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBundle(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeByteArray(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zze);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */