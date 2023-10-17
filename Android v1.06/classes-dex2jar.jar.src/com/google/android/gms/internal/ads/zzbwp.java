package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbwp
  implements zzbwu
{
  public static final int zzb = 0;
  private static final List zzc = Collections.synchronizedList(new ArrayList());
  boolean zza;
  private final zzgsv zzd;
  private final LinkedHashMap zze;
  private final List zzf = new ArrayList();
  private final List zzg = new ArrayList();
  private final Context zzh;
  private final zzbwr zzi;
  private final Object zzj = new Object();
  private HashSet zzk = new HashSet();
  private boolean zzl = false;
  private boolean zzm = false;
  private final zzbwq zzn;
  
  public zzbwp(Context paramContext, zzbzz paramzzbzz, zzbwr paramzzbwr, String paramString, zzbwq paramzzbwq)
  {
    Preconditions.checkNotNull(paramzzbwr, "SafeBrowsing config is not present.");
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.zzh = localContext;
    this.zze = new LinkedHashMap();
    this.zzn = paramzzbwq;
    this.zzi = paramzzbwr;
    paramzzbwr = paramzzbwr.zze.iterator();
    while (paramzzbwr.hasNext())
    {
      paramContext = (String)paramzzbwr.next();
      this.zzk.add(paramContext.toLowerCase(Locale.ENGLISH));
    }
    this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
    paramContext = zzguk.zza();
    paramContext.zzn(9);
    paramContext.zzj(paramString);
    paramContext.zzh(paramString);
    paramzzbwr = zzgsx.zza();
    paramString = this.zzi.zza;
    if (paramString != null) {
      paramzzbwr.zza(paramString);
    }
    paramContext.zzg((zzgsx)paramzzbwr.zzal());
    paramzzbwr = zzguf.zza();
    paramzzbwr.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
    paramzzbzz = paramzzbzz.zza;
    if (paramzzbzz != null) {
      paramzzbwr.zza(paramzzbzz);
    }
    long l = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
    if (l > 0L) {
      paramzzbwr.zzb(l);
    }
    paramContext.zzf((zzguf)paramzzbwr.zzal());
    this.zzd = paramContext;
  }
  
  public final zzbwr zza()
  {
    return this.zzi;
  }
  
  public final void zzd(String paramString, Map paramMap, int paramInt)
  {
    Object localObject2 = this.zzj;
    if (paramInt == 3) {}
    try
    {
      this.zzm = true;
      if (this.zze.containsKey(paramString))
      {
        if (paramInt == 3) {
          ((zzguc)this.zze.get(paramString)).zze(4);
        }
        return;
      }
      zzguc localzzguc = zzgud.zzc();
      paramInt = zzgub.zza(paramInt);
      if (paramInt != 0) {
        localzzguc.zze(paramInt);
      }
      localzzguc.zzb(this.zze.size());
      localzzguc.zzd(paramString);
      zzgti localzzgti = zzgtl.zza();
      if ((!this.zzk.isEmpty()) && (paramMap != null))
      {
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject1 = (Map.Entry)localIterator.next();
          if (((Map.Entry)localObject1).getKey() != null) {
            paramMap = (String)((Map.Entry)localObject1).getKey();
          } else {
            paramMap = "";
          }
          if (((Map.Entry)localObject1).getValue() != null) {
            localObject1 = (String)((Map.Entry)localObject1).getValue();
          } else {
            localObject1 = "";
          }
          Object localObject3 = paramMap.toLowerCase(Locale.ENGLISH);
          if (this.zzk.contains(localObject3))
          {
            localObject3 = zzgth.zza();
            ((zzgtg)localObject3).zza(zzgno.zzw(paramMap));
            ((zzgtg)localObject3).zzb(zzgno.zzw((String)localObject1));
            localzzgti.zza((zzgth)((zzgos)localObject3).zzal());
          }
        }
      }
      localzzguc.zzc((zzgtl)localzzgti.zzal());
      this.zze.put(paramString, localzzguc);
      return;
    }
    finally {}
  }
  
  public final void zze()
  {
    synchronized (this.zzj)
    {
      this.zze.keySet();
      Object localObject2 = zzfvr.zzh(Collections.emptyMap());
      Object localObject4 = new com/google/android/gms/internal/ads/zzbwm;
      ((zzbwm)localObject4).<init>(this);
      zzfwb localzzfwb = zzfvr.zzm((zzfwb)localObject2, (zzfuy)localObject4, zzcag.zzf);
      localObject4 = zzfvr.zzn(localzzfwb, 10L, TimeUnit.SECONDS, zzcag.zzd);
      localObject2 = new com/google/android/gms/internal/ads/zzbwo;
      ((zzbwo)localObject2).<init>(this, (zzfwb)localObject4);
      zzfvr.zzq(localzzfwb, (zzfvn)localObject2, zzcag.zzf);
      zzc.add(localObject4);
      return;
    }
  }
  
  public final void zzg(View paramView)
  {
    if (!this.zzi.zzc) {
      return;
    }
    if (this.zzl) {
      return;
    }
    zzt.zzp();
    Object localObject = null;
    if (paramView == null)
    {
      paramView = (View)localObject;
    }
    else
    {
      Bitmap localBitmap;
      try
      {
        boolean bool = paramView.isDrawingCacheEnabled();
        paramView.setDrawingCacheEnabled(true);
        localBitmap = paramView.getDrawingCache();
        if (localBitmap != null) {
          localBitmap = Bitmap.createBitmap(localBitmap);
        } else {
          localBitmap = null;
        }
        try
        {
          paramView.setDrawingCacheEnabled(bool);
        }
        catch (RuntimeException localRuntimeException1) {}
        zzbzt.zzh("Fail to capture the web view", localRuntimeException2);
      }
      catch (RuntimeException localRuntimeException2)
      {
        localBitmap = null;
      }
      if (localBitmap == null) {
        try
        {
          int i = paramView.getWidth();
          int j = paramView.getHeight();
          if ((i != 0) && (j != 0))
          {
            localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
            Canvas localCanvas = new android/graphics/Canvas;
            localCanvas.<init>(localBitmap);
            paramView.layout(0, 0, i, j);
            paramView.draw(localCanvas);
            paramView = localBitmap;
          }
          else
          {
            zzbzt.zzj("Width or height of view is zero");
            paramView = (View)localObject;
          }
        }
        catch (RuntimeException paramView)
        {
          zzbzt.zzh("Fail to capture the webview", paramView);
          paramView = (View)localObject;
        }
      }
      paramView = localBitmap;
    }
    if (paramView == null)
    {
      zzbwt.zza("Failed to capture the webview bitmap.");
      return;
    }
    this.zzl = true;
    paramView = new zzbwn(this, paramView);
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      paramView.run();
      return;
    }
    zzcag.zza.execute(paramView);
  }
  
  public final void zzh(String paramString)
  {
    Object localObject = this.zzj;
    if (paramString == null) {}
    try
    {
      this.zzd.zzd();
      break label31;
      this.zzd.zze(paramString);
      label31:
      return;
    }
    finally {}
  }
  
  public final boolean zzi()
  {
    return (PlatformVersion.isAtLeastKitKat()) && (this.zzi.zzc) && (!this.zzl);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */