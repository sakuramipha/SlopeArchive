package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;

public final class zzfoc
{
  private static final zzfno zza = new zzfno("PhoneskyVerificationUtils");
  
  public static boolean zza(Context paramContext)
  {
    try
    {
      if (paramContext.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled)
      {
        Signature[] arrayOfSignature = paramContext.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        if (arrayOfSignature != null)
        {
          int j = arrayOfSignature.length;
          if (j != 0)
          {
            for (int i = 0;; i++)
            {
              if (i >= j) {
                break label123;
              }
              paramContext = zzfob.zza(arrayOfSignature[i].toByteArray());
              if (("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(paramContext)) || (((Build.TAGS.contains("dev-keys")) || (Build.TAGS.contains("test-keys"))) && ("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(paramContext)))) {
                break;
              }
            }
            return true;
          }
        }
        zza.zzd("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      label123:
      for (;;) {}
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */