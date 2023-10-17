package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

public final class zzccg
  implements AudioManager.OnAudioFocusChangeListener
{
  private final AudioManager zza;
  private final zzccf zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private float zzf = 1.0F;
  
  public zzccg(Context paramContext, zzccf paramzzccf)
  {
    this.zza = ((AudioManager)paramContext.getSystemService("audio"));
    this.zzb = paramzzccf;
  }
  
  private final void zzf()
  {
    boolean bool3 = this.zzd;
    boolean bool2 = false;
    boolean bool1 = false;
    AudioManager localAudioManager;
    if ((bool3) && (!this.zze) && (this.zzf > 0.0F))
    {
      if (!this.zzc)
      {
        localAudioManager = this.zza;
        if (localAudioManager != null)
        {
          if (localAudioManager.requestAudioFocus(this, 3, 2) == 1) {
            bool1 = true;
          }
          this.zzc = bool1;
        }
        this.zzb.zzn();
      }
    }
    else if (this.zzc)
    {
      localAudioManager = this.zza;
      if (localAudioManager != null)
      {
        bool1 = bool2;
        if (localAudioManager.abandonAudioFocus(this) == 0) {
          bool1 = true;
        }
        this.zzc = bool1;
      }
      this.zzb.zzn();
    }
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzc = bool;
    this.zzb.zzn();
  }
  
  public final float zza()
  {
    float f;
    if (this.zze) {
      f = 0.0F;
    } else {
      f = this.zzf;
    }
    if (this.zzc) {
      return f;
    }
    return 0.0F;
  }
  
  public final void zzb()
  {
    this.zzd = true;
    zzf();
  }
  
  public final void zzc()
  {
    this.zzd = false;
    zzf();
  }
  
  public final void zzd(boolean paramBoolean)
  {
    this.zze = paramBoolean;
    zzf();
  }
  
  public final void zze(float paramFloat)
  {
    this.zzf = paramFloat;
    zzf();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */