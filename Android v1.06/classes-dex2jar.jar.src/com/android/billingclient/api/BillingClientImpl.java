package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class BillingClientImpl
  extends BillingClient
{
  private volatile int zza = 0;
  private final String zzb;
  private final Handler zzc = new Handler(Looper.getMainLooper());
  private volatile zzp zzd;
  private Context zze;
  private volatile zze zzf;
  private volatile zzaq zzg;
  private boolean zzh;
  private boolean zzi;
  private int zzj = 0;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  private boolean zzn;
  private boolean zzo;
  private boolean zzp;
  private boolean zzq;
  private boolean zzr;
  private boolean zzs;
  private boolean zzt;
  private boolean zzu;
  private ExecutorService zzv;
  
  private BillingClientImpl(Activity paramActivity, boolean paramBoolean, String paramString)
  {
    this(paramActivity.getApplicationContext(), paramBoolean, new zzau(), paramString, null, null);
  }
  
  private BillingClientImpl(Context paramContext, boolean paramBoolean, PurchasesUpdatedListener paramPurchasesUpdatedListener, String paramString1, String paramString2, zzc paramzzc)
  {
    this.zzb = paramString1;
    initialize(paramContext, paramPurchasesUpdatedListener, paramBoolean, null);
  }
  
  private BillingClientImpl(String paramString)
  {
    this.zzb = paramString;
  }
  
  BillingClientImpl(String paramString, boolean paramBoolean, Context paramContext, PurchasesUpdatedListener paramPurchasesUpdatedListener, zzc paramzzc)
  {
    this(paramContext, paramBoolean, paramPurchasesUpdatedListener, zzI(), null, null);
  }
  
  BillingClientImpl(String paramString, boolean paramBoolean, Context paramContext, zzbf paramzzbf)
  {
    this.zzb = zzI();
    this.zze = paramContext.getApplicationContext();
    zzb.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
    this.zzd = new zzp(this.zze, null);
    this.zzt = paramBoolean;
  }
  
  private void initialize(Context paramContext, PurchasesUpdatedListener paramPurchasesUpdatedListener, boolean paramBoolean, zzc paramzzc)
  {
    this.zze = paramContext.getApplicationContext();
    if (paramPurchasesUpdatedListener == null) {
      zzb.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
    }
    this.zzd = new zzp(this.zze, paramPurchasesUpdatedListener, paramzzc);
    this.zzt = paramBoolean;
    if (paramzzc != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.zzu = paramBoolean;
  }
  
  private int launchBillingFlowCpp(Activity paramActivity, BillingFlowParams paramBillingFlowParams)
  {
    return launchBillingFlow(paramActivity, paramBillingFlowParams).getResponseCode();
  }
  
  private void launchPriceChangeConfirmationFlow(Activity paramActivity, PriceChangeFlowParams paramPriceChangeFlowParams, long paramLong)
  {
    launchPriceChangeConfirmationFlow(paramActivity, paramPriceChangeFlowParams, new zzau(paramLong));
  }
  
  private void startConnection(long paramLong)
  {
    zzau localzzau = new zzau(paramLong);
    if (isReady())
    {
      zzb.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
      localzzau.onBillingSetupFinished(zzbc.zzl);
      return;
    }
    if (this.zza == 1)
    {
      zzb.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
      localzzau.onBillingSetupFinished(zzbc.zzd);
      return;
    }
    if (this.zza == 3)
    {
      zzb.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
      localzzau.onBillingSetupFinished(zzbc.zzm);
      return;
    }
    this.zza = 1;
    this.zzd.zze();
    zzb.zzn("BillingClient", "Starting in-app billing setup.");
    this.zzg = new zzaq(this, localzzau, null);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    Object localObject1 = this.zze.getPackageManager().queryIntentServices(localIntent, 0);
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      Object localObject2 = (ResolveInfo)((List)localObject1).get(0);
      if (((ResolveInfo)localObject2).serviceInfo != null)
      {
        localObject1 = ((ResolveInfo)localObject2).serviceInfo.packageName;
        localObject2 = ((ResolveInfo)localObject2).serviceInfo.name;
        if (("com.android.vending".equals(localObject1)) && (localObject2 != null))
        {
          localObject1 = new ComponentName((String)localObject1, (String)localObject2);
          localIntent = new Intent(localIntent);
          localIntent.setComponent((ComponentName)localObject1);
          localIntent.putExtra("playBillingLibraryVersion", this.zzb);
          if (this.zze.bindService(localIntent, this.zzg, 1))
          {
            zzb.zzn("BillingClient", "Service was bonded successfully.");
            return;
          }
          zzb.zzo("BillingClient", "Connection to Billing service is blocked.");
        }
        else
        {
          zzb.zzo("BillingClient", "The device doesn't have valid Play Store.");
        }
      }
    }
    this.zza = 0;
    zzb.zzn("BillingClient", "Billing service unavailable on device.");
    localzzau.onBillingSetupFinished(zzbc.zzc);
  }
  
  private final Handler zzF()
  {
    Handler localHandler;
    if (Looper.myLooper() == null) {
      localHandler = this.zzc;
    } else {
      localHandler = new Handler(Looper.myLooper());
    }
    return localHandler;
  }
  
  private final BillingResult zzG(BillingResult paramBillingResult)
  {
    if (Thread.interrupted()) {
      return paramBillingResult;
    }
    this.zzc.post(new zzah(this, paramBillingResult));
    return paramBillingResult;
  }
  
  private final BillingResult zzH()
  {
    BillingResult localBillingResult;
    if ((this.zza != 0) && (this.zza != 3)) {
      localBillingResult = zzbc.zzj;
    } else {
      localBillingResult = zzbc.zzm;
    }
    return localBillingResult;
  }
  
  private static String zzI()
  {
    try
    {
      String str = (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
      return str;
    }
    catch (Exception localException) {}
    return "5.1.0";
  }
  
  private final Future zzJ(Callable paramCallable, long paramLong, Runnable paramRunnable, Handler paramHandler)
  {
    if (this.zzv == null) {
      this.zzv = Executors.newFixedThreadPool(zzb.zza, new zzam(this));
    }
    try
    {
      paramCallable = this.zzv.submit(paramCallable);
      double d = paramLong;
      paramHandler.postDelayed(new zzag(paramCallable, paramRunnable), (d * 0.95D));
      return paramCallable;
    }
    catch (Exception paramCallable)
    {
      zzb.zzp("BillingClient", "Async task throws exception!", paramCallable);
    }
    return null;
  }
  
  private final void zzK(BillingResult paramBillingResult, PriceChangeConfirmationListener paramPriceChangeConfirmationListener)
  {
    if (Thread.interrupted()) {
      return;
    }
    this.zzc.post(new zzy(paramPriceChangeConfirmationListener, paramBillingResult));
  }
  
  private final void zzL(String paramString, PurchaseHistoryResponseListener paramPurchaseHistoryResponseListener)
  {
    if (!isReady())
    {
      paramPurchaseHistoryResponseListener.onPurchaseHistoryResponse(zzbc.zzm, null);
      return;
    }
    if (zzJ(new zzak(this, paramString, paramPurchaseHistoryResponseListener), 30000L, new zzx(paramPurchaseHistoryResponseListener), zzF()) == null) {
      paramPurchaseHistoryResponseListener.onPurchaseHistoryResponse(zzH(), null);
    }
  }
  
  private final void zzM(String paramString, PurchasesResponseListener paramPurchasesResponseListener)
  {
    if (!isReady())
    {
      paramPurchasesResponseListener.onQueryPurchasesResponse(zzbc.zzm, com.google.android.gms.internal.play_billing.zzu.zzl());
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      zzb.zzo("BillingClient", "Please provide a valid product type.");
      paramPurchasesResponseListener.onQueryPurchasesResponse(zzbc.zzg, com.google.android.gms.internal.play_billing.zzu.zzl());
      return;
    }
    if (zzJ(new zzaj(this, paramString, paramPurchasesResponseListener), 30000L, new zzae(paramPurchasesResponseListener), zzF()) == null) {
      paramPurchasesResponseListener.onQueryPurchasesResponse(zzH(), com.google.android.gms.internal.play_billing.zzu.zzl());
    }
  }
  
  public final void acknowledgePurchase(AcknowledgePurchaseParams paramAcknowledgePurchaseParams, AcknowledgePurchaseResponseListener paramAcknowledgePurchaseResponseListener)
  {
    if (!isReady())
    {
      paramAcknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzm);
      return;
    }
    if (TextUtils.isEmpty(paramAcknowledgePurchaseParams.getPurchaseToken()))
    {
      zzb.zzo("BillingClient", "Please provide a valid purchase token.");
      paramAcknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzi);
      return;
    }
    if (!this.zzm)
    {
      paramAcknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzb);
      return;
    }
    if (zzJ(new zzaa(this, paramAcknowledgePurchaseParams, paramAcknowledgePurchaseResponseListener), 30000L, new zzab(paramAcknowledgePurchaseResponseListener), zzF()) == null) {
      paramAcknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzH());
    }
  }
  
  public final void consumeAsync(ConsumeParams paramConsumeParams, ConsumeResponseListener paramConsumeResponseListener)
  {
    if (!isReady())
    {
      paramConsumeResponseListener.onConsumeResponse(zzbc.zzm, paramConsumeParams.getPurchaseToken());
      return;
    }
    if (zzJ(new zzv(this, paramConsumeParams, paramConsumeResponseListener), 30000L, new zzw(paramConsumeResponseListener, paramConsumeParams), zzF()) == null) {
      paramConsumeResponseListener.onConsumeResponse(zzH(), paramConsumeParams.getPurchaseToken());
    }
  }
  
  /* Error */
  public final void endConnection()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 104	com/android/billingclient/api/BillingClientImpl:zzd	Lcom/android/billingclient/api/zzp;
    //   4: invokevirtual 598	com/android/billingclient/api/zzp:zzd	()V
    //   7: aload_0
    //   8: getfield 170	com/android/billingclient/api/BillingClientImpl:zzg	Lcom/android/billingclient/api/zzaq;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 170	com/android/billingclient/api/BillingClientImpl:zzg	Lcom/android/billingclient/api/zzaq;
    //   18: invokevirtual 600	com/android/billingclient/api/zzaq:zzc	()V
    //   21: aload_0
    //   22: getfield 170	com/android/billingclient/api/BillingClientImpl:zzg	Lcom/android/billingclient/api/zzaq;
    //   25: ifnull +34 -> 59
    //   28: aload_0
    //   29: getfield 260	com/android/billingclient/api/BillingClientImpl:zzf	Lcom/google/android/gms/internal/play_billing/zze;
    //   32: ifnull +27 -> 59
    //   35: ldc 90
    //   37: ldc_w 602
    //   40: invokestatic 140	com/google/android/gms/internal/play_billing/zzb:zzn	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 88	com/android/billingclient/api/BillingClientImpl:zze	Landroid/content/Context;
    //   47: aload_0
    //   48: getfield 170	com/android/billingclient/api/BillingClientImpl:zzg	Lcom/android/billingclient/api/zzaq;
    //   51: invokevirtual 606	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 170	com/android/billingclient/api/BillingClientImpl:zzg	Lcom/android/billingclient/api/zzaq;
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 260	com/android/billingclient/api/BillingClientImpl:zzf	Lcom/google/android/gms/internal/play_billing/zze;
    //   64: aload_0
    //   65: getfield 318	com/android/billingclient/api/BillingClientImpl:zzv	Ljava/util/concurrent/ExecutorService;
    //   68: astore_1
    //   69: aload_1
    //   70: ifnull +15 -> 85
    //   73: aload_1
    //   74: invokeinterface 610 1 0
    //   79: pop
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield 318	com/android/billingclient/api/BillingClientImpl:zzv	Ljava/util/concurrent/ExecutorService;
    //   85: aload_0
    //   86: iconst_3
    //   87: putfield 55	com/android/billingclient/api/BillingClientImpl:zza	I
    //   90: return
    //   91: astore_1
    //   92: goto +19 -> 111
    //   95: astore_1
    //   96: ldc 90
    //   98: ldc_w 612
    //   101: aload_1
    //   102: invokestatic 352	com/google/android/gms/internal/play_billing/zzb:zzp	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   105: aload_0
    //   106: iconst_3
    //   107: putfield 55	com/android/billingclient/api/BillingClientImpl:zza	I
    //   110: return
    //   111: aload_0
    //   112: iconst_3
    //   113: putfield 55	com/android/billingclient/api/BillingClientImpl:zza	I
    //   116: aload_1
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	BillingClientImpl
    //   68	6	1	localExecutorService	ExecutorService
    //   91	1	1	localObject	Object
    //   95	22	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	21	91	finally
    //   21	59	91	finally
    //   59	69	91	finally
    //   73	85	91	finally
    //   96	105	91	finally
    //   0	21	95	java/lang/Exception
    //   21	59	95	java/lang/Exception
    //   59	69	95	java/lang/Exception
    //   73	85	95	java/lang/Exception
  }
  
  public final int getConnectionState()
  {
    return this.zza;
  }
  
  public final BillingResult isFeatureSupported(String paramString)
  {
    if (!isReady()) {
      return zzbc.zzm;
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1987365622: 
      if (paramString.equals("subscriptions")) {
        i = 0;
      }
      break;
    case 207616302: 
      if (paramString.equals("priceChangeConfirmation")) {
        i = 2;
      }
      break;
    case 102279: 
      if (paramString.equals("ggg")) {
        i = 9;
      }
      break;
    case 101286: 
      if (paramString.equals("fff")) {
        i = 8;
      }
      break;
    case 100293: 
      if (paramString.equals("eee")) {
        i = 7;
      }
      break;
    case 99300: 
      if (paramString.equals("ddd")) {
        i = 5;
      }
      break;
    case 98307: 
      if (paramString.equals("ccc")) {
        i = 6;
      }
      break;
    case 97314: 
      if (paramString.equals("bbb")) {
        i = 3;
      }
      break;
    case 96321: 
      if (paramString.equals("aaa")) {
        i = 4;
      }
      break;
    case -422092961: 
      if (paramString.equals("subscriptionsUpdate")) {
        i = 1;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      zzb.zzo("BillingClient", "Unsupported feature: ".concat(String.valueOf(paramString)));
      return zzbc.zzy;
    case 9: 
      if (this.zzs) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzz;
      }
      return paramString;
    case 8: 
      if (this.zzs) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzv;
      }
      return paramString;
    case 6: 
    case 7: 
      if (this.zzr) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzt;
      }
      return paramString;
    case 5: 
      if (this.zzp) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzu;
      }
      return paramString;
    case 4: 
      if (this.zzq) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzs;
      }
      return paramString;
    case 3: 
      if (this.zzo) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzw;
      }
      return paramString;
    case 2: 
      if (this.zzl) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzr;
      }
      return paramString;
    case 1: 
      if (this.zzi) {
        paramString = zzbc.zzl;
      } else {
        paramString = zzbc.zzp;
      }
      return paramString;
    }
    if (this.zzh) {
      paramString = zzbc.zzl;
    } else {
      paramString = zzbc.zzo;
    }
    return paramString;
  }
  
  public final boolean isReady()
  {
    return (this.zza == 2) && (this.zzf != null) && (this.zzg != null);
  }
  
  public final BillingResult launchBillingFlow(Activity paramActivity, BillingFlowParams paramBillingFlowParams)
  {
    if (!isReady())
    {
      paramActivity = zzbc.zzm;
      zzG(paramActivity);
      return paramActivity;
    }
    ArrayList localArrayList1 = paramBillingFlowParams.zze();
    List localList = paramBillingFlowParams.zzf();
    SkuDetails localSkuDetails = (SkuDetails)com.google.android.gms.internal.play_billing.zzz.zza(localArrayList1, null);
    Object localObject1 = (BillingFlowParams.ProductDetailsParams)com.google.android.gms.internal.play_billing.zzz.zza(localList, null);
    String str2;
    String str1;
    if (localSkuDetails != null)
    {
      str2 = localSkuDetails.getSku();
      str1 = localSkuDetails.getType();
    }
    else
    {
      str2 = ((BillingFlowParams.ProductDetailsParams)localObject1).zza().getProductId();
      str1 = ((BillingFlowParams.ProductDetailsParams)localObject1).zza().getProductType();
    }
    if ((str1.equals("subs")) && (!this.zzh))
    {
      zzb.zzo("BillingClient", "Current client doesn't support subscriptions.");
      paramActivity = zzbc.zzo;
      zzG(paramActivity);
      return paramActivity;
    }
    if ((paramBillingFlowParams.zzo()) && (!this.zzk))
    {
      zzb.zzo("BillingClient", "Current client doesn't support extra params for buy intent.");
      paramActivity = zzbc.zzh;
      zzG(paramActivity);
      return paramActivity;
    }
    if ((localArrayList1.size() > 1) && (!this.zzr))
    {
      zzb.zzo("BillingClient", "Current client doesn't support multi-item purchases.");
      paramActivity = zzbc.zzt;
      zzG(paramActivity);
      return paramActivity;
    }
    if ((!localList.isEmpty()) && (!this.zzs))
    {
      zzb.zzo("BillingClient", "Current client doesn't support purchases with ProductDetails.");
      paramActivity = zzbc.zzv;
      zzG(paramActivity);
      return paramActivity;
    }
    int j;
    if (this.zzk)
    {
      Bundle localBundle2 = zzb.zzf(paramBillingFlowParams, this.zzm, this.zzt, this.zzu, this.zzb);
      ArrayList localArrayList4;
      ArrayList localArrayList2;
      ArrayList localArrayList3;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if (!localArrayList1.isEmpty())
      {
        localArrayList4 = new ArrayList();
        localArrayList2 = new ArrayList();
        localArrayList3 = new ArrayList();
        localObject2 = new ArrayList();
        localObject3 = new ArrayList();
        localObject4 = localArrayList1.iterator();
        boolean bool1 = false;
        int m = 0;
        int k = 0;
        int i = 0;
        while (((Iterator)localObject4).hasNext())
        {
          Object localObject5 = (SkuDetails)((Iterator)localObject4).next();
          if (!((SkuDetails)localObject5).zzf().isEmpty()) {
            localArrayList4.add(((SkuDetails)localObject5).zzf());
          }
          String str4 = ((SkuDetails)localObject5).zzc();
          String str3 = ((SkuDetails)localObject5).zzb();
          int n = ((SkuDetails)localObject5).zza();
          localObject5 = ((SkuDetails)localObject5).zze();
          localArrayList2.add(str4);
          bool1 |= TextUtils.isEmpty(str4) ^ true;
          localArrayList3.add(str3);
          boolean bool2 = m | TextUtils.isEmpty(str3) ^ true;
          ((ArrayList)localObject2).add(Integer.valueOf(n));
          if (n != 0) {
            m = 1;
          } else {
            m = 0;
          }
          k |= m;
          i |= TextUtils.isEmpty((CharSequence)localObject5) ^ true;
          ((ArrayList)localObject3).add(localObject5);
          m = bool2;
        }
        if (!localArrayList4.isEmpty()) {
          localBundle2.putStringArrayList("skuDetailsTokens", localArrayList4);
        }
        if (bool1) {
          localBundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", localArrayList2);
        }
        if (m != 0) {
          localBundle2.putStringArrayList("SKU_OFFER_ID_LIST", localArrayList3);
        }
        if (k != 0) {
          localBundle2.putIntegerArrayList("SKU_OFFER_TYPE_LIST", (ArrayList)localObject2);
        }
        if (i != 0) {
          localBundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", (ArrayList)localObject3);
        }
        localObject2 = localObject1;
        localObject3 = localSkuDetails;
        if (localArrayList1.size() > 1)
        {
          localObject2 = new ArrayList(localArrayList1.size() - 1);
          localObject3 = new ArrayList(localArrayList1.size() - 1);
          for (i = 1; i < localArrayList1.size(); i++)
          {
            ((ArrayList)localObject2).add(((SkuDetails)localArrayList1.get(i)).getSku());
            ((ArrayList)localObject3).add(((SkuDetails)localArrayList1.get(i)).getType());
          }
          localBundle2.putStringArrayList("additionalSkus", (ArrayList)localObject2);
          localBundle2.putStringArrayList("additionalSkuTypes", (ArrayList)localObject3);
          localObject2 = localObject1;
          localObject3 = localSkuDetails;
        }
      }
      else
      {
        localArrayList2 = new ArrayList(localList.size() - 1);
        localArrayList1 = new ArrayList(localList.size() - 1);
        localArrayList4 = new ArrayList();
        localArrayList3 = new ArrayList();
        localObject4 = new ArrayList();
        for (j = 0; j < localList.size(); j++)
        {
          localObject2 = (BillingFlowParams.ProductDetailsParams)localList.get(j);
          localObject3 = ((BillingFlowParams.ProductDetailsParams)localObject2).zza();
          if (!((ProductDetails)localObject3).zzb().isEmpty()) {
            localArrayList4.add(((ProductDetails)localObject3).zzb());
          }
          localArrayList3.add(((BillingFlowParams.ProductDetailsParams)localObject2).zzb());
          if (!TextUtils.isEmpty(((ProductDetails)localObject3).zzc())) {
            ((ArrayList)localObject4).add(((ProductDetails)localObject3).zzc());
          }
          if (j > 0)
          {
            localArrayList2.add(((BillingFlowParams.ProductDetailsParams)localList.get(j)).zza().getProductId());
            localArrayList1.add(((BillingFlowParams.ProductDetailsParams)localList.get(j)).zza().getProductType());
          }
        }
        localBundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", localArrayList3);
        if (!localArrayList4.isEmpty()) {
          localBundle2.putStringArrayList("skuDetailsTokens", localArrayList4);
        }
        if (!((ArrayList)localObject4).isEmpty()) {
          localBundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", (ArrayList)localObject4);
        }
        localObject2 = localObject1;
        localObject3 = localSkuDetails;
        if (!localArrayList2.isEmpty())
        {
          localBundle2.putStringArrayList("additionalSkus", localArrayList2);
          localBundle2.putStringArrayList("additionalSkuTypes", localArrayList1);
          localObject3 = localSkuDetails;
          localObject2 = localObject1;
        }
      }
      boolean bool3 = localBundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST");
      if ((bool3) && (!this.zzp))
      {
        paramActivity = zzbc.zzu;
        zzG(paramActivity);
        return paramActivity;
      }
      if ((localObject3 != null) && (!TextUtils.isEmpty(((SkuDetails)localObject3).zzd()))) {
        localBundle2.putString("skuPackageName", ((SkuDetails)localObject3).zzd());
      }
      for (;;)
      {
        j = 1;
        break label1156;
        if ((localObject2 == null) || (TextUtils.isEmpty(((BillingFlowParams.ProductDetailsParams)localObject2).zza().zza()))) {
          break;
        }
        localBundle2.putString("skuPackageName", ((BillingFlowParams.ProductDetailsParams)localObject2).zza().zza());
      }
      j = 0;
      label1156:
      if (!TextUtils.isEmpty(null)) {
        localBundle2.putString("accountName", null);
      }
      localObject1 = paramActivity.getIntent();
      if (localObject1 == null)
      {
        zzb.zzo("BillingClient", "Activity's intent is null.");
      }
      else if (!TextUtils.isEmpty(((Intent)localObject1).getStringExtra("PROXY_PACKAGE")))
      {
        localObject1 = ((Intent)localObject1).getStringExtra("PROXY_PACKAGE");
        localBundle2.putString("proxyPackage", (String)localObject1);
        try
        {
          localObject1 = this.zze.getPackageManager().getPackageInfo((String)localObject1, 0).versionName;
          localBundle2.putString("proxyPackageVersion", "package not found");
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          try
          {
            localBundle2.putString("proxyPackageVersion", (String)localObject1);
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException2)
          {
            for (;;) {}
          }
          localNameNotFoundException1 = localNameNotFoundException1;
        }
      }
      if ((this.zzs) && (!localList.isEmpty())) {
        j = 17;
      } else if ((this.zzq) && (j != 0)) {
        j = 15;
      } else if (this.zzm) {
        j = 9;
      } else {
        j = 6;
      }
      paramBillingFlowParams = zzJ(new zzac(this, j, str2, str1, paramBillingFlowParams, localBundle2), 5000L, null, this.zzc);
    }
    else
    {
      paramBillingFlowParams = zzJ(new zzad(this, str2, str1), 5000L, null, this.zzc);
    }
    try
    {
      Bundle localBundle1 = (Bundle)paramBillingFlowParams.get(5000L, TimeUnit.MILLISECONDS);
      j = zzb.zzb(localBundle1, "BillingClient");
      paramBillingFlowParams = zzb.zzk(localBundle1, "BillingClient");
      if (j != 0)
      {
        paramActivity = new java/lang/StringBuilder;
        paramActivity.<init>();
        paramActivity.append("Unable to buy item, Error response code: ");
        paramActivity.append(j);
        zzb.zzo("BillingClient", paramActivity.toString());
        paramActivity = BillingResult.newBuilder();
        paramActivity.setResponseCode(j);
        paramActivity.setDebugMessage(paramBillingFlowParams);
        paramActivity = paramActivity.build();
        zzG(paramActivity);
        return paramActivity;
      }
      paramBillingFlowParams = new android/content/Intent;
      paramBillingFlowParams.<init>(paramActivity, ProxyBillingActivity.class);
      paramBillingFlowParams.putExtra("BUY_INTENT", (PendingIntent)localBundle1.getParcelable("BUY_INTENT"));
      paramActivity.startActivity(paramBillingFlowParams);
      return zzbc.zzl;
    }
    catch (Exception paramActivity)
    {
      zzb.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", paramActivity);
      paramActivity = zzbc.zzm;
      zzG(paramActivity);
      return paramActivity;
    }
    catch (CancellationException paramActivity) {}catch (TimeoutException paramActivity) {}
    zzb.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", paramActivity);
    paramActivity = zzbc.zzn;
    zzG(paramActivity);
    return paramActivity;
  }
  
  public void launchPriceChangeConfirmationFlow(Activity paramActivity, PriceChangeFlowParams paramPriceChangeFlowParams, PriceChangeConfirmationListener paramPriceChangeConfirmationListener)
  {
    if (!isReady())
    {
      zzK(zzbc.zzm, paramPriceChangeConfirmationListener);
      return;
    }
    if ((paramPriceChangeFlowParams != null) && (paramPriceChangeFlowParams.getSkuDetails() != null))
    {
      paramPriceChangeFlowParams = paramPriceChangeFlowParams.getSkuDetails().getSku();
      if (paramPriceChangeFlowParams == null)
      {
        zzb.zzo("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
        zzK(zzbc.zzk, paramPriceChangeConfirmationListener);
        return;
      }
      if (!this.zzl)
      {
        zzb.zzo("BillingClient", "Current client doesn't support price change confirmation flow.");
        zzK(zzbc.zzr, paramPriceChangeConfirmationListener);
        return;
      }
      Object localObject1 = new Bundle();
      ((Bundle)localObject1).putString("playBillingLibraryVersion", this.zzb);
      ((Bundle)localObject1).putBoolean("subs_price_change", true);
      localObject1 = zzJ(new zzs(this, paramPriceChangeFlowParams, (Bundle)localObject1), 5000L, null, this.zzc);
      try
      {
        localObject1 = (Bundle)((Future)localObject1).get(5000L, TimeUnit.MILLISECONDS);
        int i = zzb.zzb((Bundle)localObject1, "BillingClient");
        Object localObject3 = zzb.zzk((Bundle)localObject1, "BillingClient");
        Object localObject2 = BillingResult.newBuilder();
        ((BillingResult.Builder)localObject2).setResponseCode(i);
        ((BillingResult.Builder)localObject2).setDebugMessage((String)localObject3);
        localObject2 = ((BillingResult.Builder)localObject2).build();
        if (i != 0)
        {
          paramActivity = new java/lang/StringBuilder;
          paramActivity.<init>();
          paramActivity.append("Unable to launch price change flow, error response code: ");
          paramActivity.append(i);
          zzb.zzo("BillingClient", paramActivity.toString());
          zzK((BillingResult)localObject2, paramPriceChangeConfirmationListener);
          return;
        }
        localObject2 = new com/android/billingclient/api/zzai;
        ((zzai)localObject2).<init>(this, this.zzc, paramPriceChangeConfirmationListener);
        localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>(paramActivity, ProxyBillingActivity.class);
        ((Intent)localObject3).putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent)((Bundle)localObject1).getParcelable("SUBS_MANAGEMENT_INTENT"));
        ((Intent)localObject3).putExtra("result_receiver", (Parcelable)localObject2);
        paramActivity.startActivity((Intent)localObject3);
        return;
      }
      catch (Exception localException)
      {
        paramActivity = new StringBuilder();
        paramActivity.append("Exception caught while launching Price Change Flow for sku: ");
        paramActivity.append(paramPriceChangeFlowParams);
        paramActivity.append("; try to reconnect");
        zzb.zzp("BillingClient", paramActivity.toString(), localException);
        zzK(zzbc.zzm, paramPriceChangeConfirmationListener);
        return;
      }
      catch (CancellationException paramActivity) {}catch (TimeoutException paramActivity) {}
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Time out while launching Price Change Flow for sku: ");
      localStringBuilder.append(paramPriceChangeFlowParams);
      localStringBuilder.append("; try to reconnect");
      zzb.zzp("BillingClient", localStringBuilder.toString(), paramActivity);
      zzK(zzbc.zzn, paramPriceChangeConfirmationListener);
      return;
    }
    zzb.zzo("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
    zzK(zzbc.zzk, paramPriceChangeConfirmationListener);
  }
  
  public void queryProductDetailsAsync(QueryProductDetailsParams paramQueryProductDetailsParams, ProductDetailsResponseListener paramProductDetailsResponseListener)
  {
    if (!isReady())
    {
      paramProductDetailsResponseListener.onProductDetailsResponse(zzbc.zzm, new ArrayList());
      return;
    }
    if (!this.zzs)
    {
      zzb.zzo("BillingClient", "Querying product details is not supported.");
      paramProductDetailsResponseListener.onProductDetailsResponse(zzbc.zzv, new ArrayList());
      return;
    }
    if (zzJ(new zzt(this, paramQueryProductDetailsParams, paramProductDetailsResponseListener), 30000L, new zzu(paramProductDetailsResponseListener), zzF()) == null) {
      paramProductDetailsResponseListener.onProductDetailsResponse(zzH(), new ArrayList());
    }
  }
  
  public void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams paramQueryPurchaseHistoryParams, PurchaseHistoryResponseListener paramPurchaseHistoryResponseListener)
  {
    zzL(paramQueryPurchaseHistoryParams.zza(), paramPurchaseHistoryResponseListener);
  }
  
  public final void queryPurchaseHistoryAsync(String paramString, PurchaseHistoryResponseListener paramPurchaseHistoryResponseListener)
  {
    zzL(paramString, paramPurchaseHistoryResponseListener);
  }
  
  public void queryPurchasesAsync(QueryPurchasesParams paramQueryPurchasesParams, PurchasesResponseListener paramPurchasesResponseListener)
  {
    zzM(paramQueryPurchasesParams.zza(), paramPurchasesResponseListener);
  }
  
  public void queryPurchasesAsync(String paramString, PurchasesResponseListener paramPurchasesResponseListener)
  {
    zzM(paramString, paramPurchasesResponseListener);
  }
  
  public final void querySkuDetailsAsync(SkuDetailsParams paramSkuDetailsParams, SkuDetailsResponseListener paramSkuDetailsResponseListener)
  {
    if (!isReady())
    {
      paramSkuDetailsResponseListener.onSkuDetailsResponse(zzbc.zzm, null);
      return;
    }
    String str1 = paramSkuDetailsParams.getSkuType();
    Object localObject = paramSkuDetailsParams.getSkusList();
    if (!TextUtils.isEmpty(str1))
    {
      if (localObject != null)
      {
        paramSkuDetailsParams = new ArrayList();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str2 = (String)((Iterator)localObject).next();
          zzbv localzzbv = new zzbv(null);
          localzzbv.zza(str2);
          paramSkuDetailsParams.add(localzzbv.zzb());
        }
        if (zzJ(new zzr(this, str1, paramSkuDetailsParams, null, paramSkuDetailsResponseListener), 30000L, new zzz(paramSkuDetailsResponseListener), zzF()) == null) {
          paramSkuDetailsResponseListener.onSkuDetailsResponse(zzH(), null);
        }
        return;
      }
      zzb.zzo("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
      paramSkuDetailsResponseListener.onSkuDetailsResponse(zzbc.zze, null);
      return;
    }
    zzb.zzo("BillingClient", "Please fix the input params. SKU type can't be empty.");
    paramSkuDetailsResponseListener.onSkuDetailsResponse(zzbc.zzf, null);
  }
  
  public BillingResult showInAppMessages(Activity paramActivity, InAppMessageParams paramInAppMessageParams, InAppMessageResponseListener paramInAppMessageResponseListener)
  {
    if (!isReady())
    {
      zzb.zzo("BillingClient", "Service disconnected.");
      return zzbc.zzm;
    }
    if (!this.zzo)
    {
      zzb.zzo("BillingClient", "Current client doesn't support showing in-app messages.");
      return zzbc.zzw;
    }
    Object localObject = paramActivity.findViewById(16908290);
    IBinder localIBinder = ((View)localObject).getWindowToken();
    Rect localRect = new Rect();
    ((View)localObject).getGlobalVisibleRect(localRect);
    localObject = new Bundle();
    BundleCompat.putBinder((Bundle)localObject, "KEY_WINDOW_TOKEN", localIBinder);
    ((Bundle)localObject).putInt("KEY_DIMEN_LEFT", localRect.left);
    ((Bundle)localObject).putInt("KEY_DIMEN_TOP", localRect.top);
    ((Bundle)localObject).putInt("KEY_DIMEN_RIGHT", localRect.right);
    ((Bundle)localObject).putInt("KEY_DIMEN_BOTTOM", localRect.bottom);
    ((Bundle)localObject).putString("playBillingLibraryVersion", this.zzb);
    ((Bundle)localObject).putIntegerArrayList("KEY_CATEGORY_IDS", paramInAppMessageParams.getInAppMessageCategoriesToShow());
    zzJ(new zzaf(this, (Bundle)localObject, paramActivity, new zzal(this, this.zzc, paramInAppMessageResponseListener)), 5000L, null, this.zzc);
    return zzbc.zzl;
  }
  
  public final void startConnection(BillingClientStateListener paramBillingClientStateListener)
  {
    if (isReady())
    {
      zzb.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
      paramBillingClientStateListener.onBillingSetupFinished(zzbc.zzl);
      return;
    }
    if (this.zza == 1)
    {
      zzb.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
      paramBillingClientStateListener.onBillingSetupFinished(zzbc.zzd);
      return;
    }
    if (this.zza == 3)
    {
      zzb.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
      paramBillingClientStateListener.onBillingSetupFinished(zzbc.zzm);
      return;
    }
    this.zza = 1;
    this.zzd.zze();
    zzb.zzn("BillingClient", "Starting in-app billing setup.");
    this.zzg = new zzaq(this, paramBillingClientStateListener, null);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    Object localObject1 = this.zze.getPackageManager().queryIntentServices(localIntent, 0);
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      Object localObject2 = (ResolveInfo)((List)localObject1).get(0);
      if (((ResolveInfo)localObject2).serviceInfo != null)
      {
        localObject1 = ((ResolveInfo)localObject2).serviceInfo.packageName;
        localObject2 = ((ResolveInfo)localObject2).serviceInfo.name;
        if (("com.android.vending".equals(localObject1)) && (localObject2 != null))
        {
          localObject1 = new ComponentName((String)localObject1, (String)localObject2);
          localIntent = new Intent(localIntent);
          localIntent.setComponent((ComponentName)localObject1);
          localIntent.putExtra("playBillingLibraryVersion", this.zzb);
          if (this.zze.bindService(localIntent, this.zzg, 1))
          {
            zzb.zzn("BillingClient", "Service was bonded successfully.");
            return;
          }
          zzb.zzo("BillingClient", "Connection to Billing service is blocked.");
        }
        else
        {
          zzb.zzo("BillingClient", "The device doesn't have valid Play Store.");
        }
      }
    }
    this.zza = 0;
    zzb.zzn("BillingClient", "Billing service unavailable on device.");
    paramBillingClientStateListener.onBillingSetupFinished(zzbc.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\BillingClientImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */