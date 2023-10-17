package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzdll
  implements zzbii
{
  private final zzbfu zza;
  private final zzdlz zzb;
  private final zzgvi zzc;
  
  public zzdll(zzdhn paramzzdhn, zzdhc paramzzdhc, zzdlz paramzzdlz, zzgvi paramzzgvi)
  {
    this.zza = paramzzdhn.zzc(paramzzdhc.zzz());
    this.zzb = paramzzdlz;
    this.zzc = paramzzgvi;
  }
  
  public final void zza(Object paramObject, Map paramMap)
  {
    paramMap = (String)paramMap.get("asset");
    try
    {
      this.zza.zze((zzbfk)this.zzc.zzb(), paramMap);
      return;
    }
    catch (RemoteException paramObject)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to call onCustomClick for asset ");
      localStringBuilder.append(paramMap);
      localStringBuilder.append(".");
      zzbzt.zzk(localStringBuilder.toString(), (Throwable)paramObject);
    }
  }
  
  public final void zzb()
  {
    if (this.zza == null) {
      return;
    }
    this.zzb.zzi("/nativeAdCustomClick", this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */