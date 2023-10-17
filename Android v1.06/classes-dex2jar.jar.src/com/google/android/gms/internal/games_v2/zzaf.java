package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzaf
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
  private final Intent zza;
  
  zzaf(Intent paramIntent)
  {
    this.zza = paramIntent;
  }
  
  public static zzaf zza(Intent paramIntent)
  {
    return new zzaf(paramIntent);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzaf)) {
      return false;
    }
    paramObject = (zzaf)paramObject;
    return Objects.equal(this.zza, ((zzaf)paramObject).zza);
  }
  
  public final int hashCode()
  {
    Intent localIntent = this.zza;
    if (localIntent != null) {
      return localIntent.hashCode();
    }
    return 0;
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("resultData", this.zza).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zza, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */