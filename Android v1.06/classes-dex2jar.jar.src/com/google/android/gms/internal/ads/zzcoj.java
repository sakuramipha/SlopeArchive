package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcoj
  implements zzaty
{
  private zzcfb zza;
  private final Executor zzb;
  private final zzcnv zzc;
  private final Clock zzd;
  private boolean zze = false;
  private boolean zzf = false;
  private final zzcny zzg = new zzcny();
  
  public zzcoj(Executor paramExecutor, zzcnv paramzzcnv, Clock paramClock)
  {
    this.zzb = paramExecutor;
    this.zzc = paramzzcnv;
    this.zzd = paramClock;
  }
  
  private final void zzg()
  {
    try
    {
      JSONObject localJSONObject = this.zzc.zza(this.zzg);
      if (this.zza != null)
      {
        Executor localExecutor = this.zzb;
        zzcoi localzzcoi = new com/google/android/gms/internal/ads/zzcoi;
        localzzcoi.<init>(this, localJSONObject);
        localExecutor.execute(localzzcoi);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      zze.zzb("Failed to call video active view js", localJSONException);
    }
  }
  
  public final void zza()
  {
    this.zze = false;
  }
  
  public final void zzb()
  {
    this.zze = true;
    zzg();
  }
  
  public final void zzc(zzatx paramzzatx)
  {
    zzcny localzzcny = this.zzg;
    boolean bool;
    if (this.zzf) {
      bool = false;
    } else {
      bool = paramzzatx.zzj;
    }
    localzzcny.zza = bool;
    localzzcny.zzd = this.zzd.elapsedRealtime();
    this.zzg.zzf = paramzzatx;
    if (this.zze) {
      zzg();
    }
  }
  
  public final void zze(boolean paramBoolean)
  {
    this.zzf = paramBoolean;
  }
  
  public final void zzf(zzcfb paramzzcfb)
  {
    this.zza = paramzzcfb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcoj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */