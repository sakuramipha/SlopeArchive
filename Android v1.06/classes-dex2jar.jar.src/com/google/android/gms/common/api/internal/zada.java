package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public final class zada<R extends Result>
  extends TransformedResult<R>
  implements ResultCallback<R>
{
  private ResultTransform<? super R, ? extends Result> zaa = null;
  private zada<? extends Result> zab = null;
  private volatile ResultCallbacks<? super R> zac = null;
  private PendingResult<R> zad = null;
  private final Object zae = new Object();
  private Status zaf = null;
  private final WeakReference<GoogleApiClient> zag;
  private final zacz zah;
  private boolean zai = false;
  
  public zada(WeakReference<GoogleApiClient> paramWeakReference)
  {
    Preconditions.checkNotNull(paramWeakReference, "GoogleApiClient reference must not be null");
    this.zag = paramWeakReference;
    paramWeakReference = (GoogleApiClient)paramWeakReference.get();
    if (paramWeakReference != null) {
      paramWeakReference = paramWeakReference.getLooper();
    } else {
      paramWeakReference = Looper.getMainLooper();
    }
    this.zah = new zacz(this, paramWeakReference);
  }
  
  private final void zaj(Status paramStatus)
  {
    synchronized (this.zae)
    {
      this.zaf = paramStatus;
      zal(paramStatus);
      return;
    }
  }
  
  private final void zak()
  {
    if ((this.zaa == null) && (this.zac == null)) {
      return;
    }
    Object localObject = (GoogleApiClient)this.zag.get();
    if ((!this.zai) && (this.zaa != null) && (localObject != null))
    {
      ((GoogleApiClient)localObject).zao(this);
      this.zai = true;
    }
    localObject = this.zaf;
    if (localObject != null)
    {
      zal((Status)localObject);
      return;
    }
    localObject = this.zad;
    if (localObject != null) {
      ((PendingResult)localObject).setResultCallback(this);
    }
  }
  
  private final void zal(Status paramStatus)
  {
    synchronized (this.zae)
    {
      ResultTransform localResultTransform = this.zaa;
      if (localResultTransform != null)
      {
        paramStatus = (Status)Preconditions.checkNotNull(localResultTransform.onFailure(paramStatus), "onFailure must not return null");
        ((zada)Preconditions.checkNotNull(this.zab)).zaj(paramStatus);
      }
      else if (zam())
      {
        ((ResultCallbacks)Preconditions.checkNotNull(this.zac)).onFailure(paramStatus);
      }
      return;
    }
  }
  
  private final boolean zam()
  {
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zag.get();
    return (this.zac != null) && (localGoogleApiClient != null);
  }
  
  private static final void zan(Result paramResult)
  {
    if ((paramResult instanceof Releasable)) {
      try
      {
        ((Releasable)paramResult).release();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        paramResult = String.valueOf(paramResult);
        String.valueOf(paramResult).length();
        Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(paramResult)), localRuntimeException);
      }
    }
  }
  
  public final void andFinally(ResultCallbacks<? super R> paramResultCallbacks)
  {
    synchronized (this.zae)
    {
      ResultCallbacks localResultCallbacks = this.zac;
      boolean bool2 = true;
      boolean bool1;
      if (localResultCallbacks == null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "Cannot call andFinally() twice.");
      if (this.zaa == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
      this.zac = paramResultCallbacks;
      zak();
      return;
    }
  }
  
  public final void onResult(R paramR)
  {
    synchronized (this.zae)
    {
      if (paramR.getStatus().isSuccess())
      {
        if (this.zaa != null)
        {
          ExecutorService localExecutorService = zaco.zaa();
          zacy localzacy = new com/google/android/gms/common/api/internal/zacy;
          localzacy.<init>(this, paramR);
          localExecutorService.submit(localzacy);
        }
        else if (zam())
        {
          ((ResultCallbacks)Preconditions.checkNotNull(this.zac)).onSuccess(paramR);
        }
      }
      else
      {
        zaj(paramR.getStatus());
        zan(paramR);
      }
      return;
    }
  }
  
  public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    synchronized (this.zae)
    {
      ResultTransform localResultTransform = this.zaa;
      boolean bool2 = true;
      boolean bool1;
      if (localResultTransform == null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "Cannot call then() twice.");
      if (this.zac == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "Cannot call then() and andFinally() on the same TransformedResult.");
      this.zaa = paramResultTransform;
      paramResultTransform = new com/google/android/gms/common/api/internal/zada;
      paramResultTransform.<init>(this.zag);
      this.zab = paramResultTransform;
      zak();
      return paramResultTransform;
    }
  }
  
  final void zah()
  {
    this.zac = null;
  }
  
  public final void zai(PendingResult<?> paramPendingResult)
  {
    synchronized (this.zae)
    {
      this.zad = paramPendingResult;
      zak();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */