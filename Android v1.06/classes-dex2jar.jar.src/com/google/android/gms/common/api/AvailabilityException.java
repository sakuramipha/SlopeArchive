package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AvailabilityException
  extends Exception
{
  private final ArrayMap<ApiKey<?>, ConnectionResult> zaa;
  
  public AvailabilityException(ArrayMap<ApiKey<?>, ConnectionResult> paramArrayMap)
  {
    this.zaa = paramArrayMap;
  }
  
  public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> paramGoogleApi)
  {
    paramGoogleApi = paramGoogleApi.getApiKey();
    boolean bool;
    if (this.zaa.get(paramGoogleApi) != null) {
      bool = true;
    } else {
      bool = false;
    }
    String str = paramGoogleApi.zab();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 58);
    localStringBuilder.append("The given API (");
    localStringBuilder.append(str);
    localStringBuilder.append(") was not part of the availability request.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    return (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(paramGoogleApi));
  }
  
  public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> paramHasApiKey)
  {
    ApiKey localApiKey = paramHasApiKey.getApiKey();
    boolean bool;
    if (this.zaa.get(localApiKey) != null) {
      bool = true;
    } else {
      bool = false;
    }
    paramHasApiKey = localApiKey.zab();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramHasApiKey).length() + 58);
    localStringBuilder.append("The given API (");
    localStringBuilder.append(paramHasApiKey);
    localStringBuilder.append(") was not part of the availability request.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    return (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(localApiKey));
  }
  
  public String getMessage()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.zaa.keySet().iterator();
    boolean bool = true;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ApiKey)((Iterator)localObject1).next();
      Object localObject3 = (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(localObject2));
      bool &= (((ConnectionResult)localObject3).isSuccess() ^ true);
      localObject2 = ((ApiKey)localObject2).zab();
      String str = String.valueOf(localObject3);
      localObject3 = new StringBuilder(String.valueOf(localObject2).length() + 2 + String.valueOf(str).length());
      ((StringBuilder)localObject3).append((String)localObject2);
      ((StringBuilder)localObject3).append(": ");
      ((StringBuilder)localObject3).append(str);
      localArrayList.add(((StringBuilder)localObject3).toString());
    }
    localObject1 = new StringBuilder();
    if (bool) {
      ((StringBuilder)localObject1).append("None of the queried APIs are available. ");
    } else {
      ((StringBuilder)localObject1).append("Some of the queried APIs are unavailable. ");
    }
    ((StringBuilder)localObject1).append(TextUtils.join("; ", localArrayList));
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\AvailabilityException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */