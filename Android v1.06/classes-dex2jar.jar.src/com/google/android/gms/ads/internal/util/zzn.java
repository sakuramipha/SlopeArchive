package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzgwc;

final class zzn
  implements zzbcj
{
  zzn(zzs paramzzs, zzbcl paramzzbcl, Context paramContext, Uri paramUri) {}
  
  public final void zza()
  {
    CustomTabsIntent localCustomTabsIntent = new CustomTabsIntent.Builder(this.zza.zza()).build();
    localCustomTabsIntent.intent.setPackage(zzgwc.zza(this.zzb));
    localCustomTabsIntent.launchUrl(this.zzb, this.zzc);
    this.zza.zzf((Activity)this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */