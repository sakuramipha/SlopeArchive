package com.google.android.gms.drive;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.drive.events.ListenerToken;
import com.google.android.gms.drive.events.OnChangeListener;
import com.google.android.gms.drive.events.OpenFileCallback;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.tasks.Task;
import java.util.Set;

@Deprecated
public abstract class DriveResourceClient
  extends GoogleApi<Drive.zza>
{
  public DriveResourceClient(Activity paramActivity, Drive.zza paramzza)
  {
    super(paramActivity, Drive.zzw, paramzza, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  public DriveResourceClient(Context paramContext, Drive.zza paramzza)
  {
    super(paramContext, Drive.zzw, paramzza, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  @Deprecated
  public abstract Task<ListenerToken> addChangeListener(DriveResource paramDriveResource, OnChangeListener paramOnChangeListener);
  
  @Deprecated
  public abstract Task<Void> addChangeSubscription(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<Boolean> cancelOpenFileCallback(ListenerToken paramListenerToken);
  
  @Deprecated
  public abstract Task<Void> commitContents(DriveContents paramDriveContents, MetadataChangeSet paramMetadataChangeSet);
  
  @Deprecated
  public abstract Task<Void> commitContents(DriveContents paramDriveContents, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions);
  
  @Deprecated
  public abstract Task<DriveContents> createContents();
  
  @Deprecated
  public abstract Task<DriveFile> createFile(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents);
  
  @Deprecated
  public abstract Task<DriveFile> createFile(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions);
  
  @Deprecated
  public abstract Task<DriveFolder> createFolder(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet);
  
  @Deprecated
  public abstract Task<Void> delete(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<Void> discardContents(DriveContents paramDriveContents);
  
  @Deprecated
  public abstract Task<DriveFolder> getAppFolder();
  
  @Deprecated
  public abstract Task<Metadata> getMetadata(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<DriveFolder> getRootFolder();
  
  @Deprecated
  public abstract Task<MetadataBuffer> listChildren(DriveFolder paramDriveFolder);
  
  @Deprecated
  public abstract Task<MetadataBuffer> listParents(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<DriveContents> openFile(DriveFile paramDriveFile, int paramInt);
  
  @Deprecated
  public abstract Task<ListenerToken> openFile(DriveFile paramDriveFile, int paramInt, OpenFileCallback paramOpenFileCallback);
  
  @Deprecated
  public abstract Task<MetadataBuffer> query(Query paramQuery);
  
  @Deprecated
  public abstract Task<MetadataBuffer> queryChildren(DriveFolder paramDriveFolder, Query paramQuery);
  
  @Deprecated
  public abstract Task<Boolean> removeChangeListener(ListenerToken paramListenerToken);
  
  @Deprecated
  public abstract Task<Void> removeChangeSubscription(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<DriveContents> reopenContentsForWrite(DriveContents paramDriveContents);
  
  @Deprecated
  public abstract Task<Void> setParents(DriveResource paramDriveResource, Set<DriveId> paramSet);
  
  @Deprecated
  public abstract Task<Void> trash(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<Void> untrash(DriveResource paramDriveResource);
  
  @Deprecated
  public abstract Task<Metadata> updateMetadata(DriveResource paramDriveResource, MetadataChangeSet paramMetadataChangeSet);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveResourceClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */