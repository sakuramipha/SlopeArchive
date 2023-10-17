package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzbzt;

public final class zzcx
  implements MuteThisAdReason
{
  private final String zza;
  private final zzcw zzb;
  
  public zzcx(zzcw paramzzcw)
  {
    this.zzb = paramzzcw;
    try
    {
      paramzzcw = paramzzcw.zze();
    }
    catch (RemoteException paramzzcw)
    {
      zzbzt.zzh("", paramzzcw);
      paramzzcw = null;
    }
    this.zza = paramzzcw;
  }
  
  public final String getDescription()
  {
    return this.zza;
  }
  
  public final String toString()
  {
    return this.zza;
  }
  
  public final zzcw zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */