package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class zzr
  extends GmsClientSupervisor
{
  private final HashMap<zzn, zzo> zzb = new HashMap();
  private final Context zzc;
  private volatile Handler zzd;
  private final zzq zze;
  private final ConnectionTracker zzf;
  private final long zzg;
  private final long zzh;
  
  zzr(Context paramContext, Looper paramLooper)
  {
    zzq localzzq = new zzq(this, null);
    this.zze = localzzq;
    this.zzc = paramContext.getApplicationContext();
    this.zzd = new zzi(paramLooper, localzzq);
    this.zzf = ConnectionTracker.getInstance();
    this.zzg = 5000L;
    this.zzh = 300000L;
  }
  
  protected final void zza(zzn paramzzn, ServiceConnection paramServiceConnection, String paramString)
  {
    Preconditions.checkNotNull(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.zzb)
    {
      zzo localzzo = (zzo)this.zzb.get(paramzzn);
      if (localzzo != null)
      {
        if (localzzo.zzh(paramServiceConnection))
        {
          localzzo.zzf(paramServiceConnection, paramString);
          if (localzzo.zzi())
          {
            paramzzn = this.zzd.obtainMessage(0, paramzzn);
            this.zzd.sendMessageDelayed(paramzzn, this.zzg);
          }
          return;
        }
        paramServiceConnection = new java/lang/IllegalStateException;
        paramzzn = paramzzn.toString();
        i = paramzzn.length();
        paramString = new java/lang/StringBuilder;
        paramString.<init>(i + 76);
        paramString.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        paramString.append(paramzzn);
        paramServiceConnection.<init>(paramString.toString());
        throw paramServiceConnection;
      }
      paramServiceConnection = new java/lang/IllegalStateException;
      paramzzn = paramzzn.toString();
      int i = paramzzn.length();
      paramString = new java/lang/StringBuilder;
      paramString.<init>(i + 50);
      paramString.append("Nonexistent connection status for service config: ");
      paramString.append(paramzzn);
      paramServiceConnection.<init>(paramString.toString());
      throw paramServiceConnection;
    }
  }
  
  protected final boolean zzc(zzn paramzzn, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor)
  {
    Preconditions.checkNotNull(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.zzb)
    {
      zzo localzzo = (zzo)this.zzb.get(paramzzn);
      if (localzzo == null)
      {
        localzzo = new com/google/android/gms/common/internal/zzo;
        localzzo.<init>(this, paramzzn);
        localzzo.zzd(paramServiceConnection, paramServiceConnection, paramString);
        localzzo.zze(paramString, paramExecutor);
        this.zzb.put(paramzzn, localzzo);
        paramzzn = localzzo;
      }
      else
      {
        this.zzd.removeMessages(0, paramzzn);
        if (localzzo.zzh(paramServiceConnection)) {
          break label175;
        }
        localzzo.zzd(paramServiceConnection, paramServiceConnection, paramString);
        i = localzzo.zza();
        if (i != 1)
        {
          if (i != 2)
          {
            paramzzn = localzzo;
          }
          else
          {
            localzzo.zze(paramString, paramExecutor);
            paramzzn = localzzo;
          }
        }
        else
        {
          paramServiceConnection.onServiceConnected(localzzo.zzb(), localzzo.zzc());
          paramzzn = localzzo;
        }
      }
      boolean bool = paramzzn.zzj();
      return bool;
      label175:
      paramServiceConnection = new java/lang/IllegalStateException;
      paramzzn = paramzzn.toString();
      int i = paramzzn.length();
      paramString = new java/lang/StringBuilder;
      paramString.<init>(i + 81);
      paramString.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
      paramString.append(paramzzn);
      paramServiceConnection.<init>(paramString.toString());
      throw paramServiceConnection;
    }
  }
  
  final void zzi(Looper paramLooper)
  {
    synchronized (this.zzb)
    {
      zzi localzzi = new com/google/android/gms/internal/common/zzi;
      localzzi.<init>(paramLooper, this.zze);
      this.zzd = localzzi;
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */