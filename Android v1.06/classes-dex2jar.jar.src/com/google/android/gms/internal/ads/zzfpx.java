package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

class zzfpx
  extends zzfsl
{
  final transient Map zza;
  final zzfqk zzb;
  
  zzfpx(zzfqk paramzzfqk, Map paramMap)
  {
    this.zza = paramMap;
  }
  
  public final void clear()
  {
    Map localMap = this.zza;
    zzfqk localzzfqk = this.zzb;
    if (localMap == zzfqk.zzi(localzzfqk))
    {
      localzzfqk.zzp();
      return;
    }
    zzfsb.zzb(new zzfpw(this));
  }
  
  public final boolean containsKey(@CheckForNull Object paramObject)
  {
    Map localMap = this.zza;
    Objects.requireNonNull(localMap);
    boolean bool;
    try
    {
      bool = localMap.containsKey(paramObject);
    }
    catch (ClassCastException|NullPointerException paramObject)
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    return (this == paramObject) || (this.zza.equals(paramObject));
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public Set keySet()
  {
    return this.zzb.zzt();
  }
  
  public final int size()
  {
    return this.zza.size();
  }
  
  public final String toString()
  {
    return this.zza.toString();
  }
  
  final Map.Entry zza(Map.Entry paramEntry)
  {
    Object localObject = paramEntry.getKey();
    return new zzfrn(localObject, this.zzb.zzc(localObject, (Collection)paramEntry.getValue()));
  }
  
  protected final Set zzb()
  {
    return new zzfpv(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */