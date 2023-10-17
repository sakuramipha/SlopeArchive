package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

final class zzfqi
  extends zzfqg
  implements ListIterator
{
  final zzfqj zzd;
  
  zzfqi(zzfqj paramzzfqj)
  {
    super(paramzzfqj);
  }
  
  public zzfqi(zzfqj paramzzfqj, int paramInt)
  {
    super(paramzzfqj, ((List)paramzzfqj.zzb).listIterator(paramInt));
  }
  
  public final void add(Object paramObject)
  {
    boolean bool = this.zzd.isEmpty();
    zza();
    ((ListIterator)this.zza).add(paramObject);
    paramObject = this.zzd.zzf;
    zzfqk.zzn((zzfqk)paramObject, zzfqk.zzd((zzfqk)paramObject) + 1);
    if (bool) {
      this.zzd.zza();
    }
  }
  
  public final boolean hasPrevious()
  {
    zza();
    return ((ListIterator)this.zza).hasPrevious();
  }
  
  public final int nextIndex()
  {
    zza();
    return ((ListIterator)this.zza).nextIndex();
  }
  
  public final Object previous()
  {
    zza();
    return ((ListIterator)this.zza).previous();
  }
  
  public final int previousIndex()
  {
    zza();
    return ((ListIterator)this.zza).previousIndex();
  }
  
  public final void set(Object paramObject)
  {
    zza();
    ((ListIterator)this.zza).set(paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */