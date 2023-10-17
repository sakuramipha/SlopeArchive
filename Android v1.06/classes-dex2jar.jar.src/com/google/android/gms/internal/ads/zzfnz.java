package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzfnz
{
  private static final Map zza = new HashMap();
  private final Context zzb;
  private final zzfno zzc;
  private final String zzd;
  private final List zze = new ArrayList();
  private final Set zzf = new HashSet();
  private final Object zzg = new Object();
  private boolean zzh;
  private final Intent zzi;
  private final WeakReference zzj;
  private final IBinder.DeathRecipient zzk = new zzfnr(this);
  private final AtomicInteger zzl = new AtomicInteger(0);
  private ServiceConnection zzm;
  private IInterface zzn;
  private final zzfmw zzo;
  
  public zzfnz(Context paramContext, zzfno paramzzfno, String paramString, Intent paramIntent, zzfmw paramzzfmw, zzfnu paramzzfnu)
  {
    this.zzb = paramContext;
    this.zzc = paramzzfno;
    this.zzd = "OverlayDisplayService";
    this.zzi = paramIntent;
    this.zzo = paramzzfmw;
    this.zzj = new WeakReference(null);
  }
  
  private final RemoteException zzv()
  {
    return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
  }
  
  private final void zzw()
  {
    Iterator localIterator = this.zzf.iterator();
    while (localIterator.hasNext()) {
      ((TaskCompletionSource)localIterator.next()).trySetException(zzv());
    }
    this.zzf.clear();
  }
  
  public final Handler zzc()
  {
    synchronized (zza)
    {
      if (!???.containsKey(this.zzd))
      {
        localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>(this.zzd, 10);
        ((HandlerThread)localObject1).start();
        String str = this.zzd;
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(((HandlerThread)localObject1).getLooper());
        ???.put(str, localHandler);
      }
      Object localObject1 = (Handler)???.get(this.zzd);
      return (Handler)localObject1;
    }
  }
  
  public final IInterface zze()
  {
    return this.zzn;
  }
  
  public final void zzs(zzfnp paramzzfnp, TaskCompletionSource paramTaskCompletionSource)
  {
    paramzzfnp = new zzfns(this, paramzzfnp.zzb(), paramTaskCompletionSource, paramzzfnp);
    zzc().post(paramzzfnp);
  }
  
  public final void zzu()
  {
    zzfnt localzzfnt = new zzfnt(this);
    zzc().post(localzzfnt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */