package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

final class zzcg
  implements OnFailureListener
{
  final zzcn zzb;
  
  zzcg(zzcn paramzzcn, String paramString) {}
  
  public final void onFailure(Exception paramException)
  {
    if (((paramException instanceof ApiException)) && (((ApiException)paramException).getStatusCode() == 8003)) {
      return;
    }
    zzcn.zzd(this.zzb, this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */