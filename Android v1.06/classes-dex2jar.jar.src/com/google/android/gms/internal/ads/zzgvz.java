package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class zzgvz
  implements zzgvo
{
  private static final zzgvo zza = zzgvp.zza(Collections.emptySet());
  private final List zzb;
  private final List zzc;
  
  public static zzgvy zza(int paramInt1, int paramInt2)
  {
    return new zzgvy(paramInt1, paramInt2, null);
  }
  
  public final Set zzc()
  {
    int j = this.zzb.size();
    ArrayList localArrayList = new ArrayList(this.zzc.size());
    int m = this.zzc.size();
    int k = 0;
    for (int i = 0; i < m; i++)
    {
      localObject1 = (Collection)((zzgwb)this.zzc.get(i)).zzb();
      j += ((Collection)localObject1).size();
      localArrayList.add(localObject1);
    }
    Object localObject1 = zzgvl.zza(j);
    j = this.zzb.size();
    Object localObject2;
    for (i = 0; i < j; i++)
    {
      localObject2 = ((zzgwb)this.zzb.get(i)).zzb();
      Objects.requireNonNull(localObject2);
      ((Set)localObject1).add(localObject2);
    }
    j = localArrayList.size();
    for (i = k; i < j; i++)
    {
      localObject2 = ((Collection)localArrayList.get(i)).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = ((Iterator)localObject2).next();
        Objects.requireNonNull(localObject3);
        ((Set)localObject1).add(localObject3);
      }
    }
    return Collections.unmodifiableSet((Set)localObject1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */