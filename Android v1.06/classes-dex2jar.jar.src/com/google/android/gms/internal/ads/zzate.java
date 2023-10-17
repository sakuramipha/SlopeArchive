package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzate
{
  protected static final String zza = "zzate";
  private final zzarr zzb;
  private final String zzc;
  private final String zzd;
  private volatile Method zze = null;
  private final Class[] zzf;
  private final CountDownLatch zzg = new CountDownLatch(1);
  
  public zzate(zzarr paramzzarr, String paramString1, String paramString2, Class... paramVarArgs)
  {
    this.zzb = paramzzarr;
    this.zzc = paramString1;
    this.zzd = paramString2;
    this.zzf = paramVarArgs;
    paramzzarr.zzk().submit(new zzatd(this));
  }
  
  private final String zzc(byte[] paramArrayOfByte, String paramString)
    throws zzaqv, UnsupportedEncodingException
  {
    return new String(this.zzb.zze().zzb(paramArrayOfByte, paramString), "UTF-8");
  }
  
  public final Method zza()
  {
    if (this.zze != null) {
      return this.zze;
    }
    Object localObject = null;
    try
    {
      if (!this.zzg.await(2L, TimeUnit.SECONDS)) {
        return null;
      }
      Method localMethod = this.zze;
      localObject = localMethod;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    return (Method)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */