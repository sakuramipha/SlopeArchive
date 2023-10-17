package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

final class zzfuf$zzd
{
  static final zzd zza = new zzd();
  @CheckForNull
  zzd next;
  @CheckForNull
  final Runnable zzb;
  @CheckForNull
  final Executor zzc;
  
  zzfuf$zzd()
  {
    this.zzb = null;
    this.zzc = null;
  }
  
  zzfuf$zzd(Runnable paramRunnable, Executor paramExecutor)
  {
    this.zzb = paramRunnable;
    this.zzc = paramExecutor;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfuf$zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */