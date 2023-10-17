package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfk
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfk> CREATOR = new zzfl();
  private String zza;
  
  private zzfk() {}
  
  zzfk(String paramString)
  {
    this.zza = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfk))
    {
      paramObject = (zzfk)paramObject;
      return Objects.equal(this.zza, ((zzfk)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza });
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */