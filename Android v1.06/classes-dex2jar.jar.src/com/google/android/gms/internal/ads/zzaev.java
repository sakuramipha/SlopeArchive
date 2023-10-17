package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaev
  implements zzbz
{
  public static final Parcelable.Creator<zzaev> CREATOR = new zzaet();
  public final long zza;
  public final long zzb;
  public final long zzc;
  public final long zzd;
  public final long zze;
  
  public zzaev(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    this.zza = paramLong1;
    this.zzb = paramLong2;
    this.zzc = paramLong3;
    this.zzd = paramLong4;
    this.zze = paramLong5;
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
      paramObject = (zzaev)paramObject;
      if ((this.zza == ((zzaev)paramObject).zza) && (this.zzb == ((zzaev)paramObject).zzb) && (this.zzc == ((zzaev)paramObject).zzc) && (this.zzd == ((zzaev)paramObject).zzd) && (this.zze == ((zzaev)paramObject).zze)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l2 = this.zza;
    long l4 = this.zzb;
    long l1 = this.zzc;
    long l5 = this.zzd;
    long l3 = this.zze;
    return (((((int)(l2 ^ l2 >>> 32) + 527) * 31 + (int)(l4 ^ l4 >>> 32)) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + (int)(l5 ^ l5 >>> 32)) * 31 + (int)(l3 ^ l3 >>> 32);
  }
  
  public final String toString()
  {
    long l4 = this.zza;
    long l3 = this.zzb;
    long l2 = this.zzc;
    long l5 = this.zzd;
    long l1 = this.zze;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Motion photo metadata: photoStartPosition=");
    localStringBuilder.append(l4);
    localStringBuilder.append(", photoSize=");
    localStringBuilder.append(l3);
    localStringBuilder.append(", photoPresentationTimestampUs=");
    localStringBuilder.append(l2);
    localStringBuilder.append(", videoStartPosition=");
    localStringBuilder.append(l5);
    localStringBuilder.append(", videoSize=");
    localStringBuilder.append(l1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.zza);
    paramParcel.writeLong(this.zzb);
    paramParcel.writeLong(this.zzc);
    paramParcel.writeLong(this.zzd);
    paramParcel.writeLong(this.zze);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */