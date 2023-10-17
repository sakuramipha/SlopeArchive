package com.google.android.gms.nearby;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.nearby.zzcn;
import com.google.android.gms.internal.nearby.zzdm;
import com.google.android.gms.internal.nearby.zzh;
import com.google.android.gms.internal.nearby.zzhw;
import com.google.android.gms.internal.nearby.zzk;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.internal.zzbg;
import com.google.android.gms.nearby.messages.internal.zzbw;
import com.google.android.gms.nearby.messages.internal.zzbx;
import com.google.android.gms.nearby.messages.zzc;

public final class Nearby
{
  @Deprecated
  public static final Api<ConnectionsOptions> CONNECTIONS_API = new Api("Nearby.CONNECTIONS_API", zzdm.zzb, zzdm.zza);
  @Deprecated
  public static final Connections Connections = new zzdm();
  @Deprecated
  public static final Api<MessagesOptions> MESSAGES_API = new Api("Nearby.MESSAGES_API", zzbw.zzc, zzbw.zzb);
  @Deprecated
  public static final Messages Messages = zzbw.zza;
  public static final zzc zza = new zzbx();
  @Deprecated
  public static final Api<Api.ApiOptions.NoOptions> zzb = new Api("Nearby.BOOTSTRAP_API", zzk.zzb, zzk.zza);
  @Deprecated
  public static final zzh zzc = new zzk();
  
  public static final ConnectionsClient getConnectionsClient(Activity paramActivity)
  {
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    return new zzcn(paramActivity, null);
  }
  
  public static final ConnectionsClient getConnectionsClient(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    return new zzcn(paramContext, null);
  }
  
  public static final MessagesClient getMessagesClient(Activity paramActivity)
  {
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    return new zzbg(paramActivity, null);
  }
  
  public static final MessagesClient getMessagesClient(Activity paramActivity, MessagesOptions paramMessagesOptions)
  {
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    Preconditions.checkNotNull(paramMessagesOptions, "Options must not be null");
    return new zzbg(paramActivity, paramMessagesOptions);
  }
  
  public static final MessagesClient getMessagesClient(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    return new zzbg(paramContext, null);
  }
  
  public static final MessagesClient getMessagesClient(Context paramContext, MessagesOptions paramMessagesOptions)
  {
    Preconditions.checkNotNull(paramContext, "Context must not be null");
    Preconditions.checkNotNull(paramMessagesOptions, "Options must not be null");
    return new zzbg(paramContext, paramMessagesOptions);
  }
  
  public static boolean zza(Context paramContext)
  {
    if (Wrappers.packageManager(paramContext).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
      return zzhw.zza(paramContext.getContentResolver(), "gms:nearby:requires_gms_check", true);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\Nearby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */