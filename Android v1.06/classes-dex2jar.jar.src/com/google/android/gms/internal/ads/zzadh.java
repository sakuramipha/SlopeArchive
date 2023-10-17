package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadh
  implements zzbz
{
  public static final Parcelable.Creator<zzadh> CREATOR = new zzadg();
  private static final zzam zzf;
  private static final zzam zzg;
  public final String zza;
  public final String zzb;
  public final long zzc;
  public final long zzd;
  public final byte[] zze;
  private int zzh;
  
  static
  {
    zzak localzzak = new zzak();
    localzzak.zzS("application/id3");
    zzf = localzzak.zzY();
    localzzak = new zzak();
    localzzak.zzS("application/x-scte35");
    zzg = localzzak.zzY();
  }
  
  zzadh(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readString();
    this.zzc = paramParcel.readLong();
    this.zzd = paramParcel.readLong();
    this.zze = paramParcel.createByteArray();
  }
  
  public zzadh(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramLong1;
    this.zzd = paramLong2;
    this.zze = paramArrayOfByte;
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
      paramObject = (zzadh)paramObject;
      if ((this.zzc == ((zzadh)paramObject).zzc) && (this.zzd == ((zzadh)paramObject).zzd) && (zzfn.zzB(this.zza, ((zzadh)paramObject).zza)) && (zzfn.zzB(this.zzb, ((zzadh)paramObject).zzb)) && (Arrays.equals(this.zze, ((zzadh)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzh;
    int i = j;
    if (j == 0)
    {
      Object localObject = this.zza;
      j = 0;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      } else {
        i = 0;
      }
      localObject = this.zzb;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      }
      long l1 = this.zzc;
      long l2 = this.zzd;
      localObject = this.zze;
      i = ((((i + 527) * 31 + j) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + (int)(l2 ^ l2 >>> 32)) * 31 + Arrays.hashCode((byte[])localObject);
      this.zzh = i;
    }
    return i;
  }
  
  public final String toString()
  {
    String str2 = this.zza;
    long l1 = this.zzd;
    long l2 = this.zzc;
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EMSG: scheme=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", id=");
    localStringBuilder.append(l1);
    localStringBuilder.append(", durationMs=");
    localStringBuilder.append(l2);
    localStringBuilder.append(", value=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
    paramParcel.writeLong(this.zzc);
    paramParcel.writeLong(this.zzd);
    paramParcel.writeByteArray(this.zze);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */