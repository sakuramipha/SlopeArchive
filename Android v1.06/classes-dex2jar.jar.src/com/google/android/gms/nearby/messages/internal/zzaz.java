package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaz
  implements OnCompleteListener<Boolean>
{
  zzaz(zzbg paramzzbg, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void onComplete(Task<Boolean> paramTask)
  {
    if (paramTask.isSuccessful())
    {
      this.zza.setResult(null);
      return;
    }
    this.zza.setException(paramTask.getException());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */