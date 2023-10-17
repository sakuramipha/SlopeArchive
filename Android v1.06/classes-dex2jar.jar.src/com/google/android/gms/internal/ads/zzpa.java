package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class zzpa
{
  private final AudioTrack zza;
  private final AudioTimestamp zzb;
  private long zzc;
  private long zzd;
  private long zze;
  
  public zzpa(AudioTrack paramAudioTrack)
  {
    this.zza = paramAudioTrack;
    this.zzb = new AudioTimestamp();
  }
  
  public final long zza()
  {
    return this.zze;
  }
  
  public final long zzb()
  {
    return this.zzb.nanoTime / 1000L;
  }
  
  public final boolean zzc()
  {
    boolean bool = this.zza.getTimestamp(this.zzb);
    if (bool)
    {
      long l = this.zzb.framePosition;
      if (this.zzd > l) {
        this.zzc += 1L;
      }
      this.zzd = l;
      this.zze = (l + (this.zzc << 32));
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */