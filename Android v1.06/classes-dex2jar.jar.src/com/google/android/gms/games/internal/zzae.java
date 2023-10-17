package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzae
  extends zza
{
  final zzak zza;
  private final TaskCompletionSource zzb;
  
  zzae(zzak paramzzak, TaskCompletionSource paramTaskCompletionSource)
  {
    this.zzb = paramTaskCompletionSource;
  }
  
  public final void zze(DataHolder paramDataHolder)
  {
    zzj(paramDataHolder);
  }
  
  public final void zzj(DataHolder paramDataHolder)
  {
    int i = paramDataHolder.getStatusCode();
    if (i == 10003)
    {
      zzak.zzq(this.zza, this.zzb);
      paramDataHolder.close();
      return;
    }
    boolean bool;
    if (i == 3) {
      bool = true;
    } else {
      bool = false;
    }
    if ((i != 0) && (!bool))
    {
      GamesStatusUtils.zza(this.zzb, i);
      paramDataHolder.close();
      return;
    }
    this.zzb.setResult(new AnnotatedData(new PlayerBuffer(paramDataHolder), bool));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */