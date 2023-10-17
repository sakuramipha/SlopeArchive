package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzy
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzy(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzg(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 24	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
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
    //   18: ifeq +23 -> 41
    //   21: iload_3
    //   22: ifeq +6 -> 28
    //   25: goto +16 -> 41
    //   28: aload_0
    //   29: getfield 13	com/google/android/gms/games/internal/zzy:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   32: iload_2
    //   33: invokestatic 29	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   36: aload_1
    //   37: invokevirtual 32	com/google/android/gms/common/data/DataHolder:close	()V
    //   40: return
    //   41: new 34	com/google/android/gms/games/leaderboard/LeaderboardBuffer
    //   44: dup
    //   45: aload_1
    //   46: invokespecial 36	com/google/android/gms/games/leaderboard/LeaderboardBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 39	com/google/android/gms/games/leaderboard/LeaderboardBuffer:getCount	()I
    //   56: ifle +21 -> 77
    //   59: aload 4
    //   61: iconst_0
    //   62: invokevirtual 43	com/google/android/gms/games/leaderboard/LeaderboardBuffer:get	(I)Ljava/lang/Object;
    //   65: checkcast 45	com/google/android/gms/games/leaderboard/Leaderboard
    //   68: invokeinterface 49 1 0
    //   73: astore_1
    //   74: goto +5 -> 79
    //   77: aconst_null
    //   78: astore_1
    //   79: aload 4
    //   81: invokevirtual 50	com/google/android/gms/games/leaderboard/LeaderboardBuffer:close	()V
    //   84: aload_0
    //   85: getfield 13	com/google/android/gms/games/internal/zzy:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   88: new 52	com/google/android/gms/games/AnnotatedData
    //   91: dup
    //   92: aload_1
    //   93: iload_3
    //   94: invokespecial 55	com/google/android/gms/games/AnnotatedData:<init>	(Ljava/lang/Object;Z)V
    //   97: invokevirtual 61	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   100: return
    //   101: astore_1
    //   102: aload 4
    //   104: invokevirtual 50	com/google/android/gms/games/leaderboard/LeaderboardBuffer:close	()V
    //   107: goto +35 -> 142
    //   110: astore 4
    //   112: ldc 63
    //   114: ldc 65
    //   116: iconst_1
    //   117: anewarray 67	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc 63
    //   124: aastore
    //   125: invokevirtual 71	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   128: aload_1
    //   129: iconst_1
    //   130: anewarray 73	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload 4
    //   137: aastore
    //   138: invokevirtual 79	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: pop
    //   142: aload_1
    //   143: athrow
    //   144: astore 4
    //   146: goto -4 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	zzy
    //   0	149	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   4	29	2	i	int
    //   11	83	3	bool	boolean
    //   49	54	4	localLeaderboardBuffer	com.google.android.gms.games.leaderboard.LeaderboardBuffer
    //   110	26	4	localObject	Object
    //   144	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   51	74	101	finally
    //   102	107	110	finally
    //   112	142	144	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */