package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.lang.reflect.Method;

public class ProviderInstaller
{
  public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
  private static final GoogleApiAvailabilityLight zza = ;
  private static final Object zzb = new Object();
  private static Method zzc = null;
  private static Method zzd = null;
  
  public static void installIfNeeded(Context paramContext)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    zza.verifyGooglePlayServicesIsAvailable(paramContext, 11925000);
    synchronized (zzb)
    {
      long l1 = SystemClock.elapsedRealtime();
      String str1;
      try
      {
        Context localContext1 = DynamiteModule.load(paramContext, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
      }
      catch (DynamiteModule.LoadingException localLoadingException)
      {
        str1 = String.valueOf(localLoadingException.getMessage());
        if (str1.length() != 0) {
          str1 = "Failed to load providerinstaller module: ".concat(str1);
        } else {
          str1 = new String("Failed to load providerinstaller module: ");
        }
        Log.w("ProviderInstaller", str1);
        str1 = null;
      }
      String str2;
      if (str1 == null)
      {
        long l2 = SystemClock.elapsedRealtime();
        Context localContext2 = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
        if (localContext2 != null) {
          try
          {
            if (zzd == null) {
              zzd = zzb(localContext2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[] { Context.class, Long.TYPE, Long.TYPE });
            }
            zzd.invoke(null, new Object[] { paramContext, Long.valueOf(l1), Long.valueOf(l2) });
          }
          catch (Exception localException)
          {
            str2 = String.valueOf(localException.getMessage());
            if (str2.length() != 0) {
              str2 = "Failed to report request stats: ".concat(str2);
            } else {
              str2 = new String("Failed to report request stats: ");
            }
            Log.w("ProviderInstaller", str2);
          }
        }
        if (localContext2 != null)
        {
          zzc(localContext2, paramContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
          return;
        }
        Log.e("ProviderInstaller", "Failed to get remote context");
        paramContext = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
        paramContext.<init>(8);
        throw paramContext;
      }
      zzc(str2, paramContext, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
      return;
    }
  }
  
  public static void installIfNeededAsync(Context paramContext, ProviderInstallListener paramProviderInstallListener)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    Preconditions.checkNotNull(paramProviderInstallListener, "Listener must not be null");
    Preconditions.checkMainThread("Must be called on the UI thread");
    new zza(paramContext, paramProviderInstallListener).execute(new Void[0]);
  }
  
  private static Method zzb(Context paramContext, String paramString1, String paramString2, Class[] paramArrayOfClass)
    throws ClassNotFoundException, NoSuchMethodException
  {
    return paramContext.getClassLoader().loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
  }
  
  private static void zzc(Context paramContext1, Context paramContext2, String paramString)
    throws GooglePlayServicesNotAvailableException
  {
    try
    {
      if (zzc == null) {
        zzc = zzb(paramContext1, paramString, "insertProvider", new Class[] { Context.class });
      }
      zzc.invoke(null, new Object[] { paramContext1 });
      return;
    }
    catch (Exception paramContext1)
    {
      paramContext2 = paramContext1.getCause();
      if (Log.isLoggable("ProviderInstaller", 6))
      {
        if (paramContext2 == null) {
          paramContext1 = paramContext1.getMessage();
        } else {
          paramContext1 = paramContext2.getMessage();
        }
        paramContext1 = String.valueOf(paramContext1);
        if (paramContext1.length() != 0) {
          paramContext1 = "Failed to install provider: ".concat(paramContext1);
        } else {
          paramContext1 = new String("Failed to install provider: ");
        }
        Log.e("ProviderInstaller", paramContext1);
      }
      throw new GooglePlayServicesNotAvailableException(8);
    }
  }
  
  public static abstract interface ProviderInstallListener
  {
    public abstract void onProviderInstallFailed(int paramInt, Intent paramIntent);
    
    public abstract void onProviderInstalled();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\security\ProviderInstaller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */