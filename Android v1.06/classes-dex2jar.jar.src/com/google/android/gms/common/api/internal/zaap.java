package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;
import java.util.ArrayList;
import java.util.List;

final class zaap
  extends zaav
{
  final zaaw zaa;
  private final ArrayList<Api.Client> zac;
  
  public zaap(ArrayList<Api.Client> paramArrayList)
  {
    super(paramArrayList, null);
    ArrayList localArrayList;
    this.zac = localArrayList;
  }
  
  public final void zaa()
  {
    Object localObject = this.zaa;
    zaaw.zak((zaaw)localObject).zag.zad = zaaw.zao((zaaw)localObject);
    ArrayList localArrayList = this.zac;
    int j = localArrayList.size();
    for (int i = 0; i < j; i++)
    {
      localObject = (Api.Client)localArrayList.get(i);
      zaaw localzaaw = this.zaa;
      ((Api.Client)localObject).getRemoteService(zaaw.zam(localzaaw), zaaw.zak(localzaaw).zag.zad);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */