package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaeh
  extends zzaef
{
  public static final Parcelable.Creator<zzaeh> CREATOR = new zzaeg();
  public final String zza;
  public final String zzb;
  public final String zzc;
  
  zzaeh(Parcel paramParcel)
  {
    super("----");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readString();
    this.zzc = paramParcel.readString();
  }
  
  public zzaeh(String paramString1, String paramString2, String paramString3)
  {
    super("----");
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaeh)paramObject;
      if ((zzfn.zzB(this.zzb, ((zzaeh)paramObject).zzb)) && (zzfn.zzB(this.zza, ((zzaeh)paramObject).zza)) && (zzfn.zzB(this.zzc, ((zzaeh)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = this.zza;
    int k = 0;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    str = this.zzb;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.zzc;
    if (str != null) {
      k = str.hashCode();
    }
    return ((i + 527) * 31 + j) * 31 + k;
  }
  
  public final String toString()
  {
    String str3 = this.zzf;
    String str2 = this.zza;
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str3);
    localStringBuilder.append(": domain=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", description=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zzf);
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */