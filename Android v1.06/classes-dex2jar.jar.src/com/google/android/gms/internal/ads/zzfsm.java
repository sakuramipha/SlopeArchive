package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class zzfsm
{
  @CheckForNull
  static Object zza(Map paramMap, @CheckForNull Object paramObject)
  {
    Objects.requireNonNull(paramMap);
    try
    {
      paramMap = paramMap.get(paramObject);
      return paramMap;
    }
    catch (ClassCastException|NullPointerException paramMap) {}
    return null;
  }
  
  static boolean zzb(Map paramMap, @CheckForNull Object paramObject)
  {
    if (paramMap == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return paramMap.entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */