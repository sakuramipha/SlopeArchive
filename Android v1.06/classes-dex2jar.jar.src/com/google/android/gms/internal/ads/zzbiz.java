package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbiz
  implements zzbii
{
  private final Context zza;
  
  public zzbiz(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    if ((paramMap.containsKey("text")) && (!TextUtils.isEmpty((CharSequence)paramMap.get("text"))))
    {
      zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String)paramMap.get("text"))));
      paramObject = new Intent();
      ((Intent)paramObject).setAction("android.intent.action.SEND");
      ((Intent)paramObject).setType("text/plain");
      ((Intent)paramObject).putExtra("android.intent.extra.TEXT", (String)paramMap.get("text"));
      if (paramMap.containsKey("title")) {
        ((Intent)paramObject).putExtra("android.intent.extra.TITLE", (String)paramMap.get("title"));
      }
      try
      {
        zzt.zzp();
        zzs.zzP(this.zza, (Intent)paramObject);
        return;
      }
      catch (ActivityNotFoundException paramObject)
      {
        zzt.zzo().zzu((Throwable)paramObject, "ShareSheetGmsgHandler.onGmsg");
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */