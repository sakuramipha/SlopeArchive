package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

final class zzbd
  implements Connections.StartAdvertisingResult
{
  private final Status zza;
  private final String zzb;
  
  zzbd(Status paramStatus, String paramString)
  {
    this.zza = paramStatus;
    this.zzb = paramString;
  }
  
  public final String getLocalEndpointName()
  {
    return this.zzb;
  }
  
  public final Status getStatus()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */