package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.nearby.zzhi;
import com.google.android.gms.internal.nearby.zzhj;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import java.util.Set;

public class Update
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Update> CREATOR = new zzch();
  final int zza;
  final int zzb;
  public final Message zzc;
  public final zze zzd;
  public final zza zze;
  public final zzhj zzf;
  public final byte[] zzg;
  
  Update(int paramInt1, int paramInt2, Message paramMessage, zze paramzze, zza paramzza, zzhj paramzzhj, byte[] paramArrayOfByte)
  {
    this.zza = paramInt1;
    boolean bool = zzb(paramInt2, 2);
    if (true == bool) {
      paramArrayOfByte = null;
    }
    if (true == bool) {
      paramzzhj = null;
    }
    if (true == bool) {
      paramzza = null;
    }
    if (true == bool) {
      paramzze = null;
    }
    if (true == bool) {
      paramInt2 = 2;
    }
    this.zzb = paramInt2;
    this.zzc = paramMessage;
    this.zzd = paramzze;
    this.zze = paramzza;
    this.zzf = paramzzhj;
    this.zzg = paramArrayOfByte;
  }
  
  public static boolean zzb(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) != 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Update)) {
      return false;
    }
    paramObject = (Update)paramObject;
    return (this.zzb == ((Update)paramObject).zzb) && (Objects.equal(this.zzc, ((Update)paramObject).zzc)) && (Objects.equal(this.zzd, ((Update)paramObject).zzd)) && (Objects.equal(this.zze, ((Update)paramObject).zze)) && (Objects.equal(this.zzf, ((Update)paramObject).zzf)) && (Arrays.equals(this.zzg, ((Update)paramObject).zzg));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, this.zzg });
  }
  
  public final String toString()
  {
    Object localObject = new ArraySet();
    if (zzb(this.zzb, 1)) {
      ((Set)localObject).add("FOUND");
    }
    if (zzb(this.zzb, 2)) {
      ((Set)localObject).add("LOST");
    }
    if (zzb(this.zzb, 4)) {
      ((Set)localObject).add("DISTANCE");
    }
    if (zzb(this.zzb, 8)) {
      ((Set)localObject).add("BLE_SIGNAL");
    }
    if (zzb(this.zzb, 16)) {
      ((Set)localObject).add("DEVICE");
    }
    if (zzb(this.zzb, 32)) {
      ((Set)localObject).add("BLE_RECORD");
    }
    String str1 = String.valueOf(localObject);
    String str4 = String.valueOf(this.zzc);
    String str2 = String.valueOf(this.zzd);
    localObject = String.valueOf(this.zze);
    String str5 = String.valueOf(this.zzf);
    String str3 = String.valueOf(zzhi.zza(this.zzg));
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 68 + String.valueOf(str4).length() + String.valueOf(str2).length() + String.valueOf(localObject).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
    localStringBuilder.append("Update{types=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", message=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", distance=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", bleSignal=");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", device=");
    localStringBuilder.append(str5);
    localStringBuilder.append(", bleRecord=");
    localStringBuilder.append(str3);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zze, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeByteArray(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final boolean zza(int paramInt)
  {
    return zzb(this.zzb, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\Update.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */