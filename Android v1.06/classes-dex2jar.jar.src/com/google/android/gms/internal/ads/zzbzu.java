package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbzu
{
  public static boolean zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((paramBundle1 != null) && (paramBundle2 != null))
    {
      if (paramBundle1.size() != paramBundle2.size()) {
        return false;
      }
      Iterator localIterator = paramBundle1.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (String)localIterator.next();
        if (!paramBundle2.containsKey((String)localObject2)) {
          return false;
        }
        Object localObject1 = paramBundle1.get((String)localObject2);
        localObject2 = paramBundle2.get((String)localObject2);
        if ((localObject1 != null) && (localObject2 != null))
        {
          if ((localObject1 instanceof Bundle))
          {
            if ((!(localObject2 instanceof Bundle)) || (!zza((Bundle)localObject1, (Bundle)localObject2))) {
              return false;
            }
          }
          else if (localObject1.getClass().isArray())
          {
            int j = Array.getLength(localObject1);
            if ((localObject2.getClass().isArray()) && (j == Array.getLength(localObject2))) {
              for (int i = 0; i < j; i++) {
                if (!Objects.equal(Array.get(localObject1, i), Array.get(localObject2, i))) {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
          else if (!localObject1.equals(localObject2))
          {
            return false;
          }
        }
        else {
          return (localObject1 == null) && (localObject2 == null);
        }
      }
      return true;
    }
    return (paramBundle1 == null) && (paramBundle2 == null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */