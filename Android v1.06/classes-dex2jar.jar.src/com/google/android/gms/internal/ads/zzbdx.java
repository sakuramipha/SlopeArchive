package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

public final class zzbdx
{
  private final Context zza;
  
  public zzbdx(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void zza(zzbtf paramzzbtf)
  {
    try
    {
      ((zzbdy)zzbzx.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbdw.zza)).zze(paramzzbtf);
      return;
    }
    catch (RemoteException paramzzbtf)
    {
      zzbzt.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(paramzzbtf.getMessage())));
      return;
    }
    catch (zzbzw paramzzbtf)
    {
      zzbzt.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(paramzzbtf.getMessage())));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */