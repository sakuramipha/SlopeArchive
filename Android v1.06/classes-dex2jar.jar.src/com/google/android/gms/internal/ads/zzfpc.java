package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

final class zzfpc
  implements Serializable, zzfpa
{
  private final List zza;
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if ((paramObject instanceof zzfpc))
    {
      paramObject = (zzfpc)paramObject;
      return this.zza.equals(((zzfpc)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode() + 306654252;
  }
  
  public final String toString()
  {
    Object localObject = this.zza;
    StringBuilder localStringBuilder = new StringBuilder("Predicates.");
    localStringBuilder.append("and(");
    Iterator localIterator = ((Iterable)localObject).iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      localObject = localIterator.next();
      if (i == 0) {
        localStringBuilder.append(',');
      }
      localStringBuilder.append(localObject);
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final boolean zza(Object paramObject)
  {
    for (int i = 0; i < this.zza.size(); i++) {
      if (!((zzfpa)this.zza.get(i)).zza(paramObject)) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */