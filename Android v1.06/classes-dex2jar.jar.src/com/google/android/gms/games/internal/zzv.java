package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzv
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzv(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzd(DataHolder paramDataHolder)
  {
    int i = paramDataHolder.getStatusCode();
    boolean bool;
    if (i == 3) {
      bool = true;
    } else {
      bool = false;
    }
    if ((i != 0) && (!bool))
    {
      GamesStatusUtils.zza(this.zza, i);
      paramDataHolder.close();
      return;
    }
    this.zza.setResult(new AnnotatedData(new EventBuffer(paramDataHolder), bool));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */