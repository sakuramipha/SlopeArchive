package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzfek
{
  private final Executor zza;
  private final zzbzy zzb;
  
  public zzfek(Executor paramExecutor, zzbzy paramzzbzy)
  {
    this.zza = paramExecutor;
    this.zzb = paramzzbzy;
  }
  
  public final void zzb(String paramString)
  {
    this.zza.execute(new zzfej(this, paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */