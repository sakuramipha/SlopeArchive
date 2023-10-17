package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzbbx
  extends zzbby
{
  private static final String zzb(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    int m = paramString.length();
    int k = 0;
    int j;
    for (int i = 0;; i++)
    {
      j = m;
      if (i >= paramString.length()) {
        break;
      }
      j = m;
      if (paramString.charAt(i) != ',') {
        break;
      }
    }
    while (j > 0)
    {
      m = j - 1;
      if (paramString.charAt(m) != ',') {
        break;
      }
      j = m;
    }
    if (j < i) {
      return null;
    }
    if (i == 0) {
      if (j != paramString.length()) {
        i = k;
      } else {
        return paramString;
      }
    }
    return paramString.substring(i, j);
  }
  
  public final String zza(String paramString1, String paramString2)
  {
    paramString1 = zzb(paramString1);
    paramString2 = zzb(paramString2);
    if (TextUtils.isEmpty(paramString1)) {
      return paramString2;
    }
    if (TextUtils.isEmpty(paramString2)) {
      return paramString1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(",");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */