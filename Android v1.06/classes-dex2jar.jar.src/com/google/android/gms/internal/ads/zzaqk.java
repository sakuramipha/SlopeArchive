package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

final class zzaqk
  implements Runnable
{
  final zzaql zza;
  
  zzaqk(zzaql paramzzaql) {}
  
  public final void run()
  {
    if (this.zza.zzb != null) {
      return;
    }
    boolean bool2;
    boolean bool1;
    synchronized (zzaql.zza())
    {
      if (this.zza.zzb != null) {
        return;
      }
      bool2 = false;
      try
      {
        bool1 = ((Boolean)zzbbk.zzci.zze()).booleanValue();
      }
      catch (IllegalStateException localIllegalStateException)
      {
        bool1 = false;
      }
      if (!bool1) {}
    }
    try
    {
      zzaql.zza = zzfkv.zzb(zzaql.zzb(this.zza).zza, "ADSHIELD", null);
      this.zza.zzb = Boolean.valueOf(bool1);
      zzaql.zza().open();
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
    finally
    {
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */