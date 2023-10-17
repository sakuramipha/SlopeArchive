package com.google.android.gms.common.wrappers;

import android.content.Context;

public class Wrappers
{
  private static Wrappers zza = new Wrappers();
  private PackageManagerWrapper zzb = null;
  
  public static PackageManagerWrapper packageManager(Context paramContext)
  {
    return zza.zza(paramContext);
  }
  
  public final PackageManagerWrapper zza(Context paramContext)
  {
    try
    {
      if (this.zzb == null)
      {
        Context localContext = paramContext;
        if (paramContext.getApplicationContext() != null) {
          localContext = paramContext.getApplicationContext();
        }
        paramContext = new com/google/android/gms/common/wrappers/PackageManagerWrapper;
        paramContext.<init>(localContext);
        this.zzb = paramContext;
      }
      paramContext = this.zzb;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\wrappers\Wrappers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */