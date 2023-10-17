package com.google.android.gms.games.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzad
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzad(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  /* Error */
  public final void zzi(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 24	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   4: istore_2
    //   5: iload_2
    //   6: ifeq +24 -> 30
    //   9: iload_2
    //   10: iconst_3
    //   11: if_icmpne +6 -> 17
    //   14: goto +16 -> 30
    //   17: aload_0
    //   18: getfield 13	com/google/android/gms/games/internal/zzad:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   21: iload_2
    //   22: invokestatic 29	com/google/android/gms/games/GamesStatusUtils:zza	(Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    //   25: aload_1
    //   26: invokevirtual 32	com/google/android/gms/common/data/DataHolder:close	()V
    //   29: return
    //   30: new 34	com/google/android/gms/games/stats/PlayerStatsBuffer
    //   33: dup
    //   34: aload_1
    //   35: invokespecial 36	com/google/android/gms/games/stats/PlayerStatsBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   38: astore 4
    //   40: iconst_1
    //   41: istore_3
    //   42: aload 4
    //   44: invokevirtual 39	com/google/android/gms/games/stats/PlayerStatsBuffer:getCount	()I
    //   47: ifle +20 -> 67
    //   50: new 41	com/google/android/gms/games/stats/PlayerStatsEntity
    //   53: dup
    //   54: aload 4
    //   56: iconst_0
    //   57: invokevirtual 44	com/google/android/gms/games/stats/PlayerStatsBuffer:zza	(I)Lcom/google/android/gms/games/stats/PlayerStats;
    //   60: invokespecial 47	com/google/android/gms/games/stats/PlayerStatsEntity:<init>	(Lcom/google/android/gms/games/stats/PlayerStats;)V
    //   63: astore_1
    //   64: goto +5 -> 69
    //   67: aconst_null
    //   68: astore_1
    //   69: aload 4
    //   71: invokevirtual 48	com/google/android/gms/games/stats/PlayerStatsBuffer:close	()V
    //   74: iload_2
    //   75: iconst_3
    //   76: if_icmpne +6 -> 82
    //   79: goto +5 -> 84
    //   82: iconst_0
    //   83: istore_3
    //   84: aload_0
    //   85: getfield 13	com/google/android/gms/games/internal/zzad:zza	Lcom/google/android/gms/tasks/TaskCompletionSource;
    //   88: new 50	com/google/android/gms/games/AnnotatedData
    //   91: dup
    //   92: aload_1
    //   93: iload_3
    //   94: invokespecial 53	com/google/android/gms/games/AnnotatedData:<init>	(Ljava/lang/Object;Z)V
    //   97: invokevirtual 59	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   100: return
    //   101: astore_1
    //   102: aload 4
    //   104: invokevirtual 48	com/google/android/gms/games/stats/PlayerStatsBuffer:close	()V
    //   107: goto +35 -> 142
    //   110: astore 4
    //   112: ldc 61
    //   114: ldc 63
    //   116: iconst_1
    //   117: anewarray 65	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc 61
    //   124: aastore
    //   125: invokevirtual 69	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   128: aload_1
    //   129: iconst_1
    //   130: anewarray 71	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload 4
    //   137: aastore
    //   138: invokevirtual 77	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   141: pop
    //   142: aload_1
    //   143: athrow
    //   144: astore 4
    //   146: goto -4 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	zzad
    //   0	149	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   4	73	2	i	int
    //   41	53	3	bool	boolean
    //   38	65	4	localPlayerStatsBuffer	com.google.android.gms.games.stats.PlayerStatsBuffer
    //   110	26	4	localObject	Object
    //   144	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   42	64	101	finally
    //   102	107	110	finally
    //   112	142	144	java/lang/Exception
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */