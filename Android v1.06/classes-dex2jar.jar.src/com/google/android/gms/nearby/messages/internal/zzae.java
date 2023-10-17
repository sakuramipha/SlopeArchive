package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.Message;

public final class zzae
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
  final int zza;
  public final Message zzb;
  
  zzae(int paramInt, Message paramMessage)
  {
    this.zza = paramInt;
    this.zzb = ((Message)Preconditions.checkNotNull(paramMessage));
  }
  
  public static final zzae zza(Message paramMessage)
  {
    return new zzae(1, paramMessage);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzae)) {
      return false;
    }
    paramObject = (zzae)paramObject;
    return Objects.equal(this.zzb, ((zzae)paramObject).zzb);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb });
  }
  
  public final String toString()
  {
    String str = this.zzb.toString();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 24);
    localStringBuilder.append("MessageWrapper{message=");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzb, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */