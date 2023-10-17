package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class RegisterListenerMethod<A extends Api.AnyClient, L>
{
  private final ListenerHolder<L> zaa;
  private final Feature[] zab;
  private final boolean zac;
  private final int zad;
  
  protected RegisterListenerMethod(ListenerHolder<L> paramListenerHolder)
  {
    this(paramListenerHolder, null, false, 0);
  }
  
  protected RegisterListenerMethod(ListenerHolder<L> paramListenerHolder, Feature[] paramArrayOfFeature, boolean paramBoolean)
  {
    this(paramListenerHolder, paramArrayOfFeature, paramBoolean, 0);
  }
  
  protected RegisterListenerMethod(ListenerHolder<L> paramListenerHolder, Feature[] paramArrayOfFeature, boolean paramBoolean, int paramInt)
  {
    this.zaa = paramListenerHolder;
    this.zab = paramArrayOfFeature;
    this.zac = paramBoolean;
    this.zad = paramInt;
  }
  
  public void clearListener()
  {
    this.zaa.clear();
  }
  
  public ListenerHolder.ListenerKey<L> getListenerKey()
  {
    return this.zaa.getListenerKey();
  }
  
  public Feature[] getRequiredFeatures()
  {
    return this.zab;
  }
  
  protected abstract void registerListener(A paramA, TaskCompletionSource<Void> paramTaskCompletionSource)
    throws RemoteException;
  
  public final int zaa()
  {
    return this.zad;
  }
  
  public final boolean zab()
  {
    return this.zac;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\RegisterListenerMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */