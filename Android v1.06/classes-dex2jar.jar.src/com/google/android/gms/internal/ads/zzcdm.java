package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class zzcdm
  implements Runnable
{
  final zzcdn zze;
  
  zzcdm(zzcdn paramzzcdn, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheCanceled");
    localHashMap.put("src", this.zza);
    if (!TextUtils.isEmpty(this.zzb)) {
      localHashMap.put("cachedSrc", this.zzb);
    }
    Object localObject = this.zzc;
    switch (((String)localObject).hashCode())
    {
    default: 
      break;
    case 725497484: 
      if (((String)localObject).equals("noCacheDir")) {
        i = 7;
      }
      break;
    case 580119100: 
      if (((String)localObject).equals("expireFailed")) {
        i = 6;
      }
      break;
    case 96784904: 
      if (((String)localObject).equals("error")) {
        i = 1;
      }
      break;
    case 3387234: 
      if (((String)localObject).equals("noop")) {
        i = 4;
      }
      break;
    case -32082395: 
      if (((String)localObject).equals("externalAbort")) {
        i = 10;
      }
      break;
    case -354048396: 
      if (((String)localObject).equals("sizeExceeded")) {
        i = 11;
      }
      break;
    case -642208130: 
      if (((String)localObject).equals("playerFailed")) {
        i = 5;
      }
      break;
    case -659376217: 
      if (((String)localObject).equals("contentLengthMissing")) {
        i = 0;
      }
      break;
    case -918817863: 
      if (((String)localObject).equals("downloadTimeout")) {
        i = 9;
      }
      break;
    case -1347010958: 
      if (((String)localObject).equals("inProgress")) {
        i = 2;
      }
      break;
    case -1396664534: 
      if (((String)localObject).equals("badUrl")) {
        i = 8;
      }
      break;
    case -1947652542: 
      if (((String)localObject).equals("interrupted")) {
        i = 3;
      }
      break;
    }
    int i = -1;
    String str = "internal";
    localObject = str;
    switch (i)
    {
    default: 
      localObject = str;
      break;
    case 10: 
    case 11: 
      localObject = "policy";
      break;
    case 8: 
    case 9: 
      localObject = "network";
      break;
    case 6: 
    case 7: 
      localObject = "io";
    }
    localHashMap.put("type", localObject);
    localHashMap.put("reason", this.zzc);
    if (!TextUtils.isEmpty(this.zzd)) {
      localHashMap.put("message", this.zzd);
    }
    zzcdn.zze(this.zze, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */