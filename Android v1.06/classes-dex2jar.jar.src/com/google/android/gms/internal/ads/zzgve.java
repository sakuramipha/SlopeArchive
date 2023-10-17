package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class zzgve
  implements Iterator
{
  int zza = 0;
  final zzgvf zzb;
  
  zzgve(zzgvf paramzzgvf) {}
  
  public final boolean hasNext()
  {
    return (this.zza < this.zzb.zza.size()) || (this.zzb.zzb.hasNext());
  }
  
  public final Object next()
  {
    if (this.zza < this.zzb.zza.size())
    {
      localObject = this.zzb.zza;
      int i = this.zza;
      this.zza = (i + 1);
      return ((List)localObject).get(i);
    }
    Object localObject = this.zzb;
    ((zzgvf)localObject).zza.add(((zzgvf)localObject).zzb.next());
    return next();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */