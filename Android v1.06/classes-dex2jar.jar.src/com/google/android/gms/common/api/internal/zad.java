package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad<T>
  extends zac
{
  protected final TaskCompletionSource<T> zaa;
  
  public zad(int paramInt, TaskCompletionSource<T> paramTaskCompletionSource)
  {
    super(paramInt);
    this.zaa = paramTaskCompletionSource;
  }
  
  protected abstract void zac(zabq<?> paramzabq)
    throws RemoteException;
  
  public final void zad(Status paramStatus)
  {
    this.zaa.trySetException(new ApiException(paramStatus));
  }
  
  public final void zae(Exception paramException)
  {
    this.zaa.trySetException(paramException);
  }
  
  public final void zaf(zabq<?> paramzabq)
    throws DeadObjectException
  {
    try
    {
      zac(paramzabq);
      return;
    }
    catch (RuntimeException paramzabq)
    {
      this.zaa.trySetException(paramzabq);
      return;
    }
    catch (RemoteException paramzabq)
    {
      zad(zai.zah(paramzabq));
      return;
    }
    catch (DeadObjectException paramzabq)
    {
      zad(zai.zah(paramzabq));
      throw paramzabq;
    }
  }
  
  public void zag(zaad paramzaad, boolean paramBoolean) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */