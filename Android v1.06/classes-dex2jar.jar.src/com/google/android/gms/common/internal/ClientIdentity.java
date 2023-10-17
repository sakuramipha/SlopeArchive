package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ClientIdentity
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
  public final String packageName;
  public final int uid;
  
  public ClientIdentity(int paramInt, String paramString)
  {
    this.uid = paramInt;
    this.packageName = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ClientIdentity)) {
      return false;
    }
    paramObject = (ClientIdentity)paramObject;
    return (((ClientIdentity)paramObject).uid == this.uid) && (Objects.equal(((ClientIdentity)paramObject).packageName, this.packageName));
  }
  
  public final int hashCode()
  {
    return this.uid;
  }
  
  public final String toString()
  {
    int i = this.uid;
    String str = this.packageName;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
    localStringBuilder.append(i);
    localStringBuilder.append(":");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.uid);
    SafeParcelWriter.writeString(paramParcel, 2, this.packageName, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\ClientIdentity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */