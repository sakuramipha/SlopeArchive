package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdkd
{
  private final Context zza;
  private final zzdjm zzb;
  private final zzaqq zzc;
  private final zzbzz zzd;
  private final zza zze;
  private final zzawx zzf;
  private final Executor zzg;
  private final zzbee zzh;
  private final zzdkv zzi;
  private final zzdnk zzj;
  private final ScheduledExecutorService zzk;
  private final zzdmf zzl;
  private final zzdqc zzm;
  private final zzfen zzn;
  private final zzfgj zzo;
  private final zzebc zzp;
  
  public zzdkd(Context paramContext, zzdjm paramzzdjm, zzaqq paramzzaqq, zzbzz paramzzbzz, zza paramzza, zzawx paramzzawx, Executor paramExecutor, zzfaa paramzzfaa, zzdkv paramzzdkv, zzdnk paramzzdnk, ScheduledExecutorService paramScheduledExecutorService, zzdqc paramzzdqc, zzfen paramzzfen, zzfgj paramzzfgj, zzebc paramzzebc, zzdmf paramzzdmf)
  {
    this.zza = paramContext;
    this.zzb = paramzzdjm;
    this.zzc = paramzzaqq;
    this.zzd = paramzzbzz;
    this.zze = paramzza;
    this.zzf = paramzzawx;
    this.zzg = paramExecutor;
    this.zzh = paramzzfaa.zzi;
    this.zzi = paramzzdkv;
    this.zzj = paramzzdnk;
    this.zzk = paramScheduledExecutorService;
    this.zzm = paramzzdqc;
    this.zzn = paramzzfen;
    this.zzo = paramzzfgj;
    this.zzp = paramzzebc;
    this.zzl = paramzzdmf;
  }
  
  public static final zzel zzi(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optJSONObject("mute");
    if (paramJSONObject == null) {
      return null;
    }
    paramJSONObject = paramJSONObject.optJSONObject("default_reason");
    if (paramJSONObject == null) {
      return null;
    }
    return zzr(paramJSONObject);
  }
  
  public static final List zzj(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optJSONObject("mute");
    if (paramJSONObject == null) {
      return zzfrr.zzl();
    }
    paramJSONObject = paramJSONObject.optJSONArray("reasons");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramJSONObject.length(); i++)
      {
        zzel localzzel = zzr(paramJSONObject.optJSONObject(i));
        if (localzzel != null) {
          localArrayList.add(localzzel);
        }
      }
      return zzfrr.zzj(localArrayList);
    }
    return zzfrr.zzl();
  }
  
  private final zzq zzk(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 0) {
      if (paramInt2 != 0) {
        i = 0;
      } else {
        return zzq.zzc();
      }
    }
    return new zzq(this.zza, new AdSize(i, paramInt2));
  }
  
  private static zzfwb zzl(zzfwb paramzzfwb, Object paramObject)
  {
    return zzfvr.zzf(paramzzfwb, Exception.class, new zzdka(null), zzcag.zzf);
  }
  
  private static zzfwb zzm(boolean paramBoolean, zzfwb paramzzfwb, Object paramObject)
  {
    if (paramBoolean) {
      paramzzfwb = zzfvr.zzm(paramzzfwb, new zzdjy(paramzzfwb), zzcag.zzf);
    } else {
      paramzzfwb = zzl(paramzzfwb, null);
    }
    return paramzzfwb;
  }
  
  private final zzfwb zzn(JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (paramJSONObject == null) {
      return zzfvr.zzh(null);
    }
    Object localObject = paramJSONObject.optString("url");
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return zzfvr.zzh(null);
    }
    double d = paramJSONObject.optDouble("scale", 1.0D);
    boolean bool = paramJSONObject.optBoolean("is_transparent", true);
    int i = paramJSONObject.optInt("width", -1);
    int j = paramJSONObject.optInt("height", -1);
    if (paramBoolean) {
      return zzfvr.zzh(new zzbec(null, Uri.parse((String)localObject), d, i, j));
    }
    localObject = zzfvr.zzl(this.zzb.zzb((String)localObject, d, bool), new zzdkb((String)localObject, d, i, j), this.zzg);
    return zzm(paramJSONObject.optBoolean("require"), (zzfwb)localObject, null);
  }
  
  private final zzfwb zzo(JSONArray paramJSONArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      ArrayList localArrayList = new ArrayList();
      int i;
      if (paramBoolean2) {
        i = paramJSONArray.length();
      } else {
        i = 1;
      }
      for (int j = 0; j < i; j++) {
        localArrayList.add(zzn(paramJSONArray.optJSONObject(j), paramBoolean1));
      }
      return zzfvr.zzl(zzfvr.zzd(localArrayList), zzdjz.zza, this.zzg);
    }
    return zzfvr.zzh(Collections.emptyList());
  }
  
  private final zzfwb zzp(JSONObject paramJSONObject, zzezf paramzzezf, zzezi paramzzezi)
  {
    String str1 = paramJSONObject.optString("base_url");
    String str2 = paramJSONObject.optString("html");
    paramJSONObject = zzk(paramJSONObject.optInt("width", 0), paramJSONObject.optInt("height", 0));
    paramJSONObject = this.zzi.zzb(str1, str2, paramzzezf, paramzzezi, paramJSONObject);
    return zzfvr.zzm(paramJSONObject, new zzdkc(paramJSONObject), zzcag.zzf);
  }
  
  private static Integer zzq(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject(paramString);
      int i = Color.rgb(paramJSONObject.getInt("r"), paramJSONObject.getInt("g"), paramJSONObject.getInt("b"));
      return Integer.valueOf(i);
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  private static final zzel zzr(JSONObject paramJSONObject)
  {
    Object localObject = null;
    if (paramJSONObject == null) {
      return null;
    }
    String str1 = paramJSONObject.optString("reason");
    String str2 = paramJSONObject.optString("ping_url");
    paramJSONObject = (JSONObject)localObject;
    if (!TextUtils.isEmpty(str1)) {
      if (TextUtils.isEmpty(str2)) {
        paramJSONObject = (JSONObject)localObject;
      } else {
        paramJSONObject = new zzel(str1, str2);
      }
    }
    return paramJSONObject;
  }
  
  public final zzfwb zzd(JSONObject paramJSONObject, String paramString)
  {
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject1 == null) {
      return zzfvr.zzh(null);
    }
    paramString = localJSONObject1.optJSONArray("images");
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("image");
    paramJSONObject = paramString;
    if (paramString == null)
    {
      paramJSONObject = paramString;
      if (localJSONObject2 != null)
      {
        paramJSONObject = new JSONArray();
        paramJSONObject.put(localJSONObject2);
      }
    }
    paramJSONObject = zzfvr.zzl(zzo(paramJSONObject, false, true), new zzdju(this, localJSONObject1), this.zzg);
    return zzm(localJSONObject1.optBoolean("require"), paramJSONObject, null);
  }
  
  public final zzfwb zze(JSONObject paramJSONObject, String paramString)
  {
    return zzn(paramJSONObject.optJSONObject(paramString), this.zzh.zzb);
  }
  
  public final zzfwb zzf(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray("images");
    paramString = this.zzh;
    return zzo(paramJSONObject, paramString.zzb, paramString.zzd);
  }
  
  public final zzfwb zzg(JSONObject paramJSONObject, String paramString, zzezf paramzzezf, zzezi paramzzezi)
  {
    paramString = zzbbk.zzjd;
    if (!((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
      return zzfvr.zzh(null);
    }
    paramJSONObject = paramJSONObject.optJSONArray("images");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
    {
      Object localObject = paramJSONObject.optJSONObject(0);
      if (localObject == null) {
        return zzfvr.zzh(null);
      }
      paramJSONObject = ((JSONObject)localObject).optString("base_url");
      paramString = ((JSONObject)localObject).optString("html");
      localObject = zzk(((JSONObject)localObject).optInt("width", 0), ((JSONObject)localObject).optInt("height", 0));
      if (TextUtils.isEmpty(paramString)) {
        return zzfvr.zzh(null);
      }
      paramJSONObject = zzfvr.zzm(zzfvr.zzh(null), new zzdjv(this, (zzq)localObject, paramzzezf, paramzzezi, paramJSONObject, paramString), zzcag.zze);
      return zzfvr.zzm(paramJSONObject, new zzdjw(paramJSONObject), zzcag.zzf);
    }
    return zzfvr.zzh(null);
  }
  
  public final zzfwb zzh(JSONObject paramJSONObject, zzezf paramzzezf, zzezi paramzzezi)
  {
    JSONObject localJSONObject = zzbu.zzg(paramJSONObject, new String[] { "html_containers", "instream" });
    if (localJSONObject == null)
    {
      localJSONObject = paramJSONObject.optJSONObject("video");
      if (localJSONObject == null)
      {
        paramJSONObject = zzfvr.zzh(null);
      }
      else
      {
        String str = localJSONObject.optString("vast_xml");
        paramJSONObject = zzbbk.zzjc;
        boolean bool = ((Boolean)zzba.zzc().zzb(paramJSONObject)).booleanValue();
        int j = 0;
        int i = j;
        if (bool)
        {
          i = j;
          if (localJSONObject.has("html")) {
            i = 1;
          }
        }
        if (TextUtils.isEmpty(str))
        {
          if (i == 0)
          {
            zzbzt.zzj("Required field 'vast_xml' or 'html' is missing");
            paramJSONObject = zzfvr.zzh(null);
            break label196;
          }
        }
        else if (i == 0)
        {
          paramJSONObject = this.zzi.zza(localJSONObject);
          break label162;
        }
        paramJSONObject = zzp(localJSONObject, paramzzezf, paramzzezi);
        label162:
        paramzzezf = zzbbk.zzdx;
        paramJSONObject = zzl(zzfvr.zzn(paramJSONObject, ((Integer)zzba.zzc().zzb(paramzzezf)).intValue(), TimeUnit.SECONDS, this.zzk), null);
      }
      label196:
      return paramJSONObject;
    }
    return zzp(localJSONObject, paramzzezf, paramzzezi);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */