package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;

public final class zzaum
  extends zzca
{
  private final AppEventListener zza;
  
  public zzaum(AppEventListener paramAppEventListener)
  {
    this.zza = paramAppEventListener;
  }
  
  public final AppEventListener zzb()
  {
    return this.zza;
  }
  
  public final void zzc(String paramString1, String paramString2)
  {
    this.zza.onAppEvent(paramString1, paramString2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */