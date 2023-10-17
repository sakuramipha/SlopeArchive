package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

final class zzdsd
  extends zzbkh
{
  final zzdse zzf;
  
  zzdsd(zzdse paramzzdse, Object paramObject, String paramString, long paramLong, zzfff paramzzfff, zzcal paramzzcal) {}
  
  public final void zze(String paramString)
  {
    synchronized (this.zza)
    {
      zzdse.zzk(this.zzf, this.zzb, false, paramString, (int)(zzt.zzB().elapsedRealtime() - this.zzc));
      zzdse.zzd(this.zzf).zzb(this.zzb, "error");
      zzdse.zzc(this.zzf).zzb(this.zzb, "error");
      zzfft localzzfft = zzdse.zze(this.zzf);
      zzfff localzzfff = this.zzd;
      localzzfff.zzc(paramString);
      localzzfff.zzf(false);
      localzzfft.zzb(localzzfff.zzl());
      this.zze.zzd(Boolean.valueOf(false));
      return;
    }
  }
  
  public final void zzf()
  {
    synchronized (this.zza)
    {
      zzdse.zzk(this.zzf, this.zzb, true, "", (int)(zzt.zzB().elapsedRealtime() - this.zzc));
      zzdse.zzd(this.zzf).zzd(this.zzb);
      zzdse.zzc(this.zzf).zzd(this.zzb);
      zzfft localzzfft = zzdse.zze(this.zzf);
      zzfff localzzfff = this.zzd;
      localzzfff.zzf(true);
      localzzfft.zzb(localzzfff.zzl());
      this.zze.zzd(Boolean.valueOf(true));
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */