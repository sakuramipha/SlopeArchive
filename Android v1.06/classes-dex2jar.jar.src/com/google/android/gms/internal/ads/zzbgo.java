package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzbgo
  extends UnifiedNativeAd
{
  private final zzbgn zza;
  private final List zzb;
  private final zzber zzc;
  private final VideoController zzd;
  private final NativeAd.AdChoicesInfo zze;
  private final List zzf;
  
  /* Error */
  public zzbgo(zzbgn paramzzbgn)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 22	com/google/android/gms/ads/formats/UnifiedNativeAd:<init>	()V
    //   4: aload_0
    //   5: new 24	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 25	java/util/ArrayList:<init>	()V
    //   12: putfield 27	com/google/android/gms/internal/ads/zzbgo:zzb	Ljava/util/List;
    //   15: aload_0
    //   16: new 29	com/google/android/gms/ads/VideoController
    //   19: dup
    //   20: invokespecial 30	com/google/android/gms/ads/VideoController:<init>	()V
    //   23: putfield 32	com/google/android/gms/internal/ads/zzbgo:zzd	Lcom/google/android/gms/ads/VideoController;
    //   26: aload_0
    //   27: new 24	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 25	java/util/ArrayList:<init>	()V
    //   34: putfield 34	com/google/android/gms/internal/ads/zzbgo:zzf	Ljava/util/List;
    //   37: aload_0
    //   38: aload_1
    //   39: putfield 36	com/google/android/gms/internal/ads/zzbgo:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_1
    //   45: invokeinterface 42 1 0
    //   50: astore_1
    //   51: aload_1
    //   52: ifnull +127 -> 179
    //   55: aload_1
    //   56: invokeinterface 48 1 0
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface 54 1 0
    //   68: ifeq +111 -> 179
    //   71: aload_3
    //   72: invokeinterface 58 1 0
    //   77: astore_1
    //   78: aload_1
    //   79: instanceof 60
    //   82: ifeq +54 -> 136
    //   85: aload_1
    //   86: checkcast 60	android/os/IBinder
    //   89: astore_1
    //   90: aload_1
    //   91: ifnonnull +6 -> 97
    //   94: goto +42 -> 136
    //   97: aload_1
    //   98: ldc 62
    //   100: invokeinterface 66 2 0
    //   105: astore 4
    //   107: aload 4
    //   109: instanceof 68
    //   112: ifeq +12 -> 124
    //   115: aload 4
    //   117: checkcast 68	com/google/android/gms/internal/ads/zzbeq
    //   120: astore_1
    //   121: goto +17 -> 138
    //   124: new 70	com/google/android/gms/internal/ads/zzbeo
    //   127: dup
    //   128: aload_1
    //   129: invokespecial 73	com/google/android/gms/internal/ads/zzbeo:<init>	(Landroid/os/IBinder;)V
    //   132: astore_1
    //   133: goto +5 -> 138
    //   136: aconst_null
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull -77 -> 62
    //   142: aload_0
    //   143: getfield 27	com/google/android/gms/internal/ads/zzbgo:zzb	Ljava/util/List;
    //   146: astore 5
    //   148: new 75	com/google/android/gms/internal/ads/zzber
    //   151: astore 4
    //   153: aload 4
    //   155: aload_1
    //   156: invokespecial 78	com/google/android/gms/internal/ads/zzber:<init>	(Lcom/google/android/gms/internal/ads/zzbeq;)V
    //   159: aload 5
    //   161: aload 4
    //   163: invokeinterface 82 2 0
    //   168: pop
    //   169: goto -107 -> 62
    //   172: astore_1
    //   173: ldc 84
    //   175: aload_1
    //   176: invokestatic 90	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   179: aload_0
    //   180: getfield 36	com/google/android/gms/internal/ads/zzbgo:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   183: invokeinterface 93 1 0
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +87 -> 277
    //   193: aload_1
    //   194: invokeinterface 48 1 0
    //   199: astore_3
    //   200: aload_3
    //   201: invokeinterface 54 1 0
    //   206: ifeq +71 -> 277
    //   209: aload_3
    //   210: invokeinterface 58 1 0
    //   215: astore_1
    //   216: aload_1
    //   217: instanceof 60
    //   220: ifeq +14 -> 234
    //   223: aload_1
    //   224: checkcast 60	android/os/IBinder
    //   227: invokestatic 98	com/google/android/gms/ads/internal/client/zzcv:zzb	(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/zzcw;
    //   230: astore_1
    //   231: goto +5 -> 236
    //   234: aconst_null
    //   235: astore_1
    //   236: aload_1
    //   237: ifnull -37 -> 200
    //   240: aload_0
    //   241: getfield 34	com/google/android/gms/internal/ads/zzbgo:zzf	Ljava/util/List;
    //   244: astore 5
    //   246: new 100	com/google/android/gms/ads/internal/client/zzcx
    //   249: astore 4
    //   251: aload 4
    //   253: aload_1
    //   254: invokespecial 103	com/google/android/gms/ads/internal/client/zzcx:<init>	(Lcom/google/android/gms/ads/internal/client/zzcw;)V
    //   257: aload 5
    //   259: aload 4
    //   261: invokeinterface 82 2 0
    //   266: pop
    //   267: goto -67 -> 200
    //   270: astore_1
    //   271: ldc 84
    //   273: aload_1
    //   274: invokestatic 90	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: aload_0
    //   278: getfield 36	com/google/android/gms/internal/ads/zzbgo:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   281: invokeinterface 107 1 0
    //   286: astore_3
    //   287: aload_3
    //   288: ifnull +22 -> 310
    //   291: new 75	com/google/android/gms/internal/ads/zzber
    //   294: astore_1
    //   295: aload_1
    //   296: aload_3
    //   297: invokespecial 78	com/google/android/gms/internal/ads/zzber:<init>	(Lcom/google/android/gms/internal/ads/zzbeq;)V
    //   300: goto +12 -> 312
    //   303: astore_1
    //   304: ldc 84
    //   306: aload_1
    //   307: invokestatic 90	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   310: aconst_null
    //   311: astore_1
    //   312: aload_0
    //   313: aload_1
    //   314: putfield 109	com/google/android/gms/internal/ads/zzbgo:zzc	Lcom/google/android/gms/internal/ads/zzber;
    //   317: aload_2
    //   318: astore_1
    //   319: aload_0
    //   320: getfield 36	com/google/android/gms/internal/ads/zzbgo:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   323: invokeinterface 113 1 0
    //   328: ifnull +32 -> 360
    //   331: new 115	com/google/android/gms/internal/ads/zzbej
    //   334: astore_1
    //   335: aload_1
    //   336: aload_0
    //   337: getfield 36	com/google/android/gms/internal/ads/zzbgo:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   340: invokeinterface 113 1 0
    //   345: invokespecial 118	com/google/android/gms/internal/ads/zzbej:<init>	(Lcom/google/android/gms/internal/ads/zzbei;)V
    //   348: goto +12 -> 360
    //   351: astore_1
    //   352: ldc 84
    //   354: aload_1
    //   355: invokestatic 90	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   358: aload_2
    //   359: astore_1
    //   360: aload_0
    //   361: aload_1
    //   362: putfield 120	com/google/android/gms/internal/ads/zzbgo:zze	Lcom/google/android/gms/ads/formats/NativeAd$AdChoicesInfo;
    //   365: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	366	0	this	zzbgo
    //   0	366	1	paramzzbgn	zzbgn
    //   43	316	2	localObject1	Object
    //   61	236	3	localObject2	Object
    //   105	155	4	localObject3	Object
    //   146	112	5	localList	List
    // Exception table:
    //   from	to	target	type
    //   44	51	172	android/os/RemoteException
    //   55	62	172	android/os/RemoteException
    //   62	90	172	android/os/RemoteException
    //   97	121	172	android/os/RemoteException
    //   124	133	172	android/os/RemoteException
    //   142	169	172	android/os/RemoteException
    //   179	189	270	android/os/RemoteException
    //   193	200	270	android/os/RemoteException
    //   200	231	270	android/os/RemoteException
    //   240	267	270	android/os/RemoteException
    //   277	287	303	android/os/RemoteException
    //   291	300	303	android/os/RemoteException
    //   319	348	351	android/os/RemoteException
  }
  
  public final void cancelUnconfirmedClick()
  {
    try
    {
      this.zza.zzw();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Failed to cancelUnconfirmedClick", localRemoteException);
    }
  }
  
  public final void destroy()
  {
    try
    {
      this.zza.zzx();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
  
  public final void enableCustomClickGesture()
  {
    try
    {
      this.zza.zzC();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
  
  public final NativeAd.AdChoicesInfo getAdChoicesInfo()
  {
    return this.zze;
  }
  
  public final String getAdvertiser()
  {
    try
    {
      String str = this.zza.zzn();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final String getBody()
  {
    try
    {
      String str = this.zza.zzo();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final String getCallToAction()
  {
    try
    {
      String str = this.zza.zzp();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final Bundle getExtras()
  {
    try
    {
      Bundle localBundle = this.zza.zzf();
      if (localBundle != null) {
        return localBundle;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return new Bundle();
  }
  
  public final String getHeadline()
  {
    try
    {
      String str = this.zza.zzq();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final NativeAd.Image getIcon()
  {
    return this.zzc;
  }
  
  public final List<NativeAd.Image> getImages()
  {
    return this.zzb;
  }
  
  public final MediaContent getMediaContent()
  {
    try
    {
      if (this.zza.zzj() != null)
      {
        zzep localzzep = new zzep(this.zza.zzj(), null);
        return localzzep;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final String getMediationAdapterClassName()
  {
    try
    {
      String str = this.zza.zzr();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final List<MuteThisAdReason> getMuteThisAdReasons()
  {
    return this.zzf;
  }
  
  public final String getPrice()
  {
    try
    {
      String str = this.zza.zzs();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final ResponseInfo getResponseInfo()
  {
    zzdn localzzdn2;
    try
    {
      zzdn localzzdn1 = this.zza.zzg();
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
      localzzdn2 = null;
    }
    return ResponseInfo.zza(localzzdn2);
  }
  
  public final Double getStarRating()
  {
    Double localDouble = null;
    try
    {
      double d = this.zza.zze();
      if (d != -1.0D) {
        localDouble = Double.valueOf(d);
      }
      return localDouble;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final String getStore()
  {
    try
    {
      String str = this.zza.zzt();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
  
  public final VideoController getVideoController()
  {
    try
    {
      if (this.zza.zzh() != null) {
        this.zzd.zzb(this.zza.zzh());
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("Exception occurred while getting video controller", localRemoteException);
    }
    return this.zzd;
  }
  
  public final boolean isCustomClickGestureEnabled()
  {
    try
    {
      boolean bool = this.zza.zzG();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return false;
  }
  
  public final boolean isCustomMuteThisAdEnabled()
  {
    try
    {
      boolean bool = this.zza.zzH();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return false;
  }
  
  public final void muteThisAd(MuteThisAdReason paramMuteThisAdReason)
  {
    try
    {
      boolean bool = this.zza.zzH();
      if (bool) {
        if (paramMuteThisAdReason != null) {}
      }
    }
    catch (RemoteException paramMuteThisAdReason)
    {
      zzbzt.zzh("", paramMuteThisAdReason);
      zzbzt.zzg("Ad is not custom mute enabled");
      return;
    }
    try
    {
      this.zza.zzy(null);
      return;
    }
    catch (RemoteException paramMuteThisAdReason)
    {
      zzbzt.zzh("", paramMuteThisAdReason);
    }
    if ((paramMuteThisAdReason instanceof zzcx))
    {
      this.zza.zzy(((zzcx)paramMuteThisAdReason).zza());
      return;
    }
    zzbzt.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
    return;
  }
  
  public final void performClick(Bundle paramBundle)
  {
    try
    {
      this.zza.zzz(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      zzbzt.zzh("", paramBundle);
    }
  }
  
  public final void recordCustomClickGesture()
  {
    try
    {
      this.zza.zzA();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
  }
  
  public final boolean recordImpression(Bundle paramBundle)
  {
    try
    {
      boolean bool = this.zza.zzI(paramBundle);
      return bool;
    }
    catch (RemoteException paramBundle)
    {
      zzbzt.zzh("", paramBundle);
    }
    return false;
  }
  
  public final void reportTouchEvent(Bundle paramBundle)
  {
    try
    {
      this.zza.zzB(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      zzbzt.zzh("", paramBundle);
    }
  }
  
  public final void setMuteThisAdListener(MuteThisAdListener paramMuteThisAdListener)
  {
    try
    {
      zzbgn localzzbgn = this.zza;
      zzct localzzct = new com/google/android/gms/ads/internal/client/zzct;
      localzzct.<init>(paramMuteThisAdListener);
      localzzbgn.zzD(localzzct);
      return;
    }
    catch (RemoteException paramMuteThisAdListener)
    {
      zzbzt.zzh("", paramMuteThisAdListener);
    }
  }
  
  public final void setOnPaidEventListener(OnPaidEventListener paramOnPaidEventListener)
  {
    try
    {
      zzbgn localzzbgn = this.zza;
      zzfe localzzfe = new com/google/android/gms/ads/internal/client/zzfe;
      localzzfe.<init>(paramOnPaidEventListener);
      localzzbgn.zzE(localzzfe);
      return;
    }
    catch (RemoteException paramOnPaidEventListener)
    {
      zzbzt.zzh("Failed to setOnPaidEventListener", paramOnPaidEventListener);
    }
  }
  
  public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener paramUnconfirmedClickListener)
  {
    try
    {
      zzbgn localzzbgn = this.zza;
      zzbgz localzzbgz = new com/google/android/gms/internal/ads/zzbgz;
      localzzbgz.<init>(paramUnconfirmedClickListener);
      localzzbgn.zzF(localzzbgz);
      return;
    }
    catch (RemoteException paramUnconfirmedClickListener)
    {
      zzbzt.zzh("Failed to setUnconfirmedClickListener", paramUnconfirmedClickListener);
    }
  }
  
  public final Object zza()
  {
    try
    {
      Object localObject = this.zza.zzl();
      if (localObject != null)
      {
        localObject = ObjectWrapper.unwrap((IObjectWrapper)localObject);
        return localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzh("", localRemoteException);
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */