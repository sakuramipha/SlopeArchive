package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzbya
{
  static Uri zza(String paramString1, String paramString2, String paramString3)
  {
    int j = paramString1.indexOf("&adurl");
    int i = j;
    if (j == -1) {
      i = paramString1.indexOf("?adurl");
    }
    if (i != -1)
    {
      i++;
      StringBuilder localStringBuilder = new StringBuilder(paramString1.substring(0, i));
      localStringBuilder.append(paramString2);
      localStringBuilder.append("=");
      localStringBuilder.append(paramString3);
      localStringBuilder.append("&");
      localStringBuilder.append(paramString1.substring(i));
      return Uri.parse(localStringBuilder.toString());
    }
    return Uri.parse(paramString1).buildUpon().appendQueryParameter(paramString2, paramString3).build();
  }
  
  public static String zzb(Uri paramUri, Context paramContext)
  {
    if (!zzt.zzn().zzu(paramContext)) {
      return paramUri.toString();
    }
    String str1 = zzt.zzn().zza(paramContext);
    if (str1 == null) {
      return paramUri.toString();
    }
    Object localObject = zzbbk.zzaf;
    String str2 = (String)zzba.zzc().zzb((zzbbc)localObject);
    localObject = paramUri.toString();
    zzbbc localzzbbc = zzbbk.zzae;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (((String)localObject).contains(str2)))
    {
      zzt.zzn().zzm(paramContext, str1);
      paramUri = zzd((String)localObject, paramContext).replace(str2, str1);
    }
    else
    {
      if (TextUtils.isEmpty(paramUri.getQueryParameter("fbs_aeid"))) {
        break label123;
      }
      paramUri = (Uri)localObject;
    }
    return paramUri;
    label123:
    paramUri = zza(zzd((String)localObject, paramContext), "fbs_aeid", str1).toString();
    zzt.zzn().zzm(paramContext, str1);
    return paramUri;
  }
  
  public static String zzc(String paramString, Context paramContext, boolean paramBoolean)
  {
    Object localObject = zzbbk.zzam;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (!paramBoolean)) {
      return paramString;
    }
    localObject = paramString;
    if (zzt.zzn().zzu(paramContext)) {
      if (TextUtils.isEmpty(paramString))
      {
        localObject = paramString;
      }
      else
      {
        String str1 = zzt.zzn().zza(paramContext);
        if (str1 == null) {
          return paramString;
        }
        localObject = zzbbk.zzaf;
        String str2 = (String)zzba.zzc().zzb((zzbbc)localObject);
        localObject = zzbbk.zzae;
        if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (paramString.contains(str2)))
        {
          if (zzt.zzp().zzg(paramString))
          {
            zzt.zzn().zzm(paramContext, str1);
            return zzd(paramString, paramContext).replace(str2, str1);
          }
          localObject = paramString;
          if (zzt.zzp().zzh(paramString))
          {
            zzt.zzn().zzn(paramContext, str1);
            return zzd(paramString, paramContext).replace(str2, str1);
          }
        }
        else
        {
          localObject = paramString;
          if (!paramString.contains("fbs_aeid"))
          {
            if (zzt.zzp().zzg(paramString))
            {
              zzt.zzn().zzm(paramContext, str1);
              return zza(zzd(paramString, paramContext), "fbs_aeid", str1).toString();
            }
            localObject = paramString;
            if (zzt.zzp().zzh(paramString))
            {
              zzt.zzn().zzn(paramContext, str1);
              localObject = zza(zzd(paramString, paramContext), "fbs_aeid", str1).toString();
            }
          }
        }
      }
    }
    return (String)localObject;
  }
  
  private static String zzd(String paramString, Context paramContext)
  {
    String str2 = zzt.zzn().zze(paramContext);
    String str1 = zzt.zzn().zzc(paramContext);
    paramContext = paramString;
    if (!paramString.contains("gmp_app_id"))
    {
      paramContext = paramString;
      if (!TextUtils.isEmpty(str2)) {
        paramContext = zza(paramString, "gmp_app_id", str2).toString();
      }
    }
    paramString = paramContext;
    if (!paramContext.contains("fbs_aiid"))
    {
      paramString = paramContext;
      if (!TextUtils.isEmpty(str1)) {
        paramString = zza(paramContext, "fbs_aiid", str1).toString();
      }
    }
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */