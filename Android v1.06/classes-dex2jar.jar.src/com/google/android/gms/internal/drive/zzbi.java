package com.google.android.gms.internal.drive;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.zzn;
import com.google.android.gms.drive.zzp;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzbi
  implements DriveContents
{
  private static final GmsLogger zzbz = new GmsLogger("DriveContentsImpl", "");
  private boolean closed = false;
  private final Contents zzes;
  private boolean zzet = false;
  private boolean zzeu = false;
  
  public zzbi(Contents paramContents)
  {
    this.zzes = ((Contents)Preconditions.checkNotNull(paramContents));
  }
  
  private final PendingResult<Status> zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, zzn paramzzn)
  {
    zzn localzzn = paramzzn;
    if (paramzzn == null) {
      localzzn = (zzn)new zzp().build();
    }
    if (this.zzes.getMode() != 268435456)
    {
      if ((ExecutionOptions.zza(localzzn.zzn())) && (!this.zzes.zzb())) {
        throw new IllegalStateException("DriveContents must be valid for conflict detection.");
      }
      localzzn.zza(paramGoogleApiClient);
      if (!this.closed)
      {
        if (getDriveId() != null)
        {
          if (paramMetadataChangeSet == null) {
            paramMetadataChangeSet = MetadataChangeSet.zzax;
          }
          zzj();
          return paramGoogleApiClient.execute(new zzbk(this, paramGoogleApiClient, paramMetadataChangeSet, localzzn));
        }
        throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
      }
      throw new IllegalStateException("DriveContents already closed.");
    }
    throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
  }
  
  public final PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    return zza(paramGoogleApiClient, paramMetadataChangeSet, null);
  }
  
  public final PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions)
  {
    if (paramExecutionOptions == null) {
      paramExecutionOptions = null;
    } else {
      paramExecutionOptions = zzn.zza(paramExecutionOptions);
    }
    return zza(paramGoogleApiClient, paramMetadataChangeSet, paramExecutionOptions);
  }
  
  public final void discard(GoogleApiClient paramGoogleApiClient)
  {
    if (!this.closed)
    {
      zzj();
      ((zzbm)paramGoogleApiClient.execute(new zzbm(this, paramGoogleApiClient))).setResultCallback(new zzbl(this));
      return;
    }
    throw new IllegalStateException("DriveContents already closed.");
  }
  
  public final DriveId getDriveId()
  {
    return this.zzes.getDriveId();
  }
  
  public final InputStream getInputStream()
  {
    if (!this.closed)
    {
      if (this.zzes.getMode() == 268435456)
      {
        if (!this.zzet)
        {
          this.zzet = true;
          return this.zzes.getInputStream();
        }
        throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
      }
      throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
    }
    throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
  }
  
  public final int getMode()
  {
    return this.zzes.getMode();
  }
  
  public final OutputStream getOutputStream()
  {
    if (!this.closed)
    {
      if (this.zzes.getMode() == 536870912)
      {
        if (!this.zzeu)
        {
          this.zzeu = true;
          return this.zzes.getOutputStream();
        }
        throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
      }
      throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
    }
    throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
  }
  
  public final ParcelFileDescriptor getParcelFileDescriptor()
  {
    if (!this.closed) {
      return this.zzes.getParcelFileDescriptor();
    }
    throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
  }
  
  public final PendingResult<DriveApi.DriveContentsResult> reopenForWrite(GoogleApiClient paramGoogleApiClient)
  {
    if (!this.closed)
    {
      if (this.zzes.getMode() == 268435456)
      {
        zzj();
        return paramGoogleApiClient.enqueue(new zzbj(this, paramGoogleApiClient));
      }
      throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
    }
    throw new IllegalStateException("DriveContents already closed.");
  }
  
  public final Contents zzi()
  {
    return this.zzes;
  }
  
  public final void zzj()
  {
    IOUtils.closeQuietly(this.zzes.getParcelFileDescriptor());
    this.closed = true;
  }
  
  public final boolean zzk()
  {
    return this.closed;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */