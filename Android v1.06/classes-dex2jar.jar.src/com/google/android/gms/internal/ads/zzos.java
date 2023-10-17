package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zzos
{
  private final Handler zza;
  private final zzot zzb;
  
  public zzos(Handler paramHandler, zzot paramzzot)
  {
    if (paramzzot == null) {
      paramHandler = null;
    }
    this.zza = paramHandler;
    this.zzb = paramzzot;
  }
  
  public final void zza(Exception paramException)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzoi(this, paramException));
    }
  }
  
  public final void zzb(Exception paramException)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzoo(this, paramException));
    }
  }
  
  public final void zzc(String paramString, long paramLong1, long paramLong2)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzon(this, paramString, paramLong1, paramLong2));
    }
  }
  
  public final void zzd(String paramString)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzop(this, paramString));
    }
  }
  
  public final void zze(zzhs paramzzhs)
  {
    paramzzhs.zza();
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzoj(this, paramzzhs));
    }
  }
  
  public final void zzf(zzhs paramzzhs)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzok(this, paramzzhs));
    }
  }
  
  public final void zzg(zzam paramzzam, zzht paramzzht)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzoq(this, paramzzam, paramzzht));
    }
  }
  
  public final void zzr(long paramLong)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzol(this, paramLong));
    }
  }
  
  public final void zzs(boolean paramBoolean)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzom(this, paramBoolean));
    }
  }
  
  public final void zzt(int paramInt, long paramLong1, long paramLong2)
  {
    Handler localHandler = this.zza;
    if (localHandler != null) {
      localHandler.post(new zzor(this, paramInt, paramLong1, paramLong2));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */