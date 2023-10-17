package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.AdapterStatus.State;

public final class zzbkm
  implements AdapterStatus
{
  private final AdapterStatus.State zza;
  private final String zzb;
  private final int zzc;
  
  public zzbkm(AdapterStatus.State paramState, String paramString, int paramInt)
  {
    this.zza = paramState;
    this.zzb = paramString;
    this.zzc = paramInt;
  }
  
  public final String getDescription()
  {
    return this.zzb;
  }
  
  public final AdapterStatus.State getInitializationState()
  {
    return this.zza;
  }
  
  public final int getLatency()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */