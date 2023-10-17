package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;

final class zzwo
{
  private final Spatializer zza;
  private final boolean zzb;
  private Handler zzc;
  private Spatializer.OnSpatializerStateChangedListener zzd;
  
  private zzwo(Spatializer paramSpatializer)
  {
    this.zza = paramSpatializer;
    boolean bool;
    if (paramSpatializer.getImmersiveAudioLevel() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzb = bool;
  }
  
  public static zzwo zza(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext == null) {
      return null;
    }
    return new zzwo(paramContext.getSpatializer());
  }
  
  public final void zzb(zzwv paramzzwv, Looper paramLooper)
  {
    if ((this.zzd == null) && (this.zzc == null))
    {
      this.zzd = new zzwn(this, paramzzwv);
      paramzzwv = new Handler(paramLooper);
      this.zzc = paramzzwv;
      this.zza.addOnSpatializerStateChangedListener(new zzwm(paramzzwv), this.zzd);
    }
  }
  
  public final void zzc()
  {
    Object localObject = this.zzd;
    if ((localObject != null) && (this.zzc != null))
    {
      this.zza.removeOnSpatializerStateChangedListener((Spatializer.OnSpatializerStateChangedListener)localObject);
      localObject = this.zzc;
      int i = zzfn.zza;
      ((Handler)localObject).removeCallbacksAndMessages(null);
      this.zzc = null;
      this.zzd = null;
    }
  }
  
  public final boolean zzd(zzk paramzzk, zzam paramzzam)
  {
    if (("audio/eac3-joc".equals(paramzzam.zzm)) && (paramzzam.zzz == 16)) {
      i = 12;
    } else {
      i = paramzzam.zzz;
    }
    AudioFormat.Builder localBuilder = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzfn.zzf(i));
    int i = paramzzam.zzA;
    if (i != -1) {
      localBuilder.setSampleRate(i);
    }
    return this.zza.canBeSpatialized(paramzzk.zza().zza, localBuilder.build());
  }
  
  public final boolean zze()
  {
    return this.zza.isAvailable();
  }
  
  public final boolean zzf()
  {
    return this.zza.isEnabled();
  }
  
  public final boolean zzg()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */