package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class zaaa
  implements zaca
{
  private final Context zaa;
  private final zabe zab;
  private final Looper zac;
  private final zabi zad;
  private final zabi zae;
  private final Map<Api.AnyClientKey<?>, zabi> zaf;
  private final Set<SignInConnectionListener> zag = Collections.newSetFromMap(new WeakHashMap());
  private final Api.Client zah;
  private Bundle zai;
  private ConnectionResult zaj = null;
  private ConnectionResult zak = null;
  private boolean zal = false;
  private final Lock zam;
  private int zan = 0;
  
  private zaaa(Context paramContext, zabe paramzabe, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, Map<Api.AnyClientKey<?>, Api.Client> paramMap2, ClientSettings paramClientSettings, Api.AbstractClientBuilder<? extends zae, SignInOptions> paramAbstractClientBuilder, Api.Client paramClient, ArrayList<zat> paramArrayList1, ArrayList<zat> paramArrayList2, Map<Api<?>, Boolean> paramMap3, Map<Api<?>, Boolean> paramMap4)
  {
    this.zaa = paramContext;
    this.zab = paramzabe;
    this.zam = paramLock;
    this.zac = paramLooper;
    this.zah = paramClient;
    this.zad = new zabi(paramContext, paramzabe, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap2, null, paramMap4, null, paramArrayList2, new zax(this, null));
    this.zae = new zabi(paramContext, paramzabe, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap1, paramClientSettings, paramMap3, paramAbstractClientBuilder, paramArrayList1, new zaz(this, null));
    paramContext = new ArrayMap();
    paramzabe = paramMap2.keySet().iterator();
    while (paramzabe.hasNext()) {
      paramContext.put((Api.AnyClientKey)paramzabe.next(), this.zad);
    }
    paramzabe = paramMap1.keySet().iterator();
    while (paramzabe.hasNext()) {
      paramContext.put((Api.AnyClientKey)paramzabe.next(), this.zae);
    }
    this.zaf = Collections.unmodifiableMap(paramContext);
  }
  
  private final void zaA(ConnectionResult paramConnectionResult)
  {
    int i = this.zan;
    if (i != 1)
    {
      if (i != 2) {
        Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
      } else {
        this.zab.zaa(paramConnectionResult);
      }
    }
    else {
      zaB();
    }
    this.zan = 0;
  }
  
  private final void zaB()
  {
    Iterator localIterator = this.zag.iterator();
    while (localIterator.hasNext()) {
      ((SignInConnectionListener)localIterator.next()).onComplete();
    }
    this.zag.clear();
  }
  
  private final boolean zaC()
  {
    ConnectionResult localConnectionResult = this.zak;
    return (localConnectionResult != null) && (localConnectionResult.getErrorCode() == 4);
  }
  
  private final boolean zaD(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> paramApiMethodImpl)
  {
    paramApiMethodImpl = paramApiMethodImpl.getClientKey();
    paramApiMethodImpl = (zabi)this.zaf.get(paramApiMethodImpl);
    Preconditions.checkNotNull(paramApiMethodImpl, "GoogleApiClient is not configured to use the API required for this call.");
    return paramApiMethodImpl.equals(this.zae);
  }
  
  private static boolean zaE(ConnectionResult paramConnectionResult)
  {
    return (paramConnectionResult != null) && (paramConnectionResult.isSuccess());
  }
  
  public static zaaa zag(Context paramContext, zabe paramzabe, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends zae, SignInOptions> paramAbstractClientBuilder, ArrayList<zat> paramArrayList)
  {
    ArrayMap localArrayMap1 = new ArrayMap();
    ArrayMap localArrayMap2 = new ArrayMap();
    Object localObject2 = paramMap.entrySet().iterator();
    paramMap = null;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject1 = (Api.Client)((Map.Entry)localObject3).getValue();
      if (true == ((Api.Client)localObject1).providesSignIn()) {
        paramMap = (Map<Api.AnyClientKey<?>, Api.Client>)localObject1;
      }
      if (((Api.Client)localObject1).requiresSignIn()) {
        localArrayMap1.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
      } else {
        localArrayMap2.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
      }
    }
    Preconditions.checkState(localArrayMap1.isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
    localObject2 = new ArrayMap();
    Object localObject1 = new ArrayMap();
    Iterator localIterator = paramMap1.keySet().iterator();
    Object localObject4;
    while (localIterator.hasNext())
    {
      localObject4 = (Api)localIterator.next();
      localObject3 = ((Api)localObject4).zab();
      if (localArrayMap1.containsKey(localObject3)) {
        ((Map)localObject2).put(localObject4, (Boolean)paramMap1.get(localObject4));
      } else if (localArrayMap2.containsKey(localObject3)) {
        ((Map)localObject1).put(localObject4, (Boolean)paramMap1.get(localObject4));
      } else {
        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
      }
    }
    paramMap1 = new ArrayList();
    Object localObject3 = new ArrayList();
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      localObject4 = (zat)paramArrayList.get(i);
      if (((Map)localObject2).containsKey(((zat)localObject4).zaa))
      {
        paramMap1.add(localObject4);
      }
      else
      {
        if (!((Map)localObject1).containsKey(((zat)localObject4).zaa)) {
          break label405;
        }
        ((ArrayList)localObject3).add(localObject4);
      }
      i++;
      continue;
      label405:
      throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
    }
    return new zaaa(paramContext, paramzabe, paramLock, paramLooper, paramGoogleApiAvailabilityLight, localArrayMap1, localArrayMap2, paramClientSettings, paramAbstractClientBuilder, paramMap, paramMap1, (ArrayList)localObject3, (Map)localObject2, (Map)localObject1);
  }
  
  private final PendingIntent zaz()
  {
    if (this.zah == null) {
      return null;
    }
    return zal.zaa(this.zaa, System.identityHashCode(this.zab), this.zah.getSignInIntent(), zal.zaa | 0x8000000);
  }
  
  public final ConnectionResult zab()
  {
    throw new UnsupportedOperationException();
  }
  
  public final ConnectionResult zac(long paramLong, TimeUnit paramTimeUnit)
  {
    throw new UnsupportedOperationException();
  }
  
  public final ConnectionResult zad(Api<?> paramApi)
  {
    if (Objects.equal(this.zaf.get(paramApi.zab()), this.zae))
    {
      if (zaC()) {
        return new ConnectionResult(4, zaz());
      }
      return this.zae.zad(paramApi);
    }
    return this.zad.zad(paramApi);
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(T paramT)
  {
    if (zaD(paramT))
    {
      if (zaC())
      {
        paramT.setFailedResult(new Status(4, null, zaz()));
        return paramT;
      }
      this.zae.zae(paramT);
      return paramT;
    }
    this.zad.zae(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(T paramT)
  {
    if (zaD(paramT))
    {
      if (zaC())
      {
        paramT.setFailedResult(new Status(4, null, zaz()));
        return paramT;
      }
      return this.zae.zaf(paramT);
    }
    return this.zad.zaf(paramT);
  }
  
  public final void zaq()
  {
    this.zan = 2;
    this.zal = false;
    this.zak = null;
    this.zaj = null;
    this.zad.zaq();
    this.zae.zaq();
  }
  
  public final void zar()
  {
    this.zak = null;
    this.zaj = null;
    this.zan = 0;
    this.zad.zar();
    this.zae.zar();
    zaB();
  }
  
  public final void zas(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    this.zae.zas(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    this.zad.zas(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final void zat()
  {
    this.zad.zat();
    this.zae.zat();
  }
  
  public final void zau()
  {
    this.zam.lock();
    try
    {
      boolean bool = zax();
      this.zae.zar();
      Object localObject1 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject1).<init>(4);
      this.zak = ((ConnectionResult)localObject1);
      if (bool)
      {
        localObject1 = new com/google/android/gms/internal/base/zaq;
        ((zaq)localObject1).<init>(this.zac);
        zav localzav = new com/google/android/gms/common/api/internal/zav;
        localzav.<init>(this);
        ((Handler)localObject1).post(localzav);
      }
      else
      {
        zaB();
      }
      return;
    }
    finally
    {
      this.zam.unlock();
    }
  }
  
  public final boolean zaw()
  {
    this.zam.lock();
    try
    {
      boolean bool3 = this.zad.zaw();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3) {
        if ((!this.zae.zaw()) && (!zaC()))
        {
          int i = this.zan;
          bool1 = bool2;
          if (i != 1) {}
        }
        else
        {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      this.zam.unlock();
    }
  }
  
  public final boolean zax()
  {
    this.zam.lock();
    try
    {
      int i = this.zan;
      boolean bool;
      if (i == 2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      this.zam.unlock();
    }
  }
  
  public final boolean zay(SignInConnectionListener paramSignInConnectionListener)
  {
    this.zam.lock();
    try
    {
      if (((zax()) || (zaw())) && (!this.zae.zaw()))
      {
        this.zag.add(paramSignInConnectionListener);
        if (this.zan == 0) {
          this.zan = 1;
        }
        this.zak = null;
        this.zae.zaq();
        return true;
      }
      return false;
    }
    finally
    {
      this.zam.unlock();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */