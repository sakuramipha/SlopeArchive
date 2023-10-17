package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

public final class zzehx
{
  private final ConcurrentHashMap zza = new ConcurrentHashMap();
  private final zzdnx zzb;
  
  public zzehx(zzdnx paramzzdnx)
  {
    this.zzb = paramzzdnx;
  }
  
  @CheckForNull
  public final zzbpv zza(String paramString)
  {
    if (this.zza.containsKey(paramString)) {
      return (zzbpv)this.zza.get(paramString);
    }
    return null;
  }
  
  public final void zzb(String paramString)
  {
    try
    {
      zzbpv localzzbpv = this.zzb.zzb(paramString);
      this.zza.put(paramString, localzzbpv);
      return;
    }
    catch (RemoteException paramString)
    {
      zzbzt.zzh("Couldn't create RTB adapter : ", paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzehx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */