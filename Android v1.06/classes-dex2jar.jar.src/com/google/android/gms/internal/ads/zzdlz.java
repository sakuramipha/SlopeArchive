package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdlz
{
  private final zzdlm zza;
  private final zza zzb;
  private final zzcfn zzc;
  private final Context zzd;
  private final zzdqc zze;
  private final zzfen zzf;
  private final Executor zzg;
  private final zzaqq zzh;
  private final zzbzz zzi;
  private final zzbiw zzj;
  private final zzebc zzk;
  private final zzfgj zzl;
  private zzfwb zzm;
  
  zzdlz(zzdlw paramzzdlw)
  {
    this.zzd = zzdlw.zza(paramzzdlw);
    this.zzg = zzdlw.zzj(paramzzdlw);
    this.zzh = zzdlw.zzb(paramzzdlw);
    this.zzi = zzdlw.zzd(paramzzdlw);
    this.zzb = zzdlw.zzc(paramzzdlw);
    this.zza = new zzdlm();
    this.zzc = zzdlw.zze(paramzzdlw);
    this.zzj = new zzbiw();
    this.zzk = zzdlw.zzg(paramzzdlw);
    this.zzl = zzdlw.zzi(paramzzdlw);
    this.zze = zzdlw.zzf(paramzzdlw);
    this.zzf = zzdlw.zzh(paramzzdlw);
  }
  
  public final zzfwb zzd(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null)
      {
        paramString = zzfvr.zzh(null);
        return paramString;
      }
      zzdln localzzdln = new com/google/android/gms/internal/ads/zzdln;
      localzzdln.<init>(this, paramString, paramJSONObject);
      paramString = zzfvr.zzm(localzzfwb, localzzdln, this.zzg);
      return paramString;
    }
    finally {}
  }
  
  public final void zze(zzezf paramzzezf, zzezi paramzzezi)
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null) {
        return;
      }
      zzdlt localzzdlt = new com/google/android/gms/internal/ads/zzdlt;
      localzzdlt.<init>(this, paramzzezf, paramzzezi);
      zzfvr.zzq(localzzfwb, localzzdlt, this.zzg);
      return;
    }
    finally {}
  }
  
  public final void zzf()
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null) {
        return;
      }
      zzdlp localzzdlp = new com/google/android/gms/internal/ads/zzdlp;
      localzzdlp.<init>(this);
      zzfvr.zzq(localzzfwb, localzzdlp, this.zzg);
      this.zzm = null;
      return;
    }
    finally {}
  }
  
  public final void zzg(String paramString, Map paramMap)
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null) {
        return;
      }
      paramString = new com/google/android/gms/internal/ads/zzdls;
      paramString.<init>(this, "sendMessageToNativeJs", paramMap);
      zzfvr.zzq(localzzfwb, paramString, this.zzg);
      return;
    }
    finally {}
  }
  
  public final void zzh()
  {
    try
    {
      Object localObject3 = this.zzd;
      Object localObject1 = this.zzi;
      Object localObject4 = zzbbk.zzdu;
      localObject4 = (String)zzba.zzc().zzb((zzbbc)localObject4);
      zzaqq localzzaqq = this.zzh;
      zza localzza = this.zzb;
      zzcfk localzzcfk = new com/google/android/gms/internal/ads/zzcfk;
      localzzcfk.<init>((Context)localObject3, localzzaqq, (zzbzz)localObject1, localzza, (String)localObject4);
      localObject1 = zzfvr.zzk(localzzcfk, zzcag.zze);
      localObject3 = new com/google/android/gms/internal/ads/zzdlo;
      ((zzdlo)localObject3).<init>(this);
      localObject1 = zzfvr.zzl((zzfwb)localObject1, (zzfon)localObject3, this.zzg);
      this.zzm = ((zzfwb)localObject1);
      zzcaj.zza((zzfwb)localObject1, "NativeJavascriptExecutor.initializeEngine");
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public final void zzi(String paramString, zzbii paramzzbii)
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null) {
        return;
      }
      zzdlq localzzdlq = new com/google/android/gms/internal/ads/zzdlq;
      localzzdlq.<init>(this, paramString, paramzzbii);
      zzfvr.zzq(localzzfwb, localzzdlq, this.zzg);
      return;
    }
    finally {}
  }
  
  public final void zzj(WeakReference paramWeakReference, String paramString, zzbii paramzzbii)
  {
    zzi(paramString, new zzdly(this, paramWeakReference, paramString, paramzzbii, null));
  }
  
  public final void zzk(String paramString, zzbii paramzzbii)
  {
    try
    {
      zzfwb localzzfwb = this.zzm;
      if (localzzfwb == null) {
        return;
      }
      zzdlr localzzdlr = new com/google/android/gms/internal/ads/zzdlr;
      localzzdlr.<init>(this, paramString, paramzzbii);
      zzfvr.zzq(localzzfwb, localzzdlr, this.zzg);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdlz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */