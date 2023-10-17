package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.internal.zzc;
import com.google.android.gms.nearby.messages.internal.zzg;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;

public final class zzhl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhl> CREATOR = new zzhm();
  final int zza;
  final int zzb;
  final byte[] zzc;
  final boolean zzd;
  
  zzhl(int paramInt1, int paramInt2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramArrayOfByte;
    this.zzd = paramBoolean;
  }
  
  private zzhl(int paramInt, byte[] paramArrayOfByte)
  {
    this(1, paramInt, paramArrayOfByte, false);
  }
  
  public static zzhl zza(String paramString1, String paramString2)
  {
    String str = String.valueOf(paramString1);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    if (paramString1.length() != 0) {
      paramString1 = str.concat(paramString1);
    } else {
      paramString1 = new String(str);
    }
    return new zzhl(2, new zzg(zzg.zzb(paramString1)).zzc());
  }
  
  public static zzhl zzb(UUID paramUUID, Short paramShort1, Short paramShort2)
  {
    return new zzhl(3, new zzl(paramUUID, paramShort1, paramShort2).zzc());
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzb);
    SafeParcelWriter.writeByteArray(paramParcel, 2, this.zzc, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */