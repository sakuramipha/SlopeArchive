package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdgx
  extends zzcrf
{
  public static final zzfrr zzc = zzfrr.zzq("3010", "3008", "1005", "1009", "2011", "2007");
  private final zzaua zzA;
  private zzfwk zzB;
  private final Executor zzd;
  private final zzdhc zze;
  private final zzdhk zzf;
  private final zzdic zzg;
  private final zzdhh zzh;
  private final zzdhn zzi;
  private final zzgvi zzj;
  private final zzgvi zzk;
  private final zzgvi zzl;
  private final zzgvi zzm;
  private final zzgvi zzn;
  private zzdiy zzo;
  private boolean zzp;
  private boolean zzq;
  private boolean zzr;
  private final zzbxg zzs;
  private final zzaqq zzt;
  private final zzbzz zzu;
  private final Context zzv;
  private final zzdgz zzw;
  private final zzeji zzx;
  private final Map zzy;
  private final List zzz;
  
  public zzdgx(zzcre paramzzcre, Executor paramExecutor, zzdhc paramzzdhc, zzdhk paramzzdhk, zzdic paramzzdic, zzdhh paramzzdhh, zzdhn paramzzdhn, zzgvi paramzzgvi1, zzgvi paramzzgvi2, zzgvi paramzzgvi3, zzgvi paramzzgvi4, zzgvi paramzzgvi5, zzbxg paramzzbxg, zzaqq paramzzaqq, zzbzz paramzzbzz, Context paramContext, zzdgz paramzzdgz, zzeji paramzzeji, zzaua paramzzaua)
  {
    super(paramzzcre);
    this.zzd = paramExecutor;
    this.zze = paramzzdhc;
    this.zzf = paramzzdhk;
    this.zzg = paramzzdic;
    this.zzh = paramzzdhh;
    this.zzi = paramzzdhn;
    this.zzj = paramzzgvi1;
    this.zzk = paramzzgvi2;
    this.zzl = paramzzgvi3;
    this.zzm = paramzzgvi4;
    this.zzn = paramzzgvi5;
    this.zzs = paramzzbxg;
    this.zzt = paramzzaqq;
    this.zzu = paramzzbzz;
    this.zzv = paramContext;
    this.zzw = paramzzdgz;
    this.zzx = paramzzeji;
    this.zzy = new HashMap();
    this.zzz = new ArrayList();
    this.zzA = paramzzaua;
  }
  
  public static boolean zzW(View paramView)
  {
    zzbbc localzzbbc = zzbbk.zzjh;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      zzt.zzp();
      long l = zzs.zzs(paramView);
      if ((paramView.isShown()) && (paramView.getGlobalVisibleRect(new Rect(), null)))
      {
        paramView = zzbbk.zzji;
        if (l >= ((Integer)zzba.zzc().zzb(paramView)).intValue()) {
          return true;
        }
      }
      return false;
    }
    return (paramView.isShown()) && (paramView.getGlobalVisibleRect(new Rect(), null));
  }
  
  private final View zzY(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    try
    {
      zzfrr localzzfrr = zzc;
      int j = localzzfrr.size();
      int i = 0;
      while (i < j)
      {
        WeakReference localWeakReference = (WeakReference)paramMap.get((String)localzzfrr.get(i));
        i++;
        if (localWeakReference != null)
        {
          paramMap = (View)localWeakReference.get();
          return paramMap;
        }
      }
      return null;
    }
    finally {}
  }
  
  private final ImageView.ScaleType zzZ()
  {
    try
    {
      Object localObject1 = zzbbk.zzhy;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
      if (!bool) {
        return null;
      }
      localObject1 = this.zzo;
      if (localObject1 == null)
      {
        zzbzt.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
        return null;
      }
      localObject1 = ((zzdiy)localObject1).zzj();
      if (localObject1 != null)
      {
        localObject1 = (ImageView.ScaleType)ObjectWrapper.unwrap((IObjectWrapper)localObject1);
        return (ImageView.ScaleType)localObject1;
      }
      localObject1 = zzdic.zza;
      return (ImageView.ScaleType)localObject1;
    }
    finally {}
  }
  
  private final void zzaa(String paramString, boolean paramBoolean)
  {
    paramString = zzbbk.zzeQ;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
    {
      paramString = this.zze.zzv();
      if (paramString == null) {
        return;
      }
      this.zzB = zzfwk.zzf();
      zzfvr.zzq(paramString, new zzdgw(this, "Google", true), this.zzd);
      return;
    }
    zzt("Google", true);
  }
  
  private final void zzab(View paramView, Map paramMap1, Map paramMap2)
  {
    try
    {
      this.zzg.zzd(this.zzo);
      this.zzf.zzq(paramView, paramMap1, paramMap2, zzZ());
      this.zzq = true;
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  private final void zzac(View paramView, zzfgo paramzzfgo)
  {
    zzcfb localzzcfb = this.zze.zzq();
    if ((this.zzh.zzd()) && (paramzzfgo != null) && (localzzcfb != null) && (paramView != null)) {
      zzt.zzA().zzc(paramzzfgo, paramView);
    }
  }
  
  private final void zzad(zzdiy paramzzdiy)
  {
    try
    {
      boolean bool = this.zzp;
      if (bool) {
        return;
      }
      this.zzo = paramzzdiy;
      this.zzg.zze(paramzzdiy);
      this.zzf.zzy(paramzzdiy.zzf(), paramzzdiy.zzm(), paramzzdiy.zzn(), paramzzdiy, paramzzdiy);
      Object localObject1 = zzbbk.zzcn;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = this.zzt.zzc();
        if (localObject1 != null) {
          ((zzaqm)localObject1).zzo(paramzzdiy.zzf());
        }
      }
      localObject1 = zzbbk.zzbE;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = this.zzb;
        if (((zzezf)localObject1).zzal)
        {
          localObject1 = ((zzezf)localObject1).zzak.keys();
          if (localObject1 != null) {
            while (((Iterator)localObject1).hasNext())
            {
              String str = (String)((Iterator)localObject1).next();
              Object localObject2 = (WeakReference)this.zzo.zzl().get(str);
              this.zzy.put(str, Boolean.valueOf(false));
              if (localObject2 != null)
              {
                View localView = (View)((WeakReference)localObject2).get();
                if (localView != null)
                {
                  Object localObject3 = this.zzv;
                  localObject2 = new com/google/android/gms/internal/ads/zzatz;
                  ((zzatz)localObject2).<init>((Context)localObject3, localView);
                  this.zzz.add(localObject2);
                  localObject3 = new com/google/android/gms/internal/ads/zzdgv;
                  ((zzdgv)localObject3).<init>(this, str);
                  ((zzatz)localObject2).zzc((zzaty)localObject3);
                }
              }
            }
          }
        }
      }
      if (paramzzdiy.zzi() != null)
      {
        paramzzdiy.zzi().zzc(this.zzs);
        return;
      }
      return;
    }
    finally {}
  }
  
  private final void zzae(zzdiy paramzzdiy)
  {
    this.zzf.zzz(paramzzdiy.zzf(), paramzzdiy.zzl());
    if (paramzzdiy.zzh() != null)
    {
      paramzzdiy.zzh().setClickable(false);
      paramzzdiy.zzh().removeAllViews();
    }
    if (paramzzdiy.zzi() != null) {
      paramzzdiy.zzi().zze(this.zzs);
    }
    this.zzo = null;
  }
  
  public final void zzA(View paramView, Map paramMap1, Map paramMap2, boolean paramBoolean)
  {
    try
    {
      boolean bool = this.zzq;
      if (bool) {
        return;
      }
      Object localObject1 = zzbbk.zzbE;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (this.zzb.zzal))
      {
        localObject1 = this.zzy.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          bool = ((Boolean)this.zzy.get(localObject2)).booleanValue();
          if (!bool) {
            return;
          }
        }
      }
      if (!paramBoolean)
      {
        localObject1 = zzbbk.zzdC;
        if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (paramMap1 != null))
        {
          localObject1 = paramMap1.entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (View)((WeakReference)((Map.Entry)((Iterator)localObject1).next()).getValue()).get();
            if ((localObject2 != null) && (zzW((View)localObject2)))
            {
              zzab(paramView, paramMap1, paramMap2);
              return;
            }
          }
        }
        return;
      }
      localObject1 = zzY(paramMap1);
      if (localObject1 == null)
      {
        zzab(paramView, paramMap1, paramMap2);
        return;
      }
      Object localObject2 = zzbbk.zzdD;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        if (zzW((View)localObject1))
        {
          zzab(paramView, paramMap1, paramMap2);
          return;
        }
        return;
      }
      localObject2 = zzbbk.zzdE;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        localObject2 = new android/graphics/Rect;
        ((Rect)localObject2).<init>();
        if ((((View)localObject1).getGlobalVisibleRect((Rect)localObject2, null)) && (((View)localObject1).getHeight() == ((Rect)localObject2).height()) && (((View)localObject1).getWidth() == ((Rect)localObject2).width()))
        {
          zzab(paramView, paramMap1, paramMap2);
          return;
        }
        return;
      }
      zzab(paramView, paramMap1, paramMap2);
      return;
    }
    finally {}
  }
  
  public final void zzB(zzcw paramzzcw)
  {
    try
    {
      this.zzf.zzj(paramzzcw);
      return;
    }
    finally
    {
      paramzzcw = finally;
      throw paramzzcw;
    }
  }
  
  public final void zzC(View paramView1, View paramView2, Map paramMap1, Map paramMap2, boolean paramBoolean)
  {
    try
    {
      this.zzg.zzc(this.zzo);
      this.zzf.zzk(paramView1, paramView2, paramMap1, paramMap2, paramBoolean, zzZ());
      if (this.zzr)
      {
        paramView1 = this.zze;
        if (paramView1.zzr() != null)
        {
          paramView1 = paramView1.zzr();
          paramView2 = new androidx/collection/ArrayMap;
          paramView2.<init>();
          paramView1.zzd("onSdkAdUserInteractionClick", paramView2);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzD(View paramView, int paramInt)
  {
    try
    {
      Object localObject = zzbbk.zzjP;
      boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
      if (!bool) {
        return;
      }
      localObject = this.zzo;
      if (localObject == null)
      {
        zzbzt.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        return;
      }
      bool = localObject instanceof zzdhw;
      localObject = this.zzd;
      zzdgn localzzdgn = new com/google/android/gms/internal/ads/zzdgn;
      localzzdgn.<init>(this, paramView, bool, paramInt);
      ((Executor)localObject).execute(localzzdgn);
      return;
    }
    finally {}
  }
  
  public final void zzE(String paramString)
  {
    try
    {
      this.zzf.zzl(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzF(Bundle paramBundle)
  {
    try
    {
      this.zzf.zzm(paramBundle);
      return;
    }
    finally
    {
      paramBundle = finally;
      throw paramBundle;
    }
  }
  
  public final void zzG()
  {
    try
    {
      Object localObject1 = this.zzo;
      if (localObject1 == null)
      {
        zzbzt.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        return;
      }
      boolean bool = localObject1 instanceof zzdhw;
      Executor localExecutor = this.zzd;
      localObject1 = new com/google/android/gms/internal/ads/zzdgs;
      ((zzdgs)localObject1).<init>(this, bool);
      localExecutor.execute((Runnable)localObject1);
      return;
    }
    finally {}
  }
  
  public final void zzH()
  {
    try
    {
      boolean bool = this.zzq;
      if (bool) {
        return;
      }
      this.zzf.zzr();
      return;
    }
    finally {}
  }
  
  public final void zzI(View paramView)
  {
    Object localObject = zzbbk.zzeQ;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzB;
      if (localObject == null) {
        return;
      }
      ((zzfwk)localObject).zzc(new zzdgo(this, paramView), this.zzd);
      return;
    }
    zzac(paramView, this.zze.zzt());
  }
  
  public final void zzJ(View paramView1, MotionEvent paramMotionEvent, View paramView2)
  {
    try
    {
      this.zzf.zzs(paramView1, paramMotionEvent, paramView2);
      return;
    }
    finally
    {
      paramView1 = finally;
      throw paramView1;
    }
  }
  
  public final void zzK(Bundle paramBundle)
  {
    try
    {
      this.zzf.zzt(paramBundle);
      return;
    }
    finally
    {
      paramBundle = finally;
      throw paramBundle;
    }
  }
  
  public final void zzL(View paramView)
  {
    try
    {
      this.zzf.zzu(paramView);
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void zzM()
  {
    try
    {
      this.zzf.zzv();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzN(zzcs paramzzcs)
  {
    try
    {
      this.zzf.zzw(paramzzcs);
      return;
    }
    finally
    {
      paramzzcs = finally;
      throw paramzzcs;
    }
  }
  
  public final void zzO(zzdg paramzzdg)
  {
    try
    {
      this.zzx.zza(paramzzdg);
      return;
    }
    finally
    {
      paramzzdg = finally;
      throw paramzzdg;
    }
  }
  
  public final void zzP(zzbgk paramzzbgk)
  {
    try
    {
      this.zzf.zzx(paramzzbgk);
      return;
    }
    finally
    {
      paramzzbgk = finally;
      throw paramzzbgk;
    }
  }
  
  public final void zzQ(zzdiy paramzzdiy)
  {
    try
    {
      Object localObject = zzbbk.zzbC;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzs.zza;
        zzdgt localzzdgt = new com/google/android/gms/internal/ads/zzdgt;
        localzzdgt.<init>(this, paramzzdiy);
        ((zzflv)localObject).post(localzzdgt);
        return;
      }
      zzad(paramzzdiy);
      return;
    }
    finally {}
  }
  
  public final void zzR(zzdiy paramzzdiy)
  {
    try
    {
      Object localObject = zzbbk.zzbC;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        zzflv localzzflv = zzs.zza;
        localObject = new com/google/android/gms/internal/ads/zzdgp;
        ((zzdgp)localObject).<init>(this, paramzzdiy);
        localzzflv.post((Runnable)localObject);
        return;
      }
      zzae(paramzzdiy);
      return;
    }
    finally {}
  }
  
  public final boolean zzS()
  {
    return this.zzh.zze();
  }
  
  public final boolean zzT()
  {
    try
    {
      boolean bool = this.zzf.zzA();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzU()
  {
    try
    {
      boolean bool = this.zzf.zzB();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzV()
  {
    return this.zzh.zzd();
  }
  
  public final boolean zzX(Bundle paramBundle)
  {
    try
    {
      boolean bool = this.zzq;
      if (bool) {
        return true;
      }
      bool = this.zzf.zzC(paramBundle);
      this.zzq = bool;
      return bool;
    }
    finally {}
  }
  
  public final int zza()
  {
    try
    {
      int i = this.zzf.zza();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb()
  {
    try
    {
      this.zzp = true;
      Executor localExecutor = this.zzd;
      zzdgu localzzdgu = new com/google/android/gms/internal/ads/zzdgu;
      localzzdgu.<init>(this);
      localExecutor.execute(localzzdgu);
      super.zzb();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzdgz zzc()
  {
    return this.zzw;
  }
  
  public final String zzg()
  {
    return this.zzh.zzb();
  }
  
  public final JSONObject zzi(View paramView, Map paramMap1, Map paramMap2)
  {
    try
    {
      paramView = this.zzf.zze(paramView, paramMap1, paramMap2, zzZ());
      return paramView;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void zzj()
  {
    this.zzd.execute(new zzdgq(this));
    if (this.zze.zzc() != 7)
    {
      Executor localExecutor = this.zzd;
      zzdhk localzzdhk = this.zzf;
      localzzdhk.getClass();
      localExecutor.execute(new zzdgr(localzzdhk));
    }
    super.zzj();
  }
  
  public final JSONObject zzk(View paramView, Map paramMap1, Map paramMap2)
  {
    try
    {
      paramView = this.zzf.zzf(paramView, paramMap1, paramMap2, zzZ());
      return paramView;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void zzr(View paramView)
  {
    zzfgo localzzfgo = this.zze.zzt();
    if ((this.zzh.zzd()) && (localzzfgo != null) && (paramView != null))
    {
      zzt.zzA();
      zzbbc localzzbbc = zzbbk.zzeK;
      if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (zzfgm.zzb())) {
        localzzfgo.zzb(paramView, zzfgu.zzc, "Ad overlay");
      }
    }
  }
  
  public final void zzs()
  {
    try
    {
      this.zzf.zzh();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzt(String paramString, boolean paramBoolean)
  {
    if ((this.zzh.zzd()) && (!TextUtils.isEmpty(paramString)))
    {
      Object localObject1 = this.zze;
      Object localObject2 = ((zzdhc)localObject1).zzq();
      zzcfb localzzcfb = ((zzdhc)localObject1).zzr();
      if ((localObject2 == null) && (localzzcfb == null))
      {
        zzbzt.zzj("Omid display and video webview are null. Skipping initialization.");
        return;
      }
      int k = 0;
      int i;
      if (localObject2 != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (localzzcfb != null) {
        j = 1;
      } else {
        j = 0;
      }
      localObject1 = zzbbk.zzeO;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        this.zzh.zza();
        j = this.zzh.zza().zzb();
        i = j - 1;
        if (i != 0)
        {
          if (i != 1)
          {
            if (j != 1)
            {
              if (j != 2) {
                paramString = "UNKNOWN";
              } else {
                paramString = "DISPLAY";
              }
            }
            else {
              paramString = "VIDEO";
            }
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Unknown omid media type: ");
            ((StringBuilder)localObject1).append(paramString);
            ((StringBuilder)localObject1).append(". Not initializing Omid.");
            zzbzt.zzj(((StringBuilder)localObject1).toString());
            return;
          }
          if (localObject2 != null)
          {
            j = 1;
            i = 0;
          }
          else
          {
            zzbzt.zzj("Omid media type was display but there was no display webview.");
          }
        }
        else if (localzzcfb != null)
        {
          i = 1;
          j = k;
        }
        else
        {
          zzbzt.zzj("Omid media type was video but there was no video webview.");
        }
      }
      else
      {
        k = i;
        i = j;
        j = k;
      }
      String str1;
      if (j != 0)
      {
        str1 = null;
      }
      else
      {
        str1 = "javascript";
        localObject2 = localzzcfb;
      }
      ((zzcfb)localObject2).zzG();
      if (!zzt.zzA().zze(this.zzv))
      {
        zzbzt.zzj("Failed to initialize omid in InternalNativeAd");
        return;
      }
      localObject1 = this.zzu;
      k = ((zzbzz)localObject1).zzb;
      int j = ((zzbzz)localObject1).zzc;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(k);
      ((StringBuilder)localObject1).append(".");
      ((StringBuilder)localObject1).append(j);
      String str2 = ((StringBuilder)localObject1).toString();
      zzebt localzzebt;
      if (i != 0)
      {
        localzzebt = zzebt.zzc;
        localObject1 = zzebu.zzb;
      }
      for (;;)
      {
        break;
        localzzebt = zzebt.zzb;
        if (this.zze.zzc() == 3) {
          localObject1 = zzebu.zzd;
        } else {
          localObject1 = zzebu.zzc;
        }
      }
      paramString = zzt.zzA().zzb(str2, ((zzcfb)localObject2).zzG(), "", "javascript", str1, paramString, (zzebu)localObject1, localzzebt, this.zzb.zzam);
      if (paramString == null)
      {
        zzbzt.zzj("Failed to create omid session in InternalNativeAd");
        return;
      }
      this.zze.zzV(paramString);
      ((zzcfb)localObject2).zzap(paramString);
      if (i != 0)
      {
        localObject1 = localzzcfb.zzF();
        zzt.zzA().zzc(paramString, (View)localObject1);
        this.zzr = true;
      }
      if (paramBoolean)
      {
        zzt.zzA().zzd(paramString);
        ((zzcfb)localObject2).zzd("onSdkLoaded", new ArrayMap());
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */