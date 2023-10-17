package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.SnapshotsClient.DataOrConflict;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.tasks.Task;

public final class zzey
  implements SnapshotsClient
{
  private final zzar zza;
  
  public zzey(zzar paramzzar)
  {
    this.zza = paramzzar;
  }
  
  public final Task<SnapshotMetadata> commitAndClose(Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    return this.zza.zzb(new zzeh(paramSnapshot, paramSnapshotMetadataChange));
  }
  
  public final Task<String> delete(SnapshotMetadata paramSnapshotMetadata)
  {
    return this.zza.zzb(new zzei(paramSnapshotMetadata));
  }
  
  public final Task<Void> discardAndClose(Snapshot paramSnapshot)
  {
    return this.zza.zzb(new zzex(paramSnapshot));
  }
  
  public final Task<Integer> getMaxCoverImageSize()
  {
    return this.zza.zzb(zzen.zza);
  }
  
  public final Task<Integer> getMaxDataSize()
  {
    return this.zza.zzb(zzeo.zza);
  }
  
  public final Task<Intent> getSelectSnapshotIntent(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    return this.zza.zzb(new zzel(paramString, paramBoolean1, paramBoolean2, paramInt));
  }
  
  public final Task<AnnotatedData<SnapshotMetadataBuffer>> load(boolean paramBoolean)
  {
    return this.zza.zzb(new zzem(paramBoolean));
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata paramSnapshotMetadata)
  {
    return open(paramSnapshotMetadata.getUniqueName(), false, -1);
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata paramSnapshotMetadata, int paramInt)
  {
    return open(paramSnapshotMetadata.getUniqueName(), false, paramInt);
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(String paramString, boolean paramBoolean)
  {
    return open(paramString, paramBoolean, -1);
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(String paramString, boolean paramBoolean, int paramInt)
  {
    return this.zza.zzb(new zzek(paramString, paramBoolean, paramInt));
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(String paramString, Snapshot paramSnapshot)
  {
    Object localObject2 = paramSnapshot.getMetadata();
    Object localObject1 = new SnapshotMetadataChange.Builder();
    ((SnapshotMetadataChange.Builder)localObject1).fromMetadata((SnapshotMetadata)localObject2);
    localObject1 = ((SnapshotMetadataChange.Builder)localObject1).build();
    localObject2 = ((SnapshotMetadata)localObject2).getSnapshotId();
    paramSnapshot = paramSnapshot.getSnapshotContents();
    return this.zza.zzb(new zzej(paramString, (String)localObject2, (SnapshotMetadataChange)localObject1, paramSnapshot));
  }
  
  public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    return this.zza.zzb(new zzej(paramString1, paramString2, paramSnapshotMetadataChange, paramSnapshotContents));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */