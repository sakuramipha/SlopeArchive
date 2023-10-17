package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbcl
{
  private CustomTabsSession zza;
  private CustomTabsClient zzb;
  private CustomTabsServiceConnection zzc;
  private zzbcj zzd;
  
  public static boolean zzg(Context paramContext)
  {
    Object localObject1 = paramContext.getPackageManager();
    if (localObject1 == null) {
      return false;
    }
    Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    ResolveInfo localResolveInfo = ((PackageManager)localObject1).resolveActivity((Intent)localObject2, 0);
    localObject1 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 65536);
    if ((localObject1 != null) && (localResolveInfo != null)) {
      for (int i = 0; i < ((List)localObject1).size(); i++)
      {
        localObject2 = (ResolveInfo)((List)localObject1).get(i);
        if (localResolveInfo.activityInfo.name.equals(((ResolveInfo)localObject2).activityInfo.name)) {
          return localResolveInfo.activityInfo.packageName.equals(zzgwc.zza(paramContext));
        }
      }
    }
    return false;
  }
  
  public final CustomTabsSession zza()
  {
    CustomTabsClient localCustomTabsClient = this.zzb;
    if (localCustomTabsClient == null) {
      this.zza = null;
    } else if (this.zza == null) {
      this.zza = localCustomTabsClient.newSession(null);
    }
    return this.zza;
  }
  
  public final void zzb(Activity paramActivity)
  {
    if (this.zzb != null) {
      return;
    }
    String str = zzgwc.zza(paramActivity);
    if (str == null) {
      return;
    }
    zzgwd localzzgwd = new zzgwd(this);
    this.zzc = localzzgwd;
    CustomTabsClient.bindCustomTabsService(paramActivity, str, localzzgwd);
  }
  
  public final void zzc(CustomTabsClient paramCustomTabsClient)
  {
    this.zzb = paramCustomTabsClient;
    paramCustomTabsClient.warmup(0L);
    paramCustomTabsClient = this.zzd;
    if (paramCustomTabsClient != null) {
      paramCustomTabsClient.zza();
    }
  }
  
  public final void zzd()
  {
    this.zzb = null;
    this.zza = null;
  }
  
  public final void zze(zzbcj paramzzbcj)
  {
    this.zzd = paramzzbcj;
  }
  
  public final void zzf(Activity paramActivity)
  {
    CustomTabsServiceConnection localCustomTabsServiceConnection = this.zzc;
    if (localCustomTabsServiceConnection == null) {
      return;
    }
    paramActivity.unbindService(localCustomTabsServiceConnection);
    this.zzb = null;
    this.zza = null;
    this.zzc = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */