package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

public abstract class zzc
{
  private static zzc zza;
  
  public static zzc zza(Context paramContext)
  {
    try
    {
      if (zza == null)
      {
        zzal localzzal = new com/google/android/gms/internal/consent_sdk/zzal;
        localzzal.<init>(null);
        localzzal.zzb((Application)paramContext.getApplicationContext());
        zza = localzzal.zza();
      }
      paramContext = zza;
      return paramContext;
    }
    finally {}
  }
  
  public abstract zzl zzb();
  
  public abstract zzbq zzc();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */