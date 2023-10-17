package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

public final class zzfbd
{
  static Task zza;
  public static AppSetIdClient zzb;
  private static final Object zzc = new Object();
  
  public static Task zza(Context arg0)
  {
    zzb(???, false);
    synchronized (zzc)
    {
      Task localTask = zza;
      return localTask;
    }
  }
  
  public static void zzb(Context paramContext, boolean paramBoolean)
  {
    synchronized (zzc)
    {
      if (zzb == null) {
        zzb = AppSet.getClient(paramContext);
      }
      paramContext = zza;
      if ((paramContext == null) || ((paramContext.isComplete()) && (!zza.isSuccessful())) || ((paramBoolean) && (zza.isComplete()))) {
        zza = ((AppSetIdClient)Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */