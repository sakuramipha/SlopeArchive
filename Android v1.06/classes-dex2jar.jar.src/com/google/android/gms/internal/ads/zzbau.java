package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

public final class zzbau
{
  private final Context zza;
  
  public zzbau(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "Context can not be null");
    this.zza = paramContext;
  }
  
  public final boolean zza(Intent paramIntent)
  {
    Preconditions.checkNotNull(paramIntent, "Intent can not be null");
    return !this.zza.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
  }
  
  public final boolean zzb()
  {
    return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
  }
  
  public final boolean zzc()
  {
    return (((Boolean)zzcb.zza(this.zza, zzbat.zza)).booleanValue()) && (Wrappers.packageManager(this.zza).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */