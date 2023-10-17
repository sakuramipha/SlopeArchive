package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

public class ViewUtils
{
  public static String getXmlAttributeString(String paramString1, String paramString2, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    if (paramAttributeSet == null) {
      paramString1 = null;
    } else {
      paramString1 = paramAttributeSet.getAttributeValue(paramString1, paramString2);
    }
    paramAttributeSet = paramString1;
    if (paramString1 != null)
    {
      paramAttributeSet = paramString1;
      if (paramString1.startsWith("@string/"))
      {
        paramAttributeSet = paramString1;
        if (paramBoolean1)
        {
          String str1 = paramString1.substring(8);
          String str2 = paramContext.getPackageName();
          paramAttributeSet = new TypedValue();
          try
          {
            paramContext = paramContext.getResources();
            int j = String.valueOf(str2).length();
            int i = String.valueOf(str1).length();
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(j + 8 + i);
            localStringBuilder.append(str2);
            localStringBuilder.append(":string/");
            localStringBuilder.append(str1);
            paramContext.getValue(localStringBuilder.toString(), paramAttributeSet, true);
          }
          catch (Resources.NotFoundException paramContext)
          {
            paramContext = new StringBuilder(String.valueOf(paramString2).length() + 30 + paramString1.length());
            paramContext.append("Could not find resource for ");
            paramContext.append(paramString2);
            paramContext.append(": ");
            paramContext.append(paramString1);
            Log.w(paramString3, paramContext.toString());
          }
          if (paramAttributeSet.string != null)
          {
            paramAttributeSet = paramAttributeSet.string.toString();
          }
          else
          {
            paramContext = paramAttributeSet.toString();
            paramAttributeSet = new StringBuilder(String.valueOf(paramString2).length() + 28 + paramContext.length());
            paramAttributeSet.append("Resource ");
            paramAttributeSet.append(paramString2);
            paramAttributeSet.append(" was not a string: ");
            paramAttributeSet.append(paramContext);
            Log.w(paramString3, paramAttributeSet.toString());
            paramAttributeSet = paramString1;
          }
        }
      }
    }
    if ((paramBoolean2) && (paramAttributeSet == null))
    {
      paramString1 = new StringBuilder(String.valueOf(paramString2).length() + 33);
      paramString1.append("Required XML attribute \"");
      paramString1.append(paramString2);
      paramString1.append("\" missing");
      Log.w(paramString3, paramString1.toString());
    }
    return paramAttributeSet;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\ViewUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */