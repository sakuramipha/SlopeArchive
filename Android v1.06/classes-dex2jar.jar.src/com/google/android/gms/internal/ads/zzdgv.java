package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

final class zzdgv
  implements zzaty
{
  final zzdgx zzb;
  
  zzdgv(zzdgx paramzzdgx, String paramString) {}
  
  public final void zzc(zzatx paramzzatx)
  {
    Object localObject = zzbbk.zzbD;
    boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
    localObject = Boolean.valueOf(true);
    if (bool) {
      try
      {
        if (paramzzatx.zzj)
        {
          paramzzatx = this.zzb;
          if (zzdgx.zze(paramzzatx) != null)
          {
            zzdgx.zzh(paramzzatx).put(this.zza, localObject);
            paramzzatx = this.zzb;
            paramzzatx.zzA(zzdgx.zze(paramzzatx).zzf(), zzdgx.zze(this.zzb).zzl(), zzdgx.zze(this.zzb).zzm(), true);
          }
          else
          {
            return;
          }
        }
        return;
      }
      finally {}
    }
    if (paramzzatx.zzj)
    {
      zzdgx.zzh(this.zzb).put(this.zza, localObject);
      paramzzatx = this.zzb;
      paramzzatx.zzA(zzdgx.zze(paramzzatx).zzf(), zzdgx.zze(this.zzb).zzl(), zzdgx.zze(this.zzb).zzm(), true);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */