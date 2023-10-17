package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class zza
  extends zzc<Boolean>
{
  public final int zza;
  public final Bundle zzb;
  final BaseGmsClient zzc;
  
  protected zza(BaseGmsClient paramBaseGmsClient, int paramInt, Bundle paramBundle)
  {
    super(paramBaseGmsClient, Boolean.valueOf(true));
    this.zza = paramInt;
    this.zzb = paramBundle;
  }
  
  protected abstract void zzb(ConnectionResult paramConnectionResult);
  
  protected final void zzc() {}
  
  protected abstract boolean zzd();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */