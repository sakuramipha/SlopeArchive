package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzgvf
  extends AbstractList
{
  private static final zzgvg zzc = zzgvg.zzb(zzgvf.class);
  final List zza;
  final Iterator zzb;
  
  public zzgvf(List paramList, Iterator paramIterator)
  {
    this.zza = paramList;
    this.zzb = paramIterator;
  }
  
  public final Object get(int paramInt)
  {
    if (this.zza.size() > paramInt) {
      return this.zza.get(paramInt);
    }
    if (this.zzb.hasNext())
    {
      this.zza.add(this.zzb.next());
      return get(paramInt);
    }
    throw new NoSuchElementException();
  }
  
  public final Iterator iterator()
  {
    return new zzgve(this);
  }
  
  public final int size()
  {
    zzgvg localzzgvg = zzc;
    localzzgvg.zza("potentially expensive size() call");
    localzzgvg.zza("blowup running");
    while (this.zzb.hasNext()) {
      this.zza.add(this.zzb.next());
    }
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */