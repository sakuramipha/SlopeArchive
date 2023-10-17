package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.drive.zzez;
import com.google.android.gms.internal.drive.zzez.zza;
import com.google.android.gms.internal.drive.zzit;
import com.google.android.gms.internal.drive.zzkk.zza;

public class zza
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zza> CREATOR = new zzb();
  private final long zze;
  private final long zzf;
  private final long zzg;
  private volatile String zzh = null;
  
  public zza(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramLong1 != -1L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1);
    if (paramLong2 != -1L) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1);
    if (paramLong3 != -1L) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1);
    this.zze = paramLong1;
    this.zzf = paramLong2;
    this.zzg = paramLong3;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == zza.class))
    {
      paramObject = (zza)paramObject;
      if ((((zza)paramObject).zzf == this.zzf) && (((zza)paramObject).zzg == this.zzg) && (((zza)paramObject).zze == this.zze)) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    String str1 = String.valueOf(this.zze);
    String str2 = String.valueOf(this.zzf);
    String str3 = String.valueOf(this.zzg);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
    localStringBuilder.append(str1);
    localStringBuilder.append(str2);
    localStringBuilder.append(str3);
    return localStringBuilder.toString().hashCode();
  }
  
  public String toString()
  {
    if (this.zzh == null)
    {
      String str = String.valueOf(Base64.encodeToString(((zzez)zzez.zzaj().zzk(1).zzc(this.zze).zzd(this.zzf).zze(this.zzg).zzdf()).toByteArray(), 10));
      if (str.length() != 0) {
        str = "ChangeSequenceNumber:".concat(str);
      } else {
        str = new String("ChangeSequenceNumber:");
      }
      this.zzh = str;
    }
    return this.zzh;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zze);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzf);
    SafeParcelWriter.writeLong(paramParcel, 4, this.zzg);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */