package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzlx
  extends zzmh
{
  zzlx(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void zza()
  {
    if (!zzj())
    {
      Map.Entry localEntry;
      for (int i = 0; i < zzb(); i++)
      {
        localEntry = zzg(i);
        if (((zzjs)localEntry.getKey()).zzc()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
      Iterator localIterator = zzc().iterator();
      while (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        if (((zzjs)localEntry.getKey()).zzc()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */