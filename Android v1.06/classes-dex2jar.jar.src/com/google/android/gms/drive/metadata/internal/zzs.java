package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzs
  extends zzb<String>
{
  public zzs(String paramString, int paramInt)
  {
    super(paramString, Collections.singleton(paramString), Collections.emptySet(), 4300000);
  }
  
  protected final Collection<String> zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    try
    {
      paramDataHolder = paramDataHolder.getString(getName(), paramInt1, paramInt2);
      if (paramDataHolder == null) {
        return null;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramDataHolder);
      for (paramInt1 = 0; paramInt1 < localJSONArray.length(); paramInt1++) {
        localArrayList.add(localJSONArray.getString(paramInt1));
      }
      paramDataHolder = Collections.unmodifiableCollection(localArrayList);
      return paramDataHolder;
    }
    catch (JSONException paramDataHolder)
    {
      throw new IllegalStateException("DataHolder supplied invalid JSON", paramDataHolder);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */