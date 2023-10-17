package com.google.android.gms.internal.ads;

public final class zzfwt
{
  /* Error */
  public static Object zza(java.util.concurrent.Future paramFuture)
    throws java.util.concurrent.ExecutionException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokeinterface 16 1 0
    //   8: astore_2
    //   9: iload_1
    //   10: ifeq +9 -> 19
    //   13: invokestatic 22	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   16: invokevirtual 26	java/lang/Thread:interrupt	()V
    //   19: aload_2
    //   20: areturn
    //   21: astore_0
    //   22: iload_1
    //   23: ifne +6 -> 29
    //   26: goto +9 -> 35
    //   29: invokestatic 22	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   32: invokevirtual 26	java/lang/Thread:interrupt	()V
    //   35: aload_0
    //   36: athrow
    //   37: astore_2
    //   38: iconst_1
    //   39: istore_1
    //   40: goto -38 -> 2
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	paramFuture	java.util.concurrent.Future
    //   1	39	1	i	int
    //   8	12	2	localObject	Object
    //   37	1	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	9	21	finally
    //   2	9	37	java/lang/InterruptedException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */