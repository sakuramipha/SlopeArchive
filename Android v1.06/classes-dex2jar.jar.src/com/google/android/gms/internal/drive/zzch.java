package com.google.android.gms.internal.drive;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.Drive.zza;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResourceClient;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ListenerToken;
import com.google.android.gms.drive.events.OnChangeListener;
import com.google.android.gms.drive.events.OpenFileCallback;
import com.google.android.gms.drive.events.zzj;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.zzn;
import com.google.android.gms.drive.zzp;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzch
  extends DriveResourceClient
{
  private static final AtomicInteger zzfn = new AtomicInteger();
  
  public zzch(Activity paramActivity, Drive.zza paramzza)
  {
    super(paramActivity, paramzza);
  }
  
  public zzch(Context paramContext, Drive.zza paramzza)
  {
    super(paramContext, paramzza);
  }
  
  private static void zze(int paramInt)
  {
    if ((paramInt != 268435456) && (paramInt != 536870912) && (paramInt != 805306368)) {
      throw new IllegalArgumentException("Invalid openMode provided");
    }
  }
  
  public final Task<ListenerToken> addChangeListener(DriveResource paramDriveResource, OnChangeListener paramOnChangeListener)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    Preconditions.checkNotNull(paramOnChangeListener, "listener");
    paramOnChangeListener = new zzdi(this, paramOnChangeListener, paramDriveResource.getDriveId());
    int i = zzfn.incrementAndGet();
    Object localObject = new StringBuilder(27);
    ((StringBuilder)localObject).append("OnChangeListener");
    ((StringBuilder)localObject).append(i);
    localObject = registerListener(paramOnChangeListener, ((StringBuilder)localObject).toString());
    return doRegisterEventListener(new zzcp(this, (ListenerHolder)localObject, paramDriveResource, paramOnChangeListener), new zzcq(this, ((ListenerHolder)localObject).getListenerKey(), paramDriveResource, paramOnChangeListener)).continueWith(new zzci((ListenerHolder)localObject));
  }
  
  public final Task<Void> addChangeSubscription(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    Preconditions.checkArgument(zzj.zza(1, paramDriveResource.getDriveId()));
    return doWrite(new zzcr(this, paramDriveResource));
  }
  
  public final Task<Boolean> cancelOpenFileCallback(ListenerToken paramListenerToken)
  {
    if ((paramListenerToken instanceof zzg)) {
      return doUnregisterEventListener(((zzg)paramListenerToken).zzad());
    }
    throw new IllegalArgumentException("Unrecognized ListenerToken");
  }
  
  public final Task<Void> commitContents(DriveContents paramDriveContents, MetadataChangeSet paramMetadataChangeSet)
  {
    return commitContents(paramDriveContents, paramMetadataChangeSet, (zzn)new zzp().build());
  }
  
  public final Task<Void> commitContents(DriveContents paramDriveContents, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions)
  {
    Preconditions.checkNotNull(paramExecutionOptions, "Execution options cannot be null.");
    boolean bool2 = paramDriveContents.zzk();
    boolean bool1 = true;
    Preconditions.checkArgument(bool2 ^ true, "DriveContents is already closed");
    if (paramDriveContents.getMode() == 268435456) {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1, "Cannot commit contents opened in MODE_READ_ONLY.");
    Preconditions.checkNotNull(paramDriveContents.getDriveId(), "Only DriveContents obtained through DriveFile.open can be committed.");
    zzn localzzn = zzn.zza(paramExecutionOptions);
    if ((ExecutionOptions.zza(localzzn.zzn())) && (!paramDriveContents.zzi().zzb())) {
      throw new IllegalStateException("DriveContents must be valid for conflict detection.");
    }
    paramExecutionOptions = paramMetadataChangeSet;
    if (paramMetadataChangeSet == null) {
      paramExecutionOptions = MetadataChangeSet.zzax;
    }
    return doWrite(new zzcy(this, localzzn, paramDriveContents, paramExecutionOptions));
  }
  
  public final Task<DriveContents> createContents()
  {
    Preconditions.checkArgument(true, "Contents can only be created in MODE_WRITE_ONLY or MODE_READ_WRITE.");
    return doWrite(new zzcw(this, 536870912));
  }
  
  public final Task<DriveFile> createFile(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents)
  {
    return createFile(paramDriveFolder, paramMetadataChangeSet, paramDriveContents, new ExecutionOptions.Builder().build());
  }
  
  public final Task<DriveFile> createFile(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions)
  {
    zzbs.zzb(paramMetadataChangeSet);
    return doWrite(new zzdh(paramDriveFolder, paramMetadataChangeSet, paramDriveContents, paramExecutionOptions, null));
  }
  
  public final Task<DriveFolder> createFolder(DriveFolder paramDriveFolder, MetadataChangeSet paramMetadataChangeSet)
  {
    Preconditions.checkNotNull(paramMetadataChangeSet, "MetadataChangeSet must be provided.");
    if ((paramMetadataChangeSet.getMimeType() != null) && (!paramMetadataChangeSet.getMimeType().equals("application/vnd.google-apps.folder"))) {
      throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }
    return doWrite(new zzdb(this, paramMetadataChangeSet, paramDriveFolder));
  }
  
  public final Task<Void> delete(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    return doWrite(new zzcl(this, paramDriveResource));
  }
  
  public final Task<Void> discardContents(DriveContents paramDriveContents)
  {
    Preconditions.checkArgument(paramDriveContents.zzk() ^ true, "DriveContents is already closed");
    paramDriveContents.zzj();
    return doWrite(new zzda(this, paramDriveContents));
  }
  
  public final Task<DriveFolder> getAppFolder()
  {
    return doRead(new zzco(this));
  }
  
  public final Task<Metadata> getMetadata(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource, "DriveResource must not be null");
    Preconditions.checkNotNull(paramDriveResource.getDriveId(), "Resource's DriveId must not be null");
    return doRead(new zzdc(this, paramDriveResource, false));
  }
  
  public final Task<DriveFolder> getRootFolder()
  {
    return doRead(new zzck(this));
  }
  
  public final Task<MetadataBuffer> listChildren(DriveFolder paramDriveFolder)
  {
    Preconditions.checkNotNull(paramDriveFolder, "folder cannot be null.");
    return query(zzbs.zza(null, paramDriveFolder.getDriveId()));
  }
  
  public final Task<MetadataBuffer> listParents(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    return doRead(new zzde(this, paramDriveResource));
  }
  
  public final Task<DriveContents> openFile(DriveFile paramDriveFile, int paramInt)
  {
    zze(paramInt);
    return doRead(new zzct(this, paramDriveFile, paramInt));
  }
  
  public final Task<ListenerToken> openFile(DriveFile paramDriveFile, int paramInt, OpenFileCallback paramOpenFileCallback)
  {
    zze(paramInt);
    int i = zzfn.incrementAndGet();
    Object localObject = new StringBuilder(27);
    ((StringBuilder)localObject).append("OpenFileCallback");
    ((StringBuilder)localObject).append(i);
    ListenerHolder localListenerHolder = registerListener(paramOpenFileCallback, ((StringBuilder)localObject).toString());
    paramOpenFileCallback = localListenerHolder.getListenerKey();
    localObject = new zzg(paramOpenFileCallback);
    return doRegisterEventListener(new zzcu(this, localListenerHolder, paramDriveFile, paramInt, (zzg)localObject, localListenerHolder), new zzcv(this, paramOpenFileCallback, (zzg)localObject)).continueWith(new zzcj((zzg)localObject));
  }
  
  public final Task<MetadataBuffer> query(Query paramQuery)
  {
    Preconditions.checkNotNull(paramQuery, "query cannot be null.");
    return doRead(new zzcz(this, paramQuery));
  }
  
  public final Task<MetadataBuffer> queryChildren(DriveFolder paramDriveFolder, Query paramQuery)
  {
    Preconditions.checkNotNull(paramDriveFolder, "folder cannot be null.");
    Preconditions.checkNotNull(paramQuery, "query cannot be null.");
    return query(zzbs.zza(paramQuery, paramDriveFolder.getDriveId()));
  }
  
  public final Task<Boolean> removeChangeListener(ListenerToken paramListenerToken)
  {
    Preconditions.checkNotNull(paramListenerToken, "Token is required to unregister listener.");
    if ((paramListenerToken instanceof zzg)) {
      return doUnregisterEventListener(((zzg)paramListenerToken).zzad());
    }
    throw new IllegalStateException("Could not recover key from ListenerToken");
  }
  
  public final Task<Void> removeChangeSubscription(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    Preconditions.checkArgument(zzj.zza(1, paramDriveResource.getDriveId()));
    return doWrite(new zzcs(this, paramDriveResource));
  }
  
  public final Task<DriveContents> reopenContentsForWrite(DriveContents paramDriveContents)
  {
    boolean bool2 = paramDriveContents.zzk();
    boolean bool1 = true;
    Preconditions.checkArgument(bool2 ^ true, "DriveContents is already closed");
    if (paramDriveContents.getMode() != 268435456) {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1, "This method can only be called on contents that are currently opened in MODE_READ_ONLY.");
    paramDriveContents.zzj();
    return doRead(new zzcx(this, paramDriveContents));
  }
  
  public final Task<Void> setParents(DriveResource paramDriveResource, Set<DriveId> paramSet)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    Preconditions.checkNotNull(paramSet);
    return doWrite(new zzdf(this, paramDriveResource, new ArrayList(paramSet)));
  }
  
  public final Task<Void> trash(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    return doWrite(new zzcm(this, paramDriveResource));
  }
  
  public final Task<Void> untrash(DriveResource paramDriveResource)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    return doWrite(new zzcn(this, paramDriveResource));
  }
  
  public final Task<Metadata> updateMetadata(DriveResource paramDriveResource, MetadataChangeSet paramMetadataChangeSet)
  {
    Preconditions.checkNotNull(paramDriveResource.getDriveId());
    Preconditions.checkNotNull(paramMetadataChangeSet);
    return doWrite(new zzdd(this, paramMetadataChangeSet, paramDriveResource));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */