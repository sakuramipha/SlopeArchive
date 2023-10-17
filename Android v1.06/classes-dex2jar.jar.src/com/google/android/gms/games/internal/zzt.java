package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzt
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzt(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzn(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 24	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   4: istore_2
    //   5: iload_2
    //   6: ifeq +16 -> 22
    //   9: aload_0
    //   10: getfield 13	com/google/android/gms/games/internal/zzt:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   13: iload_2
    //   14: invokestatic 29	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   17: aload_1
    //   18: invokevirtual 32	com/google/android/gms/common/data/DataHolder:close	()V
    //   21: return
    //   22: new 34	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 36	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   30: astore_3
    //   31: aload_3
    //   32: invokevirtual 39	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:getCount	()I
    //   35: ifle +19 -> 54
    //   38: new 41	com/google/android/gms/games/snapshot/SnapshotMetadataEntity
    //   41: dup
    //   42: aload_3
    //   43: iconst_0
    //   44: invokevirtual 45	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:get	(I)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   47: invokespecial 48	com/google/android/gms/games/snapshot/SnapshotMetadataEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   50: astore_1
    //   51: goto +5 -> 56
    //   54: aconst_null
    //   55: astore_1
    //   56: aload_3
    //   57: invokevirtual 49	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   60: aload_0
    //   61: getfield 13	com/google/android/gms/games/internal/zzt:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   64: aload_1
    //   65: invokevirtual 55	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   68: return
    //   69: astore_1
    //   70: aload_3
    //   71: invokevirtual 49	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:close	()V
    //   74: goto +33 -> 107
    //   77: astore_3
    //   78: ldc 57
    //   80: ldc 59
    //   82: iconst_1
    //   83: anewarray 61	java/lang/Class
    //   86: dup
    //   87: iconst_0
    //   88: ldc 57
    //   90: aastore
    //   91: invokevirtual 65	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   94: aload_1
    //   95: iconst_1
    //   96: anewarray 67	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_3
    //   102: aastore
    //   103: invokevirtual 73	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: aload_1
    //   108: athrow
    //   109: astore_3
    //   110: goto -3 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	zzt
    //   0	113	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   4	10	2	i	int
    //   30	41	3	localSnapshotMetadataBuffer	com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
    //   77	25	3	localObject	Object
    //   109	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   31	51	69	finally
    //   70	74	77	finally
    //   78	107	109	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */