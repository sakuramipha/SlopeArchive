package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zabq<O extends Api.ApiOptions>
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau
{
  final GoogleApiManager zaa;
  private final Queue<zai> zab = new LinkedList();
  @NotOnlyInitialized
  private final Api.Client zac;
  private final ApiKey<O> zad;
  private final zaad zae;
  private final Set<zal> zaf = new HashSet();
  private final Map<ListenerHolder.ListenerKey<?>, zaci> zag = new HashMap();
  private final int zah;
  private final zact zai;
  private boolean zaj;
  private final List<zabs> zak = new ArrayList();
  private ConnectionResult zal = null;
  private int zam = 0;
  
  public zabq(GoogleApi<O> paramGoogleApi)
  {
    Object localObject;
    Api.Client localClient = ((GoogleApi)localObject).zab(GoogleApiManager.zaf(paramGoogleApi).getLooper(), this);
    this.zac = localClient;
    this.zad = ((GoogleApi)localObject).getApiKey();
    this.zae = new zaad();
    this.zah = ((GoogleApi)localObject).zaa();
    if (localClient.requiresSignIn())
    {
      this.zai = ((GoogleApi)localObject).zac(GoogleApiManager.zae(paramGoogleApi), GoogleApiManager.zaf(paramGoogleApi));
      return;
    }
    this.zai = null;
  }
  
  private final Feature zaB(Feature[] paramArrayOfFeature)
  {
    if ((paramArrayOfFeature != null) && (paramArrayOfFeature.length != 0))
    {
      Object localObject2 = this.zac.getAvailableFeatures();
      int j = 0;
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Feature[0];
      }
      int k = localObject1.length;
      localObject2 = new ArrayMap(k);
      Long localLong;
      for (int i = 0; i < k; i++)
      {
        localLong = localObject1[i];
        ((Map)localObject2).put(localLong.getName(), Long.valueOf(localLong.getVersion()));
      }
      k = paramArrayOfFeature.length;
      i = j;
      while (i < k)
      {
        localObject1 = paramArrayOfFeature[i];
        localLong = (Long)((Map)localObject2).get(((Feature)localObject1).getName());
        if ((localLong != null) && (localLong.longValue() >= ((Feature)localObject1).getVersion())) {
          i++;
        } else {
          return (Feature)localObject1;
        }
      }
    }
    return null;
  }
  
  private final void zaC(ConnectionResult paramConnectionResult)
  {
    Iterator localIterator = this.zaf.iterator();
    while (localIterator.hasNext())
    {
      zal localzal = (zal)localIterator.next();
      String str;
      if (Objects.equal(paramConnectionResult, ConnectionResult.RESULT_SUCCESS)) {
        str = this.zac.getEndpointPackageName();
      } else {
        str = null;
      }
      localzal.zac(this.zad, paramConnectionResult, str);
    }
    this.zaf.clear();
  }
  
  private final void zaD(Status paramStatus)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    zaE(paramStatus, null, false);
  }
  
  private final void zaE(Status paramStatus, Exception paramException, boolean paramBoolean)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    int j = 0;
    int i;
    if (paramStatus != null) {
      i = 0;
    } else {
      i = 1;
    }
    if (paramException == null) {
      j = 1;
    }
    if (i != j)
    {
      Iterator localIterator = this.zab.iterator();
      while (localIterator.hasNext())
      {
        zai localzai = (zai)localIterator.next();
        if ((!paramBoolean) || (localzai.zac == 2))
        {
          if (paramStatus != null) {
            localzai.zad(paramStatus);
          } else {
            localzai.zae(paramException);
          }
          localIterator.remove();
        }
      }
      return;
    }
    throw new IllegalArgumentException("Status XOR exception should be null");
  }
  
  private final void zaF()
  {
    ArrayList localArrayList = new ArrayList(this.zab);
    int j = localArrayList.size();
    for (int i = 0; i < j; i++)
    {
      zai localzai = (zai)localArrayList.get(i);
      if (!this.zac.isConnected()) {
        break;
      }
      if (zaL(localzai)) {
        this.zab.remove(localzai);
      }
    }
  }
  
  private final void zaG()
  {
    zan();
    zaC(ConnectionResult.RESULT_SUCCESS);
    zaK();
    Iterator localIterator = this.zag.values().iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        Object localObject = (zaci)localIterator.next();
        if (zaB(((zaci)localObject).zaa.getRequiredFeatures()) != null)
        {
          localIterator.remove();
          continue;
        }
        try
        {
          RegisterListenerMethod localRegisterListenerMethod = ((zaci)localObject).zaa;
          localObject = this.zac;
          TaskCompletionSource localTaskCompletionSource = new com/google/android/gms/tasks/TaskCompletionSource;
          localTaskCompletionSource.<init>();
          localRegisterListenerMethod.registerListener((Api.AnyClient)localObject, localTaskCompletionSource);
        }
        catch (RemoteException localRemoteException)
        {
          localIterator.remove();
        }
        catch (DeadObjectException localDeadObjectException)
        {
          onConnectionSuspended(3);
          this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
        }
      }
    }
    zaF();
    zaI();
  }
  
  private final void zaH(int paramInt)
  {
    zan();
    this.zaj = true;
    this.zae.zae(paramInt, this.zac.getLastDisconnectMessage());
    Object localObject = this.zaa;
    GoogleApiManager.zaf((GoogleApiManager)localObject).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf((GoogleApiManager)localObject), 9, this.zad), GoogleApiManager.zab(this.zaa));
    localObject = this.zaa;
    GoogleApiManager.zaf((GoogleApiManager)localObject).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf((GoogleApiManager)localObject), 11, this.zad), GoogleApiManager.zac(this.zaa));
    GoogleApiManager.zan(this.zaa).zac();
    localObject = this.zag.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zaci)((Iterator)localObject).next()).zac.run();
    }
  }
  
  private final void zaI()
  {
    GoogleApiManager.zaf(this.zaa).removeMessages(12, this.zad);
    GoogleApiManager localGoogleApiManager = this.zaa;
    GoogleApiManager.zaf(localGoogleApiManager).sendMessageDelayed(GoogleApiManager.zaf(localGoogleApiManager).obtainMessage(12, this.zad), GoogleApiManager.zad(this.zaa));
  }
  
  private final void zaJ(zai paramzai)
  {
    paramzai.zag(this.zae, zaz());
    try
    {
      paramzai.zaf(this);
      return;
    }
    catch (DeadObjectException paramzai)
    {
      onConnectionSuspended(1);
      this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
    }
  }
  
  private final void zaK()
  {
    if (this.zaj)
    {
      GoogleApiManager.zaf(this.zaa).removeMessages(11, this.zad);
      GoogleApiManager.zaf(this.zaa).removeMessages(9, this.zad);
      this.zaj = false;
    }
  }
  
  private final boolean zaL(zai paramzai)
  {
    if (!(paramzai instanceof zac))
    {
      zaJ(paramzai);
      return true;
    }
    Object localObject = (zac)paramzai;
    Feature localFeature = zaB(((zac)localObject).zab(this));
    if (localFeature == null)
    {
      zaJ(paramzai);
      return true;
    }
    paramzai = this.zac.getClass().getName();
    String str = localFeature.getName();
    long l = localFeature.getVersion();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramzai).length() + 77 + String.valueOf(str).length());
    localStringBuilder.append(paramzai);
    localStringBuilder.append(" could not execute call because it requires feature (");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(l);
    localStringBuilder.append(").");
    Log.w("GoogleApiManager", localStringBuilder.toString());
    if ((GoogleApiManager.zaE(this.zaa)) && (((zac)localObject).zaa(this)))
    {
      paramzai = new zabs(this.zad, localFeature, null);
      int i = this.zak.indexOf(paramzai);
      if (i >= 0)
      {
        localObject = (zabs)this.zak.get(i);
        GoogleApiManager.zaf(this.zaa).removeMessages(15, localObject);
        paramzai = this.zaa;
        GoogleApiManager.zaf(paramzai).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(paramzai), 15, localObject), GoogleApiManager.zab(this.zaa));
      }
      else
      {
        this.zak.add(paramzai);
        localObject = this.zaa;
        GoogleApiManager.zaf((GoogleApiManager)localObject).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf((GoogleApiManager)localObject), 15, paramzai), GoogleApiManager.zab(this.zaa));
        localObject = this.zaa;
        GoogleApiManager.zaf((GoogleApiManager)localObject).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf((GoogleApiManager)localObject), 16, paramzai), GoogleApiManager.zac(this.zaa));
        paramzai = new ConnectionResult(2, null);
        if (!zaM(paramzai)) {
          this.zaa.zaG(paramzai, this.zah);
        }
      }
      return false;
    }
    ((zac)localObject).zae(new UnsupportedApiCallException(localFeature));
    return true;
  }
  
  private final boolean zaM(ConnectionResult paramConnectionResult)
  {
    synchronized ()
    {
      GoogleApiManager localGoogleApiManager = this.zaa;
      if ((GoogleApiManager.zaj(localGoogleApiManager) != null) && (GoogleApiManager.zau(localGoogleApiManager).contains(this.zad)))
      {
        GoogleApiManager.zaj(this.zaa).zah(paramConnectionResult, this.zah);
        return true;
      }
      return false;
    }
  }
  
  private final boolean zaN(boolean paramBoolean)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    if ((this.zac.isConnected()) && (this.zag.size() == 0))
    {
      if (this.zae.zag())
      {
        if (paramBoolean) {
          zaI();
        }
        return false;
      }
      this.zac.disconnect("Timing out service connection.");
      return true;
    }
    return false;
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    if (Looper.myLooper() == GoogleApiManager.zaf(this.zaa).getLooper())
    {
      zaG();
      return;
    }
    GoogleApiManager.zaf(this.zaa).post(new zabm(this));
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zar(paramConnectionResult, null);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    if (Looper.myLooper() == GoogleApiManager.zaf(this.zaa).getLooper())
    {
      zaH(paramInt);
      return;
    }
    GoogleApiManager.zaf(this.zaa).post(new zabn(this, paramInt));
  }
  
  public final boolean zaA()
  {
    return zaN(true);
  }
  
  public final void zaa(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    throw null;
  }
  
  public final int zab()
  {
    return this.zah;
  }
  
  final int zac()
  {
    return this.zam;
  }
  
  public final ConnectionResult zad()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    return this.zal;
  }
  
  public final Api.Client zaf()
  {
    return this.zac;
  }
  
  public final Map<ListenerHolder.ListenerKey<?>, zaci> zah()
  {
    return this.zag;
  }
  
  public final void zan()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    this.zal = null;
  }
  
  public final void zao()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    if ((!this.zac.isConnected()) && (!this.zac.isConnecting())) {
      try
      {
        Object localObject1 = this.zaa;
        int i = GoogleApiManager.zan((GoogleApiManager)localObject1).zab(GoogleApiManager.zae((GoogleApiManager)localObject1), this.zac);
        if (i != 0)
        {
          ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
          localConnectionResult.<init>(i, null);
          String str = this.zac.getClass().getName();
          localObject1 = localConnectionResult.toString();
          int j = String.valueOf(str).length();
          i = ((String)localObject1).length();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(j + 35 + i);
          ((StringBuilder)localObject2).append("The service for ");
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append(" is not available: ");
          ((StringBuilder)localObject2).append((String)localObject1);
          Log.w("GoogleApiManager", ((StringBuilder)localObject2).toString());
          zar(localConnectionResult, null);
          return;
        }
        Object localObject2 = this.zaa;
        localObject1 = this.zac;
        localObject2 = new zabu((GoogleApiManager)localObject2, (Api.Client)localObject1, this.zad);
        if (((Api.Client)localObject1).requiresSignIn()) {
          ((zact)Preconditions.checkNotNull(this.zai)).zae((zacs)localObject2);
        }
        try
        {
          this.zac.connect((BaseGmsClient.ConnectionProgressReportCallbacks)localObject2);
          return;
        }
        catch (SecurityException localSecurityException)
        {
          zar(new ConnectionResult(10), localSecurityException);
          return;
        }
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        zar(new ConnectionResult(10), localIllegalStateException);
      }
    }
  }
  
  public final void zap(zai paramzai)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    if (this.zac.isConnected())
    {
      if (zaL(paramzai))
      {
        zaI();
        return;
      }
      this.zab.add(paramzai);
      return;
    }
    this.zab.add(paramzai);
    paramzai = this.zal;
    if ((paramzai != null) && (paramzai.hasResolution()))
    {
      zar(this.zal, null);
      return;
    }
    zao();
  }
  
  final void zaq()
  {
    this.zam += 1;
  }
  
  public final void zar(ConnectionResult paramConnectionResult, Exception paramException)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    Object localObject = this.zai;
    if (localObject != null) {
      ((zact)localObject).zaf();
    }
    zan();
    GoogleApiManager.zan(this.zaa).zac();
    zaC(paramConnectionResult);
    if (((this.zac instanceof com.google.android.gms.common.internal.service.zap)) && (paramConnectionResult.getErrorCode() != 24))
    {
      GoogleApiManager.zav(this.zaa, true);
      localObject = this.zaa;
      GoogleApiManager.zaf((GoogleApiManager)localObject).sendMessageDelayed(GoogleApiManager.zaf((GoogleApiManager)localObject).obtainMessage(19), 300000L);
    }
    if (paramConnectionResult.getErrorCode() == 4)
    {
      zaD(GoogleApiManager.zah());
      return;
    }
    if (this.zab.isEmpty())
    {
      this.zal = paramConnectionResult;
      return;
    }
    if (paramException != null)
    {
      Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
      zaE(null, paramException, false);
      return;
    }
    if (GoogleApiManager.zaE(this.zaa))
    {
      zaE(GoogleApiManager.zai(this.zad, paramConnectionResult), null, true);
      if (this.zab.isEmpty()) {
        return;
      }
      if (zaM(paramConnectionResult)) {
        return;
      }
      if (!this.zaa.zaG(paramConnectionResult, this.zah))
      {
        if (paramConnectionResult.getErrorCode() == 18) {
          this.zaj = true;
        }
        if (this.zaj)
        {
          paramConnectionResult = this.zaa;
          GoogleApiManager.zaf(paramConnectionResult).sendMessageDelayed(Message.obtain(GoogleApiManager.zaf(paramConnectionResult), 9, this.zad), GoogleApiManager.zab(this.zaa));
          return;
        }
        zaD(GoogleApiManager.zai(this.zad, paramConnectionResult));
      }
      return;
    }
    zaD(GoogleApiManager.zai(this.zad, paramConnectionResult));
  }
  
  public final void zas(ConnectionResult paramConnectionResult)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    Api.Client localClient = this.zac;
    String str1 = localClient.getClass().getName();
    String str2 = String.valueOf(paramConnectionResult);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 25 + String.valueOf(str2).length());
    localStringBuilder.append("onSignInFailed for ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" with ");
    localStringBuilder.append(str2);
    localClient.disconnect(localStringBuilder.toString());
    zar(paramConnectionResult, null);
  }
  
  public final void zat(zal paramzal)
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    this.zaf.add(paramzal);
  }
  
  public final void zau()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    if (this.zaj) {
      zao();
    }
  }
  
  public final void zav()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    zaD(GoogleApiManager.zaa);
    this.zae.zaf();
    Object localObject = this.zag.keySet();
    int i = 0;
    localObject = (ListenerHolder.ListenerKey[])((Set)localObject).toArray(new ListenerHolder.ListenerKey[0]);
    int j = localObject.length;
    while (i < j)
    {
      zap(new zah(localObject[i], new TaskCompletionSource()));
      i++;
    }
    zaC(new ConnectionResult(4));
    if (this.zac.isConnected()) {
      this.zac.onUserSignOut(new zabp(this));
    }
  }
  
  public final void zaw()
  {
    Preconditions.checkHandlerThread(GoogleApiManager.zaf(this.zaa));
    if (this.zaj)
    {
      zaK();
      Object localObject = this.zaa;
      if (GoogleApiManager.zag((GoogleApiManager)localObject).isGooglePlayServicesAvailable(GoogleApiManager.zae((GoogleApiManager)localObject)) == 18) {
        localObject = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
      } else {
        localObject = new Status(22, "API failed to connect while resuming due to an unknown error.");
      }
      zaD((Status)localObject);
      this.zac.disconnect("Timing out connection while resuming.");
    }
  }
  
  final boolean zay()
  {
    return this.zac.isConnected();
  }
  
  public final boolean zaz()
  {
    return this.zac.requiresSignIn();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */