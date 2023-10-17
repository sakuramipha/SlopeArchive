package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfqx
  extends AbstractSet
{
  final zzfra zza;
  
  zzfqx(zzfra paramzzfra) {}
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return this.zza.containsKey(paramObject);
  }
  
  public final Iterator iterator()
  {
    zzfra localzzfra = this.zza;
    Object localObject = localzzfra.zzj();
    if (localObject != null) {
      localObject = ((Map)localObject).keySet().iterator();
    } else {
      localObject = new zzfqr(localzzfra);
    }
    return (Iterator)localObject;
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    Map localMap = this.zza.zzj();
    boolean bool;
    if (localMap != null)
    {
      bool = localMap.keySet().remove(paramObject);
    }
    else
    {
      if (zzfra.zzg(this.zza, paramObject) != zzfra.zzi()) {
        break label46;
      }
      bool = false;
    }
    return bool;
    label46:
    return true;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */