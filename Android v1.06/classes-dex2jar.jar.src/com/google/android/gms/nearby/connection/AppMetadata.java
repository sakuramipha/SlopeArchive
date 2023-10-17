package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

@Deprecated
public final class AppMetadata
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AppMetadata> CREATOR = new zzd();
  private final List<AppIdentifier> zza;
  
  public AppMetadata(List<AppIdentifier> paramList)
  {
    this.zza = ((List)Preconditions.checkNotNull(paramList, "Must specify application identifiers"));
    Preconditions.checkNotZero(paramList.size(), "Application identifiers cannot be empty");
  }
  
  public List<AppIdentifier> getAppIdentifiers()
  {
    return this.zza;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 1, getAppIdentifiers(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\AppMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */