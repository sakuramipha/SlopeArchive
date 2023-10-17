package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdvi
{
  private final zzcgw zza;
  private final Context zzb;
  private final zzbzz zzc;
  private final zzfaa zzd;
  private final Executor zze;
  private final String zzf;
  private final zzffq zzg;
  private final zzfam zzh;
  private final zzdpx zzi;
  
  public zzdvi(zzcgw paramzzcgw, Context paramContext, zzbzz paramzzbzz, zzfaa paramzzfaa, Executor paramExecutor, String paramString, zzffq paramzzffq, zzdpx paramzzdpx)
  {
    this.zza = paramzzcgw;
    this.zzb = paramContext;
    this.zzc = paramzzbzz;
    this.zzd = paramzzfaa;
    this.zze = paramExecutor;
    this.zzf = paramString;
    this.zzg = paramzzffq;
    this.zzh = paramzzcgw.zzv();
    this.zzi = paramzzdpx;
  }
  
  private final zzfwb zzc(String paramString1, String paramString2)
  {
    zzfff localzzfff = zzffe.zza(this.zzb, 11);
    localzzfff.zzh();
    zzbmo localzzbmo = zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbmv.zza, zzbmv.zza);
    paramString1 = zzfvr.zzm(zzfvr.zzm(zzfvr.zzm(zzfvr.zzh(""), new zzdvf(this, paramString1, paramString2), this.zze), new zzdvg(localzzbmo), this.zze), new zzdvh(this), this.zze);
    zzffp.zza(paramString1, this.zzg, localzzfff);
    return paramString1;
  }
  
  private final String zzd(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      JSONArray localJSONArray = ((JSONObject)localObject).getJSONArray("ad_types");
      if ((localJSONArray != null) && ("unknown".equals(localJSONArray.getString(0))))
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        ((JSONObject)localObject).put("ad_types", localJSONArray.put(this.zzf));
      }
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      zzbzt.zzj("Failed to update the ad types for rendering. ".concat(localJSONException.toString()));
    }
    return paramString;
  }
  
  private static final String zze(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      return paramString.optString("request_id", "");
    }
    catch (JSONException paramString) {}
    return "";
  }
  
  public final zzfwb zza()
  {
    String str1 = this.zzd.zzd.zzx;
    Object localObject1;
    zzbbc localzzbbc;
    int i;
    String str2;
    zzdpx localzzdpx;
    if (!TextUtils.isEmpty(str1))
    {
      localObject1 = zzbbk.zzgI;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject3 = zze(str1);
        localzzbbc = zzbbk.zzgU;
        localObject1 = localObject3;
        if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
        {
          localObject1 = localObject3;
          if (((String)localObject3).isEmpty())
          {
            i = str1.lastIndexOf("&request_id=");
            if (i != -1) {
              localObject1 = str1.substring(i + 12);
            } else {
              localObject1 = "";
            }
          }
        }
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          return zzfvr.zzg(new zzefn(15, "Invalid ad string."));
        }
        str2 = this.zza.zzm().zzb((String)localObject1, this.zzi);
        localzzbbc = zzbbk.zzgU;
        localObject3 = str1;
        if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
        {
          localzzdpx = this.zzi;
          localObject3 = str1;
          if (TextUtils.isEmpty(str2)) {}
        }
      }
    }
    try
    {
      localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>(str2);
      if (((JSONObject)localObject3).optString("is_gbid").equals("true")) {
        localObject3 = Boolean.valueOf(true);
      }
    }
    catch (JSONException localJSONException2)
    {
      com.google.android.gms.ads.internal.client.zzc localzzc;
      for (;;) {}
    }
    Object localObject3 = Boolean.valueOf(false);
    if (!((Boolean)localObject3).booleanValue())
    {
      localObject3 = str1;
    }
    else
    {
      i = str1.lastIndexOf("&");
      localzzbbc = null;
      if (i != -1) {
        localObject3 = str1.substring(0, i);
      } else {
        localObject3 = null;
      }
      if (TextUtils.isEmpty((CharSequence)localObject3)) {
        localObject3 = str1;
      } else {
        try
        {
          localObject3 = Base64.decode((String)localObject3, 11);
          byte[] arrayOfByte = ((String)localObject1).getBytes("UTF-8");
          Object localObject2;
          try
          {
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>(str2);
            localObject1 = ((JSONObject)localObject1).getString("arek");
          }
          catch (JSONException localJSONException1)
          {
            zze.zza("Failed to get key from QueryJSONMap".concat(localJSONException1.toString()));
            zzt.zzo().zzu(localJSONException1, "CryptoUtils.getKeyFromQueryJsonMap");
            localObject2 = localzzbbc;
          }
          localObject3 = zzfam.zzb((byte[])localObject3, arrayOfByte, (String)localObject2, localzzdpx);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          zze.zza("Failed to decode the adResponse. ".concat(localUnsupportedEncodingException.toString()));
          zzt.zzo().zzu(localUnsupportedEncodingException, "PreloadedLoader.decryptAdResponseIfNecessary");
          localObject3 = str1;
        }
      }
    }
    if (!TextUtils.isEmpty(str2)) {
      return zzc((String)localObject3, zzd(str2));
    }
    localzzc = this.zzd.zzd.zzs;
    if (localzzc != null)
    {
      localObject3 = zzbbk.zzgG;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject3)).booleanValue())
      {
        localObject3 = zze(localzzc.zza);
        str1 = zze(localzzc.zzb);
        if ((!TextUtils.isEmpty(str1)) && (((String)localObject3).equals(str1)))
        {
          this.zza.zzm().zzf((String)localObject3);
          this.zzi.zza().put("rid", localObject3);
        }
      }
      else
      {
        return zzc(localzzc.zza, zzd(localzzc.zzb));
      }
      this.zzi.zza().put("ridmm", "true");
    }
    return zzfvr.zzg(new zzefn(14, "Mismatch request IDs."));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */