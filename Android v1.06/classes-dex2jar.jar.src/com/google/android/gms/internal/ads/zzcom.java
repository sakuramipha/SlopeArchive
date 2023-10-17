package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzcom
{
  private final zzfen zza;
  private final zzdqc zzb;
  private final zzezr zzc;
  
  public zzcom(zzdqc paramzzdqc, zzezr paramzzezr, zzfen paramzzfen)
  {
    this.zza = paramzzfen;
    this.zzb = paramzzdqc;
    this.zzc = paramzzezr;
  }
  
  private static String zzb(int paramInt)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return "u";
            }
            return "ac";
          }
          return "cb";
        }
        return "cc";
      }
      return "bb";
    }
    return "h";
  }
  
  public final void zza(long paramLong, int paramInt)
  {
    Object localObject = zzbbk.zzid;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzfen localzzfen = this.zza;
      localObject = zzfem.zzb("ad_closed");
      ((zzfem)localObject).zzg(this.zzc.zzb.zzb);
      ((zzfem)localObject).zza("show_time", String.valueOf(paramLong));
      ((zzfem)localObject).zza("ad_format", "app_open_ad");
      ((zzfem)localObject).zza("acr", zzb(paramInt));
      localzzfen.zzb((zzfem)localObject);
      return;
    }
    localObject = this.zzb.zza();
    ((zzdqb)localObject).zze(this.zzc.zzb.zzb);
    ((zzdqb)localObject).zzb("action", "ad_closed");
    ((zzdqb)localObject).zzb("show_time", String.valueOf(paramLong));
    ((zzdqb)localObject).zzb("ad_format", "app_open_ad");
    ((zzdqb)localObject).zzb("acr", zzb(paramInt));
    ((zzdqb)localObject).zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */