package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class zal
{
  public static final int zaa;
  
  static
  {
    int j = Build.VERSION.SDK_INT;
    int i = 33554432;
    if ((j < 31) && ((Build.VERSION.SDK_INT < 30) || (Build.VERSION.CODENAME.length() != 1) || (Build.VERSION.CODENAME.charAt(0) < 'S') || (Build.VERSION.CODENAME.charAt(0) > 'Z'))) {
      i = 0;
    }
    zaa = i;
  }
  
  public static PendingIntent zaa(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2)
  {
    return PendingIntent.getActivity(paramContext, paramInt1, paramIntent, paramInt2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\base\zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */