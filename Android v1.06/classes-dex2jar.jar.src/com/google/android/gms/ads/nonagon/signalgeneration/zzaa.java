package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcuq;
import com.google.android.gms.internal.ads.zzdat;
import com.google.android.gms.internal.ads.zzdlz;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfaw;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaa
  extends zzbyj
{
  protected static final List zza = new ArrayList(Arrays.asList(new String[] { "/aclk", "/pcs/click", "/dbm/clk" }));
  protected static final List zzb = new ArrayList(Arrays.asList(new String[] { ".doubleclick.net", ".googleadservices.com" }));
  protected static final List zzc = new ArrayList(Arrays.asList(new String[] { "/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad" }));
  protected static final List zzd = new ArrayList(Arrays.asList(new String[] { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" }));
  public static final int zze = 0;
  private final zzbzz zzA;
  private String zzB;
  private final String zzC;
  private final List zzD;
  private final List zzE;
  private final List zzF;
  private final List zzG;
  private final zzcgw zzf;
  private Context zzg;
  private final zzaqq zzh;
  private final zzfaw zzi;
  private zzdpx zzj = null;
  private final zzfwc zzk;
  private final ScheduledExecutorService zzl;
  private zzbst zzm;
  private Point zzn = new Point();
  private Point zzo = new Point();
  private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
  private final zzc zzq;
  private final zzdqh zzr;
  private final zzfgj zzs;
  private final boolean zzt;
  private final boolean zzu;
  private final boolean zzv;
  private final boolean zzw;
  private final String zzx;
  private final String zzy;
  private final AtomicInteger zzz = new AtomicInteger(0);
  
  public zzaa(zzcgw paramzzcgw, Context paramContext, zzaqq paramzzaqq, zzfaw paramzzfaw, zzfwc paramzzfwc, ScheduledExecutorService paramScheduledExecutorService, zzdqh paramzzdqh, zzfgj paramzzfgj, zzbzz paramzzbzz)
  {
    this.zzf = paramzzcgw;
    this.zzg = paramContext;
    this.zzh = paramzzaqq;
    this.zzi = paramzzfaw;
    this.zzk = paramzzfwc;
    this.zzl = paramScheduledExecutorService;
    this.zzq = paramzzcgw.zzm();
    this.zzr = paramzzdqh;
    this.zzs = paramzzfgj;
    this.zzA = paramzzbzz;
    paramzzcgw = zzbbk.zzgX;
    this.zzt = ((Boolean)zzba.zzc().zzb(paramzzcgw)).booleanValue();
    paramzzcgw = zzbbk.zzgW;
    this.zzu = ((Boolean)zzba.zzc().zzb(paramzzcgw)).booleanValue();
    paramzzcgw = zzbbk.zzgY;
    this.zzv = ((Boolean)zzba.zzc().zzb(paramzzcgw)).booleanValue();
    paramzzcgw = zzbbk.zzha;
    this.zzw = ((Boolean)zzba.zzc().zzb(paramzzcgw)).booleanValue();
    paramzzcgw = zzbbk.zzgZ;
    this.zzx = ((String)zzba.zzc().zzb(paramzzcgw));
    paramzzcgw = zzbbk.zzhb;
    this.zzy = ((String)zzba.zzc().zzb(paramzzcgw));
    paramzzcgw = zzbbk.zzhc;
    this.zzC = ((String)zzba.zzc().zzb(paramzzcgw));
    paramzzcgw = zzbbk.zzhd;
    if (((Boolean)zzba.zzc().zzb(paramzzcgw)).booleanValue())
    {
      paramzzcgw = zzbbk.zzhe;
      this.zzD = zzX((String)zzba.zzc().zzb(paramzzcgw));
      paramzzcgw = zzbbk.zzhf;
      this.zzE = zzX((String)zzba.zzc().zzb(paramzzcgw));
      paramzzcgw = zzbbk.zzhg;
      this.zzF = zzX((String)zzba.zzc().zzb(paramzzcgw));
      paramzzcgw = zzbbk.zzhh;
    }
    for (paramzzcgw = zzX((String)zzba.zzc().zzb(paramzzcgw));; paramzzcgw = zzd)
    {
      this.zzG = paramzzcgw;
      return;
      this.zzD = zza;
      this.zzE = zzb;
      this.zzF = zzc;
    }
  }
  
  private final zzh zzQ(Context paramContext, String paramString1, String paramString2, com.google.android.gms.ads.internal.client.zzq paramzzq, com.google.android.gms.ads.internal.client.zzl paramzzl)
  {
    zzezy localzzezy = new zzezy();
    if ("REWARDED".equals(paramString2)) {
      localzzezy.zzo().zza(2);
    } else if ("REWARDED_INTERSTITIAL".equals(paramString2)) {
      localzzezy.zzo().zza(3);
    }
    zzg localzzg = this.zzf.zzn();
    zzcuq localzzcuq = new zzcuq();
    localzzcuq.zze(paramContext);
    String str = paramString1;
    if (paramString1 == null) {
      str = "adUnitId";
    }
    localzzezy.zzs(str);
    paramString1 = paramzzl;
    if (paramzzl == null) {
      paramString1 = new zzm().zza();
    }
    localzzezy.zzE(paramString1);
    paramString1 = paramzzq;
    if (paramzzq == null)
    {
      switch (paramString2.hashCode())
      {
      default: 
        break;
      case 1951953708: 
        if (paramString2.equals("BANNER")) {
          i = 0;
        }
        break;
      case 1854800829: 
        if (paramString2.equals("REWARDED_INTERSTITIAL")) {
          i = 2;
        }
        break;
      case 543046670: 
        if (paramString2.equals("REWARDED")) {
          i = 1;
        }
        break;
      case -428325382: 
        if (paramString2.equals("APP_OPEN_AD")) {
          i = 4;
        }
        break;
      case -1999289321: 
        if (paramString2.equals("NATIVE")) {
          i = 3;
        }
        break;
      }
      int i = -1;
      if (i != 0)
      {
        if ((i != 1) && (i != 2))
        {
          if (i != 3)
          {
            if (i != 4) {
              paramString1 = new com.google.android.gms.ads.internal.client.zzq();
            } else {
              paramString1 = com.google.android.gms.ads.internal.client.zzq.zzb();
            }
          }
          else {
            paramString1 = com.google.android.gms.ads.internal.client.zzq.zzc();
          }
        }
        else {
          paramString1 = com.google.android.gms.ads.internal.client.zzq.zzd();
        }
      }
      else {
        paramString1 = new com.google.android.gms.ads.internal.client.zzq(paramContext, AdSize.BANNER);
      }
    }
    localzzezy.zzr(paramString1);
    localzzezy.zzx(true);
    localzzcuq.zzi(localzzezy.zzG());
    localzzg.zza(localzzcuq.zzj());
    paramContext = new zzac();
    paramContext.zza(paramString2);
    localzzg.zzb(new zzae(paramContext, null));
    new zzdat();
    paramContext = localzzg.zzc();
    this.zzj = paramContext.zza();
    return paramContext;
  }
  
  private final zzfwb zzR(String paramString)
  {
    Object localObject = new zzdlz[1];
    paramString = zzfvr.zzm(this.zzi.zza(), new zzk(this, (zzdlz[])localObject, paramString), this.zzk);
    paramString.zzc(new zzl(this, (zzdlz[])localObject), this.zzk);
    localObject = zzfvi.zzv(paramString);
    paramString = zzbbk.zzhn;
    return zzfvr.zze(zzfvr.zzl((zzfvi)zzfvr.zzn((zzfwb)localObject, ((Integer)zzba.zzc().zzb(paramString)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzv.zza, this.zzk), Exception.class, zzj.zza, this.zzk);
  }
  
  private final void zzS(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk, boolean paramBoolean)
  {
    Object localObject = zzbbk.zzhm;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzbzt.zzj("The updating URL feature is not enabled.");
      try
      {
        paramzzbsk.zze("The updating URL feature is not enabled.");
        return;
      }
      catch (RemoteException paramList)
      {
        zzbzt.zzh("", paramList);
        return;
      }
    }
    localObject = paramList.iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext()) {
      if (zzN((Uri)((Iterator)localObject).next())) {
        i++;
      }
    }
    if (i > 1) {
      zzbzt.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(paramList))));
    }
    localObject = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Uri)localIterator.next();
      if (!zzN(paramList))
      {
        zzbzt.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(paramList))));
        paramList = zzfvr.zzh(paramList);
      }
      else
      {
        paramList = this.zzk.zzb(new zzq(this, paramList, paramIObjectWrapper));
        if (zzV()) {
          paramList = zzfvr.zzm(paramList, new zzr(this), this.zzk);
        } else {
          zzbzt.zzi("Asset view map is empty.");
        }
      }
      ((List)localObject).add(paramList);
    }
    zzfvr.zzq(zzfvr.zzd((Iterable)localObject), new zzy(this, paramzzbsk, paramBoolean), this.zzf.zzA());
  }
  
  private final void zzT(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk, boolean paramBoolean)
  {
    zzbbc localzzbbc = zzbbk.zzhm;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      try
      {
        paramzzbsk.zze("The updating URL feature is not enabled.");
        return;
      }
      catch (RemoteException paramList)
      {
        zzbzt.zzh("", paramList);
        return;
      }
    }
    paramList = this.zzk.zzb(new zzs(this, paramList, paramIObjectWrapper));
    if (zzV()) {
      paramList = zzfvr.zzm(paramList, new zzt(this), this.zzk);
    } else {
      zzbzt.zzi("Asset view map is empty.");
    }
    zzfvr.zzq(paramList, new zzx(this, paramzzbsk, paramBoolean), this.zzf.zzA());
  }
  
  private static boolean zzU(Uri paramUri, List paramList1, List paramList2)
  {
    String str = paramUri.getHost();
    paramUri = paramUri.getPath();
    if ((str != null) && (paramUri != null))
    {
      Iterator localIterator = paramList1.iterator();
      do
      {
        while (!paramList1.hasNext())
        {
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
          } while (!paramUri.contains((String)localIterator.next()));
          paramList1 = paramList2.iterator();
        }
      } while (!str.endsWith((String)paramList1.next()));
      return true;
    }
    return false;
  }
  
  private final boolean zzV()
  {
    Object localObject = this.zzm;
    if (localObject != null)
    {
      localObject = ((zzbst)localObject).zzb;
      if ((localObject != null) && (!((Map)localObject).isEmpty())) {
        return true;
      }
    }
    return false;
  }
  
  private static final Uri zzW(Uri paramUri, String paramString1, String paramString2)
  {
    String str = paramUri.toString();
    int j = str.indexOf("&adurl=");
    int i = j;
    if (j == -1) {
      i = str.indexOf("?adurl=");
    }
    if (i != -1)
    {
      i++;
      paramUri = new StringBuilder(str.substring(0, i));
      paramUri.append(paramString1);
      paramUri.append("=");
      paramUri.append(paramString2);
      paramUri.append("&");
      paramUri.append(str.substring(i));
      return Uri.parse(paramUri.toString());
    }
    return paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }
  
  private static final List zzX(String paramString)
  {
    String[] arrayOfString = TextUtils.split(paramString, ",");
    paramString = new ArrayList();
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
    {
      String str = arrayOfString[i];
      if (!zzfpo.zzd(str)) {
        paramString.add(str);
      }
    }
    return paramString;
  }
  
  final boolean zzN(Uri paramUri)
  {
    return zzU(paramUri, this.zzD, this.zzE);
  }
  
  final boolean zzO(Uri paramUri)
  {
    return zzU(paramUri, this.zzF, this.zzG);
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, zzbyo paramzzbyo, zzbyh paramzzbyh)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    this.zzg = paramIObjectWrapper;
    zzfff localzzfff = zzffe.zza(paramIObjectWrapper, 22);
    localzzfff.zzh();
    paramIObjectWrapper = zzbbk.zzjB;
    Object localObject;
    if (((Boolean)zzba.zzc().zzb(paramIObjectWrapper)).booleanValue())
    {
      paramIObjectWrapper = zzcag.zza.zzb(new zzo(this, paramzzbyo));
      localObject = zzfvr.zzm(paramIObjectWrapper, zzp.zza, zzcag.zza);
    }
    else
    {
      localObject = zzQ(this.zzg, paramzzbyo.zza, paramzzbyo.zzb, paramzzbyo.zzc, paramzzbyo.zzd);
      paramIObjectWrapper = zzfvr.zzh(localObject);
      localObject = ((zzh)localObject).zzc();
    }
    zzfvr.zzq((zzfwb)localObject, new zzw(this, paramIObjectWrapper, paramzzbyo, paramzzbyh, localzzfff, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzA());
  }
  
  public final void zzf(zzbst paramzzbst)
  {
    this.zzm = paramzzbst;
    this.zzi.zzc(1);
  }
  
  public final void zzg(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
  {
    zzS(paramList, paramIObjectWrapper, paramzzbsk, true);
  }
  
  public final void zzh(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
  {
    zzT(paramList, paramIObjectWrapper, paramzzbsk, true);
  }
  
  public final void zzi(IObjectWrapper paramIObjectWrapper)
  {
    Object localObject = zzbbk.zziQ;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    if (Build.VERSION.SDK_INT < 21)
    {
      zzbzt.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
      return;
    }
    localObject = zzbbk.zziR;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = zzbbk.zziU;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzbbk.zzjB;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
          localObject = zzfvr.zzk(new zzu(this), zzcag.zza);
        } else {
          localObject = zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
        }
        zzfvr.zzq((zzfwb)localObject, new zzz(this), this.zzf.zzA());
      }
    }
    paramIObjectWrapper = (WebView)ObjectWrapper.unwrap(paramIObjectWrapper);
    if (paramIObjectWrapper == null)
    {
      zzbzt.zzg("The webView cannot be null.");
      return;
    }
    if (this.zzp.contains(paramIObjectWrapper))
    {
      zzbzt.zzi("This webview has already been registered.");
      return;
    }
    this.zzp.add(paramIObjectWrapper);
    paramIObjectWrapper.addJavascriptInterface(new TaggingLibraryJsInterface(paramIObjectWrapper, this.zzh, this.zzr, this.zzs), "gmaSdk");
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
  {
    Object localObject = zzbbk.zzhm;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    localObject = (MotionEvent)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramIObjectWrapper = this.zzm;
    if (paramIObjectWrapper == null) {
      paramIObjectWrapper = null;
    } else {
      paramIObjectWrapper = paramIObjectWrapper.zza;
    }
    this.zzn = zzbx.zza((MotionEvent)localObject, paramIObjectWrapper);
    if (((MotionEvent)localObject).getAction() == 0) {
      this.zzo = this.zzn;
    }
    paramIObjectWrapper = MotionEvent.obtain((MotionEvent)localObject);
    paramIObjectWrapper.setLocation(this.zzn.x, this.zzn.y);
    this.zzh.zzd(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
  }
  
  public final void zzk(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
  {
    zzS(paramList, paramIObjectWrapper, paramzzbsk, false);
  }
  
  public final void zzl(List paramList, IObjectWrapper paramIObjectWrapper, zzbsk paramzzbsk)
  {
    zzT(paramList, paramIObjectWrapper, paramzzbsk, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */