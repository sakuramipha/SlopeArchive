package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

public final class zzg
{
  private final Executor zza;
  
  zzg(Executor paramExecutor)
  {
    this.zza = paramExecutor;
  }
  
  public final Executor zza()
  {
    return this.zza;
  }
  
  public final void zzb(String paramString1, String paramString2, zzf... paramVarArgs)
  {
    this.zza.execute(new zze(paramString1, paramString2, paramVarArgs));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */