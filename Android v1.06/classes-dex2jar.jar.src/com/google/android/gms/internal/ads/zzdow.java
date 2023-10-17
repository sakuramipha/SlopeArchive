package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import javax.annotation.Nullable;

public final class zzdow
  implements zzcyd, zzcww, zzcvl, zzcwc, zza, zzdap
{
  private final zzawx zza;
  private boolean zzb = false;
  
  public zzdow(zzawx paramzzawx, @Nullable zzexa paramzzexa)
  {
    this.zza = paramzzawx;
    paramzzawx.zzc(2);
    if (paramzzexa != null) {
      paramzzawx.zzc(1101);
    }
  }
  
  public final void onAdClicked()
  {
    try
    {
      if (!this.zzb)
      {
        this.zza.zzc(7);
        this.zzb = true;
        return;
      }
      this.zza.zzc(8);
      return;
    }
    finally {}
  }
  
  public final void zza(zze paramzze)
  {
    switch (paramzze.zza)
    {
    default: 
      this.zza.zzc(4);
      return;
    case 7: 
      this.zza.zzc(106);
      return;
    case 6: 
      this.zza.zzc(105);
      return;
    case 5: 
      this.zza.zzc(104);
      return;
    case 4: 
      this.zza.zzc(103);
      return;
    case 3: 
      this.zza.zzc(5);
      return;
    case 2: 
      this.zza.zzc(102);
      return;
    }
    this.zza.zzc(101);
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    this.zza.zzb(new zzdos(paramzzezr));
  }
  
  public final void zzbA(zzbug paramzzbug) {}
  
  public final void zzd()
  {
    this.zza.zzc(1109);
  }
  
  public final void zze(zzaxs paramzzaxs)
  {
    this.zza.zzb(new zzdov(paramzzaxs));
    this.zza.zzc(1103);
  }
  
  public final void zzf(zzaxs paramzzaxs)
  {
    this.zza.zzb(new zzdou(paramzzaxs));
    this.zza.zzc(1102);
  }
  
  public final void zzh(boolean paramBoolean)
  {
    int i;
    if (true != paramBoolean) {
      i = 1108;
    } else {
      i = 1107;
    }
    this.zza.zzc(i);
  }
  
  public final void zzi(zzaxs paramzzaxs)
  {
    this.zza.zzb(new zzdot(paramzzaxs));
    this.zza.zzc(1104);
  }
  
  public final void zzk(boolean paramBoolean)
  {
    int i;
    if (true != paramBoolean) {
      i = 1106;
    } else {
      i = 1105;
    }
    this.zza.zzc(i);
  }
  
  public final void zzl()
  {
    try
    {
      this.zza.zzc(6);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzn()
  {
    this.zza.zzc(3);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */