package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzs
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzs(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzc(DataHolder paramDataHolder)
  {
    int i = paramDataHolder.getStatusCode();
    if ((i != 0) && (i != 3))
    {
      GamesStatusUtils.zza(this.zza, i);
      paramDataHolder.close();
      return;
    }
    paramDataHolder = new AchievementBuffer(paramDataHolder);
    boolean bool;
    if (i == 3) {
      bool = true;
    } else {
      bool = false;
    }
    this.zza.setResult(new AnnotatedData(paramDataHolder, bool));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */