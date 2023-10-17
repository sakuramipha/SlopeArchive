package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzq
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzq(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzb(int paramInt, String paramString)
  {
    if ((paramInt != 0) && (paramInt != 3003))
    {
      GamesStatusUtils.zza(this.zza, paramInt);
      return;
    }
    paramString = this.zza;
    boolean bool;
    if (paramInt == 3003) {
      bool = true;
    } else {
      bool = false;
    }
    paramString.setResult(Boolean.valueOf(bool));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */