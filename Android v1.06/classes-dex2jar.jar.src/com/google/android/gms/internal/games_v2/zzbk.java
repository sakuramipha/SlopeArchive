package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbk
{
  private final TaskCompletionSource zza;
  private final zzap zzb;
  
  public zzbk(zzap paramzzap, TaskCompletionSource paramTaskCompletionSource, byte[] paramArrayOfByte)
  {
    this.zzb = paramzzap;
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zza(GoogleApi paramGoogleApi)
  {
    this.zzb.zza(paramGoogleApi).addOnCompleteListener(zzfe.zza(), new zzbj(this));
  }
  
  public final void zzc(Exception paramException)
  {
    this.zza.setException(paramException);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */