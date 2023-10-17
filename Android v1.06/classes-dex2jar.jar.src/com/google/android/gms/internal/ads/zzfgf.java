package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzfgf
{
  private final zzefk zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final Context zze;
  private final zzezs zzf;
  private final zzezt zzg;
  private final Clock zzh;
  private final zzaqq zzi;
  
  public zzfgf(zzefk paramzzefk, zzbzz paramzzbzz, String paramString1, String paramString2, Context paramContext, zzezs paramzzezs, zzezt paramzzezt, Clock paramClock, zzaqq paramzzaqq)
  {
    this.zza = paramzzefk;
    this.zzb = paramzzbzz.zza;
    this.zzc = paramString1;
    this.zzd = paramString2;
    this.zze = paramContext;
    this.zzf = paramzzezs;
    this.zzg = paramzzezt;
    this.zzh = paramClock;
    this.zzi = paramzzaqq;
  }
  
  public static final List zzf(int paramInt1, int paramInt2, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("2.");
      localStringBuilder.append(paramInt2);
      localArrayList.add(zzi(str, "@gw_mpe@", localStringBuilder.toString()));
    }
    return localArrayList;
  }
  
  public static final List zzg(List paramList, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(zzi((String)paramList.next(), "@gw_adnetstatus@", paramString));
    }
    return localArrayList;
  }
  
  private static String zzh(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    if (zzbzs.zzk()) {
      paramString = "fakeForAdDebugLog";
    }
    return paramString;
  }
  
  private static String zzi(String paramString1, String paramString2, String paramString3)
  {
    String str = paramString3;
    if (true == TextUtils.isEmpty(paramString3)) {
      str = "";
    }
    return paramString1.replaceAll(paramString2, str);
  }
  
  public final List zzc(zzezr paramzzezr, zzezf paramzzezf, List paramList)
  {
    return zzd(paramzzezr, paramzzezf, false, "", "", paramList);
  }
  
  public final List zzd(zzezr paramzzezr, zzezf paramzzezf, boolean paramBoolean, String paramString1, String paramString2, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      int i = 1;
      if (true != paramBoolean) {
        paramList = "0";
      } else {
        paramList = "1";
      }
      Object localObject = zzi(zzi(zzi((String)localIterator.next(), "@gw_adlocid@", paramzzezr.zza.zza.zzf), "@gw_adnetrefresh@", paramList), "@gw_sdkver@", this.zzb);
      paramList = (List)localObject;
      if (paramzzezf != null) {
        paramList = zzbya.zzc(zzi(zzi(zzi((String)localObject, "@gw_qdata@", paramzzezf.zzz), "@gw_adnetid@", paramzzezf.zzy), "@gw_allocid@", paramzzezf.zzx), this.zze, paramzzezf.zzX);
      }
      localObject = zzi(zzi(zzi(paramList, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
      paramList = zzbbk.zzdg;
      boolean bool3 = ((Boolean)zzba.zzc().zzb(paramList)).booleanValue();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (!TextUtils.isEmpty(paramString1)) {
          bool1 = true;
        }
      }
      bool2 = TextUtils.isEmpty(paramString2) ^ true;
      if (!bool1)
      {
        paramList = (List)localObject;
        if (!bool2) {
          break label335;
        }
      }
      else
      {
        i = bool2;
      }
      Uri localUri = Uri.parse((String)localObject);
      paramList = (List)localObject;
      if (this.zzi.zzf(localUri))
      {
        localObject = Uri.parse((String)localObject).buildUpon();
        paramList = (List)localObject;
        if (bool1) {
          paramList = ((Uri.Builder)localObject).appendQueryParameter("ms", paramString1);
        }
        localObject = paramList;
        if (i != 0) {
          localObject = paramList.appendQueryParameter("attok", paramString2);
        }
        paramList = ((Uri.Builder)localObject).build().toString();
      }
      label335:
      localArrayList.add(paramList);
    }
    return localArrayList;
  }
  
  public final List zze(zzezf paramzzezf, List paramList, zzbuw paramzzbuw)
  {
    ArrayList localArrayList = new ArrayList();
    long l = this.zzh.currentTimeMillis();
    try
    {
      String str1 = paramzzbuw.zzc();
      String str2 = Integer.toString(paramzzbuw.zzb());
      paramzzbuw = zzbbk.zzdh;
      if (((Boolean)zzba.zzc().zzb(paramzzbuw)).booleanValue())
      {
        paramzzbuw = this.zzg;
        if (paramzzbuw == null)
        {
          paramzzbuw = zzfov.zzc();
          break label93;
        }
        paramzzbuw = paramzzbuw.zza;
      }
      else
      {
        paramzzbuw = this.zzf;
      }
      paramzzbuw = zzfov.zzd(paramzzbuw);
      label93:
      String str3 = (String)paramzzbuw.zza(zzfgd.zza).zzb("");
      paramzzbuw = (String)paramzzbuw.zza(zzfge.zza).zzb("");
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(zzbya.zzc(zzi(zzi(zzi(zzi(zzi(zzi((String)paramList.next(), "@gw_rwd_userid@", Uri.encode(str3)), "@gw_rwd_custom_data@", Uri.encode(paramzzbuw)), "@gw_tmstmp@", Long.toString(l)), "@gw_rwd_itm@", Uri.encode(str1)), "@gw_rwd_amt@", str2), "@gw_sdkver@", this.zzb), this.zze, paramzzezf.zzX));
      }
      return localArrayList;
    }
    catch (RemoteException paramzzezf)
    {
      zzbzt.zzh("Unable to determine award type and amount.", paramzzezf);
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */