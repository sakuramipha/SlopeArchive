package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbtm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbtm> CREATOR = new zzbtn();
  public final boolean zza;
  public final List zzb;
  
  public zzbtm()
  {
    this(false, Collections.emptyList());
  }
  
  public zzbtm(boolean paramBoolean, List paramList)
  {
    this.zza = paramBoolean;
    this.zzb = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zza);
    SafeParcelWriter.writeStringList(paramParcel, 3, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */