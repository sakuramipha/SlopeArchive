package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcgh
{
  private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
  private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
  
  public static String zza(String paramString, String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = zza.matcher(paramString);
    boolean bool = ((Matcher)localObject).find();
    int j = 0;
    int i = 0;
    if (bool)
    {
      j = ((Matcher)localObject).end();
      localStringBuilder.append(paramString.substring(0, j));
      while (i <= 0)
      {
        localObject = paramVarArgs[i];
        if (localObject != null) {
          localStringBuilder.append((String)localObject);
        }
        i++;
      }
      localStringBuilder.append(paramString.substring(j));
    }
    else
    {
      if (!zzb.matcher(paramString).find()) {
        for (i = j; i <= 0; i++)
        {
          localObject = paramVarArgs[i];
          if (localObject != null) {
            localStringBuilder.append((String)localObject);
          }
        }
      }
      localStringBuilder.append(paramString);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */