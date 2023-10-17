package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.reflect.Method;

final class zzpp
{
  private Exception zza;
  private long zzb;
  
  public zzpp(long paramLong) {}
  
  public final void zza()
  {
    this.zza = null;
  }
  
  public final void zzb(Exception paramException)
    throws Exception
  {
    long l = SystemClock.elapsedRealtime();
    if (this.zza == null)
    {
      this.zza = paramException;
      this.zzb = (100L + l);
    }
    Exception localException;
    if (l >= this.zzb)
    {
      localException = this.zza;
      if (localException == paramException) {}
    }
    try
    {
      Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class }).invoke(localException, new Object[] { paramException });
      paramException = this.zza;
      this.zza = null;
      throw paramException;
      return;
    }
    catch (Exception paramException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */