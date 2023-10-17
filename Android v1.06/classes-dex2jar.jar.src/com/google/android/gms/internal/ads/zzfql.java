package com.google.android.gms.internal.ads;

import java.util.Map.Entry;
import javax.annotation.CheckForNull;

abstract class zzfql
  implements Map.Entry
{
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if ((zzfou.zza(getKey(), ((Map.Entry)paramObject).getKey())) && (zzfou.zza(getValue(), ((Map.Entry)paramObject).getValue()))) {
        return true;
      }
    }
    return false;
  }
  
  public abstract Object getKey();
  
  public abstract Object getValue();
  
  public final int hashCode()
  {
    Object localObject2 = getKey();
    Object localObject1 = getValue();
    int j = 0;
    int i;
    if (localObject2 == null) {
      i = 0;
    } else {
      i = localObject2.hashCode();
    }
    if (localObject1 != null) {
      j = localObject1.hashCode();
    }
    return i ^ j;
  }
  
  public Object setValue(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(getKey());
    String str1 = String.valueOf(getValue());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */