package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class zzelb
  implements zzeqq
{
  private final Set zza;
  
  zzelb(Set paramSet)
  {
    this.zza = paramSet;
  }
  
  public final int zza()
  {
    return 8;
  }
  
  public final zzfwb zzb()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zza.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((String)localIterator.next());
    }
    return zzfvr.zzh(new zzela(localArrayList));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzelb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */