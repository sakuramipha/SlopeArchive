package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzo
  extends zze
{
  zzo(zzp paramzzp, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void zzb(Status paramStatus, zzc paramzzc)
  {
    if (paramzzc != null) {
      paramzzc = new AppSetIdInfo(paramzzc.zzb(), paramzzc.zza());
    } else {
      paramzzc = null;
    }
    TaskUtil.setResultOrApiException(paramStatus, paramzzc, this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */