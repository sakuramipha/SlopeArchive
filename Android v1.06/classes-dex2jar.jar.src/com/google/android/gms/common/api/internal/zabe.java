package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zabe
  extends GoogleApiClient
  implements zabz
{
  final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zaa = new LinkedList();
  zabx zab;
  final Map<Api.AnyClientKey<?>, Api.Client> zac;
  Set<Scope> zad;
  final ClientSettings zae;
  final Map<Api<?>, Boolean> zaf;
  final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zag;
  Set<zada> zah;
  final zadc zai;
  private final Lock zaj;
  private final com.google.android.gms.common.internal.zak zak;
  private zaca zal = null;
  private final int zam;
  private final Context zan;
  private final Looper zao;
  private volatile boolean zap;
  private long zaq;
  private long zar;
  private final zabc zas;
  private final GoogleApiAvailability zat;
  private final ListenerHolders zau;
  private final ArrayList<zat> zav;
  private Integer zaw;
  private final zaj zax;
  
  public zabe(Context paramContext, Lock paramLock, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiAvailability paramGoogleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> paramAbstractClientBuilder, Map<Api<?>, Boolean> paramMap, List<GoogleApiClient.ConnectionCallbacks> paramList, List<GoogleApiClient.OnConnectionFailedListener> paramList1, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, int paramInt1, int paramInt2, ArrayList<zat> paramArrayList)
  {
    long l;
    if (true != ClientLibraryUtils.isPackageSide()) {
      l = 120000L;
    } else {
      l = 10000L;
    }
    this.zaq = l;
    this.zar = 5000L;
    this.zad = new HashSet();
    this.zau = new ListenerHolders();
    this.zaw = null;
    this.zah = null;
    zaay localzaay = new zaay(this);
    this.zax = localzaay;
    this.zan = paramContext;
    this.zaj = paramLock;
    this.zak = new com.google.android.gms.common.internal.zak(paramLooper, localzaay);
    this.zao = paramLooper;
    this.zas = new zabc(this, paramLooper);
    this.zat = paramGoogleApiAvailability;
    this.zam = paramInt1;
    if (paramInt1 >= 0) {
      this.zaw = Integer.valueOf(paramInt2);
    }
    this.zaf = paramMap;
    this.zac = paramMap1;
    this.zav = paramArrayList;
    this.zai = new zadc();
    paramContext = paramList.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.ConnectionCallbacks)paramContext.next();
      this.zak.zaf(paramLock);
    }
    paramLock = paramList1.iterator();
    while (paramLock.hasNext())
    {
      paramContext = (GoogleApiClient.OnConnectionFailedListener)paramLock.next();
      this.zak.zag(paramContext);
    }
    this.zae = paramClientSettings;
    this.zag = paramAbstractClientBuilder;
  }
  
  public static int zad(Iterable<Api.Client> paramIterable, boolean paramBoolean)
  {
    paramIterable = paramIterable.iterator();
    boolean bool2 = false;
    boolean bool1 = false;
    while (paramIterable.hasNext())
    {
      Api.Client localClient = (Api.Client)paramIterable.next();
      bool2 |= localClient.requiresSignIn();
      bool1 |= localClient.providesSignIn();
    }
    if (bool2)
    {
      if ((bool1) && (paramBoolean)) {
        return 2;
      }
      return 1;
    }
    return 3;
  }
  
  static String zag(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return "UNKNOWN";
        }
        return "SIGN_IN_MODE_NONE";
      }
      return "SIGN_IN_MODE_OPTIONAL";
    }
    return "SIGN_IN_MODE_REQUIRED";
  }
  
  private final void zal(int paramInt)
  {
    Object localObject1 = this.zaw;
    if (localObject1 == null) {
      this.zaw = Integer.valueOf(paramInt);
    } else {
      if (((Integer)localObject1).intValue() != paramInt) {
        break label252;
      }
    }
    if (this.zal != null) {
      return;
    }
    localObject1 = this.zac.values().iterator();
    boolean bool = false;
    paramInt = 0;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Api.Client)((Iterator)localObject1).next();
      bool |= ((Api.Client)localObject2).requiresSignIn();
      paramInt |= ((Api.Client)localObject2).providesSignIn();
    }
    int i = this.zaw.intValue();
    if (i != 1)
    {
      if ((i == 2) && (bool)) {
        this.zal = zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
      }
    }
    else
    {
      if (!bool) {
        break label242;
      }
      if (paramInt != 0) {
        break label232;
      }
    }
    this.zal = new zabi(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    return;
    label232:
    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
    label242:
    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
    label252:
    Object localObject2 = zag(paramInt);
    String str = zag(this.zaw.intValue());
    localObject1 = new StringBuilder(((String)localObject2).length() + 51 + str.length());
    ((StringBuilder)localObject1).append("Cannot use sign-in mode: ");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(". Mode was already set to ");
    ((StringBuilder)localObject1).append(str);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  private final void zam(GoogleApiClient paramGoogleApiClient, StatusPendingResult paramStatusPendingResult, boolean paramBoolean)
  {
    Common.zaa.zaa(paramGoogleApiClient).setResultCallback(new zabb(this, paramStatusPendingResult, paramBoolean, paramGoogleApiClient));
  }
  
  private final void zan()
  {
    this.zak.zab();
    ((zaca)Preconditions.checkNotNull(this.zal)).zaq();
  }
  
  public final ConnectionResult blockingConnect()
  {
    Looper localLooper = Looper.myLooper();
    Object localObject1 = Looper.getMainLooper();
    boolean bool2 = true;
    boolean bool1;
    if (localLooper != localObject1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "blockingConnect must not be called on the UI thread");
    this.zaj.lock();
    try
    {
      if (this.zam >= 0)
      {
        if (this.zaw != null) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
        Preconditions.checkState(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
      }
      else
      {
        localObject1 = this.zaw;
        if (localObject1 == null) {
          this.zaw = Integer.valueOf(zad(this.zac.values(), false));
        } else {
          if (((Integer)localObject1).intValue() == 2) {
            break label162;
          }
        }
      }
      zal(((Integer)Preconditions.checkNotNull(this.zaw)).intValue());
      this.zak.zab();
      localObject1 = ((zaca)Preconditions.checkNotNull(this.zal)).zab();
      return (ConnectionResult)localObject1;
      label162:
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
      throw ((Throwable)localObject1);
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "blockingConnect must not be called on the UI thread");
    Preconditions.checkNotNull(paramTimeUnit, "TimeUnit must not be null");
    this.zaj.lock();
    try
    {
      Integer localInteger = this.zaw;
      if (localInteger == null) {
        this.zaw = Integer.valueOf(zad(this.zac.values(), false));
      } else {
        if (localInteger.intValue() == 2) {
          break label139;
        }
      }
      zal(((Integer)Preconditions.checkNotNull(this.zaw)).intValue());
      this.zak.zab();
      paramTimeUnit = ((zaca)Preconditions.checkNotNull(this.zal)).zac(paramLong, paramTimeUnit);
      return paramTimeUnit;
      label139:
      paramTimeUnit = new java/lang/IllegalStateException;
      paramTimeUnit.<init>("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
      throw paramTimeUnit;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final PendingResult<Status> clearDefaultAccountAndReconnect()
  {
    Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
    Object localObject1 = this.zaw;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (localObject1 != null) {
      if (((Integer)localObject1).intValue() != 2) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    Preconditions.checkState(bool1, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
    localObject1 = new StatusPendingResult(this);
    if (this.zac.containsKey(Common.CLIENT_KEY))
    {
      zam(this, (StatusPendingResult)localObject1, false);
    }
    else
    {
      AtomicReference localAtomicReference = new AtomicReference();
      zaaz localzaaz = new zaaz(this, localAtomicReference, (StatusPendingResult)localObject1);
      zaba localzaba = new zaba(this, (StatusPendingResult)localObject1);
      Object localObject2 = new GoogleApiClient.Builder(this.zan);
      ((GoogleApiClient.Builder)localObject2).addApi(Common.API);
      ((GoogleApiClient.Builder)localObject2).addConnectionCallbacks(localzaaz);
      ((GoogleApiClient.Builder)localObject2).addOnConnectionFailedListener(localzaba);
      ((GoogleApiClient.Builder)localObject2).setHandler(this.zas);
      localObject2 = ((GoogleApiClient.Builder)localObject2).build();
      localAtomicReference.set(localObject2);
      ((GoogleApiClient)localObject2).connect();
    }
    return (PendingResult<Status>)localObject1;
  }
  
  public final void connect()
  {
    this.zaj.lock();
    try
    {
      int i = this.zam;
      int j = 2;
      boolean bool2 = false;
      Object localObject1;
      if (i >= 0)
      {
        if (this.zaw != null) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        Preconditions.checkState(bool1, "Sign-in mode should have been set explicitly by auto-manage.");
      }
      else
      {
        localObject1 = this.zaw;
        if (localObject1 == null) {
          this.zaw = Integer.valueOf(zad(this.zac.values(), false));
        } else {
          if (((Integer)localObject1).intValue() == 2) {
            break label220;
          }
        }
      }
      i = ((Integer)Preconditions.checkNotNull(this.zaw)).intValue();
      this.zaj.lock();
      if ((i != 3) && (i != 1)) {
        if (i == 2)
        {
          i = j;
        }
        else
        {
          bool1 = bool2;
          break label141;
        }
      }
      boolean bool1 = true;
      try
      {
        label141:
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>(33);
        ((StringBuilder)localObject1).append("Illegal sign-in mode: ");
        ((StringBuilder)localObject1).append(i);
        Preconditions.checkArgument(bool1, ((StringBuilder)localObject1).toString());
        zal(i);
        zan();
        return;
      }
      finally {}
      label220:
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
      throw localIllegalStateException;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final void connect(int paramInt)
  {
    this.zaj.lock();
    boolean bool2 = true;
    boolean bool1 = bool2;
    int i = paramInt;
    if (paramInt != 3)
    {
      bool1 = bool2;
      i = paramInt;
      if (paramInt != 1) {
        if (paramInt == 2)
        {
          i = 2;
          bool1 = bool2;
        }
        else
        {
          bool1 = false;
          i = paramInt;
        }
      }
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(33);
      localStringBuilder.append("Illegal sign-in mode: ");
      localStringBuilder.append(i);
      Preconditions.checkArgument(bool1, localStringBuilder.toString());
      zal(i);
      zan();
      return;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  /* Error */
  public final void disconnect()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 212 1 0
    //   9: aload_0
    //   10: getfield 149	com/google/android/gms/common/api/internal/zabe:zai	Lcom/google/android/gms/common/api/internal/zadc;
    //   13: invokevirtual 429	com/google/android/gms/common/api/internal/zadc:zab	()V
    //   16: aload_0
    //   17: getfield 66	com/google/android/gms/common/api/internal/zabe:zal	Lcom/google/android/gms/common/api/internal/zaca;
    //   20: astore_1
    //   21: aload_1
    //   22: ifnull +9 -> 31
    //   25: aload_1
    //   26: invokeinterface 431 1 0
    //   31: aload_0
    //   32: getfield 97	com/google/android/gms/common/api/internal/zabe:zau	Lcom/google/android/gms/common/api/internal/ListenerHolders;
    //   35: invokevirtual 432	com/google/android/gms/common/api/internal/ListenerHolders:zab	()V
    //   38: aload_0
    //   39: getfield 71	com/google/android/gms/common/api/internal/zabe:zaa	Ljava/util/Queue;
    //   42: invokeinterface 435 1 0
    //   47: astore_2
    //   48: aload_2
    //   49: invokeinterface 160 1 0
    //   54: ifeq +25 -> 79
    //   57: aload_2
    //   58: invokeinterface 164 1 0
    //   63: checkcast 437	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl
    //   66: astore_1
    //   67: aload_1
    //   68: aconst_null
    //   69: invokevirtual 442	com/google/android/gms/common/api/internal/BasePendingResult:zan	(Lcom/google/android/gms/common/api/internal/zadb;)V
    //   72: aload_1
    //   73: invokevirtual 445	com/google/android/gms/common/api/internal/BasePendingResult:cancel	()V
    //   76: goto -28 -> 48
    //   79: aload_0
    //   80: getfield 71	com/google/android/gms/common/api/internal/zabe:zaa	Ljava/util/Queue;
    //   83: invokeinterface 448 1 0
    //   88: aload_0
    //   89: getfield 66	com/google/android/gms/common/api/internal/zabe:zal	Lcom/google/android/gms/common/api/internal/zaca;
    //   92: astore_1
    //   93: aload_1
    //   94: ifnonnull +15 -> 109
    //   97: aload_0
    //   98: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   101: astore_1
    //   102: aload_1
    //   103: invokeinterface 219 1 0
    //   108: return
    //   109: aload_0
    //   110: invokevirtual 221	com/google/android/gms/common/api/internal/zabe:zak	()Z
    //   113: pop
    //   114: aload_0
    //   115: getfield 119	com/google/android/gms/common/api/internal/zabe:zak	Lcom/google/android/gms/common/internal/zak;
    //   118: invokevirtual 450	com/google/android/gms/common/internal/zak:zaa	()V
    //   121: aload_0
    //   122: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   125: astore_1
    //   126: goto -24 -> 102
    //   129: astore_1
    //   130: aload_0
    //   131: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   134: invokeinterface 219 1 0
    //   139: aload_1
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	zabe
    //   20	106	1	localObject1	Object
    //   129	11	1	localObject2	Object
    //   47	11	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   9	21	129	finally
    //   25	31	129	finally
    //   31	48	129	finally
    //   48	76	129	finally
    //   79	93	129	finally
    //   109	121	129	finally
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(this.zan);
    paramPrintWriter.append(paramString).append("mResuming=").print(this.zap);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
    Object localObject = this.zai;
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(((zadc)localObject).zab.size());
    localObject = this.zal;
    if (localObject != null) {
      ((zaca)localObject).zas(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  /* Error */
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 493	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getApi	()Lcom/google/android/gms/common/api/Api;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield 142	com/google/android/gms/common/api/internal/zabe:zac	Ljava/util/Map;
    //   9: aload_1
    //   10: invokevirtual 497	com/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl:getClientKey	()Lcom/google/android/gms/common/api/Api$AnyClientKey;
    //   13: invokeinterface 368 2 0
    //   18: istore_2
    //   19: aload_3
    //   20: ifnull +11 -> 31
    //   23: aload_3
    //   24: invokevirtual 501	com/google/android/gms/common/api/Api:zad	()Ljava/lang/String;
    //   27: astore_3
    //   28: goto +7 -> 35
    //   31: ldc_w 503
    //   34: astore_3
    //   35: new 258	java/lang/StringBuilder
    //   38: dup
    //   39: aload_3
    //   40: invokestatic 506	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   43: invokevirtual 263	java/lang/String:length	()I
    //   46: bipush 65
    //   48: iadd
    //   49: invokespecial 265	java/lang/StringBuilder:<init>	(I)V
    //   52: astore 4
    //   54: aload 4
    //   56: ldc_w 508
    //   59: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload 4
    //   65: aload_3
    //   66: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload 4
    //   72: ldc_w 510
    //   75: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: iload_2
    //   80: aload 4
    //   82: invokevirtual 277	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokestatic 425	com/google/android/gms/common/internal/Preconditions:checkArgument	(ZLjava/lang/Object;)V
    //   88: aload_0
    //   89: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   92: invokeinterface 212 1 0
    //   97: aload_0
    //   98: getfield 66	com/google/android/gms/common/api/internal/zabe:zal	Lcom/google/android/gms/common/api/internal/zaca;
    //   101: astore_3
    //   102: aload_3
    //   103: ifnonnull +27 -> 130
    //   106: aload_0
    //   107: getfield 71	com/google/android/gms/common/api/internal/zabe:zaa	Ljava/util/Queue;
    //   110: aload_1
    //   111: invokeinterface 513 2 0
    //   116: pop
    //   117: aload_0
    //   118: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   121: astore_3
    //   122: aload_3
    //   123: invokeinterface 219 1 0
    //   128: aload_1
    //   129: areturn
    //   130: aload_3
    //   131: aload_1
    //   132: invokeinterface 515 2 0
    //   137: astore_1
    //   138: aload_0
    //   139: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   142: astore_3
    //   143: goto -21 -> 122
    //   146: astore_1
    //   147: aload_0
    //   148: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   151: invokeinterface 219 1 0
    //   156: aload_1
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	zabe
    //   0	158	1	paramT	T
    //   18	62	2	bool	boolean
    //   4	139	3	localObject	Object
    //   52	29	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   97	102	146	finally
    //   106	117	146	finally
    //   130	138	146	finally
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    Object localObject = paramT.getApi();
    boolean bool = this.zac.containsKey(paramT.getClientKey());
    if (localObject != null) {
      localObject = ((Api)localObject).zad();
    } else {
      localObject = "the API";
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 65);
    localStringBuilder.append("GoogleApiClient is not configured to use ");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" required for this call.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    this.zaj.lock();
    try
    {
      localObject = this.zal;
      if (localObject != null)
      {
        if (this.zap)
        {
          this.zaa.add(paramT);
          while (!this.zaa.isEmpty())
          {
            localObject = (BaseImplementation.ApiMethodImpl)this.zaa.remove();
            this.zai.zaa((BasePendingResult)localObject);
            ((BaseImplementation.ApiMethodImpl)localObject).setFailedResult(Status.RESULT_INTERNAL_ERROR);
          }
        }
        for (localObject = this.zaj;; localObject = this.zaj)
        {
          ((Lock)localObject).unlock();
          return paramT;
          paramT = ((zaca)localObject).zaf(paramT);
        }
      }
      paramT = new java/lang/IllegalStateException;
      paramT.<init>("GoogleApiClient is not connected yet.");
      throw paramT;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> paramAnyClientKey)
  {
    paramAnyClientKey = (Api.Client)this.zac.get(paramAnyClientKey);
    Preconditions.checkNotNull(paramAnyClientKey, "Appropriate Api was not requested.");
    return paramAnyClientKey;
  }
  
  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    this.zaj.lock();
    try
    {
      if ((!isConnected()) && (!this.zap))
      {
        paramApi = new java/lang/IllegalStateException;
        paramApi.<init>("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        throw paramApi;
      }
      if (this.zac.containsKey(paramApi.zab()))
      {
        localObject = ((zaca)Preconditions.checkNotNull(this.zal)).zad(paramApi);
        if (localObject == null)
        {
          if (this.zap) {
            localObject = ConnectionResult.RESULT_SUCCESS;
          }
          for (paramApi = this.zaj;; paramApi = this.zaj)
          {
            paramApi.unlock();
            return (ConnectionResult)localObject;
            Log.w("GoogleApiClientImpl", zaf());
            localObject = String.valueOf(paramApi.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
            paramApi = new java/lang/Exception;
            paramApi.<init>();
            Log.wtf("GoogleApiClientImpl", (String)localObject, paramApi);
            localObject = new ConnectionResult(8, null);
          }
        }
        return (ConnectionResult)localObject;
      }
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(String.valueOf(paramApi.zad()).concat(" was never registered with GoogleApiClient"));
      throw ((Throwable)localObject);
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final Context getContext()
  {
    return this.zan;
  }
  
  public final Looper getLooper()
  {
    return this.zao;
  }
  
  public final boolean hasApi(Api<?> paramApi)
  {
    return this.zac.containsKey(paramApi.zab());
  }
  
  public final boolean hasConnectedApi(Api<?> paramApi)
  {
    if (!isConnected()) {
      return false;
    }
    paramApi = (Api.Client)this.zac.get(paramApi.zab());
    return (paramApi != null) && (paramApi.isConnected());
  }
  
  public final boolean isConnected()
  {
    zaca localzaca = this.zal;
    return (localzaca != null) && (localzaca.zaw());
  }
  
  public final boolean isConnecting()
  {
    zaca localzaca = this.zal;
    return (localzaca != null) && (localzaca.zax());
  }
  
  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.zak.zaj(paramConnectionCallbacks);
  }
  
  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.zak.zak(paramOnConnectionFailedListener);
  }
  
  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    zaca localzaca = this.zal;
    return (localzaca != null) && (localzaca.zay(paramSignInConnectionListener));
  }
  
  public final void maybeSignOut()
  {
    zaca localzaca = this.zal;
    if (localzaca != null) {
      localzaca.zau();
    }
  }
  
  public final void reconnect()
  {
    disconnect();
    connect();
  }
  
  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zak.zaf(paramConnectionCallbacks);
  }
  
  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zak.zag(paramOnConnectionFailedListener);
  }
  
  public final <L> ListenerHolder<L> registerListener(L paramL)
  {
    this.zaj.lock();
    try
    {
      paramL = this.zau.zaa(paramL, this.zao, "NO_TYPE");
      return paramL;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  public final void stopAutoManage(FragmentActivity paramFragmentActivity)
  {
    paramFragmentActivity = new LifecycleActivity(paramFragmentActivity);
    if (this.zam >= 0)
    {
      zak.zaa(paramFragmentActivity).zae(this.zam);
      return;
    }
    throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
  }
  
  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.zak.zah(paramConnectionCallbacks);
  }
  
  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zak.zai(paramOnConnectionFailedListener);
  }
  
  public final void zaa(ConnectionResult paramConnectionResult)
  {
    if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, paramConnectionResult.getErrorCode())) {
      zak();
    }
    if (!this.zap)
    {
      this.zak.zac(paramConnectionResult);
      this.zak.zaa();
    }
  }
  
  public final void zab(Bundle paramBundle)
  {
    while (!this.zaa.isEmpty()) {
      execute((BaseImplementation.ApiMethodImpl)this.zaa.remove());
    }
    this.zak.zad(paramBundle);
  }
  
  public final void zac(int paramInt, boolean paramBoolean)
  {
    int i = paramInt;
    if (paramInt == 1) {
      if ((!paramBoolean) && (!this.zap))
      {
        this.zap = true;
        if ((this.zab != null) || (ClientLibraryUtils.isPackageSide())) {}
      }
    }
    try
    {
      GoogleApiAvailability localGoogleApiAvailability = this.zat;
      Context localContext = this.zan.getApplicationContext();
      Object localObject = new com/google/android/gms/common/api/internal/zabd;
      ((zabd)localObject).<init>(this);
      this.zab = localGoogleApiAvailability.zac(localContext, (zabw)localObject);
      localObject = this.zas;
      ((zabc)localObject).sendMessageDelayed(((zabc)localObject).obtainMessage(1), this.zaq);
      localObject = this.zas;
      ((zabc)localObject).sendMessageDelayed(((zabc)localObject).obtainMessage(2), this.zar);
      i = 1;
      localObject = this.zai.zab;
      paramInt = 0;
      localObject = (BasePendingResult[])((Set)localObject).toArray(new BasePendingResult[0]);
      int j = localObject.length;
      while (paramInt < j)
      {
        localObject[paramInt].forceFailureUnlessReady(zadc.zaa);
        paramInt++;
      }
      this.zak.zae(i);
      this.zak.zaa();
      if (i == 2) {
        zan();
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
  }
  
  final String zaf()
  {
    StringWriter localStringWriter = new StringWriter();
    dump("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
  
  final boolean zak()
  {
    if (!this.zap) {
      return false;
    }
    this.zap = false;
    this.zas.removeMessages(2);
    this.zas.removeMessages(1);
    zabx localzabx = this.zab;
    if (localzabx != null)
    {
      localzabx.zab();
      this.zab = null;
    }
    return true;
  }
  
  public final void zao(zada paramzada)
  {
    this.zaj.lock();
    try
    {
      if (this.zah == null)
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        this.zah = localHashSet;
      }
      this.zah.add(paramzada);
      return;
    }
    finally
    {
      this.zaj.unlock();
    }
  }
  
  /* Error */
  public final void zap(zada paramzada)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 212 1 0
    //   9: aload_0
    //   10: getfield 101	com/google/android/gms/common/api/internal/zabe:zah	Ljava/util/Set;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull +25 -> 40
    //   18: new 579	java/lang/Exception
    //   21: astore_1
    //   22: aload_1
    //   23: invokespecial 580	java/lang/Exception:<init>	()V
    //   26: ldc_w 563
    //   29: ldc_w 731
    //   32: aload_1
    //   33: invokestatic 584	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   36: pop
    //   37: goto +102 -> 139
    //   40: aload_3
    //   41: aload_1
    //   42: invokeinterface 733 2 0
    //   47: ifne +25 -> 72
    //   50: new 579	java/lang/Exception
    //   53: astore_1
    //   54: aload_1
    //   55: invokespecial 580	java/lang/Exception:<init>	()V
    //   58: ldc_w 563
    //   61: ldc_w 735
    //   64: aload_1
    //   65: invokestatic 584	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   68: pop
    //   69: goto +70 -> 139
    //   72: aload_0
    //   73: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   76: invokeinterface 212 1 0
    //   81: aload_0
    //   82: getfield 101	com/google/android/gms/common/api/internal/zabe:zah	Ljava/util/Set;
    //   85: astore_1
    //   86: aload_1
    //   87: ifnonnull +15 -> 102
    //   90: aload_0
    //   91: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   94: invokeinterface 219 1 0
    //   99: goto +25 -> 124
    //   102: aload_1
    //   103: invokeinterface 736 1 0
    //   108: istore_2
    //   109: aload_0
    //   110: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   113: invokeinterface 219 1 0
    //   118: iload_2
    //   119: iconst_1
    //   120: ixor
    //   121: ifne +18 -> 139
    //   124: aload_0
    //   125: getfield 66	com/google/android/gms/common/api/internal/zabe:zal	Lcom/google/android/gms/common/api/internal/zaca;
    //   128: astore_1
    //   129: aload_1
    //   130: ifnull +9 -> 139
    //   133: aload_1
    //   134: invokeinterface 738 1 0
    //   139: aload_0
    //   140: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   143: invokeinterface 219 1 0
    //   148: return
    //   149: astore_1
    //   150: aload_0
    //   151: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   154: invokeinterface 219 1 0
    //   159: aload_1
    //   160: athrow
    //   161: astore_1
    //   162: aload_0
    //   163: getfield 112	com/google/android/gms/common/api/internal/zabe:zaj	Ljava/util/concurrent/locks/Lock;
    //   166: invokeinterface 219 1 0
    //   171: aload_1
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	zabe
    //   0	173	1	paramzada	zada
    //   108	13	2	bool	boolean
    //   13	28	3	localSet	Set
    // Exception table:
    //   from	to	target	type
    //   81	86	149	finally
    //   102	109	149	finally
    //   9	14	161	finally
    //   18	37	161	finally
    //   40	69	161	finally
    //   72	81	161	finally
    //   90	99	161	finally
    //   109	118	161	finally
    //   124	129	161	finally
    //   133	139	161	finally
    //   150	161	161	finally
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */