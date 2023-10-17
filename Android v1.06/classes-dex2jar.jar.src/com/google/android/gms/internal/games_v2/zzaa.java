package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaa
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
  private final String zza;
  
  zzaa(String paramString)
  {
    this.zza = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzaa)) {
      return false;
    }
    paramObject = (zzaa)paramObject;
    return Objects.equal(this.zza, ((zzaa)paramObject).zza);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("gameRunToken", this.zza).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */