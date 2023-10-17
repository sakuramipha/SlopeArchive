package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzs
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzs> CREATOR = new zzt();
  public final int zza;
  public final int zzb;
  public final String zzc;
  public final long zzd;
  
  public zzs(int paramInt1, int paramInt2, String paramString, long paramLong)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramString;
    this.zzd = paramLong;
  }
  
  public static zzs zza(JSONObject paramJSONObject)
    throws JSONException
  {
    return new zzs(paramJSONObject.getInt("type_num"), paramJSONObject.getInt("precision_num"), paramJSONObject.getString("currency"), paramJSONObject.getLong("value"));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeLong(paramParcel, 4, this.zzd);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */