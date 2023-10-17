package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag<ResultT>
  extends zac
{
  private final TaskApiCall<Api.AnyClient, ResultT> zaa;
  private final TaskCompletionSource<ResultT> zab;
  private final StatusExceptionMapper zad;
  
  public zag(int paramInt, TaskApiCall<Api.AnyClient, ResultT> paramTaskApiCall, TaskCompletionSource<ResultT> paramTaskCompletionSource, StatusExceptionMapper paramStatusExceptionMapper)
  {
    super(paramInt);
    this.zab = paramTaskCompletionSource;
    this.zaa = paramTaskApiCall;
    this.zad = paramStatusExceptionMapper;
    if ((paramInt == 2) && (paramTaskApiCall.shouldAutoResolveMissingFeatures())) {
      throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }
  }
  
  public final boolean zaa(zabq<?> paramzabq)
  {
    return this.zaa.shouldAutoResolveMissingFeatures();
  }
  
  public final Feature[] zab(zabq<?> paramzabq)
  {
    return this.zaa.zab();
  }
  
  public final void zad(Status paramStatus)
  {
    this.zab.trySetException(this.zad.getException(paramStatus));
  }
  
  public final void zae(Exception paramException)
  {
    this.zab.trySetException(paramException);
  }
  
  public final void zaf(zabq<?> paramzabq)
    throws DeadObjectException
  {
    try
    {
      this.zaa.doExecute(paramzabq.zaf(), this.zab);
      return;
    }
    catch (RuntimeException paramzabq)
    {
      this.zab.trySetException(paramzabq);
      return;
    }
    catch (RemoteException paramzabq)
    {
      zad(zai.zah(paramzabq));
      return;
    }
    catch (DeadObjectException paramzabq)
    {
      throw paramzabq;
    }
  }
  
  public final void zag(zaad paramzaad, boolean paramBoolean)
  {
    paramzaad.zad(this.zab, paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */