package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadq
  extends zzaef
{
  public static final Parcelable.Creator<zzadq> CREATOR = new zzadp();
  public final String zza;
  public final String zzb;
  public final int zzc;
  public final byte[] zzd;
  
  zzadq(Parcel paramParcel)
  {
    super("APIC");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readString();
    this.zzc = paramParcel.readInt();
    this.zzd = paramParcel.createByteArray();
  }
  
  public zzadq(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramInt;
    this.zzd = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzadq)paramObject;
      if ((this.zzc == ((zzadq)paramObject).zzc) && (zzfn.zzB(this.zza, ((zzadq)paramObject).zza)) && (zzfn.zzB(this.zzb, ((zzadq)paramObject).zzb)) && (Arrays.equals(this.zzd, ((zzadq)paramObject).zzd))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zzc;
    String str = this.zza;
    int j = 0;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    str = this.zzb;
    if (str != null) {
      j = str.hashCode();
    }
    return (((k + 527) * 31 + i) * 31 + j) * 31 + Arrays.hashCode(this.zzd);
  }
  
  public final String toString()
  {
    String str3 = this.zzf;
    String str1 = this.zza;
    String str2 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str3);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", description=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeInt(this.zzc);
    paramParcel.writeByteArray(this.zzd);
  }
  
  public final void zza(zzbu paramzzbu)
  {
    paramzzbu.zza(this.zzd, this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */