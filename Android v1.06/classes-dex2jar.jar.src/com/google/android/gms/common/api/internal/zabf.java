package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;

public abstract interface zabf
{
  public abstract <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T paramT);
  
  public abstract <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T paramT);
  
  public abstract void zad();
  
  public abstract void zae();
  
  public abstract void zag(Bundle paramBundle);
  
  public abstract void zah(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean);
  
  public abstract void zai(int paramInt);
  
  public abstract boolean zaj();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */