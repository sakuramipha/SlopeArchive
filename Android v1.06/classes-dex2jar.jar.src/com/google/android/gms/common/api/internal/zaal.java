package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import java.lang.ref.WeakReference;

final class zaal
  implements BaseGmsClient.ConnectionProgressReportCallbacks
{
  private final WeakReference<zaaw> zaa;
  private final Api<?> zab;
  private final boolean zac;
  
  public zaal(zaaw paramzaaw, Api<?> paramApi, boolean paramBoolean)
  {
    this.zaa = new WeakReference(paramzaaw);
    this.zab = paramApi;
    this.zac = paramBoolean;
  }
  
  /* Error */
  public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/google/android/gms/common/api/internal/zaal:zaa	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 40	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 42	com/google/android/gms/common/api/internal/zaaw
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: invokestatic 48	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   19: aload_3
    //   20: invokestatic 52	com/google/android/gms/common/api/internal/zaaw:zak	(Lcom/google/android/gms/common/api/internal/zaaw;)Lcom/google/android/gms/common/api/internal/zabi;
    //   23: getfield 58	com/google/android/gms/common/api/internal/zabi:zag	Lcom/google/android/gms/common/api/internal/zabe;
    //   26: invokevirtual 63	com/google/android/gms/common/api/GoogleApiClient:getLooper	()Landroid/os/Looper;
    //   29: if_acmpne +8 -> 37
    //   32: iconst_1
    //   33: istore_2
    //   34: goto +5 -> 39
    //   37: iconst_0
    //   38: istore_2
    //   39: iload_2
    //   40: ldc 65
    //   42: invokestatic 71	com/google/android/gms/common/internal/Preconditions:checkState	(ZLjava/lang/Object;)V
    //   45: aload_3
    //   46: invokestatic 75	com/google/android/gms/common/api/internal/zaaw:zap	(Lcom/google/android/gms/common/api/internal/zaaw;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 80 1 0
    //   54: aload_3
    //   55: iconst_0
    //   56: invokestatic 84	com/google/android/gms/common/api/internal/zaaw:zaw	(Lcom/google/android/gms/common/api/internal/zaaw;I)Z
    //   59: istore_2
    //   60: iload_2
    //   61: ifne +15 -> 76
    //   64: aload_3
    //   65: invokestatic 75	com/google/android/gms/common/api/internal/zaaw:zap	(Lcom/google/android/gms/common/api/internal/zaaw;)Ljava/util/concurrent/locks/Lock;
    //   68: astore_1
    //   69: aload_1
    //   70: invokeinterface 87 1 0
    //   75: return
    //   76: aload_1
    //   77: invokevirtual 93	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   80: ifne +16 -> 96
    //   83: aload_3
    //   84: aload_1
    //   85: aload_0
    //   86: getfield 29	com/google/android/gms/common/api/internal/zaal:zab	Lcom/google/android/gms/common/api/Api;
    //   89: aload_0
    //   90: getfield 31	com/google/android/gms/common/api/internal/zaal:zac	Z
    //   93: invokestatic 97	com/google/android/gms/common/api/internal/zaaw:zat	(Lcom/google/android/gms/common/api/internal/zaaw;Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/Api;Z)V
    //   96: aload_3
    //   97: invokestatic 101	com/google/android/gms/common/api/internal/zaaw:zax	(Lcom/google/android/gms/common/api/internal/zaaw;)Z
    //   100: ifeq +7 -> 107
    //   103: aload_3
    //   104: invokestatic 105	com/google/android/gms/common/api/internal/zaaw:zau	(Lcom/google/android/gms/common/api/internal/zaaw;)V
    //   107: aload_3
    //   108: invokestatic 75	com/google/android/gms/common/api/internal/zaaw:zap	(Lcom/google/android/gms/common/api/internal/zaaw;)Ljava/util/concurrent/locks/Lock;
    //   111: astore_1
    //   112: goto -43 -> 69
    //   115: astore_1
    //   116: aload_3
    //   117: invokestatic 75	com/google/android/gms/common/api/internal/zaaw:zap	(Lcom/google/android/gms/common/api/internal/zaaw;)Ljava/util/concurrent/locks/Lock;
    //   120: invokeinterface 87 1 0
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	zaal
    //   0	127	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   33	28	2	bool	boolean
    //   10	107	3	localzaaw	zaaw
    // Exception table:
    //   from	to	target	type
    //   54	60	115	finally
    //   76	96	115	finally
    //   96	107	115	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */