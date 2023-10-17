package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfba;
import com.google.android.gms.internal.ads.zzfpo;

public final class zzaz
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
  public final String zza;
  public final int zzb;
  
  zzaz(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.zza = str;
    this.zzb = paramInt;
  }
  
  public static zzaz zzb(Throwable paramThrowable)
  {
    zze localzze = zzfba.zza(paramThrowable);
    if (zzfpo.zzd(paramThrowable.getMessage())) {
      paramThrowable = localzze.zzb;
    } else {
      paramThrowable = paramThrowable.getMessage();
    }
    return new zzaz(paramThrowable, localzze.zza);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final zzay zza()
  {
    return new zzay(this.zza, this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */