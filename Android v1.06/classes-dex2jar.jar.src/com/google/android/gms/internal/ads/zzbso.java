package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

final class zzbso
  extends zzbsj
{
  zzbso(zzbss paramzzbss, UpdateClickUrlCallback paramUpdateClickUrlCallback) {}
  
  public final void zze(String paramString)
  {
    this.zza.onFailure(paramString);
  }
  
  public final void zzf(List paramList)
  {
    this.zza.onSuccess((Uri)paramList.get(0));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */