package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

public class RegistrationMethods<A extends Api.AnyClient, L>
{
  public final RegisterListenerMethod<A, L> register;
  public final UnregisterListenerMethod<A, L> zaa;
  public final Runnable zab;
  
  public static <A extends Api.AnyClient, L> Builder<A, L> builder()
  {
    return new Builder(null);
  }
  
  public static class Builder<A extends Api.AnyClient, L>
  {
    private RemoteCall<A, TaskCompletionSource<Void>> zaa;
    private RemoteCall<A, TaskCompletionSource<Boolean>> zab;
    private Runnable zac = zacj.zaa;
    private ListenerHolder<L> zad;
    private Feature[] zae;
    private boolean zaf = true;
    private int zag;
    
    public RegistrationMethods<A, L> build()
    {
      Object localObject = this.zaa;
      boolean bool2 = true;
      boolean bool1;
      if (localObject != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "Must set register function");
      if (this.zab != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "Must set unregister function");
      if (this.zad != null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "Must set holder");
      localObject = (ListenerHolder.ListenerKey)Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null");
      return new RegistrationMethods(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, (ListenerHolder.ListenerKey)localObject), this.zac, null);
    }
    
    public Builder<A, L> onConnectionSuspended(Runnable paramRunnable)
    {
      this.zac = paramRunnable;
      return this;
    }
    
    public Builder<A, L> register(RemoteCall<A, TaskCompletionSource<Void>> paramRemoteCall)
    {
      this.zaa = paramRemoteCall;
      return this;
    }
    
    public Builder<A, L> setAutoResolveMissingFeatures(boolean paramBoolean)
    {
      this.zaf = paramBoolean;
      return this;
    }
    
    public Builder<A, L> setFeatures(Feature... paramVarArgs)
    {
      this.zae = paramVarArgs;
      return this;
    }
    
    public Builder<A, L> setMethodKey(int paramInt)
    {
      this.zag = paramInt;
      return this;
    }
    
    public Builder<A, L> unregister(RemoteCall<A, TaskCompletionSource<Boolean>> paramRemoteCall)
    {
      this.zab = paramRemoteCall;
      return this;
    }
    
    public Builder<A, L> withHolder(ListenerHolder<L> paramListenerHolder)
    {
      this.zad = paramListenerHolder;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\RegistrationMethods.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */