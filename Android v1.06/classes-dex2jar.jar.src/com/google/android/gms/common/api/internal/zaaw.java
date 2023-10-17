package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zaaw
  implements zabf
{
  private final zabi zaa;
  private final Lock zab;
  private final Context zac;
  private final GoogleApiAvailabilityLight zad;
  private ConnectionResult zae;
  private int zaf;
  private int zag = 0;
  private int zah;
  private final Bundle zai = new Bundle();
  private final Set<Api.AnyClientKey> zaj = new HashSet();
  private zae zak;
  private boolean zal;
  private boolean zam;
  private boolean zan;
  private IAccountAccessor zao;
  private boolean zap;
  private boolean zaq;
  private final ClientSettings zar;
  private final Map<Api<?>, Boolean> zas;
  private final Api.AbstractClientBuilder<? extends zae, SignInOptions> zat;
  private final ArrayList<Future<?>> zau = new ArrayList();
  
  public zaaw(zabi paramzabi, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zae, SignInOptions> paramAbstractClientBuilder, Lock paramLock, Context paramContext)
  {
    this.zaa = paramzabi;
    this.zar = paramClientSettings;
    this.zas = paramMap;
    this.zad = paramGoogleApiAvailabilityLight;
    this.zat = paramAbstractClientBuilder;
    this.zab = paramLock;
    this.zac = paramContext;
  }
  
  private final void zaA()
  {
    this.zam = false;
    this.zaa.zag.zad = Collections.emptySet();
    Iterator localIterator = this.zaj.iterator();
    while (localIterator.hasNext())
    {
      Api.AnyClientKey localAnyClientKey = (Api.AnyClientKey)localIterator.next();
      if (!this.zaa.zab.containsKey(localAnyClientKey)) {
        this.zaa.zab.put(localAnyClientKey, new ConnectionResult(17, null));
      }
    }
  }
  
  private final void zaB(boolean paramBoolean)
  {
    Object localObject = this.zak;
    if (localObject != null)
    {
      if ((((zae)localObject).isConnected()) && (paramBoolean)) {
        ((zae)localObject).zaa();
      }
      ((zae)localObject).disconnect();
      localObject = (ClientSettings)Preconditions.checkNotNull(this.zar);
      this.zao = null;
    }
  }
  
  private final void zaC()
  {
    this.zaa.zai();
    zabj.zaa().execute(new zaak(this));
    Object localObject = this.zak;
    if (localObject != null)
    {
      if (this.zap) {
        ((zae)localObject).zac((IAccountAccessor)Preconditions.checkNotNull(this.zao), this.zaq);
      }
      zaB(false);
    }
    Iterator localIterator = this.zaa.zab.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Api.AnyClientKey)localIterator.next();
      ((Api.Client)Preconditions.checkNotNull((Api.Client)this.zaa.zaa.get(localObject))).disconnect();
    }
    if (this.zai.isEmpty()) {
      localObject = null;
    } else {
      localObject = this.zai;
    }
    this.zaa.zah.zab((Bundle)localObject);
  }
  
  private final void zaD(ConnectionResult paramConnectionResult)
  {
    zaz();
    zaB(paramConnectionResult.hasResolution() ^ true);
    this.zaa.zak(paramConnectionResult);
    this.zaa.zah.zaa(paramConnectionResult);
  }
  
  private final void zaE(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    int i = paramApi.zac().getPriority();
    if (((!paramBoolean) || (paramConnectionResult.hasResolution()) || (this.zad.getErrorResolutionIntent(paramConnectionResult.getErrorCode()) != null)) && ((this.zae == null) || (i < this.zaf)))
    {
      this.zae = paramConnectionResult;
      this.zaf = i;
    }
    this.zaa.zab.put(paramApi.zab(), paramConnectionResult);
  }
  
  private final void zaF()
  {
    if (this.zah != 0) {
      return;
    }
    if ((!this.zam) || (this.zan))
    {
      ArrayList localArrayList = new ArrayList();
      this.zag = 1;
      this.zah = this.zaa.zaa.size();
      Iterator localIterator = this.zaa.zaa.keySet().iterator();
      while (localIterator.hasNext())
      {
        Api.AnyClientKey localAnyClientKey = (Api.AnyClientKey)localIterator.next();
        if (this.zaa.zab.containsKey(localAnyClientKey))
        {
          if (zaH()) {
            zaC();
          }
        }
        else {
          localArrayList.add((Api.Client)this.zaa.zaa.get(localAnyClientKey));
        }
      }
      if (!localArrayList.isEmpty()) {
        this.zau.add(zabj.zaa().submit(new zaap(this, localArrayList)));
      }
    }
  }
  
  private final boolean zaG(int paramInt)
  {
    if (this.zag != paramInt)
    {
      Log.w("GACConnecting", this.zaa.zag.zaf());
      Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
      int i = this.zah;
      StringBuilder localStringBuilder = new StringBuilder(33);
      localStringBuilder.append("mRemainingConnections=");
      localStringBuilder.append(i);
      Log.w("GACConnecting", localStringBuilder.toString());
      String str = zaJ(this.zag);
      Object localObject = zaJ(paramInt);
      localStringBuilder = new StringBuilder(str.length() + 70 + ((String)localObject).length());
      localStringBuilder.append("GoogleApiClient connecting is in step ");
      localStringBuilder.append(str);
      localStringBuilder.append(" but received callback for step ");
      localStringBuilder.append((String)localObject);
      localObject = new Exception();
      Log.e("GACConnecting", localStringBuilder.toString(), (Throwable)localObject);
      zaD(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  private final boolean zaH()
  {
    int i = this.zah - 1;
    this.zah = i;
    if (i > 0) {
      return false;
    }
    if (i < 0)
    {
      Log.w("GACConnecting", this.zaa.zag.zaf());
      Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
      zaD(new ConnectionResult(8, null));
      return false;
    }
    ConnectionResult localConnectionResult = this.zae;
    if (localConnectionResult != null)
    {
      this.zaa.zaf = this.zaf;
      zaD(localConnectionResult);
      return false;
    }
    return true;
  }
  
  private final boolean zaI(ConnectionResult paramConnectionResult)
  {
    return (this.zal) && (!paramConnectionResult.hasResolution());
  }
  
  private static final String zaJ(int paramInt)
  {
    if (paramInt != 0) {
      return "STEP_GETTING_REMOTE_SERVICE";
    }
    return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
  }
  
  private final void zaz()
  {
    ArrayList localArrayList = this.zau;
    int j = localArrayList.size();
    for (int i = 0; i < j; i++) {
      ((Future)localArrayList.get(i)).cancel(true);
    }
    this.zau.clear();
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T paramT)
  {
    this.zaa.zag.zaa.add(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void zad()
  {
    this.zaa.zab.clear();
    this.zam = false;
    this.zae = null;
    this.zag = 0;
    this.zal = true;
    this.zan = false;
    this.zap = false;
    HashMap localHashMap = new HashMap();
    Object localObject1 = this.zas.keySet().iterator();
    int i = 0;
    Object localObject3;
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Api)((Iterator)localObject1).next();
      localObject2 = (Api.Client)Preconditions.checkNotNull((Api.Client)this.zaa.zaa.get(((Api)localObject3).zab()));
      int j;
      if (((Api)localObject3).zac().getPriority() == 1) {
        j = 1;
      } else {
        j = 0;
      }
      i |= j;
      boolean bool = ((Boolean)this.zas.get(localObject3)).booleanValue();
      if (((Api.Client)localObject2).requiresSignIn())
      {
        this.zam = true;
        if (bool) {
          this.zaj.add(((Api)localObject3).zab());
        } else {
          this.zal = false;
        }
      }
      localHashMap.put(localObject2, new zaal(this, (Api)localObject3, bool));
    }
    if (i != 0) {
      this.zam = false;
    }
    if (this.zam)
    {
      Preconditions.checkNotNull(this.zar);
      Preconditions.checkNotNull(this.zat);
      this.zar.zae(Integer.valueOf(System.identityHashCode(this.zaa.zag)));
      zaat localzaat = new zaat(this, null);
      localObject2 = this.zat;
      localObject3 = this.zac;
      Looper localLooper = this.zaa.zag.getLooper();
      localObject1 = this.zar;
      this.zak = ((Api.AbstractClientBuilder)localObject2).buildClient((Context)localObject3, localLooper, (ClientSettings)localObject1, ((ClientSettings)localObject1).zaa(), localzaat, localzaat);
    }
    this.zah = this.zaa.zaa.size();
    this.zau.add(zabj.zaa().submit(new zaao(this, localHashMap)));
  }
  
  public final void zae() {}
  
  public final void zag(Bundle paramBundle)
  {
    if (!zaG(1)) {
      return;
    }
    if (paramBundle != null) {
      this.zai.putAll(paramBundle);
    }
    if (zaH()) {
      zaC();
    }
  }
  
  public final void zah(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    if (!zaG(1)) {
      return;
    }
    zaE(paramConnectionResult, paramApi, paramBoolean);
    if (zaH()) {
      zaC();
    }
  }
  
  public final void zai(int paramInt)
  {
    zaD(new ConnectionResult(8, null));
  }
  
  public final boolean zaj()
  {
    zaz();
    zaB(true);
    this.zaa.zak(null);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */