package com.google.android.gms.common.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapUtils
{
  public static void writeStringMapToJson(StringBuilder paramStringBuilder, HashMap<String, String> paramHashMap)
  {
    paramStringBuilder.append("{");
    Iterator localIterator = paramHashMap.keySet().iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      String str1 = (String)localIterator.next();
      if (i == 0) {
        paramStringBuilder.append(",");
      }
      String str2 = (String)paramHashMap.get(str1);
      paramStringBuilder.append("\"");
      paramStringBuilder.append(str1);
      paramStringBuilder.append("\":");
      if (str2 == null)
      {
        paramStringBuilder.append("null");
      }
      else
      {
        paramStringBuilder.append("\"");
        paramStringBuilder.append(str2);
        paramStringBuilder.append("\"");
      }
    }
    paramStringBuilder.append("}");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\MapUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */