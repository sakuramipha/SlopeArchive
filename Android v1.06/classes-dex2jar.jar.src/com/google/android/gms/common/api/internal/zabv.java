package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zabv<O extends Api.ApiOptions>
  extends zaag
{
  @NotOnlyInitialized
  private final GoogleApi<O> zaa;
  
  public zabv(GoogleApi<O> paramGoogleApi)
  {
    super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    this.zaa = paramGoogleApi;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    return this.zaa.doRead(paramT);
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    return this.zaa.doWrite(paramT);
  }
  
  public final Context getContext()
  {
    return this.zaa.getApplicationContext();
  }
  
  public final Looper getLooper()
  {
    return this.zaa.getLooper();
  }
  
  public final void zao(zada paramzada) {}
  
  public final void zap(zada paramzada) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */