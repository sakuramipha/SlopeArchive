package com.google.android.gms.internal.games_v2;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.os.Looper;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.games.internal.v2.resolution.zzb;
import com.google.android.gms.games.internal.zzg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbl
  implements zzav
{
  private final AtomicReference zza = new AtomicReference(zzbi.zza);
  private final AtomicReference zzb = new AtomicReference(zzbh.zza);
  private final Queue zzc = new ArrayDeque();
  private final AtomicReference zzd = new AtomicReference();
  private final AtomicReference zze = new AtomicReference();
  private final Application zzf;
  private final zzg zzg;
  private final zzbm zzh;
  private final zzb zzi;
  
  zzbl(Application paramApplication, zzg paramzzg, zzb paramzzb, zzbm paramzzbm, byte[] paramArrayOfByte)
  {
    this.zzf = paramApplication;
    this.zzg = paramzzg;
    this.zzi = paramzzb;
    this.zzh = paramzzbm;
  }
  
  private static ApiException zzj()
  {
    return new ApiException(new Status(4));
  }
  
  private static Task zzk(AtomicReference paramAtomicReference, TaskCompletionSource paramTaskCompletionSource)
  {
    zzbi localzzbi = zzbi.zza;
    int i = ((zzbi)paramAtomicReference.get()).ordinal();
    if (i != 0)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (paramTaskCompletionSource == null) {
            return Tasks.forResult(AuthenticationResult.zzb);
          }
          paramAtomicReference = paramTaskCompletionSource.getTask();
          if (paramAtomicReference.isSuccessful())
          {
            if (((Boolean)paramAtomicReference.getResult()).booleanValue()) {
              return Tasks.forResult(AuthenticationResult.zza);
            }
            return Tasks.forResult(AuthenticationResult.zzb);
          }
          paramTaskCompletionSource = new TaskCompletionSource();
          paramAtomicReference.addOnCompleteListener(zzfe.zza(), new zzbb(paramTaskCompletionSource));
          return paramTaskCompletionSource.getTask();
        }
        return Tasks.forResult(AuthenticationResult.zzb);
      }
      return Tasks.forResult(AuthenticationResult.zza);
    }
    return Tasks.forException(new ApiException(new Status(10)));
  }
  
  private static Task zzl(zzff paramzzff)
  {
    if (zzp()) {
      return (Task)paramzzff.zza();
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    TaskExecutors.MAIN_THREAD.execute(new zzbe(paramzzff, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private final void zzm(TaskCompletionSource paramTaskCompletionSource, zzy paramzzy)
  {
    zzez.zza("GamesApiManager", "Attempting authentication: ".concat(paramzzy.toString()));
    this.zzh.zza(paramzzy).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new zzba(this, paramTaskCompletionSource, paramzzy));
  }
  
  private final void zzn(TaskCompletionSource paramTaskCompletionSource, int paramInt, PendingIntent paramPendingIntent, boolean paramBoolean1, boolean paramBoolean2)
  {
    Preconditions.checkMainThread("Must be called on the main thread.");
    if ((paramBoolean1) && (paramPendingIntent != null))
    {
      Activity localActivity = this.zzg.zza();
      if (localActivity != null)
      {
        zzb.zzb(localActivity, paramPendingIntent).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new zzaz(this, paramTaskCompletionSource, paramInt));
        zzez.zza("GamesApiManager", "Resolution triggered");
        return;
      }
    }
    paramBoolean1 = zzay.zza(this.zzb, zzbh.zzb, zzbh.zzc);
    if ((!paramBoolean2) && (paramBoolean1))
    {
      zzez.zza("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
      zzm(paramTaskCompletionSource, zzy.zzb(0));
      return;
    }
    paramTaskCompletionSource.trySetResult(Boolean.valueOf(false));
    this.zza.set(zzbi.zzd);
    paramTaskCompletionSource = this.zzc.iterator();
    while (paramTaskCompletionSource.hasNext())
    {
      ((zzbk)paramTaskCompletionSource.next()).zzc(zzj());
      paramTaskCompletionSource.remove();
    }
  }
  
  private final void zzo(int paramInt)
  {
    Object localObject = new StringBuilder(56);
    ((StringBuilder)localObject).append("startAuthenticationIfNecessary() signInType: ");
    ((StringBuilder)localObject).append(paramInt);
    zzez.zza("GamesApiManager", ((StringBuilder)localObject).toString());
    Preconditions.checkMainThread("Must be called on the main thread.");
    if ((!zzay.zza(this.zza, zzbi.zza, zzbi.zzb)) && (!zzay.zza(this.zza, zzbi.zzd, zzbi.zzb)))
    {
      if (paramInt == 0)
      {
        boolean bool = zzay.zza(this.zzb, zzbh.zza, zzbh.zzb);
        localObject = new StringBuilder(88);
        ((StringBuilder)localObject).append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
        ((StringBuilder)localObject).append(bool);
        zzez.zza("GamesApiManager", ((StringBuilder)localObject).toString());
      }
      localObject = String.valueOf(this.zza.get());
      String.valueOf(localObject).length();
      zzez.zza("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(localObject)));
      return;
    }
    localObject = (TaskCompletionSource)this.zzd.get();
    if (localObject != null) {
      ((TaskCompletionSource)localObject).trySetException(new IllegalStateException("New authentication attempt in progress"));
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zzd.set(localTaskCompletionSource);
    AtomicReference localAtomicReference = this.zzb;
    if (paramInt == 0) {
      localObject = zzbh.zzc;
    } else {
      localObject = zzbh.zza;
    }
    localAtomicReference.set(localObject);
    zzm(localTaskCompletionSource, zzy.zzb(paramInt));
  }
  
  private static boolean zzp()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public final Task zza()
  {
    return zzl(new zzbf(this));
  }
  
  public final Task zzb()
  {
    return zzl(new zzbg(this));
  }
  
  public final Task zzc()
  {
    return zzk(this.zza, (TaskCompletionSource)this.zzd.get());
  }
  
  public final Task zzd(zzap paramzzap)
  {
    Object localObject = (zzbi)this.zza.get();
    String str = String.valueOf(localObject);
    String.valueOf(str).length();
    zzez.zzf("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(str)));
    if (localObject == zzbi.zzc) {
      return paramzzap.zza((GoogleApi)this.zze.get());
    }
    if (localObject == zzbi.zzd) {
      return Tasks.forException(zzj());
    }
    if (localObject == zzbi.zza) {
      return Tasks.forException(new ApiException(new Status(10)));
    }
    localObject = new TaskCompletionSource();
    paramzzap = new zzbd(this, new zzbk(paramzzap, (TaskCompletionSource)localObject, null));
    if (zzp()) {
      paramzzap.run();
    } else {
      TaskExecutors.MAIN_THREAD.execute(paramzzap);
    }
    return ((TaskCompletionSource)localObject).getTask();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */