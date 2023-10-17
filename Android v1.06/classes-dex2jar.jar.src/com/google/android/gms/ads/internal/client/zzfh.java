package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfh
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfh> CREATOR = new zzfi();
  public final String zza;
  
  public zzfh(SearchAdRequest paramSearchAdRequest)
  {
    this.zza = paramSearchAdRequest.getQuery();
  }
  
  zzfh(String paramString)
  {
    this.zza = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 15, this.zza, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */