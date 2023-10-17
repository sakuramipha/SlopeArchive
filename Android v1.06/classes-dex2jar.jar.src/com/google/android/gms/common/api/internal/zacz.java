package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;

final class zacz
  extends zaq
{
  final zada zaa;
  
  public zacz(zada paramzada, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message arg1)
  {
    int i = ???.what;
    Object localObject1;
    if (i != 0)
    {
      if (i != 1)
      {
        i = ???.what;
        ??? = new StringBuilder(70);
        ???.append("TransformationResultHandler received unknown message type: ");
        ???.append(i);
        Log.e("TransformedResultImpl", ???.toString());
        return;
      }
      localObject1 = (RuntimeException)???.obj;
      ??? = String.valueOf(((RuntimeException)localObject1).getMessage());
      if (???.length() != 0) {
        ??? = "Runtime exception on the transformation worker thread: ".concat(???);
      } else {
        ??? = new String("Runtime exception on the transformation worker thread: ");
      }
      Log.e("TransformedResultImpl", ???);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = (PendingResult)???.obj;
    synchronized (zada.zad(this.zaa))
    {
      localObject1 = (zada)Preconditions.checkNotNull(zada.zac(this.zaa));
      if (localObject3 == null)
      {
        localObject3 = new com/google/android/gms/common/api/Status;
        ((Status)localObject3).<init>(13, "Transform returned null");
        zada.zag((zada)localObject1, (Status)localObject3);
      }
      else if ((localObject3 instanceof zacp))
      {
        zada.zag((zada)localObject1, ((zacp)localObject3).zaa());
      }
      else
      {
        ((zada)localObject1).zai((PendingResult)localObject3);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zacz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */