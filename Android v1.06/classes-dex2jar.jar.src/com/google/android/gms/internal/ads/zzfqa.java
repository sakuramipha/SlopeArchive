package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

class zzfqa
  extends zzfsj
{
  final zzfqk zza;
  
  zzfqa(zzfqk paramzzfqk, Map paramMap)
  {
    super(paramMap);
  }
  
  public final void clear()
  {
    zzfsb.zzb(iterator());
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    return this.zzd.keySet().containsAll(paramCollection);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    return (this == paramObject) || (this.zzd.keySet().equals(paramObject));
  }
  
  public final int hashCode()
  {
    return this.zzd.keySet().hashCode();
  }
  
  public final Iterator iterator()
  {
    return new zzfpz(this, this.zzd.entrySet().iterator());
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    paramObject = (Collection)this.zzd.remove(paramObject);
    if (paramObject != null)
    {
      int i = ((Collection)paramObject).size();
      ((Collection)paramObject).clear();
      paramObject = this.zza;
      zzfqk.zzn((zzfqk)paramObject, zzfqk.zzd((zzfqk)paramObject) - i);
      if (i > 0) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */