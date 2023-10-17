package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class zzdyj
  extends zzbtr
{
  private final Context zza;
  private final zzfwc zzb;
  private final zzdzb zzc;
  private final zzcmi zzd;
  private final ArrayDeque zze;
  private final zzfft zzf;
  private final zzbus zzg;
  private final zzdyy zzh;
  
  public zzdyj(Context paramContext, zzfwc paramzzfwc, zzbus paramzzbus, zzcmi paramzzcmi, zzdzb paramzzdzb, ArrayDeque paramArrayDeque, zzdyy paramzzdyy, zzfft paramzzfft)
  {
    zzbbk.zza(paramContext);
    this.zza = paramContext;
    this.zzb = paramzzfwc;
    this.zzg = paramzzbus;
    this.zzc = paramzzdzb;
    this.zzd = paramzzcmi;
    this.zze = paramArrayDeque;
    this.zzh = paramzzdyy;
    this.zzf = paramzzfft;
  }
  
  private final zzdyg zzk(String paramString)
  {
    try
    {
      Iterator localIterator = this.zze.iterator();
      while (localIterator.hasNext())
      {
        zzdyg localzzdyg = (zzdyg)localIterator.next();
        if (localzzdyg.zzc.equals(paramString))
        {
          localIterator.remove();
          return localzzdyg;
        }
      }
      return null;
    }
    finally {}
  }
  
  private static zzfwb zzl(zzfwb paramzzfwb, zzfed paramzzfed, zzbmy paramzzbmy, zzffq paramzzffq, zzfff paramzzfff)
  {
    paramzzbmy = paramzzbmy.zza("AFMA_getAdDictionary", zzbmv.zza, zzdya.zza);
    zzffp.zzd(paramzzfwb, paramzzfff);
    paramzzfwb = paramzzfed.zzb(zzfdx.zzg, paramzzfwb).zzf(paramzzbmy).zza();
    zzffp.zzc(paramzzfwb, paramzzffq, paramzzfff);
    return paramzzfwb;
  }
  
  private static zzfwb zzm(zzbug paramzzbug, zzfed paramzzfed, zzeri paramzzeri)
  {
    zzdxu localzzdxu = new zzdxu(paramzzeri);
    paramzzeri = zzdxv.zza;
    return paramzzfed.zzb(zzfdx.zze, zzfvr.zzh(paramzzbug.zza)).zzf(localzzdxu).zze(paramzzeri).zza();
  }
  
  private final void zzn(zzdyg paramzzdyg)
  {
    try
    {
      zzo();
      this.zze.addLast(paramzzdyg);
      return;
    }
    finally
    {
      paramzzdyg = finally;
      throw paramzzdyg;
    }
  }
  
  private final void zzo()
  {
    try
    {
      int i = ((Long)zzbdk.zzd.zze()).intValue();
      while (this.zze.size() >= i) {
        this.zze.removeFirst();
      }
      return;
    }
    finally {}
  }
  
  private final void zzp(zzfwb paramzzfwb, zzbuc paramzzbuc)
  {
    zzfvr.zzq(zzfvr.zzm(paramzzfwb, new zzdyd(this), zzcag.zza), new zzdyf(this, paramzzbuc), zzcag.zzf);
  }
  
  public final zzfwb zzb(zzbug paramzzbug, int paramInt)
  {
    if (!((Boolean)zzbdk.zza.zze()).booleanValue()) {
      return zzfvr.zzg(new Exception("Split request is disabled."));
    }
    Object localObject1 = paramzzbug.zzi;
    if (localObject1 == null) {
      return zzfvr.zzg(new Exception("Pool configuration missing from request."));
    }
    if ((((zzfbt)localObject1).zzc != 0) && (((zzfbt)localObject1).zzd != 0))
    {
      Object localObject3 = zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
      Object localObject2 = this.zzd.zzp(paramzzbug, paramInt);
      zzfed localzzfed = ((zzeri)localObject2).zzc();
      localObject1 = zzm(paramzzbug, localzzfed, (zzeri)localObject2);
      zzffq localzzffq = ((zzeri)localObject2).zzd();
      localObject2 = zzffe.zza(this.zza, 9);
      localObject3 = zzl((zzfwb)localObject1, localzzfed, (zzbmy)localObject3, localzzffq, (zzfff)localObject2);
      return localzzfed.zza(zzfdx.zzy, new zzfwb[] { localObject1, localObject3 }).zza(new zzdxz(this, (zzfwb)localObject3, (zzfwb)localObject1, paramzzbug, (zzfff)localObject2)).zza();
    }
    return zzfvr.zzg(new Exception("Caching is disabled."));
  }
  
  public final zzfwb zzc(zzbug paramzzbug, int paramInt)
  {
    Object localObject4 = zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
    zzeri localzzeri = this.zzd.zzp(paramzzbug, paramInt);
    zzbmo localzzbmo = ((zzbmy)localObject4).zza("google.afma.response.normalize", zzdyi.zza, zzbmv.zzb);
    boolean bool = ((Boolean)zzbdk.zza.zze()).booleanValue();
    Object localObject2 = null;
    Object localObject1;
    if (!bool)
    {
      localObject3 = paramzzbug.zzj;
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = localObject2;
        if (!((String)localObject3).isEmpty())
        {
          zze.zza("Request contained a PoolKey but split request is disabled.");
          localObject1 = localObject2;
        }
      }
    }
    else
    {
      localObject2 = zzk(paramzzbug.zzh);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        zze.zza("Request contained a PoolKey but no matching parameters were found.");
        localObject1 = localObject2;
      }
    }
    if (localObject1 == null) {
      localObject2 = zzffe.zza(this.zza, 9);
    } else {
      localObject2 = ((zzdyg)localObject1).zze;
    }
    Object localObject3 = localzzeri.zzd();
    ((zzffq)localObject3).zzd(paramzzbug.zza.getStringArrayList("ad_types"));
    zzdza localzzdza = new zzdza(paramzzbug.zzg, (zzffq)localObject3, (zzfff)localObject2);
    zzdyx localzzdyx = new zzdyx(this.zza, paramzzbug.zzb.zza, this.zzg, paramInt);
    zzfed localzzfed = localzzeri.zzc();
    zzfff localzzfff = zzffe.zza(this.zza, 11);
    if (localObject1 == null)
    {
      paramzzbug = zzm(paramzzbug, localzzfed, localzzeri);
      localObject2 = zzl(paramzzbug, localzzfed, (zzbmy)localObject4, (zzffq)localObject3, (zzfff)localObject2);
      localObject1 = zzffe.zza(this.zza, 10);
      localObject4 = localzzfed.zza(zzfdx.zzi, new zzfwb[] { localObject2, paramzzbug }).zza(new zzdxx(paramzzbug, (zzfwb)localObject2)).zze(localzzdza).zze(new zzffl((zzfff)localObject1)).zze(localzzdyx).zza();
      zzffp.zza((zzfwb)localObject4, (zzffq)localObject3, (zzfff)localObject1);
      zzffp.zzd((zzfwb)localObject4, localzzfff);
      paramzzbug = localzzfed.zza(zzfdx.zzk, new zzfwb[] { paramzzbug, localObject2, localObject4 }).zza(new zzdxy((zzfwb)localObject4, paramzzbug, (zzfwb)localObject2)).zzf(localzzbmo).zza();
    }
    else
    {
      localObject2 = new zzdyz(((zzdyg)localObject1).zzb, ((zzdyg)localObject1).zza);
      paramzzbug = zzffe.zza(this.zza, 10);
      localObject2 = localzzfed.zzb(zzfdx.zzi, zzfvr.zzh(localObject2)).zze(localzzdza).zze(new zzffl(paramzzbug)).zze(localzzdyx).zza();
      zzffp.zza((zzfwb)localObject2, (zzffq)localObject3, paramzzbug);
      paramzzbug = zzfvr.zzh(localObject1);
      zzffp.zzd((zzfwb)localObject2, localzzfff);
      paramzzbug = localzzfed.zza(zzfdx.zzk, new zzfwb[] { localObject2, paramzzbug }).zza(new zzdyc((zzfwb)localObject2, paramzzbug)).zzf(localzzbmo).zza();
    }
    zzffp.zza(paramzzbug, (zzffq)localObject3, localzzfff);
    return paramzzbug;
  }
  
  public final zzfwb zzd(zzbug paramzzbug, int paramInt)
  {
    Object localObject1 = zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
    if (!((Boolean)zzbdp.zza.zze()).booleanValue()) {
      return zzfvr.zzg(new Exception("Signal collection disabled."));
    }
    Object localObject2 = this.zzd.zzp(paramzzbug, paramInt);
    Object localObject3 = ((zzeri)localObject2).zza();
    zzbmo localzzbmo = ((zzbmy)localObject1).zza("google.afma.request.getSignals", zzbmv.zza, zzbmv.zzb);
    localObject1 = zzffe.zza(this.zza, 22);
    localObject3 = ((zzeri)localObject2).zzc().zzb(zzfdx.zzl, zzfvr.zzh(paramzzbug.zza)).zze(new zzffl((zzfff)localObject1)).zzf(new zzdyb((zzeqt)localObject3)).zzb(zzfdx.zzm).zzf(localzzbmo).zza();
    localObject2 = ((zzeri)localObject2).zzd();
    ((zzffq)localObject2).zzd(paramzzbug.zza.getStringArrayList("ad_types"));
    zzffp.zzb((zzfwb)localObject3, (zzffq)localObject2, (zzfff)localObject1);
    if (((Boolean)zzbdd.zze.zze()).booleanValue())
    {
      paramzzbug = this.zzc;
      paramzzbug.getClass();
      ((zzfwb)localObject3).zzc(new zzdxw(paramzzbug), this.zzb);
    }
    return (zzfwb)localObject3;
  }
  
  public final void zze(zzbug paramzzbug, zzbuc paramzzbuc)
  {
    zzp(zzb(paramzzbug, Binder.getCallingUid()), paramzzbuc);
  }
  
  public final void zzf(zzbug paramzzbug, zzbuc paramzzbuc)
  {
    zzp(zzd(paramzzbug, Binder.getCallingUid()), paramzzbuc);
  }
  
  public final void zzg(zzbug paramzzbug, zzbuc paramzzbuc)
  {
    paramzzbug = zzc(paramzzbug, Binder.getCallingUid());
    zzp(paramzzbug, paramzzbuc);
    if (((Boolean)zzbdd.zzc.zze()).booleanValue())
    {
      paramzzbuc = this.zzc;
      paramzzbuc.getClass();
      paramzzbug.zzc(new zzdxw(paramzzbuc), this.zzb);
    }
  }
  
  public final void zzh(String paramString, zzbuc paramzzbuc)
  {
    zzp(zzi(paramString), paramzzbuc);
  }
  
  public final zzfwb zzi(String paramString)
  {
    if (!((Boolean)zzbdk.zza.zze()).booleanValue()) {
      return zzfvr.zzg(new Exception("Split request is disabled."));
    }
    zzdye localzzdye = new zzdye(this);
    if (zzk(paramString) == null) {
      return zzfvr.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(paramString))));
    }
    return zzfvr.zzh(localzzdye);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdyj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */