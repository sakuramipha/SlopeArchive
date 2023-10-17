package com.google.android.gms.internal.games_v2;

import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.Task;

public final class zzcl
  implements EventsClient
{
  private final zzar zza;
  
  public zzcl(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  public final void increment(String paramString, int paramInt)
  {
    this.zza.zzb(new zzci(paramString, paramInt));
  }
  
  public final Task<AnnotatedData<EventBuffer>> load(boolean paramBoolean)
  {
    return this.zza.zzb(new zzcj(paramBoolean));
  }
  
  public final Task<AnnotatedData<EventBuffer>> loadByIds(boolean paramBoolean, String... paramVarArgs)
  {
    return this.zza.zzb(new zzck(paramBoolean, paramVarArgs));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */