package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class zzad
  implements Comparator<zzac>, Parcelable
{
  public static final Parcelable.Creator<zzad> CREATOR = new zzaa();
  public final String zza;
  public final int zzb;
  private final zzac[] zzc;
  private int zzd;
  
  zzad(Parcel paramParcel)
  {
    this.zza = paramParcel.readString();
    paramParcel = (zzac[])paramParcel.createTypedArray(zzac.CREATOR);
    int i = zzfn.zza;
    this.zzc = paramParcel;
    this.zzb = paramParcel.length;
  }
  
  private zzad(String paramString, boolean paramBoolean, zzac... paramVarArgs)
  {
    this.zza = paramString;
    paramString = paramVarArgs;
    if (paramBoolean) {
      paramString = (zzac[])paramVarArgs.clone();
    }
    this.zzc = paramString;
    this.zzb = paramString.length;
    Arrays.sort(paramString, this);
  }
  
  public zzad(String paramString, zzac... paramVarArgs)
  {
    this(null, true, paramVarArgs);
  }
  
  public zzad(List paramList)
  {
    this(null, false, (zzac[])paramList.toArray(new zzac[0]));
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
      paramObject = (zzad)paramObject;
      if ((zzfn.zzB(this.zza, ((zzad)paramObject).zza)) && (Arrays.equals(this.zzc, ((zzad)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzd;
    int i = j;
    if (j == 0)
    {
      String str = this.zza;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      i = i * 31 + Arrays.hashCode(this.zzc);
      this.zzd = i;
    }
    return i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeTypedArray(this.zzc, 0);
  }
  
  public final zzac zza(int paramInt)
  {
    return this.zzc[paramInt];
  }
  
  public final zzad zzb(String paramString)
  {
    if (zzfn.zzB(this.zza, paramString)) {
      return this;
    }
    return new zzad(paramString, false, this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */