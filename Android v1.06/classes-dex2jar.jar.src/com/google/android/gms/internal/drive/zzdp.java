package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.ArrayList;
import java.util.Set;

public class zzdp
  implements DriveResource
{
  protected final DriveId zzk;
  
  public zzdp(DriveId paramDriveId)
  {
    this.zzk = paramDriveId;
  }
  
  public PendingResult<Status> addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY)).zza(paramGoogleApiClient, this.zzk, paramChangeListener);
  }
  
  public PendingResult<Status> addChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    zzaw localzzaw = (zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY);
    zzj localzzj = new zzj(1, this.zzk);
    Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(localzzj.zzda, localzzj.zzk));
    Preconditions.checkState(localzzaw.isConnected(), "Client must be connected");
    if (localzzaw.zzec) {
      return paramGoogleApiClient.execute(new zzaz(localzzaw, paramGoogleApiClient, localzzj));
    }
    throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
  }
  
  public PendingResult<Status> delete(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.execute(new zzdu(this, paramGoogleApiClient));
  }
  
  public DriveId getDriveId()
  {
    return this.zzk;
  }
  
  public PendingResult<DriveResource.MetadataResult> getMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.enqueue(new zzdq(this, paramGoogleApiClient, false));
  }
  
  public PendingResult<DriveApi.MetadataBufferResult> listParents(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.enqueue(new zzdr(this, paramGoogleApiClient));
  }
  
  public PendingResult<Status> removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY)).zzb(paramGoogleApiClient, this.zzk, paramChangeListener);
  }
  
  public PendingResult<Status> removeChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    zzaw localzzaw = (zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY);
    DriveId localDriveId = this.zzk;
    Preconditions.checkArgument(com.google.android.gms.drive.events.zzj.zza(1, localDriveId));
    Preconditions.checkState(localzzaw.isConnected(), "Client must be connected");
    return paramGoogleApiClient.execute(new zzba(localzzaw, paramGoogleApiClient, localDriveId, 1));
  }
  
  public PendingResult<Status> setParents(GoogleApiClient paramGoogleApiClient, Set<DriveId> paramSet)
  {
    if (paramSet != null) {
      return paramGoogleApiClient.execute(new zzds(this, paramGoogleApiClient, new ArrayList(paramSet)));
    }
    throw new IllegalArgumentException("ParentIds must be provided.");
  }
  
  public PendingResult<Status> trash(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.execute(new zzdv(this, paramGoogleApiClient));
  }
  
  public PendingResult<Status> untrash(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.execute(new zzdw(this, paramGoogleApiClient));
  }
  
  public PendingResult<DriveResource.MetadataResult> updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet != null) {
      return paramGoogleApiClient.execute(new zzdt(this, paramGoogleApiClient, paramMetadataChangeSet));
    }
    throw new IllegalArgumentException("ChangeSet must be provided.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */