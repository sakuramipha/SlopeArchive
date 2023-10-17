package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class TelemetryData
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();
  private final int zaa;
  @Nullable
  private List<MethodInvocation> zab;
  
  public TelemetryData(int paramInt, @Nullable List<MethodInvocation> paramList)
  {
    this.zaa = paramInt;
    this.zab = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zab, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zaa()
  {
    return this.zaa;
  }
  
  public final List<MethodInvocation> zab()
  {
    return this.zab;
  }
  
  public final void zac(MethodInvocation paramMethodInvocation)
  {
    if (this.zab == null) {
      this.zab = new ArrayList();
    }
    this.zab.add(paramMethodInvocation);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\TelemetryData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */