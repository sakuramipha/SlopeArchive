package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class TaskApiCall<A extends Api.AnyClient, ResultT>
{
  private final Feature[] zaa;
  private final boolean zab;
  private final int zac;
  
  @Deprecated
  public TaskApiCall()
  {
    this.zaa = null;
    this.zab = false;
    this.zac = 0;
  }
  
  protected TaskApiCall(Feature[] paramArrayOfFeature, boolean paramBoolean, int paramInt)
  {
    this.zaa = paramArrayOfFeature;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramArrayOfFeature != null)
    {
      bool1 = bool2;
      if (paramBoolean) {
        bool1 = true;
      }
    }
    this.zab = bool1;
    this.zac = paramInt;
  }
  
  public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder()
  {
    return new Builder(null);
  }
  
  protected abstract void doExecute(A paramA, TaskCompletionSource<ResultT> paramTaskCompletionSource)
    throws RemoteException;
  
  public boolean shouldAutoResolveMissingFeatures()
  {
    return this.zab;
  }
  
  public final int zaa()
  {
    return this.zac;
  }
  
  public final Feature[] zab()
  {
    return this.zaa;
  }
  
  public static class Builder<A extends Api.AnyClient, ResultT>
  {
    private RemoteCall<A, TaskCompletionSource<ResultT>> zaa;
    private boolean zab = true;
    private Feature[] zac;
    private int zad = 0;
    
    public TaskApiCall<A, ResultT> build()
    {
      boolean bool;
      if (this.zaa != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "execute parameter required");
      return new zacv(this, this.zac, this.zab, this.zad);
    }
    
    @Deprecated
    public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> paramBiConsumer)
    {
      this.zaa = new zacu(paramBiConsumer);
      return this;
    }
    
    public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> paramRemoteCall)
    {
      this.zaa = paramRemoteCall;
      return this;
    }
    
    public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean paramBoolean)
    {
      this.zab = paramBoolean;
      return this;
    }
    
    public Builder<A, ResultT> setFeatures(Feature... paramVarArgs)
    {
      this.zac = paramVarArgs;
      return this;
    }
    
    public Builder<A, ResultT> setMethodKey(int paramInt)
    {
      this.zad = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\TaskApiCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */