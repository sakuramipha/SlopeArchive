package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zabi
  implements zaca, zau
{
  final Map<Api.AnyClientKey<?>, Api.Client> zaa;
  final Map<Api.AnyClientKey<?>, ConnectionResult> zab = new HashMap();
  final ClientSettings zac;
  final Map<Api<?>, Boolean> zad;
  final Api.AbstractClientBuilder<? extends zae, SignInOptions> zae;
  int zaf;
  final zabe zag;
  final zabz zah;
  private final Lock zai;
  private final Condition zaj;
  private final Context zak;
  private final GoogleApiAvailabilityLight zal;
  private final zabh zam;
  @NotOnlyInitialized
  private volatile zabf zan;
  private ConnectionResult zao = null;
  
  public zabi(Context paramContext, zabe paramzabe, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends zae, SignInOptions> paramAbstractClientBuilder, ArrayList<zat> paramArrayList, zabz paramzabz)
  {
    this.zak = paramContext;
    this.zai = paramLock;
    this.zal = paramGoogleApiAvailabilityLight;
    this.zaa = paramMap;
    this.zac = paramClientSettings;
    this.zad = paramMap1;
    this.zae = paramAbstractClientBuilder;
    this.zag = paramzabe;
    this.zah = paramzabz;
    int j = paramArrayList.size();
    for (int i = 0; i < j; i++) {
      ((zat)paramArrayList.get(i)).zaa(this);
    }
    this.zam = new zabh(this, paramLooper);
    this.zaj = paramLock.newCondition();
    this.zan = new zaax(this);
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    this.zai.lock();
    try
    {
      this.zan.zag(paramBundle);
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zai.lock();
    try
    {
      this.zan.zai(paramInt);
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  public final void zaa(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    this.zai.lock();
    try
    {
      this.zan.zah(paramConnectionResult, paramApi, paramBoolean);
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  public final ConnectionResult zab()
  {
    zaq();
    while ((this.zan instanceof zaaw)) {
      try
      {
        this.zaj.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        return new ConnectionResult(15, null);
      }
    }
    if ((this.zan instanceof zaaj)) {
      return ConnectionResult.RESULT_SUCCESS;
    }
    ConnectionResult localConnectionResult = this.zao;
    if (localConnectionResult != null) {
      return localConnectionResult;
    }
    return new ConnectionResult(13, null);
  }
  
  public final ConnectionResult zac(long paramLong, TimeUnit paramTimeUnit)
  {
    zaq();
    for (paramLong = paramTimeUnit.toNanos(paramLong); (this.zan instanceof zaaw); paramLong = this.zaj.awaitNanos(paramLong))
    {
      if (paramLong <= 0L) {}
      try
      {
        zar();
        return new ConnectionResult(14, null);
      }
      catch (InterruptedException paramTimeUnit)
      {
        Thread.currentThread().interrupt();
        return new ConnectionResult(15, null);
      }
    }
    if ((this.zan instanceof zaaj)) {
      return ConnectionResult.RESULT_SUCCESS;
    }
    paramTimeUnit = this.zao;
    if (paramTimeUnit != null) {
      return paramTimeUnit;
    }
    return new ConnectionResult(13, null);
  }
  
  public final ConnectionResult zad(Api<?> paramApi)
  {
    paramApi = paramApi.zab();
    if (this.zaa.containsKey(paramApi))
    {
      if (((Api.Client)this.zaa.get(paramApi)).isConnected()) {
        return ConnectionResult.RESULT_SUCCESS;
      }
      if (this.zab.containsKey(paramApi)) {
        return (ConnectionResult)this.zab.get(paramApi);
      }
    }
    return null;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(T paramT)
  {
    paramT.zak();
    this.zan.zaa(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(T paramT)
  {
    paramT.zak();
    return this.zan.zab(paramT);
  }
  
  final void zai()
  {
    this.zai.lock();
    try
    {
      this.zag.zak();
      zaaj localzaaj = new com/google/android/gms/common/api/internal/zaaj;
      localzaaj.<init>(this);
      this.zan = localzaaj;
      this.zan.zad();
      this.zaj.signalAll();
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  final void zaj()
  {
    this.zai.lock();
    try
    {
      zaaw localzaaw = new com/google/android/gms/common/api/internal/zaaw;
      localzaaw.<init>(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
      this.zan = localzaaw;
      this.zan.zad();
      this.zaj.signalAll();
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  final void zak(ConnectionResult paramConnectionResult)
  {
    this.zai.lock();
    try
    {
      this.zao = paramConnectionResult;
      paramConnectionResult = new com/google/android/gms/common/api/internal/zaax;
      paramConnectionResult.<init>(this);
      this.zan = paramConnectionResult;
      this.zan.zad();
      this.zaj.signalAll();
      return;
    }
    finally
    {
      this.zai.unlock();
    }
  }
  
  final void zal(zabg paramzabg)
  {
    paramzabg = this.zam.obtainMessage(1, paramzabg);
    this.zam.sendMessage(paramzabg);
  }
  
  final void zam(RuntimeException paramRuntimeException)
  {
    paramRuntimeException = this.zam.obtainMessage(2, paramRuntimeException);
    this.zam.sendMessage(paramRuntimeException);
  }
  
  public final void zaq()
  {
    this.zan.zae();
  }
  
  public final void zar()
  {
    if (this.zan.zaj()) {
      this.zab.clear();
    }
  }
  
  public final void zas(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str = String.valueOf(paramString).concat("  ");
    paramPrintWriter.append(paramString).append("mState=").println(this.zan);
    Iterator localIterator = this.zad.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      paramPrintWriter.append(paramString).append(localApi.zad()).println(":");
      ((Api.Client)Preconditions.checkNotNull((Api.Client)this.zaa.get(localApi.zab()))).dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void zat()
  {
    if ((this.zan instanceof zaaj)) {
      ((zaaj)this.zan).zaf();
    }
  }
  
  public final void zau() {}
  
  public final boolean zaw()
  {
    return this.zan instanceof zaaj;
  }
  
  public final boolean zax()
  {
    return this.zan instanceof zaaw;
  }
  
  public final boolean zay(SignInConnectionListener paramSignInConnectionListener)
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */