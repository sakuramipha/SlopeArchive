package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzaep
  extends zzaef
{
  public static final Parcelable.Creator<zzaep> CREATOR = new zzaeo();
  public final String zza;
  public final String zzb;
  
  zzaep(Parcel paramParcel)
  {
    super(str);
    this.zza = paramParcel.readString();
    this.zzb = paramParcel.readString();
  }
  
  public zzaep(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.zza = paramString2;
    this.zzb = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaep)paramObject;
      if ((this.zzf.equals(((zzaep)paramObject).zzf)) && (zzfn.zzB(this.zza, ((zzaep)paramObject).zza)) && (zzfn.zzB(this.zzb, ((zzaep)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zzf.hashCode();
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
    return ((k + 527) * 31 + i) * 31 + j;
  }
  
  public final String toString()
  {
    String str1 = this.zzf;
    String str2 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(": url=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zzf);
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */