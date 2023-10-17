package com.google.android.gms.internal.ads;

public final class zzfku
{
  final zzfkv zza;
  private final byte[] zzb;
  private int zzc;
  private int zzd;
  
  public final zzfku zza(int paramInt)
  {
    this.zzd = paramInt;
    return this;
  }
  
  public final zzfku zzb(int paramInt)
  {
    this.zzc = paramInt;
    return this;
  }
  
  /* Error */
  public final void zzc()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/google/android/gms/internal/ads/zzfku:zza	Lcom/google/android/gms/internal/ads/zzfkv;
    //   6: astore_1
    //   7: aload_1
    //   8: getfield 33	com/google/android/gms/internal/ads/zzfkv:zzb	Z
    //   11: ifeq +76 -> 87
    //   14: aload_1
    //   15: getfield 36	com/google/android/gms/internal/ads/zzfkv:zza	Lcom/google/android/gms/internal/ads/zzfky;
    //   18: aload_0
    //   19: getfield 20	com/google/android/gms/internal/ads/zzfku:zzb	[B
    //   22: invokeinterface 42 2 0
    //   27: aload_0
    //   28: getfield 15	com/google/android/gms/internal/ads/zzfku:zza	Lcom/google/android/gms/internal/ads/zzfkv;
    //   31: getfield 36	com/google/android/gms/internal/ads/zzfkv:zza	Lcom/google/android/gms/internal/ads/zzfky;
    //   34: aload_0
    //   35: getfield 26	com/google/android/gms/internal/ads/zzfku:zzc	I
    //   38: invokeinterface 46 2 0
    //   43: aload_0
    //   44: getfield 15	com/google/android/gms/internal/ads/zzfku:zza	Lcom/google/android/gms/internal/ads/zzfkv;
    //   47: getfield 36	com/google/android/gms/internal/ads/zzfkv:zza	Lcom/google/android/gms/internal/ads/zzfky;
    //   50: aload_0
    //   51: getfield 24	com/google/android/gms/internal/ads/zzfku:zzd	I
    //   54: invokeinterface 49 2 0
    //   59: aload_0
    //   60: getfield 15	com/google/android/gms/internal/ads/zzfku:zza	Lcom/google/android/gms/internal/ads/zzfkv;
    //   63: getfield 36	com/google/android/gms/internal/ads/zzfkv:zza	Lcom/google/android/gms/internal/ads/zzfky;
    //   66: aconst_null
    //   67: invokeinterface 53 2 0
    //   72: aload_0
    //   73: getfield 15	com/google/android/gms/internal/ads/zzfku:zza	Lcom/google/android/gms/internal/ads/zzfkv;
    //   76: getfield 36	com/google/android/gms/internal/ads/zzfkv:zza	Lcom/google/android/gms/internal/ads/zzfky;
    //   79: invokeinterface 56 1 0
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: aload_0
    //   88: monitorexit
    //   89: return
    //   90: astore_1
    //   91: goto +16 -> 107
    //   94: astore_1
    //   95: ldc 58
    //   97: ldc 60
    //   99: aload_1
    //   100: invokestatic 66	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   103: pop
    //   104: aload_0
    //   105: monitorexit
    //   106: return
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	zzfku
    //   6	9	1	localzzfkv	zzfkv
    //   90	1	1	localObject	Object
    //   94	16	1	localRemoteException	android.os.RemoteException
    // Exception table:
    //   from	to	target	type
    //   2	84	90	finally
    //   95	104	90	finally
    //   2	84	94	android/os/RemoteException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */