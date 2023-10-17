package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

public final class zzq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzq> CREATOR = new zzr();
  private final boolean zza;
  @Nullable
  private final String zzb;
  private final int zzc;
  
  zzq(boolean paramBoolean, String paramString, int paramInt)
  {
    this.zza = paramBoolean;
    this.zzb = paramString;
    this.zzc = (zzp.zza(paramInt) - 1);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  @Nullable
  public final String zza()
  {
    return this.zzb;
  }
  
  public final boolean zzb()
  {
    return this.zza;
  }
  
  public final int zzc()
  {
    return zzp.zza(this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */