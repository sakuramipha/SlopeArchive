package com.google.android.gms.common.api.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zal
{
  private final ArrayMap<ApiKey<?>, ConnectionResult> zaa = new ArrayMap();
  private final ArrayMap<ApiKey<?>, String> zab = new ArrayMap();
  private final TaskCompletionSource<Map<ApiKey<?>, String>> zac = new TaskCompletionSource();
  private int zad;
  private boolean zae = false;
  
  public zal(Iterable<? extends HasApiKey<?>> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      HasApiKey localHasApiKey = (HasApiKey)paramIterable.next();
      this.zaa.put(localHasApiKey.getApiKey(), null);
    }
    this.zad = this.zaa.keySet().size();
  }
  
  public final Task<Map<ApiKey<?>, String>> zaa()
  {
    return this.zac.getTask();
  }
  
  public final Set<ApiKey<?>> zab()
  {
    return this.zaa.keySet();
  }
  
  public final void zac(ApiKey<?> paramApiKey, ConnectionResult paramConnectionResult, String paramString)
  {
    this.zaa.put(paramApiKey, paramConnectionResult);
    this.zab.put(paramApiKey, paramString);
    this.zad -= 1;
    if (!paramConnectionResult.isSuccess()) {
      this.zae = true;
    }
    if (this.zad == 0)
    {
      if (this.zae)
      {
        paramApiKey = new AvailabilityException(this.zaa);
        this.zac.setException(paramApiKey);
        return;
      }
      this.zac.setResult(this.zab);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */