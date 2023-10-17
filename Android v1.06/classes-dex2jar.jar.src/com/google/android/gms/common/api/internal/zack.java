package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zack
  extends RegisterListenerMethod
{
  final RegistrationMethods.Builder zaa;
  
  zack(RegistrationMethods.Builder paramBuilder, ListenerHolder paramListenerHolder, Feature[] paramArrayOfFeature, boolean paramBoolean, int paramInt)
  {
    super(paramListenerHolder, paramArrayOfFeature, paramBoolean, paramInt);
  }
  
  protected final void registerListener(Api.AnyClient paramAnyClient, TaskCompletionSource<Void> paramTaskCompletionSource)
    throws RemoteException
  {
    RegistrationMethods.Builder.zaa(this.zaa).accept(paramAnyClient, paramTaskCompletionSource);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */