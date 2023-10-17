package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class zzaxd
{
  zzatt zza;
  boolean zzb;
  private final ExecutorService zzc;
  
  public zzaxd()
  {
    this.zzc = zzbzi.zzb;
  }
  
  public zzaxd(Context paramContext)
  {
    ExecutorService localExecutorService = zzbzi.zzb;
    this.zzc = localExecutorService;
    localExecutorService.execute(new zzawy(this, paramContext));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */