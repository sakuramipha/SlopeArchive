package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

final class zzeqx
  implements zzeqq
{
  private final zzfwc zza;
  private final Context zzb;
  
  public zzeqx(zzfwc paramzzfwc, Context paramContext)
  {
    this.zza = paramzzfwc;
    this.zzb = paramContext;
  }
  
  private static ResolveInfo zzd(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }
  
  public final int zza()
  {
    return 38;
  }
  
  public final zzfwb zzb()
  {
    return this.zza.zzb(new zzeqw(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */