package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbwr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbwr> CREATOR = new zzbws();
  public final String zza;
  public final String zzb;
  public final boolean zzc;
  public final boolean zzd;
  public final List zze;
  public final boolean zzf;
  public final boolean zzg;
  public final List zzh;
  
  public zzbwr(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List paramList1, boolean paramBoolean3, boolean paramBoolean4, List paramList2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
    this.zze = paramList1;
    this.zzf = paramBoolean3;
    this.zzg = paramBoolean4;
    paramString1 = paramList2;
    if (paramList2 == null) {
      paramString1 = new ArrayList();
    }
    this.zzh = paramString1;
  }
  
  public static zzbwr zza(JSONObject paramJSONObject)
    throws JSONException
  {
    String str1 = paramJSONObject.optString("click_string", "");
    String str2 = paramJSONObject.optString("report_url", "");
    boolean bool2 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
    boolean bool1 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
    List localList2 = zzbu.zzc(paramJSONObject.optJSONArray("allowed_headers"), null);
    List localList1 = zzbu.zzc(paramJSONObject.optJSONArray("webview_permissions"), null);
    return new zzbwr(str1, str2, bool2, bool1, localList2, paramJSONObject.optBoolean("protection_enabled", false), paramJSONObject.optBoolean("malicious_reporting_enabled", false), localList1);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzb, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzd);
    SafeParcelWriter.writeStringList(paramParcel, 6, this.zze, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzf);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzg);
    SafeParcelWriter.writeStringList(paramParcel, 9, this.zzh, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */