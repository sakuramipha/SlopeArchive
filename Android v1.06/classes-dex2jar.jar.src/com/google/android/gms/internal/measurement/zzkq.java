package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzkq
  extends zzim
  implements RandomAccess, zzkr
{
  public static final zzkr zza;
  private static final zzkq zzb;
  private final List zzc;
  
  static
  {
    zzkq localzzkq = new zzkq(10);
    zzb = localzzkq;
    localzzkq.zzb();
    zza = localzzkq;
  }
  
  public zzkq()
  {
    this(10);
  }
  
  public zzkq(int paramInt)
  {
    this.zzc = localArrayList;
  }
  
  private zzkq(ArrayList paramArrayList)
  {
    this.zzc = paramArrayList;
  }
  
  private static String zzj(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof zzjb)) {
      return ((zzjb)paramObject).zzn(zzkk.zzb);
    }
    return zzkk.zzh((byte[])paramObject);
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    zzbS();
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzkr)) {
      localObject = ((zzkr)paramCollection).zzh();
    }
    boolean bool = this.zzc.addAll(paramInt, (Collection)localObject);
    this.modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final void clear()
  {
    zzbS();
    this.zzc.clear();
    this.modCount += 1;
  }
  
  public final int size()
  {
    return this.zzc.size();
  }
  
  public final zzkr zze()
  {
    if (zzc()) {
      return new zzmq(this);
    }
    return this;
  }
  
  public final Object zzf(int paramInt)
  {
    return this.zzc.get(paramInt);
  }
  
  public final String zzg(int paramInt)
  {
    Object localObject1 = this.zzc.get(paramInt);
    if ((localObject1 instanceof String)) {
      return (String)localObject1;
    }
    if ((localObject1 instanceof zzjb))
    {
      localObject2 = (zzjb)localObject1;
      localObject1 = ((zzjb)localObject2).zzn(zzkk.zzb);
      if (((zzjb)localObject2).zzi()) {
        this.zzc.set(paramInt, localObject1);
      }
      return (String)localObject1;
    }
    localObject1 = (byte[])localObject1;
    Object localObject2 = zzkk.zzh((byte[])localObject1);
    if (zzkk.zzi((byte[])localObject1)) {
      this.zzc.set(paramInt, localObject2);
    }
    return (String)localObject2;
  }
  
  public final List zzh()
  {
    return Collections.unmodifiableList(this.zzc);
  }
  
  public final void zzi(zzjb paramzzjb)
  {
    zzbS();
    this.zzc.add(paramzzjb);
    this.modCount += 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */