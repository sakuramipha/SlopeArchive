package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

final class zzewb
  implements zzfch
{
  public final zzewv zza;
  public final zzewx zzb;
  public final zzl zzc;
  public final String zzd;
  public final Executor zze;
  public final zzw zzf;
  public final zzfbw zzg;
  
  public zzewb(zzewv paramzzewv, zzewx paramzzewx, zzl paramzzl, String paramString, Executor paramExecutor, zzw paramzzw, zzfbw paramzzfbw)
  {
    this.zza = paramzzewv;
    this.zzb = paramzzewx;
    this.zzc = paramzzl;
    this.zzd = paramString;
    this.zze = paramExecutor;
    this.zzf = paramzzw;
    this.zzg = paramzzfbw;
  }
  
  public final zzfbw zza()
  {
    return this.zzg;
  }
  
  public final Executor zzb()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzewb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */