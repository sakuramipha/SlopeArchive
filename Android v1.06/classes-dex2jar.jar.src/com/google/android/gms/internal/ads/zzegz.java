package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

final class zzegz
  implements zzcwr
{
  boolean zza = false;
  final zzeha zzd;
  
  zzegz(zzeha paramzzeha, zzeby paramzzeby, zzcal paramzzcal) {}
  
  private final void zze(zze paramzze)
  {
    try
    {
      Object localObject = zzbbk.zzfg;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
      int i = 1;
      if (true == bool) {
        i = 3;
      }
      localObject = this.zzc;
      zzebz localzzebz = new com/google/android/gms/internal/ads/zzebz;
      localzzebz.<init>(i, paramzze);
      ((zzcal)localObject).zze(localzzebz);
      return;
    }
    finally {}
  }
  
  public final void zza(int paramInt)
  {
    try
    {
      boolean bool = this.zza;
      if (bool) {
        return;
      }
      this.zza = true;
      String str = zzeha.zze(this.zzb.zza, paramInt);
      zze localzze = new com/google/android/gms/ads/internal/client/zze;
      localzze.<init>(paramInt, str, "undefined", null, null);
      zze(localzze);
      return;
    }
    finally {}
  }
  
  public final void zzb(zze paramzze)
  {
    try
    {
      boolean bool = this.zza;
      if (bool) {
        return;
      }
      this.zza = true;
      zze(paramzze);
      return;
    }
    finally {}
  }
  
  public final void zzc(int paramInt, String paramString)
  {
    try
    {
      boolean bool = this.zza;
      if (bool) {
        return;
      }
      this.zza = true;
      String str = paramString;
      if (paramString == null) {
        str = zzeha.zze(this.zzb.zza, paramInt);
      }
      paramString = new com/google/android/gms/ads/internal/client/zze;
      paramString.<init>(paramInt, str, "undefined", null, null);
      zze(paramString);
      return;
    }
    finally {}
  }
  
  public final void zzd()
  {
    try
    {
      this.zzc.zzd(null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */