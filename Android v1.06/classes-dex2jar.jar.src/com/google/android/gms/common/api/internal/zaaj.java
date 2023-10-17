package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zaaj
  implements zabf
{
  private final zabi zaa;
  private boolean zab = false;
  
  public zaaj(zabi paramzabi)
  {
    this.zaa = paramzabi;
  }
  
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T paramT)
  {
    zab(paramT);
    return paramT;
  }
  
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T paramT)
  {
    try
    {
      this.zaa.zag.zai.zaa(paramT);
      Object localObject = this.zaa.zag;
      Api.AnyClientKey localAnyClientKey = paramT.getClientKey();
      localObject = (Api.Client)((zabe)localObject).zac.get(localAnyClientKey);
      Preconditions.checkNotNull(localObject, "Appropriate Api was not requested.");
      if ((!((Api.Client)localObject).isConnected()) && (this.zaa.zab.containsKey(paramT.getClientKey())))
      {
        localObject = new com/google/android/gms/common/api/Status;
        ((Status)localObject).<init>(17);
        paramT.setFailedResult((Status)localObject);
      }
      else
      {
        paramT.run((Api.AnyClient)localObject);
      }
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.zaa.zal(new zaah(this, this));
    }
    return paramT;
  }
  
  public final void zad() {}
  
  public final void zae()
  {
    if (this.zab)
    {
      this.zab = false;
      this.zaa.zal(new zaai(this, this));
    }
  }
  
  final void zaf()
  {
    if (this.zab)
    {
      this.zab = false;
      this.zaa.zag.zai.zab();
      zaj();
    }
  }
  
  public final void zag(Bundle paramBundle) {}
  
  public final void zah(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean) {}
  
  public final void zai(int paramInt)
  {
    this.zaa.zak(null);
    this.zaa.zah.zac(paramInt, this.zab);
  }
  
  public final boolean zaj()
  {
    if (this.zab) {
      return false;
    }
    Object localObject = this.zaa.zag.zah;
    if ((localObject != null) && (!((Set)localObject).isEmpty()))
    {
      this.zab = true;
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((zada)((Iterator)localObject).next()).zah();
      }
      return false;
    }
    this.zaa.zak(null);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */