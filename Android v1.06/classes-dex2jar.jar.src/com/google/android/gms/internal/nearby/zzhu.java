package com.google.android.gms.internal.nearby;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzhu<K, V>
{
  private final Map<K, WeakReference<V>> zza = new WeakHashMap();
  
  public final boolean zza(K paramK)
  {
    return zzc(paramK) != null;
  }
  
  public final void zzb(K paramK, V paramV)
  {
    this.zza.put(paramK, new WeakReference(paramV));
  }
  
  public final V zzc(K paramK)
  {
    paramK = (WeakReference)this.zza.get(paramK);
    if (paramK == null) {
      return null;
    }
    return (V)paramK.get();
  }
  
  public final void zzd(K paramK)
  {
    this.zza.remove(paramK);
  }
  
  public final void zze()
  {
    this.zza.clear();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */