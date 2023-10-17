package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsonUtils
{
  private static final Pattern zza = Pattern.compile("\\\\.");
  private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  
  public static boolean areJsonValuesEquivalent(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) && (paramObject2 == null)) {
      return true;
    }
    Iterator localIterator;
    if ((paramObject1 != null) && (paramObject2 != null)) {
      if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
      {
        paramObject1 = (JSONObject)paramObject1;
        paramObject2 = (JSONObject)paramObject2;
        if (((JSONObject)paramObject1).length() != ((JSONObject)paramObject2).length()) {
          return false;
        }
        localIterator = ((JSONObject)paramObject1).keys();
      }
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label128;
      }
      String str = (String)localIterator.next();
      if (!((JSONObject)paramObject2).has(str)) {
        return false;
      }
      try
      {
        Preconditions.checkNotNull(str);
        bool = areJsonValuesEquivalent(((JSONObject)paramObject1).get(str), ((JSONObject)paramObject2).get(str));
        if (bool) {}
      }
      catch (JSONException paramObject1)
      {
        boolean bool;
        int i;
        for (;;) {}
      }
    }
    return false;
    label128:
    return true;
    if (((paramObject1 instanceof JSONArray)) && ((paramObject2 instanceof JSONArray)))
    {
      paramObject1 = (JSONArray)paramObject1;
      paramObject2 = (JSONArray)paramObject2;
      if (((JSONArray)paramObject1).length() == ((JSONArray)paramObject2).length()) {
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= ((JSONArray)paramObject1).length()) {
        break label201;
      }
      try
      {
        bool = areJsonValuesEquivalent(((JSONArray)paramObject1).get(i), ((JSONArray)paramObject2).get(i));
        if (bool) {
          i++;
        }
      }
      catch (JSONException paramObject1)
      {
        for (;;) {}
      }
    }
    return false;
    label201:
    return true;
    return false;
    return paramObject1.equals(paramObject2);
    return false;
  }
  
  public static String escapeString(String paramString)
  {
    Object localObject1 = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      Matcher localMatcher = zzb.matcher(paramString);
      localObject1 = null;
      while (localMatcher.find())
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new StringBuffer();
        }
        int i = localMatcher.group().charAt(0);
        if (i != 12)
        {
          if (i != 13)
          {
            if (i != 34)
            {
              if (i != 47)
              {
                if (i != 92)
                {
                  switch (i)
                  {
                  default: 
                    localObject1 = localObject2;
                    break;
                  case 10: 
                    localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\n");
                    localObject1 = localObject2;
                    break;
                  case 9: 
                    localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\t");
                    localObject1 = localObject2;
                    break;
                  case 8: 
                    localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\b");
                    localObject1 = localObject2;
                    break;
                  }
                }
                else
                {
                  localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\\\\\");
                  localObject1 = localObject2;
                }
              }
              else
              {
                localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\/");
                localObject1 = localObject2;
              }
            }
            else
            {
              localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\\\\"");
              localObject1 = localObject2;
            }
          }
          else
          {
            localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\r");
            localObject1 = localObject2;
          }
        }
        else
        {
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\f");
          localObject1 = localObject2;
        }
      }
      if (localObject1 == null) {
        return paramString;
      }
      localMatcher.appendTail((StringBuffer)localObject1);
      localObject1 = ((StringBuffer)localObject1).toString();
    }
    return (String)localObject1;
  }
  
  public static String unescapeString(String paramString)
  {
    String str1 = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      String str2 = zzc.zza(paramString);
      Matcher localMatcher = zza.matcher(str2);
      str1 = null;
      while (localMatcher.find())
      {
        paramString = str1;
        if (str1 == null) {
          paramString = new StringBuffer();
        }
        int i = localMatcher.group().charAt(1);
        if (i != 34)
        {
          if (i != 47)
          {
            if (i != 92)
            {
              if (i != 98)
              {
                if (i != 102)
                {
                  if (i != 110)
                  {
                    if (i != 114)
                    {
                      if (i == 116)
                      {
                        localMatcher.appendReplacement(paramString, "\t");
                        str1 = paramString;
                      }
                      else
                      {
                        throw new IllegalStateException("Found an escaped character that should never be.");
                      }
                    }
                    else
                    {
                      localMatcher.appendReplacement(paramString, "\r");
                      str1 = paramString;
                    }
                  }
                  else
                  {
                    localMatcher.appendReplacement(paramString, "\n");
                    str1 = paramString;
                  }
                }
                else
                {
                  localMatcher.appendReplacement(paramString, "\f");
                  str1 = paramString;
                }
              }
              else
              {
                localMatcher.appendReplacement(paramString, "\b");
                str1 = paramString;
              }
            }
            else
            {
              localMatcher.appendReplacement(paramString, "\\\\");
              str1 = paramString;
            }
          }
          else
          {
            localMatcher.appendReplacement(paramString, "/");
            str1 = paramString;
          }
        }
        else
        {
          localMatcher.appendReplacement(paramString, "\"");
          str1 = paramString;
        }
      }
      if (str1 == null) {
        return str2;
      }
      localMatcher.appendTail(str1);
      str1 = str1.toString();
    }
    return str1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\JsonUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */