package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public final class zzgwd
  extends CustomTabsServiceConnection
{
  private final WeakReference zza;
  
  public zzgwd(zzbcl paramzzbcl)
  {
    this.zza = new WeakReference(paramzzbcl);
  }
  
  public final void onCustomTabsServiceConnected(ComponentName paramComponentName, CustomTabsClient paramCustomTabsClient)
  {
    paramComponentName = (zzbcl)this.zza.get();
    if (paramComponentName != null) {
      paramComponentName.zzc(paramCustomTabsClient);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = (zzbcl)this.zza.get();
    if (paramComponentName != null) {
      paramComponentName.zzd();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */