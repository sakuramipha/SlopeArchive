package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

final class zzlp
{
  private final Context zza;
  private final Handler zzb;
  private final zzll zzc;
  private final AudioManager zzd;
  private zzlo zze;
  private int zzf;
  private int zzg;
  private boolean zzh;
  
  public zzlp(Context paramContext, Handler paramHandler, zzll paramzzll)
  {
    paramContext = paramContext.getApplicationContext();
    this.zza = paramContext;
    this.zzb = paramHandler;
    this.zzc = paramzzll;
    paramHandler = (AudioManager)paramContext.getSystemService("audio");
    zzdy.zzb(paramHandler);
    this.zzd = paramHandler;
    this.zzf = 3;
    this.zzg = zzg(paramHandler, 3);
    this.zzh = zzi(paramHandler, this.zzf);
    paramHandler = new zzlo(this, null);
    paramzzll = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
    try
    {
      paramContext.registerReceiver(paramHandler, paramzzll);
      this.zze = paramHandler;
      return;
    }
    catch (RuntimeException paramContext)
    {
      zzer.zzf("StreamVolumeManager", "Error registering stream volume receiver", paramContext);
    }
  }
  
  private static int zzg(AudioManager paramAudioManager, int paramInt)
  {
    try
    {
      int i = paramAudioManager.getStreamVolume(paramInt);
      return i;
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not retrieve stream volume for stream type ");
      localStringBuilder.append(paramInt);
      zzer.zzf("StreamVolumeManager", localStringBuilder.toString(), localRuntimeException);
    }
    return paramAudioManager.getStreamMaxVolume(paramInt);
  }
  
  private final void zzh()
  {
    int i = zzg(this.zzd, this.zzf);
    boolean bool = zzi(this.zzd, this.zzf);
    if ((this.zzg == i) && (this.zzh == bool)) {
      return;
    }
    this.zzg = i;
    this.zzh = bool;
    zzeo localzzeo = zzjt.zzF(((zzjp)this.zzc).zza);
    localzzeo.zzd(30, new zzjk(i, bool));
    localzzeo.zzc();
  }
  
  private static boolean zzi(AudioManager paramAudioManager, int paramInt)
  {
    if (zzfn.zza >= 23) {
      return paramAudioManager.isStreamMute(paramInt);
    }
    return zzg(paramAudioManager, paramInt) == 0;
  }
  
  public final int zza()
  {
    return this.zzd.getStreamMaxVolume(this.zzf);
  }
  
  public final int zzb()
  {
    if (zzfn.zza >= 28) {
      return this.zzd.getStreamMinVolume(this.zzf);
    }
    return 0;
  }
  
  public final void zze()
  {
    zzlo localzzlo = this.zze;
    if (localzzlo != null)
    {
      try
      {
        this.zza.unregisterReceiver(localzzlo);
      }
      catch (RuntimeException localRuntimeException)
      {
        zzer.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", localRuntimeException);
      }
      this.zze = null;
    }
  }
  
  public final void zzf(int paramInt)
  {
    if (this.zzf == 3) {
      return;
    }
    this.zzf = 3;
    zzh();
    Object localObject = (zzjp)this.zzc;
    zzz localzzz = zzjt.zzE(zzjt.zzH(((zzjp)localObject).zza));
    if (!localzzz.equals(zzjt.zzD(((zzjp)localObject).zza)))
    {
      zzjt.zzM(((zzjp)localObject).zza, localzzz);
      localObject = zzjt.zzF(((zzjp)localObject).zza);
      ((zzeo)localObject).zzd(29, new zzjl(localzzz));
      ((zzeo)localObject).zzc();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */