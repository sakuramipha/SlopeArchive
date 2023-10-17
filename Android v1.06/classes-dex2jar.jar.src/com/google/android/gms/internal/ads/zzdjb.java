package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdjb
  implements zzdhk
{
  private final zzbon zza;
  private final zzcwa zzb;
  private final zzcvg zzc;
  private final zzdcu zzd;
  private final Context zze;
  private final zzezf zzf;
  private final zzbzz zzg;
  private final zzfaa zzh;
  private boolean zzi = false;
  private boolean zzj = false;
  private boolean zzk = true;
  private final zzboj zzl;
  private final zzbok zzm;
  
  public zzdjb(zzboj paramzzboj, zzbok paramzzbok, zzbon paramzzbon, zzcwa paramzzcwa, zzcvg paramzzcvg, zzdcu paramzzdcu, Context paramContext, zzezf paramzzezf, zzbzz paramzzbzz, zzfaa paramzzfaa)
  {
    this.zzl = paramzzboj;
    this.zzm = paramzzbok;
    this.zza = paramzzbon;
    this.zzb = paramzzcwa;
    this.zzc = paramzzcvg;
    this.zzd = paramzzdcu;
    this.zze = paramContext;
    this.zzf = paramzzezf;
    this.zzg = paramzzbzz;
    this.zzh = paramzzfaa;
  }
  
  private final void zzb(View paramView)
  {
    try
    {
      Object localObject = this.zza;
      if ((localObject != null) && (!((zzbon)localObject).zzA()))
      {
        this.zza.zzw(ObjectWrapper.wrap(paramView));
        this.zzc.onAdClicked();
        paramView = zzbbk.zzjp;
        if (((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) {
          this.zzd.zzr();
        }
      }
      else
      {
        localObject = this.zzl;
        if ((localObject != null) && (!((zzboj)localObject).zzx()))
        {
          this.zzl.zzs(ObjectWrapper.wrap(paramView));
          this.zzc.onAdClicked();
          paramView = zzbbk.zzjp;
          if (((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) {
            this.zzd.zzr();
          }
        }
        else
        {
          localObject = this.zzm;
          if ((localObject != null) && (!((zzbok)localObject).zzv()))
          {
            this.zzm.zzq(ObjectWrapper.wrap(paramView));
            this.zzc.onAdClicked();
            paramView = zzbbk.zzjp;
            if (((Boolean)zzba.zzc().zzb(paramView)).booleanValue()) {
              this.zzd.zzr();
            }
          }
        }
      }
      return;
    }
    catch (RemoteException paramView)
    {
      zzbzt.zzk("Failed to call handleClick", paramView);
    }
  }
  
  private static final HashMap zzc(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    if (paramMap == null) {
      return localHashMap;
    }
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView != null) {
          localHashMap.put((String)localEntry.getKey(), localView);
        }
      }
      return localHashMap;
    }
    finally {}
  }
  
  public final boolean zzA()
  {
    return true;
  }
  
  public final boolean zzB()
  {
    return this.zzf.zzM;
  }
  
  public final boolean zzC(Bundle paramBundle)
  {
    return false;
  }
  
  public final int zza()
  {
    return 0;
  }
  
  public final JSONObject zze(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    return null;
  }
  
  public final JSONObject zzf(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    return null;
  }
  
  public final void zzg()
  {
    throw null;
  }
  
  public final void zzh() {}
  
  public final void zzi() {}
  
  public final void zzj(zzcw paramzzcw)
  {
    zzbzt.zzj("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void zzk(View paramView1, View paramView2, Map paramMap1, Map paramMap2, boolean paramBoolean, ImageView.ScaleType paramScaleType)
  {
    if ((this.zzj) && (this.zzf.zzM)) {
      return;
    }
    zzb(paramView1);
  }
  
  public final void zzl(String paramString) {}
  
  public final void zzm(Bundle paramBundle) {}
  
  public final void zzo(View paramView1, View paramView2, Map paramMap1, Map paramMap2, boolean paramBoolean, ImageView.ScaleType paramScaleType, int paramInt)
  {
    if (!this.zzj)
    {
      zzbzt.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
      return;
    }
    if (!this.zzf.zzM)
    {
      zzbzt.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
      return;
    }
    zzb(paramView2);
  }
  
  public final void zzp() {}
  
  public final void zzq(View paramView, Map paramMap1, Map paramMap2, ImageView.ScaleType paramScaleType)
  {
    try
    {
      if (!this.zzi) {
        this.zzi = zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
      }
      if (!this.zzk) {
        return;
      }
      paramView = this.zza;
      if ((paramView != null) && (!paramView.zzB()))
      {
        this.zza.zzx();
        this.zzb.zza();
        return;
      }
      paramView = this.zzl;
      if ((paramView != null) && (!paramView.zzy()))
      {
        this.zzl.zzt();
        this.zzb.zza();
        return;
      }
      paramView = this.zzm;
      if ((paramView != null) && (!paramView.zzw()))
      {
        this.zzm.zzr();
        this.zzb.zza();
      }
      return;
    }
    catch (RemoteException paramView)
    {
      zzbzt.zzk("Failed to call recordImpression", paramView);
    }
  }
  
  public final void zzr() {}
  
  public final void zzs(View paramView1, MotionEvent paramMotionEvent, View paramView2) {}
  
  public final void zzt(Bundle paramBundle) {}
  
  public final void zzu(View paramView) {}
  
  public final void zzv()
  {
    this.zzj = true;
  }
  
  public final void zzw(zzcs paramzzcs)
  {
    zzbzt.zzj("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void zzx(zzbgk paramzzbgk) {}
  
  /* Error */
  public final void zzy(View paramView, Map paramMap1, Map paramMap2, android.view.View.OnTouchListener paramOnTouchListener, android.view.View.OnClickListener paramOnClickListener)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   4: astore 9
    //   6: aload_0
    //   7: getfield 58	com/google/android/gms/internal/ads/zzdjb:zzf	Lcom/google/android/gms/internal/ads/zzezf;
    //   10: getfield 271	com/google/android/gms/internal/ads/zzezf:zzak	Lorg/json/JSONObject;
    //   13: astore 10
    //   15: getstatic 274	com/google/android/gms/internal/ads/zzbbk:zzbt	Lcom/google/android/gms/internal/ads/zzbbc;
    //   18: astore_1
    //   19: invokestatic 98	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   22: aload_1
    //   23: invokevirtual 103	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   26: checkcast 105	java/lang/Boolean
    //   29: invokevirtual 108	java/lang/Boolean:booleanValue	()Z
    //   32: istore 8
    //   34: iconst_1
    //   35: istore 7
    //   37: iload 7
    //   39: istore 6
    //   41: iload 8
    //   43: ifeq +387 -> 430
    //   46: aload 10
    //   48: invokevirtual 277	org/json/JSONObject:length	()I
    //   51: ifne +10 -> 61
    //   54: iload 7
    //   56: istore 6
    //   58: goto +372 -> 430
    //   61: aload_2
    //   62: ifnonnull +14 -> 76
    //   65: new 139	java/util/HashMap
    //   68: astore_1
    //   69: aload_1
    //   70: invokespecial 140	java/util/HashMap:<init>	()V
    //   73: goto +5 -> 78
    //   76: aload_2
    //   77: astore_1
    //   78: aload_3
    //   79: ifnonnull +16 -> 95
    //   82: new 139	java/util/HashMap
    //   85: astore 4
    //   87: aload 4
    //   89: invokespecial 140	java/util/HashMap:<init>	()V
    //   92: goto +6 -> 98
    //   95: aload_3
    //   96: astore 4
    //   98: new 139	java/util/HashMap
    //   101: astore 11
    //   103: aload 11
    //   105: invokespecial 140	java/util/HashMap:<init>	()V
    //   108: aload 11
    //   110: aload_1
    //   111: invokeinterface 281 2 0
    //   116: aload 11
    //   118: aload 4
    //   120: invokeinterface 281 2 0
    //   125: aload 10
    //   127: invokevirtual 284	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   130: astore 12
    //   132: iload 7
    //   134: istore 6
    //   136: aload 12
    //   138: invokeinterface 157 1 0
    //   143: ifeq +287 -> 430
    //   146: aload 12
    //   148: invokeinterface 161 1 0
    //   153: checkcast 178	java/lang/String
    //   156: astore 5
    //   158: aload 10
    //   160: aload 5
    //   162: invokevirtual 288	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   165: astore 13
    //   167: aload 13
    //   169: ifnull -37 -> 132
    //   172: aload 11
    //   174: aload 5
    //   176: invokeinterface 291 2 0
    //   181: checkcast 168	java/lang/ref/WeakReference
    //   184: astore_1
    //   185: aload_1
    //   186: ifnonnull +9 -> 195
    //   189: iconst_0
    //   190: istore 6
    //   192: goto +238 -> 430
    //   195: aload_1
    //   196: invokevirtual 171	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   199: astore_1
    //   200: aload_1
    //   201: ifnonnull +6 -> 207
    //   204: goto -15 -> 189
    //   207: aload_1
    //   208: invokevirtual 295	java/lang/Object:getClass	()Ljava/lang/Class;
    //   211: astore 4
    //   213: getstatic 298	com/google/android/gms/internal/ads/zzbbk:zzbu	Lcom/google/android/gms/internal/ads/zzbbc;
    //   216: astore 14
    //   218: aload 4
    //   220: astore_1
    //   221: invokestatic 98	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   224: aload 14
    //   226: invokevirtual 103	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   229: checkcast 105	java/lang/Boolean
    //   232: invokevirtual 108	java/lang/Boolean:booleanValue	()Z
    //   235: ifeq +111 -> 346
    //   238: aload 4
    //   240: astore_1
    //   241: aload 5
    //   243: ldc_w 300
    //   246: invokevirtual 304	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   249: ifeq +97 -> 346
    //   252: aload_0
    //   253: getfield 48	com/google/android/gms/internal/ads/zzdjb:zza	Lcom/google/android/gms/internal/ads/zzbon;
    //   256: astore_1
    //   257: aconst_null
    //   258: astore 5
    //   260: aload_1
    //   261: ifnull +21 -> 282
    //   264: aload_1
    //   265: invokeinterface 307 1 0
    //   270: astore_1
    //   271: goto +47 -> 318
    //   274: astore_1
    //   275: aload 5
    //   277: astore 4
    //   279: goto +53 -> 332
    //   282: aload_0
    //   283: getfield 44	com/google/android/gms/internal/ads/zzdjb:zzl	Lcom/google/android/gms/internal/ads/zzboj;
    //   286: astore_1
    //   287: aload_1
    //   288: ifnull +11 -> 299
    //   291: aload_1
    //   292: invokevirtual 309	com/google/android/gms/internal/ads/zzboj:zzk	()Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   295: astore_1
    //   296: goto +22 -> 318
    //   299: aload_0
    //   300: getfield 46	com/google/android/gms/internal/ads/zzdjb:zzm	Lcom/google/android/gms/internal/ads/zzbok;
    //   303: astore_1
    //   304: aload_1
    //   305: ifnull +11 -> 316
    //   308: aload_1
    //   309: invokevirtual 311	com/google/android/gms/internal/ads/zzbok:zzj	()Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   312: astore_1
    //   313: goto +5 -> 318
    //   316: aconst_null
    //   317: astore_1
    //   318: aload 5
    //   320: astore 4
    //   322: aload_1
    //   323: ifnull +9 -> 332
    //   326: aload_1
    //   327: invokestatic 315	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   330: astore 4
    //   332: aload 4
    //   334: ifnonnull +6 -> 340
    //   337: goto -148 -> 189
    //   340: aload 4
    //   342: invokevirtual 295	java/lang/Object:getClass	()Ljava/lang/Class;
    //   345: astore_1
    //   346: new 317	java/util/ArrayList
    //   349: astore 5
    //   351: aload 5
    //   353: invokespecial 318	java/util/ArrayList:<init>	()V
    //   356: aload 13
    //   358: aload 5
    //   360: invokestatic 323	com/google/android/gms/ads/internal/util/zzbu:zzc	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   363: pop
    //   364: invokestatic 326	com/google/android/gms/ads/internal/zzt:zzp	()Lcom/google/android/gms/ads/internal/util/zzs;
    //   367: pop
    //   368: aload_0
    //   369: getfield 56	com/google/android/gms/internal/ads/zzdjb:zze	Landroid/content/Context;
    //   372: invokevirtual 332	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   375: astore 4
    //   377: aload 5
    //   379: invokeinterface 335 1 0
    //   384: astore 5
    //   386: aload 5
    //   388: invokeinterface 157 1 0
    //   393: ifeq -204 -> 189
    //   396: aload 5
    //   398: invokeinterface 161 1 0
    //   403: checkcast 178	java/lang/String
    //   406: astore 13
    //   408: aload 13
    //   410: iconst_0
    //   411: aload 4
    //   413: invokestatic 341	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   416: aload_1
    //   417: invokevirtual 345	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   420: istore 6
    //   422: iload 6
    //   424: ifeq -38 -> 386
    //   427: goto -295 -> 132
    //   430: aload_0
    //   431: iload 6
    //   433: putfield 42	com/google/android/gms/internal/ads/zzdjb:zzk	Z
    //   436: aload_2
    //   437: invokestatic 347	com/google/android/gms/internal/ads/zzdjb:zzc	(Ljava/util/Map;)Ljava/util/HashMap;
    //   440: astore_1
    //   441: aload_3
    //   442: invokestatic 347	com/google/android/gms/internal/ads/zzdjb:zzc	(Ljava/util/Map;)Ljava/util/HashMap;
    //   445: astore_2
    //   446: aload_0
    //   447: getfield 48	com/google/android/gms/internal/ads/zzdjb:zza	Lcom/google/android/gms/internal/ads/zzbon;
    //   450: astore_3
    //   451: aload_3
    //   452: ifnull +20 -> 472
    //   455: aload_3
    //   456: aload 9
    //   458: aload_1
    //   459: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   462: aload_2
    //   463: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   466: invokeinterface 350 4 0
    //   471: return
    //   472: aload_0
    //   473: getfield 44	com/google/android/gms/internal/ads/zzdjb:zzl	Lcom/google/android/gms/internal/ads/zzboj;
    //   476: astore_3
    //   477: aload_3
    //   478: ifnull +27 -> 505
    //   481: aload_3
    //   482: aload 9
    //   484: aload_1
    //   485: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   488: aload_2
    //   489: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   492: invokevirtual 352	com/google/android/gms/internal/ads/zzboj:zzv	(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    //   495: aload_0
    //   496: getfield 44	com/google/android/gms/internal/ads/zzdjb:zzl	Lcom/google/android/gms/internal/ads/zzboj;
    //   499: aload 9
    //   501: invokevirtual 354	com/google/android/gms/internal/ads/zzboj:zzu	(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    //   504: return
    //   505: aload_0
    //   506: getfield 46	com/google/android/gms/internal/ads/zzdjb:zzm	Lcom/google/android/gms/internal/ads/zzbok;
    //   509: astore_3
    //   510: aload_3
    //   511: ifnull +26 -> 537
    //   514: aload_3
    //   515: aload 9
    //   517: aload_1
    //   518: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   521: aload_2
    //   522: invokestatic 78	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   525: invokevirtual 356	com/google/android/gms/internal/ads/zzbok:zzt	(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    //   528: aload_0
    //   529: getfield 46	com/google/android/gms/internal/ads/zzdjb:zzm	Lcom/google/android/gms/internal/ads/zzbok;
    //   532: aload 9
    //   534: invokevirtual 357	com/google/android/gms/internal/ads/zzbok:zzs	(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    //   537: return
    //   538: astore_1
    //   539: ldc_w 359
    //   542: aload_1
    //   543: invokestatic 136	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   546: return
    //   547: astore_1
    //   548: goto -416 -> 132
    //   551: astore 13
    //   553: goto -167 -> 386
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	556	0	this	zzdjb
    //   0	556	1	paramView	View
    //   0	556	2	paramMap1	Map
    //   0	556	3	paramMap2	Map
    //   0	556	4	paramOnTouchListener	android.view.View.OnTouchListener
    //   0	556	5	paramOnClickListener	android.view.View.OnClickListener
    //   39	393	6	bool1	boolean
    //   35	98	7	bool2	boolean
    //   32	10	8	bool3	boolean
    //   4	529	9	localIObjectWrapper	com.google.android.gms.dynamic.IObjectWrapper
    //   13	146	10	localJSONObject	JSONObject
    //   101	72	11	localHashMap	HashMap
    //   130	17	12	localIterator	Iterator
    //   165	244	13	localObject1	Object
    //   551	1	13	localObject2	Object
    //   216	9	14	localzzbbc	zzbbc
    // Exception table:
    //   from	to	target	type
    //   264	271	274	android/os/RemoteException
    //   291	296	274	android/os/RemoteException
    //   308	313	274	android/os/RemoteException
    //   326	332	274	java/lang/IllegalArgumentException
    //   0	34	538	android/os/RemoteException
    //   46	54	538	android/os/RemoteException
    //   65	73	538	android/os/RemoteException
    //   82	92	538	android/os/RemoteException
    //   98	132	538	android/os/RemoteException
    //   136	167	538	android/os/RemoteException
    //   172	185	538	android/os/RemoteException
    //   195	200	538	android/os/RemoteException
    //   207	218	538	android/os/RemoteException
    //   221	238	538	android/os/RemoteException
    //   241	257	538	android/os/RemoteException
    //   282	287	538	android/os/RemoteException
    //   299	304	538	android/os/RemoteException
    //   326	332	538	android/os/RemoteException
    //   340	346	538	android/os/RemoteException
    //   346	386	538	android/os/RemoteException
    //   386	408	538	android/os/RemoteException
    //   430	451	538	android/os/RemoteException
    //   455	471	538	android/os/RemoteException
    //   472	477	538	android/os/RemoteException
    //   481	504	538	android/os/RemoteException
    //   505	510	538	android/os/RemoteException
    //   514	537	538	android/os/RemoteException
    //   346	386	547	org/json/JSONException
    //   386	408	547	org/json/JSONException
    //   408	422	551	finally
  }
  
  public final void zzz(View paramView, Map paramMap)
  {
    try
    {
      paramView = ObjectWrapper.wrap(paramView);
      paramMap = this.zza;
      if (paramMap != null)
      {
        paramMap.zzz(paramView);
        return;
      }
      paramMap = this.zzl;
      if (paramMap != null)
      {
        paramMap.zzw(paramView);
        return;
      }
      paramMap = this.zzm;
      if (paramMap != null) {
        paramMap.zzu(paramView);
      }
      return;
    }
    catch (RemoteException paramView)
    {
      zzbzt.zzk("Failed to call untrackView", paramView);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */