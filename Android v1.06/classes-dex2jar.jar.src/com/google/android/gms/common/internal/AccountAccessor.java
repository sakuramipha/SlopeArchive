package com.google.android.gms.common.internal;

import android.accounts.Account;

public class AccountAccessor
  extends IAccountAccessor.Stub
{
  /* Error */
  public static Account getAccountBinderSafe(IAccountAccessor paramIAccountAccessor)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: ifnull +48 -> 54
    //   9: invokestatic 14	android/os/Binder:clearCallingIdentity	()J
    //   12: lstore_1
    //   13: aload_0
    //   14: invokeinterface 20 1 0
    //   19: astore_0
    //   20: lload_1
    //   21: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   24: aload_0
    //   25: astore_3
    //   26: goto +28 -> 54
    //   29: astore_0
    //   30: goto +18 -> 48
    //   33: astore_0
    //   34: ldc 26
    //   36: ldc 28
    //   38: invokestatic 34	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   41: pop
    //   42: aload 4
    //   44: astore_0
    //   45: goto -25 -> 20
    //   48: lload_1
    //   49: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   52: aload_0
    //   53: athrow
    //   54: aload_3
    //   55: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	paramIAccountAccessor	IAccountAccessor
    //   12	37	1	l	long
    //   1	54	3	localIAccountAccessor	IAccountAccessor
    //   3	40	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	20	29	finally
    //   34	42	29	finally
    //   13	20	33	android/os/RemoteException
  }
  
  public final boolean equals(Object paramObject)
  {
    throw null;
  }
  
  public final Account zzb()
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\AccountAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */