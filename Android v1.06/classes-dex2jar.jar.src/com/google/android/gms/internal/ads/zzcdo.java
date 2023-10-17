package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcdo
  implements zzbii
{
  private static final Integer zzb(Map paramMap, String paramString)
  {
    if (!paramMap.containsKey(paramString)) {
      return null;
    }
    try
    {
      int i = Integer.parseInt((String)paramMap.get(paramString));
      return Integer.valueOf(i);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = (String)paramMap.get(paramString);
      paramMap = new StringBuilder();
      paramMap.append("Precache invalid numeric parameter '");
      paramMap.append(paramString);
      paramMap.append("': ");
      paramMap.append(str);
      zzbzt.zzj(paramMap.toString());
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */