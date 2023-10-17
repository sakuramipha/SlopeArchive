package com.google.android.gms.internal.ads;

final class zzqb
  implements zzow
{
  final zzqc zza;
  
  public final void zza(Exception paramException)
  {
    zzer.zzc("MediaCodecAudioRenderer", "Audio sink error", paramException);
    zzqc.zzW(this.zza).zzb(paramException);
  }
  
  public final void zzb()
  {
    zzqc localzzqc = this.zza;
    if (zzqc.zzV(localzzqc) != null) {
      zzqc.zzV(localzzqc).zzb();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */