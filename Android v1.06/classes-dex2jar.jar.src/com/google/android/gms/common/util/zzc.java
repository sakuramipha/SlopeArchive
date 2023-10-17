package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzc
{
  private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
  
  public static String zza(String paramString)
  {
    Object localObject1 = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      Matcher localMatcher = zza.matcher(paramString);
      for (Object localObject2 = null; localMatcher.find(); localObject2 = localObject1)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new StringBuffer();
        }
        localMatcher.appendReplacement((StringBuffer)localObject1, new String(Character.toChars(Integer.parseInt(localMatcher.group().substring(2), 16))));
      }
      if (localObject2 == null) {
        return paramString;
      }
      localMatcher.appendTail((StringBuffer)localObject2);
      localObject1 = ((StringBuffer)localObject2).toString();
    }
    return (String)localObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */