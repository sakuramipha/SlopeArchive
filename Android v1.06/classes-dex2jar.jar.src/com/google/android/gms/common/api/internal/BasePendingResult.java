package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends Result>
  extends PendingResult<R>
{
  static final ThreadLocal<Boolean> zaa = new zaq();
  public static final int zad = 0;
  private zas mResultGuardian;
  protected final CallbackHandler<R> zab;
  protected final WeakReference<GoogleApiClient> zac;
  private final Object zae = new Object();
  private final CountDownLatch zaf = new CountDownLatch(1);
  private final ArrayList<PendingResult.StatusListener> zag = new ArrayList();
  private ResultCallback<? super R> zah;
  private final AtomicReference<zadb> zai = new AtomicReference();
  private R zaj;
  private Status zak;
  private volatile boolean zal;
  private boolean zam;
  private boolean zan;
  private ICancelToken zao;
  private volatile zada<R> zap;
  private boolean zaq = false;
  
  @Deprecated
  BasePendingResult()
  {
    this.zab = new CallbackHandler(Looper.getMainLooper());
    this.zac = new WeakReference(null);
  }
  
  @Deprecated
  protected BasePendingResult(Looper paramLooper)
  {
    this.zab = new CallbackHandler(paramLooper);
    this.zac = new WeakReference(null);
  }
  
  protected BasePendingResult(GoogleApiClient paramGoogleApiClient)
  {
    Looper localLooper;
    if (paramGoogleApiClient != null) {
      localLooper = paramGoogleApiClient.getLooper();
    } else {
      localLooper = Looper.getMainLooper();
    }
    this.zab = new CallbackHandler(localLooper);
    this.zac = new WeakReference(paramGoogleApiClient);
  }
  
  protected BasePendingResult(CallbackHandler<R> paramCallbackHandler)
  {
    this.zab = ((CallbackHandler)Preconditions.checkNotNull(paramCallbackHandler, "CallbackHandler must not be null"));
    this.zac = new WeakReference(null);
  }
  
  private final R zaa()
  {
    synchronized (this.zae)
    {
      Preconditions.checkState(this.zal ^ true, "Result has already been consumed.");
      Preconditions.checkState(isReady(), "Result is not ready.");
      Result localResult = this.zaj;
      this.zaj = null;
      this.zah = null;
      this.zal = true;
      ??? = (zadb)this.zai.getAndSet(null);
      if (??? != null) {
        ((zadb)???).zaa.zab.remove(this);
      }
      return (Result)Preconditions.checkNotNull(localResult);
    }
  }
  
  private final void zab(R paramR)
  {
    this.zaj = paramR;
    this.zak = paramR.getStatus();
    this.zao = null;
    this.zaf.countDown();
    if (this.zam)
    {
      this.zah = null;
    }
    else
    {
      paramR = this.zah;
      if (paramR == null)
      {
        if ((this.zaj instanceof Releasable)) {
          this.mResultGuardian = new zas(this, null);
        }
      }
      else
      {
        this.zab.removeMessages(2);
        this.zab.zaa(paramR, zaa());
      }
    }
    paramR = this.zag;
    int j = paramR.size();
    for (int i = 0; i < j; i++) {
      ((PendingResult.StatusListener)paramR.get(i)).onComplete(this.zak);
    }
    this.zag.clear();
  }
  
  public static void zal(Result paramResult)
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
        Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(paramResult)), localRuntimeException);
      }
    }
  }
  
  public final void addStatusListener(PendingResult.StatusListener paramStatusListener)
  {
    boolean bool;
    if (paramStatusListener != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Callback cannot be null.");
    synchronized (this.zae)
    {
      if (isReady()) {
        paramStatusListener.onComplete(this.zak);
      } else {
        this.zag.add(paramStatusListener);
      }
      return;
    }
  }
  
  public final R await()
  {
    Preconditions.checkNotMainThread("await must not be called on the UI thread");
    boolean bool2 = this.zal;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed");
    if (this.zap != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot await if then() has been called.");
    try
    {
      this.zaf.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
    }
    Preconditions.checkState(isReady(), "Result is not ready.");
    return zaa();
  }
  
  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L) {
      Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
    }
    boolean bool2 = this.zal;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zap != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot await if then() has been called.");
    try
    {
      if (!this.zaf.await(paramLong, paramTimeUnit)) {
        forceFailureUnlessReady(Status.RESULT_TIMEOUT);
      }
    }
    catch (InterruptedException paramTimeUnit)
    {
      forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
    }
    Preconditions.checkState(isReady(), "Result is not ready.");
    return zaa();
  }
  
  public void cancel()
  {
    ICancelToken localICancelToken;
    synchronized (this.zae)
    {
      if ((!this.zam) && (!this.zal))
      {
        localICancelToken = this.zao;
        if (localICancelToken == null) {}
      }
    }
    try
    {
      localICancelToken.cancel();
      zal(this.zaj);
      this.zam = true;
      zab(createFailedResult(Status.RESULT_CANCELED));
      return;
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  protected abstract R createFailedResult(Status paramStatus);
  
  @Deprecated
  public final void forceFailureUnlessReady(Status paramStatus)
  {
    synchronized (this.zae)
    {
      if (!isReady())
      {
        setResult(createFailedResult(paramStatus));
        this.zan = true;
      }
      return;
    }
  }
  
  public final boolean isCanceled()
  {
    synchronized (this.zae)
    {
      boolean bool = this.zam;
      return bool;
    }
  }
  
  public final boolean isReady()
  {
    return this.zaf.getCount() == 0L;
  }
  
  protected final void setCancelToken(ICancelToken paramICancelToken)
  {
    synchronized (this.zae)
    {
      this.zao = paramICancelToken;
      return;
    }
  }
  
  public final void setResult(R paramR)
  {
    synchronized (this.zae)
    {
      if ((!this.zan) && (!this.zam))
      {
        isReady();
        Preconditions.checkState(isReady() ^ true, "Results have already been set");
        Preconditions.checkState(this.zal ^ true, "Result has already been consumed");
        zab(paramR);
        return;
      }
      zal(paramR);
      return;
    }
  }
  
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback)
  {
    localObject = this.zae;
    if (paramResultCallback == null) {}
    try
    {
      this.zah = null;
      return;
    }
    finally {}
    boolean bool2 = this.zal;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zap != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot set callbacks if then() has been called.");
    if (isCanceled()) {
      return;
    }
    if (isReady()) {
      this.zab.zaa(paramResultCallback, zaa());
    } else {
      this.zah = paramResultCallback;
    }
  }
  
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    localObject = this.zae;
    if (paramResultCallback == null) {}
    try
    {
      this.zah = null;
      return;
    }
    finally {}
    boolean bool2 = this.zal;
    boolean bool1 = true;
    Preconditions.checkState(bool2 ^ true, "Result has already been consumed.");
    if (this.zap != null) {
      bool1 = false;
    }
    Preconditions.checkState(bool1, "Cannot set callbacks if then() has been called.");
    if (isCanceled()) {
      return;
    }
    if (isReady())
    {
      this.zab.zaa(paramResultCallback, zaa());
    }
    else
    {
      this.zah = paramResultCallback;
      paramResultCallback = this.zab;
      paramLong = paramTimeUnit.toMillis(paramLong);
      paramResultCallback.sendMessageDelayed(paramResultCallback.obtainMessage(2, this), paramLong);
    }
  }
  
  public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    Preconditions.checkState(this.zal ^ true, "Result has already been consumed.");
    synchronized (this.zae)
    {
      zada localzada = this.zap;
      boolean bool2 = false;
      if (localzada == null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1, "Cannot call then() twice.");
      boolean bool1 = bool2;
      if (this.zah == null) {
        bool1 = true;
      }
      Preconditions.checkState(bool1, "Cannot call then() if callbacks are set.");
      Preconditions.checkState(this.zam ^ true, "Cannot call then() if result was canceled.");
      this.zaq = true;
      localzada = new com/google/android/gms/common/api/internal/zada;
      localzada.<init>(this.zac);
      this.zap = localzada;
      paramResultTransform = this.zap.then(paramResultTransform);
      if (isReady()) {
        this.zab.zaa(this.zap, zaa());
      } else {
        this.zah = this.zap;
      }
      return paramResultTransform;
    }
  }
  
  public final void zak()
  {
    boolean bool3 = this.zaq;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (!bool3) {
      if (((Boolean)zaa.get()).booleanValue()) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    this.zaq = bool1;
  }
  
  public final boolean zam()
  {
    synchronized (this.zae)
    {
      if (((GoogleApiClient)this.zac.get() == null) || (!this.zaq)) {
        cancel();
      }
      boolean bool = isCanceled();
      return bool;
    }
  }
  
  public final void zan(zadb paramzadb)
  {
    this.zai.set(paramzadb);
  }
  
  public static class CallbackHandler<R extends Result>
    extends com.google.android.gms.internal.base.zaq
  {
    public CallbackHandler()
    {
      super();
    }
    
    public CallbackHandler(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i != 1)
      {
        if (i != 2)
        {
          i = paramMessage.what;
          localObject = new StringBuilder(45);
          ((StringBuilder)localObject).append("Don't know how to handle message: ");
          ((StringBuilder)localObject).append(i);
          paramMessage = new Exception();
          Log.wtf("BasePendingResult", ((StringBuilder)localObject).toString(), paramMessage);
          return;
        }
        ((BasePendingResult)paramMessage.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
        return;
      }
      Object localObject = (Pair)paramMessage.obj;
      paramMessage = (ResultCallback)((Pair)localObject).first;
      localObject = (Result)((Pair)localObject).second;
      try
      {
        paramMessage.onResult((Result)localObject);
        return;
      }
      catch (RuntimeException paramMessage)
      {
        BasePendingResult.zal((Result)localObject);
        throw paramMessage;
      }
    }
    
    public final void zaa(ResultCallback<? super R> paramResultCallback, R paramR)
    {
      int i = BasePendingResult.zad;
      sendMessage(obtainMessage(1, new Pair((ResultCallback)Preconditions.checkNotNull(paramResultCallback), paramR)));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */