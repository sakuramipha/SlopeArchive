package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzfhv
{
  public static void zza(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1)) {
      return;
    }
    throw new IllegalArgumentException(paramString2);
  }
  
  public static void zzb(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */