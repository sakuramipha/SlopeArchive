package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Set;

final class zzgi
  extends zzfrh
{
  private final Map zza;
  
  public zzgi(Map paramMap)
  {
    this.zza = paramMap;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return (paramObject != null) && (super.containsKey(paramObject));
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return super.zzd(paramObject);
  }
  
  public final Set entrySet()
  {
    return zzftn.zzb(this.zza.entrySet(), zzgg.zza);
  }
  
  public final boolean equals(Object paramObject)
  {
    return (paramObject != null) && (super.zze(paramObject));
  }
  
  public final int hashCode()
  {
    return super.zzc();
  }
  
  public final boolean isEmpty()
  {
    boolean bool2 = this.zza.isEmpty();
    boolean bool1 = false;
    if (!bool2)
    {
      if (super.size() != 1) {
        return bool1;
      }
      if (!super.containsKey(null)) {
        return false;
      }
    }
    bool1 = true;
    return bool1;
  }
  
  public final Set keySet()
  {
    return zzftn.zzb(this.zza.keySet(), zzgh.zza);
  }
  
  public final int size()
  {
    return super.size() - super.containsKey(null);
  }
  
  protected final Map zzb()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */