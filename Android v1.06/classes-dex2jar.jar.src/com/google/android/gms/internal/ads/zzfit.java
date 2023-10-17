package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfit
{
  public static final int zza = 0;
  private static volatile int zzf = 1;
  private final Context zzb;
  private final Executor zzc;
  private final Task zzd;
  private final boolean zze;
  
  zzfit(Context paramContext, Executor paramExecutor, Task paramTask, boolean paramBoolean)
  {
    this.zzb = paramContext;
    this.zzc = paramExecutor;
    this.zzd = paramTask;
    this.zze = paramBoolean;
  }
  
  public static zzfit zza(Context paramContext, Executor paramExecutor, boolean paramBoolean)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    if (paramBoolean) {
      paramExecutor.execute(new zzfip(paramContext, localTaskCompletionSource));
    } else {
      paramExecutor.execute(new zzfiq(localTaskCompletionSource));
    }
    return new zzfit(paramContext, paramExecutor, localTaskCompletionSource.getTask(), paramBoolean);
  }
  
  static void zzg(int paramInt)
  {
    zzf = paramInt;
  }
  
  private final Task zzh(int paramInt, long paramLong, Exception paramException, String paramString1, Map paramMap, String paramString2)
  {
    if (!this.zze) {
      return this.zzd.continueWith(this.zzc, zzfir.zza);
    }
    zzana localzzana = zzane.zza();
    localzzana.zza(this.zzb.getPackageName());
    localzzana.zze(paramLong);
    localzzana.zzg(zzf);
    if (paramException != null)
    {
      paramMap = new StringWriter();
      paramException.printStackTrace(new PrintWriter(paramMap));
      localzzana.zzf(paramMap.toString());
      localzzana.zzd(paramException.getClass().getName());
    }
    if (paramString2 != null) {
      localzzana.zzb(paramString2);
    }
    if (paramString1 != null) {
      localzzana.zzc(paramString1);
    }
    return this.zzd.continueWith(this.zzc, new zzfis(localzzana, paramInt));
  }
  
  public final Task zzb(int paramInt, String paramString)
  {
    return zzh(paramInt, 0L, null, null, null, paramString);
  }
  
  public final Task zzc(int paramInt, long paramLong, Exception paramException)
  {
    return zzh(paramInt, paramLong, paramException, null, null, null);
  }
  
  public final Task zzd(int paramInt, long paramLong)
  {
    return zzh(paramInt, paramLong, null, null, null, null);
  }
  
  public final Task zze(int paramInt, long paramLong, String paramString)
  {
    return zzh(paramInt, paramLong, null, null, null, paramString);
  }
  
  public final Task zzf(int paramInt, long paramLong, String paramString, Map paramMap)
  {
    return zzh(paramInt, paramLong, null, paramString, null, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */