package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

final class zzbyu
{
  final zzbyv zza;
  private long zzb = -1L;
  private long zzc = -1L;
  
  public zzbyu(zzbyv paramzzbyv) {}
  
  public final long zza()
  {
    return this.zzc;
  }
  
  public final Bundle zzb()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("topen", this.zzb);
    localBundle.putLong("tclose", this.zzc);
    return localBundle;
  }
  
  public final void zzc()
  {
    this.zzc = zzbyv.zzb(this.zza).elapsedRealtime();
  }
  
  public final void zzd()
  {
    this.zzb = zzbyv.zzb(this.zza).elapsedRealtime();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */