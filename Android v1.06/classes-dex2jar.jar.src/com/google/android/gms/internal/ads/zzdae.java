package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzdae
  implements zzcyd
{
  private int zza;
  
  public zzdae()
  {
    zzbbc localzzbbc = zzbbk.zzbd;
    this.zza = ((Integer)zzba.zzc().zzb(localzzbbc)).intValue();
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    try
    {
      zzbbc localzzbbc = zzbbk.zzbe;
      boolean bool = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
      if (bool) {
        try
        {
          this.zza = paramzzezr.zzb.zzb.zzc;
          return;
        }
        catch (NullPointerException paramzzezr)
        {
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzbA(zzbug paramzzbug) {}
  
  public final int zzc()
  {
    try
    {
      int i = this.zza;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */