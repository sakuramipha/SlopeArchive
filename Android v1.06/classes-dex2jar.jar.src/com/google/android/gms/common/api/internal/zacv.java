package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacv
  extends TaskApiCall
{
  final TaskApiCall.Builder zaa;
  
  zacv(TaskApiCall.Builder paramBuilder, Feature[] paramArrayOfFeature, boolean paramBoolean, int paramInt)
  {
    super(paramArrayOfFeature, paramBoolean, paramInt);
  }
  
  protected final void doExecute(Api.AnyClient paramAnyClient, TaskCompletionSource paramTaskCompletionSource)
    throws RemoteException
  {
    TaskApiCall.Builder.zaa(this.zaa).accept(paramAnyClient, paramTaskCompletionSource);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zacv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */