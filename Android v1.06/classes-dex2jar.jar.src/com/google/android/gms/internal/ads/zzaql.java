package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

public final class zzaql
{
  protected static volatile zzfkv zza = null;
  private static final ConditionVariable zzc = new ConditionVariable();
  private static volatile Random zzd = null;
  protected volatile Boolean zzb;
  private final zzarr zze;
  
  public zzaql(zzarr paramzzarr)
  {
    this.zze = paramzzarr;
    paramzzarr.zzk().execute(new zzaqk(this));
  }
  
  public static final int zzd()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ThreadLocalRandom.current().nextInt();
      }
      int i = zze().nextInt();
      return i;
    }
    catch (RuntimeException localRuntimeException) {}
    return zze().nextInt();
  }
  
  private static Random zze()
  {
    if (zzd == null) {
      try
      {
        if (zzd == null)
        {
          Random localRandom = new java/util/Random;
          localRandom.<init>();
          zzd = localRandom;
        }
      }
      finally {}
    }
    return zzd;
  }
  
  public final void zzc(int paramInt1, int paramInt2, long paramLong, String paramString, Exception paramException)
  {
    try
    {
      zzc.block();
      if ((this.zzb.booleanValue()) && (zza != null))
      {
        zzana localzzana = zzane.zza();
        localzzana.zza(this.zze.zza.getPackageName());
        localzzana.zze(paramLong);
        if (paramString != null) {
          localzzana.zzb(paramString);
        }
        if (paramException != null)
        {
          paramString = new java/io/StringWriter;
          paramString.<init>();
          PrintWriter localPrintWriter = new java/io/PrintWriter;
          localPrintWriter.<init>(paramString);
          paramException.printStackTrace(localPrintWriter);
          localzzana.zzf(paramString.toString());
          localzzana.zzd(paramException.getClass().getName());
        }
        paramString = zza.zza(((zzane)localzzana.zzal()).zzax());
        paramString.zza(paramInt1);
        if (paramInt2 != -1) {
          paramString.zzb(paramInt2);
        }
        paramString.zzc();
      }
      return;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */