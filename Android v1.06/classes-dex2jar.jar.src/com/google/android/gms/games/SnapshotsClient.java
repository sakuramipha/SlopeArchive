package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface SnapshotsClient
{
  public static final int DISPLAY_LIMIT_NONE = -1;
  public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
  public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
  public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
  public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
  public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
  public static final int RESOLUTION_POLICY_MANUAL = -1;
  public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;
  
  public abstract Task<SnapshotMetadata> commitAndClose(Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange);
  
  public abstract Task<String> delete(SnapshotMetadata paramSnapshotMetadata);
  
  public abstract Task<Void> discardAndClose(Snapshot paramSnapshot);
  
  public abstract Task<Integer> getMaxCoverImageSize();
  
  public abstract Task<Integer> getMaxDataSize();
  
  public abstract Task<Intent> getSelectSnapshotIntent(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
  
  public abstract Task<AnnotatedData<SnapshotMetadataBuffer>> load(boolean paramBoolean);
  
  public abstract Task<DataOrConflict<Snapshot>> open(SnapshotMetadata paramSnapshotMetadata);
  
  public abstract Task<DataOrConflict<Snapshot>> open(SnapshotMetadata paramSnapshotMetadata, int paramInt);
  
  public abstract Task<DataOrConflict<Snapshot>> open(String paramString, boolean paramBoolean);
  
  public abstract Task<DataOrConflict<Snapshot>> open(String paramString, boolean paramBoolean, int paramInt);
  
  public abstract Task<DataOrConflict<Snapshot>> resolveConflict(String paramString, Snapshot paramSnapshot);
  
  public abstract Task<DataOrConflict<Snapshot>> resolveConflict(String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents);
  
  public static final class DataOrConflict<T>
  {
    private final Object zza;
    private final SnapshotsClient.SnapshotConflict zzb;
    
    public DataOrConflict(Object paramObject, SnapshotsClient.SnapshotConflict paramSnapshotConflict)
    {
      this.zza = paramObject;
      this.zzb = paramSnapshotConflict;
    }
    
    public SnapshotsClient.SnapshotConflict getConflict()
    {
      if (isConflict()) {
        return this.zzb;
      }
      throw new IllegalStateException("getConflict called when there is no conflict.");
    }
    
    public T getData()
    {
      if (!isConflict()) {
        return (T)this.zza;
      }
      throw new IllegalStateException("getData called when there is a conflict.");
    }
    
    public boolean isConflict()
    {
      return this.zzb != null;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ResolutionPolicy {}
  
  public static final class SnapshotConflict
  {
    private final Snapshot zza;
    private final String zzb;
    private final Snapshot zzc;
    private final SnapshotContents zzd;
    
    public SnapshotConflict(Snapshot paramSnapshot1, String paramString, Snapshot paramSnapshot2, SnapshotContents paramSnapshotContents)
    {
      this.zza = paramSnapshot1;
      this.zzb = paramString;
      this.zzc = paramSnapshot2;
      this.zzd = paramSnapshotContents;
    }
    
    public String getConflictId()
    {
      return this.zzb;
    }
    
    public Snapshot getConflictingSnapshot()
    {
      return this.zzc;
    }
    
    public SnapshotContents getResolutionSnapshotContents()
    {
      return this.zzd;
    }
    
    public Snapshot getSnapshot()
    {
      return this.zza;
    }
  }
  
  public static final class SnapshotContentUnavailableApiException
    extends ApiException
  {
    protected final SnapshotMetadata metadata;
    
    public SnapshotContentUnavailableApiException(Status paramStatus, SnapshotMetadata paramSnapshotMetadata)
    {
      super();
      this.metadata = paramSnapshotMetadata;
    }
    
    public SnapshotMetadata getSnapshotMetadata()
    {
      return this.metadata;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\SnapshotsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */