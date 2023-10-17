package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zaao
  extends zaav
{
  final zaaw zaa;
  private final Map<Api.Client, zaal> zac;
  
  public zaao(Map<Api.Client, zaal> paramMap)
  {
    super(paramMap, null);
    Map localMap;
    this.zac = localMap;
  }
  
  public final void zaa()
  {
    Object localObject1 = new zal(zaaw.zaf(this.zaa));
    Object localObject3 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject4 = this.zac.keySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      Api.Client localClient = (Api.Client)((Iterator)localObject4).next();
      if ((localClient.requiresGooglePlayServices()) && (!zaal.zaa((zaal)this.zac.get(localClient)))) {
        ((List)localObject3).add(localClient);
      } else {
        ((List)localObject2).add(localClient);
      }
    }
    boolean bool = ((List)localObject3).isEmpty();
    int i = -1;
    int j = 0;
    int k = 0;
    int m;
    if (bool)
    {
      m = ((List)localObject2).size();
      j = k;
      do
      {
        if (j >= m) {
          break;
        }
        localObject3 = (Api.Client)((List)localObject2).get(j);
        k = ((zal)localObject1).zab(zaaw.zac(this.zaa), (Api.Client)localObject3);
        j++;
        i = k;
      } while (k != 0);
      i = k;
    }
    else
    {
      m = ((List)localObject3).size();
      while (j < m)
      {
        localObject2 = (Api.Client)((List)localObject3).get(j);
        k = ((zal)localObject1).zab(zaaw.zac(this.zaa), (Api.Client)localObject2);
        j++;
        i = k;
        if (k != 0) {
          i = k;
        }
      }
    }
    if (i != 0)
    {
      localObject1 = new ConnectionResult(i, null);
      localObject2 = this.zaa;
      zaaw.zak((zaaw)localObject2).zal(new zaam(this, (zabf)localObject2, (ConnectionResult)localObject1));
      return;
    }
    localObject2 = this.zaa;
    if ((zaaw.zav((zaaw)localObject2)) && (zaaw.zan((zaaw)localObject2) != null)) {
      zaaw.zan((zaaw)localObject2).zab();
    }
    localObject3 = this.zac.keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (Api.Client)((Iterator)localObject3).next();
      localObject2 = (BaseGmsClient.ConnectionProgressReportCallbacks)this.zac.get(localObject4);
      if ((((Api.Client)localObject4).requiresGooglePlayServices()) && (((zal)localObject1).zab(zaaw.zac(this.zaa), (Api.Client)localObject4) != 0))
      {
        localObject4 = this.zaa;
        zaaw.zak((zaaw)localObject4).zal(new zaan(this, (zabf)localObject4, (BaseGmsClient.ConnectionProgressReportCallbacks)localObject2));
      }
      else
      {
        ((Api.Client)localObject4).connect((BaseGmsClient.ConnectionProgressReportCallbacks)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */