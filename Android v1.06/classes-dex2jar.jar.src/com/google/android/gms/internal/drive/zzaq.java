package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.MetadataBuffer;

public final class zzaq
  implements DriveApi.MetadataBufferResult
{
  private final Status zzdy;
  private final MetadataBuffer zzdz;
  private final boolean zzea;
  
  public zzaq(Status paramStatus, MetadataBuffer paramMetadataBuffer, boolean paramBoolean)
  {
    this.zzdy = paramStatus;
    this.zzdz = paramMetadataBuffer;
    this.zzea = paramBoolean;
  }
  
  public final MetadataBuffer getMetadataBuffer()
  {
    return this.zzdz;
  }
  
  public final Status getStatus()
  {
    return this.zzdy;
  }
  
  public final void release()
  {
    MetadataBuffer localMetadataBuffer = this.zzdz;
    if (localMetadataBuffer != null) {
      localMetadataBuffer.release();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */