package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzfmr;
import com.google.android.gms.internal.ads.zzfms;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnd;
import com.google.android.gms.internal.ads.zzfnf;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfnh;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfoc;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.HashMap;
import java.util.Map;

public final class zzw
{
  private String zza = null;
  private String zzb = null;
  private zzcfb zzc = null;
  private zzfmt zzd = null;
  private boolean zze = false;
  private zzfng zzf;
  
  private final zzfni zzl()
  {
    zzfnh localzzfnh = zzfni.zzc();
    Object localObject = zzbbk.zzjN;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (!TextUtils.isEmpty(this.zzb)))
    {
      localzzfnh.zza(this.zzb);
    }
    else
    {
      localObject = this.zza;
      if (localObject != null) {
        localzzfnh.zzb((String)localObject);
      } else {
        zzf("Missing session token and/or appId", "onLMDupdate");
      }
    }
    return localzzfnh.zzc();
  }
  
  private final void zzm()
  {
    if (this.zzf == null) {
      this.zzf = new zzv(this);
    }
  }
  
  public final void zza(zzcfb paramzzcfb, Context paramContext)
  {
    try
    {
      this.zzc = paramzzcfb;
      if (!zzk(paramContext))
      {
        zzf("Unable to bind", "on_play_store_bind");
        return;
      }
      paramzzcfb = new java/util/HashMap;
      paramzzcfb.<init>();
      paramzzcfb.put("action", "fetch_completed");
      zze("on_play_store_bind", paramzzcfb);
      return;
    }
    finally {}
  }
  
  public final void zzb()
  {
    if (this.zze)
    {
      zzfmt localzzfmt = this.zzd;
      if (localzzfmt != null)
      {
        localzzfmt.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
        return;
      }
    }
    zze.zza("LastMileDelivery not connected");
  }
  
  public final void zzc()
  {
    if (this.zze)
    {
      zzfmt localzzfmt = this.zzd;
      if (localzzfmt != null)
      {
        zzfmr localzzfmr = zzfms.zzc();
        Object localObject = zzbbk.zzjN;
        if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (!TextUtils.isEmpty(this.zzb)))
        {
          localzzfmr.zza(this.zzb);
        }
        else
        {
          localObject = this.zza;
          if (localObject != null) {
            localzzfmr.zzb((String)localObject);
          } else {
            zzf("Missing session token and/or appId", "onLMDupdate");
          }
        }
        localzzfmt.zzb(localzzfmr.zzc(), this.zzf);
        return;
      }
    }
    zze.zza("LastMileDelivery not connected");
  }
  
  final void zzd(String paramString)
  {
    zze(paramString, new HashMap());
  }
  
  final void zze(String paramString, Map paramMap)
  {
    zzcag.zze.execute(new zzu(this, paramString, paramMap));
  }
  
  final void zzf(String paramString1, String paramString2)
  {
    zze.zza(paramString1);
    if (this.zzc != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("message", paramString1);
      localHashMap.put("action", paramString2);
      zze("onError", localHashMap);
    }
  }
  
  public final void zzg()
  {
    if (this.zze)
    {
      zzfmt localzzfmt = this.zzd;
      if (localzzfmt != null)
      {
        localzzfmt.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
        return;
      }
    }
    zze.zza("LastMileDelivery not connected");
  }
  
  final void zzi(zzfnf paramzzfnf)
  {
    Object localObject;
    if (!TextUtils.isEmpty(paramzzfnf.zzb()))
    {
      localObject = zzbbk.zzjN;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
        this.zza = paramzzfnf.zzb();
      }
    }
    switch (paramzzfnf.zza())
    {
    case 8154: 
    case 8156: 
    case 8158: 
    case 8159: 
    default: 
      return;
    case 8160: 
    case 8161: 
    case 8162: 
      localObject = new HashMap();
      ((Map)localObject).put("error", String.valueOf(paramzzfnf.zza()));
      zze("onLMDOverlayFailedToOpen", (Map)localObject);
      return;
    case 8157: 
      this.zza = null;
      this.zzb = null;
      this.zze = false;
      return;
    case 8155: 
      zzd("onLMDOverlayClose");
      return;
    case 8153: 
      zzd("onLMDOverlayClicked");
      return;
    }
    zzd("onLMDOverlayOpened");
  }
  
  public final void zzj(zzcfb paramzzcfb, zzfnd paramzzfnd)
  {
    if (paramzzcfb == null)
    {
      zzf("adWebview missing", "onLMDShow");
      return;
    }
    this.zzc = paramzzcfb;
    if ((!this.zze) && (!zzk(paramzzcfb.getContext())))
    {
      zzf("LMDOverlay not bound", "on_play_store_bind");
      return;
    }
    paramzzcfb = zzbbk.zzjN;
    if (((Boolean)zzba.zzc().zzb(paramzzcfb)).booleanValue()) {
      this.zzb = paramzzfnd.zzg();
    }
    zzm();
    paramzzcfb = this.zzd;
    if (paramzzcfb != null) {
      paramzzcfb.zzd(paramzzfnd, this.zzf);
    }
  }
  
  public final boolean zzk(Context paramContext)
  {
    try
    {
      boolean bool = zzfoc.zza(paramContext);
      if (!bool) {
        return false;
      }
      try
      {
        this.zzd = zzfmu.zza(paramContext);
      }
      catch (NullPointerException paramContext)
      {
        zze.zza("Error connecting LMD Overlay service");
        zzt.zzo().zzu(paramContext, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
      }
      if (this.zzd == null)
      {
        this.zze = false;
        return false;
      }
      zzm();
      this.zze = true;
      return true;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */