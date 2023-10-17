package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadk
  implements zzbz
{
  public static final Parcelable.Creator<zzadk> CREATOR = new zzadj();
  public final int zza;
  public final String zzb;
  public final String zzc;
  public final int zzd;
  public final int zze;
  public final int zzf;
  public final int zzg;
  public final byte[] zzh;
  
  public zzadk(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfByte)
  {
    this.zza = paramInt1;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramInt2;
    this.zze = paramInt3;
    this.zzf = paramInt4;
    this.zzg = paramInt5;
    this.zzh = paramArrayOfByte;
  }
  
  zzadk(Parcel paramParcel)
  {
    this.zza = paramParcel.readInt();
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zzb = str;
    this.zzc = paramParcel.readString();
    this.zzd = paramParcel.readInt();
    this.zze = paramParcel.readInt();
    this.zzf = paramParcel.readInt();
    this.zzg = paramParcel.readInt();
    this.zzh = paramParcel.createByteArray();
  }
  
  public static zzadk zzb(zzfd paramzzfd)
  {
    int k = paramzzfd.zze();
    String str1 = paramzzfd.zzx(paramzzfd.zze(), zzfol.zza);
    String str2 = paramzzfd.zzx(paramzzfd.zze(), zzfol.zzc);
    int j = paramzzfd.zze();
    int n = paramzzfd.zze();
    int m = paramzzfd.zze();
    int i = paramzzfd.zze();
    int i1 = paramzzfd.zze();
    byte[] arrayOfByte = new byte[i1];
    paramzzfd.zzB(arrayOfByte, 0, i1);
    return new zzadk(k, str1, str2, j, n, m, i, arrayOfByte);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzadk)paramObject;
      if ((this.zza == ((zzadk)paramObject).zza) && (this.zzb.equals(((zzadk)paramObject).zzb)) && (this.zzc.equals(((zzadk)paramObject).zzc)) && (this.zzd == ((zzadk)paramObject).zzd) && (this.zze == ((zzadk)paramObject).zze) && (this.zzf == ((zzadk)paramObject).zzf) && (this.zzg == ((zzadk)paramObject).zzg) && (Arrays.equals(this.zzh, ((zzadk)paramObject).zzh))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((((((this.zza + 527) * 31 + this.zzb.hashCode()) * 31 + this.zzc.hashCode()) * 31 + this.zzd) * 31 + this.zze) * 31 + this.zzf) * 31 + this.zzg) * 31 + Arrays.hashCode(this.zzh);
  }
  
  public final String toString()
  {
    String str1 = this.zzb;
    String str2 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Picture: mimeType=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", description=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    paramParcel.writeInt(this.zzd);
    paramParcel.writeInt(this.zze);
    paramParcel.writeInt(this.zzf);
    paramParcel.writeInt(this.zzg);
    paramParcel.writeByteArray(this.zzh);
  }
  
  public final void zza(zzbu paramzzbu)
  {
    paramzzbu.zza(this.zzh, this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */