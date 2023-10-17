package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbjt
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbjt> CREATOR = new zzbju();
  public final boolean zza;
  public final String zzb;
  public final int zzc;
  public final byte[] zzd;
  public final String[] zze;
  public final String[] zzf;
  public final boolean zzg;
  public final long zzh;
  
  zzbjt(boolean paramBoolean1, String paramString, int paramInt, byte[] paramArrayOfByte, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean2, long paramLong)
  {
    this.zza = paramBoolean1;
    this.zzb = paramString;
    this.zzc = paramInt;
    this.zzd = paramArrayOfByte;
    this.zze = paramArrayOfString1;
    this.zzf = paramArrayOfString2;
    this.zzg = paramBoolean2;
    this.zzh = paramLong;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeByteArray(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeStringArray(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeStringArray(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeLong(paramParcel, 8, this.zzh);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */