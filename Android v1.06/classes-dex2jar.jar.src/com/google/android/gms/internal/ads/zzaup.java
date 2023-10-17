package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class zzaup
  implements Runnable
{
  final zzauq zza;
  
  zzaup(zzauq paramzzauq) {}
  
  public final void run()
  {
    synchronized (zzauq.zzc(this.zza))
    {
      Object localObject2 = this.zza;
      if ((zzauq.zzi((zzauq)localObject2)) && (zzauq.zzj((zzauq)localObject2)))
      {
        zzauq.zze((zzauq)localObject2, false);
        zzbzt.zze("App went background");
        localObject2 = zzauq.zzd(this.zza).iterator();
      }
      while (((Iterator)localObject2).hasNext())
      {
        zzaur localzzaur = (zzaur)((Iterator)localObject2).next();
        try
        {
          localzzaur.zza(false);
        }
        catch (Exception localException)
        {
          zzbzt.zzh("", localException);
        }
        continue;
        zzbzt.zze("App is still foreground");
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */