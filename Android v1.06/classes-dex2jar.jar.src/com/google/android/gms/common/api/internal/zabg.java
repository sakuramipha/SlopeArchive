package com.google.android.gms.common.api.internal;

abstract class zabg
{
  private final zabf zaa;
  
  protected zabg(zabf paramzabf)
  {
    this.zaa = paramzabf;
  }
  
  protected abstract void zaa();
  
  /* Error */
  public final void zab(zabi paramzabi)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 22	com/google/android/gms/common/api/internal/zabi:zah	(Lcom/google/android/gms/common/api/internal/zabi;)Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 27 1 0
    //   9: aload_1
    //   10: invokestatic 31	com/google/android/gms/common/api/internal/zabi:zag	(Lcom/google/android/gms/common/api/internal/zabi;)Lcom/google/android/gms/common/api/internal/zabf;
    //   13: astore_3
    //   14: aload_0
    //   15: getfield 13	com/google/android/gms/common/api/internal/zabg:zaa	Lcom/google/android/gms/common/api/internal/zabf;
    //   18: astore_2
    //   19: aload_3
    //   20: aload_2
    //   21: if_acmpeq +15 -> 36
    //   24: aload_1
    //   25: invokestatic 22	com/google/android/gms/common/api/internal/zabi:zah	(Lcom/google/android/gms/common/api/internal/zabi;)Ljava/util/concurrent/locks/Lock;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 34 1 0
    //   35: return
    //   36: aload_0
    //   37: invokevirtual 36	com/google/android/gms/common/api/internal/zabg:zaa	()V
    //   40: aload_1
    //   41: invokestatic 22	com/google/android/gms/common/api/internal/zabi:zah	(Lcom/google/android/gms/common/api/internal/zabi;)Ljava/util/concurrent/locks/Lock;
    //   44: astore_1
    //   45: goto -16 -> 29
    //   48: astore_2
    //   49: aload_1
    //   50: invokestatic 22	com/google/android/gms/common/api/internal/zabi:zah	(Lcom/google/android/gms/common/api/internal/zabi;)Ljava/util/concurrent/locks/Lock;
    //   53: invokeinterface 34 1 0
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	zabg
    //   0	60	1	paramzabi	zabi
    //   18	3	2	localzabf1	zabf
    //   48	11	2	localObject	Object
    //   13	7	3	localzabf2	zabf
    // Exception table:
    //   from	to	target	type
    //   9	19	48	finally
    //   36	40	48	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */