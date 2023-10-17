package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

final class zzfve
  extends zzfuq
{
  @CheckForNull
  private zzfvd zza;
  
  zzfve(zzfrm paramzzfrm, boolean paramBoolean, Executor paramExecutor, Callable paramCallable)
  {
    super(paramzzfrm, paramBoolean, false);
    this.zza = new zzfvc(this, paramCallable, paramExecutor);
    zzw();
  }
  
  final void zzg(int paramInt, @CheckForNull Object paramObject) {}
  
  protected final void zzr()
  {
    zzfvd localzzfvd = this.zza;
    if (localzzfvd != null) {
      localzzfvd.zzh();
    }
  }
  
  final void zzv()
  {
    zzfvd localzzfvd = this.zza;
    if (localzzfvd != null) {
      localzzfvd.zzf();
    }
  }
  
  final void zzz(int paramInt)
  {
    super.zzz(paramInt);
    if (paramInt == 1) {
      this.zza = null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */