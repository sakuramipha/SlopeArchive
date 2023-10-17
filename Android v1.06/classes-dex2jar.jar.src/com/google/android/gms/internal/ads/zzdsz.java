package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdsz
  implements zzdtx, zzdsk
{
  private final zzdth zza;
  private final zzdty zzb;
  private final zzdsl zzc;
  private final zzdsu zzd;
  private final zzdsj zze;
  private final zzdtt zzf;
  private final String zzg;
  private final String zzh;
  private final Map zzi = new HashMap();
  private final Map zzj = new HashMap();
  private final Map zzk = new HashMap();
  private String zzl = "{}";
  private JSONObject zzm;
  private long zzn = Long.MAX_VALUE;
  private zzdsv zzo = zzdsv.zza;
  private boolean zzp;
  private int zzq;
  private boolean zzr;
  private zzdsy zzs = zzdsy.zza;
  
  zzdsz(zzdth paramzzdth, zzdty paramzzdty, zzdsl paramzzdsl, Context paramContext, zzbzz paramzzbzz, zzdsu paramzzdsu, zzdtt paramzzdtt)
  {
    this.zza = paramzzdth;
    this.zzb = paramzzdty;
    this.zzc = paramzzdsl;
    this.zze = new zzdsj(paramContext);
    this.zzg = paramzzbzz.zza;
    this.zzh = "afma-sdk-a-v22.2.0";
    this.zzd = paramzzdsu;
    this.zzf = paramzzdtt;
    zzt.zzs().zzg(this);
  }
  
  private final JSONObject zzq()
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator2 = this.zzi.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Iterator localIterator1 = ((List)localEntry.getValue()).iterator();
        while (localIterator1.hasNext())
        {
          zzdsn localzzdsn = (zzdsn)localIterator1.next();
          if (localzzdsn.zzg()) {
            localJSONArray.put(localzzdsn.zzd());
          }
        }
        if (localJSONArray.length() > 0) {
          localJSONObject.put((String)localEntry.getKey(), localJSONArray);
        }
      }
      return localJSONObject;
    }
    finally {}
  }
  
  private final void zzr()
  {
    this.zzr = true;
    this.zzd.zzc();
    this.zza.zzh(this);
    this.zzb.zzc(this);
    this.zzc.zzc(this);
    this.zzf.zzf(this);
    zzx(zzt.zzo().zzh().zzo());
  }
  
  private final void zzs()
  {
    zzt.zzo().zzh().zzG(zzd());
  }
  
  private final void zzt(zzdsv paramzzdsv, boolean paramBoolean)
  {
    try
    {
      zzdsv localzzdsv = this.zzo;
      if (localzzdsv == paramzzdsv) {
        return;
      }
      if (zzo()) {
        zzv();
      }
      this.zzo = paramzzdsv;
      if (zzo()) {
        zzw();
      }
      if (paramBoolean)
      {
        zzs();
        return;
      }
      return;
    }
    finally {}
  }
  
  private final void zzu(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      boolean bool = this.zzp;
      if (bool == paramBoolean1) {
        return;
      }
      this.zzp = paramBoolean1;
      if (paramBoolean1)
      {
        zzbbc localzzbbc = zzbbk.zziG;
        if ((!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) || (!zzt.zzs().zzl()))
        {
          zzw();
          break label73;
        }
      }
      if (!zzo()) {
        zzv();
      }
      label73:
      if (paramBoolean2)
      {
        zzs();
        return;
      }
      return;
    }
    finally {}
  }
  
  private final void zzv()
  {
    try
    {
      zzdsv localzzdsv = zzdsv.zza;
      int i = this.zzo.ordinal();
      if (i != 1)
      {
        if (i != 2) {
          return;
        }
        this.zzc.zza();
        return;
      }
      this.zzb.zza();
      return;
    }
    finally {}
  }
  
  private final void zzw()
  {
    try
    {
      zzdsv localzzdsv = zzdsv.zza;
      int i = this.zzo.ordinal();
      if (i != 1)
      {
        if (i != 2) {
          return;
        }
        this.zzc.zzb();
        return;
      }
      this.zzb.zzb();
      return;
    }
    finally {}
  }
  
  /* Error */
  private final void zzx(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 275	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new 118	org/json/JSONObject
    //   17: astore_3
    //   18: aload_3
    //   19: aload_1
    //   20: invokespecial 277	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   23: aload_0
    //   24: aload_3
    //   25: ldc_w 279
    //   28: iconst_0
    //   29: invokevirtual 283	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   32: iconst_0
    //   33: invokespecial 285	com/google/android/gms/internal/ads/zzdsz:zzu	(ZZ)V
    //   36: aload_0
    //   37: ldc 65
    //   39: aload_3
    //   40: ldc_w 287
    //   43: ldc_w 289
    //   46: invokevirtual 293	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: invokestatic 299	java/lang/Enum:valueOf	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //   52: checkcast 65	com/google/android/gms/internal/ads/zzdsv
    //   55: iconst_0
    //   56: invokespecial 301	com/google/android/gms/internal/ads/zzdsz:zzt	(Lcom/google/android/gms/internal/ads/zzdsv;Z)V
    //   59: aload_0
    //   60: aload_3
    //   61: ldc_w 303
    //   64: ldc 57
    //   66: invokevirtual 293	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   69: putfield 59	com/google/android/gms/internal/ads/zzdsz:zzl	Ljava/lang/String;
    //   72: aload_0
    //   73: aload_3
    //   74: ldc_w 305
    //   77: ldc2_w 60
    //   80: invokevirtual 309	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   83: putfield 63	com/google/android/gms/internal/ads/zzdsz:zzn	J
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: return
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	zzdsz
    //   0	98	1	paramString	String
    //   6	2	2	bool	boolean
    //   17	57	3	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   14	86	89	org/json/JSONException
    //   2	7	93	finally
    //   14	86	93	finally
  }
  
  public final zzdsv zza()
  {
    return this.zzo;
  }
  
  public final zzfwb zzb(String paramString)
  {
    try
    {
      zzcal localzzcal = new com/google/android/gms/internal/ads/zzcal;
      localzzcal.<init>();
      if (this.zzj.containsKey(paramString))
      {
        localzzcal.zzd((zzdsn)this.zzj.get(paramString));
      }
      else
      {
        if (!this.zzk.containsKey(paramString))
        {
          Map localMap = this.zzk;
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localMap.put(paramString, localArrayList);
        }
        ((List)this.zzk.get(paramString)).add(localzzcal);
      }
      return localzzcal;
    }
    finally {}
  }
  
  public final String zzc()
  {
    try
    {
      Object localObject1 = zzbbk.zzir;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) && (zzo()))
      {
        if (this.zzn < zzt.zzB().currentTimeMillis() / 1000L)
        {
          this.zzl = "{}";
          this.zzn = Long.MAX_VALUE;
          return "";
        }
        if (this.zzl.equals("{}")) {
          return "";
        }
        localObject1 = this.zzl;
        return (String)localObject1;
      }
      return "";
    }
    finally {}
  }
  
  /* Error */
  public final String zzd()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 118	org/json/JSONObject
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 119	org/json/JSONObject:<init>	()V
    //   10: aload_2
    //   11: ldc_w 279
    //   14: aload_0
    //   15: getfield 237	com/google/android/gms/internal/ads/zzdsz:zzp	Z
    //   18: invokevirtual 356	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   21: pop
    //   22: aload_2
    //   23: ldc_w 287
    //   26: aload_0
    //   27: getfield 69	com/google/android/gms/internal/ads/zzdsz:zzo	Lcom/google/android/gms/internal/ads/zzdsv;
    //   30: invokevirtual 174	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   33: pop
    //   34: aload_0
    //   35: getfield 63	com/google/android/gms/internal/ads/zzdsz:zzn	J
    //   38: invokestatic 340	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   41: invokeinterface 346 1 0
    //   46: ldc2_w 347
    //   49: ldiv
    //   50: lcmp
    //   51: ifle +27 -> 78
    //   54: aload_2
    //   55: ldc_w 303
    //   58: aload_0
    //   59: getfield 59	com/google/android/gms/internal/ads/zzdsz:zzl	Ljava/lang/String;
    //   62: invokevirtual 174	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   65: pop
    //   66: aload_2
    //   67: ldc_w 305
    //   70: aload_0
    //   71: getfield 63	com/google/android/gms/internal/ads/zzdsz:zzn	J
    //   74: invokevirtual 359	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   77: pop
    //   78: aload_2
    //   79: invokevirtual 362	org/json/JSONObject:toString	()Ljava/lang/String;
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: areturn
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    //   92: astore_1
    //   93: goto -15 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	zzdsz
    //   82	4	1	str	String
    //   87	4	1	localObject	Object
    //   92	1	1	localJSONException	JSONException
    //   5	74	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   2	10	87	finally
    //   10	78	87	finally
    //   78	83	87	finally
    //   10	78	92	org/json/JSONException
  }
  
  public final JSONObject zze()
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      try
      {
        localJSONObject.put("platform", "ANDROID");
        localJSONObject.put("sdkVersion", this.zzh);
        localJSONObject.put("internalSdkVersion", this.zzg);
        localJSONObject.put("osVersion", Build.VERSION.RELEASE);
        localJSONObject.put("adapters", this.zzd.zza());
        Object localObject2 = zzbbk.zziP;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
        {
          localObject2 = zzt.zzo().zzm();
          if (!TextUtils.isEmpty((CharSequence)localObject2)) {
            localJSONObject.put("plugin", localObject2);
          }
        }
        if (this.zzn < zzt.zzB().currentTimeMillis() / 1000L) {
          this.zzl = "{}";
        }
        localJSONObject.put("networkExtras", this.zzl);
        localJSONObject.put("adSlots", zzq());
        localJSONObject.put("appInfo", this.zze.zza());
        localObject2 = zzt.zzo().zzh().zzh().zzc();
        Object localObject3;
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          localObject3 = new org/json/JSONObject;
          ((JSONObject)localObject3).<init>((String)localObject2);
          localJSONObject.put("cld", localObject3);
        }
        localObject2 = zzbbk.zziH;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
        {
          localObject2 = this.zzm;
          if (localObject2 != null)
          {
            localObject2 = localObject2.toString();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Server data: ");
            ((StringBuilder)localObject3).append((String)localObject2);
            zzbzt.zze(((StringBuilder)localObject3).toString());
            localJSONObject.put("serverData", this.zzm);
          }
        }
        localObject2 = zzbbk.zziG;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
        {
          localJSONObject.put("openAction", this.zzs);
          localJSONObject.put("gesture", this.zzo);
        }
      }
      catch (JSONException localJSONException)
      {
        zzt.zzo().zzt(localJSONException, "Inspector.toJson");
        zzbzt.zzk("Ad inspector encountered an error", localJSONException);
      }
      return localJSONObject;
    }
    finally {}
  }
  
  public final void zzf(String paramString, zzdsn paramzzdsn)
  {
    try
    {
      Object localObject = zzbbk.zzir;
      if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (zzo()))
      {
        int i = this.zzq;
        localObject = zzbbk.zzit;
        if (i >= ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue())
        {
          zzbzt.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
          return;
        }
        if (!this.zzi.containsKey(paramString))
        {
          Map localMap = this.zzi;
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          localMap.put(paramString, localObject);
        }
        this.zzq += 1;
        ((List)this.zzi.get(paramString)).add(paramzzdsn);
        paramString = zzbbk.zziN;
        boolean bool = ((Boolean)zzba.zzc().zzb(paramString)).booleanValue();
        if (!bool) {
          return;
        }
        paramString = paramzzdsn.zzc();
        this.zzj.put(paramString, paramzzdsn);
        if (this.zzk.containsKey(paramString))
        {
          localObject = (List)this.zzk.get(paramString);
          paramString = ((List)localObject).iterator();
          while (paramString.hasNext()) {
            ((zzcal)paramString.next()).zzd(paramzzdsn);
          }
          ((List)localObject).clear();
          return;
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzg()
  {
    Object localObject = zzbbk.zzir;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    localObject = zzbbk.zziG;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) && (zzt.zzo().zzh().zzO()))
    {
      zzr();
      return;
    }
    localObject = zzt.zzo().zzh().zzo();
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      if (localJSONObject.optBoolean("isTestMode", false)) {
        zzr();
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final void zzh(zzda paramzzda, zzdsy paramzzdsy)
  {
    try
    {
      boolean bool = zzo();
      if (!bool) {
        try
        {
          paramzzda.zze(zzfba.zzd(18, null, null));
          return;
        }
        catch (RemoteException paramzzda)
        {
          zzbzt.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
          return;
        }
      }
      Object localObject = zzbbk.zzir;
      bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue();
      if (!bool) {
        try
        {
          paramzzda.zze(zzfba.zzd(1, null, null));
          return;
        }
        catch (RemoteException paramzzda)
        {
          zzbzt.zzj("Ad inspector had an internal error.");
          return;
        }
      }
      this.zzs = paramzzdsy;
      zzdth localzzdth = this.zza;
      localObject = new com/google/android/gms/internal/ads/zzbja;
      ((zzbja)localObject).<init>(this);
      paramzzdsy = new com/google/android/gms/internal/ads/zzbit;
      paramzzdsy.<init>(this.zzf);
      localzzdth.zzj(paramzzda, (zzbja)localObject, paramzzdsy);
      return;
    }
    finally {}
  }
  
  public final void zzi(String paramString, long paramLong)
  {
    try
    {
      this.zzl = paramString;
      this.zzn = paramLong;
      zzs();
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzj(boolean paramBoolean)
  {
    if (!this.zzr)
    {
      if (!paramBoolean) {
        break label37;
      }
      zzr();
    }
    else
    {
      if (!paramBoolean) {
        break label37;
      }
    }
    if (!this.zzp)
    {
      zzw();
      return;
    }
    label37:
    if (!zzo()) {
      zzv();
    }
  }
  
  public final void zzk(zzdsv paramzzdsv)
  {
    zzt(paramzzdsv, true);
  }
  
  public final void zzl(JSONObject paramJSONObject)
  {
    try
    {
      this.zzm = paramJSONObject;
      return;
    }
    finally
    {
      paramJSONObject = finally;
      throw paramJSONObject;
    }
  }
  
  public final void zzm(boolean paramBoolean)
  {
    if ((!this.zzr) && (paramBoolean)) {
      zzr();
    }
    zzu(paramBoolean, true);
  }
  
  public final boolean zzn()
  {
    return this.zzm != null;
  }
  
  public final boolean zzo()
  {
    try
    {
      zzbbc localzzbbc = zzbbk.zziG;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        if (!this.zzp)
        {
          bool = zzt.zzs().zzl();
          if (bool) {}
        }
        for (bool = false;; bool = true) {
          return bool;
        }
      }
      boolean bool = this.zzp;
      return bool;
    }
    finally {}
  }
  
  public final boolean zzp()
  {
    try
    {
      boolean bool = this.zzp;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */