package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfq> CREATOR = new zzfr();
  private int zza;
  private String zzb;
  
  private zzfq() {}
  
  zzfq(int paramInt, String paramString)
  {
    this.zza = paramInt;
    this.zzb = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfq))
    {
      paramObject = (zzfq)paramObject;
      if ((Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(((zzfq)paramObject).zza))) && (Objects.equal(this.zzb, ((zzfq)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), this.zzb });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */