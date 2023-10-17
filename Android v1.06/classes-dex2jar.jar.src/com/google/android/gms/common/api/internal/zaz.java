package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class zaz
  implements zabz
{
  final zaaa zaa;
  
  public final void zaa(ConnectionResult paramConnectionResult)
  {
    zaaa.zaj(this.zaa).lock();
    try
    {
      zaaa.zal(this.zaa, paramConnectionResult);
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
      zaaa.zal(this.zaa, ConnectionResult.RESULT_SUCCESS);
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
    //   1: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   4: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 28 1 0
    //   12: aload_0
    //   13: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   16: astore_3
    //   17: aload_3
    //   18: invokestatic 53	com/google/android/gms/common/api/internal/zaaa:zav	(Lcom/google/android/gms/common/api/internal/zaaa;)Z
    //   21: ifeq +32 -> 53
    //   24: aload_3
    //   25: iconst_0
    //   26: invokestatic 57	com/google/android/gms/common/api/internal/zaaa:zam	(Lcom/google/android/gms/common/api/internal/zaaa;Z)V
    //   29: aload_0
    //   30: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   33: iload_1
    //   34: iload_2
    //   35: invokestatic 61	com/google/android/gms/common/api/internal/zaaa:zan	(Lcom/google/android/gms/common/api/internal/zaaa;IZ)V
    //   38: aload_0
    //   39: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   42: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   45: astore_3
    //   46: aload_3
    //   47: invokeinterface 39 1 0
    //   52: return
    //   53: aload_3
    //   54: iconst_1
    //   55: invokestatic 57	com/google/android/gms/common/api/internal/zaaa:zam	(Lcom/google/android/gms/common/api/internal/zaaa;Z)V
    //   58: aload_0
    //   59: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   62: invokestatic 65	com/google/android/gms/common/api/internal/zaaa:zah	(Lcom/google/android/gms/common/api/internal/zaaa;)Lcom/google/android/gms/common/api/internal/zabi;
    //   65: iload_1
    //   66: invokevirtual 71	com/google/android/gms/common/api/internal/zabi:onConnectionSuspended	(I)V
    //   69: aload_0
    //   70: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   73: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   76: astore_3
    //   77: goto -31 -> 46
    //   80: astore_3
    //   81: aload_0
    //   82: getfield 12	com/google/android/gms/common/api/internal/zaz:zaa	Lcom/google/android/gms/common/api/internal/zaaa;
    //   85: invokestatic 23	com/google/android/gms/common/api/internal/zaaa:zaj	(Lcom/google/android/gms/common/api/internal/zaaa;)Ljava/util/concurrent/locks/Lock;
    //   88: invokeinterface 39 1 0
    //   93: aload_3
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	zaz
    //   0	95	1	paramInt	int
    //   0	95	2	paramBoolean	boolean
    //   16	61	3	localObject1	Object
    //   80	14	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   12	38	80	finally
    //   53	69	80	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */