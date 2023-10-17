package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzgqw
  implements Iterator
{
  private final ArrayDeque zza;
  private zzgnj zzb;
  
  private final zzgnj zzb(zzgno paramzzgno)
  {
    while ((paramzzgno instanceof zzgqy))
    {
      paramzzgno = (zzgqy)paramzzgno;
      this.zza.push(paramzzgno);
      paramzzgno = zzgqy.zzg(paramzzgno);
    }
    return (zzgnj)paramzzgno;
  }
  
  public final boolean hasNext()
  {
    return this.zzb != null;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public final zzgnj zza()
  {
    zzgnj localzzgnj = this.zzb;
    if (localzzgnj != null)
    {
      Object localObject1;
      do
      {
        ArrayDeque localArrayDeque = this.zza;
        Object localObject2 = null;
        localObject1 = localObject2;
        if (localArrayDeque == null) {
          break;
        }
        if (localArrayDeque.isEmpty())
        {
          localObject1 = localObject2;
          break;
        }
        localObject1 = zzb(zzgqy.zzB((zzgqy)this.zza.pop()));
      } while (((zzgno)localObject1).zzd() == 0);
      this.zzb = ((zzgnj)localObject1);
      return localzzgnj;
    }
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */