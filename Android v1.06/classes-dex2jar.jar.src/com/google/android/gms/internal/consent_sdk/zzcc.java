package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONObject;

final class zzcc
  implements zzf
{
  private final Application zza;
  private final zzby zzb;
  private final Handler zzc;
  private final Executor zzd;
  private final zzg zze;
  private final zzaq zzf;
  private final zzbe zzg;
  private final zzas zzh;
  
  zzcc(Application paramApplication, zzby paramzzby, Handler paramHandler, Executor paramExecutor, zzg paramzzg, zzaq paramzzaq, zzbe paramzzbe, zzas paramzzas)
  {
    this.zza = paramApplication;
    this.zzb = paramzzby;
    this.zzc = paramHandler;
    this.zzd = paramExecutor;
    this.zze = paramzzg;
    this.zzf = paramzzaq;
    this.zzg = paramzzbe;
    this.zzh = paramzzas;
  }
  
  private final void zzf(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("url");
    if (TextUtils.isEmpty(paramJSONObject)) {
      Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
    }
    Uri localUri = Uri.parse(paramJSONObject);
    if (localUri.getScheme() == null) {
      Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(paramJSONObject)));
    }
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW", localUri);
      this.zzb.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(paramJSONObject)), localActivityNotFoundException);
    }
  }
  
  public final Executor zza()
  {
    return new zzca(this.zzc);
  }
  
  public final boolean zzb(String paramString, JSONObject paramJSONObject)
  {
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1671672458: 
      if (paramString.equals("dismiss")) {
        i = 1;
      }
      break;
    case 150940456: 
      if (paramString.equals("browser")) {
        i = 2;
      }
      break;
    case -278739366: 
      if (paramString.equals("configure_app_assets")) {
        i = 3;
      }
      break;
    case -1370505102: 
      if (paramString.equals("load_complete")) {
        i = 0;
      }
      break;
    }
    i = -1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return false;
          }
          this.zzd.execute(new zzcb(this));
          return true;
        }
        zzf(paramJSONObject);
        return true;
      }
      paramString = paramJSONObject.optString("status");
      switch (paramString.hashCode())
      {
      default: 
        i = j;
        break;
      case 1666911234: 
        i = j;
        if (paramString.equals("non_personalized")) {
          i = 2;
        }
        break;
      case 467888915: 
        i = j;
        if (paramString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
          i = 1;
        }
        break;
      case 429411856: 
        i = j;
        if (paramString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
          i = 4;
        }
        break;
      case -258041904: 
        i = j;
        if (paramString.equals("personalized")) {
          i = 0;
        }
        break;
      case -954325659: 
        i = j;
        if (paramString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
          i = 3;
        }
        break;
      }
      if ((i != 0) && (i != 1) && (i != 2) && (i != 3) && (i != 4)) {
        this.zzg.zzd(new zzi(1, "We are getting something wrong with the webview."));
      } else {
        this.zzg.zzc(3);
      }
      return true;
    }
    this.zzg.zze();
    return true;
  }
  
  final void zzd(String paramString)
  {
    Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(paramString)));
    Object localObject = Uri.parse(paramString);
    paramString = ((Uri)localObject).getQueryParameter("action");
    localObject = ((Uri)localObject).getQueryParameter("args");
    this.zze.zzb(paramString, (String)localObject, new zzf[] { this, this.zzf });
  }
  
  final void zze(int paramInt, String paramString1, String paramString2)
  {
    this.zzg.zzf(new zzi(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[] { Integer.valueOf(paramInt), paramString2, paramString1 })));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */