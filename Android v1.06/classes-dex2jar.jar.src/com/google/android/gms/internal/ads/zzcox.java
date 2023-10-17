package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcox
  extends zzcrf
{
  private final zzcfb zzc;
  private final int zzd;
  private final Context zze;
  private final zzcom zzf;
  private final zzdey zzg;
  private final zzdce zzh;
  private final zzcvv zzi;
  private final boolean zzj;
  private boolean zzk = false;
  
  zzcox(zzcre paramzzcre, Context paramContext, zzcfb paramzzcfb, int paramInt, zzcom paramzzcom, zzdey paramzzdey, zzdce paramzzdce, zzcvv paramzzcvv)
  {
    super(paramzzcre);
    this.zzc = paramzzcfb;
    this.zze = paramContext;
    this.zzd = paramInt;
    this.zzf = paramzzcom;
    this.zzg = paramzzdey;
    this.zzh = paramzzdce;
    this.zzi = paramzzcvv;
    paramzzcre = zzbbk.zzeY;
    this.zzj = ((Boolean)zzba.zzc().zzb(paramzzcre)).booleanValue();
  }
  
  public final int zza()
  {
    return this.zzd;
  }
  
  public final void zzb()
  {
    super.zzb();
    zzcfb localzzcfb = this.zzc;
    if (localzzcfb != null) {
      localzzcfb.destroy();
    }
  }
  
  public final void zzc(zzavl paramzzavl)
  {
    zzcfb localzzcfb = this.zzc;
    if (localzzcfb != null) {
      localzzcfb.zzah(paramzzavl);
    }
  }
  
  public final void zzd(Activity paramActivity, zzavy paramzzavy, boolean paramBoolean)
    throws RemoteException
  {
    paramzzavy = paramActivity;
    if (paramActivity == null) {
      paramzzavy = this.zze;
    }
    if (this.zzj) {
      this.zzh.zzb();
    }
    paramActivity = zzbbk.zzaB;
    if (((Boolean)zzba.zzc().zzb(paramActivity)).booleanValue())
    {
      zzt.zzp();
      if (zzs.zzC(paramzzavy))
      {
        zzbzt.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
        this.zzi.zzb();
        paramActivity = zzbbk.zzaC;
        if (!((Boolean)zzba.zzc().zzb(paramActivity)).booleanValue()) {
          return;
        }
        new zzfje(paramzzavy.getApplicationContext(), zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
        return;
      }
    }
    if (this.zzk)
    {
      zzbzt.zzj("App open interstitial ad is already visible.");
      this.zzi.zza(zzfba.zzd(10, null, null));
    }
    if (!this.zzk) {
      try
      {
        this.zzg.zza(paramBoolean, paramzzavy, this.zzi);
        if (this.zzj) {
          this.zzh.zza();
        }
        this.zzk = true;
        return;
      }
      catch (zzdex paramActivity)
      {
        this.zzi.zzc(paramActivity);
      }
    }
  }
  
  public final void zze(long paramLong, int paramInt)
  {
    this.zzf.zza(paramLong, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */