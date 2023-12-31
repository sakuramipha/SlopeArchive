package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Scope
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new zza();
  final int zza;
  private final String zzb;
  
  Scope(int paramInt, String paramString)
  {
    Preconditions.checkNotEmpty(paramString, "scopeUri must not be null or empty");
    this.zza = paramInt;
    this.zzb = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return this.zzb.equals(((Scope)paramObject).zzb);
  }
  
  public String getScopeUri()
  {
    return this.zzb;
  }
  
  public int hashCode()
  {
    return this.zzb.hashCode();
  }
  
  public String toString()
  {
    return this.zzb;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, getScopeUri(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */