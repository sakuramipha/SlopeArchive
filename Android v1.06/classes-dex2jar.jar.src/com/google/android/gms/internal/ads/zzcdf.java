package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcdf
  extends zzb
{
  final zzccc zza;
  final zzcdn zzb;
  private final String zzc;
  private final String[] zzd;
  
  zzcdf(zzccc paramzzccc, zzcdn paramzzcdn, String paramString, String[] paramArrayOfString)
  {
    this.zza = paramzzccc;
    this.zzb = paramzzcdn;
    this.zzc = paramString;
    this.zzd = paramArrayOfString;
    zzt.zzy().zzb(this);
  }
  
  public final void zza()
  {
    try
    {
      this.zzb.zzu(this.zzc, this.zzd);
      return;
    }
    finally
    {
      zzs.zza.post(new zzcde(this));
    }
  }
  
  public final zzfwb zzb()
  {
    zzbbc localzzbbc = zzbbk.zzbP;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && ((this.zzb instanceof zzcdw))) {
      return zzcag.zze.zzb(new zzcdd(this));
    }
    return super.zzb();
  }
  
  public final String zze()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */