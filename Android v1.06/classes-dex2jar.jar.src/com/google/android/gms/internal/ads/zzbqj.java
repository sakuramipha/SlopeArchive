package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbqj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbqj> CREATOR = new zzbqk();
  public final int zza;
  public final int zzb;
  public final int zzc;
  
  zzbqj(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
  }
  
  public static zzbqj zza(VersionInfo paramVersionInfo)
  {
    return new zzbqj(paramVersionInfo.getMajorVersion(), paramVersionInfo.getMinorVersion(), paramVersionInfo.getMicroVersion());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof zzbqj))
    {
      paramObject = (zzbqj)paramObject;
      if ((((zzbqj)paramObject).zzc == this.zzc) && (((zzbqj)paramObject).zzb == this.zzb) && (((zzbqj)paramObject).zza == this.zza)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new int[] { this.zza, this.zzb, this.zzc });
  }
  
  public final String toString()
  {
    int i = this.zza;
    int k = this.zzb;
    int j = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i);
    localStringBuilder.append(".");
    localStringBuilder.append(k);
    localStringBuilder.append(".");
    localStringBuilder.append(j);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */