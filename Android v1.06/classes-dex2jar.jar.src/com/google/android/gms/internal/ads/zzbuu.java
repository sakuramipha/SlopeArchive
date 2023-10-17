package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

public final class zzbuu
  extends ContextWrapper
{
  public static Context zza(Context paramContext)
  {
    if (!(paramContext instanceof zzbuu))
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext == null) {
        return paramContext;
      }
      return localContext;
    }
    return ((zzbuu)paramContext).getBaseContext();
  }
  
  public final Context getApplicationContext()
  {
    throw null;
  }
  
  public final ApplicationInfo getApplicationInfo()
  {
    try
    {
      throw null;
    }
    finally {}
  }
  
  public final String getPackageName()
  {
    try
    {
      throw null;
    }
    finally {}
  }
  
  public final String getPackageResourcePath()
  {
    try
    {
      throw null;
    }
    finally {}
  }
  
  public final void startActivity(Intent paramIntent)
  {
    try
    {
      throw null;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */