package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class zzfqz
  extends AbstractCollection
{
  final zzfra zza;
  
  zzfqz(zzfra paramzzfra) {}
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final Iterator iterator()
  {
    Object localObject = this.zza;
    Map localMap = ((zzfra)localObject).zzj();
    if (localMap != null) {
      localObject = localMap.values().iterator();
    } else {
      localObject = new zzfqt((zzfra)localObject);
    }
    return (Iterator)localObject;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */