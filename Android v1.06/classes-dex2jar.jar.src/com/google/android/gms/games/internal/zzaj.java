package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaj
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzaj(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzo(com.google.android.gms.common.data.DataHolder paramDataHolder, String paramString, com.google.android.gms.drive.Contents paramContents1, com.google.android.gms.drive.Contents paramContents2, com.google.android.gms.drive.Contents paramContents3)
  {
    // Byte code:
    //   0: new 18	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 21	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   8: astore_1
    //   9: aload_1
    //   10: invokevirtual 25	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:getCount	()I
    //   13: iconst_2
    //   14: if_icmplt +139 -> 153
    //   17: aload_2
    //   18: ifnull +135 -> 153
    //   21: aload 5
    //   23: ifnonnull +6 -> 29
    //   26: goto +127 -> 153
    //   29: new 27	com/google/android/gms/games/snapshot/SnapshotEntity
    //   32: astore 6
    //   34: aload_1
    //   35: iconst_0
    //   36: invokevirtual 31	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:get	(I)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   39: astore 8
    //   41: new 33	com/google/android/gms/games/snapshot/SnapshotMetadataEntity
    //   44: astore 7
    //   46: aload 7
    //   48: aload 8
    //   50: invokespecial 36	com/google/android/gms/games/snapshot/SnapshotMetadataEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   53: new 38	com/google/android/gms/games/snapshot/SnapshotContentsEntity
    //   56: astore 8
    //   58: aload 8
    //   60: aload_3
    //   61: invokespecial 41	com/google/android/gms/games/snapshot/SnapshotContentsEntity:<init>	(Lcom/google/android/gms/drive/Contents;)V
    //   64: aload 6
    //   66: aload 7
    //   68: aload 8
    //   70: invokespecial 44	com/google/android/gms/games/snapshot/SnapshotEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V
    //   73: aload_1
    //   74: iconst_1
    //   75: invokevirtual 31	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:get	(I)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   78: astore 7
    //   80: new 33	com/google/android/gms/games/snapshot/SnapshotMetadataEntity
    //   83: astore_3
    //   84: aload_3
    //   85: aload 7
    //   87: invokespecial 36	com/google/android/gms/games/snapshot/SnapshotMetadataEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   90: new 38	com/google/android/gms/games/snapshot/SnapshotContentsEntity
    //   93: astore 7
    //   95: aload 7
    //   97: aload 4
    //   99: invokespecial 41	com/google/android/gms/games/snapshot/SnapshotContentsEntity:<init>	(Lcom/google/android/gms/drive/Contents;)V
    //   102: new 27	com/google/android/gms/games/snapshot/SnapshotEntity
    //   105: dup
    //   106: aload_3
    //   107: aload 7
    //   109: invokespecial 44	com/google/android/gms/games/snapshot/SnapshotEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V
    //   112: astore_3
    //   113: aload_1
    //   114: invokevirtual 47	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   117: aload_0
    //   118: getfield 13	com/google/android/gms/games/internal/zzaj:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   121: new 49	com/google/android/gms/games/SnapshotsClient$DataOrConflict
    //   124: dup
    //   125: aconst_null
    //   126: new 51	com/google/android/gms/games/SnapshotsClient$SnapshotConflict
    //   129: dup
    //   130: aload 6
    //   132: aload_2
    //   133: aload_3
    //   134: new 38	com/google/android/gms/games/snapshot/SnapshotContentsEntity
    //   137: dup
    //   138: aload 5
    //   140: invokespecial 41	com/google/android/gms/games/snapshot/SnapshotContentsEntity:<init>	(Lcom/google/android/gms/drive/Contents;)V
    //   143: invokespecial 54	com/google/android/gms/games/SnapshotsClient$SnapshotConflict:<init>	(Lcom/google/android/gms/games/snapshot/Snapshot;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V
    //   146: invokespecial 57	com/google/android/gms/games/SnapshotsClient$DataOrConflict:<init>	(Ljava/lang/Object;Lcom/google/android/gms/games/SnapshotsClient$SnapshotConflict;)V
    //   149: invokevirtual 63	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   152: return
    //   153: aload_0
    //   154: getfield 13	com/google/android/gms/games/internal/zzaj:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   157: aconst_null
    //   158: invokevirtual 63	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   161: aload_1
    //   162: invokevirtual 47	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   165: return
    //   166: astore_2
    //   167: aload_1
    //   168: invokevirtual 47	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   171: goto +9 -> 180
    //   174: astore_1
    //   175: aload_2
    //   176: aload_1
    //   177: invokestatic 68	com/google/android/gms/games/internal/zzai:zza	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   180: aload_2
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	zzaj
    //   0	182	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   0	182	2	paramString	String
    //   0	182	3	paramContents1	com.google.android.gms.drive.Contents
    //   0	182	4	paramContents2	com.google.android.gms.drive.Contents
    //   0	182	5	paramContents3	com.google.android.gms.drive.Contents
    //   32	99	6	localSnapshotEntity	com.google.android.gms.games.snapshot.SnapshotEntity
    //   44	64	7	localObject1	Object
    //   39	30	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	17	166	finally
    //   29	113	166	finally
    //   153	161	166	finally
    //   167	171	174	finally
  }
  
  /* Error */
  public final void zzq(com.google.android.gms.common.data.DataHolder paramDataHolder, com.google.android.gms.drive.Contents paramContents)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 75	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   4: istore 4
    //   6: new 18	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 21	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: astore 5
    //   16: aload 5
    //   18: invokevirtual 25	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:getCount	()I
    //   21: ifle +46 -> 67
    //   24: aload 5
    //   26: iconst_0
    //   27: invokevirtual 31	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:get	(I)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   30: astore 6
    //   32: new 33	com/google/android/gms/games/snapshot/SnapshotMetadataEntity
    //   35: astore_1
    //   36: aload_1
    //   37: aload 6
    //   39: invokespecial 36	com/google/android/gms/games/snapshot/SnapshotMetadataEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   42: new 38	com/google/android/gms/games/snapshot/SnapshotContentsEntity
    //   45: astore 6
    //   47: aload 6
    //   49: aload_2
    //   50: invokespecial 41	com/google/android/gms/games/snapshot/SnapshotContentsEntity:<init>	(Lcom/google/android/gms/drive/Contents;)V
    //   53: new 27	com/google/android/gms/games/snapshot/SnapshotEntity
    //   56: dup
    //   57: aload_1
    //   58: aload 6
    //   60: invokespecial 44	com/google/android/gms/games/snapshot/SnapshotEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V
    //   63: astore_1
    //   64: goto +5 -> 69
    //   67: aconst_null
    //   68: astore_1
    //   69: aload 5
    //   71: invokevirtual 47	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   74: iload 4
    //   76: ifne +20 -> 96
    //   79: aload_0
    //   80: getfield 13	com/google/android/gms/games/internal/zzaj:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   83: new 49	com/google/android/gms/games/SnapshotsClient$DataOrConflict
    //   86: dup
    //   87: aload_1
    //   88: aconst_null
    //   89: invokespecial 57	com/google/android/gms/games/SnapshotsClient$DataOrConflict:<init>	(Ljava/lang/Object;Lcom/google/android/gms/games/SnapshotsClient$SnapshotConflict;)V
    //   92: invokevirtual 63	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   95: return
    //   96: iload 4
    //   98: istore_3
    //   99: iload 4
    //   101: sipush 4002
    //   104: if_icmpne +46 -> 150
    //   107: aload_1
    //   108: ifnull +38 -> 146
    //   111: aload_1
    //   112: invokevirtual 79	com/google/android/gms/games/snapshot/SnapshotEntity:getMetadata	()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   115: ifnonnull +6 -> 121
    //   118: goto +28 -> 146
    //   121: aload_0
    //   122: getfield 13	com/google/android/gms/games/internal/zzaj:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   125: new 81	com/google/android/gms/games/SnapshotsClient$SnapshotContentUnavailableApiException
    //   128: dup
    //   129: sipush 4002
    //   132: invokestatic 86	com/google/android/gms/games/GamesStatusCodes:zza	(I)Lcom/google/android/gms/common/api/Status;
    //   135: aload_1
    //   136: invokevirtual 79	com/google/android/gms/games/snapshot/SnapshotEntity:getMetadata	()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   139: invokespecial 89	com/google/android/gms/games/SnapshotsClient$SnapshotContentUnavailableApiException:<init>	(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   142: invokevirtual 93	com/google/android/gms/tasks/TaskCompletionSource:setException	(Ljava/lang/Exception;)V
    //   145: return
    //   146: sipush 4002
    //   149: istore_3
    //   150: aload_0
    //   151: getfield 13	com/google/android/gms/games/internal/zzaj:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   154: iload_3
    //   155: invokestatic 98	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   158: return
    //   159: astore_1
    //   160: aload 5
    //   162: invokevirtual 47	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   165: goto +9 -> 174
    //   168: astore_2
    //   169: aload_1
    //   170: aload_2
    //   171: invokestatic 68	com/google/android/gms/games/internal/zzai:zza	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   174: aload_1
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	zzaj
    //   0	176	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   0	176	2	paramContents	com.google.android.gms.drive.Contents
    //   98	57	3	i	int
    //   4	101	4	j	int
    //   14	147	5	localSnapshotMetadataBuffer	com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
    //   30	29	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	64	159	finally
    //   160	165	168	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */