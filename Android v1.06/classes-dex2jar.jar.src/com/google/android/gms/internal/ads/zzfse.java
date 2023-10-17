package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzfse
  extends AbstractSequentialList
  implements Serializable
{
  final List zza;
  final zzfon zzb;
  
  zzfse(List paramList, zzfon paramzzfon)
  {
    this.zza = paramList;
    this.zzb = paramzzfon;
  }
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new zzfsd(this, this.zza.listIterator(paramInt));
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */