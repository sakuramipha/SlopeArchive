package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

public final class zzzi
{
  private final Handler zza;
  private final zzzj zzb;
  
  public zzzi(Handler paramHandler, zzzj paramzzzj)
  {
    if (paramzzzj == null) {
      paramHandler = null;
    }
    this.zza = paramHandler;
    this.zzb = paramzzzj;
  }
  
  public final void zza(String paramString, long paramLong1, long paramLong2)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzze(this, paramString, paramLong1, paramLong2));
    }
  }
  
  public final void zzb(String paramString)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzh(this, paramString));
    }
  }
  
  public final void zzc(zzhs paramzzhs)
  {
    paramzzhs.zza();
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzd(this, paramzzhs));
    }
  }
  
  public final void zzd(int paramInt, long paramLong)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzyy(this, paramInt, paramLong));
    }
  }
  
  public final void zze(zzhs paramzzhs)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzc(this, paramzzhs));
    }
  }
  
  public final void zzf(zzam paramzzam, zzht paramzzht)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzf(this, paramzzam, paramzzht));
    }
  }
  
  public final void zzq(Object paramObject)
  {
    if (this.zza != null)
    {
      long l = SystemClock.elapsedRealtime();
      this.zza.post(new zzyz(this, paramObject, l));
    }
  }
  
  public final void zzr(long paramLong, int paramInt)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzb(this, paramLong, paramInt));
    }
  }
  
  public final void zzs(Exception paramException)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzza(this, paramException));
    }
  }
  
  public final void zzt(zzdn paramzzdn)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzzg(this, paramzzdn));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */