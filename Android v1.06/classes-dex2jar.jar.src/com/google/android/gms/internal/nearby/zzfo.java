package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

public final class zzfo
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfo> CREATOR = new zzfp();
  private String zza;
  private PayloadTransferUpdate zzb;
  
  private zzfo() {}
  
  zzfo(String paramString, PayloadTransferUpdate paramPayloadTransferUpdate)
  {
    this.zza = paramString;
    this.zzb = paramPayloadTransferUpdate;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfo))
    {
      paramObject = (zzfo)paramObject;
      if ((Objects.equal(this.zza, ((zzfo)paramObject).zza)) && (Objects.equal(this.zzb, ((zzfo)paramObject).zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final PayloadTransferUpdate zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */