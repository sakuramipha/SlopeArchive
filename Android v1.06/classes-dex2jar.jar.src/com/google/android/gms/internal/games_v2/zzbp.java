package com.google.android.gms.internal.games_v2;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.games.internal.zzg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbp
  implements zzbm
{
  private final Application zza;
  private final zzg zzb;
  private final zzaw zzc;
  
  zzbp(Application paramApplication, zzg paramzzg, zzaw paramzzaw, byte[] paramArrayOfByte)
  {
    this.zza = paramApplication;
    this.zzb = paramzzg;
    this.zzc = paramzzaw;
  }
  
  private final zzs zzc()
  {
    Object localObject = this.zzb.zza();
    if (localObject != null) {
      return zzr.zza((Context)localObject, this.zzc.zzb);
    }
    localObject = this.zzc;
    return zzr.zza(((zzaw)localObject).zza, ((zzaw)localObject).zzb);
  }
  
  public final Task zza(zzy paramzzy)
  {
    int i = paramzzy.zza();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i == 0)
    {
      bool1 = bool2;
      if (!InstantApps.isInstantApp(this.zza)) {
        bool1 = true;
      }
    }
    Task localTask = zzc().zza(paramzzy, bool1);
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    localTask.continueWithTask(zzfe.zza(), new zzbn(this, paramzzy, bool1)).addOnCompleteListener(zzfe.zza(), new zzbo(localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */