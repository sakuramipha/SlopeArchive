package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdhc
{
  private int zza;
  private zzdq zzb;
  private zzbei zzc;
  private View zzd;
  private List zze;
  private List zzf = Collections.emptyList();
  private zzel zzg;
  private Bundle zzh;
  private zzcfb zzi;
  private zzcfb zzj;
  private zzcfb zzk;
  private zzfgo zzl;
  private View zzm;
  private zzfwb zzn;
  private View zzo;
  private IObjectWrapper zzp;
  private double zzq;
  private zzbeq zzr;
  private zzbeq zzs;
  private String zzt;
  private final SimpleArrayMap zzu = new SimpleArrayMap();
  private final SimpleArrayMap zzv = new SimpleArrayMap();
  private float zzw;
  private String zzx;
  
  public static zzdhc zzae(zzboj paramzzboj)
  {
    try
    {
      zzdhb localzzdhb = zzai(paramzzboj.zzg(), null);
      zzbei localzzbei = paramzzboj.zzh();
      View localView2 = (View)zzak(paramzzboj.zzj());
      String str4 = paramzzboj.zzo();
      List localList = paramzzboj.zzr();
      String str3 = paramzzboj.zzm();
      Bundle localBundle = paramzzboj.zzf();
      String str1 = paramzzboj.zzn();
      View localView1 = (View)zzak(paramzzboj.zzk());
      IObjectWrapper localIObjectWrapper = paramzzboj.zzl();
      String str2 = paramzzboj.zzq();
      String str5 = paramzzboj.zzp();
      double d = paramzzboj.zze();
      zzbeq localzzbeq = paramzzboj.zzi();
      paramzzboj = new com/google/android/gms/internal/ads/zzdhc;
      paramzzboj.<init>();
      paramzzboj.zza = 2;
      paramzzboj.zzb = localzzdhb;
      paramzzboj.zzc = localzzbei;
      paramzzboj.zzd = localView2;
      paramzzboj.zzX("headline", str4);
      paramzzboj.zze = localList;
      paramzzboj.zzX("body", str3);
      paramzzboj.zzh = localBundle;
      paramzzboj.zzX("call_to_action", str1);
      paramzzboj.zzm = localView1;
      paramzzboj.zzp = localIObjectWrapper;
      paramzzboj.zzX("store", str2);
      paramzzboj.zzX("price", str5);
      paramzzboj.zzq = d;
      paramzzboj.zzr = localzzbeq;
      return paramzzboj;
    }
    catch (RemoteException paramzzboj)
    {
      zzbzt.zzk("Failed to get native ad from app install ad mapper", paramzzboj);
    }
    return null;
  }
  
  public static zzdhc zzaf(zzbok paramzzbok)
  {
    try
    {
      zzdhb localzzdhb = zzai(paramzzbok.zzf(), null);
      zzbei localzzbei = paramzzbok.zzg();
      View localView1 = (View)zzak(paramzzbok.zzi());
      String str2 = paramzzbok.zzo();
      List localList = paramzzbok.zzp();
      String str3 = paramzzbok.zzm();
      Bundle localBundle = paramzzbok.zze();
      String str1 = paramzzbok.zzn();
      View localView2 = (View)zzak(paramzzbok.zzj());
      IObjectWrapper localIObjectWrapper = paramzzbok.zzk();
      String str4 = paramzzbok.zzl();
      paramzzbok = paramzzbok.zzh();
      zzdhc localzzdhc = new com/google/android/gms/internal/ads/zzdhc;
      localzzdhc.<init>();
      localzzdhc.zza = 1;
      localzzdhc.zzb = localzzdhb;
      localzzdhc.zzc = localzzbei;
      localzzdhc.zzd = localView1;
      localzzdhc.zzX("headline", str2);
      localzzdhc.zze = localList;
      localzzdhc.zzX("body", str3);
      localzzdhc.zzh = localBundle;
      localzzdhc.zzX("call_to_action", str1);
      localzzdhc.zzm = localView2;
      localzzdhc.zzp = localIObjectWrapper;
      localzzdhc.zzX("advertiser", str4);
      localzzdhc.zzs = paramzzbok;
      return localzzdhc;
    }
    catch (RemoteException paramzzbok)
    {
      zzbzt.zzk("Failed to get native ad from content ad mapper", paramzzbok);
    }
    return null;
  }
  
  public static zzdhc zzag(zzboj paramzzboj)
  {
    try
    {
      paramzzboj = zzaj(zzai(paramzzboj.zzg(), null), paramzzboj.zzh(), (View)zzak(paramzzboj.zzj()), paramzzboj.zzo(), paramzzboj.zzr(), paramzzboj.zzm(), paramzzboj.zzf(), paramzzboj.zzn(), (View)zzak(paramzzboj.zzk()), paramzzboj.zzl(), paramzzboj.zzq(), paramzzboj.zzp(), paramzzboj.zze(), paramzzboj.zzi(), null, 0.0F);
      return paramzzboj;
    }
    catch (RemoteException paramzzboj)
    {
      zzbzt.zzk("Failed to get native ad assets from app install ad mapper", paramzzboj);
    }
    return null;
  }
  
  public static zzdhc zzah(zzbok paramzzbok)
  {
    try
    {
      paramzzbok = zzaj(zzai(paramzzbok.zzf(), null), paramzzbok.zzg(), (View)zzak(paramzzbok.zzi()), paramzzbok.zzo(), paramzzbok.zzp(), paramzzbok.zzm(), paramzzbok.zze(), paramzzbok.zzn(), (View)zzak(paramzzbok.zzj()), paramzzbok.zzk(), null, null, -1.0D, paramzzbok.zzh(), paramzzbok.zzl(), 0.0F);
      return paramzzbok;
    }
    catch (RemoteException paramzzbok)
    {
      zzbzt.zzk("Failed to get native ad assets from content ad mapper", paramzzbok);
    }
    return null;
  }
  
  private static zzdhb zzai(zzdq paramzzdq, zzbon paramzzbon)
  {
    if (paramzzdq == null) {
      return null;
    }
    return new zzdhb(paramzzdq, paramzzbon);
  }
  
  private static zzdhc zzaj(zzdq paramzzdq, zzbei paramzzbei, View paramView1, String paramString1, List paramList, String paramString2, Bundle paramBundle, String paramString3, View paramView2, IObjectWrapper paramIObjectWrapper, String paramString4, String paramString5, double paramDouble, zzbeq paramzzbeq, String paramString6, float paramFloat)
  {
    zzdhc localzzdhc = new zzdhc();
    localzzdhc.zza = 6;
    localzzdhc.zzb = paramzzdq;
    localzzdhc.zzc = paramzzbei;
    localzzdhc.zzd = paramView1;
    localzzdhc.zzX("headline", paramString1);
    localzzdhc.zze = paramList;
    localzzdhc.zzX("body", paramString2);
    localzzdhc.zzh = paramBundle;
    localzzdhc.zzX("call_to_action", paramString3);
    localzzdhc.zzm = paramView2;
    localzzdhc.zzp = paramIObjectWrapper;
    localzzdhc.zzX("store", paramString4);
    localzzdhc.zzX("price", paramString5);
    localzzdhc.zzq = paramDouble;
    localzzdhc.zzr = paramzzbeq;
    localzzdhc.zzX("advertiser", paramString6);
    localzzdhc.zzQ(paramFloat);
    return localzzdhc;
  }
  
  private static Object zzak(IObjectWrapper paramIObjectWrapper)
  {
    if (paramIObjectWrapper == null) {
      return null;
    }
    return ObjectWrapper.unwrap(paramIObjectWrapper);
  }
  
  public static zzdhc zzs(zzbon paramzzbon)
  {
    try
    {
      paramzzbon = zzaj(zzai(paramzzbon.zzj(), paramzzbon), paramzzbon.zzk(), (View)zzak(paramzzbon.zzm()), paramzzbon.zzs(), paramzzbon.zzv(), paramzzbon.zzq(), paramzzbon.zzi(), paramzzbon.zzr(), (View)zzak(paramzzbon.zzn()), paramzzbon.zzo(), paramzzbon.zzu(), paramzzbon.zzt(), paramzzbon.zze(), paramzzbon.zzl(), paramzzbon.zzp(), paramzzbon.zzf());
      return paramzzbon;
    }
    catch (RemoteException paramzzbon)
    {
      zzbzt.zzk("Failed to get native ad assets from unified ad mapper", paramzzbon);
    }
    return null;
  }
  
  public final String zzA()
  {
    try
    {
      String str = zzE("headline");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzB()
  {
    try
    {
      String str = this.zzx;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzC()
  {
    try
    {
      String str = zzE("price");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzD()
  {
    try
    {
      String str = zzE("store");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzE(String paramString)
  {
    try
    {
      paramString = (String)this.zzv.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final List zzF()
  {
    try
    {
      List localList = this.zze;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final List zzG()
  {
    try
    {
      List localList = this.zzf;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzH()
  {
    try
    {
      zzcfb localzzcfb = this.zzi;
      if (localzzcfb != null)
      {
        localzzcfb.destroy();
        this.zzi = null;
      }
      localzzcfb = this.zzj;
      if (localzzcfb != null)
      {
        localzzcfb.destroy();
        this.zzj = null;
      }
      localzzcfb = this.zzk;
      if (localzzcfb != null)
      {
        localzzcfb.destroy();
        this.zzk = null;
      }
      this.zzl = null;
      this.zzu.clear();
      this.zzv.clear();
      this.zzb = null;
      this.zzc = null;
      this.zzd = null;
      this.zze = null;
      this.zzh = null;
      this.zzm = null;
      this.zzo = null;
      this.zzp = null;
      this.zzr = null;
      this.zzs = null;
      this.zzt = null;
      return;
    }
    finally {}
  }
  
  public final void zzI(zzbei paramzzbei)
  {
    try
    {
      this.zzc = paramzzbei;
      return;
    }
    finally
    {
      paramzzbei = finally;
      throw paramzzbei;
    }
  }
  
  public final void zzJ(String paramString)
  {
    try
    {
      this.zzt = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzK(zzel paramzzel)
  {
    try
    {
      this.zzg = paramzzel;
      return;
    }
    finally
    {
      paramzzel = finally;
      throw paramzzel;
    }
  }
  
  public final void zzL(zzbeq paramzzbeq)
  {
    try
    {
      this.zzr = paramzzbeq;
      return;
    }
    finally
    {
      paramzzbeq = finally;
      throw paramzzbeq;
    }
  }
  
  public final void zzM(String paramString, zzbec paramzzbec)
  {
    if (paramzzbec == null) {}
    try
    {
      this.zzu.remove(paramString);
      return;
    }
    finally {}
    this.zzu.put(paramString, paramzzbec);
  }
  
  public final void zzN(zzcfb paramzzcfb)
  {
    try
    {
      this.zzj = paramzzcfb;
      return;
    }
    finally
    {
      paramzzcfb = finally;
      throw paramzzcfb;
    }
  }
  
  public final void zzO(List paramList)
  {
    try
    {
      this.zze = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final void zzP(zzbeq paramzzbeq)
  {
    try
    {
      this.zzs = paramzzbeq;
      return;
    }
    finally
    {
      paramzzbeq = finally;
      throw paramzzbeq;
    }
  }
  
  public final void zzQ(float paramFloat)
  {
    try
    {
      this.zzw = paramFloat;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzR(List paramList)
  {
    try
    {
      this.zzf = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final void zzS(zzcfb paramzzcfb)
  {
    try
    {
      this.zzk = paramzzcfb;
      return;
    }
    finally
    {
      paramzzcfb = finally;
      throw paramzzcfb;
    }
  }
  
  public final void zzT(zzfwb paramzzfwb)
  {
    try
    {
      this.zzn = paramzzfwb;
      return;
    }
    finally
    {
      paramzzfwb = finally;
      throw paramzzfwb;
    }
  }
  
  public final void zzU(String paramString)
  {
    try
    {
      this.zzx = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzV(zzfgo paramzzfgo)
  {
    try
    {
      this.zzl = paramzzfgo;
      return;
    }
    finally
    {
      paramzzfgo = finally;
      throw paramzzfgo;
    }
  }
  
  public final void zzW(double paramDouble)
  {
    try
    {
      this.zzq = paramDouble;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzX(String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    try
    {
      this.zzv.remove(paramString1);
      return;
    }
    finally {}
    this.zzv.put(paramString1, paramString2);
  }
  
  public final void zzY(int paramInt)
  {
    try
    {
      this.zza = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzZ(zzdq paramzzdq)
  {
    try
    {
      this.zzb = paramzzdq;
      return;
    }
    finally
    {
      paramzzdq = finally;
      throw paramzzdq;
    }
  }
  
  public final double zza()
  {
    try
    {
      double d = this.zzq;
      return d;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzaa(View paramView)
  {
    try
    {
      this.zzm = paramView;
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  public final void zzab(zzcfb paramzzcfb)
  {
    try
    {
      this.zzi = paramzzcfb;
      return;
    }
    finally
    {
      paramzzcfb = finally;
      throw paramzzcfb;
    }
  }
  
  public final void zzac(View paramView)
  {
    try
    {
      this.zzo = paramView;
      return;
    }
    finally
    {
      paramView = finally;
      throw paramView;
    }
  }
  
  /* Error */
  public final boolean zzad()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 275	com/google/android/gms/internal/ads/zzdhc:zzj	Lcom/google/android/gms/internal/ads/zzcfb;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzdhc
    //   12	7	1	bool	boolean
    //   6	2	2	localzzcfb	zzcfb
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final float zzb()
  {
    try
    {
      float f = this.zzw;
      return f;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int zzc()
  {
    try
    {
      int i = this.zza;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Bundle zzd()
  {
    try
    {
      if (this.zzh == null)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        this.zzh = localBundle;
      }
      Bundle localBundle = this.zzh;
      return localBundle;
    }
    finally {}
  }
  
  public final View zze()
  {
    try
    {
      View localView = this.zzd;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final View zzf()
  {
    try
    {
      View localView = this.zzm;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final View zzg()
  {
    try
    {
      View localView = this.zzo;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final SimpleArrayMap zzh()
  {
    try
    {
      SimpleArrayMap localSimpleArrayMap = this.zzu;
      return localSimpleArrayMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final SimpleArrayMap zzi()
  {
    try
    {
      SimpleArrayMap localSimpleArrayMap = this.zzv;
      return localSimpleArrayMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzdq zzj()
  {
    try
    {
      zzdq localzzdq = this.zzb;
      return localzzdq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzel zzk()
  {
    try
    {
      zzel localzzel = this.zzg;
      return localzzel;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzbei zzl()
  {
    try
    {
      zzbei localzzbei = this.zzc;
      return localzzbei;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzbeq zzm()
  {
    Object localObject = this.zze;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = this.zze.get(0);
      if ((localObject instanceof IBinder)) {
        return zzbep.zzg((IBinder)localObject);
      }
    }
    return null;
  }
  
  public final zzbeq zzn()
  {
    try
    {
      zzbeq localzzbeq = this.zzr;
      return localzzbeq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzbeq zzo()
  {
    try
    {
      zzbeq localzzbeq = this.zzs;
      return localzzbeq;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzcfb zzp()
  {
    try
    {
      zzcfb localzzcfb = this.zzj;
      return localzzcfb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzcfb zzq()
  {
    try
    {
      zzcfb localzzcfb = this.zzk;
      return localzzcfb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzcfb zzr()
  {
    try
    {
      zzcfb localzzcfb = this.zzi;
      return localzzcfb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzfgo zzt()
  {
    try
    {
      zzfgo localzzfgo = this.zzl;
      return localzzfgo;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final IObjectWrapper zzu()
  {
    try
    {
      IObjectWrapper localIObjectWrapper = this.zzp;
      return localIObjectWrapper;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzfwb zzv()
  {
    try
    {
      zzfwb localzzfwb = this.zzn;
      return localzzfwb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzw()
  {
    try
    {
      String str = zzE("advertiser");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzx()
  {
    try
    {
      String str = zzE("body");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzy()
  {
    try
    {
      String str = zzE("call_to_action");
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String zzz()
  {
    try
    {
      String str = this.zzt;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */