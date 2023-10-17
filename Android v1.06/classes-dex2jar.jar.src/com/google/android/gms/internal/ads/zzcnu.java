package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcnu
{
  private final String zza;
  private final zzbnh zzb;
  private final Executor zzc;
  private zzcnz zzd;
  private final zzbii zze = new zzcnr(this);
  private final zzbii zzf = new zzcnt(this);
  
  public zzcnu(String paramString, zzbnh paramzzbnh, Executor paramExecutor)
  {
    this.zza = paramString;
    this.zzb = paramzzbnh;
    this.zzc = paramExecutor;
  }
  
  public final void zzc(zzcnz paramzzcnz)
  {
    this.zzb.zzb("/updateActiveView", this.zze);
    this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
    this.zzd = paramzzcnz;
  }
  
  public final void zzd(zzcfb paramzzcfb)
  {
    paramzzcfb.zzad("/updateActiveView", this.zze);
    paramzzcfb.zzad("/untrackActiveViewUnit", this.zzf);
  }
  
  public final void zze()
  {
    this.zzb.zzc("/updateActiveView", this.zze);
    this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
  }
  
  public final void zzf(zzcfb paramzzcfb)
  {
    paramzzcfb.zzau("/updateActiveView", this.zze);
    paramzzcfb.zzau("/untrackActiveViewUnit", this.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */