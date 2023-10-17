package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class Strings
{
  private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static String emptyToNull(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    return str;
  }
  
  @EnsuresNonNullIf(expression={"#1"}, result=false)
  public static boolean isEmptyOrWhitespace(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\Strings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */