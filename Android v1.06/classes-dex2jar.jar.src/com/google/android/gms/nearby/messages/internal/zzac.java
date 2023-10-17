package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzac
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzac> CREATOR = new zzad();
  final int zza;
  public final String zzb;
  public final String zzc;
  
  zzac(int paramInt, String paramString1, String paramString2)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
  }
  
  public zzac(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (((paramObject instanceof zzac)) && (hashCode() == paramObject.hashCode()))
    {
      paramObject = (zzac)paramObject;
      if ((Objects.equal(this.zzb, ((zzac)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzac)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, this.zzc });
  }
  
  public final String toString()
  {
    String str2 = this.zzb;
    String str1 = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str1).length());
    localStringBuilder.append("namespace=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", type=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzc, false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */