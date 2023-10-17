package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzy
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzy> CREATOR = new zzz();
  private final int zza;
  private final zzaf zzb;
  
  zzy(int paramInt, zzaf paramzzaf)
  {
    this.zza = paramInt;
    this.zzb = paramzzaf;
  }
  
  public static zzy zzb(int paramInt)
  {
    return new zzy(paramInt, null);
  }
  
  public static zzy zzc(int paramInt, zzaf paramzzaf)
  {
    return new zzy(paramInt, paramzzaf);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzy)) {
      return false;
    }
    paramObject = (zzy)paramObject;
    return (this.zza == ((zzy)paramObject).zza) && (Objects.equal(this.zzb, ((zzy)paramObject).zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), this.zzb });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("signInType", Integer.valueOf(this.zza)).add("previousStepResolutionResult", this.zzb).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final boolean zzd()
  {
    return this.zzb == null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */