package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public class zzadm
  implements zzbz
{
  public static final Parcelable.Creator<zzadm> CREATOR = new zzadl();
  public final String zza;
  public final String zzb;
  
  protected zzadm(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readString();
  }
  
  public zzadm(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
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
      paramObject = (zzadm)paramObject;
      if ((this.zza.equals(((zzadm)paramObject).zza)) && (this.zzb.equals(((zzadm)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.zza.hashCode() + 527) * 31 + this.zzb.hashCode();
  }
  
  public final String toString()
  {
    String str2 = this.zza;
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VC: ");
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeString(this.zzb);
  }
  
  public final void zza(zzbu paramzzbu)
  {
    String str = this.zza;
    switch (str.hashCode())
    {
    default: 
      break;
    case 1939198791: 
      if (str.equals("ARTIST")) {
        i = 1;
      }
      break;
    case 1746739798: 
      if (str.equals("ALBUMARTIST")) {
        i = 3;
      }
      break;
    case 428414940: 
      if (str.equals("DESCRIPTION")) {
        i = 4;
      }
      break;
    case 79833656: 
      if (str.equals("TITLE")) {
        i = 0;
      }
      break;
    case 62359119: 
      if (str.equals("ALBUM")) {
        i = 2;
      }
      break;
    }
    int i = -1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              return;
            }
            paramzzbu.zzh(this.zzb);
            return;
          }
          paramzzbu.zzc(this.zzb);
          return;
        }
        paramzzbu.zzd(this.zzb);
        return;
      }
      paramzzbu.zze(this.zzb);
      return;
    }
    paramzzbu.zzq(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */