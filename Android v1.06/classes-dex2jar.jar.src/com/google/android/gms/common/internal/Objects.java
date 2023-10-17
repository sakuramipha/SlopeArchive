package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class Objects
{
  private Objects()
  {
    throw new AssertionError("Uninstantiable");
  }
  
  public static boolean checkBundlesEquality(Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((paramBundle1 != null) && (paramBundle2 != null))
    {
      if (paramBundle1.size() != paramBundle2.size()) {
        return false;
      }
      Object localObject = paramBundle1.keySet();
      if (!((Set)localObject).containsAll(paramBundle2.keySet())) {
        return false;
      }
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!equal(paramBundle1.get(str), paramBundle2.get(str))) {
          return false;
        }
      }
      return true;
    }
    return paramBundle1 == paramBundle2;
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public static int hashCode(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static ToStringHelper toStringHelper(Object paramObject)
  {
    return new ToStringHelper(paramObject, null);
  }
  
  public static final class ToStringHelper
  {
    private final List<String> zza;
    private final Object zzb;
    
    public ToStringHelper add(String paramString, Object paramObject)
    {
      List localList = this.zza;
      Preconditions.checkNotNull(paramString);
      paramObject = String.valueOf(paramObject);
      int i = String.valueOf(paramObject).length();
      StringBuilder localStringBuilder = new StringBuilder(paramString.length() + 1 + i);
      localStringBuilder.append(paramString);
      localStringBuilder.append("=");
      localStringBuilder.append((String)paramObject);
      localList.add(localStringBuilder.toString());
      return this;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100);
      localStringBuilder.append(this.zzb.getClass().getSimpleName());
      localStringBuilder.append('{');
      int j = this.zza.size();
      for (int i = 0; i < j; i++)
      {
        localStringBuilder.append((String)this.zza.get(i));
        if (i < j - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\Objects.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */