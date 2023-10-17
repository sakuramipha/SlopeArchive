package com.google.android.gms.internal.drive;

import java.util.Map.Entry;

final class zzkv<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, zzkt> zztf;
  
  private zzkv(Map.Entry<K, zzkt> paramEntry)
  {
    this.zztf = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)this.zztf.getKey();
  }
  
  public final Object getValue()
  {
    if ((zzkt)this.zztf.getValue() == null) {
      return null;
    }
    return zzkt.zzdp();
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof zzlq)) {
      return ((zzkt)this.zztf.getValue()).zzi((zzlq)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
  
  public final zzkt zzdq()
  {
    return (zzkt)this.zztf.getValue();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */