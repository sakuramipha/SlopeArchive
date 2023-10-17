package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zacl
  extends UnregisterListenerMethod
{
  final RegistrationMethods.Builder zaa;
  
  zacl(RegistrationMethods.Builder paramBuilder, ListenerHolder.ListenerKey paramListenerKey)
  {
    super(paramListenerKey);
  }
  
  protected final void unregisterListener(Api.AnyClient paramAnyClient, TaskCompletionSource<Boolean> paramTaskCompletionSource)
    throws RemoteException
  {
    RegistrationMethods.Builder.zab(this.zaa).accept(paramAnyClient, paramTaskCompletionSource);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zacl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */