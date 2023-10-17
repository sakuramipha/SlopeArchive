package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zaax
  implements zabf
{
  @NotOnlyInitialized
  private final zabi zaa;
  
  public zaax(zabi paramzabi)
  {
    this.zaa = paramzabi;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T paramT)
  {
    this.zaa.zag.zaa.add(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void zad()
  {
    Iterator localIterator = this.zaa.zaa.values().iterator();
    while (localIterator.hasNext()) {
      ((Api.Client)localIterator.next()).disconnect();
    }
    this.zaa.zag.zad = Collections.emptySet();
  }
  
  public final void zae()
  {
    this.zaa.zaj();
  }
  
  public final void zag(Bundle paramBundle) {}
  
  public final void zah(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean) {}
  
  public final void zai(int paramInt) {}
  
  public final boolean zaj()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */