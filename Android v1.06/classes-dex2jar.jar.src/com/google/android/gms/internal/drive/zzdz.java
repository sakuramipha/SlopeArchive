package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;

final class zzdz
  implements DriveResource.MetadataResult
{
  private final Status zzdy;
  private final Metadata zzgr;
  
  public zzdz(Status paramStatus, Metadata paramMetadata)
  {
    this.zzdy = paramStatus;
    this.zzgr = paramMetadata;
  }
  
  public final Metadata getMetadata()
  {
    return this.zzgr;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */