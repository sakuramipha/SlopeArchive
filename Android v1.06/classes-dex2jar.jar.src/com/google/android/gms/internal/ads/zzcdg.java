package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzcdg
  implements Iterable
{
  private final List zza = new ArrayList();
  
  public final Iterator iterator()
  {
    return this.zza.iterator();
  }
  
  final zzcdf zza(zzccc paramzzccc)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zzcdf localzzcdf = (zzcdf)localIterator.next();
      if (localzzcdf.zza == paramzzccc) {
        return localzzcdf;
      }
    }
    return null;
  }
  
  public final void zzb(zzcdf paramzzcdf)
  {
    this.zza.add(paramzzcdf);
  }
  
  public final void zzc(zzcdf paramzzcdf)
  {
    this.zza.remove(paramzzcdf);
  }
  
  public final boolean zzd(zzccc paramzzccc)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zzcdf localzzcdf = (zzcdf)localIterator.next();
      if (localzzcdf.zza == paramzzccc) {
        localArrayList.add(localzzcdf);
      }
    }
    if (localArrayList.isEmpty()) {
      return false;
    }
    paramzzccc = localArrayList.iterator();
    while (paramzzccc.hasNext()) {
      ((zzcdf)paramzzccc.next()).zzb.zzf();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */