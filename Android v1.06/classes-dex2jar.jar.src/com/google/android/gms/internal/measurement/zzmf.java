package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzmf
  extends AbstractSet
{
  final zzmh zza;
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = this.zza.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool = false;
    if (paramObject != localObject)
    {
      if (paramObject == null) {
        return bool;
      }
      if (!paramObject.equals(localObject)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public final Iterator iterator()
  {
    return new zzmd(this.zza, null);
  }
  
  public final boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      this.zza.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */