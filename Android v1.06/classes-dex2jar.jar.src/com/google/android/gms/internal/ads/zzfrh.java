package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfrh
  extends zzfri
  implements Map
{
  public final void clear()
  {
    zzb().clear();
  }
  
  public boolean containsKey(@CheckForNull Object paramObject)
  {
    return zzb().containsKey(paramObject);
  }
  
  public boolean containsValue(@CheckForNull Object paramObject)
  {
    return zzb().containsValue(paramObject);
  }
  
  public Set entrySet()
  {
    return zzb().entrySet();
  }
  
  public boolean equals(@CheckForNull Object paramObject)
  {
    return (paramObject == this) || (zzb().equals(paramObject));
  }
  
  @CheckForNull
  public Object get(@CheckForNull Object paramObject)
  {
    return zzb().get(paramObject);
  }
  
  public int hashCode()
  {
    return zzb().hashCode();
  }
  
  public boolean isEmpty()
  {
    return zzb().isEmpty();
  }
  
  public Set keySet()
  {
    return zzb().keySet();
  }
  
  @CheckForNull
  public final Object put(Object paramObject1, Object paramObject2)
  {
    return zzb().put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map paramMap)
  {
    zzb().putAll(paramMap);
  }
  
  @CheckForNull
  public final Object remove(@CheckForNull Object paramObject)
  {
    return zzb().remove(paramObject);
  }
  
  public int size()
  {
    return zzb().size();
  }
  
  public final Collection values()
  {
    return zzb().values();
  }
  
  protected abstract Map zzb();
  
  protected final int zzc()
  {
    return zzftn.zza(entrySet());
  }
  
  protected final boolean zzd(@CheckForNull Object paramObject)
  {
    zzfsh localzzfsh = new zzfsh(entrySet().iterator());
    boolean bool = true;
    if (paramObject == null) {
      while (localzzfsh.hasNext()) {
        if (localzzfsh.next() == null) {
          return bool;
        }
      }
    }
    do
    {
      while (!localzzfsh.hasNext())
      {
        bool = false;
        break;
      }
    } while (!paramObject.equals(localzzfsh.next()));
    return bool;
  }
  
  protected final boolean zze(@CheckForNull Object paramObject)
  {
    return zzfsm.zzb(this, paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */