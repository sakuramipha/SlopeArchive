package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import javax.annotation.Nullable;

public final class zzefl
{
  private final zzfap zza;
  private final zzdnu zzb;
  private final zzdqc zzc;
  private final zzfen zzd;
  
  public zzefl(zzfap paramzzfap, zzdnu paramzzdnu, zzdqc paramzzdqc, zzfen paramzzfen)
  {
    this.zza = paramzzfap;
    this.zzb = paramzzdnu;
    this.zzc = paramzzdqc;
    this.zzd = paramzzfen;
  }
  
  public final void zza(zzezi paramzzezi, zzezf paramzzezf, int paramInt, @Nullable zzebz paramzzebz, long paramLong)
  {
    Object localObject = zzbbk.zzid;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = zzfem.zzb("adapter_status");
      ((zzfem)localObject).zzg(paramzzezi);
      ((zzfem)localObject).zzf(paramzzezf);
      ((zzfem)localObject).zza("adapter_l", String.valueOf(paramLong));
      ((zzfem)localObject).zza("sc", Integer.toString(paramInt));
      if (paramzzebz != null)
      {
        ((zzfem)localObject).zza("arec", Integer.toString(paramzzebz.zzb().zza));
        paramzzezi = this.zza.zza(paramzzebz.getMessage());
        if (paramzzezi != null) {
          ((zzfem)localObject).zza("areec", paramzzezi);
        }
      }
      paramzzezf = this.zzb.zzb(paramzzezf.zzu);
      if (paramzzezf != null)
      {
        ((zzfem)localObject).zza("ancn", paramzzezf.zza);
        paramzzezi = paramzzezf.zzb;
        if (paramzzezi != null) {
          ((zzfem)localObject).zza("adapter_v", paramzzezi.toString());
        }
        paramzzezi = paramzzezf.zzc;
        if (paramzzezi != null) {
          ((zzfem)localObject).zza("adapter_sv", paramzzezi.toString());
        }
      }
      this.zzd.zzb((zzfem)localObject);
      return;
    }
    localObject = this.zzc.zza();
    ((zzdqb)localObject).zze(paramzzezi);
    ((zzdqb)localObject).zzd(paramzzezf);
    ((zzdqb)localObject).zzb("action", "adapter_status");
    ((zzdqb)localObject).zzb("adapter_l", String.valueOf(paramLong));
    ((zzdqb)localObject).zzb("sc", Integer.toString(paramInt));
    if (paramzzebz != null)
    {
      ((zzdqb)localObject).zzb("arec", Integer.toString(paramzzebz.zzb().zza));
      paramzzezi = this.zza.zza(paramzzebz.getMessage());
      if (paramzzezi != null) {
        ((zzdqb)localObject).zzb("areec", paramzzezi);
      }
    }
    paramzzezf = this.zzb.zzb(paramzzezf.zzu);
    if (paramzzezf != null)
    {
      ((zzdqb)localObject).zzb("ancn", paramzzezf.zza);
      paramzzezi = paramzzezf.zzb;
      if (paramzzezi != null) {
        ((zzdqb)localObject).zzb("adapter_v", paramzzezi.toString());
      }
      paramzzezi = paramzzezf.zzc;
      if (paramzzezi != null) {
        ((zzdqb)localObject).zzb("adapter_sv", paramzzezi.toString());
      }
    }
    ((zzdqb)localObject).zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */