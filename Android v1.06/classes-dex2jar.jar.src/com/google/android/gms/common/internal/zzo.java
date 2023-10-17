package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

final class zzo
  implements ServiceConnection, zzs
{
  final zzr zza;
  private final Map<ServiceConnection, ServiceConnection> zzb;
  private int zzc;
  private boolean zzd;
  private IBinder zze;
  private final zzn zzf;
  private ComponentName zzg;
  
  public zzo(zzr paramzzr, zzn paramzzn)
  {
    this.zzf = paramzzn;
    this.zzb = new HashMap();
    this.zzc = 2;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (zzr.zzh(this.zza))
    {
      zzr.zzf(this.zza).removeMessages(1, this.zzf);
      this.zze = paramIBinder;
      this.zzg = paramComponentName;
      Iterator localIterator = this.zzb.values().iterator();
      while (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
      this.zzc = 1;
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (zzr.zzh(this.zza))
    {
      zzr.zzf(this.zza).removeMessages(1, this.zzf);
      this.zze = null;
      this.zzg = paramComponentName;
      Iterator localIterator = this.zzb.values().iterator();
      while (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
      this.zzc = 2;
      return;
    }
  }
  
  public final int zza()
  {
    return this.zzc;
  }
  
  public final ComponentName zzb()
  {
    return this.zzg;
  }
  
  public final IBinder zzc()
  {
    return this.zze;
  }
  
  public final void zzd(ServiceConnection paramServiceConnection1, ServiceConnection paramServiceConnection2, String paramString)
  {
    this.zzb.put(paramServiceConnection1, paramServiceConnection2);
  }
  
  public final void zze(String paramString, Executor paramExecutor)
  {
    this.zzc = 3;
    zzr localzzr = this.zza;
    boolean bool = zzr.zzg(localzzr).zza(zzr.zze(localzzr), paramString, this.zzf.zzc(zzr.zze(localzzr)), this, this.zzf.zza(), paramExecutor);
    this.zzd = bool;
    if (bool)
    {
      paramString = zzr.zzf(this.zza).obtainMessage(1, this.zzf);
      zzr.zzf(this.zza).sendMessageDelayed(paramString, zzr.zzd(this.zza));
      return;
    }
    this.zzc = 2;
    try
    {
      paramString = this.zza;
      zzr.zzg(paramString).unbindService(zzr.zze(paramString), this);
      return;
    }
    catch (IllegalArgumentException paramString)
    {
      for (;;) {}
    }
  }
  
  public final void zzf(ServiceConnection paramServiceConnection, String paramString)
  {
    this.zzb.remove(paramServiceConnection);
  }
  
  public final void zzg(String paramString)
  {
    zzr.zzf(this.zza).removeMessages(1, this.zzf);
    paramString = this.zza;
    zzr.zzg(paramString).unbindService(zzr.zze(paramString), this);
    this.zzd = false;
    this.zzc = 2;
  }
  
  public final boolean zzh(ServiceConnection paramServiceConnection)
  {
    return this.zzb.containsKey(paramServiceConnection);
  }
  
  public final boolean zzi()
  {
    return this.zzb.isEmpty();
  }
  
  public final boolean zzj()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */