package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

class zzfsj
  extends zzftm
{
  final Map zzd;
  
  zzfsj(Map paramMap)
  {
    Objects.requireNonNull(paramMap);
    this.zzd = paramMap;
  }
  
  public void clear()
  {
    this.zzd.clear();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return this.zzd.containsKey(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return this.zzd.isEmpty();
  }
  
  public Iterator iterator()
  {
    return new zzfsg(this.zzd.entrySet().iterator());
  }
  
  public boolean remove(@CheckForNull Object paramObject)
  {
    if (contains(paramObject))
    {
      this.zzd.remove(paramObject);
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return this.zzd.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */