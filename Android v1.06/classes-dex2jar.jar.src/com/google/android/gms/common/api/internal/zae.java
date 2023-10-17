package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>>
  extends zai
{
  protected final A zaa;
  
  public zae(int paramInt, A paramA)
  {
    super(paramInt);
    this.zaa = ((BaseImplementation.ApiMethodImpl)Preconditions.checkNotNull(paramA, "Null methods are not runnable."));
  }
  
  public final void zad(Status paramStatus)
  {
    try
    {
      this.zaa.setFailedResult(paramStatus);
      return;
    }
    catch (IllegalStateException paramStatus)
    {
      Log.w("ApiCallRunner", "Exception reporting failure", paramStatus);
    }
  }
  
  public final void zae(Exception paramException)
  {
    String str1 = paramException.getClass().getSimpleName();
    String str2 = paramException.getLocalizedMessage();
    paramException = new StringBuilder(String.valueOf(str1).length() + 2 + String.valueOf(str2).length());
    paramException.append(str1);
    paramException.append(": ");
    paramException.append(str2);
    paramException = new Status(10, paramException.toString());
    try
    {
      this.zaa.setFailedResult(paramException);
      return;
    }
    catch (IllegalStateException paramException)
    {
      Log.w("ApiCallRunner", "Exception reporting failure", paramException);
    }
  }
  
  public final void zaf(zabq<?> paramzabq)
    throws DeadObjectException
  {
    try
    {
      this.zaa.run(paramzabq.zaf());
      return;
    }
    catch (RuntimeException paramzabq)
    {
      zae(paramzabq);
    }
  }
  
  public final void zag(zaad paramzaad, boolean paramBoolean)
  {
    paramzaad.zac(this.zaa, paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */