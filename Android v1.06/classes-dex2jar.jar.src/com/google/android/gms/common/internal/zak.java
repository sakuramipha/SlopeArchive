package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zak
  implements Handler.Callback
{
  final ArrayList<GoogleApiClient.ConnectionCallbacks> zaa = new ArrayList();
  @NotOnlyInitialized
  private final zaj zab;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> zac = new ArrayList();
  private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zad = new ArrayList();
  private volatile boolean zae = false;
  private final AtomicInteger zaf = new AtomicInteger(0);
  private boolean zag = false;
  private final Handler zah;
  private final Object zai = new Object();
  
  public zak(Looper paramLooper, zaj paramzaj)
  {
    this.zab = paramzaj;
    this.zah = new zaq(paramLooper, this);
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)???.obj;
      synchronized (this.zai)
      {
        if ((this.zae) && (this.zab.isConnected()) && (this.zac.contains(localConnectionCallbacks))) {
          localConnectionCallbacks.onConnected(null);
        }
        return true;
      }
    }
    int i = ???.what;
    ??? = new StringBuilder(45);
    ???.append("Don't know how to handle message: ");
    ???.append(i);
    Exception localException = new Exception();
    Log.wtf("GmsClientEvents", ???.toString(), localException);
    return false;
  }
  
  public final void zaa()
  {
    this.zae = false;
    this.zaf.incrementAndGet();
  }
  
  public final void zab()
  {
    this.zae = true;
  }
  
  public final void zac(ConnectionResult paramConnectionResult)
  {
    Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
    this.zah.removeMessages(1);
    synchronized (this.zai)
    {
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(this.zad);
      int i = this.zaf.get();
      Iterator localIterator = ((ArrayList)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (GoogleApiClient.OnConnectionFailedListener)localIterator.next();
        if ((this.zae) && (this.zaf.get() == i))
        {
          if (this.zad.contains(localObject2)) {
            ((GoogleApiClient.OnConnectionFailedListener)localObject2).onConnectionFailed(paramConnectionResult);
          }
        }
        else {
          return;
        }
      }
      return;
    }
  }
  
  public final void zad(Bundle paramBundle)
  {
    Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
    synchronized (this.zai)
    {
      Preconditions.checkState(this.zag ^ true);
      this.zah.removeMessages(1);
      this.zag = true;
      Preconditions.checkState(this.zaa.isEmpty());
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(this.zac);
      int i = this.zaf.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)((Iterator)localObject2).next();
        if ((!this.zae) || (!this.zab.isConnected()) || (this.zaf.get() != i)) {
          break;
        }
        if (!this.zaa.contains(localConnectionCallbacks)) {
          localConnectionCallbacks.onConnected(paramBundle);
        }
      }
      this.zaa.clear();
      this.zag = false;
      return;
    }
  }
  
  public final void zae(int paramInt)
  {
    Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.zah.removeMessages(1);
    synchronized (this.zai)
    {
      this.zag = true;
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(this.zac);
      int i = this.zaf.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)((Iterator)localObject2).next();
        if ((!this.zae) || (this.zaf.get() != i)) {
          break;
        }
        if (this.zac.contains(localConnectionCallbacks)) {
          localConnectionCallbacks.onConnectionSuspended(paramInt);
        }
      }
      this.zaa.clear();
      this.zag = false;
      return;
    }
  }
  
  public final void zaf(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.zai)
    {
      if (this.zac.contains(paramConnectionCallbacks))
      {
        String str = String.valueOf(paramConnectionCallbacks);
        int i = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 62);
        localStringBuilder.append("registerConnectionCallbacks(): listener ");
        localStringBuilder.append(str);
        localStringBuilder.append(" is already registered");
        Log.w("GmsClientEvents", localStringBuilder.toString());
      }
      else
      {
        this.zac.add(paramConnectionCallbacks);
      }
      if (this.zab.isConnected())
      {
        ??? = this.zah;
        ((Handler)???).sendMessage(((Handler)???).obtainMessage(1, paramConnectionCallbacks));
      }
      return;
    }
  }
  
  public final void zag(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.zai)
    {
      if (this.zad.contains(paramOnConnectionFailedListener))
      {
        paramOnConnectionFailedListener = String.valueOf(paramOnConnectionFailedListener);
        int i = String.valueOf(paramOnConnectionFailedListener).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 67);
        localStringBuilder.append("registerConnectionFailedListener(): listener ");
        localStringBuilder.append(paramOnConnectionFailedListener);
        localStringBuilder.append(" is already registered");
        Log.w("GmsClientEvents", localStringBuilder.toString());
      }
      else
      {
        this.zad.add(paramOnConnectionFailedListener);
      }
      return;
    }
  }
  
  public final void zah(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.zai)
    {
      if (!this.zac.remove(paramConnectionCallbacks))
      {
        paramConnectionCallbacks = String.valueOf(paramConnectionCallbacks);
        int i = String.valueOf(paramConnectionCallbacks).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 52);
        localStringBuilder.append("unregisterConnectionCallbacks(): listener ");
        localStringBuilder.append(paramConnectionCallbacks);
        localStringBuilder.append(" not found");
        Log.w("GmsClientEvents", localStringBuilder.toString());
      }
      else if (this.zag)
      {
        this.zaa.add(paramConnectionCallbacks);
      }
      return;
    }
  }
  
  public final void zai(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.zai)
    {
      if (!this.zad.remove(paramOnConnectionFailedListener))
      {
        String str = String.valueOf(paramOnConnectionFailedListener);
        int i = String.valueOf(str).length();
        paramOnConnectionFailedListener = new java/lang/StringBuilder;
        paramOnConnectionFailedListener.<init>(i + 57);
        paramOnConnectionFailedListener.append("unregisterConnectionFailedListener(): listener ");
        paramOnConnectionFailedListener.append(str);
        paramOnConnectionFailedListener.append(" not found");
        Log.w("GmsClientEvents", paramOnConnectionFailedListener.toString());
      }
      return;
    }
  }
  
  public final boolean zaj(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.zai)
    {
      boolean bool = this.zac.contains(paramConnectionCallbacks);
      return bool;
    }
  }
  
  public final boolean zak(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.zai)
    {
      boolean bool = this.zad.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */