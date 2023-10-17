package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzdrg
{
  private final zzbjf zza;
  
  zzdrg(zzbjf paramzzbjf)
  {
    this.zza = paramzzbjf;
  }
  
  private final void zzs(zzdrf paramzzdrf)
    throws RemoteException
  {
    paramzzdrf = zzdrf.zza(paramzzdrf);
    zzbzt.zzi("Dispatching AFMA event on publisher webview: ".concat(paramzzdrf));
    this.zza.zzb(paramzzdrf);
  }
  
  public final void zza()
    throws RemoteException
  {
    zzs(new zzdrf("initialize", null));
  }
  
  public final void zzb(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdClicked");
    this.zza.zzb(zzdrf.zza(localzzdrf));
  }
  
  public final void zzc(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdClosed");
    zzs(localzzdrf);
  }
  
  public final void zzd(long paramLong, int paramInt)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdFailedToLoad");
    zzdrf.zzb(localzzdrf, Integer.valueOf(paramInt));
    zzs(localzzdrf);
  }
  
  public final void zze(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdLoaded");
    zzs(localzzdrf);
  }
  
  public final void zzf(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onNativeAdObjectNotAvailable");
    zzs(localzzdrf);
  }
  
  public final void zzg(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("interstitial", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdOpened");
    zzs(localzzdrf);
  }
  
  public final void zzh(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("creation", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "nativeObjectCreated");
    zzs(localzzdrf);
  }
  
  public final void zzi(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("creation", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "nativeObjectNotCreated");
    zzs(localzzdrf);
  }
  
  public final void zzj(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdClicked");
    zzs(localzzdrf);
  }
  
  public final void zzk(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onRewardedAdClosed");
    zzs(localzzdrf);
  }
  
  public final void zzl(long paramLong, zzbvm paramzzbvm)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onUserEarnedReward");
    zzdrf.zzf(localzzdrf, paramzzbvm.zzf());
    zzdrf.zze(localzzdrf, Integer.valueOf(paramzzbvm.zze()));
    zzs(localzzdrf);
  }
  
  public final void zzm(long paramLong, int paramInt)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onRewardedAdFailedToLoad");
    zzdrf.zzb(localzzdrf, Integer.valueOf(paramInt));
    zzs(localzzdrf);
  }
  
  public final void zzn(long paramLong, int paramInt)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onRewardedAdFailedToShow");
    zzdrf.zzb(localzzdrf, Integer.valueOf(paramInt));
    zzs(localzzdrf);
  }
  
  public final void zzo(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onAdImpression");
    zzs(localzzdrf);
  }
  
  public final void zzp(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onRewardedAdLoaded");
    zzs(localzzdrf);
  }
  
  public final void zzq(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onNativeAdObjectNotAvailable");
    zzs(localzzdrf);
  }
  
  public final void zzr(long paramLong)
    throws RemoteException
  {
    zzdrf localzzdrf = new zzdrf("rewarded", null);
    zzdrf.zzd(localzzdrf, Long.valueOf(paramLong));
    zzdrf.zzc(localzzdrf, "onRewardedAdOpened");
    zzs(localzzdrf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */