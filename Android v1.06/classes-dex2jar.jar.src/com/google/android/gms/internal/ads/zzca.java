package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class zzca
  implements Parcelable
{
  public static final Parcelable.Creator<zzca> CREATOR = new zzby();
  public final long zza;
  private final zzbz[] zzb;
  
  public zzca(long paramLong, zzbz... paramVarArgs)
  {
    this.zza = paramLong;
    this.zzb = paramVarArgs;
  }
  
  zzca(Parcel paramParcel)
  {
    this.zzb = new zzbz[paramParcel.readInt()];
    for (int i = 0;; i++)
    {
      zzbz[] arrayOfzzbz = this.zzb;
      if (i >= arrayOfzzbz.length) {
        break;
      }
      arrayOfzzbz[i] = ((zzbz)paramParcel.readParcelable(zzbz.class.getClassLoader()));
    }
    this.zza = paramParcel.readLong();
  }
  
  public zzca(List paramList)
  {
    this(-9223372036854775807L, (zzbz[])paramList.toArray(new zzbz[0]));
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
      paramObject = (zzca)paramObject;
      if ((Arrays.equals(this.zzb, ((zzca)paramObject).zzb)) && (this.zza == ((zzca)paramObject).zza)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(this.zzb);
    long l = this.zza;
    return i * 31 + (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    String str = Arrays.toString(this.zzb);
    long l = this.zza;
    Object localObject;
    if (l == -9223372036854775807L)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", presentationTimeUs=");
      ((StringBuilder)localObject).append(l);
      localObject = ((StringBuilder)localObject).toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("entries=");
    localStringBuilder.append(str);
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.zzb.length);
    zzbz[] arrayOfzzbz = this.zzb;
    int i = arrayOfzzbz.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfzzbz[paramInt], 0);
    }
    paramParcel.writeLong(this.zza);
  }
  
  public final int zza()
  {
    return this.zzb.length;
  }
  
  public final zzbz zzb(int paramInt)
  {
    return this.zzb[paramInt];
  }
  
  public final zzca zzc(zzbz... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i == 0) {
      return this;
    }
    long l = this.zza;
    Object localObject = this.zzb;
    int j = zzfn.zza;
    j = localObject.length;
    localObject = Arrays.copyOf((Object[])localObject, j + i);
    System.arraycopy(paramVarArgs, 0, localObject, j, i);
    return new zzca(l, (zzbz[])localObject);
  }
  
  public final zzca zzd(zzca paramzzca)
  {
    if (paramzzca == null) {
      return this;
    }
    return zzc(paramzzca.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */