package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

public final class zzdzh
  implements zzdcb
{
  private boolean zza = false;
  private boolean zzb = false;
  private final String zzc;
  private final zzfen zzd;
  private final zzg zze;
  
  public zzdzh(String paramString, zzfen paramzzfen)
  {
    this.zzc = paramString;
    this.zzd = paramzzfen;
    this.zze = zzt.zzo().zzh();
  }
  
  private final zzfem zzg(String paramString)
  {
    String str;
    if (this.zze.zzP()) {
      str = "";
    } else {
      str = this.zzc;
    }
    paramString = zzfem.zzb(paramString);
    paramString.zza("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
    paramString.zza("tid", str);
    return paramString;
  }
  
  public final void zza(String paramString)
  {
    zzfen localzzfen = this.zzd;
    paramString = zzg("aaia");
    paramString.zza("aair", "MalformedJson");
    localzzfen.zzb(paramString);
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    zzfen localzzfen = this.zzd;
    zzfem localzzfem = zzg("adapter_init_finished");
    localzzfem.zza("ancn", paramString1);
    localzzfem.zza("rqe", paramString2);
    localzzfen.zzb(localzzfem);
  }
  
  public final void zzc(String paramString)
  {
    zzfen localzzfen = this.zzd;
    zzfem localzzfem = zzg("adapter_init_started");
    localzzfem.zza("ancn", paramString);
    localzzfen.zzb(localzzfem);
  }
  
  public final void zzd(String paramString)
  {
    zzfen localzzfen = this.zzd;
    zzfem localzzfem = zzg("adapter_init_finished");
    localzzfem.zza("ancn", paramString);
    localzzfen.zzb(localzzfem);
  }
  
  public final void zze()
  {
    try
    {
      if (!this.zzb)
      {
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
        return;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzf()
  {
    try
    {
      if (!this.zza)
      {
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
        return;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */