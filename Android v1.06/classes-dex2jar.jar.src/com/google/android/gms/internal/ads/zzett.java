package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

public final class zzett
{
  public static zzeqq zza(zzesx paramzzesx, zzeoo paramzzeoo, ScheduledExecutorService paramScheduledExecutorService, int paramInt)
  {
    if (paramInt == 0) {
      return new zzeow(paramzzeoo, 0L, paramScheduledExecutorService);
    }
    return new zzeow(paramzzesx, 0L, paramScheduledExecutorService);
  }
  
  public static zzeqq zzb(zzeth paramzzeth, ScheduledExecutorService paramScheduledExecutorService)
  {
    zzbbc localzzbbc = zzbbk.zzdO;
    return new zzeow(paramzzeth, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), paramScheduledExecutorService);
  }
  
  public static zzeqq zzc(zzeuc paramzzeuc, ScheduledExecutorService paramScheduledExecutorService)
  {
    return new zzeow(paramzzeuc, 0L, paramScheduledExecutorService);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzett.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */