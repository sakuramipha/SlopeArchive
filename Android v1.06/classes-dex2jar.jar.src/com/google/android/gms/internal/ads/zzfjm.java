package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfjm
{
  private final Context zza;
  private final Executor zzb;
  private final zzfit zzc;
  private final zzfiv zzd;
  private final zzfjl zze;
  private final zzfjl zzf;
  private Task zzg;
  private Task zzh;
  
  zzfjm(Context paramContext, Executor paramExecutor, zzfit paramzzfit, zzfiv paramzzfiv, zzfjj paramzzfjj, zzfjk paramzzfjk)
  {
    this.zza = paramContext;
    this.zzb = paramExecutor;
    this.zzc = paramzzfit;
    this.zzd = paramzzfiv;
    this.zze = paramzzfjj;
    this.zzf = paramzzfjk;
  }
  
  public static zzfjm zze(Context paramContext, Executor paramExecutor, zzfit paramzzfit, zzfiv paramzzfiv)
  {
    paramContext = new zzfjm(paramContext, paramExecutor, paramzzfit, paramzzfiv, new zzfjj(), new zzfjk());
    if (paramContext.zzd.zzd()) {
      paramContext.zzg = paramContext.zzh(new zzfjg(paramContext));
    } else {
      paramContext.zzg = Tasks.forResult(paramContext.zze.zza());
    }
    paramContext.zzh = paramContext.zzh(new zzfjh(paramContext));
    return paramContext;
  }
  
  private static zzaol zzg(Task paramTask, zzaol paramzzaol)
  {
    if (!paramTask.isSuccessful()) {
      return paramzzaol;
    }
    return (zzaol)paramTask.getResult();
  }
  
  private final Task zzh(Callable paramCallable)
  {
    return Tasks.call(this.zzb, paramCallable).addOnFailureListener(this.zzb, new zzfji(this));
  }
  
  public final zzaol zza()
  {
    return zzg(this.zzg, this.zze.zza());
  }
  
  public final zzaol zzb()
  {
    return zzg(this.zzh, this.zzf.zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */