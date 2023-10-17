package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class zax
  implements zabz
{
  final zaaa zaa;
  
  public final void zaa(ConnectionResult paramConnectionResult)
  {
    zaaa.zaj(this.zaa).lock();
    try
    {
      zaaa.zak(this.zaa, paramConnectionResult);
      zaaa.zap(this.zaa);
      return;
    }
    finally
    {
      zaaa.zaj(this.zaa).unlock();
    }
  }
  
  public final void zab(Bundle paramBundle)
  {
    zaaa.zaj(this.zaa).lock();
    try
    {
      zaaa.zao(this.zaa, paramBundle);
      zaaa.zak(this.zaa, ConnectionResult.RESULT_SUCCESS);
      zaaa.zap(this.zaa);
      return;
    }
    finally
    {
      zaaa.zaj(this.zaa).unlock();
    }
  }
  
  /* Error */
  public final void zac(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   4: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 28 1 0
    //   12: aload_0
    //   13: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   16: astore_3
    //   17: aload_3
    //   18: invokestatic 57	com/google/android/gms/common/api/internal/zaaa:zav	(Lcom/google/android/gms/common/api/internal/zaaa;)Z
    //   21: ifne +57 -> 78
    //   24: aload_3
    //   25: invokestatic 60	com/google/android/gms/common/api/internal/zaaa:zaa	(Lcom/google/android/gms/common/api/internal/zaaa;)Lcom/google/android/gms/common/ConnectionResult;
    //   28: ifnull +50 -> 78
    //   31: aload_3
    //   32: invokestatic 60	com/google/android/gms/common/api/internal/zaaa:zaa	(Lcom/google/android/gms/common/api/internal/zaaa;)Lcom/google/android/gms/common/ConnectionResult;
    //   35: invokevirtual 64	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   38: ifne +6 -> 44
    //   41: goto +37 -> 78
    //   44: aload_0
    //   45: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   48: iconst_1
    //   49: invokestatic 68	com/google/android/gms/common/api/internal/zaaa:zam	(Lcom/google/android/gms/common/api/internal/zaaa;Z)V
    //   52: aload_0
    //   53: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   56: invokestatic 72	com/google/android/gms/common/api/internal/zaaa:zai	(Lcom/google/android/gms/common/api/internal/zaaa;)Lcom/google/android/gms/common/api/internal/zabi;
    //   59: iload_1
    //   60: invokevirtual 78	com/google/android/gms/common/api/internal/zabi:onConnectionSuspended	(I)V
    //   63: aload_0
    //   64: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   67: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   70: astore_3
    //   71: aload_3
    //   72: invokeinterface 39 1 0
    //   77: return
    //   78: aload_0
    //   79: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   82: iconst_0
    //   83: invokestatic 68	com/google/android/gms/common/api/internal/zaaa:zam	(Lcom/google/android/gms/common/api/internal/zaaa;Z)V
    //   86: aload_0
    //   87: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   90: iload_1
    //   91: iload_2
    //   92: invokestatic 82	com/google/android/gms/common/api/internal/zaaa:zan	(Lcom/google/android/gms/common/api/internal/zaaa;IZ)V
    //   95: aload_0
    //   96: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   99: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   102: astore_3
    //   103: goto -32 -> 71
    //   106: astore_3
    //   107: aload_0
    //   108: getfield 12	com/google/android/gms/common/api/internal/zax:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   111: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   114: invokeinterface 39 1 0
    //   119: aload_3
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	zax
    //   0	121	1	paramInt	int
    //   0	121	2	paramBoolean	boolean
    //   16	87	3	localObject1	Object
    //   106	14	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	41	106	finally
    //   44	63	106	finally
    //   78	95	106	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */