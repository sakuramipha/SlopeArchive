package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class zzfwn
  extends TimeoutException
{
  public final Throwable fillInStackTrace()
  {
    try
    {
      setStackTrace(new StackTraceElement[0]);
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */