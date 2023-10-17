package com.google.android.gms.internal.ads;

final class zzbsw
  implements Thread.UncaughtExceptionHandler
{
  final zzbsy zzb;
  
  zzbsw(zzbsy paramzzbsy, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      this.zzb.zze(paramThread, paramThrowable);
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler1 = this.zza;
      if (localUncaughtExceptionHandler1 != null)
      {
        localUncaughtExceptionHandler1.uncaughtException(paramThread, paramThrowable);
        return;
      }
    }
    finally
    {
      try
      {
        zzbzt.zzg("AdMob exception reporter failed reporting the exception.");
        localUncaughtExceptionHandler2 = this.zza;
        if (localUncaughtExceptionHandler2 != null) {
          localUncaughtExceptionHandler2.uncaughtException(paramThread, paramThrowable);
        }
        return;
      }
      finally
      {
        Thread.UncaughtExceptionHandler localUncaughtExceptionHandler2 = this.zza;
        if (localUncaughtExceptionHandler2 != null) {
          localUncaughtExceptionHandler2.uncaughtException(paramThread, paramThrowable);
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */