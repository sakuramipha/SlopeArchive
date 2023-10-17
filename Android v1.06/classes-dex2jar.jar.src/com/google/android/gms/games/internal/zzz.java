package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzz
  extends zza
{
  final zzak zza;
  private final TaskCompletionSource zzb;
  
  zzz(zzak paramzzak, TaskCompletionSource paramTaskCompletionSource)
  {
    this.zzb = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzh(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 28	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_3
    //   7: if_icmpne +8 -> 15
    //   10: iconst_1
    //   11: istore_3
    //   12: goto +5 -> 17
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_2
    //   18: sipush 10003
    //   21: if_icmpne +19 -> 40
    //   24: aload_0
    //   25: getfield 12	com/google/android/gms/games/internal/zzz:zza	Lcom/google/android/gms/games/internal/zzak;
    //   28: aload_0
    //   29: getfield 17	com/google/android/gms/games/internal/zzz:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   32: invokestatic 33	com/google/android/gms/games/internal/zzak:zzq	(Lcom/google/android/gms/games/internal/zzak;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    //   35: aload_1
    //   36: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   39: return
    //   40: iload_2
    //   41: ifeq +23 -> 64
    //   44: iload_3
    //   45: ifeq +6 -> 51
    //   48: goto +16 -> 64
    //   51: aload_0
    //   52: getfield 17	com/google/android/gms/games/internal/zzz:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   55: iload_2
    //   56: invokestatic 41	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   59: aload_1
    //   60: invokevirtual 36	com/google/android/gms/common/data/DataHolder:close	()V
    //   63: return
    //   64: new 43	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer
    //   67: dup
    //   68: aload_1
    //   69: invokespecial 45	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   72: astore 4
    //   74: aload 4
    //   76: invokevirtual 48	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:getCount	()I
    //   79: ifle +20 -> 99
    //   82: new 50	com/google/android/gms/games/leaderboard/LeaderboardScoreEntity
    //   85: dup
    //   86: aload 4
    //   88: iconst_0
    //   89: invokevirtual 54	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:get	(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //   92: invokespecial 57	com/google/android/gms/games/leaderboard/LeaderboardScoreEntity:<init>	(Lcom/google/android/gms/games/leaderboard/LeaderboardScore;)V
    //   95: astore_1
    //   96: goto +5 -> 101
    //   99: aconst_null
    //   100: astore_1
    //   101: aload 4
    //   103: invokevirtual 58	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:close	()V
    //   106: aload_0
    //   107: getfield 17	com/google/android/gms/games/internal/zzz:zzb	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   110: new 60	com/google/android/gms/games/AnnotatedData
    //   113: dup
    //   114: aload_1
    //   115: iload_3
    //   116: invokespecial 63	com/google/android/gms/games/AnnotatedData:<init>	(Ljava/lang/Object;Z)V
    //   119: invokevirtual 69	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   122: return
    //   123: astore_1
    //   124: aload 4
    //   126: invokevirtual 58	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:close	()V
    //   129: goto +35 -> 164
    //   132: astore 4
    //   134: ldc 71
    //   136: ldc 73
    //   138: iconst_1
    //   139: anewarray 75	java/lang/Class
    //   142: dup
    //   143: iconst_0
    //   144: ldc 71
    //   146: aastore
    //   147: invokevirtual 79	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   150: aload_1
    //   151: iconst_1
    //   152: anewarray 81	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload 4
    //   159: aastore
    //   160: invokevirtual 87	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   163: pop
    //   164: aload_1
    //   165: athrow
    //   166: astore 4
    //   168: goto -4 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	zzz
    //   0	171	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   4	52	2	i	int
    //   11	105	3	bool	boolean
    //   72	53	4	localLeaderboardScoreBuffer	com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
    //   132	26	4	localObject	Object
    //   166	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   74	96	123	finally
    //   124	129	132	finally
    //   134	164	166	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */