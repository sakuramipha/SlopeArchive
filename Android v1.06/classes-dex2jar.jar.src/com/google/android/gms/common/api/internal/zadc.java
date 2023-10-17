package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class zadc
{
  public static final Status zaa = new Status(8, "The connection to Google Play services was lost");
  final Set<BasePendingResult<?>> zab = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final zadb zac = new zadb(this);
  
  final void zaa(BasePendingResult<? extends Result> paramBasePendingResult)
  {
    this.zab.add(paramBasePendingResult);
    paramBasePendingResult.zan(this.zac);
  }
  
  public final void zab()
  {
    Set localSet = this.zab;
    int i = 0;
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])localSet.toArray(new BasePendingResult[0]);
    int j = arrayOfBasePendingResult.length;
    while (i < j)
    {
      localSet = arrayOfBasePendingResult[i];
      localSet.zan(null);
      if (localSet.zam()) {
        this.zab.remove(localSet);
      }
      i++;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zadc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */