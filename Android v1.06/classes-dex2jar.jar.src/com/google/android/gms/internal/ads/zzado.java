package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzado
  implements zzbz
{
  public static final Parcelable.Creator<zzado> CREATOR = new zzadn();
  public final int zza;
  public final String zzb;
  public final String zzc;
  public final String zzd;
  public final boolean zze;
  public final int zzf;
  
  public zzado(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt2 != -1) {
      if (paramInt2 > 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    zzdy.zzd(bool1);
    this.zza = paramInt1;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramString3;
    this.zze = paramBoolean;
    this.zzf = paramInt2;
  }
  
  zzado(Parcel paramParcel)
  {
    this.zza = paramParcel.readInt();
    this.zzb = paramParcel.readString();
    this.zzc = paramParcel.readString();
    this.zzd = paramParcel.readString();
    int i = zzfn.zza;
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.zze = bool;
    this.zzf = paramParcel.readInt();
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
      paramObject = (zzado)paramObject;
      if ((this.zza == ((zzado)paramObject).zza) && (zzfn.zzB(this.zzb, ((zzado)paramObject).zzb)) && (zzfn.zzB(this.zzc, ((zzado)paramObject).zzc)) && (zzfn.zzB(this.zzd, ((zzado)paramObject).zzd)) && (this.zze == ((zzado)paramObject).zze) && (this.zzf == ((zzado)paramObject).zzf)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int m = this.zza;
    String str = this.zzb;
    int k = 0;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    str = this.zzc;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.zzd;
    if (str != null) {
      k = str.hashCode();
    }
    return (((((m + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + this.zze) * 31 + this.zzf;
  }
  
  public final String toString()
  {
    String str1 = this.zzc;
    String str2 = this.zzb;
    int i = this.zza;
    int j = this.zzf;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IcyHeaders: name=\"");
    localStringBuilder.append(str1);
    localStringBuilder.append("\", genre=\"");
    localStringBuilder.append(str2);
    localStringBuilder.append("\", bitrate=");
    localStringBuilder.append(i);
    localStringBuilder.append(", metadataInterval=");
    localStringBuilder.append(j);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeString(this.zzc);
    paramParcel.writeString(this.zzd);
    paramInt = this.zze;
    int i = zzfn.zza;
    paramParcel.writeInt(paramInt);
    paramParcel.writeInt(this.zzf);
  }
  
  public final void zza(zzbu paramzzbu)
  {
    String str = this.zzc;
    if (str != null) {
      paramzzbu.zzp(str);
    }
    str = this.zzb;
    if (str != null) {
      paramzzbu.zzi(str);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzado.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */