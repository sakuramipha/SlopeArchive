package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaa
  extends zza
{
  final zzak zza;
  private final TaskCompletionSource zzb;
  
  zzaa(zzak paramzzak, TaskCompletionSource paramTaskCompletionSource)
  {
    this.zzb = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzf(com.google.android.gms.common.data.DataHolder paramDataHolder1, com.google.android.gms.common.data.DataHolder paramDataHolder2)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 28	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   4: istore_3
    //   5: iload_3
    //   6: iconst_3
    //   7: if_icmpne +9 -> 16
    //   10: iconst_1
    //   11: istore 4
    //   13: goto +6 -> 19
    //   16: iconst_0
    //   17: istore 4
    //   19: iload_3
    //   20: sipush 10003
    //   23: if_icmpne +23 -> 46
    //   26: aload_0
    //   27: getfield 12	com/google/android/gms/games/internal/zzaa:zza	Lcom/google/android/gms/games/internal/zzak;
    //   30: aload_0
    //   31: getfield 17	com/google/android/gms/games/internal/zzaa:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   34: invokestatic 33	com/google/android/gms/games/internal/zzak:zzq	(Lcom/google/android/gms/games/internal/zzak;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    //   37: aload_1
    //   38: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   41: aload_2
    //   42: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   45: return
    //   46: iload_3
    //   47: ifeq +28 -> 75
    //   50: iload 4
    //   52: ifeq +6 -> 58
    //   55: goto +20 -> 75
    //   58: aload_0
    //   59: getfield 17	com/google/android/gms/games/internal/zzaa:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   62: iload_3
    //   63: invokestatic 41	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   66: aload_1
    //   67: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   70: aload_2
    //   71: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   74: return
    //   75: new 43	com/google/android/gms/games/leaderboard/LeaderboardBuffer
    //   78: dup
    //   79: aload_1
    //   80: invokespecial 46	com/google/android/gms/games/leaderboard/LeaderboardBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   83: astore 5
    //   85: aload 5
    //   87: invokevirtual 49	com/google/android/gms/games/leaderboard/LeaderboardBuffer:getCount	()I
    //   90: ifle +21 -> 111
    //   93: aload 5
    //   95: iconst_0
    //   96: invokevirtual 53	com/google/android/gms/games/leaderboard/LeaderboardBuffer:get	(I)Ljava/lang/Object;
    //   99: checkcast 55	com/google/android/gms/games/leaderboard/Leaderboard
    //   102: invokeinterface 59 1 0
    //   107: astore_1
    //   108: goto +5 -> 113
    //   111: aconst_null
    //   112: astore_1
    //   113: aload 5
    //   115: invokevirtual 60	com/google/android/gms/games/leaderboard/LeaderboardBuffer:close	()V
    //   118: aload_0
    //   119: getfield 17	com/google/android/gms/games/internal/zzaa:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   122: new 62	com/google/android/gms/games/AnnotatedData
    //   125: dup
    //   126: new 64	com/google/android/gms/games/LeaderboardsClient$LeaderboardScores
    //   129: dup
    //   130: aload_1
    //   131: new 66	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer
    //   134: dup
    //   135: aload_2
    //   136: invokespecial 67	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   139: invokespecial 70	com/google/android/gms/games/LeaderboardsClient$LeaderboardScores:<init>	(Lcom/google/android/gms/games/leaderboard/Leaderboard;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;)V
    //   142: iload 4
    //   144: invokespecial 73	com/google/android/gms/games/AnnotatedData:<init>	(Ljava/lang/Object;Z)V
    //   147: invokevirtual 79	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   150: return
    //   151: astore_1
    //   152: aload 5
    //   154: invokevirtual 60	com/google/android/gms/games/leaderboard/LeaderboardBuffer:close	()V
    //   157: goto +33 -> 190
    //   160: astore_2
    //   161: ldc 81
    //   163: ldc 83
    //   165: iconst_1
    //   166: anewarray 85	java/lang/Class
    //   169: dup
    //   170: iconst_0
    //   171: ldc 81
    //   173: aastore
    //   174: invokevirtual 89	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   177: aload_1
    //   178: iconst_1
    //   179: anewarray 91	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload_2
    //   185: aastore
    //   186: invokevirtual 97	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: aload_1
    //   191: athrow
    //   192: astore_2
    //   193: goto -3 -> 190
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	zzaa
    //   0	196	1	paramDataHolder1	com.google.android.gms.common.data.DataHolder
    //   0	196	2	paramDataHolder2	com.google.android.gms.common.data.DataHolder
    //   4	59	3	i	int
    //   11	132	4	bool	boolean
    //   83	70	5	localLeaderboardBuffer	com.google.android.gms.games.leaderboard.LeaderboardBuffer
    // Exception table:
    //   from	to	target	type
    //   85	108	151	finally
    //   152	157	160	finally
    //   161	190	192	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */