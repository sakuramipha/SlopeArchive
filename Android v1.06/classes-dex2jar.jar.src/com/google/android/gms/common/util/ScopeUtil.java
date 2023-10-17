package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public final class ScopeUtil
{
  public static String[] toScopeString(Set<Scope> paramSet)
  {
    Preconditions.checkNotNull(paramSet, "scopes can't be null.");
    paramSet = (Scope[])paramSet.toArray(new Scope[paramSet.size()]);
    Preconditions.checkNotNull(paramSet, "scopes can't be null.");
    String[] arrayOfString = new String[paramSet.length];
    for (int i = 0; i < paramSet.length; i++) {
      arrayOfString[i] = paramSet[i].getScopeUri();
    }
    return arrayOfString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\ScopeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */