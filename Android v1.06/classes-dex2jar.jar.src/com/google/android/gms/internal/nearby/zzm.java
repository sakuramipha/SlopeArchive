package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.tasks.OnFailureListener;

final class zzm
  implements OnFailureListener
{
  final zzo zzc;
  
  zzm(zzo paramzzo, GoogleApi paramGoogleApi, ListenerHolder.ListenerKey paramListenerKey) {}
  
  public final void onFailure(Exception arg1)
  {
    synchronized (this.zzc)
    {
      this.zzc.zzf(this.zza, this.zzb);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */