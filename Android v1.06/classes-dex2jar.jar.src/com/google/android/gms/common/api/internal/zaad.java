package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class zaad
{
  private final Map<BasePendingResult<?>, Boolean> zaa = Collections.synchronizedMap(new WeakHashMap());
  private final Map<TaskCompletionSource<?>, Boolean> zab = Collections.synchronizedMap(new WeakHashMap());
  
  private final void zah(boolean paramBoolean, Status paramStatus)
  {
    synchronized (this.zaa)
    {
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>(this.zaa);
      synchronized (this.zab)
      {
        ??? = new java/util/HashMap;
        ((HashMap)???).<init>(this.zab);
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ??? = (Map.Entry)((Iterator)localObject2).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue())) {
            ((BasePendingResult)((Map.Entry)???).getKey()).forceFailureUnlessReady(paramStatus);
          }
        }
        localObject2 = ((Map)???).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ??? = (Map.Entry)((Iterator)localObject2).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue())) {
            ((TaskCompletionSource)((Map.Entry)???).getKey()).trySetException(new ApiException(paramStatus));
          }
        }
        return;
      }
    }
  }
  
  final void zac(BasePendingResult<? extends Result> paramBasePendingResult, boolean paramBoolean)
  {
    this.zaa.put(paramBasePendingResult, Boolean.valueOf(paramBoolean));
    paramBasePendingResult.addStatusListener(new zaab(this, paramBasePendingResult));
  }
  
  final <TResult> void zad(TaskCompletionSource<TResult> paramTaskCompletionSource, boolean paramBoolean)
  {
    this.zab.put(paramTaskCompletionSource, Boolean.valueOf(paramBoolean));
    paramTaskCompletionSource.getTask().addOnCompleteListener(new zaac(this, paramTaskCompletionSource));
  }
  
  final void zae(int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("The connection to Google Play services was lost");
    if (paramInt == 1) {
      localStringBuilder.append(" due to service disconnection.");
    } else if (paramInt == 3) {
      localStringBuilder.append(" due to dead object exception.");
    }
    if (paramString != null)
    {
      localStringBuilder.append(" Last reason for disconnect: ");
      localStringBuilder.append(paramString);
    }
    zah(true, new Status(20, localStringBuilder.toString()));
  }
  
  public final void zaf()
  {
    zah(false, GoogleApiManager.zaa);
  }
  
  final boolean zag()
  {
    return (!this.zaa.isEmpty()) || (!this.zab.isEmpty());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */