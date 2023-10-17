package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;
import java.util.List;

public final class zzbrd
  extends NativeAd
{
  private final zzbgn zza;
  private final List zzb;
  private final zzbrc zzc;
  private final NativeAd.AdChoicesInfo zzd;
  private final List zze;
  
  /* Error */
  public zzbrd(zzbgn paramzzbgn)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 20	com/google/android/gms/ads/nativead/NativeAd:<init>	()V
    //   4: aload_0
    //   5: new 22	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 23	java/util/ArrayList:<init>	()V
    //   12: putfield 25	com/google/android/gms/internal/ads/zzbrd:zzb	Ljava/util/List;
    //   15: aload_0
    //   16: new 22	java/util/ArrayList
    //   19: dup
    //   20: invokespecial 23	java/util/ArrayList:<init>	()V
    //   23: putfield 27	com/google/android/gms/internal/ads/zzbrd:zze	Ljava/util/List;
    //   26: aload_0
    //   27: aload_1
    //   28: putfield 29	com/google/android/gms/internal/ads/zzbrd:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_1
    //   34: invokeinterface 35 1 0
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull +87 -> 128
    //   44: aload_1
    //   45: invokeinterface 41 1 0
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface 47 1 0
    //   57: ifeq +71 -> 128
    //   60: aload_3
    //   61: invokeinterface 51 1 0
    //   66: astore_1
    //   67: aload_1
    //   68: instanceof 53
    //   71: ifeq +14 -> 85
    //   74: aload_1
    //   75: checkcast 53	android/os/IBinder
    //   78: invokestatic 59	com/google/android/gms/internal/ads/zzbep:zzg	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbeq;
    //   81: astore_1
    //   82: goto +5 -> 87
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_1
    //   88: ifnull -37 -> 51
    //   91: aload_0
    //   92: getfield 25	com/google/android/gms/internal/ads/zzbrd:zzb	Ljava/util/List;
    //   95: astore 5
    //   97: new 61	com/google/android/gms/internal/ads/zzbrc
    //   100: astore 4
    //   102: aload 4
    //   104: aload_1
    //   105: invokespecial 64	com/google/android/gms/internal/ads/zzbrc:<init>	(Lcom/google/android/gms/internal/ads/zzbeq;)V
    //   108: aload 5
    //   110: aload 4
    //   112: invokeinterface 68 2 0
    //   117: pop
    //   118: goto -67 -> 51
    //   121: astore_1
    //   122: ldc 70
    //   124: aload_1
    //   125: invokestatic 76	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: aload_0
    //   129: getfield 29	com/google/android/gms/internal/ads/zzbrd:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   132: invokeinterface 79 1 0
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull +87 -> 226
    //   142: aload_1
    //   143: invokeinterface 41 1 0
    //   148: astore_3
    //   149: aload_3
    //   150: invokeinterface 47 1 0
    //   155: ifeq +71 -> 226
    //   158: aload_3
    //   159: invokeinterface 51 1 0
    //   164: astore_1
    //   165: aload_1
    //   166: instanceof 53
    //   169: ifeq +14 -> 183
    //   172: aload_1
    //   173: checkcast 53	android/os/IBinder
    //   176: invokestatic 84	com/google/android/gms/ads/internal/client/zzcv:zzb	(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/zzcw;
    //   179: astore_1
    //   180: goto +5 -> 185
    //   183: aconst_null
    //   184: astore_1
    //   185: aload_1
    //   186: ifnull -37 -> 149
    //   189: aload_0
    //   190: getfield 27	com/google/android/gms/internal/ads/zzbrd:zze	Ljava/util/List;
    //   193: astore 5
    //   195: new 86	com/google/android/gms/ads/internal/client/zzcx
    //   198: astore 4
    //   200: aload 4
    //   202: aload_1
    //   203: invokespecial 89	com/google/android/gms/ads/internal/client/zzcx:<init>	(Lcom/google/android/gms/ads/internal/client/zzcw;)V
    //   206: aload 5
    //   208: aload 4
    //   210: invokeinterface 68 2 0
    //   215: pop
    //   216: goto -67 -> 149
    //   219: astore_1
    //   220: ldc 70
    //   222: aload_1
    //   223: invokestatic 76	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   226: aload_0
    //   227: getfield 29	com/google/android/gms/internal/ads/zzbrd:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   230: invokeinterface 93 1 0
    //   235: astore_3
    //   236: aload_3
    //   237: ifnull +22 -> 259
    //   240: new 61	com/google/android/gms/internal/ads/zzbrc
    //   243: astore_1
    //   244: aload_1
    //   245: aload_3
    //   246: invokespecial 64	com/google/android/gms/internal/ads/zzbrc:<init>	(Lcom/google/android/gms/internal/ads/zzbeq;)V
    //   249: goto +12 -> 261
    //   252: astore_1
    //   253: ldc 70
    //   255: aload_1
    //   256: invokestatic 76	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   259: aconst_null
    //   260: astore_1
    //   261: aload_0
    //   262: aload_1
    //   263: putfield 95	com/google/android/gms/internal/ads/zzbrd:zzc	Lcom/google/android/gms/internal/ads/zzbrc;
    //   266: aload_2
    //   267: astore_1
    //   268: aload_0
    //   269: getfield 29	com/google/android/gms/internal/ads/zzbrd:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   272: invokeinterface 99 1 0
    //   277: ifnull +32 -> 309
    //   280: new 101	com/google/android/gms/internal/ads/zzbra
    //   283: astore_1
    //   284: aload_1
    //   285: aload_0
    //   286: getfield 29	com/google/android/gms/internal/ads/zzbrd:zza	Lcom/google/android/gms/internal/ads/zzbgn;
    //   289: invokeinterface 99 1 0
    //   294: invokespecial 104	com/google/android/gms/internal/ads/zzbra:<init>	(Lcom/google/android/gms/internal/ads/zzbei;)V
    //   297: goto +12 -> 309
    //   300: astore_1
    //   301: ldc 70
    //   303: aload_1
    //   304: invokestatic 76	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   307: aload_2
    //   308: astore_1
    //   309: aload_0
    //   310: aload_1
    //   311: putfield 106	com/google/android/gms/internal/ads/zzbrd:zzd	Lcom/google/android/gms/ads/nativead/NativeAd$AdChoicesInfo;
    //   314: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	this	zzbrd
    //   0	315	1	paramzzbgn	zzbgn
    //   32	276	2	localObject1	Object
    //   50	196	3	localObject2	Object
    //   100	109	4	localObject3	Object
    //   95	112	5	localList	List
    // Exception table:
    //   from	to	target	type
    //   33	40	121	android/os/RemoteException
    //   44	51	121	android/os/RemoteException
    //   51	82	121	android/os/RemoteException
    //   91	118	121	android/os/RemoteException
    //   128	138	219	android/os/RemoteException
    //   142	149	219	android/os/RemoteException
    //   149	180	219	android/os/RemoteException
    //   189	216	219	android/os/RemoteException
    //   226	236	252	android/os/RemoteException
    //   240	249	252	android/os/RemoteException
    //   268	297	300	android/os/RemoteException
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
    return this.zzd;
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
  
  public final List<MuteThisAdReason> getMuteThisAdReasons()
  {
    return this.zze;
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
  
  public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener paramUnconfirmedClickListener)
  {
    try
    {
      zzbgn localzzbgn = this.zza;
      zzbrl localzzbrl = new com/google/android/gms/internal/ads/zzbrl;
      localzzbrl.<init>(paramUnconfirmedClickListener);
      localzzbgn.zzF(localzzbrl);
      return;
    }
    catch (RemoteException paramUnconfirmedClickListener)
    {
      zzbzt.zzh("Failed to setUnconfirmedClickListener", paramUnconfirmedClickListener);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */