package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbvi
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbvi> CREATOR = new zzbvj();
  public final String zza;
  public final int zzb;
  
  public zzbvi(String paramString, int paramInt)
  {
    this.zza = paramString;
    this.zzb = paramInt;
  }
  
  public static zzbvi zza(JSONArray paramJSONArray)
    throws JSONException
  {
    if ((paramJSONArray != null) && (paramJSONArray.length() != 0)) {
      return new zzbvi(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof zzbvi)))
    {
      paramObject = (zzbvi)paramObject;
      if ((Objects.equal(this.zza, ((zzbvi)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzbvi)paramObject).zzb)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */