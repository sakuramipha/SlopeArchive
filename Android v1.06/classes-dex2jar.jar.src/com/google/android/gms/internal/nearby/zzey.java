package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzey
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzey> CREATOR = new zzez();
  private String zza;
  private String zzb;
  private byte[] zzc;
  
  private zzey() {}
  
  zzey(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzey))
    {
      paramObject = (zzey)paramObject;
      if ((Objects.equal(this.zza, ((zzey)paramObject).zza)) && (Objects.equal(this.zzb, ((zzey)paramObject).zzb)) && (Arrays.equals(this.zzc, ((zzey)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeByteArray(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final byte[] zzc()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */