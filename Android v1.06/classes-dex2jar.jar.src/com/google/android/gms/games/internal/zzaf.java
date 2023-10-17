package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaf
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzaf(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzj(DataHolder paramDataHolder)
  {
    int j = paramDataHolder.getStatusCode();
    if ((j != 0) && (j != 3))
    {
      GamesStatusUtils.zza(this.zza, j);
      paramDataHolder.close();
      return;
    }
    PlayerBuffer localPlayerBuffer = new PlayerBuffer(paramDataHolder);
    try
    {
      int i = localPlayerBuffer.getCount();
      boolean bool = false;
      if (i > 0) {
        paramDataHolder = new PlayerEntity(localPlayerBuffer.get(0));
      } else {
        paramDataHolder = null;
      }
      localPlayerBuffer.release();
      if (j == 3) {
        bool = true;
      }
      this.zza.setResult(new AnnotatedData(paramDataHolder, bool));
      return;
    }
    finally
    {
      localPlayerBuffer.release();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */