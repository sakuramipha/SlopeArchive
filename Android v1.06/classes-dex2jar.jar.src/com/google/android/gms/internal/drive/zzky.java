package com.google.android.gms.internal.drive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzky
  extends zziw<String>
  implements zzkz, RandomAccess
{
  private static final zzky zztk;
  private static final zzkz zztl;
  private final List<Object> zziu;
  
  static
  {
    zzky localzzky = new zzky();
    zztk = localzzky;
    localzzky.zzbp();
    zztl = localzzky;
  }
  
  public zzky()
  {
    this(10);
  }
  
  public zzky(int paramInt)
  {
    this(new ArrayList(paramInt));
  }
  
  private zzky(ArrayList<Object> paramArrayList)
  {
    this.zziu = paramArrayList;
  }
  
  private static String zzf(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof zzjc)) {
      return ((zzjc)paramObject).zzbt();
    }
    return zzkm.zze((byte[])paramObject);
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    zzbq();
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzkz)) {
      localObject = ((zzkz)paramCollection).zzdr();
    }
    boolean bool = this.zziu.addAll(paramInt, (Collection)localObject);
    this.modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final void clear()
  {
    zzbq();
    this.zziu.clear();
    this.modCount += 1;
  }
  
  public final int size()
  {
    return this.zziu.size();
  }
  
  public final Object zzao(int paramInt)
  {
    return this.zziu.get(paramInt);
  }
  
  public final List<?> zzdr()
  {
    return Collections.unmodifiableList(this.zziu);
  }
  
  public final zzkz zzds()
  {
    if (zzbo()) {
      return new zzna(this);
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */